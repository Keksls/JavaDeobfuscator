/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from azO
 */
public class azo_1
extends azk_1 {
    @Override
    protected final azk_2 a(arf_1 arf_12) {
        boolean bl = arf_12.a() == 109;
        arf_12.e(3);
        short s2 = arf_12.b();
        short s3 = arf_12.b();
        int n = arf_12.c();
        int n2 = arf_12.c();
        byte by = bl ? arf_12.a() : (byte)1;
        byte[] byArray = new byte[n];
        arf_12.b(byArray);
        azr_2 azr_22 = new azr_2((int)s2, (int)s3, 32, null, byArray);
        byte[] byArray2 = new byte[n2];
        arf_12.b(byArray2);
        azr_22.a(byArray2, by);
        arf_12.close();
        azk_2 azk_22 = new azk_2(abc_1.c, azr_22);
        azr_22.u();
        return azk_22;
    }

    @Override
    protected afe_1 b(arf_1 arf_12) {
        arf_12.e(4);
        return new afe_1(arf_12.b(), arf_12.b());
    }

    @Override
    protected int a() {
        return 8;
    }
}

