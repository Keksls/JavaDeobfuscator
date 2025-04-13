/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eSw
 */
public class esw_2 {
    private static final Logger a = Logger.getLogger(esw_2.class);

    public static byte[] a(esl_1 esl_12) {
        abx_2 abx_22 = new abx_2();
        esm_2.a(esl_12.c(), abx_22);
        eud_2 eud_22 = new eud_2();
        esl_12.a(eud_22);
        abx_22.a(eud_22.a());
        abx_22.b(eud_22.b());
        euf_2 euf_22 = new euf_2();
        esl_12.b(euf_22);
        abx_22.a(euf_22.b());
        abx_22.b(euf_22.a());
        return abx_22.c();
    }

    public static esl_1 a(ByteBuffer byteBuffer) {
        int n;
        esm_2 esm_22 = esm_2.a(byteBuffer);
        if (esm_22 == null) {
            a.error((Object)"Unable to decode HavenWorldBasicInfo");
            return null;
        }
        est_1 est_12 = (est_1)esp_2.a(esm_22);
        int n2 = byteBuffer.getInt();
        for (n = 0; n < n2; ++n) {
            est_12.a(esw_2.c(byteBuffer));
        }
        n2 = byteBuffer.getInt();
        for (n = 0; n < n2; ++n) {
            est_12.a(esw_2.b(byteBuffer));
        }
        return est_12;
    }

    public static byte[] a(esa_2 esa_22) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(12);
        byteBuffer.putShort(esa_22.a());
        byteBuffer.putShort(esa_22.b());
        byteBuffer.putShort(esa_22.c());
        byteBuffer.putShort(esa_22.d());
        byteBuffer.putShort(esa_22.e());
        byteBuffer.putShort(esa_22.f());
        return byteBuffer.array();
    }

    public static byte[] a(ese_1 ese_12) {
        abx_2 abx_22 = new abx_2();
        abx_22.b(esw_2.b(ese_12));
        esx_1 esx_12 = new esx_1();
        ese_12.a(esx_12);
        abx_22.a(esx_12.b());
        abx_22.a(esx_12.a());
        return abx_22.c();
    }

    public static byte[] b(ese_1 ese_12) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(26);
        byteBuffer.putShort(ese_12.a().a());
        byteBuffer.putLong(ese_12.b());
        byteBuffer.putInt(ese_12.g());
        byteBuffer.putLong(ese_12.c());
        byteBuffer.putShort(ese_12.d());
        byteBuffer.putShort(ese_12.e());
        return byteBuffer.array();
    }

    public static byte[] a(esf_1 esf_12) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        byteBuffer.putLong(esf_12.a());
        byteBuffer.putLong(esf_12.b());
        return byteBuffer.array();
    }

    public static esa_2 b(ByteBuffer byteBuffer) {
        short s2 = byteBuffer.getShort();
        short s3 = byteBuffer.getShort();
        short s4 = byteBuffer.getShort();
        short s5 = byteBuffer.getShort();
        short s6 = byteBuffer.getShort();
        short s7 = byteBuffer.getShort();
        return new esc_2(s2, s3, s4, s5, s6, s7);
    }

    public static ese_1 c(ByteBuffer byteBuffer) {
        esh_1 esh_12 = (esh_1)esw_2.d(byteBuffer);
        int n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            esg_1 esg_12 = esw_2.e(byteBuffer);
            esh_12.a(esg_12);
        }
        return esh_12;
    }

    public static ese_1 d(ByteBuffer byteBuffer) {
        short s2 = byteBuffer.getShort();
        long l = byteBuffer.getLong();
        int n = byteBuffer.getInt();
        long l2 = byteBuffer.getLong();
        short s3 = byteBuffer.getShort();
        short s4 = byteBuffer.getShort();
        etw_2 etw_22 = eti_2.a.a(s2);
        return new esh_1(etw_22, l, n, l2, s3, s4);
    }

    private static esg_1 e(ByteBuffer byteBuffer) {
        long l = byteBuffer.getLong();
        long l2 = byteBuffer.getLong();
        return new esg_1(l, l2);
    }
}

