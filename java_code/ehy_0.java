/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eHY
 */
public final class ehy_0
extends efx_0 {
    private static final aqr_2 v = new eFw(new eFv("Facteurs sur le nombre de cibles", new eFu("Niveau par cible", eFx.c)));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public ehy_0() {
        this.M();
    }

    public ehy_0 aD() {
        return new ehy_0();
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        float f2 = ((efh_0)this.c).a(0, this.aZ());
        List<List<Su>> list = this.s();
        int n = 0;
        for (List<Su> list2 : list) {
            n += list2.size();
        }
        this.m = (int)Math.floor((float)n * f2);
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

