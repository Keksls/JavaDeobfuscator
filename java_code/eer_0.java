/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eER
 */
public enum eer_0 {
    a(-1, -1),
    b(0, 1),
    c(1, 2),
    d(2, 3),
    e(3, 5),
    f(4, 8);

    private final int g;
    private final int h;

    private eer_0(int n2, int n3) {
        this.g = n3;
        this.h = n2;
    }

    public int a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    public static eer_0 a(int n) {
        for (eer_0 eer_02 : eer_0.values()) {
            if (eer_02.g != n) continue;
            return eer_02;
        }
        return a;
    }

    public static eer_0 b(int n) {
        eer_0 eer_02 = a;
        for (eer_0 eer_03 : eer_0.values()) {
            if (n < eer_03.g) {
                return eer_02;
            }
            eer_02 = eer_03;
        }
        return eer_02;
    }

    public static int c() {
        return eer_0.values().length - 2;
    }
}

