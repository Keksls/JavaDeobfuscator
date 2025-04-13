/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.xulor2.component.AbstractList;
import java.util.ArrayList;

/*
 * Renamed from ftJ
 */
public class ftj_0
extends fso
implements faa_1 {
    public static final String TAG = "renderableContainer";
    private fyb_0[] c;
    private ArrayList<fir_1> d;
    private final ArrayList<fyb_0> e = new ArrayList();
    private fiq_1 f = null;
    private faf_2 g = null;
    private fag_2 h = new fag_2();
    private fab_1 i = null;
    private fyy_0 j = null;
    private fsv_0 k;
    private boolean l = true;
    private boolean m = false;
    private fzo n = null;
    private fzu o = null;
    private String p = null;
    private fyy_0 q = null;
    private boolean r = false;
    public static final int a = "content".hashCode();
    public static final int b = -631680873;

    public ftj_0() {
        this(null);
    }

    public ftj_0(fab_1 fab_12) {
        this.i = fab_12;
        this.setNonBlocking(false);
    }

    @Override
    public void add(fyb_0 fyb_02) {
        super.add(fyb_02);
        if (fyb_02 instanceof faf_2) {
            this.h.a((faf_2)fyb_02);
        }
    }

    private void i() {
        if (this.n != null) {
            fzn.a().a(this.n, true);
        }
        this.n = new fzo(this);
        fzn.a().a(this.n);
    }

    public void a(fyb_0 fyb_02) {
        this.e.add(fyb_02);
        this.add(fyb_02);
    }

    @Override
    public void addEventListener(frd_0 frd_02, fzu fzu2, boolean bl) {
        super.addEventListener(frd_02, fzu2, bl);
        if (frd_02 == frd_0.k && this.o == null) {
            this.o = new ftK(this);
            super.addEventListener(frd_0.D, this.o, false);
        }
    }

    @Override
    public void removeEventListener(frd_0 frd_02, fzu fzu2, boolean bl) {
        super.removeEventListener(frd_02, fzu2, bl);
        if (frd_02 == frd_0.k && this.hasListener(frd_02)) {
            this.removeEventListener(frd_0.D, this.o, false);
            this.o = null;
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public void setRenderableChildren(fyb_0[] fyb_0Array) {
        this.c = fyb_0Array;
    }

    public void setItemElements(ArrayList<fir_1> arrayList) {
        this.d = arrayList;
    }

    public void setRenderer(faf_2 faf_22) {
        if (faf_22 != this.g) {
            if (this.g != null) {
                this.g.c(this);
            }
            this.g = faf_22;
            for (int k = this.e.size() - 1; k >= 0; --k) {
                this.destroy(this.e.get(k));
            }
            this.e.clear();
        }
    }

    public boolean getEnableDND() {
        return this.l;
    }

    public void setEnableDND(boolean bl) {
        this.l = bl;
    }

    public boolean a() {
        return this.l && this.k.isEnabledFull();
    }

    public fag_2 getRendererManager() {
        return this.h;
    }

    public void setRendererManager(fag_2 fag_22) {
        if (fag_22 != null && this.h != fag_22) {
            if (this.h != null) {
                this.h.b(this);
            }
            this.h = fag_22;
            this.h.a(this);
        }
    }

    @Override
    public void setContentProperty(String string, fyy_0 fyy_02) {
        this.p = string;
        this.q = fyy_02;
    }

    public String getContentProperty() {
        return this.p;
    }

    public void a(fck_2 fck_22) {
        Object object = this.f == null ? null : this.f.a();
        fcb_2 fcb_22 = fcb_2.a(fck_22, this, frd_0.m, object);
        this.dispatchEvent(fcb_22);
        fck_22.b(fcb_22.g());
    }

    public void b(fck_2 fck_22) {
        Object object = this.f == null ? null : this.f.a();
        fcb_2 fcb_22 = fcb_2.a(fck_22, this, frd_0.l, object);
        this.dispatchEvent(fcb_22);
        fck_22.b(fcb_22.g());
    }

    public void c(fck_2 fck_22) {
        Object object = this.f == null ? null : this.f.a();
        fcb_2 fcb_22 = fcb_2.a(fck_22, this, frd_0.j, object);
        this.dispatchEvent(fcb_22);
        fck_22.b(fcb_22.g());
    }

    public void d(fck_2 fck_22) {
        Object object = this.f == null ? null : this.f.a();
        fcb_2 fcb_22 = fcb_2.a(fck_22, this, frd_0.k, object);
        this.dispatchEvent(fcb_22);
        fck_22.b(fcb_22.g());
    }

    public void b() {
        if (this.g != null && this.c != null && this.c.length != 0) {
            this.g.a(this.c, this.f);
        }
        this.m = false;
    }

    public fab_1 getCollection() {
        return this.i;
    }

    public void setCollection(fab_1 fab_12) {
        this.i = fab_12;
    }

    public void setInnerElementMap(fyy_0 fyy_02) {
        this.j = fyy_02;
    }

    public fyy_0 getInnerElementMap() {
        return this.j;
    }

    public void setContent(Object object) {
        if (this.m_isATemplate) {
            return;
        }
        if (this.f == null || this.f.a() != object) {
            this.setItemValue(object);
        }
        this.m = true;
    }

    public void setItem(fiq_1 fiq_12) {
        this.setItem(fiq_12, false);
    }

    public void setItem(fiq_1 fiq_12, boolean bl) {
        if (this.f != fiq_12) {
            this.a(this.f);
            fiq_1.a(this.f);
            this.f = fiq_12;
            this.j();
            this.a(true);
        }
    }

    public void c() {
        this.a(true);
    }

    public void a(boolean bl) {
        fit_1 fit_12;
        if (this.h == null) {
            return;
        }
        if (this.h.c(this)) {
            this.d();
            bl = true;
        }
        this.j();
        if (this.d != null && this.f != null && this.f.b() != null && (fit_12 = this.f.b()).f() instanceof ajf_1) {
            int n = this.d.size();
            for (int k = 0; k < n; ++k) {
                fir_1 fir_12 = this.d.get(k);
                fyb_0 fyb_02 = fir_12.getParent() != null ? fir_12.getParent() : fir_12;
                if (fir_12.getField() != null && fir_12.getField().contains("/")) {
                    abo_2<Object, String> abo_22 = fit_1.b(fit_12.f(), fir_12.getField());
                    String string = abo_22.b() == null ? fir_12.getField() : fir_12.getField().substring(0, fir_12.getField().length() - abo_22.b().length() - 1);
                    String string2 = fit_12.a() + "/" + string;
                    fit_1 fit_13 = fis_1.a().e(string2, this.q);
                    if (fit_13 == null) {
                        fit_13 = new fit_1(string2, fit_12, string, this.q);
                        fit_13.a(abo_22.a(), false);
                        fis_1.a().a(fit_13);
                    }
                    fit_13.a(new fix_1<fyo>(fyb_02, fay_2.c().b(fyb_02.getTag()), fir_12.getAttribute(), abo_22.b(), fir_12.getResultProvider()));
                    continue;
                }
                fit_12.a(new fix_1<fyo>(fyb_02, fay_2.c().b(fyb_02.getTag()), fir_12.getAttribute(), fir_12.getField(), fir_12.getResultProvider()));
            }
        }
        if (bl) {
            this.m = true;
        }
    }

    public fab_1 getRenderableCollection() {
        return this.i;
    }

    public void setItemValue(Object object) {
        fiq_1 fiq_12 = fiq_1.a(object, this.p, this.q, this);
        this.setItem(fiq_12);
    }

    public Object getItemValue() {
        if (this.f != null) {
            return this.f.a();
        }
        return null;
    }

    public int getItemValueIndex() {
        if (this.m_parent instanceof AbstractList) {
            return ((AbstractList)this.m_parent).indexOf(this);
        }
        return -1;
    }

    public fiq_1 getItem() {
        return this.f;
    }

    public faf_2 getRenderer() {
        return this.g;
    }

    public void d() {
        if (this.m_widgetChildren != null && this.m_widgetChildren.size() == 0 && this.g != null) {
            this.g.a(this);
            fyP.a().d();
        }
    }

    public fsv_0 getDragNDropable() {
        return this.k;
    }

    public void setDragNDropable(fsv_0 fsv_02) {
        if (this.k == null) {
            this.i();
        }
        this.k = fsv_02;
    }

    public void e() {
        this.addEventListener(frd_0.y, new ftL(this), false);
        this.addEventListener(frd_0.z, new ftm_0(this), false);
        this.addEventListener(frd_0.C, new ftN(this), false);
    }

    public void f() {
        this.a(this.f);
    }

    private void a(fiq_1 fiq_12) {
        fit_1 fit_12;
        if (fiq_12 != null && fiq_12.b() != null && this.d != null && (fit_12 = fiq_12.b()).f() instanceof ajf_1) {
            for (fir_1 fir_12 : this.d) {
                fyb_0 fyb_02 = fir_12.getParent() != null ? fir_12.getParent() : fir_12;
                if (fir_12.getField() != null && fir_12.getField().contains("/")) {
                    abo_2<Object, String> abo_22 = fit_1.b(fit_12.f(), fir_12.getField());
                    String string = abo_22.b();
                    int n = string != null ? string.length() : 0;
                    String string2 = fir_12.getField().substring(0, fir_12.getField().length() - n - 1);
                    String string3 = fit_12.a() + "/" + string2;
                    fit_1 fit_13 = fis_1.a().e(string3, this.q);
                    if (fit_13 == null) continue;
                    fit_13.a(fyb_02);
                    continue;
                }
                fit_12.a(fyb_02);
            }
        }
    }

    public void g() {
        this.m = true;
    }

    public boolean h() {
        boolean bl = false;
        if (this.g == null) {
            this.a(true);
            bl = true;
        }
        if (this.m) {
            this.b();
            bl = true;
        }
        return bl;
    }

    public void setHideWithoutItem(boolean bl) {
        this.r = bl;
        this.j();
    }

    public boolean isHideWithoutItem() {
        return this.r;
    }

    private void j() {
        if (this.r) {
            super.setVisible(this.f != null && this.f.b() != null);
        }
    }

    @Override
    public void setVisible(boolean bl) {
        if (this.r) {
            return;
        }
        super.setVisible(bl);
    }

    @Override
    public void copyElement(fyo fyo2) {
        ftj_0 ftj_02 = (ftj_0)fyo2;
        super.copyElement(fyo2);
        ftj_02.l = this.l;
        for (int k = ftj_02.m_widgetChildren.size() - 1; k >= 0; --k) {
            ((fvE)ftj_02.m_widgetChildren.get(k)).destroySelfFromParent();
        }
        if (this.o != null) {
            ftj_02.o = new ftO(this, ftj_02);
        }
        ftj_02.r = this.r;
        ftj_02.j();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        if (this.n != null) {
            try {
                fzn.a().a(this.n, true);
            }
            catch (Exception exception) {
                m_logger.error((Object)"", (Throwable)exception);
            }
        }
        this.n = null;
        fyi_0.a().b(this);
        this.e.clear();
        this.i = null;
        this.k = null;
        this.c = null;
        if (this.f != null) {
            this.a(this.f);
            fiq_1.a(this.f);
            this.f = null;
        }
        if (this.d != null) {
            this.d.clear();
            this.d = null;
        }
        this.p = null;
        this.q = null;
        this.j = null;
        this.g = null;
        if (this.h != null) {
            this.h.b(this);
            this.h = null;
        }
    }

    @Override
    public void onCheckOut() {
        fyi_0.a().a(this);
        super.onCheckOut();
        this.e();
        this.l = true;
        this.m_nonBlocking = false;
        this.r = false;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n != -631680873) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setEnableDND(Co.a(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == a) {
            this.setContent(object);
        } else if (n == -631680873) {
            this.setEnableDND(Co.b(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

