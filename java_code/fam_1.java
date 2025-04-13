/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAM
 */
public class fam_1
extends faq_1 {
    public static final String TAG = "isGreater";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValidInt(int n, int n2) {
        return n > n2;
    }

    @Override
    public boolean isValidFloat(float f2, float f3) {
        return f2 > f3;
    }

    @Override
    public boolean isValidDouble(double d2, double d3) {
        return d2 > d3;
    }

    @Override
    public boolean isValidShort(short s2, short s3) {
        return s2 > s3;
    }

    @Override
    public boolean isValidLong(long l, long l2) {
        return l > l2;
    }

    @Override
    public boolean isValidByte(byte by, byte by2) {
        return by > by2;
    }
}

