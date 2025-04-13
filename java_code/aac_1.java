/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aAC
 */
public class aac_1 {
    public static final aac_1 a = new aac_1(1.0f, 100.0f);
    private final float b;
    private final float c;

    public aac_1(float f2, float f3) {
        this.b = f2;
        this.c = f3;
    }

    public final int a(int n, int n2, int n3) {
        return (int)this.a((float)n, (float)n2, n3);
    }

    public final int a(int[] nArray, int n) {
        return this.a(nArray[0], nArray[1], n);
    }

    public final short a(short s2, short s3, int n) {
        return (short)this.a((float)s2, (float)s3, n);
    }

    public final short a(short[] sArray, int n) {
        return this.a(sArray[0], sArray[1], n);
    }

    public final long a(long l, long l2, int n) {
        return (long)this.a((float)l, (float)l2, n);
    }

    public final long a(long[] lArray, int n) {
        return this.a(lArray[0], lArray[1], n);
    }

    public final float a(float f2, float f3, int n) {
        if ((float)n <= this.b) {
            return f2;
        }
        if ((float)n >= this.c) {
            return f3;
        }
        if (f3 == f2) {
            return f2;
        }
        float f4 = ((float)n - this.b) / (this.c - this.b);
        return Hw.a(f2, f3, f4);
    }

    public final float a(float[] fArray, int n) {
        return this.a(fArray[0], fArray[1], n);
    }
}

