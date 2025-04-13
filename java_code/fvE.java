/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class fvE
extends fyb_0
implements fbl_1,
fbb_2,
fjw_1 {
    protected fqj m_appearance;
    protected fqj m_xmlAppearance;
    private final Set<fbp_1> m_appearanceChangeListeners = new HashSet<fbp_1>();
    private final Set<fwr_0> m_visibilityListeners = new HashSet<fwr_0>();
    @Nullable
    private fxr_0 m_visibilityChangePreExecutor;
    protected fso m_containerParent;
    protected EntityGroup m_entity;
    public Point m_position;
    private float m_xPercInParent;
    private float m_yPercInParent;
    protected final Point m_screenPosition = new Point(-1, -1);
    public fjf_2 m_size;
    protected fjf_2 m_minSize;
    protected boolean m_minSizeSet = false;
    protected fjf_2 m_prefSize;
    protected boolean m_prefSizeSet = false;
    protected fjf_2 m_maxSize;
    protected boolean m_maxSizeSet = false;
    protected boolean m_greedy = false;
    protected boolean m_expandable = true;
    protected boolean m_shrinkable = false;
    protected boolean m_nonBlocking = false;
    protected boolean m_visible = false;
    private fvE m_widgetWithVisibilityLinked = null;
    private final fwr_0 m_visibilityLinkedListener = (bl, bl2) -> this.setVisible(bl2);
    protected boolean m_parentVisible = false;
    protected boolean m_enabled = true;
    protected boolean m_netEnabled = true;
    protected String m_netEnabledId = null;
    protected boolean m_focusable = false;
    protected boolean m_focused = false;
    protected String[] m_style = new String[5];
    protected boolean m_styleIsDirty = false;
    protected HashMap<String, fvE> m_themeElementWidgets = null;
    protected String m_themeElementName;
    protected String m_themeElementParentType;
    protected fif_1 m_layoutData;
    protected fsv_0 m_dndParent;
    protected fil_1 m_popup;
    protected frb_0 m_cursorType = frb_0.a;
    protected boolean m_useResizeTween = false;
    protected boolean m_usePositionTween = false;
    protected boolean m_needToResetMeshes = true;
    protected Rectangle m_scissor = null;
    protected boolean m_needsScissor = false;
    private boolean m_positionChanged = true;
    protected boolean m_enableResizeEvents = false;
    protected boolean m_enablePositionEvents = false;
    protected boolean m_stickWithinContainer = false;
    private fqt_0 m_lazyLoadingMode = fqt_0.a;
    public static final int SIZE_HASH = 3530753;
    public static final int PREF_SIZE_HASH = -1289212732;
    public static final int MAX_SIZE_HASH = 844081029;
    public static final int EXPANDABLE_HASH = 540120820;
    public static final int SHRINKABLE_HASH = -1354387741;
    public static final int GREEDY_HASH = -1237774176;
    public static final int FOCUSABLE_HASH = 1629011506;
    public static final int FOCUSED_HASH = -691041417;
    public static final int ENABLED_HASH = -1609594047;
    public static final int NET_ENABLED_ID_HASH = 262323999;
    public static final int VISIBLE_HASH = 466743410;
    public static final int USED_IN_LAYOUT_HASH = -1811609716;
    public static final int VISIBILITY_LINKED_HASH = -1677991989;
    public static final int USE_POSITION_TWEEN_HASH = 5106811;
    public static final int USE_RESIZE_TWEEN_HASH = -1752399344;
    public static final int X_HASH = 120;
    public static final int Y_HASH = 121;
    public static final int STYLE_HASH = 109780401;
    public static final int THEME_ELEMENT_NAME_HASH = -164750818;
    public static final int THEME_ELEMENT_PARENT_TYPE_HASH = 1659243607;
    public static final int NON_BLOCKING_HASH = 2009226786;
    public static final int CURSOR_TYPE_HASH = 87587760;
    public static final int NEEDS_SCISSOR_HASH = -671195521;
    public static final int USER_DEFINED_SIZE_HASH = 402556127;
    public static final int USER_DEFINED_POSITION_HASH = 866230023;
    public static final int STICK_WITHIN_CONTAINER_HASH = 566769062;
    public static final int LAZY_LOADING_MODE_HASH = 546747627;
    public static final int ON_CLICK_HASH = -1351902487;
    public static final int ON_DOUBLE_CLICK_HASH = -1164731176;
    public static final int ON_FOCUS_CHANGE_HASH = 1737415497;
    public static final int ON_ITEM_CLICK_HASH = 2096925462;
    public static final int ON_ITEM_DOUBLE_CLICK_HASH = 1076426565;
    public static final int ON_ITEM_OUT_HASH = -842497956;
    public static final int ON_ITEM_OVER_HASH = -347632250;
    public static final int ON_KEY_PRESS_HASH = -1037804509;
    public static final int ON_KEY_RELEASE_HASH = 511141863;
    public static final int ON_KEY_TYPE_HASH = 520837978;
    public static final int ON_LIST_SELECTION_CHANGE_HASH = 1497720703;
    public static final int ON_MOUSE_DRAG_HASH = 555106394;
    public static final int ON_MOUSE_DRAG_IN_HASH = 881302303;
    public static final int ON_MOUSE_DRAG_OUT_HASH = 1550573716;
    public static final int ON_MOUSE_MOVE_HASH = 555372279;
    public static final int ON_MOUSE_ENTER_HASH = 29251698;
    public static final int ON_MOUSE_EXIT_HASH = 555142212;
    public static final int ON_MOUSE_PRESS_HASH = 39515613;
    public static final int ON_MOUSE_RELEASE_HASH = 728660769;
    public static final int ON_MOUSE_WHEEL_HASH = 45681909;
    public static final int ON_SELECTION_CHANGE_HASH = 552298621;
    public static final int ON_SLIDER_MOVE_HASH = 151596945;
    public static final int ON_DRAG_HASH = -1013405773;
    public static final int ON_DROP_HASH = -1013405330;
    public static final int ON_DRAG_OUT_HASH = -1046180197;
    public static final int ON_DROP_OUT_HASH = -1032982784;
    public static final int ON_DRAG_OVER_HASH = 1928152871;
    public static final int ON_STICK_HASH = -1336887823;
    public static final int ON_POPUP_DISPLAY_HASH = 1055781365;
    public static final int ON_POPUP_HIDE_HASH = -647313169;

    @Override
    public void addFromXML(fyb_0 fyb_02) {
        if (fyb_02 instanceof ftn_0) {
            ((ftn_0)fyb_02).setClient(this);
            fta_0.getInstance().getLayeredContainer().a((fvE)fyb_02, 30000);
        } else {
            super.addFromXML(fyb_02);
        }
    }

    public boolean setAppearanceOnAdd() {
        return true;
    }

    @Override
    public void add(fyb_0 fyb_02) {
        boolean bl = true;
        if (fyb_02 instanceof fqm_0 || fyb_02 instanceof fqo_0) {
            this.m_appearance.add(fyb_02);
            return;
        }
        if (fyb_02 instanceof fif_1) {
            bl &= this.setLayoutData((fif_1)fyb_02);
        }
        if (fyb_02 instanceof fqj && this.setAppearanceOnAdd()) {
            bl &= this.setAppearance((fqj)fyb_02);
        }
        if (fyb_02 instanceof fil_1) {
            this.setPopup((fil_1)fyb_02);
        }
        if (bl) {
            super.add(fyb_02);
        }
    }

    public void addThemeElementName(String string, fvE fvE2) {
        if (string == null || fvE2 == null) {
            return;
        }
        if (this.m_themeElementWidgets == null) {
            this.m_themeElementWidgets = new HashMap();
        }
        this.m_themeElementWidgets.put(string.toUpperCase(), fvE2);
        this.m_styleIsDirty = true;
        this.setNeedsToPreProcess();
    }

    protected void addMeshes() {
        assert (this.m_appearance != null);
        this.m_appearance.i();
        this.addInnerMeshes();
        this.m_needToResetMeshes = false;
    }

    protected void addInnerMeshes() {
    }

    public void setPopup(fil_1 fil_12) {
        this.m_popup = fil_12;
    }

    public fil_1 getPopup() {
        return this.m_popup;
    }

    public EntityGroup getEntity() {
        return this.m_entity;
    }

    public void setContainerParent(fso fso2) {
        this.m_containerParent = fso2;
    }

    public fso getContainer() {
        return this.m_containerParent;
    }

    public fjf_2 getMaxSize() {
        return this.m_maxSize;
    }

    public void setMaxSize(fjf_2 fjf_22) {
        this.m_maxSize = fjf_22;
        this.m_maxSizeSet = fjf_22 != null;
    }

    public fjf_2 getContentMinSize() {
        if (this.m_minSize != null) {
            return this.m_minSize;
        }
        return new fjf_2(0, 0);
    }

    public fjf_2 getSpecifiedContentMinSize() {
        return this.m_minSize;
    }

    public fjf_2 getMinSize() {
        fjf_2 fjf_22 = this.getContentMinSize();
        return new fjf_2(fjf_22.width + this.m_appearance.getLeftInset() + this.m_appearance.getRightInset(), fjf_22.height + this.m_appearance.getTopInset() + this.m_appearance.getBottomInset());
    }

    public void onAppearanceInsetsChanged() {
    }

    public void setMinSize(fjf_2 fjf_22) {
        this.m_minSize = fjf_22;
        this.m_minSizeSet = fjf_22 != null;
    }

    public fjf_2 getGreedySize() {
        fjf_2 fjf_22 = this.getContentGreedySize();
        return new fjf_2(fjf_22.width + this.m_appearance.getLeftInset() + this.m_appearance.getRightInset(), fjf_22.height + this.m_appearance.getTopInset() + this.m_appearance.getBottomInset());
    }

    public fjf_2 getContentGreedySize() {
        if (this.m_containerParent == null) {
            return new fjf_2(this.m_appearance.getContentWidth(), this.m_appearance.getContentHeight());
        }
        return new fjf_2(this.m_appearance.getContentWidth(), this.m_appearance.getContentHeight());
    }

    public fjf_2 getPrefSize() {
        fjf_2 fjf_22 = this.getContentPrefSize();
        if (this.m_shrinkable) {
            if (this.m_maxSize != null) {
                fjf_22.height = Math.min(fjf_22.height, this.m_maxSize.height);
                fjf_22.width = Math.min(fjf_22.width, this.m_maxSize.width);
            } else {
                fjf_22.height = 0;
                fjf_22.width = 0;
            }
        }
        return new fjf_2(fjf_22.width + this.m_appearance.getLeftInset() + this.m_appearance.getRightInset(), fjf_22.height + this.m_appearance.getTopInset() + this.m_appearance.getBottomInset());
    }

    public fjf_2 getContentPrefSize() {
        if (this.m_prefSize == null) {
            return this.getContentMinSize();
        }
        fjf_2 fjf_22 = this.getContentMinSize();
        if (fjf_22 == null) {
            return this.m_prefSize;
        }
        int n = Math.max(this.m_prefSize.width, fjf_22.width);
        int n2 = Math.max(this.m_prefSize.height, fjf_22.height);
        return new fjf_2(n, n2);
    }

    public fjf_2 getSpecifiedContentPrefSize() {
        if (this.m_prefSize == null) {
            return this.getSpecifiedContentMinSize();
        }
        return this.m_prefSize;
    }

    public fjf_2 getSetPrefSize() {
        if (this.m_prefSizeSet) {
            return this.m_prefSize;
        }
        return null;
    }

    public void setPrefSize(fjf_2 fjf_22) {
        this.m_prefSize = fjf_22;
        this.m_prefSizeSet = fjf_22 != null;
    }

    public fjf_2 getSize() {
        return this.m_size;
    }

    public void setSize(fjf_2 fjf_22) {
        this.setSize(fjf_22.width, fjf_22.height);
    }

    public void setSize(int n, int n2) {
        this.setSize(n, n2, false);
    }

    public void setSize(int n, int n2, boolean bl) {
        if (!this.m_useResizeTween || bl) {
            boolean bl2 = this.m_size.width != n | this.m_size.height != n2;
            if (bl2) {
                this.m_size.width = n;
                this.m_size.height = n2;
                this.invalidate();
                if (this.m_enableResizeEvents) {
                    fzs fzs2 = fzs.i();
                    fzs2.a(frd_0.P);
                    fzs2.c(this);
                    this.dispatchEvent(fzs2);
                }
                if (this.m_stickWithinContainer) {
                    this.setPositionWithinParentBounds();
                }
                this.recomputeRelativePosition();
                if (this.m_elementMapRoot && this.m_userDefinedManager != null) {
                    ((fkc_1)this.m_userDefinedManager).i();
                }
            }
        } else {
            this.removeTweensOfType(fjr_2.class);
            fjr_2 fjr_22 = new fjr_2(this.getSize(), new fjf_2(n, n2), this, 0, 500, fjw_2.b);
            this.addTween(fjr_22);
        }
    }

    public void setSizeToMinSize() {
        this.setSize(this.getMinSize());
    }

    public void setSizeToPrefSize() {
        this.setSize(this.getPrefSize());
    }

    public void setPositionWithinParentBounds() {
        if (this.m_containerParent == null) {
            return;
        }
        int n = Hw.a(this.getX(), 0, this.m_containerParent.getAppearance().getContentWidth() - this.getWidth());
        int n2 = Hw.a(this.getY(), 0, this.m_containerParent.getAppearance().getContentHeight() - this.getHeight());
        this.setPosition(n, n2);
    }

    @Override
    public int getWidth() {
        return this.m_size.width;
    }

    public void setWidth(int n) {
        this.setSize(n, this.m_size.height);
    }

    public void setHeight(int n) {
        this.setSize(this.m_size.width, n);
    }

    @Override
    public int getHeight() {
        return this.m_size.height;
    }

    public void setEnableResizeEvents(boolean bl) {
        this.m_enableResizeEvents = bl;
    }

    public void setEnablePositionEvents(boolean bl) {
        this.m_enablePositionEvents = bl;
    }

    public boolean isNonBlocking() {
        return this.m_nonBlocking;
    }

    public void setNonBlocking(boolean bl) {
        this.m_nonBlocking = bl;
    }

    public int getX(fso fso2) {
        if (this.m_position != null) {
            if (this.m_containerParent == null || this.m_containerParent == fso2) {
                return this.m_position.x + this.m_appearance.getLeftInset();
            }
            return this.m_position.x + this.m_containerParent.getX(fso2) + this.m_appearance.getLeftInset();
        }
        return 0;
    }

    public int getY(fso fso2) {
        if (this.m_position != null) {
            if (this.m_containerParent == null || this.m_containerParent == fso2) {
                return this.m_position.y + this.m_appearance.getBottomInset();
            }
            return this.m_position.y + this.m_containerParent.getY(fso2) + this.m_appearance.getBottomInset();
        }
        return 0;
    }

    public int getScreenX() {
        if (this.m_screenPosition.x != -1 && this.m_screenPosition.y != -1) {
            return this.m_screenPosition.x;
        }
        if (this.m_position != null) {
            if (this.m_containerParent != null && this.m_containerParent.getAppearance() != null) {
                return this.m_position.x + this.m_containerParent.getScreenX() + this.m_containerParent.getAppearance().getLeftInset();
            }
            return this.m_position.x;
        }
        return 0;
    }

    public int getScreenY() {
        if (this.m_screenPosition.x != -1 && this.m_screenPosition.y != -1) {
            return this.m_screenPosition.y;
        }
        if (this.m_position != null) {
            if (this.m_containerParent != null && this.m_containerParent.getAppearance() != null) {
                return this.m_position.y + this.m_containerParent.getScreenY() + this.m_containerParent.getAppearance().getBottomInset();
            }
            return this.m_position.y;
        }
        return 0;
    }

    protected final Point getScreenPosition() {
        return this.m_screenPosition;
    }

    public void setScreenPosition(int n, int n2) {
        this.m_screenPosition.setLocation(n, n2);
    }

    @Override
    public Point getPosition() {
        return this.m_position;
    }

    public void setPosition(Point point) {
        this.setPosition(point.x, point.y, false);
    }

    public void setPosition(int n, int n2) {
        this.setPosition(n, n2, false);
    }

    public void setPosition(int n, int n2, boolean bl) {
        this.setPosition(n, n2, bl ? 0 : 300);
    }

    public void setPosition(int n, int n2, int n3) {
        this.setPosition(n, n2, n3, true, true);
    }

    public float getXPercInParent() {
        return this.m_xPercInParent;
    }

    public float getYPercInParent() {
        return this.m_yPercInParent;
    }

    public void setPosition(int n, int n2, int n3, boolean bl, boolean bl2) {
        this.setPosition(n, n2, n3, bl, bl2, null);
    }

    public void setPosition(int n, int n2, int n3, boolean bl, boolean bl2, Runnable runnable) {
        if (n3 == 0 || !this.m_usePositionTween) {
            boolean bl3 = false;
            if (this.m_position == null) {
                this.m_position = new Point(n, n2);
                bl3 = true;
            } else if (this.m_position.x != n || this.m_position.y != n2) {
                this.m_position.x = n;
                this.m_position.y = n2;
                bl3 = true;
            }
            if (bl2 && this.m_stickWithinContainer && this.m_containerParent != null) {
                this.m_position.x = Hw.a(this.m_position.x, 0, this.m_containerParent.getAppearance().getContentWidth() - this.getWidth());
                this.m_position.y = Hw.a(this.m_position.y, 0, this.m_containerParent.getAppearance().getContentHeight() - this.getHeight());
            }
            if (bl) {
                this.recomputeRelativePosition();
            }
            if (this.m_enablePositionEvents) {
                fzs fzs2 = fzs.i();
                fzs2.a(frd_0.Q);
                fzs2.c(this);
                this.dispatchEvent(fzs2);
            }
            if (bl3 && this.m_elementMapRoot && this.m_userDefinedManager != null) {
                ((fkc_1)this.m_userDefinedManager).h();
            }
            this.m_positionChanged = true;
            this.setNeedsToPostProcess();
        } else {
            fjq_2 fjq_22 = new fjq_2(this.m_position.x, this.m_position.y, n, n2, this, 0, n3, fjw_2.b);
            fjq_22.a(new fvf_0(this, runnable));
            this.addTween(fjq_22);
        }
    }

    private void recomputeRelativePosition() {
        if (this.m_containerParent != null) {
            this.m_xPercInParent = (float)this.m_position.x / (float)(this.m_containerParent.getWidth() - this.m_size.width);
            this.m_yPercInParent = (float)this.m_position.y / (float)(this.m_containerParent.getHeight() - this.m_size.height);
        }
    }

    public void setX(int n) {
        this.setPosition(n, this.m_position.y, false);
    }

    public int getX() {
        return this.m_position.x;
    }

    @Override
    public int getDisplayX() {
        return this.getScreenX();
    }

    public void setY(int n) {
        this.setPosition(this.m_position.x, n, false);
    }

    public int getY() {
        return this.m_position.y;
    }

    @Override
    public int getDisplayY() {
        return this.getScreenY();
    }

    public fta_0 getMasterRootContainer() {
        if (this.m_containerParent != null) {
            return this.m_containerParent.getMasterRootContainer();
        }
        return null;
    }

    public azt_1 getComputedScissor() {
        if (this.m_scissor == null) {
            return null;
        }
        return azt_1.a(this.getScreenX() + this.m_scissor.x, this.getScreenY() + this.m_scissor.y, this.m_scissor.width, this.m_scissor.height);
    }

    public Rectangle getScissor() {
        return this.m_scissor;
    }

    public void setScissor(Rectangle rectangle) {
        this.m_scissor = rectangle;
    }

    public boolean isExpandable() {
        return this.m_expandable;
    }

    public void setExpandable(boolean bl) {
        this.m_expandable = bl;
    }

    public boolean isShrinkable() {
        return this.m_shrinkable;
    }

    public void setShrinkable(boolean bl) {
        this.m_shrinkable = bl;
    }

    public boolean getGreedy() {
        return this.m_greedy;
    }

    public void setGreedy(boolean bl) {
        this.m_greedy = bl;
    }

    public void setCursorType(frb_0 frb_02) {
        this.m_cursorType = frb_02;
    }

    public frb_0 getCursorType() {
        return this.m_cursorType;
    }

    public boolean getVisible() {
        return this.m_visible;
    }

    public boolean isParentVisible() {
        return this.m_parentVisible;
    }

    protected void setParentVisible(boolean bl) {
        this.m_parentVisible = bl;
    }

    @Deprecated
    public boolean getUsedInLayout() {
        return this.getVisible();
    }

    public void setVisible(boolean bl) {
        if (bl != this.m_visible) {
            Runnable runnable = () -> this.applyVisibility(bl);
            if (this.m_visibilityChangePreExecutor != null) {
                this.m_visibilityChangePreExecutor.a(this.m_visible, bl, runnable);
            } else {
                runnable.run();
            }
        }
    }

    protected void applyVisibility(boolean bl) {
        boolean bl2 = this.m_visible;
        this.m_visible = bl;
        this.notifyVisibilityChanged(bl2, bl);
        if (this.m_containerParent != null) {
            this.m_containerParent.invalidateMinSize();
            this.m_containerParent.setNeedsToResetMeshes();
        }
        this.setParentVisible(bl && (this.m_containerParent == null || this.m_containerParent.isParentVisible()));
        this.setNeedsToPostProcess();
    }

    public void setVisibilityChangePreExecutor(@Nullable fxr_0 fxr_02) {
        this.m_visibilityChangePreExecutor = fxr_02;
    }

    public void removeVisibilityChangePreExecutor() {
        this.setVisibilityChangePreExecutor(null);
    }

    @Nullable
    public fxr_0 getVisibilityChangePreExecutor() {
        return this.m_visibilityChangePreExecutor;
    }

    public boolean isVisible() {
        return this.m_visible;
    }

    public void setVisibilityLinked(@Nullable String string) {
        if (string == null) {
            if (this.m_widgetWithVisibilityLinked == null) {
                return;
            }
            this.m_widgetWithVisibilityLinked.removeVisibilityListener(this.m_visibilityLinkedListener);
            this.m_widgetWithVisibilityLinked = null;
        } else {
            fyb_0 fyb_02 = this.getParentWithId(string);
            if (fyb_02 == null && this.getParent() == null) {
                this.addParentListener(new fvG(this, string));
                return;
            }
            if (!(fyb_02 instanceof fvE)) {
                m_logger.warn((Object)String.format("Unable to link %s(id: %s) visibility to following parent %s(%s)", this.getClass(), this.getId(), string, fyb_02 == null ? "null" : fyb_02.getClass()));
                return;
            }
            this.m_widgetWithVisibilityLinked = (fvE)fyb_02;
            this.m_widgetWithVisibilityLinked.addVisibilityListener(this.m_visibilityLinkedListener);
        }
    }

    @Deprecated
    public void setUsedInLayout(boolean bl) {
        this.setVisible(bl);
    }

    public boolean getUseResizeTween() {
        return this.m_useResizeTween;
    }

    public void setUseResizeTween(boolean bl) {
        this.m_useResizeTween = bl;
    }

    public boolean getUsePositionTween() {
        return this.m_usePositionTween;
    }

    public void setUsePositionTween(boolean bl) {
        this.m_usePositionTween = bl;
    }

    public boolean getEnabled() {
        return this.m_enabled;
    }

    public void setEnabled(boolean bl) {
        this.m_enabled = bl;
        this.checkEnabled();
    }

    public boolean getNetEnabled() {
        return this.m_netEnabled;
    }

    public void setNetEnabled(boolean bl) {
        this.m_netEnabled = bl;
        this.checkEnabled();
    }

    public String getNetEnabledId() {
        return this.m_netEnabledId;
    }

    public void setNetEnabledId(String string) {
        if (this.m_netEnabledId != null) {
            fzw_0.a.b(this.m_netEnabledId, this);
        }
        this.m_netEnabledId = string;
        if (this.m_netEnabledId != null) {
            fzw_0.a.a(string, this);
        }
    }

    public boolean isEnabledFull() {
        return this.m_netEnabled && this.m_enabled;
    }

    private void checkEnabled() {
        fck_1 fck_12 = new fck_1(this, this.m_enabled && this.m_netEnabled);
        this.dispatchEvent(fck_12);
    }

    public void setStickWithinContainer(boolean bl) {
        this.m_stickWithinContainer = bl;
    }

    public boolean isStickWithinContainer() {
        return this.m_stickWithinContainer;
    }

    public boolean getFocusable() {
        return this.m_focusable;
    }

    public void setFocusable(boolean bl) {
        if (bl && !this.m_focusable) {
            fyc_0.a().a(this);
        } else if (!bl && this.m_focusable) {
            fyc_0.a().b(this);
        }
        this.m_focusable = bl;
    }

    public void setFocused(boolean bl) {
        if (this.isInTree()) {
            if (fyc_0.a().b() != this && bl) {
                fyc_0.a().c(this);
            } else if (fyc_0.a().b() == this) {
                fyc_0.a().e();
            }
        } else {
            this.m_focused = bl;
        }
    }

    public fso getRootFocusParent() {
        if (this.m_containerParent != null) {
            return this.m_containerParent.getRootFocusParent();
        }
        return null;
    }

    @Nullable
    public fvE getWidget(int n, int n2) {
        if (this.m_unloading) {
            return null;
        }
        if (this.m_visible && !this.m_nonBlocking && this.getAppearance().a(n, n2) && !fta_0.getInstance().isMovePointMode()) {
            return this;
        }
        return null;
    }

    public void setNeedsToResetMeshes() {
        this.m_needToResetMeshes = true;
        this.setNeedsToPostProcess();
    }

    public boolean getNeedsToResetMeshes() {
        return this.m_needToResetMeshes;
    }

    public fqj getAppearance() {
        return this.m_appearance;
    }

    public boolean mustReuseCurrentAppearanceDuringParsing() {
        return true;
    }

    @Override
    public boolean setAppearance(fqj fqj2) {
        return this.setAppearance(fqj2, true);
    }

    public boolean setAppearance(fqj fqj2, boolean bl) {
        boolean bl2 = false;
        while (fqj2 instanceof fqc_0) {
            fqj2 = ((fqc_0)fqj2).getInnerAppearance();
        }
        if (fqj2 != null && this.isAppearanceCompatible(fqj2)) {
            if (this.m_appearance != null && this.m_appearance != fqj2) {
                fqj2.setWidget(this);
                if (bl) {
                    this.destroy(this.m_appearance);
                } else {
                    this.m_appearance.setWidget(null);
                }
                fqj fqj3 = this.m_appearance;
                this.m_appearance = fqj2;
                this.notifyAppearanceChanged(fqj3, this.m_appearance);
                bl2 = true;
            } else if (this.m_appearance == null) {
                fqj fqj4 = this.m_appearance;
                this.m_appearance = fqj2;
                this.notifyAppearanceChanged(fqj4, this.m_appearance);
                bl2 = true;
            }
        } else if (fqj2 != null) {
            fqj2.destroySelfFromParent();
        }
        return bl2;
    }

    private void notifyAppearanceChanged(fqj fqj2, fqj fqj3) {
        if (this.m_appearanceChangeListeners.isEmpty()) {
            return;
        }
        HashSet<fbp_1> hashSet = new HashSet<fbp_1>(this.m_appearanceChangeListeners);
        hashSet.forEach(fbp_12 -> {
            try {
                fbp_12.b(fqj2, fqj3);
            }
            catch (Exception exception) {
                m_logger.error((Object)String.format("Error occured in call of following %s(%s) with followings args : \"%s\", \"%s\"", fbp_12, fbp_12.getClass().getName(), fqj2, fqj3), (Throwable)exception);
            }
        });
    }

    public boolean addAppearanceChangeListener(@NotNull fbp_1 fbp_12) {
        return this.m_appearanceChangeListeners.add(fbp_12);
    }

    public boolean removeAppearanceChangeListener(@NotNull fbp_1 fbp_12) {
        return this.m_appearanceChangeListeners.remove(fbp_12);
    }

    private void notifyVisibilityChanged(boolean bl, boolean bl2) {
        if (this.m_visibilityListeners.isEmpty()) {
            return;
        }
        HashSet<fwr_0> hashSet = new HashSet<fwr_0>(this.m_visibilityListeners);
        hashSet.forEach(fwr_02 -> {
            try {
                fwr_02.onVisibilityChanged(bl, bl2);
            }
            catch (Exception exception) {
                m_logger.error((Object)String.format("Error occured in call of following %s(%s) with followings args : \"%s\", \"%s\"", fwr_02, fwr_02.getClass().getName(), bl, bl2), (Throwable)exception);
            }
        });
    }

    public boolean addVisibilityListener(@NotNull fwr_0 fwr_02) {
        return this.m_visibilityListeners.add(fwr_02);
    }

    public boolean removeVisibilityListener(@NotNull fwr_0 fwr_02) {
        return this.m_visibilityListeners.remove(fwr_02);
    }

    public abstract boolean isAppearanceCompatible(fqj var1);

    public int getTopMargin() {
        if (this.m_appearance == null) {
            return 0;
        }
        Insets insets = this.m_appearance.getMargin();
        if (insets == null) {
            return 0;
        }
        return insets.top;
    }

    public int getBottomMargin() {
        if (this.m_appearance == null) {
            return 0;
        }
        Insets insets = this.m_appearance.getMargin();
        if (insets == null) {
            return 0;
        }
        return insets.bottom;
    }

    public int getLeftMargin() {
        if (this.m_appearance == null) {
            return 0;
        }
        Insets insets = this.m_appearance.getMargin();
        if (insets == null) {
            return 0;
        }
        return insets.left;
    }

    public int getRightMargin() {
        if (this.m_appearance == null) {
            return 0;
        }
        Insets insets = this.m_appearance.getMargin();
        if (insets == null) {
            return 0;
        }
        return insets.right;
    }

    public void setDecoratorState(String string) {
        if (this.m_appearance != null && !this.m_appearance.getCurrentState().equalsIgnoreCase(string)) {
            this.m_appearance.n();
            this.m_appearance.setEnabled(string, true);
        }
    }

    public void addStyle(String string) {
        if (string == null) {
            return;
        }
        boolean bl = false;
        for (int k = 0; k < this.m_style.length; ++k) {
            if (this.m_style[k] != null) continue;
            this.m_style[k] = string;
            bl = true;
            break;
        }
        if (!bl) {
            String[] stringArray = new String[this.m_style.length + 5];
            this.m_style = stringArray;
            System.arraycopy(this.m_style, 0, stringArray, 0, this.m_style.length);
            this.m_style[k] = string;
        }
        this.m_styleIsDirty = true;
        this.setNeedsToPreProcess();
    }

    public void setStyle(String string, boolean bl) {
        if (this.m_style == null || string == null) {
            return;
        }
        if (bl || !string.equals(this.m_style[0])) {
            this.m_style[0] = string;
            if (this.m_childrenAdded) {
                if (this.m_appearance != null) {
                    this.m_appearance.l();
                }
                for (int k = 0; k < this.m_style.length; ++k) {
                    if (this.m_style[k] == null) continue;
                    fpm_0.b().g().a(this, this.m_style[k]);
                }
                if (this.m_xmlAppearance != null) {
                    if (this.m_appearance instanceof fqc_0 && !(this.m_xmlAppearance instanceof fqc_0)) {
                        fqc_0 fqc_02 = (fqc_0)this.m_appearance;
                        fqj fqj2 = fqc_02.getInnerAppearance();
                        if (fqj2 != null) {
                            if (this.m_xmlAppearance.getClass().isAssignableFrom(fqj2.getClass())) {
                                this.m_xmlAppearance.copyElement(fqj2);
                            } else {
                                m_logger.warn((Object)String.format("Unable to copy xmlAppearance in inner appearance (xmlAppearance is %s, appearance is %s and inner appearance is %s)", this.m_xmlAppearance.getClass(), this.m_appearance.getClass(), fqj2.getClass()));
                            }
                        } else {
                            m_logger.warn((Object)String.format("Unable to copy xmlAppearance in null inner appearance (xmlAppearance is %s and appearance is %s)", this.m_xmlAppearance.getClass(), this.m_appearance.getClass()));
                        }
                    } else if (this.m_xmlAppearance.getClass().isAssignableFrom(this.m_appearance.getClass())) {
                        this.m_xmlAppearance.copyElement(this.m_appearance);
                    } else {
                        m_logger.warn((Object)String.format("Unable to copy xmlAppearance in appearance (xmlAppearance is %s and appearance is %s)", this.m_xmlAppearance.getClass(), this.m_appearance.getClass()));
                    }
                }
                this.m_styleIsDirty = false;
            }
        }
    }

    public void setStyle(String string) {
        try {
            this.setStyle(string, false);
        }
        catch (Exception exception) {
            m_logger.error((Object)"Exception ", (Throwable)exception);
        }
    }

    public String getThemeElementName() {
        return this.m_themeElementName;
    }

    public void setThemeElementName(String string) {
        this.m_themeElementName = string;
    }

    public String getThemeElementParentType() {
        return this.m_themeElementParentType;
    }

    public void setThemeElementParentType(String string) {
        this.m_themeElementParentType = string;
    }

    public String getStyle() {
        return this.m_style[0] == null ? "" : this.m_style[0];
    }

    public String[] getStyles() {
        return this.m_style;
    }

    public fvE getWidgetByThemeElementName(String string, boolean bl) {
        if (this.m_themeElementWidgets != null) {
            return this.m_themeElementWidgets.get(string.toUpperCase());
        }
        return null;
    }

    public fvE getWidgetByThemeElementName(String string) {
        return this.getWidgetByThemeElementName(string, false);
    }

    public boolean setLayoutData(fif_1 fif_12) {
        boolean bl = false;
        if (this.m_layoutData != null && this.m_layoutData != fif_12) {
            this.destroy(this.m_layoutData);
            this.m_layoutData = fif_12;
            bl = true;
        } else if (this.m_layoutData == null) {
            this.m_layoutData = fif_12;
            bl = true;
        }
        return bl;
    }

    public fif_1 getLayoutData() {
        return this.m_layoutData;
    }

    public fsv_0 getDragAndDropParent() {
        return this.m_dndParent;
    }

    public void setDragAndDropParent(fsv_0 fsv_02) {
        this.m_dndParent = fsv_02;
    }

    public void setOnFocusChange(fdh_2 fdh_22) {
        this.addEventListener(fdh_22.a(), fdh_22, true);
    }

    public void setOnClick(fdt_1 fdt_12) {
        this.addEventListener(fdt_12.a(), fdt_12, true);
    }

    public void setOnDoubleClick(fdu_1 fdu_12) {
        this.addEventListener(fdu_12.a(), fdu_12, true);
    }

    public void setOnMouseMove(fda_1 fda_12) {
        this.addEventListener(fda_12.a(), fda_12, true);
    }

    public void setOnMouseEnter(fdy_1 fdy_12) {
        this.addEventListener(fdy_12.a(), fdy_12, true);
    }

    public void setOnMouseExit(fdz_1 fdz_12) {
        this.addEventListener(fdz_12.a(), fdz_12, true);
    }

    public void setOnMousePress(fdb_1 fdb_12) {
        this.addEventListener(fdb_12.a(), fdb_12, true);
    }

    public void setOnMouseRelease(fdc_2 fdc_22) {
        this.addEventListener(fdc_22.a(), fdc_22, true);
    }

    public void setOnMouseWheel(fdd_1 fdd_12) {
        this.addEventListener(fdd_12.a(), fdd_12, true);
    }

    public void setOnMouseDrag(fdw_1 fdw_12) {
        this.addEventListener(fdw_12.a(), fdw_12, true);
    }

    public void setOnMouseDragOut(fdx_1 fdx_12) {
        this.addEventListener(fdx_12.a(), fdx_12, true);
    }

    public void setOnMouseDragIn(fdv_1 fdv_12) {
        this.addEventListener(fdv_12.a(), fdv_12, true);
    }

    public void setOnKeyPress(fdm_2 fdm_22) {
        this.addEventListener(fdm_22.a(), fdm_22, true);
    }

    public void setOnKeyRelease(fdn_1 fdn_12) {
        this.addEventListener(fdn_12.a(), fdn_12, true);
    }

    public void setOnKeyType(fdo_1 fdo_12) {
        this.addEventListener(fdo_12.a(), fdo_12, true);
    }

    public void setOnPopupDisplay(fde_2 fde_22) {
        this.addEventListener(fde_22.a(), fde_22, true);
    }

    public void setOnPopupHide(fdf_2 fdf_22) {
        this.addEventListener(fdf_22.a(), fdf_22, true);
    }

    public void setOnSelectionChange(fdi_2 fdi_22) {
        this.addEventListener(fdi_22.a(), fdi_22, true);
    }

    public void setOnSliderMove(fdj_2 fdj_22) {
        this.addEventListener(fdj_22.a(), fdj_22, true);
    }

    public void setOnStick(fdm_1 fdm_12) {
        this.addEventListener(fdm_12.a(), fdm_12, true);
    }

    public void setOnValueChange(fdl_1 fdl_12) {
        this.addEventListener(fdl_12.a(), fdl_12, true);
    }

    public void setOnListSelectionChange(fdp_1 fdp_12) {
        this.addEventListener(fdp_12.a(), fdp_12, true);
    }

    public void setOnItemOver(fdl_2 fdl_22) {
        this.addEventListener(fdl_22.a(), fdl_22, true);
    }

    public void setOnItemOut(fdk_2 fdk_22) {
        this.addEventListener(fdk_22.a(), fdk_22, true);
    }

    public void setOnItemClick(fdi_1 fdi_12) {
        this.addEventListener(fdi_12.a(), fdi_12, true);
    }

    public void setOnItemDoubleClick(fdj_1 fdj_12) {
        this.addEventListener(fdj_12.a(), fdj_12, true);
    }

    public void setOnDrag(fdb_2 fdb_22) {
        this.addEventListener(frd_0.d, fdb_22, false);
    }

    public void setOnDrop(fde_1 fde_12) {
        this.addEventListener(frd_0.g, fde_12, false);
    }

    public void setOnDropOut(fdf_1 fdf_12) {
        this.addEventListener(frd_0.h, fdf_12, false);
    }

    public void setOnDragOut(fdc_1 fdc_12) {
        this.addEventListener(frd_0.e, fdc_12, false);
    }

    public void setOnDragOver(fdd_2 fdd_22) {
        this.addEventListener(frd_0.f, fdd_22, false);
    }

    public <T extends fso> T getWidgetParentOfType(Class<T> clazz) {
        fso fso2 = this.m_containerParent;
        while (fso2 != null) {
            if (clazz.isAssignableFrom(fso2.getClass())) {
                return (T)fso2;
            }
            fso2 = fso2.m_containerParent;
        }
        return null;
    }

    public void setUserDefinedSize(boolean bl) {
        fkc_1 fkc_12;
        if (this.m_userDefinedManager == null) {
            this.m_userDefinedManager = new fkc_1(this);
        }
        if ((fkc_12 = (fkc_1)this.m_userDefinedManager).g() == bl) {
            return;
        }
        fkc_12.b(bl);
        this.loadPreferences();
    }

    public boolean isSizeInitByUserDefinition() {
        return this.m_userDefinedManager != null && ((fkc_1)this.m_userDefinedManager).g() && (this.m_size.getWidth() != 0.0 || this.m_size.getHeight() != 0.0);
    }

    public void setUserDefinedPosition(boolean bl) {
        fkc_1 fkc_12;
        if (this.m_userDefinedManager == null) {
            this.m_userDefinedManager = new fkc_1(this);
        }
        if ((fkc_12 = (fkc_1)this.m_userDefinedManager).f() == bl) {
            return;
        }
        fkc_12.a(bl);
        this.loadPreferences();
    }

    public boolean isPositionInitByUserDefinition() {
        return this.m_userDefinedManager != null && ((fkc_1)this.m_userDefinedManager).f() && this.m_userDefinedManager.e();
    }

    public void setLazyLoadingMode(fqt_0 fqt_02) {
        this.m_lazyLoadingMode = fqt_02;
    }

    public fqt_0 getLazyLoadingMode() {
        return this.m_lazyLoadingMode;
    }

    @Override
    public boolean dispatchEvent(fzs fzs2) {
        if (this.isEnabledFull() || !(fzs2 instanceof fca_2)) {
            return super.dispatchEvent(fzs2);
        }
        fzs2.release();
        return false;
    }

    @Override
    public void invalidate() {
        if (this.m_appearance != null) {
            this.m_appearance.invalidate();
        }
        super.invalidate();
    }

    public boolean isInWidgetTree() {
        if (this.m_containerParent != null) {
            return this.m_containerParent.isInWidgetTree();
        }
        return false;
    }

    public void addedToWidgetTree() {
        Class<?> clazz;
        Object obj;
        fzy<?> fzy2;
        if (this.m_themeElementName != null && this.m_themeElementParentType != null && (fzy2 = fay_2.c().b(this.m_themeElementParentType)) != null && (obj = this.getWidgetParentOfType(clazz = fzy2.g())) != null) {
            ((fvE)obj).addThemeElementName(this.m_themeElementName, this);
        }
        if (this.m_focusable) {
            fyc_0.a().a(this);
        }
    }

    public void removedFromWidgetTree() {
    }

    @Override
    public void addedToTree() {
        super.addedToTree();
        if (this.m_focused) {
            this.setFocused(this.m_focused);
        }
    }

    @Override
    public void onChildrenAdded() {
        super.onChildrenAdded();
        if (this.m_xmlAppearance != null) {
            this.m_xmlAppearance.release();
        }
        this.m_xmlAppearance = (fqj)this.m_appearance.cloneElementStructure();
        if (this.m_style[0] == null) {
            this.setStyle("", true);
        } else {
            this.setStyle(this.m_style[0], true);
        }
    }

    @Override
    public void onCheckIn() {
        fyc_0.a().b(this);
        super.onCheckIn();
        if (fta_0.getInstance() != null) {
            fta_0.getInstance().a(this);
        }
        this.m_entity.a((axt_2)null);
        this.m_entity.b((axt_2)null);
        this.m_entity.c();
        this.m_entity.u();
        this.m_entity = null;
        this.m_size = null;
        this.m_minSize = null;
        this.m_maxSize = null;
        this.m_prefSize = null;
        this.m_position = null;
        this.m_scissor = null;
        this.setNetEnabledId(null);
        this.m_containerParent = null;
        this.m_dndParent = null;
        if (this.m_xmlAppearance != null) {
            this.m_xmlAppearance.release();
            this.m_xmlAppearance = null;
        }
        this.m_appearance = null;
        this.m_appearanceChangeListeners.clear();
        this.m_visibilityListeners.clear();
        this.m_visibilityChangePreExecutor = null;
        Arrays.fill(this.m_style, null);
        this.m_themeElementName = null;
        this.m_themeElementParentType = null;
        if (this.m_themeElementWidgets != null) {
            this.m_themeElementWidgets.clear();
            this.m_themeElementWidgets = null;
        }
        this.m_layoutData = null;
        this.m_popup = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.m_enablePositionEvents = false;
        this.m_enableResizeEvents = false;
        this.m_expandable = true;
        this.m_shrinkable = false;
        this.m_greedy = false;
        this.m_parentVisible = false;
        this.m_enabled = true;
        this.m_netEnabled = true;
        this.m_focusable = false;
        this.m_focused = false;
        this.m_styleIsDirty = false;
        this.m_stickWithinContainer = false;
        this.m_needsScissor = false;
        this.m_positionChanged = true;
        this.m_cursorType = frb_0.a;
        this.m_useResizeTween = false;
        this.m_usePositionTween = false;
        this.m_needToResetMeshes = true;
        ayx_2 ayx_22 = new ayx_2();
        ayx_22.b();
        assert (this.m_entity == null);
        this.m_entity = (EntityGroup)EntityGroup.a.d();
        this.m_entity.p = this;
        this.m_entity.D().a(ayx_22);
        fwP fwP2 = new fwP(this);
        this.m_entity.a(fwP2);
        this.m_entity.b(fwP2);
        this.m_entity.E().d(new aft_2(10000.0f, 0.0f, 0.0f));
        this.m_minSizeSet = false;
        this.m_maxSizeSet = false;
        this.m_prefSizeSet = false;
        this.m_position = new Point(0, 0);
        this.m_size = new fjf_2(0, 0);
        this.m_visible = true;
        this.m_nonBlocking = false;
        this.m_lazyLoadingMode = fqt_0.a;
        this.setNeedsToPostProcess();
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.m_styleIsDirty) {
            this.setStyle(this.m_style[0], true);
        }
        return bl;
    }

    @Override
    public boolean postProcess(int n) {
        boolean bl = super.postProcess(n);
        if (this.m_needToResetMeshes && this.m_entity != null) {
            this.m_entity.c();
            this.addMeshes();
        }
        if (this.m_positionChanged && this.m_visible && this.m_entity != null) {
            int n2 = this.m_position.x;
            int n3 = this.m_position.y;
            if (this.m_containerParent != null) {
                n2 += this.m_containerParent.getAppearance().getLeftInset();
                n3 += this.m_containerParent.getAppearance().getBottomInset();
            }
            this.m_entity.D().a(0, n2, n3);
            this.m_positionChanged = false;
        }
        return bl;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[").append(this.getClass().getSimpleName()).append("] ");
        if (this.m_id != null) {
            stringBuilder.append("id = ").append(this.m_id).append(" ");
        }
        if (this.m_position != null) {
            stringBuilder.append("Position <").append(this.m_position.x).append(", ").append(this.m_position.y).append("> ");
        }
        if (this.m_size != null) {
            stringBuilder.append("Taille (").append(this.m_size.width).append(", ").append(this.m_size.height).append(")");
        }
        if (this.m_id != null) {
            stringBuilder.append("Id=").append(this.getId());
        }
        if (this.isUnloading()) {
            stringBuilder.append("released");
        }
        return stringBuilder.toString();
    }

    @Override
    public void copyElement(fyo fyo2) {
        fvE fvE2 = (fvE)fyo2;
        super.copyElement(fvE2);
        fvE2.m_enablePositionEvents = this.m_enablePositionEvents;
        fvE2.m_enableResizeEvents = this.m_enableResizeEvents;
        fvE2.m_enabled = this.m_enabled;
        fvE2.setNetEnabledId(this.m_netEnabledId);
        fvE2.m_expandable = this.m_expandable;
        fvE2.m_shrinkable = this.m_shrinkable;
        fvE2.m_greedy = this.m_greedy;
        fvE2.setFocusable(this.m_focusable);
        if (this.m_maxSize != null) {
            fvE2.m_maxSize = this.m_maxSize.d();
        }
        fvE2.m_maxSizeSet = this.m_maxSizeSet;
        if (this.m_prefSize != null) {
            fvE2.m_prefSize = this.m_prefSize.d();
        }
        fvE2.m_prefSizeSet = this.m_prefSizeSet;
        if (this.m_minSize != null) {
            fvE2.m_minSize = this.m_minSize.d();
        }
        fvE2.m_minSizeSet = this.m_minSizeSet;
        fvE2.m_nonBlocking = this.m_nonBlocking;
        fvE2.m_position = (Point)this.m_position.clone();
        fvE2.m_size = (fjf_2)this.m_size.clone();
        fvE2.m_cursorType = this.m_cursorType;
        System.arraycopy(this.m_style, 0, fvE2.m_style, 0, this.m_style.length);
        fvE2.m_themeElementName = this.m_themeElementName;
        fvE2.m_themeElementParentType = this.m_themeElementParentType;
        fvE2.m_visible = this.m_visible;
        if (fvE2.m_xmlAppearance != null) {
            fvE2.m_xmlAppearance.release();
        }
        fvE2.m_xmlAppearance = this.m_xmlAppearance != null ? (fqj)this.m_xmlAppearance.cloneElementStructure() : null;
        fvE2.m_needsScissor = this.m_needsScissor;
        if (this.m_userDefinedManager != null) {
            fvE2.setUserDefinedSize(this.isSizeInitByUserDefinition());
            fvE2.setUserDefinedPosition(this.isPositionInitByUserDefinition());
        }
        fvE2.m_stickWithinContainer = this.m_stickWithinContainer;
        fvE2.setLazyLoadingMode(this.getLazyLoadingMode());
    }

    public final boolean needsScissor() {
        return this.m_needsScissor;
    }

    public void setNeedsScissor(boolean bl) {
        this.m_needsScissor = bl;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 3530753) {
            this.setSize(fze2.b(string));
        } else if (n == 844081029) {
            this.setMaxSize(fze2.b(string));
        } else if (n == -1289212732) {
            this.setPrefSize(fze2.b(string));
        } else if (n == 540120820) {
            this.setExpandable(Co.a(string));
        } else if (n == -1354387741) {
            this.setShrinkable(Co.a(string));
        } else if (n == -1237774176) {
            this.setGreedy(Co.a(string));
        } else if (n == 262323999) {
            this.setNetEnabledId(string);
        } else if (n == -1609594047) {
            this.setEnabled(Co.a(string));
        } else if (n == 1629011506) {
            this.setFocusable(Co.a(string));
        } else if (n == -691041417) {
            this.setFocused(Co.a(string));
        } else if (n == 466743410 || n == -1811609716) {
            this.setVisible(Co.a(string));
        } else if (n == -1677991989) {
            this.setVisibilityLinked(string);
        } else if (n == 5106811) {
            this.setUsePositionTween(Co.a(string));
        } else if (n == -1752399344) {
            this.setUseResizeTween(Co.a(string));
        } else if (n == 566769062) {
            this.setStickWithinContainer(Co.a(string));
        } else if (n == 120) {
            this.setX(Co.c(string));
        } else if (n == 121) {
            this.setY(Co.c(string));
        } else if (n == 109780401) {
            this.setStyle(fze2.a(string, this.m_elementMap));
        } else if (n == -164750818) {
            this.setThemeElementName(fze2.a(string, this.m_elementMap));
        } else if (n == 1659243607) {
            this.setThemeElementParentType(fze2.a(string, this.m_elementMap));
        } else if (n == 2009226786) {
            this.setNonBlocking(Co.a(string));
        } else if (n == 87587760) {
            this.setCursorType(frb_0.a(string));
        } else if (n == -671195521) {
            this.setNeedsScissor(Co.a(string));
        } else if (n == 402556127) {
            this.setUserDefinedSize(Co.a(string));
        } else if (n == 866230023) {
            this.setUserDefinedPosition(Co.a(string));
        } else if (n == 546747627) {
            this.setLazyLoadingMode(fze2.a(fqt_0.class, string, this.m_elementMap));
        } else if (n == -1013405773) {
            this.setOnDrag(fze2.a(fdb_2.class, string));
        } else if (n == -1013405330) {
            this.setOnDrop(fze2.a(fde_1.class, string));
        } else if (n == -1046180197) {
            this.setOnDragOut(fze2.a(fdc_1.class, string));
        } else if (n == -1032982784) {
            this.setOnDropOut(fze2.a(fdf_1.class, string));
        } else if (n == 1928152871) {
            this.setOnDragOver(fze2.a(fdd_2.class, string));
        } else if (n == -1351902487) {
            this.setOnClick(fze2.a(fdt_1.class, string));
        } else if (n == -1164731176) {
            this.setOnDoubleClick(fze2.a(fdu_1.class, string));
        } else if (n == 1737415497) {
            this.setOnFocusChange(fze2.a(fdh_2.class, string));
        } else if (n == 2096925462) {
            this.setOnItemClick(fze2.a(fdi_1.class, string));
        } else if (n == 1076426565) {
            this.setOnItemDoubleClick(fze2.a(fdj_1.class, string));
        } else if (n == -842497956) {
            this.setOnItemOut(fze2.a(fdk_2.class, string));
        } else if (n == -347632250) {
            this.setOnItemOver(fze2.a(fdl_2.class, string));
        } else if (n == -1037804509) {
            this.setOnKeyPress(fze2.a(fdm_2.class, string));
        } else if (n == 511141863) {
            this.setOnKeyRelease(fze2.a(fdn_1.class, string));
        } else if (n == 520837978) {
            this.setOnKeyType(fze2.a(fdo_1.class, string));
        } else if (n == 1497720703) {
            this.setOnListSelectionChange(fze2.a(fdp_1.class, string));
        } else if (n == 555106394) {
            this.setOnMouseDrag(fze2.a(fdw_1.class, string));
        } else if (n == 881302303) {
            this.setOnMouseDragIn(fze2.a(fdv_1.class, string));
        } else if (n == 1550573716) {
            this.setOnMouseDragOut(fze2.a(fdx_1.class, string));
        } else if (n == 555372279) {
            this.setOnMouseMove(fze2.a(fda_1.class, string));
        } else if (n == 29251698) {
            this.setOnMouseEnter(fze2.a(fdy_1.class, string));
        } else if (n == 555142212) {
            this.setOnMouseExit(fze2.a(fdz_1.class, string));
        } else if (n == 39515613) {
            this.setOnMousePress(fze2.a(fdb_1.class, string));
        } else if (n == 728660769) {
            this.setOnMouseRelease(fze2.a(fdc_2.class, string));
        } else if (n == 45681909) {
            this.setOnMouseWheel(fze2.a(fdd_1.class, string));
        } else if (n == 552298621) {
            this.setOnSelectionChange(fze2.a(fdi_2.class, string));
        } else if (n == 151596945) {
            this.setOnSliderMove(fze2.a(fdj_2.class, string));
        } else if (n == -1336887823) {
            this.setOnStick(fze2.a(fdm_1.class, string));
        } else if (n == 1055781365) {
            this.setOnPopupDisplay(fze2.a(fde_2.class, string));
        } else if (n == -647313169) {
            this.setOnPopupHide(fze2.a(fdf_2.class, string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 3530753) {
            this.setSize((fjf_2)object);
        } else if (n == 844081029) {
            this.setMaxSize((fjf_2)object);
        } else if (n == -1289212732) {
            this.setPrefSize((fjf_2)object);
        } else if (n == 540120820) {
            this.setExpandable(Co.b(object));
        } else if (n == -1354387741) {
            this.setShrinkable(Co.b(object));
        } else if (n == -1237774176) {
            this.setGreedy(Co.b(object));
        } else if (n == -1609594047) {
            this.setEnabled(Co.b(object));
        } else if (n == 1629011506) {
            this.setFocusable(Co.b(object));
        } else if (n == -691041417) {
            this.setFocused(Co.b(object));
        } else if (n == 466743410 || n == -1811609716) {
            this.setVisible(Co.b(object));
        } else if (n == -1677991989) {
            this.setVisibilityLinked(String.valueOf(object));
        } else if (n == 5106811) {
            this.setUsePositionTween(Co.b(object));
        } else if (n == -1752399344) {
            this.setUseResizeTween(Co.b(object));
        } else if (n == 120) {
            this.setX(Co.c(object));
        } else if (n == 121) {
            this.setY(Co.c(object));
        } else if (n == 109780401) {
            this.setStyle((String)object);
        } else if (n == -164750818) {
            this.setThemeElementName((String)object);
        } else if (n == 1659243607) {
            this.setThemeElementParentType((String)object);
        } else if (n == 2009226786) {
            this.setNonBlocking(Co.b(object));
        } else if (n == 87587760) {
            this.setCursorType((frb_0)((Object)object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    public fyo getNewElement(String string, fyb_0 fyb_02, Stack<fyy_0> stack, fya_0 fya_02) {
        fyo fyo2 = super.getNewElement(string, fyb_02, stack, fya_02);
        if (fyo2 instanceof fqj && this.m_appearance != null) {
            fyo2.release();
            fyo2 = this.getAppearance();
        }
        return fyo2;
    }

    @Override
    public void computeDocumentEntry(aqx_2 aqx_22, fyb_0 fyb_02, Stack<fyy_0> stack, fya_0 fya_02) {
        fqt_0 fqt_02 = this.getLazyLoadingMode();
        if (fqt_02.e && !this.isVisible()) {
            Runnable runnable = () -> super.computeDocumentEntry(aqx_22, fyb_02, stack, fya_02);
            fvE fvE2 = this;
            this.setVisibilityChangePreExecutor(new fvH(this, fqt_02, fvE2, runnable));
        } else {
            super.computeDocumentEntry(aqx_22, fyb_02, stack, fya_02);
        }
    }
}

