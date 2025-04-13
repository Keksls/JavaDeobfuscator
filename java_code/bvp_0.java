/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bVP
 */
public class bvp_0
extends ajb_1 {
    private static final String c = "characterPreferences-%s.properties";
    private final long d;

    public bvp_0(bmr_1 bmr_12) {
        super(String.format(c, bmr_12.dp()));
        this.d = bmr_12.a_();
        this.b(false);
        this.a(true);
    }

    public long o() {
        return this.d;
    }
}

