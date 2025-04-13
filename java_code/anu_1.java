/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from anU
 */
public abstract class anu_1 {
    public static final int a = 200;
    private long b = 200L;
    private long c;
    private anv_1 d;

    public anv_1 a() {
        return this.a(false, false);
    }

    public anv_1 a(boolean bl) {
        return this.a(bl, false);
    }

    public anv_1 a(boolean bl, boolean bl2) {
        if (this.d == null) {
            this.d = this.c();
        }
        if (bl || this.c != 0L && System.currentTimeMillis() - this.c > this.b) {
            this.a(this.d, bl2);
        }
        if (this.c == 0L) {
            this.c = System.currentTimeMillis();
        }
        return this.d;
    }

    public void b() {
        this.c = 0L;
        if (this.d != null) {
            this.d.a();
            this.d.a("");
            this.d.b("");
            this.a(this.d);
        }
    }

    public void a(long l) {
        this.b = l;
    }

    protected abstract anv_1 c();

    protected abstract void a(anv_1 var1, boolean var2);

    protected abstract void a(anv_1 var1);

    public long d() {
        return this.c;
    }
}

