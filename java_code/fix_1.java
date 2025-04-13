/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Method;

/*
 * Renamed from fIX
 */
public class fix_1<T> {
    private static final String a = "content";
    private T b;
    private Method c;
    private Method d;
    private Method e;
    private fzy<?> f;
    private String g;
    private int h;
    private String i = null;
    private fak_2 j = null;
    private boolean k = false;
    private fiv_1 l = null;

    public fix_1(T t, fzy<?> fzy2, String string, String string2, fak_2 fak_22) {
        this.b = t;
        this.f = fzy2;
        this.g = string;
        this.h = string != null ? string.hashCode() : 0;
        this.c = fzy2.b(string);
        this.d = fzy2.d(string);
        this.e = fzy2.e(string);
        this.i = string2;
        this.j = fak_22;
    }

    public fix_1(T t, fzy<?> fzy2, String string, fak_2 fak_22) {
        this.b = t;
        this.f = fzy2;
        this.g = string;
        this.h = string != null ? string.hashCode() : 0;
        this.j = fak_22;
    }

    public int a() {
        return this.h;
    }

    public String b() {
        return this.g;
    }

    public void a(String string) {
        this.g = string;
        this.h = this.g != null ? string.hashCode() : 0;
    }

    public T c() {
        return this.b;
    }

    public void a(T t) {
        this.b = t;
    }

    public fzy<?> d() {
        return this.f;
    }

    public void a(fzy<?> fzy2) {
        this.f = fzy2;
    }

    public String e() {
        return this.i;
    }

    public void b(String string) {
        this.i = string;
    }

    public fak_2 f() {
        return this.j;
    }

    public void a(fak_2 fak_22) {
        this.j = fak_22;
    }

    public boolean g() {
        return this.b instanceof faa_1 && a.equalsIgnoreCase(this.g);
    }

    public Method h() {
        return this.c;
    }

    public Method i() {
        return this.d;
    }

    public Method j() {
        return this.e;
    }

    public boolean k() {
        return this.k;
    }

    public void a(boolean bl) {
        this.k = bl;
    }

    fiv_1 l() {
        return this.l;
    }

    void a(fiv_1 fiv_12) {
        this.l = fiv_12;
    }

    public String toString() {
        return "(PropertyClientData Element:" + this.b + " attribute=" + this.g + " field=" + this.i + ")";
    }
}

