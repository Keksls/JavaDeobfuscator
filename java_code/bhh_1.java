/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from bhH
 */
public final class bhh_1 {
    private bhh_1() {
    }

    public static void a(emy_0 ... emy_0Array) {
        long l = bhh_1.b();
        if (l <= 0L) {
            return;
        }
        ena_0.a().a(l, emy_0Array);
    }

    public static <T extends emy_0> Optional<T> a(end_0 end_02) {
        long l = bhh_1.b();
        if (l <= 0L) {
            return Optional.empty();
        }
        return ena_0.a().b(l, end_02);
    }

    public static void a(byte[] byArray) {
        long l = bhh_1.b();
        if (l <= 0L) {
            return;
        }
        ena_0.a().a(l, byArray);
    }

    public static void a() {
        long l = bhh_1.b();
        if (l <= 0L) {
            return;
        }
        ena_0.a().b(l);
    }

    public static long b() {
        bai_0 bai_02 = azu_0.j().n();
        if (bai_02 == null) {
            return 0L;
        }
        return bai_02.u();
    }
}

