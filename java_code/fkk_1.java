/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fKk
 */
public class fkk_1
implements fki_1 {
    private String a;
    private boolean b = false;
    private long c;
    private int d;
    private boolean e = true;

    public fkk_1(String string, int n, long l) {
        this.a = string;
        this.d = n;
        this.c = l;
        this.e = this.d == Integer.MAX_VALUE;
    }

    public fkk_1(String string) {
        this(string, Integer.MAX_VALUE, 0L);
    }

    public fkk_1(boolean bl) {
        this.b = bl;
    }

    public String a() {
        return this.a;
    }

    public int b() {
        return this.d;
    }

    public long c() {
        return this.c;
    }

    public void a(long l) {
        this.c = l;
    }

    public boolean d() {
        return this.b;
    }

    public boolean e() {
        return this.e;
    }

    public void f() {
        this.e = true;
    }

    public String toString() {
        return this.a;
    }
}

