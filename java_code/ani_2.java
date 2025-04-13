/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aNi
 */
public class ani_2 {
    protected final StringBuilder a = new StringBuilder(100);
    protected boolean b;
    protected ane_2 c = ane_2.a;
    protected final List<String> d = new ArrayList<String>();
    static long e;
    static long f;
    static long g;

    public ani_2 a(Object object) {
        if (this.b) {
            this.t();
        }
        this.a.append(object);
        return this;
    }

    public ani_2 a(CharSequence charSequence) {
        if (this.b) {
            this.t();
        }
        this.a.append(charSequence);
        return this;
    }

    public ani_2 a(CharSequence charSequence, int n, int n2) {
        if (this.b) {
            this.t();
        }
        this.a.append(charSequence, n, n2);
        return this;
    }

    public ani_2 a(byte by) {
        if (this.b) {
            this.t();
        }
        this.a.append(this.b((long)by));
        return this;
    }

    public ani_2 a(short s2) {
        if (this.b) {
            this.t();
        }
        this.a.append(this.b((long)s2));
        return this;
    }

    public ani_2 a(char c2) {
        if (this.b) {
            this.t();
        }
        this.a.append(c2);
        return this;
    }

    public ani_2 d(int n) {
        if (this.b) {
            this.t();
        }
        this.a.append(this.b((long)n));
        return this;
    }

    public ani_2 a(long l) {
        if (this.b) {
            this.t();
        }
        this.a.append(this.b(l));
        return this;
    }

    public ani_2 a(float f2) {
        if (this.b) {
            this.t();
        }
        this.a.append(this.b(f2));
        return this;
    }

    public ani_2 a(double d2) {
        if (this.b) {
            this.t();
        }
        this.a.append(this.b(d2));
        return this;
    }

    public ani_2 a(boolean bl) {
        if (this.b) {
            this.t();
        }
        this.a.append(bl);
        return this;
    }

    protected void e(String string) {
        this.d.add(string);
        this.a.append('<').append(string);
        this.b = true;
        this.c = ane_2.b;
    }

    protected void f(String string) {
        this.d.remove(this.d.size() - 1);
        this.a.append("</").append(string).append('>');
        this.c = ane_2.a;
    }

    protected void a(String string, ane_2 ane_22) {
        this.d.add(string);
        this.a.append('<').append(string);
        this.b = true;
        this.c = ane_22;
    }

    public ani_2 a() {
        if (this.b) {
            this.t();
        }
        this.e("b");
        return this;
    }

    public ani_2 b() {
        if (this.b) {
            this.t();
        }
        this.f("b");
        return this;
    }

    public ani_2 c() {
        if (this.b) {
            this.t();
        }
        this.e("c");
        return this;
    }

    public ani_2 d() {
        if (this.b) {
            this.t();
        }
        this.f("c");
        return this;
    }

    public ani_2 e() {
        if (this.b) {
            this.t();
        }
        this.e("i");
        return this;
    }

    public ani_2 f() {
        if (this.b) {
            this.t();
        }
        this.f("i");
        return this;
    }

    public ani_2 g() {
        if (this.b) {
            this.t();
        }
        this.e("u");
        return this;
    }

    public ani_2 h() {
        if (this.b) {
            this.t();
        }
        this.f("u");
        return this;
    }

    public ani_2 m() {
        if (this.b) {
            this.t();
        }
        this.a.append('\n');
        return this;
    }

    public ani_2 i() {
        if (this.b) {
            this.t();
        }
        this.e("text");
        return this;
    }

    public ani_2 j() {
        if (this.b) {
            this.t();
        }
        this.f("text");
        return this;
    }

    public ani_2 k() {
        if (this.b) {
            this.t();
        }
        this.a("image", ane_2.c);
        return this;
    }

    public ani_2 l() {
        if (this.b) {
            this.t();
        }
        this.f("image");
        return this;
    }

    public ani_2 a(String string, int n, int n2, @Nullable String string2) {
        this.a(string, n, n2, string2, null);
        return this;
    }

    public ani_2 a(String string, int n, int n2, @Nullable String string2, @Nullable String string3) {
        this.k();
        this.b("pixmap", string);
        if (n > 0) {
            this.b("width", String.valueOf(n));
        }
        if (n2 > 0) {
            this.b("height", String.valueOf(n2));
        }
        if (string2 != null) {
            this.b("align", string2);
        }
        if (string3 != null) {
            this.b("popupTranslatorKey", string3);
        }
        this.l();
        return this;
    }

    public ani_2 n() {
        this.a("align", "center");
        return this;
    }

    public ani_2 o() {
        this.a("align", "east");
        return this;
    }

    public ani_2 p() {
        this.a("align", "west");
        return this;
    }

    public ani_2 a(azj_2 azj_22) {
        return this.a(azj_22.w());
    }

    public ani_2 a(String string) {
        this.a("color", string);
        return this;
    }

    public ani_2 b(String string) {
        this.a("name", string);
        return this;
    }

    public ani_2 a(int n) {
        this.a("size", String.valueOf(n));
        return this;
    }

    public ani_2 c(String string) {
        this.a("id", string);
        return this;
    }

    public ani_2 b(int n) {
        this.a("width", String.valueOf(n));
        return this;
    }

    public ani_2 c(int n) {
        this.a("height", String.valueOf(n));
        return this;
    }

    public ani_2 d(String string) {
        this.a("pixmap", string);
        return this;
    }

    public String toString() {
        return this.a.toString();
    }

    public int q() {
        return this.a.length();
    }

    public String r() {
        if (!this.d.isEmpty()) {
            this.s();
        }
        if ((long)this.a.length() > e) {
            e = this.a.length();
        }
        ++g;
        f += (long)this.a.length();
        return this.a.toString();
    }

    public static boolean g(String string) {
        return string.contains("<text");
    }

    public static boolean h(String string) {
        return string.contains("color=");
    }

    protected void a(String string, String string2) {
        if (this.c != ane_2.b) {
            this.i();
        }
        this.a.append(' ').append(string).append("=\"").append(string2).append('\"');
    }

    protected void b(String string, String string2) {
        if (this.c != ane_2.c) {
            this.k();
        }
        this.a.append(' ').append(string).append("=\"").append(string2).append('\"');
    }

    protected void s() {
        if (this.b) {
            this.t();
        }
        while (!this.d.isEmpty()) {
            this.a.append("</").append(this.d.remove(this.d.size() - 1)).append('>');
        }
    }

    protected void t() {
        assert (this.b);
        this.a.append('>');
        this.b = false;
    }

    public void u() {
        this.a.delete(0, this.a.length());
    }

    public boolean v() {
        return this.b;
    }

    private String b(long l) {
        if (Oy.d() == null) {
            return String.valueOf(l);
        }
        return Oy.d().a(l);
    }

    private String b(double d2) {
        if (Oy.d() == null) {
            return String.valueOf(d2);
        }
        return Oy.d().a(d2);
    }
}

