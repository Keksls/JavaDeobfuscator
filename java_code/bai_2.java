/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from bAi
 */
public class bai_2
extends bal_2 {
    public static final bzz_1 c = new bai_2();

    private bai_2() {
    }

    @Override
    public bah_2 a(blx_1 blx_12, biI biI2, int n) {
        aff_1 aff_12;
        if (n > 0 && (aff_12 = this.a(blx_12, biI2)) != null) {
            int[][] nArray = new int[1][3];
            nArray[0][0] = aff_12.d();
            nArray[0][1] = aff_12.e();
            nArray[0][2] = aff_12.f();
            return new bah_2(new apl_1(nArray), false);
        }
        return super.a(blx_12, biI2, n);
    }

    private aff_1 a(blx_1 blx_12, biI biI2) {
        bvx_2 bvx_22 = blx_12.bz();
        byte by = this.a(bvx_22, blx_12);
        if (by == -1) {
            return null;
        }
        return this.a(bvx_22, by);
    }

    private aff_1 a(bvx_2 bvx_22, byte by) {
        aff_1 aff_12 = cyp_0.g().h();
        if (this.a(bvx_22, aff_12.d(), aff_12.e(), aff_12.f()) == by) {
            return new aff_1(aff_12);
        }
        return null;
    }

    private byte a(bvx_2 bvx_22, blx_1 blx_12) {
        aff_1 aff_12 = blx_12.gg();
        return this.a(bvx_22, aff_12.d(), aff_12.e(), aff_12.f());
    }

    private byte a(bvx_2 bvx_22, int n, int n2, short s2) {
        Collection<sr_0> collection = bvx_22.i().f();
        for (sr_0 sr_02 : collection) {
            if (sr_02.w() != ele_0.q.a() || !sr_02.c(n, n2, s2)) continue;
            return sr_02.Y();
        }
        return -1;
    }
}

