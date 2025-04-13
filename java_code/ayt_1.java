/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Font;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Pattern;

/*
 * Renamed from ayt
 */
public enum ayt_1 {
    a,
    b,
    c,
    d;

    private static final Pattern e;
    private static final ayt_1[] f;

    private ayn_2 b(ayo_1 ayo_12, String string, boolean bl) {
        switch (this) {
            case a: {
                try {
                    axu_1 axu_12 = new axu_1();
                    axu_12.a(ayo_12.g(), string);
                    axu_12.a(ayo_12.d(), ayo_12.e());
                    return axu_12;
                }
                catch (IOException iOException) {
                    break;
                }
            }
            case b: {
                try {
                    ayg_2 ayg_22 = new ayg_2();
                    ayg_22.a(ayo_12.g(), string);
                    ayg_22.a(ayo_12.d(), ayo_12.e());
                    return ayg_22;
                }
                catch (IOException iOException) {
                    break;
                }
            }
            case c: {
                if (!bl) break;
                try {
                    URL uRL = gg_0.d(string + ayo_12.a() + ".ttf");
                    if (cd_0.a(uRL)) {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(uRL.openStream());
                        Font font = Font.createFont(0, bufferedInputStream);
                        ((InputStream)bufferedInputStream).close();
                        Font font2 = Font.decode(ayo_12.g());
                        font = font.deriveFont(font2.getStyle(), font2.getSize());
                        axt_1 axt_12 = new axt_1(font, true, ayo_12.f());
                        axt_12.a(ayo_12.d(), ayo_12.e());
                        return axt_12;
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                break;
            }
            case d: {
                if (!bl) break;
                axt_1 axt_13 = new axt_1(Font.decode(ayo_12.g()), true, ayo_12.f());
                axt_13.a(ayo_12.d(), ayo_12.e());
                return axt_13;
            }
        }
        return null;
    }

    public static ayn_2 a(ayo_1 ayo_12, String string, boolean bl) {
        int n = f.length;
        for (int k = 0; k < n; ++k) {
            ayn_2 ayn_22 = f[k].b(ayo_12, string, bl);
            if (ayn_22 == null) continue;
            return ayn_22;
        }
        return null;
    }

    public static void a(Comparator<ayt_1> comparator) {
        Arrays.sort(f, comparator);
    }

    static {
        e = Pattern.compile("-");
        f = new ayt_1[ayt_1.values().length];
        for (ayt_1 ayt_1.f[var1_1] : ayt_1.values()) {
        }
    }
}

