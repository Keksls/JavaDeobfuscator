/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bPB
 */
public class bpb_0
implements ajh_1 {
    public static final String a = "hasSomeBonuses";
    public static final String b = "applicationBonuses";
    public static final String d = "resistanceBonuses";
    private final acy_2<bpc_0> e = new acy_2();
    private final acy_2<bpc_0> f = new acy_2();

    @Override
    public String[] d() {
        return null;
    }

    public void a() {
        this.e.c();
        this.f.c();
        fis_1.a().a((ajf_1)this, a, b, d);
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.e.d() > 0 || this.f.d() > 0;
        }
        if (string.equals(b)) {
            return this.e;
        }
        if (string.equals(d)) {
            return this.f;
        }
        return null;
    }

    public void a(short s2, int n) {
        bpc_0 bpc_02 = this.e.g(s2);
        if (bpc_02 == null) {
            if (n != 0) {
                this.e.a(s2, new bpc_0(s2, n));
                fis_1.a().a((ajf_1)this, a, b);
            }
        } else if (n == 0) {
            this.e.f(s2);
            fis_1.a().a((ajf_1)this, a, b);
        } else {
            bpc_02.a(n);
        }
    }

    public void b(short s2, int n) {
        bpc_0 bpc_02 = this.f.g(s2);
        if (bpc_02 == null) {
            if (n != 0) {
                this.f.a(s2, new bpc_0(s2, n));
                fis_1.a().a((ajf_1)this, a, d);
            }
        } else if (n == 0) {
            this.f.f(s2);
            fis_1.a().a((ajf_1)this, a, d);
        } else {
            bpc_02.a(n);
        }
    }
}

