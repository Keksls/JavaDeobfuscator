/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fAg
 */
public class fag_2 {
    private ArrayList<faf_2> a;
    private faf_2 b = null;
    private static final faf_2 c = new fae_1();
    private final ArrayList<ftj_0> d = new ArrayList();

    public fag_2(ArrayList<faf_2> arrayList) {
        this.a(arrayList);
    }

    public fag_2() {
    }

    public void a(ftj_0 ftj_02) {
        this.d.add(ftj_02);
    }

    public void b(ftj_0 ftj_02) {
        this.d.remove(ftj_02);
    }

    public void a() {
        this.d.clear();
    }

    public void b() {
        for (int k = this.d.size() - 1; k >= 0; --k) {
            this.d.get(k).c();
        }
    }

    protected void c() {
        this.b = null;
        if (this.a == null || this.a.size() == 0) {
            return;
        }
        if (this.b == null) {
            this.b = this.a.get(0);
        }
    }

    public boolean c(ftj_0 ftj_02) {
        if (this.b == null || ftj_02 == null) {
            return false;
        }
        faf_2 faf_22 = null;
        for (faf_2 faf_23 : this.a) {
            if (!faf_23.isRenderableCompatible(ftj_02)) continue;
            faf_22 = faf_23;
            break;
        }
        if (faf_22 == null) {
            faf_22 = c.isRenderableCompatible(ftj_02) ? c : this.b;
        }
        if (ftj_02.getRenderer() != faf_22) {
            ftj_02.setRenderer(faf_22);
            return true;
        }
        return false;
    }

    public ArrayList<faf_2> d() {
        return this.a;
    }

    public void a(ArrayList<faf_2> arrayList) {
        this.a = arrayList;
        if (this.a != null) {
            for (int k = this.a.size() - 1; k >= 0; --k) {
                this.a.get(k).setManager(this);
            }
        }
        this.c();
    }

    public void a(faf_2 faf_22) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.add(faf_22);
        faf_22.setManager(this);
        this.c();
    }

    public ArrayList<ftj_0> e() {
        return this.d;
    }
}

