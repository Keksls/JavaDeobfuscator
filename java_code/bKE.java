/*
 * Decompiled with CFR 0.152.
 */
public abstract class bKE
extends bKH {
    protected final boolean a;
    private final String b;

    bKE(boolean bl, String string, Runnable runnable) {
        super(runnable);
        this.a = bl;
        this.b = string;
    }

    @Override
    public boolean a() {
        return this.a;
    }

    @Override
    public String b() {
        return bae.h().a(this.b, new Object[0]);
    }

    public boolean c() {
        return this.a;
    }

    public String e() {
        return this.b;
    }
}

