/*
 * Decompiled with CFR 0.152.
 */
public class eJQ {
    protected static double a(aff_1 aff_12, int[] nArray) {
        int n = nArray[0] - aff_12.d();
        int n2 = nArray[1] - aff_12.e();
        double d2 = Math.atan2(n2, n);
        double d3 = Math.toDegrees(d2);
        if (d3 < 0.0) {
            return 360.0 + d3;
        }
        return d3;
    }
}

