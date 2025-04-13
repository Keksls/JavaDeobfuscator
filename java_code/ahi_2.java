/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aHI
 */
public class ahi_2 {
    private static final Logger a = Logger.getLogger(ahi_2.class);

    public static void a(long[] lArray) {
        for (int k = lArray.length - 1; k >= 0; --k) {
            int n = Hw.a(k + 1);
            long l = lArray[n];
            lArray[n] = lArray[k];
            lArray[k] = l;
        }
    }

    public static void a(int[] nArray) {
        for (int k = nArray.length - 1; k >= 0; --k) {
            int n = Hw.a(k + 1);
            int n2 = nArray[n];
            nArray[n] = nArray[k];
            nArray[k] = n2;
        }
    }

    public static void a(Object[] objectArray) {
        for (int k = objectArray.length - 1; k >= 0; --k) {
            int n = Hw.a(k + 1);
            Object object = objectArray[n];
            objectArray[n] = objectArray[k];
            objectArray[k] = object;
        }
    }

    public static boolean a(Object[] objectArray, Object object) {
        for (int k = 0; k < objectArray.length; ++k) {
            if (objectArray[k] != object) continue;
            return true;
        }
        return false;
    }

    public static boolean a(byte[] byArray, byte by) {
        for (int k = 0; k < byArray.length; ++k) {
            if (byArray[k] != by) continue;
            return true;
        }
        return false;
    }

    public static boolean a(short[] sArray, short s2) {
        for (int k = 0; k < sArray.length; ++k) {
            if (sArray[k] != s2) continue;
            return true;
        }
        return false;
    }

    public static boolean a(int[] nArray, int n) {
        for (int k = 0; k < nArray.length; ++k) {
            if (nArray[k] != n) continue;
            return true;
        }
        return false;
    }

    public static boolean a(long[] lArray, long l) {
        for (int k = 0; k < lArray.length; ++k) {
            if (lArray[k] != l) continue;
            return true;
        }
        return false;
    }
}

