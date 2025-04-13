/*
 * Decompiled with CFR 0.152.
 */
public class Cn {
    public static final boolean[] a = new boolean[0];
    public static final byte[] b = new byte[0];
    public static final char[] c = new char[0];
    public static final double[] d = new double[0];
    public static final float[] e = new float[0];
    public static final int[] f = new int[0];
    public static final long[] g = new long[0];
    public static final short[] h = new short[0];
    public static final Boolean[] i = new Boolean[0];
    public static final Byte[] j = new Byte[0];
    public static final Character[] k = new Character[0];
    public static final Double[] l = new Double[0];
    public static final Float[] m = new Float[0];
    public static final Integer[] n = new Integer[0];
    public static final Long[] o = new Long[0];
    public static final Short[] p = new Short[0];

    private Cn() {
    }

    public static Boolean[] a(boolean[] blArray) {
        if (blArray == null) {
            return null;
        }
        int n = blArray.length;
        if (n == 0) {
            return i;
        }
        Boolean[] booleanArray = new Boolean[n];
        for (int k = 0; k < n; ++k) {
            booleanArray[k] = blArray[k];
        }
        return booleanArray;
    }

    public static Byte[] a(byte[] byArray) {
        if (byArray == null) {
            return null;
        }
        int n = byArray.length;
        if (n == 0) {
            return j;
        }
        Byte[] byteArray = new Byte[n];
        for (int k = 0; k < n; ++k) {
            byteArray[k] = byArray[k];
        }
        return byteArray;
    }

    public static Character[] a(char[] cArray) {
        if (cArray == null) {
            return null;
        }
        int n = cArray.length;
        if (n == 0) {
            return k;
        }
        Character[] characterArray = new Character[n];
        for (int k = 0; k < n; ++k) {
            characterArray[k] = Character.valueOf(cArray[k]);
        }
        return characterArray;
    }

    public static Double[] a(double[] dArray) {
        if (dArray == null) {
            return null;
        }
        int n = dArray.length;
        if (n == 0) {
            return l;
        }
        Double[] doubleArray = new Double[n];
        for (int k = 0; k < n; ++k) {
            doubleArray[k] = dArray[k];
        }
        return doubleArray;
    }

    public static Float[] a(float[] fArray) {
        if (fArray == null) {
            return null;
        }
        int n = fArray.length;
        if (n == 0) {
            return m;
        }
        Float[] floatArray = new Float[n];
        for (int k = 0; k < n; ++k) {
            floatArray[k] = Float.valueOf(fArray[k]);
        }
        return floatArray;
    }

    public static Integer[] a(int[] nArray) {
        if (nArray == null) {
            return null;
        }
        int n = nArray.length;
        if (n == 0) {
            return Cn.n;
        }
        Integer[] integerArray = new Integer[n];
        for (int k = 0; k < n; ++k) {
            integerArray[k] = nArray[k];
        }
        return integerArray;
    }

    public static Long[] a(long[] lArray) {
        if (lArray == null) {
            return null;
        }
        int n = lArray.length;
        if (n == 0) {
            return o;
        }
        Long[] longArray = new Long[n];
        for (int k = 0; k < n; ++k) {
            longArray[k] = lArray[k];
        }
        return longArray;
    }

    public static Short[] a(short[] sArray) {
        if (sArray == null) {
            return null;
        }
        int n = sArray.length;
        if (n == 0) {
            return p;
        }
        Short[] shortArray = new Short[n];
        for (int k = 0; k < n; ++k) {
            shortArray[k] = sArray[k];
        }
        return shortArray;
    }

    public static boolean[] a(Boolean[] booleanArray) {
        if (booleanArray == null) {
            return null;
        }
        int n = booleanArray.length;
        if (n == 0) {
            return a;
        }
        boolean[] blArray = new boolean[n];
        for (int k = 0; k < n; ++k) {
            Boolean bl = booleanArray[k];
            if (bl == null) {
                throw new IllegalArgumentException("array element is null.");
            }
            blArray[k] = bl;
        }
        return blArray;
    }

    public static byte[] a(Byte[] byteArray) {
        if (byteArray == null) {
            return null;
        }
        int n = byteArray.length;
        if (n == 0) {
            return b;
        }
        byte[] byArray = new byte[n];
        for (int k = 0; k < n; ++k) {
            Byte by = byteArray[k];
            if (by == null) {
                throw new IllegalArgumentException("array element is null.");
            }
            byArray[k] = by;
        }
        return byArray;
    }

    public static char[] a(Character[] characterArray) {
        if (characterArray == null) {
            return null;
        }
        int n = characterArray.length;
        if (n == 0) {
            return c;
        }
        char[] cArray = new char[n];
        for (int k = 0; k < n; ++k) {
            Character c2 = characterArray[k];
            if (c2 == null) {
                throw new IllegalArgumentException("array element is null.");
            }
            cArray[k] = c2.charValue();
        }
        return cArray;
    }

    public static double[] a(Double[] doubleArray) {
        if (doubleArray == null) {
            return null;
        }
        int n = doubleArray.length;
        if (n == 0) {
            return d;
        }
        double[] dArray = new double[n];
        for (int k = 0; k < n; ++k) {
            Double d2 = doubleArray[k];
            if (d2 == null) {
                throw new IllegalArgumentException("array element is null.");
            }
            dArray[k] = d2;
        }
        return dArray;
    }

    public static float[] a(Float[] floatArray) {
        if (floatArray == null) {
            return null;
        }
        int n = floatArray.length;
        if (n == 0) {
            return e;
        }
        float[] fArray = new float[n];
        for (int k = 0; k < n; ++k) {
            Float f2 = floatArray[k];
            if (f2 == null) {
                throw new IllegalArgumentException("array element is null.");
            }
            fArray[k] = f2.floatValue();
        }
        return fArray;
    }

    public static int[] a(Integer[] integerArray) {
        if (integerArray == null) {
            return null;
        }
        int n = integerArray.length;
        if (n == 0) {
            return f;
        }
        int[] nArray = new int[n];
        for (int k = 0; k < n; ++k) {
            Integer n2 = integerArray[k];
            if (n2 == null) {
                throw new IllegalArgumentException("array element is null.");
            }
            nArray[k] = n2;
        }
        return nArray;
    }

    public static long[] a(Long[] longArray) {
        if (longArray == null) {
            return null;
        }
        int n = longArray.length;
        if (n == 0) {
            return g;
        }
        long[] lArray = new long[n];
        for (int k = 0; k < n; ++k) {
            Long l = longArray[k];
            if (l == null) {
                throw new IllegalArgumentException("array element is null.");
            }
            lArray[k] = l;
        }
        return lArray;
    }

    public static short[] a(Short[] shortArray) {
        if (shortArray == null) {
            return null;
        }
        int n = shortArray.length;
        if (n == 0) {
            return h;
        }
        short[] sArray = new short[n];
        for (int k = 0; k < n; ++k) {
            Short s2 = shortArray[k];
            if (s2 == null) {
                throw new IllegalArgumentException("array element is null.");
            }
            sArray[k] = s2;
        }
        return sArray;
    }

    public static boolean[] a(Boolean[] booleanArray, boolean bl) {
        if (booleanArray == null) {
            return null;
        }
        int n = booleanArray.length;
        if (n == 0) {
            return a;
        }
        boolean[] blArray = new boolean[n];
        for (int k = 0; k < n; ++k) {
            Boolean bl2 = booleanArray[k];
            blArray[k] = bl2 == null ? bl : bl2;
        }
        return blArray;
    }

    public static byte[] a(Byte[] byteArray, byte by) {
        if (byteArray == null) {
            return null;
        }
        int n = byteArray.length;
        if (n == 0) {
            return b;
        }
        byte[] byArray = new byte[n];
        for (int k = 0; k < n; ++k) {
            Byte by2 = byteArray[k];
            byArray[k] = by2 == null ? by : by2;
        }
        return byArray;
    }

    public static char[] a(Character[] characterArray, char c2) {
        if (characterArray == null) {
            return null;
        }
        int n = characterArray.length;
        if (n == 0) {
            return c;
        }
        char[] cArray = new char[n];
        for (int k = 0; k < n; ++k) {
            Character c3 = characterArray[k];
            cArray[k] = c3 == null ? c2 : c3.charValue();
        }
        return cArray;
    }

    public static double[] a(Double[] doubleArray, double d2) {
        if (doubleArray == null) {
            return null;
        }
        int n = doubleArray.length;
        if (n == 0) {
            return d;
        }
        double[] dArray = new double[n];
        for (int k = 0; k < n; ++k) {
            Double d3 = doubleArray[k];
            dArray[k] = d3 == null ? d2 : d3;
        }
        return dArray;
    }

    public static float[] a(Float[] floatArray, float f2) {
        if (floatArray == null) {
            return null;
        }
        int n = floatArray.length;
        if (n == 0) {
            return e;
        }
        float[] fArray = new float[n];
        for (int k = 0; k < n; ++k) {
            Float f3 = floatArray[k];
            fArray[k] = f3 == null ? f2 : f3.floatValue();
        }
        return fArray;
    }

    public static int[] a(Integer[] integerArray, int n) {
        if (integerArray == null) {
            return null;
        }
        int n2 = integerArray.length;
        if (n2 == 0) {
            return f;
        }
        int[] nArray = new int[n2];
        for (int k = 0; k < n2; ++k) {
            Integer n3 = integerArray[k];
            nArray[k] = n3 == null ? n : n3;
        }
        return nArray;
    }

    public static long[] a(Long[] longArray, long l) {
        if (longArray == null) {
            return null;
        }
        int n = longArray.length;
        if (n == 0) {
            return g;
        }
        long[] lArray = new long[n];
        for (int k = 0; k < n; ++k) {
            Long l2 = longArray[k];
            lArray[k] = l2 == null ? l : l2;
        }
        return lArray;
    }

    public static short[] a(Short[] shortArray, short s2) {
        if (shortArray == null) {
            return null;
        }
        int n = shortArray.length;
        if (n == 0) {
            return h;
        }
        short[] sArray = new short[n];
        for (int k = 0; k < n; ++k) {
            Short s3 = shortArray[k];
            sArray[k] = s3 == null ? s2 : s3;
        }
        return sArray;
    }

    public static String a(boolean[] blArray, String string, String string2, String string3) {
        if (blArray == null) {
            throw new IllegalArgumentException("Array argument null.");
        }
        int n = blArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (boolean bl : blArray) {
            stringBuilder.append(bl);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(byte[] byArray, String string, String string2, String string3) {
        if (byArray == null) {
            throw new IllegalArgumentException("Array argument null.");
        }
        int n = byArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (byte by : byArray) {
            stringBuilder.append(by);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(char[] cArray, String string, String string2, String string3) {
        if (cArray == null) {
            throw new IllegalArgumentException("Array argument null.");
        }
        int n = cArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (char c2 : cArray) {
            stringBuilder.append(c2);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(double[] dArray, String string, String string2, String string3) {
        if (dArray == null) {
            throw new IllegalArgumentException("Array argument null.");
        }
        int n = dArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (double d2 : dArray) {
            stringBuilder.append(d2);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(float[] fArray, String string, String string2, String string3) {
        if (fArray == null) {
            throw new IllegalArgumentException("Array argument null.");
        }
        int n = fArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (float f2 : fArray) {
            stringBuilder.append(f2);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(int[] nArray, String string, String string2, String string3) {
        if (nArray == null) {
            throw new IllegalArgumentException("Array argument null.");
        }
        int n = nArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (int n2 : nArray) {
            stringBuilder.append(n2);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(long[] lArray, String string, String string2, String string3) {
        if (lArray == null) {
            throw new IllegalArgumentException("Array argument null.");
        }
        int n = lArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (long l : lArray) {
            stringBuilder.append(l);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(short[] sArray, String string, String string2, String string3) {
        if (sArray == null) {
            throw new IllegalArgumentException("Array argument null.");
        }
        int n = sArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (short s2 : sArray) {
            stringBuilder.append(s2);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(boolean[] blArray, String string, String string2, String string3, String string4) {
        if (blArray == null) {
            return string4;
        }
        int n = blArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (boolean bl : blArray) {
            stringBuilder.append(bl);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(byte[] byArray, String string, String string2, String string3, String string4) {
        if (byArray == null) {
            return string4;
        }
        int n = byArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (byte by : byArray) {
            stringBuilder.append(by);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(char[] cArray, String string, String string2, String string3, String string4) {
        if (cArray == null) {
            return string4;
        }
        int n = cArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (char c2 : cArray) {
            stringBuilder.append(c2);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(double[] dArray, String string, String string2, String string3, String string4) {
        if (dArray == null) {
            return string4;
        }
        int n = dArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (double d2 : dArray) {
            stringBuilder.append(d2);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(float[] fArray, String string, String string2, String string3, String string4) {
        if (fArray == null) {
            return string4;
        }
        int n = fArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (float f2 : fArray) {
            stringBuilder.append(f2);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(int[] nArray, String string, String string2, String string3, String string4) {
        if (nArray == null) {
            return string4;
        }
        int n = nArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (int n2 : nArray) {
            stringBuilder.append(n2);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(long[] lArray, String string, String string2, String string3, String string4) {
        if (lArray == null) {
            return string4;
        }
        int n = lArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (long l : lArray) {
            stringBuilder.append(l);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String a(short[] sArray, String string, String string2, String string3, String string4) {
        if (sArray == null) {
            return string4;
        }
        int n = sArray.length;
        if (n == 0) {
            return string + string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (short s2 : sArray) {
            stringBuilder.append(s2);
            stringBuilder.append(string3);
        }
        stringBuilder.setLength(stringBuilder.length() - string3.length());
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static Object[] a(Object object) {
        if (!object.getClass().isArray()) {
            throw new IllegalArgumentException("argument is not an array.");
        }
        if (object instanceof boolean[]) {
            return Cn.a((boolean[])object);
        }
        if (object instanceof byte[]) {
            return Cn.a((byte[])object);
        }
        if (object instanceof char[]) {
            return Cn.a((char[])object);
        }
        if (object instanceof double[]) {
            return Cn.a((double[])object);
        }
        if (object instanceof float[]) {
            return Cn.a((float[])object);
        }
        if (object instanceof int[]) {
            return Cn.a((int[])object);
        }
        if (object instanceof long[]) {
            return Cn.a((long[])object);
        }
        if (object instanceof short[]) {
            return Cn.a((short[])object);
        }
        return (Object[])object;
    }

    public static boolean a(int[] nArray, int n) {
        for (int n2 : nArray) {
            if (n2 != n) continue;
            return true;
        }
        return false;
    }
}

