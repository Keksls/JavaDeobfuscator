/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public final class eHW
extends efx_0 {
    private static final aqr_2 v = new eFw(new eFv("Facteurs sur le PA/PM/PW", new eFu("Niveau par PA", eFx.c), new eFu("Niveau par PM", eFx.c), new eFu("Niveau par PW", eFx.c)));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public eHW() {
        this.M();
    }

    public eHW aD() {
        return new eHW();
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        fio_0 fio_02 = (fio_0)this.h.i().e();
        if (fio_02 == null) {
            return;
        }
        float f2 = ((efh_0)this.c).a(0, this.aZ());
        float f3 = ((efh_0)this.c).a(1, this.aZ());
        float f4 = ((efh_0)this.c).a(2, this.aZ());
        Object Spell = fio_02.r();
        int n = ((fin_0)Spell).a((int)fio_02.c());
        int n2 = ((fin_0)Spell).d(fio_02.c());
        int n3 = ((fin_0)Spell).b((int)fio_02.c());
        float f5 = (float)n * f2 + (float)n2 * f3 + (float)n3 * f4;
        this.m = (int)Math.floor(f5);
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

