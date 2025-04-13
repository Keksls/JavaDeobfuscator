/*
 * Decompiled with CFR 0.152.
 */
public abstract class bLP
extends fwt<bLP> {
    public bLP(long l, azj_2 azj_22, String string, String string2) {
        super(l, azj_22, string, string2);
    }

    @Override
    public abstract void a(blo_0 var1);

    public boolean l() {
        return this.q() != null;
    }

    public void c(blo_0 blo_02) {
        bLP bLP2 = (bLP)this.q();
        if (bLP2 != null) {
            blo_02.a(bLP2);
        }
    }

    public abstract boolean e();

    public abstract boolean f();

    public abstract void b(blo_0 var1);
}

