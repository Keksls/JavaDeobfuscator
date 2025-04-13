/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.nio.ByteBuffer;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class fiQ {
    private fiQ() {
    }

    private static List<Integer> a(List<Integer> list) {
        for (int k = list.size() - 1; k >= 0; --k) {
            if (list.get(k) == 0) continue;
            return list.subList(0, k + 1);
        }
        return List.of();
    }

    private static int c(fiO fiO2) {
        return 4 * (1 + fiQ.a(fiO2.d()).size() + 1 + fiQ.a(fiO2.f()).size());
    }

    public static byte[] a(fiO fiO2) {
        abx_2 abx_22 = new abx_2(fiQ.c(fiO2) + 4);
        fiQ.a(fiO2, abx_22, true);
        return abx_22.c();
    }

    public static byte[] b(fiO fiO2) {
        abx_2 abx_22 = new abx_2(fiQ.c(fiO2));
        fiQ.a(fiO2, abx_22, false);
        return abx_22.c();
    }

    private static void a(fiO fiO2, abx_2 abx_22, boolean bl) {
        List<Integer> list = fiQ.a(fiO2.d());
        List<Integer> list2 = fiQ.a(fiO2.f());
        abx_22.a(list.size());
        list.forEach(abx_22::a);
        abx_22.a(list2.size());
        list2.forEach(abx_22::a);
        if (bl) {
            abx_22.a(fiO2.b());
        }
    }

    public static fiO a(byte[] byArray) {
        return fiQ.a(ByteBuffer.wrap(byArray));
    }

    public static fiO a(ByteBuffer byteBuffer) {
        fiO fiO2 = fiQ.c(byteBuffer);
        fiO2.a(byteBuffer.getInt());
        return fiO2;
    }

    public static fiO b(byte[] byArray) {
        return fiQ.c(ByteBuffer.wrap(byArray));
    }

    @NotNull
    private static fiO c(ByteBuffer byteBuffer) {
        int n;
        int n2;
        fiO fiO2 = new fiO();
        if (byteBuffer.remaining() < 8) {
            return fiO2;
        }
        int n3 = byteBuffer.getInt();
        for (n2 = 0; n2 < n3; ++n2) {
            n = byteBuffer.getInt();
            fiO2.a(n, n2);
        }
        n2 = byteBuffer.getInt();
        for (n = 0; n < n2; ++n) {
            int n4 = byteBuffer.getInt();
            fiO2.b(n4, n);
        }
        return fiO2;
    }

    private static int b(fiR fiR2) {
        int n = 4;
        for (fiO fiO2 : fiR2.b().values()) {
            n += 1 + fiQ.c(fiO2);
        }
        return n;
    }

    public static byte[] a(fiR fiR2) {
        abx_2 abx_22 = new abx_2(fiQ.b(fiR2));
        abx_22.a(fiR2.e());
        fiR2.b().forEach((n, fiO2) -> {
            abx_22.a(n.byteValue());
            fiQ.a(fiO2, abx_22, true);
        });
        return abx_22.c();
    }

    public static fiR b(ByteBuffer byteBuffer) {
        fiR fiR2 = new fiR();
        int n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            byte by = byteBuffer.get();
            fiO fiO2 = fiQ.a(byteBuffer);
            fiR2.a((int)by, fiO2);
        }
        return fiR2;
    }
}

