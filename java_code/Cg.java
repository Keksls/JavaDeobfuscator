/*
 * Decompiled with CFR 0.152.
 */
public final class Cg {
    private Cg() {
    }

    public static Byte[] a(byte ... byArray) {
        Byte[] byteArray = new Byte[byArray.length];
        for (int k = 0; k < byArray.length; ++k) {
            byteArray[k] = byArray[k];
        }
        return byteArray;
    }

    public static byte[] a(Byte ... byteArray) {
        byte[] byArray = new byte[byteArray.length];
        for (int k = 0; k < byteArray.length; ++k) {
            byArray[k] = byteArray[k];
        }
        return byArray;
    }

    public static Short[] a(short ... sArray) {
        Short[] shortArray = new Short[sArray.length];
        for (int k = 0; k < sArray.length; ++k) {
            shortArray[k] = sArray[k];
        }
        return shortArray;
    }

    public static Integer[] a(int ... nArray) {
        Integer[] integerArray = new Integer[nArray.length];
        for (int k = 0; k < nArray.length; ++k) {
            integerArray[k] = nArray[k];
        }
        return integerArray;
    }

    public static Float[] a(float ... fArray) {
        Float[] floatArray = new Float[fArray.length];
        for (int k = 0; k < fArray.length; ++k) {
            floatArray[k] = Float.valueOf(fArray[k]);
        }
        return floatArray;
    }

    public static float[] a(Float ... floatArray) {
        float[] fArray = new float[floatArray.length];
        for (int k = 0; k < floatArray.length; ++k) {
            fArray[k] = floatArray[k].floatValue();
        }
        return fArray;
    }
}

