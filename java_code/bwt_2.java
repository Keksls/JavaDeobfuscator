/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bWt
 */
public class bwt_2
implements ajh_1 {
    public static final String a = "categories";
    public static final String b = "selectedCategory";
    public static final String d = "hasChallenges";
    private final bnh_0 e;
    private final acy_2<bws_2> f = new acy_2();
    private blr_2 g = null;

    public bwt_2(bnh_0 bnh_02) {
        this.e = bnh_02;
        for (blr_2 blr_22 : blr_2.values()) {
            this.f.a(blr_22.a(), new bws_2(blr_22));
        }
        this.a();
    }

    public void a(blr_2 blr_22) {
        this.g = blr_22;
        fis_1.a().a((ajf_1)this, b);
    }

    public void a() {
        Object object;
        Object object2;
        int n = this.f.d();
        for (int k = 0; k < n; ++k) {
            object2 = this.f.h(k);
            ((bws_2)object2).a();
        }
        for (bni_0 bni_02 : this.e) {
            if (bni_02.m() != -1L) continue;
            object2 = (bnf_0)bni_02.k();
            bll_2 bll_22 = blj_2.a.a(bni_02.d());
            blt_2 blt_22 = blc_2.a().c(bll_22.v());
            object = blt_22.h();
            bws_2 bws_22 = this.f.g(((blr_2)object).a());
            bws_22.a((bnf_0)object2);
        }
        bws_2 bws_23 = this.g != null ? this.f.g(this.g.a()) : null;
        object2 = this.g;
        this.g = null;
        if (bws_23 != null && bws_23.b()) {
            this.g = object2;
            fis_1.a().a((ajf_1)bws_23, "items");
        } else {
            int n2 = this.f.d();
            for (int k = 0; k < n2; ++k) {
                object = this.f.h(k);
                if (!((bws_2)object).b()) continue;
                this.g = ((bws_2)object).e();
                break;
            }
        }
        fis_1.a().a((ajf_1)this, a, b);
    }

    public void b() {
        for (bws_2 bws_22 : this.f) {
            bws_22.f();
        }
    }

    public void c() {
        int n = this.f.d();
        for (int k = 0; k < n; ++k) {
            this.f.h(k).c();
        }
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(b)) {
            return this.g != null ? this.f.g(this.g.a()) : null;
        }
        if (string.equals(a)) {
            return this.f;
        }
        if (string.equals(d)) {
            return this.e.b() != 0;
        }
        return null;
    }
}

