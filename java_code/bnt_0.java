/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.procedure.TObjectProcedure;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bNt
 */
public class bnt_0
implements enb_0 {
    public static final bnt_0 a = new bnt_0();

    private bnt_0() {
    }

    @Override
    public void a(long l, @NotNull emy_0 emy_02) {
        if (emy_02.e() != end_0.h) {
            return;
        }
        fhz fhz2 = (fhz)emy_02;
        fis_1.a().a("pvpState", fhz2.a().a());
        ddp.a().d().a();
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return;
        }
        bmf_2.a().a((TObjectProcedure<blx_1>)((TObjectProcedure)blx_12 -> {
            if (blx_12.ba() == fhD.a) {
                return true;
            }
            blx_12.z();
            return true;
        }));
    }
}

