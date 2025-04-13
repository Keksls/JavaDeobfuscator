/*
 * Decompiled with CFR 0.152.
 */
public class aYU
extends aXj {
    private final String a;
    private final flz_0 b;

    public aYU(String string) {
        this(string, flz_0.b);
    }

    public aYU(String string, flz_0 flz_02) {
        this.a = string;
        this.b = flz_02;
    }

    @Override
    public boolean a() {
        return this.a != null && !this.a.isEmpty();
    }

    @Override
    public void b() {
        daX.a(this.b, flx_0.a, (Object)this.a);
    }
}

