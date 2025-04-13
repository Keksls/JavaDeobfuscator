/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class feo
extends fde<feh_0> {
    static final fdi_0 c = new fdi_0(new aqi_2("Nothing", new aqo_2[0]));
    public static final fdv_0<feo> b = new fep();

    feo(long l, int n, int n2, boolean bl, Iterable<fdf_0> iterable) {
        super(l, n, n2, bl, iterable);
    }

    @Override
    public void a(List<aot_2> list) {
    }

    @Override
    public fdj_0 i() {
        return fdj_0.z;
    }

    @Override
    public boolean a(feh_0 feh_02) {
        faU faU2 = feh_02.a();
        faX faX2 = faU2.fE().m();
        fcq_0 fcq_02 = faX2.D().c();
        return fcq_02 != null && fcq_02.a() == feh_02.e();
    }
}

