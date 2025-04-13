/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eSs
 */
public interface ess_2 {
    default public long b(long l) {
        return l * -1L;
    }

    default public long c(long l) {
        return l * -1L;
    }

    default public boolean d(long l) {
        return l < 0L;
    }

    default public boolean a(long l, long l2) {
        if (l2 <= 0L) {
            return false;
        }
        return l == this.b(l2);
    }
}

