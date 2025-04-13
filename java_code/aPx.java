/*
 * Decompiled with CFR 0.152.
 */
public class aPx {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;

    aPx(int n, int n2, boolean bl, boolean bl2, int n3) {
        this.a = n;
        this.b = n2;
        this.d = bl;
        this.e = bl2;
        this.c = n3;
    }

    public int a() {
        return this.b + this.c;
    }

    public boolean b() {
        return !this.d;
    }

    static aPx a(aPx aPx2, int n) {
        return new aPx(aPx2.a, aPx2.b, aPx2.d, aPx2.e, n);
    }

    public String toString() {
        return "Block{minZ=" + this.a + ", maxZ=" + this.b + ", zModifier=" + this.c + ", walkable=" + this.d + ", blockLos=" + this.e + "}";
    }
}

