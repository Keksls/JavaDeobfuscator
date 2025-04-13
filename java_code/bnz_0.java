/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bNZ
 */
public enum bnz_0 {
    a,
    b,
    c,
    d,
    e;


    @NotNull
    public static bnz_0 a(float f2, int n, int n2, int n3, int n4) {
        if (f2 < (float)n) {
            return a;
        }
        if (f2 < (float)n2) {
            return b;
        }
        if (f2 < (float)n3) {
            return c;
        }
        if (f2 < (float)n4) {
            return d;
        }
        return e;
    }
}

