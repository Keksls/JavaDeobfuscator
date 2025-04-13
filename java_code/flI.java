/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.util.Base64;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterOutputStream;

public final class flI {
    private flI() {
    }

    public static byte[] a(byte[] byArray) {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();){
            byte[] byArray2;
            try (DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);){
                deflaterOutputStream.write(byArray);
                deflaterOutputStream.finish();
                deflaterOutputStream.flush();
                byArray2 = byteArrayOutputStream.toByteArray();
            }
            return byArray2;
        }
    }

    public static byte[] b(byte[] byArray) {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();){
            byte[] byArray2;
            try (InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(byteArrayOutputStream);){
                inflaterOutputStream.write(byArray);
                inflaterOutputStream.flush();
                byArray2 = byteArrayOutputStream.toByteArray();
            }
            return byArray2;
        }
    }

    public static String c(byte[] byArray) {
        return Base64.getEncoder().encodeToString(byArray);
    }

    public static byte[] d(byte[] byArray) {
        return Base64.getDecoder().decode(byArray);
    }

    public static byte[] a(long l) {
        abx_2 abx_22 = new abx_2();
        for (long k = l; k > 0L; k /= 10L) {
            abx_22.a((byte)(k % 10L));
        }
        return abx_22.c();
    }

    public static byte[] a(byte[] byArray, byte[] byArray2) {
        try {
            if (byArray == null || byArray2 == null) {
                return null;
            }
            int n = byArray.length;
            int n2 = byArray2.length;
            byte[] byArray3 = new byte[n];
            for (int k = 0; k < n; ++k) {
                byArray3[k] = (byte)(byArray[k] ^ byArray2[k % n2]);
            }
            return byArray3;
        }
        catch (Exception exception) {
            return null;
        }
    }
}

