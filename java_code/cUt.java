/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.set.hash.TLongHashSet;

public class cUt
extends cSS
implements afy_0 {
    private static final byte a = 0;
    private static final byte m = 1;
    private static final byte n = 2;
    private static final byte o = 3;
    private byte p;
    private boolean q;

    @Override
    public cSY n() {
        return cSY.E;
    }

    @Override
    public void o() {
        if (!this.c()) {
            return;
        }
        this.a();
    }

    @Override
    public boolean d() {
        return this.q && super.d();
    }

    @Override
    public boolean c() {
        if (!(this.l instanceof bnh_1)) {
            return false;
        }
        bnh_1 bnh_12 = (bnh_1)this.l;
        bpc_2 bpc_22 = bnh_12.eE();
        if (bpc_22 == null || bpc_22.ac_() != 4) {
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        return bmr_12.a_() == bnh_12.a_() || !bmr_12.ab_();
    }

    @Override
    public void a(Object object) {
        bnh_1 bnh_12;
        super.a(object);
        this.p = 0;
        bmr_1 bmr_12 = azu_0.j().k();
        bmr_1 bmr_13 = null;
        int n = 0;
        TLongHashSet tLongHashSet = euw_2.a.e(bmr_12.U_());
        Object object2 = tLongHashSet.iterator();
        while (object2.hasNext()) {
            bnh_12 = (bmr_1)euw_2.a.d(object2.next());
            if (bnh_12 == null || (n = ((bmr_1)bnh_12).da().h(9247)) <= 0) continue;
            bmr_13 = bnh_12;
            break;
        }
        if (n < 1 || bmr_13 == null) {
            this.c(false);
            this.p = 1;
            return;
        }
        object2 = eyo_1.g().d(9247);
        if (bmr_13.dt() < ((ezr_0)object2).G()) {
            this.c(false);
            this.p = (byte)2;
        }
        if (!(this.l instanceof bnh_1)) {
            return;
        }
        bnh_12 = (bnh_1)this.l;
        bpc_2 bpc_22 = bnh_12.eE();
        if (!(bpc_22 instanceof bqp_2)) {
            return;
        }
        this.q = ((bqp_2)bpc_22).h();
        if (!this.q) {
            this.p = (byte)3;
        }
    }

    private void a() {
        bmr_1 bmr_12 = azu_0.j().k();
        biI biI2 = bmr_12.bv();
        bnh_1 bnh_12 = (bnh_1)this.l;
        int n = bmr_12.P_().e(bnh_12.P_());
        if (n > 1) {
            biI2.b(this);
            if (!bmr_12.b(bnh_12.P_(), true, false)) {
                biI2.c(this);
                bQG.a();
                bQG.a(2, new Object[0]);
            }
            return;
        }
        aej_2 aej_22 = biI2.ap().b(bnh_12.P_());
        if (aej_22 != null) {
            biI2.a(aej_22);
        }
        cll_0 cll_02 = new cll_0(bnh_12.a_());
        azu_0.j().K().c(cll_02);
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(this);
        this.a();
    }

    @Override
    public String r() {
        return "desc.mru.resurrect";
    }

    @Override
    public String q() {
        ani_2 ani_22 = new ani_2().a().a(f);
        ani_22.a((CharSequence)bae.h().a(this.r(), new Object[0]));
        ani_22.b();
        if (this.p != 0) {
            ani_22.m().i().a(azf_2.h.w());
            Object r2 = eyo_1.g().d(9247);
            if (this.p == 1) {
                ani_22.a((CharSequence)bae.h().a("action.error.resurrectionItemNotOwned", ((ezr_0)r2).e()));
            } else if (this.p == 2) {
                ani_22.a((CharSequence)bae.h().a("collect.error.ItemNotUsable", new Object[0]));
            } else if (this.p == 3) {
                ani_22.a((CharSequence)bae.h().a("error.pvp.diedByAgro", new Object[0]));
            }
        }
        return ani_22.r();
    }

    @Override
    public cSS v() {
        return new cUt();
    }

    @Override
    protected int t() {
        return cUL.J.aH;
    }
}

