/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from feU
 */
@Deprecated(forRemoval=true)
public enum feu_0 {
    a(1, 604800000L, 0.3333333333333333),
    b(2, 1209600000L, 0.5),
    c(3, 2419200000L, 1.0);

    public final byte d;
    public final long e;
    public final ww_0 f;
    public final double g;

    private feu_0(byte by, long l, double d2) {
        this.d = by;
        this.e = l;
        this.f = new ww_0(l / 1000L);
        this.g = d2;
    }

    @Nullable
    public static feu_0 a(byte by) {
        for (feu_0 feu_02 : feu_0.values()) {
            if (feu_02.d != by) continue;
            return feu_02;
        }
        return null;
    }
}

