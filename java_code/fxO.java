/*
 * Decompiled with CFR 0.152.
 */
public class fxO
extends fxP {
    public fxO() {
        this.c();
    }

    public fxS b() {
        return (fxS)this.a(0);
    }

    @Override
    public String a() {
        return this.b().g();
    }

    @Override
    public void b(String string) {
        this.B();
        this.b().c(string);
    }

    @Override
    public void c(String string) {
        this.b().c(this.b().j() + string);
    }
}

