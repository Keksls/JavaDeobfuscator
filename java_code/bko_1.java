/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bKO
 */
public class bko_1
extends bkp_0 {
    public bko_1(long l, long l2) {
        super(l, l2, () -> {});
    }

    public bko_1(long l, long l2, bkk_0 bkk_02) {
        super(l, l2, bkk_02::g);
    }

    @Override
    public bKG aV_() {
        return bKG.h;
    }

    @Override
    public void a(faC faC2) {
        if (!this.a()) {
            this.b(faC2);
            return;
        }
        faC2.e((int)this.a);
        faC2.f((int)this.b);
    }

    @Override
    protected void b(faC faC2) {
        faC2.e(-1).f(-1);
    }

    @Override
    public String b() {
        if (this.g() && this.h()) {
            if (this.a == this.b) {
                return String.valueOf(this.a);
            }
            return this.a + " - " + this.b;
        }
        if (this.g()) {
            return "\u2265 " + this.a;
        }
        return "\u2264 " + this.b;
    }
}

