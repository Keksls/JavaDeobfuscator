/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from Ew
 */
final class ew_1 {
    private ew_1() {
    }

    public static void a(fq_0 fq_02, eg_1 eg_12) {
        fq_02.a(eg_12.c());
        if (fq_02.a()) {
            int n = eg_12.b() & 0xFFFF;
            HashMap<Integer, Byte> hashMap = fq_02.e();
            for (int k = 0; k < n; ++k) {
                hashMap.put(eg_12.c(), (byte)(eg_12.a() - -1));
            }
        }
        if (fq_02.b()) {
            fq_02.a(eg_12.d(3));
        }
    }
}

