/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePy
 */
public class epy_0
extends eou_1 {
    private final float[] a = new float[eps_0.y() + 1];
    private final int b;

    public epy_0(int n) {
        this.b = n;
    }

    public float a(eps_0 eps_02) {
        return this.a[eps_02.a()];
    }

    public int a(eps_0 eps_02, int n) {
        int n2 = n - this.b;
        return (int)((float)this.a((ru_0)eps_02) + (float)n2 * this.a[eps_02.a()]);
    }

    public void a(eps_0 eps_02, int n, float f2) {
        this.a[eps_02.a()] = f2;
        this.a((ru_0)eps_02, n);
    }
}

