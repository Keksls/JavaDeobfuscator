/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public final class eHX
extends efx_0 {
    private static final aqr_2 v = new eFw(new eFv("Facteurs sur le nombre de cases", new eFu("Niveau par case parcourue", eFx.c)));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eHX() {
        this.M();
    }

    public eHX aD() {
        return new eHX();
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        float f2 = ((efh_0)this.c).a(0, this.aZ());
        aff_1 aff_12 = this.e.P_();
        int n = this.g.e(aff_12);
        float f3 = (float)n * f2;
        this.m = (int)Math.floor(f3);
    }

    @Override
    @NotNull
    protected efn_0 a(ejh_0 ejh_02) {
        efn_0 efn_02 = efn_0.a(false, false, ejh_02);
        efn_02.a(this.m);
        return efn_02;
    }

    @Override
    public void z() {
        super.z();
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

