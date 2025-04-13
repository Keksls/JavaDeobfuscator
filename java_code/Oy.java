/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Oy
extends Ou {
    public static final TimeZone b = TimeZone.getTimeZone("UTC");
    private DateFormat f;
    private DateFormat g;
    private DateFormat h;
    private DateFormat i;
    protected static Oy c;
    protected Ow d = Oy.g();
    protected String e;

    public static Oy d() {
        if (c == null) {
            c = new Oy();
        }
        return c;
    }

    public void b(Ow ow) {
        this.d = ow;
        this.b();
        this.a(ow);
        this.e();
        this.c();
    }

    protected void e() {
        this.f = DateFormat.getDateInstance(0, this.h());
        this.f.setTimeZone(b);
        this.h = DateFormat.getTimeInstance(3, this.h());
        this.h.setTimeZone(b);
        this.g = DateFormat.getDateInstance(3, this.h());
        this.g.setTimeZone(b);
        this.i = DateFormat.getDateTimeInstance(3, 3, this.h());
        this.i.setTimeZone(b);
    }

    public Ow f() {
        return this.d;
    }

    @NotNull
    public String a(String string, Object ... objectArray) {
        return this.a(this.d, string, objectArray);
    }

    @NotNull
    public String c(@NotNull String string) {
        return this.b(this.d, string);
    }

    public boolean d(String string) {
        return this.a(this.d, string);
    }

    @NotNull
    public String a(int n, int n2) {
        return this.a(this.d, n, n2);
    }

    @NotNull
    public String a(int n, long l, Object ... objectArray) {
        return this.a(this.d, n, l, objectArray);
    }

    public boolean a(int n, long l) {
        return this.a(this.d, n, l);
    }

    public static Ow g() {
        String string = System.getProperty("user.language");
        Ow ow = Ow.a(string);
        if (ow == null) {
            return Ow.b;
        }
        return ow;
    }

    @Override
    protected void c() {
        if (this.d == null) {
            return;
        }
        super.c();
    }

    @Nullable
    public Map<Integer, String> a(int n) {
        return this.a(this.d, n);
    }

    public String a(double d2) {
        return NumberFormat.getNumberInstance(this.h()).format(d2);
    }

    public String a(long l) {
        return NumberFormat.getIntegerInstance(this.h()).format(l);
    }

    public Number e(String string) {
        return NumberFormat.getIntegerInstance(this.h()).parse(string);
    }

    public long f(String string) {
        return this.e(string).longValue();
    }

    public int g(String string) {
        return this.e(string).intValue();
    }

    public String b(double d2) {
        return NumberFormat.getPercentInstance(this.h()).format(d2);
    }

    private Locale h() {
        return this.d.b();
    }

    public String a(Date date) {
        return this.f.format(date);
    }

    public String b(Date date) {
        return this.h.format(date);
    }

    public String c(Date date) {
        return this.g.format(date);
    }

    public String d(Date date) {
        return this.i.format(date);
    }

    @Override
    public String toString() {
        return "SingleLanguageTranslator{m_path='" + this.e + "', m_language=" + this.d + "}";
    }
}

