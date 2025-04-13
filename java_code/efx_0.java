/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eFX
 */
abstract class efx_0
extends ejh_0 {
    efx_0() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected final void b(sd_0 sd_02, boolean bl) {
        fil_0 fil_02 = fim_0.a().a(this.o());
        if (fil_02 == null) {
            return;
        }
        if (!this.D()) {
            return;
        }
        efn_0 efn_02 = this.a((ejh_0)sd_02);
        try {
            for (efh_0 efh_02 : fil_02) {
                efh_02.a((Sm)this.k(), this.e, this.m(), efc_0.a(), this.g.d(), this.g.e(), this.g.f(), this.f, efn_02, false);
            }
        }
        catch (Exception exception) {
            a.error((Object)("Exception levee lors de l'execution d'un RunningEffectGroupRandomContainerLevel id " + this.o()), (Throwable)exception);
        }
        finally {
            efn_02.a();
        }
    }

    @NotNull
    protected abstract efn_0 a(ejh_0 var1);

    @Override
    public final boolean Q() {
        return true;
    }

    @Override
    public final boolean R() {
        return false;
    }

    @Override
    public final boolean S() {
        return true;
    }
}

