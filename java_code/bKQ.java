/*
 * Decompiled with CFR 0.152.
 */
public class bKQ
extends bKH {
    private final bLl a;

    public bKQ(bLl bLl2, Runnable runnable) {
        super(runnable);
        this.a = bLl2;
    }

    @Override
    public bKG aV_() {
        return bKG.c;
    }

    @Override
    public void a(faC faC2) {
        faC2.v().add(this.a.c());
    }

    @Override
    protected void b(faC faC2) {
        faC2.v().remove(this.a.c());
    }

    @Override
    public boolean a() {
        return this.a != null;
    }

    @Override
    public String b() {
        return this.a.b();
    }

    @Override
    public int aW_() {
        return this.a.c().b();
    }

    public exw_1 g() {
        return this.a.c();
    }
}

