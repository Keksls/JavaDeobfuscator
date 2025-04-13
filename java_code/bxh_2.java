/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bxH
 */
public class bxh_2
implements ajh_1 {
    private static final bxh_2 f = new bxh_2();
    public static final String a = "giftPackages";
    public static final String b = "numPackages";
    public static final String d = "selectedPackage";
    public static final String[] e = new String[]{"giftPackages", "numPackages", "selectedPackage"};
    private final ArrayList<bxc_2> g = new ArrayList();
    private final ArrayList<bxi_2> h = new ArrayList();
    private bxi_2 i = null;

    private bxh_2() {
    }

    public static bxh_2 a() {
        return f;
    }

    public void a(bxg_2 bxg_22, boolean bl) {
        this.g.add(new bxc_2(this.i, bxg_22, bl));
    }

    public void a(boolean bl) {
        if (this.g.size() == 0) {
            return;
        }
        bxc_2 bxc_22 = this.g.remove(0);
        if (!bl) {
            return;
        }
        bxi_2 bxi_22 = bxc_22.a();
        int n = this.h.indexOf(bxi_22);
        if (n == -1) {
            return;
        }
        if (bxi_22.a(bxc_22.b(), bxc_22.c())) {
            this.h.remove(bxi_22);
            if (this.i == bxi_22) {
                this.i = this.h.size() > 0 ? this.h.get(0) : null;
            }
        }
        fis_1.a().a((ajf_1)this, a, b, d);
    }

    @Override
    public String[] d() {
        return e;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.h;
        }
        if (string.equals(d)) {
            return this.i;
        }
        if (string.equals(b)) {
            return this.h.size();
        }
        return null;
    }

    public void a(ArrayList<bxi_2> arrayList) {
        this.e();
        this.h.addAll(arrayList);
        this.f();
        if (this.h.size() > 0) {
            this.a(this.h.get(0));
        } else {
            this.a((bxi_2)null);
        }
    }

    private void f() {
        fis_1.a().a((ajf_1)this, a);
    }

    public bxi_2 b() {
        return this.i;
    }

    public void a(bxi_2 bxi_22) {
        this.i = bxi_22;
        fis_1.a().a((ajf_1)this, d);
    }

    public boolean c() {
        return this.h.isEmpty();
    }

    public void e() {
        this.h.clear();
        this.g.clear();
        this.i = null;
    }
}

