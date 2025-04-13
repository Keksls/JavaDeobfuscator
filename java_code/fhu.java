/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public enum fhu {
    a(0),
    b(1),
    c(2);

    private final byte d;

    private fhu(byte by) {
        this.d = by;
    }

    public byte a() {
        return this.d;
    }

    @Nullable
    public static fhu a(byte by) {
        for (fhu fhu2 : fhu.values()) {
            if (fhu2.d != by) continue;
            return fhu2;
        }
        return null;
    }
}

