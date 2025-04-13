/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fjY
 */
public enum fjy_0 {
    a(0),
    b(1);

    private final byte c;

    private fjy_0(byte by) {
        this.c = by;
    }

    public byte a() {
        return this.c;
    }

    @Nullable
    public static fjy_0 a(byte by) {
        for (fjy_0 fjy_02 : fjy_0.values()) {
            if (fjy_02.c != by) continue;
            return fjy_02;
        }
        return null;
    }
}

