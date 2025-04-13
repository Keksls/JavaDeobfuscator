/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;

public class fdH
extends fde<fex_0> {
    static final fdi_0 c = new fdi_0(new aqi_2("Nothing", new aqo_2[0]));
    public static final fdv_0<fdH> b = new fdI();

    fdH(long l, int n, int n2, boolean bl, Iterable<fdf_0> iterable) {
        super(l, n, n2, bl, iterable);
    }

    @Override
    public void a(List<aot_2> list) {
    }

    @Override
    public fdj_0 i() {
        return fdj_0.r;
    }

    @Override
    public boolean a(fex_0 fex_02) {
        epq_2 epq_22;
        if (fex_02.f() != emr_2.b) {
            return false;
        }
        fgp_0 fgp_02 = fex_02.e();
        if (fgp_02 == null) {
            return false;
        }
        epq_2 epq_23 = (epq_2)fex_02.a();
        if (epq_23 == (epq_22 = fex_02.h())) {
            return false;
        }
        Collection<? extends epq_2> collection = fex_02.i();
        for (epq_2 epq_24 : collection) {
            epq_2 epq_25 = epq_24;
            if (epq_25.gY() != 1 || !fgp_02.i(epq_25.Z_().t())) continue;
            return true;
        }
        return false;
    }
}

