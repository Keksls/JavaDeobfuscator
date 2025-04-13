/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bwA
 */
public class bwa_0 {
    private static final Logger b = Logger.getLogger(bwa_0.class);
    public static final int a = 0;

    public static int a(biI biI2, bwu_0 bwu_02) {
        bwu_02.d(biI2);
        return bwu_02.c(biI2);
    }

    public static int b(biI biI2, bwu_0 bwu_02) {
        bwu_02.a(biI2);
        return bwu_02.b(biI2);
    }

    public static void a(biI biI2, int n, int n2) {
        if (n2 == n) {
            return;
        }
        if (n2 != -1) {
            biI2.c((short)exh_2.p.A);
            biI2.a(n2, (short)exh_2.p.A, n2 != 2192145);
        }
    }

    public static int c(biI biI2, bwu_0 bwu_02) {
        bwu_0 bwu_03 = biI2.bQ();
        int n = bwu_03.b(biI2);
        if (n == 0) {
            bwu_03.a(biI2);
            biI2.a(bwu_02);
            bwu_02.d(biI2);
        } else {
            biI2.a(new bwb_0(biI2, bwu_02));
            bwu_03.a(biI2);
        }
        return n + bwu_02.c(biI2);
    }

    public static void a(int n, int n2, int n3, blx_1 blx_12) {
        bwz_0 bwz_02 = new bwz_0(blx_12);
        bwa_0.a(n, n2, n3, blx_12.a_(), bwz_02);
    }

    public static void a(int n, int n2, int n3, blx_1 blx_12, exq_1 exq_12, int n4) {
        bwd_0 bwd_02 = new bwd_0(exq_12, n4);
        bwa_0.a(n, n2, n3, blx_12.a_(), bwd_02);
    }

    private static void a(int n, int n2, int n3, long l, bwu_0 bwu_02) {
        bap bap2 = new bap(n, emd_1.u.a(), n2, n3, l, bwu_02);
        baa_0.a().a(n3, (aku_1)bap2);
    }

    public static void a(blx_1 blx_12) {
        bwu_0 bwu_02;
        Object object;
        if (blx_12 instanceof bnh_1) {
            Object r2;
            exq_1 exq_12;
            int n;
            int n2;
            object = blx_12.bc();
            int n3 = n2 = object != null ? object.get(exh_2.p.A) : 0;
            if (n2 <= 0) {
                n2 = 2145;
            }
            if ((n = bwd_0.a(exq_12 = ((ezr_0)(r2 = eyo_1.g().d(n2))).F())) == 237) {
                bwu_02 = new bwz_0(blx_12);
            } else {
                int n4 = ((ezr_0)r2).C();
                bwu_02 = new bwd_0(exq_12, n4);
                bwa_0.a(blx_12.bv(), -1, n4);
            }
        } else {
            bwu_02 = new bwz_0(blx_12);
        }
        object = blx_12.bv();
        ((biI)object).a(bwu_02);
    }

    public static int b(blx_1 blx_12) {
        int n;
        blx_12.bj();
        biI biI2 = blx_12.bv();
        if (biI2.an() == null) {
            biI2.bQ().d(biI2);
            return 0;
        }
        if (biI2.an().v()) {
            bwu_0 bwu_02 = biI2.bQ();
            n = bwu_02.c(biI2);
            bwu_02.d(biI2);
        } else {
            biI2.a(new bwc_1(biI2));
            n = 0;
        }
        return n;
    }
}

