/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eMu
 */
public enum emu_2 {
    a(true),
    b(false),
    c(false),
    d(false),
    e(true),
    f(true);

    private final boolean g;

    private emu_2(boolean bl) {
        this.g = bl;
    }

    @Nullable
    public static emu_2 a(int n) {
        for (emu_2 emu_22 : emu_2.values()) {
            if (emu_22.ordinal() != n) continue;
            return emu_22;
        }
        return null;
    }

    public boolean a() {
        return this.g;
    }
}

