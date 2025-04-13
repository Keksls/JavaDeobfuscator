/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from epU
 */
public class epu_1
extends eps_1 {
    private final float b;

    public epu_1(byte by, float f2) {
        super(by);
        this.b = f2;
    }

    @Override
    public int a(int n) {
        return (int)Math.floor((float)n * this.b);
    }
}

