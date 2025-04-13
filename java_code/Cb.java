/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public final class Cb {
    private Cb() {
    }

    public static byte[] a(byte[] byArray) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(byArray.length / 2);
        try (DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);){
            ((OutputStream)deflaterOutputStream).write(byArray);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] b(byte[] byArray) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(byArray));){
            int n;
            byte[] byArray2 = new byte[1024];
            while ((n = ((InputStream)inflaterInputStream).read(byArray2)) > 0) {
                byteArrayOutputStream.write(byArray2, 0, n);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}

