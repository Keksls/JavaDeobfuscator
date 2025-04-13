/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eOS
 */
public enum eos_1 {
    a(0),
    b(1),
    c(2);

    private final byte d;

    private eos_1(int n2) {
        this.d = Hw.b((long)n2);
    }

    public byte a() {
        return this.d;
    }

    @Nullable
    public static eos_1 a(byte by) {
        for (eos_1 eos_12 : eos_1.values()) {
            if (eos_12.d != by) continue;
            return eos_12;
        }
        return null;
    }
}

