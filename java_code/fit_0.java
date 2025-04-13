/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from fit
 */
public final class fit_0 {
    private final short a;
    private final int[] b;

    public fit_0(short s2, int[] nArray) {
        this.a = s2;
        this.b = Arrays.copyOf(nArray, nArray.length);
    }

    public short a() {
        return this.a;
    }

    public int[] b() {
        return Arrays.copyOf(this.b, this.b.length);
    }
}

