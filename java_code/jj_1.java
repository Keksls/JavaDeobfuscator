/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.io.LittleEndianDataInputStream
 *  com.google.common.io.LittleEndianDataOutputStream
 */
import com.google.common.base.Charsets;
import com.google.common.io.LittleEndianDataInputStream;
import com.google.common.io.LittleEndianDataOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * Renamed from Jj
 */
public final class jj_1 {
    private jj_1() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static kh_1 a(File file) {
        kh_1 kh_12 = new kh_1();
        try (LittleEndianDataInputStream littleEndianDataInputStream = new LittleEndianDataInputStream((InputStream)new FileInputStream(file));){
            kg_2 kg_22 = new kg_2(kh_12);
            kg_22.a((DataInput)littleEndianDataInputStream);
            kh_1 kh_13 = kh_12;
            return kh_13;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(kh_1 kh_12, File file) {
        try (LittleEndianDataOutputStream littleEndianDataOutputStream = new LittleEndianDataOutputStream((OutputStream)new FileOutputStream(file));){
            lm_1 lm_12 = new lm_1(kh_12);
            lm_12.a((DataOutput)littleEndianDataOutputStream);
        }
    }

    public static String a(DataInput dataInput) {
        byte by;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while ((by = dataInput.readByte()) != 0) {
            byteArrayOutputStream.write(by);
            if (byteArrayOutputStream.size() <= 1024) continue;
            throw new IOException("Unable to detect end String marker");
        }
        return byteArrayOutputStream.toString(Charsets.UTF_8.name());
    }

    public static void a(DataOutput dataOutput, String string) {
        byte[] byArray = string.getBytes(Charsets.UTF_8.name());
        dataOutput.write(byArray);
        dataOutput.writeByte(0);
    }
}

