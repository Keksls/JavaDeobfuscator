/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class cYH
implements ahr_1 {
    private static final Logger b = Logger.getLogger(cYH.class);
    private static final boolean c = false;
    private static final cYH d = new cYH();
    private cYK e = cYK.c;
    private blx_1 f;
    private ahh_0 g;
    private final den h = den.a;

    public static cYH a() {
        return d;
    }

    private cYH() {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        this.e();
        abY abY2 = ans_0.D().c().b();
        this.g = abY2.u();
        abY2.a(true);
        this.a(cYK.a);
        this.h.a(this.a(abY2));
        this.h.a(new cYI(this));
    }

    private ahv_0 a(abY abY2) {
        bvx_2 bvx_22 = cyp_0.g().n();
        bmr_1 bmr_12 = azu_0.j().k();
        if (bvx_22 == null || bvx_22.g() == null) {
            if (bmr_12 == null) {
                return null;
            }
            return new ahx_0(bmr_12.bv(), abY2);
        }
        return new ahw_0(bvx_22.g(), abY2);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        this.e();
        cYH.d();
        this.h.c();
    }

    private void e() {
        this.f = null;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (!this.h.a(adt_12)) {
            return false;
        }
        cYT.a().c();
        return true;
    }

    void a(cYK cYK2) {
        assert (cYK2 != null);
        if (this.e != cYK2) {
            this.e = cYK2;
            this.h();
        }
    }

    void f() {
        this.a(cYK.b);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    private ahu_0 g() {
        bmr_1 bmr_12 = azu_0.j().k();
        bvx_2 bvx_22 = bmr_12.cP();
        ahu_0 ahu_02 = new ahu_0(bmr_12.bv(), bvx_22 == null ? null : bvx_22.g());
        if (bvx_22 == null) {
            ahu_02.a(bmr_12.bv(), 1);
            return ahu_02;
        }
        int n = bvx_22.j().size();
        for (blx_1 blx_12 : bmr_12.cP().j()) {
            int n2;
            if (blx_12.bV()) continue;
            int n3 = n2 = blx_12 instanceof bmv_1 ? 10 : 12;
            if (this.f != null && blx_12 == this.f) {
                ahu_02.a(blx_12.bv(), Math.max(n2, n2 * n));
                continue;
            }
            ahu_02.a(blx_12.bv(), n2);
        }
        if (ahu_02.b() < 1) {
            b.error((Object)"Il devrait y avoir au moins 1 target (le localPlayer");
        }
        return ahu_02;
    }

    public void a(blx_1 blx_12) {
        if (this.e != cYK.d) {
            this.f();
        }
        this.f = blx_12;
        this.h();
    }

    public void b(blx_1 blx_12) {
        if (this.e == cYK.b) {
            this.a(blx_12);
        }
    }

    public void c() {
        this.h();
    }

    void h() {
        ace_0 ace_02 = ans_0.D().c();
        switch (this.e) {
            case b: {
                ace_02.a(this.g());
                break;
            }
            case c: {
                if (this.f == null) break;
                ace_02.a((ahh_0)this.f.bv());
            }
        }
    }

    public static void d() {
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            b.error((Object)"Impossible de recentrer la cam\u00e9ra sur le leader, celui-ci est inconnu");
            return;
        }
        ace_0 ace_02 = ans_0.D().c();
        ace_02.a((ahh_0)bmr_12.bv());
        ace_02.i(aPc.f().h());
    }
}

