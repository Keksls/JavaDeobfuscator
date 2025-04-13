/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.xulor2.component.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ftd
 */
public class ftd_0
extends AbstractList
implements fah_2 {
    public static final String TAG = "MultiSelectionList";
    private boolean i = false;
    private boolean j = true;
    private boolean k = true;
    private boolean l = true;
    private boolean m = false;
    @Nullable
    private Iterable<Object> n = null;
    private azj_2 o;
    private final List<ftj_0> p = new ArrayList<ftj_0>();
    private final List<fbz_2> q = new ArrayList<fbz_2>();
    private final LinkedHashSet<Integer> r = new LinkedHashSet();
    public static final int a = 1430566280;
    public static final int b = 895182995;
    public static final int c = "selecteds".hashCode();
    public static final int d = "selectedValues".hashCode();
    public static final int e = 1039818982;
    public static final int f = -2013533217;
    public static final int g = -1763504454;
    public static final int h = -1395080333;

    public ftd_0() {
    }

    public ftd_0(boolean bl) {
        super(bl);
    }

    public boolean isCanSelectNull() {
        return this.l;
    }

    public void setCanSelectNull(boolean bl) {
        this.l = bl;
    }

    public boolean isSelectOnlyOnLeftClick() {
        return this.k;
    }

    public void setSelectOnlyOnLeftClick(boolean bl) {
        this.k = bl;
    }

    public boolean isUseSelectedValueCache() {
        return this.m;
    }

    public void setUseSelectedValueCache(boolean bl) {
        this.m = bl;
    }

    @Override
    public void addInnerMeshes() {
        for (fbz_2 fbz_22 : this.q) {
            this.m_entity.a(fbz_22.c());
        }
        super.addInnerMeshes();
    }

    @Override
    public void setListOffset(float f2, boolean bl) {
        super.setListOffset(f2, bl);
        this.a();
    }

    @Override
    public void effectiveUpdateValues(int n, int n2) {
        this.p.clear();
        super.effectiveUpdateValues(n, n2);
        if (this.p.size() != this.r.size()) {
            for (ftj_0 ftj_02 : this.m_renderables) {
                if (!this.r.contains(this.indexOf(ftj_02)) || this.p.contains(ftj_02)) continue;
                this.p.add(ftj_02);
            }
        }
    }

    @Override
    public void reaffectRenderableContainer(ftj_0 ftj_02, int n) {
        boolean bl = false;
        if (this.r.contains(this.indexOf(ftj_02))) {
            this.removeSelectedAppearanceState(ftj_02);
            bl = true;
        }
        super.reaffectRenderableContainer(ftj_02, n);
        if (this.r.contains(n)) {
            this.setSelectedAppearanceState(ftj_02);
            this.p.add(ftj_02);
            bl = true;
        }
        if (bl) {
            this.a();
        }
    }

    public void setSelectionTogglable(boolean bl) {
        this.i = bl;
    }

    public boolean getSelectionTogglable() {
        return this.i;
    }

    public void setSelectionable(boolean bl) {
        this.j = bl;
    }

    public boolean getSelectionable() {
        return this.j;
    }

    public azj_2 getSelectedColor() {
        return this.o;
    }

    public void setSelectedColor(azj_2 azj_22) {
        if (Objects.equals(this.o, azj_22)) {
            return;
        }
        this.o = azj_22;
        if (this.o != null) {
            if (this.q.size() != this.p.size()) {
                if (this.m_entity != null) {
                    this.q.forEach(fbz_22 -> this.m_entity.b(fbz_22.c()));
                }
                this.q.forEach(fcf_1::h);
                this.q.clear();
                this.p.forEach(ftj_02 -> {
                    fbz_2 fbz_22 = new fbz_2();
                    fbz_22.i();
                    this.q.add(fbz_22);
                });
                this.setNeedsToResetMeshes();
            }
            this.q.forEach(fbz_22 -> fbz_22.a(this.o));
        } else {
            if (this.m_entity != null) {
                this.q.forEach(fbz_22 -> this.m_entity.b(fbz_22.c()));
            }
            this.q.forEach(fcf_1::h);
            this.q.clear();
            this.setNeedsToResetMeshes();
        }
    }

    public void setSelecteds(Collection<fiq_1> collection) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (fiq_1 fiq_12 : collection) {
            int n = this.m_items.indexOf(fiq_12);
            if (n == -1) {
                return;
            }
            arrayList.add(n);
        }
        this.setSelectedOffsets(arrayList);
    }

    public void a(int n) {
        if (this.r.contains(n)) {
            return;
        }
        ArrayList<Object> arrayList = this.getItems();
        if (!this.isValidOffset(arrayList, n)) {
            return;
        }
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>(this.r);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(this.r);
        linkedHashSet.add(n);
        Map<Integer, ftj_0> map = this.a(arrayList2, linkedHashSet);
        this.a(arrayList, arrayList2, arrayList2, map);
        this.a();
    }

    public void b(int n) {
        if (!this.r.contains(n)) {
            return;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>(this.r);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(this.r);
        linkedHashSet.remove(n);
        Map<Integer, ftj_0> map = this.a(arrayList, linkedHashSet);
        this.a(arrayList, linkedHashSet, map);
        this.a();
    }

    public Collection<Integer> getSelectedOffsets() {
        return this.r;
    }

    public void setSelectedOffsets(int n) {
        this.setSelectedOffsets(Collections.singletonList(n));
    }

    public void setSelectedOffsets(@Nullable Collection<Integer> collection) {
        if (collection == null) {
            collection = Collections.emptySet();
        }
        ArrayList<Object> arrayList = this.getItems();
        Object object = new ArrayList<Integer>(collection).iterator();
        while (object.hasNext()) {
            int n = object.next();
            if (this.isValidOffset(arrayList, n)) continue;
            collection.remove(n);
        }
        if (Objects.equals(collection, this.r)) {
            return;
        }
        object = new ArrayList<Integer>(this.r);
        Map<Integer, ftj_0> map = this.a((List<Integer>)object, collection);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        for (Integer n : collection) {
            if (!object.contains(n)) continue;
            linkedHashSet.add(n);
        }
        this.a(arrayList, (List<Integer>)object, linkedHashSet, map);
        this.a();
    }

    public boolean isValidOffset(int n) {
        return this.isValidOffset(this.getItems(), n);
    }

    protected boolean isValidOffset(@Nullable ArrayList<Object> arrayList, int n) {
        return arrayList != null && n < arrayList.size() && n >= 0;
    }

    protected Map<Integer, ftj_0> a(@NotNull Collection<Integer> collection) {
        return this.a(new ArrayList<Integer>(this.r), collection);
    }

    /*
     * WARNING - void declaration
     */
    protected Map<Integer, ftj_0> a(@NotNull List<Integer> list, @NotNull Collection<Integer> collection) {
        ArrayList<ftj_0> arrayList = new ArrayList<ftj_0>(this.p);
        HashMap<Integer, ftj_0> hashMap = new HashMap<Integer, ftj_0>();
        for (int k = 0; k < list.size(); ++k) {
            void comparable;
            if (k < arrayList.size()) {
                ftj_0 ftj_02 = (ftj_0)arrayList.get(k);
            } else {
                Object var6_9 = null;
            }
            hashMap.put(list.get(k), (ftj_0)comparable);
            this.removeSelectedAppearanceState((ftj_0)comparable);
        }
        this.r.clear();
        this.p.clear();
        for (Integer n : collection) {
            ftj_0 ftj_03 = this.getRenderableByOffset(n);
            this.r.add(n);
            if (ftj_03 == null) continue;
            this.p.add(ftj_03);
            this.setSelectedAppearanceState(ftj_03);
        }
        return hashMap;
    }

    protected void a(@NotNull List<Integer> list, @NotNull Collection<Integer> collection, @NotNull Map<Integer, ftj_0> map) {
        this.a(this.getItems(), list, collection, map);
    }

    protected void a(@Nullable ArrayList<Object> arrayList, @NotNull List<Integer> list, @NotNull Collection<Integer> collection, @NotNull Map<Integer, ftj_0> map) {
        Object object;
        if (arrayList != null && !list.isEmpty()) {
            object = list.iterator();
            while (object.hasNext()) {
                int n = (Integer)object.next();
                if (collection.contains(n)) continue;
                this.dispatchEvent(new fcf_2(this, map.get(n), arrayList.get(n), false));
            }
        }
        object = new ArrayList<Integer>(this.r);
        ArrayList<ftj_0> arrayList2 = new ArrayList<ftj_0>(this.p);
        if (arrayList != null && !object.isEmpty()) {
            for (int k = 0; k < object.size(); ++k) {
                Integer n = (Integer)object.get(k);
                if (collection.contains(n)) continue;
                ftj_0 ftj_02 = arrayList2.size() > k ? (ftj_0)arrayList2.get(k) : null;
                this.dispatchEvent(new fcf_2(this, ftj_02, arrayList.get(n), true));
            }
        }
    }

    public void setSelectedValues(Object object) {
        ftd_0.setIterableProperty(object, null, this::setSelectedValues);
    }

    public void setSelectedValues(Iterable<Object> iterable) {
        this.setSelectedValues(iterable, this.isUseSelectedValueCache());
    }

    private void setSelectedValues(Iterable<Object> iterable, boolean bl) {
        ArrayList<Object> arrayList;
        if (iterable == null) {
            iterable = Collections.emptyList();
        }
        if ((arrayList = this.getItems()) == null) {
            if (bl) {
                this.n = iterable;
            }
            return;
        }
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        int n = 0;
        for (Object object : iterable) {
            for (int k = 0; k < arrayList.size(); ++k) {
                Object object2 = arrayList.get(k);
                if (object2 == null || object2 != object && !object2.equals(object)) continue;
                linkedHashSet.add(k);
                break;
            }
            ++n;
        }
        if (bl && n > 0 && linkedHashSet.isEmpty()) {
            this.n = iterable;
        }
        this.setSelectedOffsets(linkedHashSet);
    }

    @Override
    public Collection<Object> getSelectedValues() {
        return this.getSelectedValues(this.getItems());
    }

    public Collection<Object> getSelectedValues(ArrayList<Object> arrayList) {
        if (this.r.isEmpty() || arrayList == null) {
            return Collections.emptyList();
        }
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<Object>();
        Iterator iterator = this.r.iterator();
        while (iterator.hasNext()) {
            int n = (Integer)iterator.next();
            linkedHashSet.add(arrayList.get(n));
        }
        return linkedHashSet;
    }

    @Override
    public Collection<ftj_0> getSelecteds() {
        return this.p;
    }

    protected void a() {
        if (this.p.size() == this.q.size()) {
            for (int k = 0; k < this.p.size(); ++k) {
                ftj_0 ftj_02 = this.p.get(k);
                fbz_2 fbz_22 = this.q.get(k);
                int n = Hw.a(ftj_02.getX(), 0, this.getWidth());
                int n2 = Hw.a(ftj_02.getY(), 0, this.getHeight());
                int n3 = Hw.a(ftj_02.getX() + ftj_02.getWidth(), 0, this.getWidth());
                int n4 = Hw.a(ftj_02.getY() + ftj_02.getHeight(), 0, this.getHeight());
                fbz_22.a(n, n2, n3 - n, n4 - n2, this.m_appearance.getTopInset(), this.m_appearance.getBottomInset(), this.m_appearance.getLeftInset(), this.m_appearance.getRightInset());
            }
        }
        this.setNeedsToResetMeshes();
    }

    private void a(@NotNull ftj_0 ftj_02, boolean bl) {
        int n = this.getOffsetByRenderable(ftj_02);
        if (n == -1) {
            return;
        }
        if (bl) {
            this.a(n);
        } else {
            this.b(n);
        }
    }

    @Override
    public ftj_0 createRenderableElement() {
        ftj_0 ftj_02 = super.createRenderableElement();
        ftj_02.addEventListener(frd_0.A, fzs2 -> {
            if (this.isEnabledFull() && this.isSelectEvent(fzs2)) {
                ftj_0 ftj_02 = (ftj_0)fzs2.d();
                this.setMousePressedAppearanceState(ftj_02, this.p.contains(ftj_02));
            }
            return false;
        }, false);
        ftj_02.addEventListener(frd_0.C, fzs2 -> {
            if (this.isEnabledFull() && this.isSelectEvent(fzs2)) {
                ftj_0 ftj_02 = (ftj_0)fzs2.d();
                boolean bl = this.i && this.p.contains(ftj_02) ? false : this.l || ftj_02.getItemValue() != null;
                this.a(ftj_02, bl);
                this.setMousePressedAppearanceState(ftj_02, this.p.contains(ftj_02));
            }
            return false;
        }, false);
        ftj_02.addEventListener(frd_0.B, fzs2 -> {
            if (this.isEnabledFull()) {
                ftj_0 ftj_02 = (ftj_0)fzs2.d();
                this.setMouseOverAppearanceState(ftj_02, this.p.contains(ftj_02));
            }
            return false;
        }, false);
        ftj_02.addEventListener(frd_0.y, fzs2 -> {
            if (this.isEnabledFull()) {
                ftj_0 ftj_02 = (ftj_0)fzs2.d();
                if (this.l || ftj_02.getItemValue() != null) {
                    this.removeMouseOverAppearanceState(this.m_mouseOverRenderable);
                    this.m_mouseOverRenderable = ftj_02;
                    this.setMouseOverAppearanceState(this.m_mouseOverRenderable, this.p.contains(ftj_02));
                    if (this.m_mouseOverMesh != null) {
                        this.m_mouseOverMesh.a(this.m_mouseOverRenderable.getPosition(), this.m_mouseOverRenderable.getSize(), this.m_appearance.getTotalInsets());
                        this.setNeedsToResetMeshes();
                    }
                }
            }
            return false;
        }, false);
        ftj_02.addEventListener(frd_0.z, fzs2 -> {
            if (this.isEnabledFull()) {
                this.removeMouseAppearanceState(this.m_mouseOverRenderable, this.p.contains(ftj_02));
                this.m_mouseOverRenderable = null;
                this.setNeedsToResetMeshes();
            }
            return false;
        }, false);
        return ftj_02;
    }

    public boolean isSelectEvent(fzs fzs2) {
        if (!this.j) {
            return false;
        }
        if (!this.k) {
            return true;
        }
        if (!(fzs2 instanceof fck_2)) {
            return false;
        }
        return ((fck_2)fzs2).x() == 1;
    }

    @Override
    public int addRenderableElement(ftj_0 ftj_02) {
        int n = super.addRenderableElement(ftj_02);
        this.refreshSelectedAppearance(ftj_02, this.r.contains(n));
        return n;
    }

    @Override
    public void setContent(@NotNull Iterable<Object> iterable, boolean bl) {
        if (this.m_isATemplate) {
            return;
        }
        Collection<Object> collection = this.getSelectedValues();
        super.setContent(iterable, bl);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        for (Object object : collection) {
            int n = this.getOffsetByValue(object);
            if (n == -1) {
                this.dispatchEvent(new fcf_2(this, null, object, false));
                continue;
            }
            linkedHashSet.add(n);
        }
        this.r.clear();
        this.r.addAll(linkedHashSet);
        if (this.isUseSelectedValueCache() && this.n != null) {
            this.setSelectedValues(this.n, false);
            this.n = null;
        }
    }

    @Override
    public void addValue(Object object) {
        super.addValue(object);
        this.a(this.m_items.size() - 1);
    }

    @Override
    public boolean addValue(int n, Object object) {
        boolean bl = super.addValue(n, object);
        if (bl) {
            this.a(n);
        }
        return bl;
    }

    @Override
    public int addValue(Object object, Object object2) {
        int n = super.addValue(object, object2);
        if (n != -1) {
            this.a(n);
        }
        return n;
    }

    @Override
    public void moveValueToIndex(Object object, int n, boolean bl) {
        super.moveValueToIndex(object, n, bl);
    }

    @Override
    public void removeValue(Object object) {
        int n = this.getOffsetByValue(object);
        this.b(n);
        super.removeValue(object);
    }

    @Override
    public boolean replaceValue(Object object, Object object2) {
        int n = this.getOffsetByValue(object);
        if (n == -1) {
            return false;
        }
        boolean bl = super.replaceValue(object, object2);
        if (bl) {
            this.a(n);
        }
        return bl;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.p.clear();
        if (!this.q.isEmpty()) {
            if (this.m_entity != null) {
                this.q.forEach(fbz_22 -> this.m_entity.b(fbz_22.c()));
            }
            this.q.forEach(fcf_1::h);
            this.q.clear();
        }
        this.n = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.r.clear();
        this.l = true;
        this.k = true;
        this.m = false;
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        if (fyo2 instanceof ftd_0) {
            ftd_0 ftd_02 = (ftd_0)fyo2;
            ftd_02.setSelectedColor(this.getSelectedColor());
            ftd_02.setSelectionTogglable(this.i);
            ftd_02.setSelectionable(this.j);
            ftd_02.l = this.l;
            ftd_02.setSelectOnlyOnLeftClick(this.k);
            ftd_02.setUseSelectedValueCache(this.m);
        } else if (fyo2 instanceof fsQ) {
            fsQ fsQ2 = (fsQ)fyo2;
            fsQ2.setSelectedColor(this.getSelectedColor());
            fsQ2.setSelectionTogglable(this.i);
            fsQ2.setSelectionable(this.j);
            fsQ2.setCanSelectNull(this.l);
            fsQ2.setSelectOnlyOnLeftClick(this.k);
            fsQ2.setUseSelectedValueCache(this.m);
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        switch (n) {
            case 1430566280: {
                this.setSelectedColor(fze2.a(string));
                return true;
            }
            case 1039818982: {
                this.setSelectionable(Co.a(string));
                return true;
            }
            case -2013533217: {
                this.setSelectionTogglable(Co.a(string));
                return true;
            }
            case 895182995: {
                this.setCanSelectNull(Co.a(string));
                return true;
            }
            case -1763504454: {
                this.setSelectOnlyOnLeftClick(Co.a(string));
                return true;
            }
            case -1395080333: {
                this.setUseSelectedValueCache(Co.a(string));
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fze2);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == c) {
            ftd_0.setIterableProperty(object, null, this::setSelecteds);
        } else if (n == d) {
            ftd_0.setIterableProperty(object, null, this::setSelectedValues);
        } else if (n == 1039818982) {
            this.setSelectionable(Co.b(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    public String getTag() {
        return TAG;
    }
}

