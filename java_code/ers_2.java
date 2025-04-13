/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.Optional;

/*
 * Renamed from ers
 */
public final class ers_2 {
    private ers_2() {
    }

    public static boolean a(erm_2 erm_22, zn_1 zn_12) {
        for (int n = 0; n < 10; n = (int)((byte)(n + 1))) {
            eqy_1 eqy_12 = erm_22.a(n);
            if (eqy_12 == null) continue;
            zo_1 zo_12 = new zo_1();
            zo_12.a.a = (byte)n;
            zo_12.a.b = eqy_12.f();
            zo_12.a.c = 1;
            zo_12.a.d = eqy_12.e();
            zn_12.a.add(zo_12);
        }
        zn_12.b = erm_22.c();
        return true;
    }

    public static boolean b(erm_2 erm_22, zn_1 zn_12) {
        erm_22.d();
        for (zo_1 zo_12 : zn_12.a) {
            eqy_1 eqy_12;
            if (!erm_22.b(zo_12.a.b) || (eqy_12 = erm_22.c(zo_12.a.b)) == null) continue;
            eqy_12.a(zo_12.a.d);
            erm_22.a(zo_12.a.a, eqy_12);
            erm_22.a((int)zo_12.a.a, true);
            erm_22.k();
        }
        erm_22.a(zn_12.b);
        erm_22.l();
        erm_22.e();
        return true;
    }

    public static byte[] a(erm_2 erm_22) {
        abx_2 abx_22 = new abx_2();
        int n = erm_22.c.length;
        abx_22.a(n);
        for (int k = 0; k < n; ++k) {
            abx_22.a((byte)(erm_22.c[k] ? 1 : 0));
            long l = Optional.ofNullable(erm_22.b[k]).map(eqy_1::h).orElse(-1L);
            abx_22.a(l);
        }
        return abx_22.c();
    }

    public static void a(erm_2 erm_22, byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            erm_22.c[k] = byteBuffer.get() == 1;
            long l = byteBuffer.getLong();
            if (erm_22.b[k] == null) continue;
            erm_22.b[k].a(l);
        }
    }
}

