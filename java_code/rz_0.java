/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from RZ
 */
public enum rz_0 {
    a(-1),
    b(0),
    c(1),
    d(2),
    e(3),
    f(4);

    private final byte g;

    private rz_0(byte by) {
        this.g = by;
    }

    @NotNull
    public static rz_0 a(byte by) {
        for (rz_0 rz_02 : rz_0.values()) {
            if (rz_02.g != by) continue;
            return rz_02;
        }
        return a;
    }

    public byte a() {
        return this.g;
    }
}

