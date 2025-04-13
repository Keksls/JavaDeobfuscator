/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eMq
 */
class emq_2 {
    private static final ys_0[] a = ys_0.b();
    private final tg_0 b;

    emq_2(tg_0 tg_02) {
        this.b = tg_02;
    }

    public void a(abx_2 abx_22) {
        short s2 = this.b.p();
        short s3 = this.b.q();
        afk_2 afk_22 = eml_2.a(this.b);
        for (int k = afk_22.d; k < afk_22.e; ++k) {
            for (int i2 = afk_22.b; i2 < afk_22.c; ++i2) {
                yx_0 yx_02 = yz_0.a((long)s2, (short)i2, (short)k, s3);
                enG enG2 = this.a(yx_02, k, i2);
                enG2.a(abx_22);
            }
        }
    }

    private enG a(yx_0 yx_02, int n, int n2) {
        enG enG2 = new enG(n2, n);
        enJ enJ2 = (enJ)yx_02.a();
        for (int k = 0; k < 18; ++k) {
            for (int i2 = 0; i2 < 18; ++i2) {
                int n3 = enG2.d + i2;
                int n4 = enG2.e + k;
                short s2 = emq_2.a(enJ2, n3, n4);
                enG2.a(n3, n4, s2);
            }
        }
        return enG2;
    }

    private static short a(enJ enJ2, int n, int n2) {
        if (enJ2.a(n, n2)) {
            return Short.MIN_VALUE;
        }
        int n3 = enJ2.a(n, n2, a, 0);
        if (n3 != 1) {
            return Short.MIN_VALUE;
        }
        ys_0 ys_02 = a[0];
        if (ys_02.g() != 0 || ys_02.z == -1) {
            return Short.MIN_VALUE;
        }
        return ys_02.c;
    }

    public void a(ByteBuffer byteBuffer) {
        short s2 = this.b.p();
        short s3 = this.b.q();
        afk_2 afk_22 = eml_2.a(this.b);
        for (int k = afk_22.d; k < afk_22.e; ++k) {
            for (int i2 = afk_22.b; i2 < afk_22.c; ++i2) {
                enG enG2 = new enG(i2, k);
                enG2.a(byteBuffer);
                yz_0.a((long)s2, (short)i2, (short)k, s3, enG2);
            }
        }
    }
}

