/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from aPO
 */
public class apo_0
extends apq_0
implements ape_0 {
    private static final String g = "MovementInformationRangeEffect";
    private static final String h = "MovementInformationWhenLocked";
    private static final ut_0 i = new ut_0();
    private static final yy_0 j = new yy_0();
    private final eny_1 k = new eny_1();

    public apo_0() {
        super(g, anr_0.S, null, null, null, null, h, anr_0.R, null, null, null, null);
        apo_0.i.b = 100;
    }

    public boolean a(blx_1 blx_12) {
        if (blx_12 != null && !blx_12.bV() && !blx_12.f(eoz_1.at)) {
            this.b(blx_12);
            apd_0 apd_02 = blx_12.bS();
            if (apd_02 != null) {
                apd_02.a(blx_12, this.a, this.c, this.b);
            }
            return true;
        }
        return false;
    }

    @Override
    protected aps_0 a(aff_1 aff_12, blx_1 blx_12) {
        Object object;
        int n;
        if (blx_12 == null) {
            return aps_0.e;
        }
        aff_1 aff_13 = blx_12.P_();
        if (blx_12.a(eoz_1.ag) && (blx_12 = blx_12.aq()) == null) {
            return aps_0.e;
        }
        if (blx_12.a(eoz_1.d) || blx_12.a(eoz_1.aI)) {
            return aps_0.e;
        }
        int n2 = blx_12.c(eps_0.d);
        if (blx_12.a(eoz_1.J)) {
            n2 /= 2;
        }
        if (blx_12.a(eoz_1.I)) {
            n2 /= 2;
        }
        if ((n = Math.abs(aff_13.d() - aff_12.d()) + Math.abs(aff_13.e() - aff_12.e())) > n2) {
            return aps_0.e;
        }
        uq_0 uq_02 = uq_0.a();
        if (uq_02 != null) {
            apo_0.i.c = n2;
            yz_0.a(aff_13.d(), aff_13.e(), aff_12.d(), aff_12.e(), j);
            object = blx_12.bv();
            uq_02.b(aff_12);
            uq_02.a(aff_13);
            uq_02.a((int)((biI)object).af(), ((biI)object).X(), ((biI)object).aU());
            uq_02.a(i);
            uq_02.a(j);
            int n3 = uq_02.g();
            uq_02.release();
            if (n3 == -1) {
                return aps_0.e;
            }
        }
        this.k.a(blx_12);
        object = blx_12.bz();
        Collection collection = ((els_0)object).p(blx_12);
        int n4 = this.k.a(collection, aff_13).b();
        if (n2 - n4 < n) {
            return aps_0.d;
        }
        int n5 = this.k.a(collection, aff_12).b();
        if (n5 > 0) {
            return aps_0.d;
        }
        if (Math.abs(aff_13.f() - aff_12.f()) > blx_12.fV()) {
            return aps_0.a;
        }
        return aps_0.a;
    }

    @Override
    public void b() {
    }
}

