/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eIn
 */
public class ein_0
extends efx_0 {
    protected static final aqr_2 v = new eFw(new eFv("Niveau de container al\u00e9atoire", new eFu("Niveau min", eFx.b), new eFu("Niveau max (exclu)", eFx.b)));

    @Override
    @NotNull
    protected efn_0 a(ejh_0 ejh_02) {
        efn_0 efn_02 = efn_0.a(false, false, ejh_02);
        efn_02.a(this.m);
        return efn_02;
    }

    @Override
    public void j(sd_0 sd_02) {
        if (this.c == null) {
            return;
        }
        int n = ((efh_0)this.c).a(0, this.aZ(), eFb.a);
        int n2 = ((efh_0)this.c).a(1, this.aZ(), eFb.a);
        this.m = Hw.b(n, n2);
    }

    @Override
    public sd_0<efh_0, efi_0> x() {
        ein_0 ein_02 = new ein_0();
        ein_02.m = this.m;
        return ein_02;
    }

    @Override
    public aqr_2 c_() {
        return v;
    }
}

