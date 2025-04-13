/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eGz
 */
public final class egz_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new aqq_2[0]);

    @Override
    public aqr_2 c_() {
        return v;
    }

    public egz_0() {
        this.M();
    }

    public egz_0 aD() {
        return new egz_0();
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        int n;
        if (!(this.h instanceof efq_0)) {
            return;
        }
        tg_0 tg_02 = this.h.e();
        if (tg_02 == null) {
            return;
        }
        int n2 = this.g.d();
        if (!tg_02.c(n2, n = this.g.e())) {
            return;
        }
        ((efq_0)this.h).l().c(this.g);
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S() {
        return true;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

