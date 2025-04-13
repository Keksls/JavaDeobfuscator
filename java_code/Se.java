/*
 * Decompiled with CFR 0.152.
 */
public class Se {
    private final int a;
    private final apc_2 b;
    private final byte c;
    private final boolean d;

    public Se(int n, apc_2 apc_22, byte by, boolean bl) {
        this.a = n;
        this.b = apc_22;
        this.c = by;
        this.d = bl;
    }

    public boolean a() {
        return this.d;
    }

    public boolean a(Sh sh, Sg sg) {
        return this.b == null || this.b.b(sh, sg, this, sh.Q_());
    }

    public int b() {
        return this.a;
    }

    public byte c() {
        return this.c;
    }
}

