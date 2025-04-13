/*
 * Decompiled with CFR 0.152.
 */
import java.awt.geom.Line2D;
import java.util.ArrayList;

public class fuS
extends fso
implements faa_1 {
    public static final String TAG = "tournament";
    ArrayList<fxU> e;
    private ArrayList<Line2D> f = new ArrayList();
    ArrayList<ftj_0> g = new ArrayList();
    private fag_2 h = new fag_2();
    int i = -1;
    int j = 5;
    int k = 10;
    int l;
    int m;
    fjf_2 n;
    private String o = null;
    private fyy_0 p = null;
    private boolean q = true;
    public static final int a = -917611389;
    public static final int b = "content".hashCode();
    public static final int c = 3200366;
    public static final int d = 3617440;

    @Override
    public void add(fyb_0 fyb_02) {
        super.add(fyb_02);
        if (fyb_02 instanceof faf_2) {
            this.h.a((faf_2)fyb_02);
        }
    }

    @Override
    protected void addInnerMeshes() {
        super.addInnerMeshes();
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public void setCellSize(fjf_2 fjf_22) {
        this.n = fjf_22;
        this.q = true;
        this.setNeedsToPreProcess();
    }

    public fjf_2 getCellSize() {
        return this.n;
    }

    public int getVgap() {
        return this.j;
    }

    public void setVgap(int n) {
        this.j = n;
        this.q = true;
        this.setNeedsToPreProcess();
    }

    public int getHgap() {
        return this.k;
    }

    public void setHgap(int n) {
        this.k = n;
        this.q = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public void setContentProperty(String string, fyy_0 fyy_02) {
        this.o = string;
        this.p = fyy_02;
    }

    public void setContent(fxT fxT2) {
        int n = 0;
        this.e = (ArrayList)fxT2.a().clone();
        this.l = fxT2.b();
        this.m = fxT2.c();
        this.f = fxT2.d() != null ? (ArrayList)fxT2.d().clone() : this.f;
        n = this.e.size();
        int n2 = this.g.size();
        if (n2 < n) {
            for (int k = n2; k < n; ++k) {
                ftj_0 ftj_02 = new ftj_0();
                ftj_02.onCheckOut();
                ftj_02.setNonBlocking(this.m_nonBlocking);
                ftj_02.setRendererManager(this.h);
                ftj_02.addEventListener(frd_0.y, new fuT(this), false);
                ftj_02.addEventListener(frd_0.z, new fuU(this), false);
                this.g.add(ftj_02);
                this.add(ftj_02);
            }
        } else if (n2 > n) {
            for (int k = n; k < n2; ++k) {
                ftj_0 ftj_03 = this.g.remove(this.g.size() - 1);
                ftj_03.destroySelfFromParent();
            }
            if (this.i >= this.g.size()) {
                this.i = -1;
            }
        }
        this.a();
    }

    public void a() {
        for (int k = 0; k < this.e.size(); ++k) {
            ftj_0 ftj_02 = this.g.get(k);
            fxU fxU2 = this.e.get(k);
            ftj_02.setContentProperty(this.o + "#" + k, this.p);
            ftj_02.setContent(fxU2.a());
        }
    }

    @Override
    public void validate() {
        super.validate();
        this.b();
    }

    private void b() {
        ArrayList<Line2D.Float> arrayList = new ArrayList<Line2D.Float>();
        int n = this.n.width + this.k;
        int n2 = this.n.height + this.j;
        for (Line2D line2D : this.f) {
            float f2 = (float)line2D.getX1();
            float f3 = (float)line2D.getY1();
            float f4 = (float)line2D.getX2();
            float f5 = (float)line2D.getY2();
            float f6 = (float)n * f2 + (float)this.n.width;
            float f7 = (float)n * (f2 + 1.0f) - (float)(this.k / 2);
            float f8 = (float)this.l - f3 - 1.0f;
            float f9 = (float)n2 * f8 + (float)(this.n.height / 2);
            f8 = (float)this.l - f5 - 1.0f;
            float f10 = (float)n2 * f8 + (float)(this.n.height / 2);
            float f11 = (float)n * f4;
            arrayList.add(new Line2D.Float(f6, f9, f7, f9));
            arrayList.add(new Line2D.Float(f7, f9, f7, f10));
            arrayList.add(new Line2D.Float(f7, f10, f11, f10));
        }
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.q) {
            this.invalidateMinSize();
        }
        this.q = false;
        return bl;
    }

    private void c() {
        ArrayList<fxU> arrayList = new ArrayList<fxU>();
        ArrayList<Line2D> arrayList2 = new ArrayList<Line2D>();
        fxU fxU2 = new fxU("Arone", 1.0f, 0.0f);
        arrayList.add(fxU2);
        fxU2 = new fxU("?", 1.0f, 7.0f);
        arrayList.add(fxU2);
        fxU2 = new fxU("Khalim", 1.0f, 1.0f);
        arrayList.add(fxU2);
        arrayList2.add(new Line2D.Float(1.0f, 0.0f, 2.0f, 0.5f));
        arrayList2.add(new Line2D.Float(1.0f, 1.0f, 2.0f, 0.5f));
        fxU2 = new fxU("Tessaran", 1.0f, 2.0f);
        arrayList.add(fxU2);
        fxU2 = new fxU("Noreen", 1.0f, 3.0f);
        arrayList.add(fxU2);
        arrayList2.add(new Line2D.Float(1.0f, 2.0f, 2.0f, 2.5f));
        arrayList2.add(new Line2D.Float(1.0f, 3.0f, 2.0f, 2.5f));
        fxU2 = new fxU("Arone", 2.0f, 0.5f);
        arrayList.add(fxU2);
        arrayList2.add(new Line2D.Float(2.0f, 0.5f, 3.0f, 1.5f));
        fxU2 = new fxU("Noreen", 2.0f, 2.5f);
        arrayList.add(fxU2);
        fxU2 = new fxU("Khalim", 0.0f, 4.0f);
        arrayList.add(fxU2);
        fxU2 = new fxU("Tessaran", 0.0f, 5.0f);
        arrayList.add(fxU2);
        fxU2 = new fxU("Khalim", 2.0f, 4.5f);
        arrayList.add(fxU2);
        fxU2 = new fxU("Noreen", 2.0f, 5.5f);
        arrayList.add(fxU2);
        fxU2 = new fxU("Khalim", 3.0f, 5.0f);
        arrayList.add(fxU2);
        fxU2 = new fxU("Arone", 3.0f, 1.5f);
        arrayList.add(fxU2);
        fxU2 = new fxU("?", 4.0f, 3.25f);
        arrayList.add(fxU2);
        fxT fxT2 = new fxT(arrayList, arrayList2, 8, 5);
        this.setContent(fxT2);
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fuv_0 fuv_02 = new fuv_0(this);
        fuv_02.onCheckOut();
        this.add(fuv_02);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.e.clear();
        this.e = null;
        this.g.clear();
        this.g = null;
        this.f.clear();
        this.f = null;
        this.n = null;
        this.h = null;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == -917611389) {
            this.setCellSize(fze2.b(string));
        } else if (n == 3200366) {
            this.setHgap(Co.c(string));
        } else if (n == 3617440) {
            this.setVgap(Co.c(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != b) {
            return super.setPropertyAttribute(n, object);
        }
        this.setContent((fxT)object);
        return true;
    }
}

