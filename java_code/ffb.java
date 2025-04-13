/*
 * Decompiled with CFR 0.152.
 */
public class ffb {
    private final int a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final ffa e;

    public ffb(int n, boolean bl, boolean bl2, short s2, boolean bl3, float f2, float f3, float f4) {
        this.a = n;
        this.b = !bl;
        this.c = !bl2;
        this.d = bl3;
        this.e = new ffa(s2, f2, f3, f4);
    }

    public int a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public ffa e() {
        return this.e;
    }
}

