/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from azi
 */
public class azi_2
extends azg_2 {
    private static final azf_2 j = new azf_2(new float[0]);

    public azi_2(boolean bl) {
        super((byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, bl);
    }

    @Override
    public boolean a(byte by, byte by2, byte by3, byte by4, byte by5) {
        return by == by2 && by2 == by3;
    }

    private static void a(byte by, byte by2, byte by3, byte by4, int n) {
        if (n == 17) {
            j.a(by, by2, by3, by4);
        } else {
            j.a(by3, by2, by, by4);
        }
    }

    @Override
    public void a(byte[] byArray, int n, byte by) {
        azi_2.a(byArray[n], byArray[n], byArray[n], (byte)-1, by);
        float f2 = j.u();
        azi_2.a(this.e, this.f, this.g, this.h, by);
        j.a(Hw.b(f2 *= j.t(), 0.0f, 1.0f));
        byArray[n] = j.m();
        byArray[n + 1] = j.n();
        byArray[n + 2] = j.o();
        if (this.i) {
            int n2 = n + 3;
            byArray[n2] = (byte)((float)byArray[n2] * j.p());
        }
    }
}

