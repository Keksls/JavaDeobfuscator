/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.log4j.Logger;

public class epj
extends xi_0 {
    public static final byte b = 1;
    public static final short c = 86;
    public static final byte d = 6;
    public static final int e = -1;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final Date i;
    public static final byte[] j;
    public static final int k;
    public static final int l;
    protected static final Logger m;
    private static final epj n;
    private static final String o = "";
    private static final String p = "";

    public static void c() {
        m.info((Object)g);
    }

    public static String c(byte[] byArray) {
        if (byArray == null || byArray.length < 4) {
            return "<unknown>";
        }
        StringBuilder stringBuilder = new StringBuilder();
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get() & 0xFF;
        int n2 = byteBuffer.getShort() & 0xFFFF;
        int n3 = byteBuffer.get() & 0xFF;
        stringBuilder.append(n).append('.');
        if (n2 < 10) {
            stringBuilder.append('0');
        }
        stringBuilder.append(n2).append('.');
        if (n3 < 10) {
            stringBuilder.append('0');
        }
        stringBuilder.append(n3);
        int n4 = byteBuffer.get() & 0xFF;
        byte[] byArray2 = new byte[n4];
        byteBuffer.get(byArray2);
        String string = Cz.a(byArray2);
        int n5 = -1;
        try {
            n5 = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            m.error((Object)("Num\u00e9ro de build au format incorrect: " + string));
        }
        if (n5 >= 0) {
            stringBuilder.append(" build ").append(string);
        }
        return stringBuilder.toString();
    }

    public static void a(String[] stringArray) {
        System.out.println(k);
    }

    @Override
    protected boolean b(byte[] byArray) {
        if (byArray == null) {
            m.error((Object)"[implCheckVersion] check null");
            return false;
        }
        if (byArray.length < 5) {
            m.error((Object)("[implCheckVersion] wrong data length: " + byArray.length));
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        if (byteBuffer.get() != 1) {
            return false;
        }
        if (byteBuffer.getShort() != 86) {
            return false;
        }
        return byteBuffer.get() == 6;
    }

    @Override
    protected byte[] b() {
        return j;
    }

    static {
        m = Logger.getLogger(epj.class);
        n = new epj();
        int n = -1;
        if ("".length() > 0) {
            try {
                n = Integer.parseInt("");
            }
            catch (NumberFormatException numberFormatException) {
                m.error((Object)"TEAMCITY_BUILD_VERSION invalide : ");
            }
        }
        h = Integer.toString(n);
        Date date = new Date();
        if ("".length() > 0) {
            try {
                date = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).parse("");
            }
            catch (ParseException parseException) {
                m.error((Object)"TEAMCITY_BUILD_DATE invalide : ");
            }
        }
        i = date;
        byte[] byArray = Cz.a(Integer.toString(-1));
        j = new byte[5 + byArray.length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(j);
        byteBuffer.put((byte)1);
        byteBuffer.putShort((short)86);
        byteBuffer.put((byte)6);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        k = 10086006;
        l = 10086;
        Object object = String.format("%d.%02d.%d", 1, 86, 6);
        if (n != -1) {
            object = (String)object + String.format(" (build %s)", h);
        }
        f = object;
        g = String.format("%d.%02d (build %s [%4$tY-%4$tm-%4$td @ %4$tHH%4$tMmin%4$tS])", 1, 86, h, i);
    }
}

