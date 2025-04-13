/*
 * Decompiled with CFR 0.152.
 */
public class bKN
extends bkp_0 {
    public bKN(long l, long l2) {
        super(l, l2, () -> {});
    }

    public bKN(long l, long l2, bkk_0 bkk_02) {
        super(l, l2, bkk_02::f);
    }

    @Override
    public bKG aV_() {
        return bKG.f;
    }

    @Override
    public void a(faC faC2) {
        if (!this.a()) {
            this.b(faC2);
            return;
        }
        faC2.a(this.a);
        faC2.b(this.b);
    }

    @Override
    protected void b(faC faC2) {
        faC2.a(-1L).b(-1L);
    }

    @Override
    public String b() {
        if (this.g() && this.h()) {
            if (this.a == this.b) {
                return this.a + " $";
            }
            return this.a + " - " + this.b + " $";
        }
        if (this.g()) {
            return "\u2265 " + this.a + " $";
        }
        return "\u2264 " + this.b + " $";
    }
}

