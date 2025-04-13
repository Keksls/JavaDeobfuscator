/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bwI
 */
public class bwi_1 {
    public static void a(ByteBuffer byteBuffer) {
        bmr_1 bmr_12 = azu_0.j().k();
        bvx_2 bvx_22 = bmr_12.bz();
        ss_0 ss_02 = bvx_22.i();
        int n = byteBuffer.getInt();
        if (!bmr_12.bl()) {
            bmr_12.bi();
        }
        if (bmr_12.eU().i().c(n) == null) {
            bmr_12.a(n, (short)0);
        }
        int n2 = byteBuffer.getInt();
        ekk_0 ekk_02 = elg_0.a().i(n2);
        for (int k = 0; k < 16; ++k) {
            Byte by = byteBuffer.get();
            Byte by2 = byteBuffer.get();
            Integer n3 = byteBuffer.getInt();
            elb_0 elb_02 = new elb_0(abd_1.c(), by.byteValue(), by2.byteValue(), 0, bvx_22.h(), 0L, null, 0, aej_2.k);
            bha_2 bha_22 = (bha_2)ekk_02.b(elb_02);
            bha_22.aq().a("" + n3);
            bha_22.a((int)by.byteValue(), (int)by2.byteValue(), (short)0);
            ss_02.a(bha_22);
        }
        bvx_22.a(new bwj_2(n, ss_02, bmr_12));
    }
}

