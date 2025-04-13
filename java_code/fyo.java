/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class fyo
implements abo_1 {
    private static final Logger m_logger = Logger.getLogger(fyo.class);
    private static final boolean DEBUG_ATTRIBUTE_APPLICATION = true;
    protected ObjectPool m_currentPool;
    protected boolean m_unloading = false;
    private int m_checkInCount = 0;
    private int m_checkOutCount = 0;
    protected fyo m_basicParent;
    protected ArrayList<fit_1> m_registeredProperties = null;
    protected boolean m_needPreProcess = false;
    protected boolean m_needMiddleProcess = false;
    protected boolean m_needPostProcess = false;
    private int m_lastPreProcessFrame = -1;
    private int m_lastMiddleProcessFrame = -1;
    private int m_lastPostProcessFrame = -1;
    protected boolean m_isATemplate = false;
    private boolean m_isInTreeDepthManager = false;
    private boolean m_isAddedNextInTreeDepthManager = false;
    private boolean m_childrenAdded = false;
    private final Set<fwp_0> m_childrenAddedListener = new HashSet<fwp_0>();
    private final Set<fzc> m_postProcessCallbacks = new HashSet<fzc>();
    public static final int INCLUDE_HASH = 1942574248;
    public static final int INCLUDE_ID_HASH = -1496919069;
    public static final int TEMPLATE_ID_HASH = 1304010549;
    public static final int ATLAS_HASH = 93144203;
    static final int[] IGNORED_ATTRIBUTES = new int[]{1942574248, -1496919069, 1304010549, 93144203, "xmlns:xsi".hashCode(), "xsi:noNamespaceSchemaLocation".hashCode()};

    public void addProperty(fit_1 fit_12) {
        if (this.m_registeredProperties == null) {
            this.m_registeredProperties = new ArrayList(1);
        }
        if (!this.m_registeredProperties.contains(fit_12)) {
            this.m_registeredProperties.add(fit_12);
        }
    }

    public void removeProperty(fit_1 fit_12) {
        if (this.m_registeredProperties != null) {
            this.m_registeredProperties.remove(fit_12);
        }
    }

    public void add(fyv_0 fyv_02) {
        fyv_02.setBasicParent(this);
    }

    public void add(fyb_0 fyb_02) {
        fyb_02.setBasicParent(this);
    }

    public void addFromXML(fyv_0 fyv_02) {
        this.add(fyv_02);
    }

    public void addFromXML(fyb_0 fyb_02) {
        this.add(fyb_02);
    }

    public void addBasicElement(fyo fyo2) {
        fyo2.setBasicParent(this);
        switch (fyo2.getElementType()) {
            case a: {
                this.addFromXML((fyb_0)fyo2);
                break;
            }
            case b: {
                this.addFromXML((fyv_0)fyo2);
                break;
            }
        }
    }

    public int getLastPreProcessFrame() {
        return this.m_lastPreProcessFrame;
    }

    public void setLastPreProcessFrame(int n) {
        this.m_lastPreProcessFrame = n;
    }

    public int getLastMiddleProcessFrame() {
        return this.m_lastMiddleProcessFrame;
    }

    public void setLastMiddleProcessFrame(int n) {
        this.m_lastMiddleProcessFrame = n;
    }

    public int getLastPostProcessFrame() {
        return this.m_lastPostProcessFrame;
    }

    public void setLastPostProcessFrame(int n) {
        this.m_lastPostProcessFrame = n;
    }

    public void setNeedsToPreProcess() {
        if (!(this.m_isATemplate || !fyP.a().c() && this.m_needPreProcess)) {
            fyP.a().d(this);
            this.m_needPreProcess = true;
        }
    }

    public void setNeedsToMiddleProcess() {
        if (!(this.m_isATemplate || !fyP.a().c() && this.m_needMiddleProcess)) {
            fyP.a().e(this);
            this.m_needMiddleProcess = true;
        }
    }

    public void setNeedsToPostProcess() {
        if (!(this.m_isATemplate || !fyP.a().c() && this.m_needPostProcess)) {
            fyP.a().f(this);
            this.m_needPostProcess = true;
        }
    }

    public <T> T getParentOfType(Class<T> clazz) {
        if (this.m_basicParent == null) {
            return null;
        }
        if (clazz.isAssignableFrom(this.m_basicParent.getClass())) {
            return (T)this.m_basicParent;
        }
        return this.m_basicParent.getParentOfType(clazz);
    }

    public void setBasicParent(fyo fyo2) {
        this.m_basicParent = fyo2;
    }

    public fyo getBasicParent() {
        return this.m_basicParent;
    }

    public boolean isChildOf(@NotNull fyo fyo2) {
        if (this.m_basicParent == fyo2) {
            return true;
        }
        if (this.m_basicParent == null) {
            return false;
        }
        return this.m_basicParent.isChildOf(fyo2);
    }

    public boolean isUnloading() {
        return this.m_unloading;
    }

    public abstract fyz getElementType();

    public static String getTag(Class<? extends fyo> clazz) {
        try {
            return (String)clazz.getDeclaredField("TAG").get(null);
        }
        catch (Exception exception) {
            m_logger.error((Object)("Erreur lors de la r\u00e9cup\u00e9ration du tag de " + clazz.getSimpleName()));
            return null;
        }
    }

    public String getTag() {
        return "";
    }

    public String getStyleTag() {
        return this.getTag();
    }

    public int getTreeDepth() {
        return this.m_basicParent != null ? this.m_basicParent.getTreeDepth() : 0;
    }

    public int getTreePosition() {
        return this.m_basicParent != null ? this.m_basicParent.getTreePosition() : 0;
    }

    public boolean isInTreeDepthManager() {
        return this.m_isInTreeDepthManager;
    }

    public void setInTreeDepthManager(boolean bl) {
        this.m_isInTreeDepthManager = bl;
    }

    public boolean isAddedNextInTreeDepthManager() {
        return this.m_isAddedNextInTreeDepthManager;
    }

    public void setAddedNextInTreeDepthManager(boolean bl) {
        this.m_isAddedNextInTreeDepthManager = bl;
    }

    public void setIsATemplate(boolean bl) {
        this.m_isATemplate |= bl;
    }

    public boolean isATemplate() {
        return this.m_isATemplate;
    }

    public boolean setXMLAttribute(String string, String string2) {
        int n = string.hashCode();
        for (int n2 : IGNORED_ATTRIBUTES) {
            if (n != n2) continue;
            return true;
        }
        if (!this.setXMLAttribute(n, string2, fze.a())) {
            m_logger.debug((Object)new StringBuilder("Impossible de trouver l'attribut ").append(string).append(" pour ").append(this.getClass().getSimpleName()));
            return false;
        }
        return true;
    }

    public boolean appendXMLAttribute(String string, String string2) {
        if (!this.appendXMLAttribute(string.hashCode(), string2, fze.a())) {
            m_logger.debug((Object)new StringBuilder("Impossible de trouver l'attribut ").append(string).append(" pour ").append(this.getClass().getSimpleName()));
            return false;
        }
        return true;
    }

    public boolean prependXMLAttribute(String string, String string2) {
        if (!this.prependXMLAttribute(string.hashCode(), string2, fze.a())) {
            m_logger.debug((Object)new StringBuilder("Impossible de trouver l'attribut ").append(string).append(" pour ").append(this.getClass().getSimpleName()));
            return false;
        }
        return true;
    }

    public boolean setPropertyAttribute(String string, Object object) {
        if (!this.setPropertyAttribute(string.hashCode(), object)) {
            m_logger.debug((Object)new StringBuilder("Impossible de trouver l'attribut ").append(string).append(" pour ").append(this.getClass().getSimpleName()));
            return false;
        }
        return true;
    }

    public boolean appendPropertyAttribute(String string, Object object) {
        if (!this.appendPropertyAttribute(string.hashCode(), object)) {
            m_logger.debug((Object)new StringBuilder("Impossible de trouver l'attribut ").append(string).append(" pour ").append(this.getClass().getSimpleName()));
            return false;
        }
        return true;
    }

    public boolean prependPropertyAttribute(String string, Object object) {
        if (!this.prependPropertyAttribute(string.hashCode(), object)) {
            m_logger.debug((Object)new StringBuilder("Impossible de trouver l'attribut ").append(string).append(" pour ").append(this.getClass().getSimpleName()));
            return false;
        }
        return true;
    }

    public boolean setXMLAttribute(int n, String string, fze fze2) {
        return false;
    }

    public boolean appendXMLAttribute(int n, String string, fze fze2) {
        return false;
    }

    public boolean prependXMLAttribute(int n, String string, fze fze2) {
        return false;
    }

    public boolean setPropertyAttribute(int n, Object object) {
        return false;
    }

    public boolean appendPropertyAttribute(int n, Object object) {
        return false;
    }

    public boolean prependPropertyAttribute(int n, Object object) {
        return false;
    }

    public boolean preProcess(int n) {
        return false;
    }

    public boolean middleProcess(int n) {
        return false;
    }

    public boolean postProcess(int n) {
        return fyo.executeSetOfProcessCallback(this.m_postProcessCallbacks, n);
    }

    public static boolean executeSetOfProcessCallback(Set<fzc> set, int n) {
        if (set.isEmpty()) {
            return false;
        }
        HashSet<fzc> hashSet = new HashSet<fzc>(set);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        hashSet.forEach(fzc2 -> {
            try {
                boolean bl = fzc2.a(n);
                atomicBoolean.set(atomicBoolean.get() || bl);
            }
            catch (Exception exception) {
                m_logger.error((Object)String.format("Error occured while calling %s(%s) with following args : \"%s\"", fzc2, fzc2.getClass().getName(), n), (Throwable)exception);
            }
        });
        return atomicBoolean.get();
    }

    public boolean addPostProcessCallback(@NotNull fzc fzc2) {
        return this.m_postProcessCallbacks.add(fzc2);
    }

    public boolean removePostProcessCallback(@NotNull fzc fzc2) {
        return this.m_postProcessCallbacks.remove(fzc2);
    }

    public void doPreProcess(int n) {
        if (this.m_unloading) {
            return;
        }
        if (this.m_needPreProcess) {
            this.m_needPreProcess = false;
            if (fyX.b()) {
                boolean bl = this.preProcess(n);
                this.m_needPreProcess |= bl;
            }
            if (this.m_needPreProcess) {
                fyP.a().a(this);
            }
        }
    }

    public void doMiddleProcess(int n) {
        if (this.m_unloading) {
            return;
        }
        if (this.m_needMiddleProcess) {
            this.m_needMiddleProcess = false;
            if (fyX.b()) {
                boolean bl = this.middleProcess(n);
                this.m_needMiddleProcess |= bl;
            }
            if (this.m_needMiddleProcess) {
                fyP.a().b(this);
            }
        }
    }

    public void doPostProcess(int n) {
        if (this.m_unloading) {
            return;
        }
        if (this.m_needPostProcess) {
            this.m_needPostProcess = false;
            if (fyX.b()) {
                boolean bl = this.postProcess(n);
                this.m_needPostProcess |= bl;
            }
            if (this.m_needPostProcess) {
                fyP.a().c(this);
            }
        }
    }

    public void release() {
        try {
            if (this.m_currentPool != null) {
                this.m_currentPool.returnObject((Object)this);
            } else {
                this.onCheckIn();
            }
        }
        catch (Exception exception) {
            m_logger.warn((Object)"Probl\u00e8me lors du retour dans un pool", (Throwable)exception);
            this.onCheckIn();
        }
    }

    public void onAttributesInitialized() {
    }

    private void notifyChildrenAdded() {
        if (this.m_childrenAddedListener.isEmpty()) {
            return;
        }
        HashSet<fwp_0> hashSet = new HashSet<fwp_0>(this.m_childrenAddedListener);
        hashSet.forEach(fwp_02 -> {
            try {
                fwp_02.onChildrenAdded();
            }
            catch (Exception exception) {
                m_logger.error((Object)String.format("Error occured in call of following %s(%s)", fwp_02, fwp_02.getClass().getName()), (Throwable)exception);
            }
        });
    }

    public boolean addChildrenAddedListener(@NotNull fwp_0 fwp_02) {
        boolean bl = this.m_childrenAddedListener.add(fwp_02);
        if (bl && this.m_childrenAdded) {
            try {
                fwp_02.onChildrenAdded();
            }
            catch (Exception exception) {
                m_logger.error((Object)String.format("Error occured in call of following %s(%s)", fwp_02, fwp_02.getClass().getName()), (Throwable)exception);
            }
        }
        return bl;
    }

    public boolean removeChildrenAddedListener(@NotNull fwp_0 fwp_02) {
        return this.m_childrenAddedListener.remove(fwp_02);
    }

    public void onChildrenAdded() {
        this.notifyChildrenAdded();
        this.m_childrenAdded = true;
    }

    @Override
    public void onCheckIn() {
        this.m_unloading = true;
        if (this.m_checkInCount >= this.m_checkOutCount) {
            m_logger.error((Object)("Le nombre de checkIn ne correspond pas aux nombre de checkOut " + this.getClass().getSimpleName()));
        }
        ++this.m_checkInCount;
        this.m_basicParent = null;
        if (this.m_registeredProperties != null) {
            for (int k = this.m_registeredProperties.size() - 1; k >= 0; --k) {
                this.m_registeredProperties.get(k).a(this);
            }
            this.m_registeredProperties = null;
        }
    }

    @Override
    public void onCheckOut() {
        this.m_unloading = false;
        if (this.m_checkOutCount != this.m_checkInCount) {
            m_logger.error((Object)("Le nombre de checkOut ne correspond pas aux nombre de checkIn " + this.getClass().getSimpleName()));
        }
        ++this.m_checkOutCount;
        this.m_needPreProcess = false;
        this.m_needMiddleProcess = false;
        this.m_needPostProcess = false;
        this.m_lastPreProcessFrame = -1;
        this.m_lastMiddleProcessFrame = -1;
        this.m_lastPostProcessFrame = -1;
        this.m_childrenAdded = false;
        this.m_childrenAddedListener.clear();
        this.m_postProcessCallbacks.clear();
    }

    public void copyElement(fyo fyo2) {
    }

    public void applyAttributes(aqx_2 aqx_22) {
        ArrayList arrayList = aqx_22.l();
        int n = arrayList != null ? arrayList.size() : 0;
        fzy<?> fzy2 = fay_2.c().b(aqx_22.b());
        for (int k = 0; k < n; ++k) {
            String string;
            aqx_2 aqx_23 = (aqx_2)arrayList.get(k);
            String string2 = aqx_23.b();
            if (this.setXMLAttribute(string2, string = aqx_23.c())) continue;
            fyw_0.a(this, fzy2, string2, string);
        }
        this.onAttributesInitialized();
    }

    public void preApplyAttributes(aqx_2 aqx_22, fyb_0 fyb_02, Stack<fyy_0> stack, fya_0 fya_02) {
    }

    public void postApplyAttributes(aqx_2 aqx_22, fyb_0 fyb_02, Stack<fyy_0> stack, fya_0 fya_02) {
    }

    public void preAddChildComputeDocumentEntry(aqx_2 aqx_22, fyb_0 fyb_02, Stack<fyy_0> stack, fya_0 fya_02) {
    }

    public void postAddChildComputeDocumentEntry(aqx_2 aqx_22, fyb_0 fyb_02, Stack<fyy_0> stack, fya_0 fya_02) {
    }

    public fyo getNewElement(String string, fyb_0 fyb_02, Stack<fyy_0> stack, fya_0 fya_02) {
        fzy<?> fzy2 = fay_2.c().b(string);
        if (fzy2 == null) {
            m_logger.error((Object)("Tag Inconnu : " + string));
            return null;
        }
        try {
            return (fyo)fzy2.h();
        }
        catch (Exception exception) {
            m_logger.error((Object)new StringBuilder("Erreur lors de l'instanciation du tag ").append(string).append("."), (Throwable)exception);
            return null;
        }
    }

    public void computeDocumentEntry(aqx_2 aqx_22, fyb_0 fyb_02, Stack<fyy_0> stack, fya_0 fya_02) {
        ArrayList<? extends aqx_2> arrayList = aqx_22.k();
        int n = arrayList.size();
        fyb_0 fyb_03 = this.getElementType() == fyz.a ? (fyb_0)this : fyb_02;
        this.preAddChildComputeDocumentEntry(aqx_22, fyb_02, stack, fya_02);
        for (int k = 0; k < n; ++k) {
            fyo fyo2;
            aqx_2 aqx_23 = arrayList.get(k);
            String string = aqx_23.b();
            if (string.equals("#text") || string.equals("#comment") || (fyo2 = this.getNewElement(string, fyb_03, stack, fya_02)) == null) continue;
            fyo2.preApplyAttributes(aqx_23, fyb_02, stack, fya_02);
            fyo2.applyAttributes(aqx_23);
            fyo2.postApplyAttributes(aqx_23, fyb_02, stack, fya_02);
            this.addBasicElement(fyo2);
            if (aqx_23.f("include") != null) {
                String string2 = aqx_23.f("includeId").c();
                if (string2 == null) {
                    m_logger.error((Object)"Pas d'id pour le tag Include, impossible de l'ajouter");
                    continue;
                }
                fyy_0 fyy_02 = stack.peek();
                String string3 = fyy_02 != null ? fyy_02.c() : "";
                fyy_0 fyy_03 = fya_02.a(string3 + "." + string2);
                fyy_03.a(fyy_02);
                stack.push(fyy_03);
                fyo2.computeDocumentEntry(aqx_23, fyb_03, stack, fya_02);
                stack.pop();
                continue;
            }
            fyo2.computeDocumentEntry(aqx_23, fyb_03, stack, fya_02);
        }
        this.onChildrenAdded();
        this.postAddChildComputeDocumentEntry(aqx_22, fyb_02, stack, fya_02);
    }

    @Contract(value="_, null, null -> false")
    protected static <Type, I extends Iterable<Type>> boolean setIterableProperty(@Nullable Object object, @Nullable @Nullable Consumer<@Nullable Type[]> consumer, @Nullable Consumer<@NotNull I> consumer2) {
        if (consumer == null && consumer2 == null) {
            return false;
        }
        if (object == null) {
            if (consumer2 != null) {
                consumer2.accept(Collections.emptyList());
            } else {
                consumer.accept(null);
            }
            return true;
        }
        if (object.getClass().isArray()) {
            Object[] objectArray;
            try {
                objectArray = (Object[])object;
            }
            catch (ClassCastException classCastException) {
                m_logger.error((Object)"Array provided for content property have invalid content type (See exception related)", (Throwable)classCastException);
                return false;
            }
            if (consumer != null) {
                consumer.accept(objectArray);
            } else {
                consumer2.accept(Arrays.asList(objectArray));
            }
        } else {
            Set<Object> set;
            try {
                set = object instanceof Iterable ? (Set<Object>)object : Collections.singleton(object);
            }
            catch (ClassCastException classCastException) {
                m_logger.error((Object)"Value provided for content property have invalid content type (See exception related)", (Throwable)classCastException);
                return false;
            }
            if (consumer2 != null) {
                consumer2.accept(set);
            } else {
                m_logger.error((Object)String.format("Unable to convert %s (type: %s) to I from Type[], please provide an %s<I>", object, object.getClass(), Consumer.class));
            }
        }
        return true;
    }
}

