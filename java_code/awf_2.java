/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

/*
 * Renamed from awF
 */
public abstract class awf_2<T> {
    protected abstract byte a();

    public abstract T b(DataInput var1, float var2);

    protected abstract boolean a(T var1, T var2);

    public static int d(DataInput dataInput, float f2) {
        short s2 = dataInput.readShort();
        short s3 = dataInput.readShort();
        return Math.round(Hw.a((float)s2, (float)s3, f2)) & 0xFFFF;
    }

    public static float e(DataInput dataInput, float f2) {
        float f3 = dataInput.readFloat();
        float f4 = dataInput.readFloat();
        return Hw.a(f3, f4, f2);
    }

    public static int f(DataInput dataInput, float f2) {
        int n = dataInput.readInt();
        int n2 = dataInput.readInt();
        return (int)Hw.a((float)n, (float)n2, f2);
    }
}

