/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;
import java.util.function.Predicate;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fyB
 */
public abstract class fyb_0
extends fyo
implements abo_1,
ajy_1,
fjt_2,
Comparable<fyb_0> {
    protected static final Logger m_logger = Logger.getLogger(fyb_0.class);
    protected final ArrayList<fyb_0> m_children = new ArrayList();
    protected fyb_0 m_parent;
    private final Set<fwq_0> m_parentListeners = new HashSet<fwq_0>();
    private acy_2<ArrayList<fzu>> m_beforeListeners;
    private acy_2<ArrayList<fzu>> m_afterListeners;
    private EnumSet<frd_0> m_unactivatedEvent;
    protected ArrayList<fvE> m_widgetsToAdd = null;
    private boolean m_addedToTree = false;
    private int m_treeDepth;
    private int m_treePosition;
    private short m_modalLevel = (short)-1;
    protected fyy_0 m_elementMap;
    protected boolean m_elementMapRoot = false;
    protected String m_id = null;
    protected boolean m_valid = false;
    protected boolean m_childrenAdded = false;
    protected ftj_0 m_renderableParent;
    protected fkb_1 m_userDefinedManager = null;
    protected ArrayList<fjg_2> m_tweens;
    protected ArrayList<fjg_2> m_tweensToRemove;
    protected boolean m_canBeCloned = true;
    public static final int ID_HASH = 3355;

    @Override
    public void add(fyb_0 fyb_02) {
        this.add(fyb_02, true);
    }

    public void add(fyb_0 fyb_02, boolean bl) {
        if (fyb_02 != null) {
            assert (!this.m_unloading) : "Object is already checked-in" + this.getClass().getSimpleName();
            super.add(fyb_02);
            this.m_children.add(fyb_02);
            fyb_02.setParent(this);
            fyb_02.setTreeDepth(this.m_treeDepth + 1);
            fyP.a().b();
            if (bl && fyb_02 instanceof fvE) {
                this.addWidget((fvE)fyb_02);
            }
            if (this.isInTree()) {
                fyb_02.addedToTree();
            }
            fyb_02.setIsATemplate(this.m_isATemplate);
        } else {
            m_logger.error((Object)("Tentative d'ajout un element null \u00e0 " + this.getClass().getSimpleName()));
        }
    }

    public void remove(fyb_0 fyb_02) {
        if (this.m_children != null) {
            if (fyb_02 instanceof fvE) {
                this.removeWidget((fvE)fyb_02);
            }
            fyb_02.removedFromTree();
            this.m_children.remove(fyb_02);
            fyb_02.setParent(null);
        }
    }

    public void destroy(fyb_0 fyb_02) {
        this.remove(fyb_02);
        fyb_0.release(fyb_02);
    }

    public void removeSelfFromParent() {
        if (this.m_parent != null) {
            this.m_parent.remove(this);
        }
    }

    public void destroySelfFromParent() {
        if (this.m_parent != null) {
            this.m_parent.destroy(this);
        } else {
            fyb_0.release(this);
        }
    }

    public void removeAllChildren() {
        if (this.m_children != null) {
            for (int k = this.m_children.size() - 1; k >= 0; --k) {
                this.remove(this.m_children.get(k));
            }
            this.m_children.clear();
        }
    }

    public void destroyAllChildren() {
        if (this.m_children != null) {
            for (int k = this.m_children.size() - 1; k >= 0; --k) {
                this.destroy(this.m_children.get(k));
            }
            this.m_children.clear();
        }
    }

    public void addWidget(fvE fvE2) {
        if (this.m_parent != null) {
            this.m_parent.addWidget(fvE2);
        } else {
            if (this.m_widgetsToAdd == null) {
                this.m_widgetsToAdd = new ArrayList();
            }
            this.m_widgetsToAdd.add(fvE2);
            this.setNeedsToPreProcess();
        }
    }

    public void removeWidget(fvE fvE2) {
        if (this.m_parent != null) {
            this.m_parent.removeWidget(fvE2);
        }
    }

    public void setWidgetOnTop(fvE fvE2) {
        if (this.m_parent != null) {
            this.m_parent.setWidgetOnTop(fvE2);
        }
    }

    @Override
    public void addTween(fjg_2 fjg_22) {
        if (this.m_tweens == null) {
            this.m_tweens = new ArrayList(5);
        }
        this.m_tweens.add(fjg_22);
        fjg_22.a(this);
        this.setNeedsToPreProcess();
    }

    @Override
    public void removeTween(fjg_2 fjg_22) {
        if (fjg_22 == null) {
            return;
        }
        if (this.m_tweensToRemove == null) {
            this.m_tweensToRemove = new ArrayList(5);
        }
        if (!this.m_tweensToRemove.contains(fjg_22)) {
            this.m_tweensToRemove.add(fjg_22);
            this.setNeedsToPreProcess();
        }
    }

    public boolean removeTweensOfType(Class<? extends fjg_2> clazz) {
        if (this.m_tweens == null) {
            return false;
        }
        boolean bl = false;
        for (int k = this.m_tweens.size() - 1; k >= 0; --k) {
            fjg_2 fjg_22 = this.m_tweens.get(k);
            if (!fjg_22.getClass().equals(clazz)) continue;
            this.removeTween(fjg_22);
            bl = true;
        }
        return bl;
    }

    public boolean hasTweensOfType(Class<? extends fjg_2> clazz) {
        if (this.m_tweens == null) {
            return false;
        }
        for (int k = this.m_tweens.size() - 1; k >= 0; --k) {
            if (!this.m_tweens.get(k).getClass().equals(clazz)) continue;
            return true;
        }
        return false;
    }

    public void addEventListener(frd_0 frd_02, fzu fzu2, boolean bl) {
        this.addEventListener(frd_02, fzu2, bl, null);
    }

    public void addEventListener(frd_0 frd_02, fzu fzu2, boolean bl, @Nullable Integer n) {
        int n2 = frd_02.ordinal();
        if (bl) {
            ArrayList<fzu> arrayList;
            if (this.m_beforeListeners == null) {
                this.m_beforeListeners = new acy_2(5);
            }
            if ((arrayList = this.m_beforeListeners.g(n2)) == null) {
                arrayList = new ArrayList();
                this.m_beforeListeners.a(n2, arrayList);
            }
            if (!arrayList.contains(fzu2)) {
                if (n == null) {
                    arrayList.add(fzu2);
                } else {
                    arrayList.add(n, fzu2);
                }
            }
        } else {
            ArrayList<fzu> arrayList;
            if (this.m_afterListeners == null) {
                this.m_afterListeners = new acy_2(5);
            }
            if ((arrayList = this.m_afterListeners.g(n2)) == null) {
                arrayList = new ArrayList();
                this.m_afterListeners.a(n2, arrayList);
            }
            if (!arrayList.contains(fzu2)) {
                if (n == null) {
                    arrayList.add(fzu2);
                } else {
                    arrayList.add(n, fzu2);
                }
            }
        }
    }

    public void removeEventListener(frd_0 frd_02, fzu fzu2, boolean bl) {
        int n = frd_02.ordinal();
        if (bl) {
            if (this.m_beforeListeners == null) {
                return;
            }
            ArrayList<fzu> arrayList = this.m_beforeListeners.g(n);
            if (arrayList != null) {
                arrayList.remove(fzu2);
                if (arrayList.isEmpty()) {
                    this.m_beforeListeners.f(n);
                }
            }
        } else {
            if (this.m_afterListeners == null) {
                return;
            }
            ArrayList<fzu> arrayList = this.m_afterListeners.g(n);
            if (arrayList != null) {
                arrayList.remove(fzu2);
                if (arrayList.isEmpty()) {
                    this.m_afterListeners.f(n);
                }
            }
        }
    }

    public void removeAllEventListeners() {
        if (this.m_beforeListeners != null) {
            this.m_beforeListeners.c();
            this.m_beforeListeners = null;
        }
        if (this.m_afterListeners != null) {
            this.m_afterListeners.c();
            this.m_afterListeners = null;
        }
    }

    @Nullable
    public ArrayList<fzu> getListeners(frd_0 frd_02, boolean bl) {
        if (bl && this.m_beforeListeners != null) {
            return this.m_beforeListeners.g(frd_02.ordinal());
        }
        if (!bl && this.m_afterListeners != null) {
            return this.m_afterListeners.g(frd_02.ordinal());
        }
        return null;
    }

    @Override
    public fyz getElementType() {
        return fyz.a;
    }

    public fyb_0 getParent() {
        return this.m_parent;
    }

    public void setParent(fyb_0 fyb_02) {
        assert (fyb_02 != this) : "On ne peut pas se d\u00e9finir soi-m\u00eame en parent";
        fyb_0 fyb_03 = this.m_parent;
        this.m_parent = fyb_02;
        if (this.m_parent != null && this.m_elementMap == null) {
            this.m_elementMap = this.m_parent.getElementMap();
        }
        this.notifyParentChanged(fyb_03, this.m_parent);
    }

    public fyb_0 getParentWithId(String string) {
        if (this.m_parent == null) {
            return null;
        }
        if (Objects.equals(this.m_parent.getId(), string)) {
            return this.m_parent;
        }
        return this.m_parent.getParentWithId(string);
    }

    private void notifyParentChanged(fyb_0 fyb_02, fyb_0 fyb_03) {
        if (this.m_parentListeners.isEmpty()) {
            return;
        }
        HashSet<fwq_0> hashSet = new HashSet<fwq_0>(this.m_parentListeners);
        hashSet.forEach(fwq_02 -> {
            try {
                fwq_02.a(fyb_02, fyb_03);
            }
            catch (Exception exception) {
                m_logger.error((Object)String.format("Error occured in call of following %s(%s) with followings args : \"%s\", \"%s\"", fwq_02, fwq_02.getClass().getName(), fyb_02, fyb_03), (Throwable)exception);
            }
        });
    }

    public boolean addParentListener(@NotNull fwq_0 fwq_02) {
        return this.m_parentListeners.add(fwq_02);
    }

    public boolean removeParentListener(@NotNull fwq_0 fwq_02) {
        return this.m_parentListeners.remove(fwq_02);
    }

    public ArrayList<fyb_0> getChildren() {
        return this.m_children;
    }

    @Nullable
    public <T extends fyb_0> T getElementRecursively(String string, Predicate<fyb_0> predicate) {
        LinkedList<fyb_0> linkedList = new LinkedList<fyb_0>();
        linkedList.add(this);
        HashSet<fyb_0> hashSet = new HashSet<fyb_0>();
        while (!linkedList.isEmpty()) {
            fyb_0 fyb_02 = (fyb_0)linkedList.remove(0);
            if (fyb_02 == null || hashSet.contains(fyb_02)) continue;
            hashSet.add(fyb_02);
            if (string.equals(fyb_02.m_id) && predicate.test(fyb_02)) {
                return (T)fyb_02;
            }
            linkedList.addAll(fyb_02.m_children);
        }
        return null;
    }

    public fyb_0 getChildWithId(String string) {
        if (this.m_children.isEmpty()) {
            return null;
        }
        for (fyb_0 fyb_02 : this.m_children) {
            if (!Objects.equals(fyb_02.getId(), string)) continue;
            return fyb_02;
        }
        for (fyb_0 fyb_02 : this.m_children) {
            fyb_0 fyb_03 = fyb_02.getChildWithId(string);
            if (fyb_03 == null) continue;
            return fyb_03;
        }
        return null;
    }

    public String getId() {
        return this.m_id;
    }

    public void setId(String string) {
        if (this.m_id != null && !this.m_id.equalsIgnoreCase(string) && this.m_elementMap != null) {
            this.m_elementMap.a(this.m_id, string);
            this.m_id = string;
        } else if (this.m_id == null && string != null && this.m_elementMap != null) {
            this.m_id = string;
            this.m_elementMap.a(string, this);
        } else {
            this.m_id = string;
        }
    }

    public short getModalLevel() {
        return this.m_modalLevel;
    }

    public void setModalLevel(short s2) {
        this.m_modalLevel = s2;
    }

    public boolean isValidAdd(fyo fyo2) {
        return fyo2 != this;
    }

    @Override
    public int getTreePosition() {
        return this.m_treePosition;
    }

    public void setTreePosition(int n) {
        this.m_treePosition = n;
    }

    public void setTreeDepth(int n) {
        this.m_treeDepth = n;
        if (this.m_children != null) {
            int n2 = this.m_children.size();
            for (int k = 0; k < n2; ++k) {
                this.m_children.get(k).setTreeDepth(n + 1);
            }
        }
    }

    @Override
    public int getTreeDepth() {
        return this.m_treeDepth;
    }

    @Override
    public void setIsATemplate(boolean bl) {
        this.m_isATemplate |= bl;
        for (int k = this.m_children.size() - 1; k >= 0; --k) {
            this.m_children.get(k).setIsATemplate(bl);
        }
    }

    @Override
    public boolean isATemplate() {
        return this.m_isATemplate;
    }

    public boolean hasListener(frd_0 frd_02) {
        if (this.m_beforeListeners != null && this.m_beforeListeners.d(frd_02.ordinal())) {
            return true;
        }
        return this.m_afterListeners != null && this.m_afterListeners.d(frd_02.ordinal());
    }

    public boolean isValid() {
        return this.m_valid;
    }

    public boolean setAppearance(fqj fqj2) {
        m_logger.warn((Object)("Tentative d'ajout d'une apparence " + fqj2.getClass().getSimpleName() + " \u00e0 un " + this.getClass().getSimpleName()));
        fqj2.destroySelfFromParent();
        return false;
    }

    public fvE getParentWidget() {
        if (this.m_parent != null) {
            if (this.m_parent instanceof fvE) {
                return (fvE)this.m_parent;
            }
            return this.m_parent.getParentWidget();
        }
        return null;
    }

    public boolean hasInParentHierarchy(fyb_0 fyb_02) {
        if (this.m_parent == null) {
            return false;
        }
        if (this.m_parent == fyb_02) {
            return true;
        }
        return this.m_parent.hasInParentHierarchy(fyb_02);
    }

    public Object getElementValue() {
        return this;
    }

    public void setElementMap(fyy_0 fyy_02) {
        this.m_elementMap = fyy_02;
    }

    public fyy_0 getElementMap() {
        if (this.m_elementMap == null && this.m_parent != null) {
            return this.m_parent.getElementMap();
        }
        return this.m_elementMap;
    }

    public boolean isElementMapRoot() {
        return this.m_elementMapRoot;
    }

    public void setElementMapRoot(boolean bl) {
        this.m_elementMapRoot = bl;
    }

    public ftj_0 getRenderableParent() {
        return this.m_renderableParent;
    }

    public void setRenderableParent(ftj_0 ftj_02) {
        if (this.m_renderableParent != ftj_02) {
            this.m_renderableParent = ftj_02;
        }
    }

    public void setChildrenAdded(boolean bl) {
        this.m_childrenAdded = bl;
    }

    public boolean areChildrenAdded() {
        return this.m_childrenAdded;
    }

    public fkb_1 getUserDefinedManager() {
        return this.m_userDefinedManager;
    }

    public void setUserDefinedManager(fkb_1 fkb_12) {
        this.m_userDefinedManager = fkb_12;
    }

    public void enableEvent(frd_0 frd_02, boolean bl) {
        if (bl && this.m_unactivatedEvent != null) {
            this.m_unactivatedEvent.remove((Object)frd_02);
        } else if (!bl) {
            if (this.m_unactivatedEvent == null) {
                this.m_unactivatedEvent = EnumSet.noneOf(frd_0.class);
            }
            this.m_unactivatedEvent.add(frd_02);
        }
    }

    protected void processEventForSound(fzs fzs2, boolean bl) {
    }

    public void setCanBeCloned(boolean bl) {
        this.m_canBeCloned = bl;
    }

    public boolean canBeCloned() {
        return this.m_canBeCloned;
    }

    @Override
    public void propertyChange(ajx_1 ajx_12) {
    }

    public void loadPreferences() {
        if (this.m_userDefinedManager != null) {
            this.m_userDefinedManager.a();
        }
    }

    public void storePreferences() {
        if (this.m_userDefinedManager != null) {
            this.m_userDefinedManager.b();
        }
    }

    public boolean isInTree() {
        if (this.m_parent == null) {
            return false;
        }
        return this.m_parent.isInTree();
    }

    public void addedToTree() {
        int n = this.m_children.size();
        for (int k = 0; k < n; ++k) {
            this.m_children.get(k).addedToTree();
        }
    }

    public void removedFromTree() {
        if (this.m_userDefinedManager != null) {
            this.m_userDefinedManager.b();
            this.m_userDefinedManager.c();
            ajb_1 ajb_12 = fpm_0.b().k().a(this.m_elementMap.c());
            if (ajb_12 != null) {
                ajb_12.b(this);
            }
        }
        int n = this.m_children.size();
        for (int k = 0; k < n; ++k) {
            this.m_children.get(k).removedFromTree();
        }
    }

    @Override
    public void copyElement(fyo fyo2) {
        fyb_0 fyb_02 = (fyb_0)fyo2;
        super.copyElement(fyo2);
        fyb_02.m_id = this.m_id;
        fyb_02.m_childrenAdded = this.m_childrenAdded;
        fyb_02.m_modalLevel = this.m_modalLevel;
        fyb_02.m_elementMap = this.m_elementMap;
        if (this.m_beforeListeners != null) {
            fyb_02.m_beforeListeners = this.copyListeners(fyb_02.m_beforeListeners, this.m_beforeListeners);
        }
        if (this.m_afterListeners != null) {
            fyb_02.m_afterListeners = this.copyListeners(fyb_02.m_afterListeners, this.m_afterListeners);
        }
        if (this.m_children != null) {
            int n = this.m_children.size();
            for (int k = 0; k < n; ++k) {
                fyb_0 fyb_03 = this.m_children.get(k);
                if (!fyb_03.canBeCloned()) continue;
                fyb_02.add(fyb_03.cloneElementStructure());
            }
        }
    }

    private acy_2<ArrayList<fzu>> copyListeners(acy_2<ArrayList<fzu>> acy_22, acy_2<ArrayList<fzu>> acy_23) {
        int n = acy_23.d();
        if (acy_22 != null) {
            acy_22.a(acy_22.d() + n);
        } else {
            acy_22 = new acy_2(n);
        }
        for (int k = 0; k < n; ++k) {
            int n2 = acy_23.e(k);
            ArrayList<fzu> arrayList = acy_23.h(k);
            ArrayList<fzu> arrayList2 = acy_22.g(n2);
            int n3 = arrayList.size();
            if (arrayList2 == null) {
                arrayList2 = new ArrayList(n3);
                acy_22.a(n2, arrayList2);
            } else {
                arrayList2.ensureCapacity(n3 + arrayList2.size());
            }
            for (int i2 = 0; i2 < n3; ++i2) {
                arrayList2.add(arrayList.get(i2));
            }
        }
        return acy_22;
    }

    public fyb_0 cloneElementStructure() {
        try {
            fyb_0 fyb_02;
            try {
                fyb_02 = (fyb_0)fay_2.c().a(this.getClass()).h();
            }
            catch (NullPointerException nullPointerException) {
                m_logger.error((Object)("pas de factory trouv\u00e9e pour " + this.getClass().getSimpleName()), (Throwable)nullPointerException);
                return null;
            }
            this.copyElement(fyb_02);
            return fyb_02;
        }
        catch (Throwable throwable) {
            m_logger.error((Object)"Exception during cloneElementStructure", throwable);
            return null;
        }
    }

    @Override
    public int compareTo(@NotNull fyb_0 fyb_02) {
        return fyb_02.getTreeDepth() - this.m_treeDepth;
    }

    public boolean runEvent(fzs fzs2, boolean bl) {
        this.processEventForSound(fzs2, bl);
        fzs2.b(this);
        boolean bl2 = false;
        if (this.m_unactivatedEvent == null || !this.m_unactivatedEvent.contains((Object)fzs2.f())) {
            bl2 = bl ? this.runBeforeListeners(fzs2) : this.runAfterListeners(fzs2);
        }
        if (bl2) {
            return true;
        }
        if (fzs2.e() == this && !fzs2.c()) {
            fzs2.a(true);
            bl = false;
        } else if (fzs2.e() == this && fzs2.c()) {
            fzs2.a(false);
        }
        if (bl) {
            fyb_0 fyb_02 = fzs2.a();
            if (fyb_02 != null) {
                return fyb_02.runEvent(fzs2, true);
            }
        } else {
            if (fzs2.c()) {
                return ((fyb_0)fzs2.e()).runEvent(fzs2, false);
            }
            if (this.m_parent != null) {
                return this.m_parent.runEvent(fzs2, false);
            }
        }
        return false;
    }

    public boolean isChildOf(@NotNull String string) {
        fyb_0 fyb_02 = this;
        do {
            if (!string.equals(fyb_02.m_id)) continue;
            return true;
        } while ((fyb_02 = fyb_02.m_parent) != null);
        return false;
    }

    public void dispatchEventDebug(fzs fzs2) {
        if (this.m_afterListeners != null) {
            boolean bl = false;
            ArrayList<fzu> arrayList = this.m_afterListeners.g(fzs2.f().ordinal());
            if (arrayList != null) {
                for (int k = 0; k < arrayList.size() && !(bl |= arrayList.get(k).run(fzs2)); ++k) {
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean dispatchEvent(fzs fzs2) {
        if (fzs2 == null) {
            m_logger.error((Object)"L'event est null, impossible de le traiter");
            return false;
        }
        try {
            if (fzs2.e() == null) {
                m_logger.error((Object)("[" + fzs2.f() + "] L'event n'a pas de target, impossible de le traiter"));
                boolean bl = false;
                return bl;
            }
            fzs2.c(this);
            boolean bl = true;
            fyb_0 fyb_02 = this instanceof fta_0 ? this : this.m_parent;
            fzs2.a(this);
            while (fyb_02 != null && !(fyb_02 instanceof fta_0)) {
                fzs2.a(fyb_02);
                fyb_02 = fyb_02.m_parent;
            }
            if (fyb_02 != null) {
                boolean bl2 = fyb_02.runEvent(fzs2, true);
                return bl2;
            }
            boolean bl3 = false;
            return bl3;
        }
        finally {
            fzs2.release();
        }
    }

    public static void release(fyb_0 fyb_02) {
        if (!fyb_02.isUnloading()) {
            fyb_02.release();
        }
    }

    public void validate() {
        this.m_valid = true;
    }

    public void invalidate() {
        this.m_valid = false;
        this.setNeedsToPostProcess();
    }

    @Override
    public void onChildrenAdded() {
        super.onChildrenAdded();
        this.m_childrenAdded = true;
    }

    public void onAdd() {
        this.m_addedToTree = true;
        this.setNeedsToMiddleProcess();
    }

    @Override
    public boolean preProcess(int n) {
        int n2;
        int n3;
        boolean bl = super.preProcess(n);
        if (this.m_widgetsToAdd != null && !this.m_widgetsToAdd.isEmpty()) {
            n3 = this.m_widgetsToAdd.size();
            for (n2 = 0; n2 < n3; ++n2) {
                this.addWidget(this.m_widgetsToAdd.get(n2));
            }
            this.m_widgetsToAdd.clear();
        }
        if (this.m_tweensToRemove != null && (n3 = this.m_tweensToRemove.size()) > 0) {
            for (n2 = 0; n2 < n3; ++n2) {
                this.m_tweensToRemove.get(n2).a();
            }
            if (this.m_tweens != null) {
                this.m_tweens.removeAll(this.m_tweensToRemove);
            }
            this.m_tweensToRemove.clear();
        }
        if (this.m_tweens != null && (n3 = this.m_tweens.size()) > 0) {
            for (n2 = 0; n2 < n3; ++n2) {
                this.m_tweens.get(n2).a(n);
            }
        }
        if (this.m_tweens != null && this.m_tweens.size() > 0) {
            bl = true;
        }
        return bl;
    }

    @Override
    public boolean middleProcess(int n) {
        boolean bl = super.middleProcess(n);
        if (!this.m_addedToTree) {
            this.onAdd();
        }
        return bl;
    }

    @Override
    public boolean postProcess(int n) {
        boolean bl = super.postProcess(n);
        if (!this.m_valid) {
            this.validate();
        }
        return bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean runBeforeListeners(fzs fzs2) {
        if (this.m_beforeListeners == null) {
            return false;
        }
        ArrayList<fzu> arrayList = this.getListeners(fzs2.f(), true);
        if (arrayList != null) {
            ArrayList<fzu> arrayList2 = arrayList;
            synchronized (arrayList2) {
                for (int k = 0; k < arrayList.size(); ++k) {
                    if (!arrayList.get(k).run(fzs2)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean runAfterListeners(fzs fzs2) {
        if (this.m_afterListeners == null) {
            return false;
        }
        ArrayList<fzu> arrayList = this.getListeners(fzs2.f(), false);
        if (arrayList != null) {
            ArrayList<fzu> arrayList2 = arrayList;
            synchronized (arrayList2) {
                for (int k = 0; k < arrayList.size(); ++k) {
                    if (!arrayList.get(k).run(fzs2)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        if (this.m_children != null) {
            for (int k = this.m_children.size() - 1; k >= 0; --k) {
                this.destroy(this.m_children.get(k));
            }
            this.m_children.clear();
        }
        if (this.m_widgetsToAdd != null) {
            this.m_widgetsToAdd.clear();
            this.m_widgetsToAdd = null;
        }
        this.m_currentPool = null;
        this.m_parent = null;
        this.m_parentListeners.clear();
        this.removeAllEventListeners();
        this.m_beforeListeners = null;
        this.m_afterListeners = null;
        this.m_unactivatedEvent = null;
        if (this.m_elementMap != null) {
            if (this.m_id != null) {
                this.m_elementMap.d(this.m_id);
            }
            if (this.m_elementMapRoot) {
                fpm_0.b().p(this.m_elementMap.c());
                this.m_elementMap.a().c(this.m_elementMap.c());
            }
            this.m_elementMap = null;
        }
        this.m_id = null;
        this.m_renderableParent = null;
        if (this.m_tweens != null) {
            this.m_tweens.clear();
            this.m_tweens = null;
        }
        if (this.m_tweensToRemove != null) {
            this.m_tweensToRemove.clear();
            this.m_tweensToRemove = null;
        }
        this.m_userDefinedManager = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.m_addedToTree = false;
        this.m_modalLevel = (short)-1;
        this.m_treeDepth = 0;
        this.m_elementMapRoot = false;
        this.m_valid = false;
        this.m_childrenAdded = false;
        this.m_isATemplate = false;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (3355 != n) {
            return false;
        }
        this.setId(fze2.a(string, this.m_elementMap));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (3355 == n) {
            this.setId((String)object);
            return true;
        }
        return false;
    }

    @Override
    public void preApplyAttributes(aqx_2 aqx_22, fyb_0 fyb_02, Stack<fyy_0> stack, fya_0 fya_02) {
        fyy_0 fyy_02;
        fyy_0 fyy_03 = fyy_02 = stack != null ? stack.peek() : null;
        if (fyy_02 == null && fyb_02 != null) {
            fyy_02 = fyb_02.getElementMap();
        }
        this.setElementMap(fyy_02);
        super.preApplyAttributes(aqx_22, fyb_02, stack, fya_02);
    }

    public void prepareRender() {
    }
}

