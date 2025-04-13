/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from ayo
 */
public class ayo_1 {
    public static final Pattern a = Pattern.compile("(([^\\-]*)-([^\\-]*)-([^#]*))(#([0-9\\+\\-]+)#([0-9\\+\\-]+))?");
    private final String b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;

    public ayo_1(String string, int n, int n2, int n3, int n4) {
        this.b = string;
        this.c = n;
        this.d = n2;
        this.e = n3;
        this.f = n4;
    }

    public String a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public ayr_1 f() {
        if ((this.c & 4) != 0) {
            return ayr_1.b;
        }
        if ((this.c & 8) != 0) {
            return ayr_1.c;
        }
        return ayr_1.a;
    }

    public String g() {
        return ayo_1.a(this.b, this.c, this.d, 0, 0);
    }

    public String toString() {
        return ayo_1.a(this.b, this.c, this.d, this.e, this.f);
    }

    public static String a(String string, int n, int n2, int n3, int n4) {
        StringBuilder stringBuilder = new StringBuilder(string.toLowerCase());
        stringBuilder.append('-');
        if ((n & 1) != 0) {
            stringBuilder.append("bold");
        }
        if ((n & 2) != 0) {
            stringBuilder.append("italic");
        }
        if ((n & 4) != 0) {
            stringBuilder.append("bordered");
        }
        if ((n & 8) != 0) {
            stringBuilder.append("shadowed");
        }
        if (n == 0) {
            stringBuilder.append("plain");
        }
        stringBuilder.append('-');
        stringBuilder.append(n2);
        if (n3 != 0 || n4 != 0) {
            stringBuilder.append('#').append(n3);
            stringBuilder.append('#').append(n4);
        }
        return stringBuilder.toString();
    }

    public static ayo_1 a(String string) {
        Matcher matcher = a.matcher(string);
        if (matcher.matches()) {
            String string2 = matcher.group(2);
            int n = ayq_1.c(matcher.group(3));
            int n2 = Co.a((Object)matcher.group(4), 10);
            int n3 = Co.a((Object)matcher.group(6), 0);
            int n4 = Co.a((Object)matcher.group(7), 0);
            return new ayo_1(string2, n, n2, n3, n4);
        }
        return null;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ayo_1 ayo_12 = (ayo_1)object;
        if (this.e != ayo_12.e) {
            return false;
        }
        if (this.f != ayo_12.f) {
            return false;
        }
        if (this.d != ayo_12.d) {
            return false;
        }
        if (this.c != ayo_12.c) {
            return false;
        }
        return Objects.equals(this.b, ayo_12.b);
    }

    public int hashCode() {
        int n = this.b != null ? this.b.hashCode() : 0;
        n = 31 * n + this.c;
        n = 31 * n + this.d;
        n = 31 * n + this.e;
        n = 31 * n + this.f;
        return n;
    }
}

