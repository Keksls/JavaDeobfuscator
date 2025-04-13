/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from Yu
 */
public class yu_0 {
    public static final short a = Short.MIN_VALUE;
    protected static final Logger b = Logger.getLogger(yu_0.class);

    private yu_0() {
    }

    public static short a(int n, int n2, @NotNull ys_0[] ys_0Array, short s2, int n3) {
        if (n3 <= 0) {
            b.error((Object)"no moverHeight defined");
        }
        if (n2 <= 0) {
            b.error((Object)"can't get highest height : no data for this element");
        }
        if (n + n2 > ys_0Array.length) {
            b.error((Object)"cell elements index and count are out of bounds");
        }
        if (n2 == 1) {
            ys_0 ys_02 = ys_0Array[n];
            if (ys_02.e) {
                b.error((Object)"data invalid : we can move through, but this element is the only one");
                return Short.MIN_VALUE;
            }
            if (ys_02.z == -1) {
                return Short.MIN_VALUE;
            }
            if (ys_02.c > s2) {
                return Short.MIN_VALUE;
            }
            return ys_02.c;
        }
        int n4 = Short.MAX_VALUE;
        for (int k = n + n2 - 1; k >= n; --k) {
            ys_0 ys_03 = ys_0Array[k];
            if (ys_03.e) continue;
            if (ys_03.z == -1) {
                n4 = (short)(ys_03.c - ys_03.d);
                continue;
            }
            if (ys_03.c > s2) {
                n4 = (short)(ys_03.c - ys_03.d);
                continue;
            }
            if (n3 > n4 - ys_03.c) {
                n4 = (short)(ys_03.c - ys_03.d);
                continue;
            }
            return ys_03.c;
        }
        return Short.MIN_VALUE;
    }

    public static boolean a(int n, int n2, int n3, ys_0[] ys_0Array, int n4) {
        assert (n4 > 0) : "no moverHeight defined";
        assert (ys_0Array != null) : "cellData can't be null";
        assert (n2 >= 0 && n3 > 0 && n2 + n3 <= ys_0Array.length) : "invalid bounds : [" + n2 + ", " + (n2 + n3) + "]";
        assert (n >= n2 && n < n2 + n3) : "moverZIndex not within the given bounds";
        if (ys_0Array[n].z == -1 || ys_0Array[n].e) {
            return false;
        }
        if (n == n2 + n3 - 1 && !ys_0Array[n].e) {
            return true;
        }
        int n5 = ys_0Array[n].c + n4;
        for (int k = n + 1; k < n2 + n3; ++k) {
            ys_0 ys_02 = ys_0Array[k];
            int n6 = ys_02.c - ys_02.d;
            if (n6 >= n5) {
                return true;
            }
            if (ys_02.e) continue;
            return false;
        }
        return true;
    }

    public static short a(int n, int n2, ys_0[] ys_0Array, short s2) {
        assert (n2 > 0) : "can't get index from z : no data for this element";
        assert (ys_0Array != null) : "can't get index from z : no data array provided";
        assert (n + n2 <= ys_0Array.length) : "cell elements index and count are out of bounds";
        for (int k = n + n2 - 1; k >= n; --k) {
            if (ys_0Array[k].c != s2) continue;
            return (short)(k - n);
        }
        return Short.MIN_VALUE;
    }
}

