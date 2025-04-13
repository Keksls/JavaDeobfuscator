/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from eSk
 */
public class esk_1 {
    private static final Logger a = Logger.getLogger(esk_1.class);
    private final long b;
    private final String c;
    private final long d;

    private esk_1(long l, String string, long l2) {
        this.b = l;
        this.c = string;
        this.d = l2;
    }

    public long a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public long c() {
        return this.d;
    }

    public String toString() {
        return "GuildInfo{m_guildId=" + this.b + ", m_guildName='" + this.c + "', m_blazon=" + this.d + "}";
    }

    public static long a(esl_1 esl_12) {
        return esl_12.a();
    }

    public static esk_1 a(ByteBuffer byteBuffer) {
        long l = byteBuffer.getLong();
        if (l == 0L) {
            return null;
        }
        long l2 = byteBuffer.getLong();
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        String string = Cz.a(byArray);
        return new esk_1(l, string, l2);
    }

    public static void a(esk_1 esk_12, abx_2 abx_22) {
        if (esk_12 == null) {
            abx_22.a(0L);
            return;
        }
        abx_22.a(esk_12.a());
        abx_22.a(esk_12.c());
        byte[] byArray = Cz.a(esk_12.b());
        abx_22.a(byArray.length);
        abx_22.b(byArray);
    }

    public static esk_1 a(long l, String string, long l2) {
        if (l == 0L) {
            return null;
        }
        return new esk_1(l, string, l2);
    }
}

