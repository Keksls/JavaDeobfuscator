/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from bxf
 */
public enum bxf_1 {
    a(end_1.a, 800969, "MruFightMarkerSquare"),
    b(end_1.b, 800968, "MruFightMarkerCircle"),
    c(end_1.c, 800971, "MruFightMarkerCross"),
    d(end_1.d, 800972, "MruFightMarkerHeart"),
    e(end_1.e, 800973, "MruFightMarkerFlower"),
    f(end_1.f, 800970, "MruFightMarkerTriangle"),
    g(end_1.g, 800974, "MruFightMarkerSkull"),
    h(end_1.h, 800975, "MruFightMarkerMoon");

    private final end_1 i;
    private final int j;
    private final String k;

    private bxf_1(end_1 end_12, int n2, String string2) {
        this.i = end_12;
        this.j = n2;
        this.k = string2;
    }

    public static Optional<bxf_1> a(end_1 end_12) {
        for (bxf_1 bxf_12 : bxf_1.values()) {
            if (bxf_12.i != end_12) continue;
            return Optional.of(bxf_12);
        }
        return Optional.empty();
    }

    public end_1 a() {
        return this.i;
    }

    public int b() {
        return this.j;
    }

    public String c() {
        return this.k;
    }
}

