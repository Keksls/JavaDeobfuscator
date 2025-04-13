/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.xulor2.component.AbstractList;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class fsQ
extends AbstractList
implements fam_2 {
    public static final String TAG = "List";
    private boolean i = false;
    private boolean j = true;
    private boolean k = true;
    private boolean l = true;
    private boolean m = false;
    @Nullable
    private Object n = null;
    private ftj_0 o;
    private int p = -1;
    private fbz_2 q;
    public static final int a = 1430566280;
    public static final int b = 895182995;
    public static final int c = "selected".hashCode();
    public static final int d = "selectedValue".hashCode();
    public static final int e = 1039818982;
    public static final int f = -2013533217;
    public static final int g = -1763504454;
    public static final int h = -1395080333;

    public fsQ() {
    }

    public fsQ(boolean bl) {
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
        if (this.q != null && this.o != null) {
            this.m_entity.a(this.q.c());
        }
        super.addInnerMeshes();
    }

    @Override
    public void effectiveUpdateValues(int n, int n2) {
        this.o = null;
        super.effectiveUpdateValues(n, n2);
        if (this.o == null && this.p != -1) {
            for (ftj_0 ftj_02 : this.m_renderables) {
                if (this.indexOf(ftj_02) != this.p) continue;
                this.o = ftj_02;
                break;
            }
        }
    }

    @Override
    public void reaffectRenderableContainer(ftj_0 ftj_02, int n) {
        boolean bl = false;
        if (this.p == this.indexOf(ftj_02)) {
            this.removeSelectedAppearanceState(ftj_02);
            bl = true;
        }
        super.reaffectRenderableContainer(ftj_02, n);
        if (this.p == n) {
            this.setSelectedAppearanceState(ftj_02);
            this.o = ftj_02;
            bl = true;
        }
        if (bl) {
            this.b();
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
        if (this.q == null) {
            return null;
        }
        return this.q.a();
    }

    public void setSelectedColor(azj_2 azj_22) {
        if (azj_22 != null) {
            if (this.q == null) {
                this.q = new fbz_2();
                this.q.i();
                this.setNeedsToResetMeshes();
            }
            this.q.a(azj_22);
        } else {
            if (this.q != null) {
                if (this.m_entity != null) {
                    this.m_entity.b(this.q.c());
                }
                this.q.h();
            }
            this.q = null;
            this.setNeedsToResetMeshes();
        }
    }

    public void setSelected(fiq_1 fiq_12) {
        this.setSelectedOffset(this.m_items.indexOf(fiq_12));
    }

    public int getSelectedOffset() {
        return this.p;
    }

    public void setSelectedOffset(int n) {
        this.setSelectedOffset(n, true);
    }

    public void setSelectedOffset(int n, boolean bl) {
        if (n == this.p && this.getRenderableByOffset(n) == this.o) {
            return;
        }
        ArrayList<Object> arrayList = this.getItems();
        if (arrayList.size() <= n || n < -1) {
            return;
        }
        int n2 = this.p;
        this.p = n;
        ftj_0 ftj_02 = this.o;
        this.removeSelectedAppearanceState(ftj_02);
        this.o = this.getRenderableByOffset(n);
        this.setSelectedAppearanceState(this.o);
        if (bl && this.m_items != null && n2 != -1) {
            this.dispatchEvent(new fcf_2(this, ftj_02, arrayList.get(n2), false));
        }
        if (bl) {
            this.a();
        }
        this.b();
    }

    void a() {
        if (this.p == -1) {
            return;
        }
        ArrayList<Object> arrayList = this.getItems();
        if (arrayList == null) {
            return;
        }
        this.dispatchEvent(new fcf_2(this, this.o, arrayList.get(this.p), true));
    }

    public void setSelectedValue(Object object) {
        this.setSelectedValue(object, this.isUseSelectedValueCache());
    }

    private void setSelectedValue(Object object, boolean bl) {
        ArrayList<Object> arrayList = this.getItems();
        if (arrayList == null) {
            if (bl) {
                this.n = object;
            }
            return;
        }
        int n = -1;
        for (int k = 0; k < arrayList.size(); ++k) {
            Object object2 = arrayList.get(k);
            if (object2 == null || object2 != object && !object2.equals(object)) continue;
            n = k;
            break;
        }
        if (bl && object != null && n == -1) {
            this.n = object;
        }
        this.setSelectedOffset(n);
    }

    @Override
    public Object getSelectedValue() {
        return this.getSelectedValue(this.getItems());
    }

    public Object getSelectedValue(ArrayList<Object> arrayList) {
        if (this.p < 0 || arrayList == null || this.p >= arrayList.size()) {
            return null;
        }
        return arrayList.get(this.p);
    }

    @Override
    public ftj_0 getSelected() {
        return this.o;
    }

    protected void b() {
        if (this.o != null && this.q != null) {
            int n = Hw.a(this.o.getX(), 0, this.getWidth());
            int n2 = Hw.a(this.o.getY(), 0, this.getHeight());
            int n3 = Hw.a(this.o.getX() + this.o.getWidth(), 0, this.getWidth());
            int n4 = Hw.a(this.o.getY() + this.o.getHeight(), 0, this.getHeight());
            this.q.a(n, n2, n3 - n, n4 - n2, this.m_appearance.getTopInset(), this.m_appearance.getBottomInset(), this.m_appearance.getLeftInset(), this.m_appearance.getRightInset());
        }
        this.setNeedsToResetMeshes();
    }

    private void a(ftj_0 ftj_02) {
        if (ftj_02 == this.o) {
            return;
        }
        if (ftj_02 != null) {
            this.setSelectedOffset(this.getOffsetByRenderable(ftj_02));
        } else {
            this.p = -1;
        }
    }

    @Override
    public ftj_0 createRenderableElement() {
        ftj_0 ftj_02 = super.createRenderableElement();
        ftj_02.addEventListener(frd_0.A, fzs2 -> {
            if (this.isEnabledFull() && this.isSelectEvent(fzs2)) {
                ftj_0 ftj_02;
                this.setMousePressedAppearanceState(ftj_02, this.o == (ftj_02 = (ftj_0)fzs2.d()));
            }
            return false;
        }, false);
        ftj_02.addEventListener(frd_0.C, fzs2 -> {
            if (this.isEnabledFull() && this.isSelectEvent(fzs2)) {
                ftj_0 ftj_02 = (ftj_0)fzs2.d();
                this.removeSelectedAppearanceState(this.o);
                ftj_0 ftj_03 = this.i && this.o == fzs2.d() ? null : (this.l || ftj_02.getItemValue() != null ? ftj_02 : null);
                this.a(ftj_03);
                this.setMousePressedAppearanceState(ftj_02, this.o == ftj_02);
            }
            return false;
        }, false);
        ftj_02.addEventListener(frd_0.B, fzs2 -> {
            if (this.isEnabledFull()) {
                ftj_0 ftj_02;
                this.setMouseOverAppearanceState(ftj_02, this.o == (ftj_02 = (ftj_0)fzs2.d()));
            }
            return false;
        }, false);
        ftj_02.addEventListener(frd_0.y, fzs2 -> {
            if (this.isEnabledFull()) {
                ftj_0 ftj_02 = (ftj_0)fzs2.d();
                if (this.l || ftj_02.getItemValue() != null) {
                    this.removeMouseOverAppearanceState(this.m_mouseOverRenderable);
                    this.m_mouseOverRenderable = ftj_02;
                    this.setMouseOverAppearanceState(this.m_mouseOverRenderable, this.o == ftj_02);
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
                this.removeMouseAppearanceState(this.m_mouseOverRenderable, this.o == ftj_02);
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
        this.refreshSelectedAppearance(ftj_02, this.p == n);
        return n;
    }

    @Override
    public void setContent(@NotNull Iterable<Object> iterable, boolean bl) {
        if (this.m_isATemplate) {
            return;
        }
        int n = this.p;
        Object object = this.getSelectedValue();
        super.setContent(iterable, bl);
        this.p = this.getOffsetByValue(object);
        if (this.p == -1 && n != -1) {
            this.dispatchEvent(new fcf_2(this, null, object, false));
            this.dispatchEvent(new fcf_2(this, null, null, true));
        }
        if (this.isUseSelectedValueCache() && this.n != null) {
            this.setSelectedValue(this.n, false);
            this.n = null;
        }
    }

    @Override
    public void addValue(Object object) {
        super.addValue(object);
        this.setSelectedOffset(this.m_items.size() - 1);
    }

    @Override
    public boolean addValue(int n, Object object) {
        boolean bl = super.addValue(n, object);
        if (bl) {
            this.setSelectedOffset(n);
        }
        return bl;
    }

    @Override
    public int addValue(Object object, Object object2) {
        int n = super.addValue(object, object2);
        if (n != -1) {
            this.setSelectedOffset(n);
        }
        return n;
    }

    @Override
    public void moveValueToIndex(Object object, int n, boolean bl) {
        super.moveValueToIndex(object, n, bl);
        this.p = n;
        this.b();
    }

    @Override
    public void removeValue(Object object) {
        int n = this.getOffsetByValue(object);
        if (this.p == n) {
            this.setSelectedOffset(-1);
        }
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
            this.setSelectedOffset(n);
        }
        return bl;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.o = null;
        if (this.q != null) {
            if (this.m_entity != null) {
                this.m_entity.b(this.q.c());
            }
            this.q.h();
            this.q = null;
        }
        this.n = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.p = -1;
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
            ftd_02.setCanSelectNull(this.l);
            ftd_02.setSelectOnlyOnLeftClick(this.k);
            ftd_02.setUseSelectedValueCache(this.m);
        } else if (fyo2 instanceof fsQ) {
            fsQ fsQ2 = (fsQ)fyo2;
            fsQ2.setSelectedColor(this.getSelectedColor());
            fsQ2.setSelectionTogglable(this.i);
            fsQ2.setSelectionable(this.j);
            fsQ2.l = this.l;
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
            this.setSelected((fiq_1)object);
        } else if (n == d) {
            this.setSelectedValue(object);
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

