/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.EnumSet;

/*
 * Renamed from fjR
 */
public enum fjr_0 {
    a(fhj_0.a),
    b(fhj_0.b),
    c(fhj_0.c),
    d(fhj_0.d);

    private final EnumSet<fhj_0> e = EnumSet.noneOf(fhj_0.class);

    private fjr_0(fhj_0 ... fhj_0Array) {
        if (fhj_0Array.length > 0) {
            this.e.addAll(Arrays.asList(fhj_0Array));
        }
    }

    public static fjr_0 a(fhj_0 fhj_02) {
        fjr_0[] fjr_0Array;
        for (fjr_0 fjr_02 : fjr_0Array = fjr_0.values()) {
            if (!fjr_02.e.contains(fhj_02)) continue;
            return fjr_02;
        }
        throw new IllegalArgumentException("Not found " + fhj_02);
    }

    public static fjr_0 a(Yf yf) {
        fjr_0[] fjr_0Array;
        for (fjr_0 fjr_02 : fjr_0Array = fjr_0.values()) {
            for (fhj_0 fhj_02 : fjr_02.e) {
                if (!fhj_02.a().contains((Object)yf)) continue;
                return fjr_02;
            }
        }
        throw new IllegalArgumentException("Not found " + yf);
    }
}

