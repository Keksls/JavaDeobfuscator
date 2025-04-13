/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aJE
 */
public interface aje_1 {
    public void d(String var1);

    public void b(String var1, String var2);

    default public void b(String string, boolean bl) {
        this.b(string, Boolean.toString(bl));
    }

    default public void a(String string, double d2) {
        this.b(string, Double.toString(d2));
    }

    default public void a(String string, float f2) {
        this.b(string, Float.toString(f2));
    }

    default public void a(String string, int n) {
        this.b(string, Integer.toString(n));
    }

    default public void a(String string, long l) {
        this.b(string, Long.toString(l));
    }

    default public void d(String string, String string2) {
        this.b(string, string2);
    }

    public void c(String var1, String var2);

    default public void c(String string, boolean bl) {
        this.c(string, Boolean.toString(bl));
    }

    default public void b(String string, double d2) {
        this.c(string, Double.toString(d2));
    }

    default public void b(String string, float f2) {
        this.c(string, Float.toString(f2));
    }

    default public void b(String string, int n) {
        this.c(string, Integer.toString(n));
    }

    default public void b(String string, long l) {
        this.c(string, Long.toString(l));
    }

    default public void e(String string, String string2) {
        this.c(string, string2);
    }
}

