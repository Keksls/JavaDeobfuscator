/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import java.awt.Point;
import java.util.ArrayList;
import org.apache.commons.pool.ObjectPool;

public class fso
extends fvE {
    public static final String TAG = "Container";
    private static final ObjectPool m_pool = new abm_1(new fsp_0());
    protected final ArrayList<fvE> m_widgetChildren = new ArrayList();
    protected boolean m_rootFocusContainer = false;
    protected fig_2 m_layout;
    protected boolean m_widgetListChanged = false;
    protected boolean m_pack = false;
    protected boolean m_invalidateOnMinSizeChange = false;
    private fjf_2 m_contentMinSize = null;
    private fjf_2 m_contentPrefSize = null;
    private boolean m_justInvalidatedSize = false;
    public static final int PACK_HASH = 3432985;

    @Override
    public void addWidget(fvE fvE2) {
        this.addWidget(fvE2, this.m_widgetChildren.size());
    }

    public boolean addWidget(fvE fvE2, int n) {
        if (n < 0 || n > this.m_widgetChildren.size()) {
            m_logger.error((Object)("Tentative d'ajout d'un widget a un parent avec un index invalide (index=" + n + ", taille=" + this.m_widgetChildren.size()));
        } else if (this.m_widgetChildren.contains(fvE2)) {
            m_logger.error((Object)"Tentative d'ajout d'un widget d\u00e9j\u00e0 contenu");
        } else {
            this.m_widgetChildren.add(n, fvE2);
            fvE2.setContainerParent(this);
            if (this.isInWidgetTree()) {
                fvE2.addedToWidgetTree();
            }
            this.m_widgetListChanged = true;
            this.setNeedsToPreProcess();
            return true;
        }
        return false;
    }

    public int indexOf(fvE fvE2) {
        return this.m_widgetChildren.indexOf(fvE2);
    }

    @Override
    public void removeWidget(fvE fvE2) {
        if (fvE2 != null && this.m_widgetChildren != null && this.m_widgetChildren.contains(fvE2)) {
            if (this.isInWidgetTree()) {
                fvE2.removedFromWidgetTree();
            }
            this.m_widgetChildren.remove(fvE2);
            fvE2.setContainerParent(null);
            this.m_widgetListChanged = true;
            this.setNeedsToPreProcess();
            fvE2.removeSelfFromParent();
        }
    }

    @Override
    public void setWidgetOnTop(fvE fvE2) {
        if (fvE2 != null && this.m_widgetChildren != null && this.m_widgetChildren.contains(fvE2)) {
            this.m_widgetChildren.remove(fvE2);
            this.addWidget(fvE2);
        }
    }

    @Override
    public void add(fyv_0 fyv_02) {
        super.add(fyv_02);
        if (fyv_02 instanceof fig_2) {
            this.setLayoutManager((fig_2)fyv_02);
        }
    }

    public void add(fvE fvE2, int n) {
        if (this.addWidget(fvE2, n)) {
            super.add(fvE2, false);
        } else if (fvE2 != null) {
            fvE2.destroySelfFromParent();
            m_logger.warn((Object)"On lib\u00e8re le Widget qui n'a pas p\u00fb \u00eatre ajout\u00e9");
        }
    }

    public void replace(fvE fvE2, fvE fvE3) {
        int n = this.indexOf(fvE2);
        this.remove(fvE2);
        this.add(fvE3, n);
    }

    public void removeAllWidgets() {
        for (fvE fvE2 : this.m_widgetChildren) {
            if (this.isInWidgetTree()) {
                fvE2.removedFromWidgetTree();
            }
            fvE2.setContainerParent(null);
        }
        this.m_widgetChildren.clear();
        this.m_widgetListChanged = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public void addInnerMeshes() {
        super.addInnerMeshes();
        int n = this.m_widgetChildren.size();
        for (int k = 0; k < n; ++k) {
            fvE fvE2 = this.m_widgetChildren.get(k);
            EntityGroup entityGroup = fvE2.getEntity();
            if (!fvE2.getVisible() || entityGroup == null) continue;
            this.m_entity.a((Entity)entityGroup);
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public ArrayList<fvE> getWidgetChildren() {
        return this.m_widgetChildren;
    }

    @Override
    public fqj getAppearance() {
        return this.m_appearance;
    }

    @Override
    public boolean isAppearanceCompatible(fqj fqj2) {
        return true;
    }

    public void setLayoutManager(fig_2 fig_22) {
        if (this.m_layout != null && !this.m_layout.isUnloading()) {
            this.m_layout.release();
        }
        this.m_layout = fig_22;
    }

    public fim_2 getLayoutManager() {
        return this.m_layout;
    }

    @Override
    protected void applyVisibility(boolean bl) {
        if (bl != this.m_visible) {
            this.setNeedsToPreProcess();
            this.setNeedsToMiddleProcess();
        }
        super.applyVisibility(bl);
    }

    @Override
    protected void setParentVisible(boolean bl) {
        if (bl != this.m_parentVisible) {
            super.setParentVisible(bl);
            for (int k = this.m_widgetChildren.size() - 1; k >= 0; --k) {
                this.m_widgetChildren.get(k).setParentVisible(bl);
            }
        }
    }

    @Override
    public fjf_2 getMaxSize() {
        if (this.m_maxSizeSet) {
            return this.m_maxSize;
        }
        return new fjf_2(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    @Override
    public fjf_2 getContentMinSize() {
        if (this.m_layout != null) {
            if (this.m_contentMinSize == null) {
                this.m_contentMinSize = this.m_layout.getContentMinSize(this);
            }
            int n = this.m_minSize == null ? this.m_contentMinSize.width : Math.max(this.m_contentMinSize.width, this.m_minSize.width);
            int n2 = this.m_minSize == null ? this.m_contentMinSize.height : Math.max(this.m_contentMinSize.height, this.m_minSize.height);
            return new fjf_2(n, n2);
        }
        return super.getContentMinSize();
    }

    @Override
    public fjf_2 getContentPrefSize() {
        if (this.m_layout != null) {
            if (this.m_contentPrefSize == null) {
                this.m_contentPrefSize = this.m_layout.getContentPreferedSize(this);
            }
            int n = this.m_prefSize == null ? this.m_contentPrefSize.width : Math.max(this.m_contentPrefSize.width, this.m_prefSize.width);
            int n2 = this.m_prefSize == null ? this.m_contentPrefSize.height : Math.max(this.m_contentPrefSize.height, this.m_prefSize.height);
            return new fjf_2(n, n2);
        }
        return super.getContentPrefSize();
    }

    @Override
    public fjf_2 getContentGreedySize() {
        if (this.m_containerParent == null) {
            return new fjf_2(this.m_appearance.getContentWidth(), this.m_appearance.getContentHeight());
        }
        fjf_2 fjf_22 = this.m_containerParent.getContentGreedySize();
        fjf_22.width -= this.m_containerParent.getAppearance().getLeftInset() + this.m_containerParent.getAppearance().getRightInset();
        fjf_22.height -= this.m_containerParent.getAppearance().getTopInset() + this.m_containerParent.getAppearance().getBottomInset();
        return this.m_containerParent.getLayoutManager().getContentGreedySize(this.m_containerParent, this, fjf_22);
    }

    public boolean isRootFocusContainer() {
        return this.m_rootFocusContainer;
    }

    public void setRootFocusContainer(boolean bl) {
        this.m_rootFocusContainer = bl;
    }

    @Override
    public fso getRootFocusParent() {
        if (this.m_rootFocusContainer) {
            return this;
        }
        return super.getRootFocusParent();
    }

    @Override
    public void setNonBlocking(boolean bl) {
        this.setNonBlocking(bl, false);
    }

    public void setNonBlocking(boolean bl, boolean bl2) {
        super.setNonBlocking(bl);
        if (bl2) {
            for (fvE fvE2 : this.getWidgetChildren()) {
                if (fvE2 instanceof fso) {
                    ((fso)fvE2).setNonBlocking(bl, bl2);
                    continue;
                }
                fvE2.setNonBlocking(bl);
            }
        }
    }

    public boolean getInvalidateOnMinSizeChange() {
        return this.m_invalidateOnMinSizeChange;
    }

    public void setInvalidateOnMinSizeChange(boolean bl) {
        this.m_invalidateOnMinSizeChange = bl;
    }

    public void setPack(boolean bl) {
        this.m_pack = bl;
    }

    public boolean getPack() {
        return this.m_pack;
    }

    @Override
    public fvE getWidget(int n, int n2) {
        if (this.m_unloading || !this.m_visible || !this.getAppearance().a(n, n2)) {
            return null;
        }
        fvE fvE2 = this.m_nonBlocking ? null : this;
        n -= this.getAppearance().getLeftInset();
        n2 -= this.getAppearance().getBottomInset();
        for (int k = this.m_widgetChildren.size() - 1; k >= 0; --k) {
            fvE fvE3 = this.m_widgetChildren.get(k);
            if (fvE3.isUnloading() || (fvE3 = fvE3.getWidget(n - fvE3.m_position.x, n2 - fvE3.m_position.y)) == null) continue;
            fvE2 = fvE3;
            break;
        }
        return fvE2;
    }

    public fvE getWidget(int n) {
        try {
            return this.m_widgetChildren.get(n);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public fvE getNextFocusableWidget() {
        return null;
    }

    public azt_1 getScissor(fvE fvE2) {
        Point point = this.getScreenPosition();
        int n = point.x + this.m_appearance.getLeftInset();
        int n2 = point.y + this.m_appearance.getBottomInset();
        int n3 = this.m_appearance.getContentWidth();
        int n4 = this.m_appearance.getContentHeight();
        if (fvE2 == null) {
            return azt_1.a(n, n2, n3, n4);
        }
        Point point2 = fvE2.getScreenPosition();
        int n5 = point2.x;
        int n6 = point2.y;
        int n7 = fvE2.getWidth();
        int n8 = fvE2.getHeight();
        azt_1 azt_12 = azt_1.a();
        if (azt_1.b(n5, n6, n7, n8, n, n2, n3, n4)) {
            azt_12.a(n5, n6, n7, n8, n, n2, n3, n4);
        }
        return azt_12;
    }

    @Override
    public void addedToWidgetTree() {
        super.addedToWidgetTree();
        for (fvE fvE2 : this.m_widgetChildren) {
            fvE2.addedToWidgetTree();
        }
    }

    @Override
    public void removedFromWidgetTree() {
        super.removedFromWidgetTree();
        for (fvE fvE2 : this.m_widgetChildren) {
            fvE2.removedFromWidgetTree();
        }
    }

    protected void resetContentSizeCache() {
        this.m_contentPrefSize = null;
        this.m_contentMinSize = null;
        this.m_justInvalidatedSize = true;
        this.setNeedsToMiddleProcess();
    }

    public void invalidateMinSize() {
        this.resetContentSizeCache();
        if (this.m_containerParent != null) {
            this.m_containerParent.invalidateMinSize();
        }
        if (this.m_pack || this.m_invalidateOnMinSizeChange) {
            this.invalidate();
        }
    }

    @Override
    public void validate() {
        super.validate();
        this.m_justInvalidatedSize = false;
        if (this.m_pack) {
            this.setSizeToPrefSize();
        }
        if (this.m_layout != null && this.m_appearance != null) {
            this.m_layout.a(this);
        }
        this.setNeedsToResetMeshes();
        this.m_widgetListChanged = false;
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.m_widgetListChanged) {
            this.invalidateMinSize();
        }
        return bl;
    }

    @Override
    public boolean middleProcess(int n) {
        if (this.m_visible && this.m_justInvalidatedSize) {
            this.invalidate();
        }
        return super.middleProcess(n);
    }

    public static fso checkOut() {
        fso fso2;
        try {
            fso2 = (fso)m_pool.borrowObject();
            fso2.m_currentPool = m_pool;
        }
        catch (Exception exception) {
            m_logger.error((Object)"Probl\u00e8me au borrowObject.");
            fso2 = new fso();
            fso2.onCheckOut();
        }
        return fso2;
    }

    @Override
    public void onCheckIn() {
        this.removeAllWidgets();
        super.onCheckIn();
        this.m_contentMinSize = null;
        this.m_contentPrefSize = null;
        if (this.m_layout != null) {
            this.m_layout.release();
            this.m_layout = null;
        }
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.m_rootFocusContainer = false;
        this.m_widgetListChanged = false;
        this.m_pack = false;
        this.m_invalidateOnMinSizeChange = false;
        fqj fqj2 = fqj.checkOut();
        fqj2.setWidget(this);
        this.add(fqj2);
        fin_2 fin_22 = fin_2.checkOut();
        this.add(fin_22);
        this.m_nonBlocking = true;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fso fso2 = (fso)fyo2;
        super.copyElement(fso2);
        fso2.m_pack = this.m_pack;
        fso2.m_rootFocusContainer = this.m_rootFocusContainer;
        fig_2 fig_22 = null;
        if (this.m_layout != null) {
            fig_22 = this.m_layout.d();
        }
        if (fig_22 != null) {
            fso2.setLayoutManager(fig_22);
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n != 3432985) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setPack(Co.a(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 3432985) {
            this.setPack(Co.b(object));
            return true;
        }
        return super.setPropertyAttribute(n, object);
    }
}

