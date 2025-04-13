/*
 * Decompiled with CFR 0.152.
 */
public class eGH
extends eGN {
    protected static final float v = 100.0f;

    public eGH() {
    }

    public eGH(ru_0 ru_02) {
        super(ru_02);
    }

    public eGH(ru_0 ru_02, boolean bl) {
        super(ru_02, bl);
    }

    public eGH aG() {
        eGH eGH2 = new eGH();
        eGH2.w = this.w;
        eGH2.y = this.y;
        return eGH2;
    }

    @Override
    public void M() {
        super.M();
        if (this.w == null) {
            return;
        }
        if (this.w.b() == 0) {
            eps_0 eps_02 = (eps_0)this.w;
            if (eps_02.t()) {
                this.c(eps_02.p());
            }
            if (this.w == eps_0.J) {
                this.c(2140);
            }
        }
    }

    @Override
    boolean aD() {
        if (super.aD()) {
            return true;
        }
        if (this.w != eps_0.A) {
            return false;
        }
        Su su = this.aM();
        if (!(su instanceof epq_2)) {
            return false;
        }
        epq_2 epq_22 = (epq_2)su;
        if (epq_22.gY() != 5) {
            return false;
        }
        return !this.a(eff_0.t);
    }

    @Override
    protected void a(rs_0 rs_02) {
        this.m = rs_02.c(this.m);
    }

    @Override
    void aI() {
        this.aM().b(this.w).d(this.m);
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aG();
    }
}

