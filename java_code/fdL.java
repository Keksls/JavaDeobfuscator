/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;

public class fdL
extends fde<fey_0> {
    static final fdi_0 c = new fdi_0(new aqi_2("Nothing", new aqo_2[0]));
    public static final fdv_0<fdL> b = new fdM();

    fdL(long l, int n, int n2, boolean bl, Iterable<fdf_0> iterable) {
        super(l, n, n2, bl, iterable);
    }

    @Override
    public void a(List<aot_2> list) {
    }

    @Override
    public fdj_0 i() {
        return fdj_0.j;
    }

    @Override
    public boolean a(fey_0 fey_02) {
        if (!fey_02.e().w()) {
            return false;
        }
        Collection<? extends epq_2> collection = fey_02.h();
        for (epq_2 epq_22 : collection) {
            faU faU2 = epq_22;
            if (!faU2.fE().t()) continue;
            return true;
        }
        return false;
    }
}

