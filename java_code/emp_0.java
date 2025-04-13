/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from emP
 */
public class emp_0 {
    public static final int a = 32;
    public static final int[] b = new int[emp_0.a()];

    private emp_0() {
    }

    public static int a() {
        return emq_0.values().length;
    }

    public static void a(int[] nArray, short s2) {
        int n = s2 / 32;
        nArray[n] = nArray[n] | 1 << s2 % 32;
    }

    public static void a(int[] nArray, emq_0 emq_02) {
        emp_0.a(nArray, (short)emq_02.ordinal());
    }

    public static int[] a(emq_0 ... emq_0Array) {
        int[] nArray = (int[])b.clone();
        for (emq_0 emq_02 : emq_0Array) {
            emp_0.a(nArray, emq_02);
        }
        return nArray;
    }

    public static boolean a(int[] nArray, int[] nArray2) {
        return Arrays.equals(nArray, nArray2);
    }

    public static boolean a(int[] nArray, emS emS2) {
        for (emq_0 emq_02 : emS2.c()) {
            if (emp_0.b(nArray, emq_02)) continue;
            return false;
        }
        return true;
    }

    public static boolean b(int[] nArray, emq_0 emq_02) {
        return emp_0.b(nArray, (short)emq_02.ordinal());
    }

    public static boolean b(int[] nArray, short s2) {
        return (nArray[s2 / 32] & 1 << s2 % 32) != 0;
    }
}

