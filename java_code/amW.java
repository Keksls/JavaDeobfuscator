/*
 * Decompiled with CFR 0.152.
 */
public abstract class amW
extends ams_1 {
    protected int a = 0;

    protected void a(int n) {
        this.a = n;
        for (int k = this.j.d() - 1; k >= 0; --k) {
            amo_1 amo_12 = (amo_1)this.j.h(k);
            amo_12.a(this.b(amo_12.c()));
        }
    }

    @Override
    protected final boolean b(int n) {
        return acw.a().a(this.a, n);
    }
}

