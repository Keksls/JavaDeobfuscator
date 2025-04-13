/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from bAm
 */
public class bam_2
extends bal_2 {
    public static final bzz_1 c = new bam_2();

    private bam_2() {
    }

    @Override
    public bah_2 a(blx_1 blx_12, biI biI2, int n) {
        if (blx_12.c(eps_0.e) <= 0) {
            return super.a(blx_12, biI2, n);
        }
        aff_1 aff_12 = this.a(blx_12, biI2);
        if (aff_12 == null) {
            return super.a(blx_12, biI2, n);
        }
        int[][] nArray = new int[1][3];
        nArray[0][0] = aff_12.d();
        nArray[0][1] = aff_12.e();
        nArray[0][2] = aff_12.f();
        bah_2 bah_22 = new bah_2(new apl_1(nArray), false);
        bah_22.a(true);
        return bah_22;
    }

    private aff_1 a(blx_1 blx_12, biI biI2) {
        bvx_2 bvx_22 = blx_12.bz();
        if (!this.a(bvx_22, blx_12)) {
            return null;
        }
        return this.a(bvx_22, blx_12, biI2);
    }

    private aff_1 a(bvx_2 bvx_22, blx_1 blx_12, biI biI2) {
        aff_1 aff_12 = cyp_0.g().h();
        if (this.a(bvx_22, blx_12, aff_12.d(), aff_12.e(), aff_12.f())) {
            return new aff_1(aff_12);
        }
        return null;
    }

    private boolean a(bvx_2 bvx_22, blx_1 blx_12) {
        aff_1 aff_12 = blx_12.gg();
        return this.a(bvx_22, blx_12, aff_12.d(), aff_12.e(), aff_12.f());
    }

    private boolean a(bvx_2 bvx_22, blx_1 blx_12, int n, int n2, short s2) {
        Collection<sr_0> collection = bvx_22.i().f();
        for (sr_0 sr_02 : collection) {
            if (sr_02.v() != blx_12 || sr_02.w() != ele_0.b.a() || !sr_02.c(n, n2, s2)) continue;
            return true;
        }
        return false;
    }
}

