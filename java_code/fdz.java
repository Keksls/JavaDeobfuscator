/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;

public class fdz
extends fde<fex_0> {
    static final fdi_0 c = new fdi_0(new aqi_2("Empty", new aqo_2[0]));
    public static final fdv_0<fdz> b = new fda_0();

    fdz(long l, int n, int n2, boolean bl, Iterable<fdf_0> iterable) {
        super(l, n, n2, bl, iterable);
    }

    @Override
    public void a(List<aot_2> list) {
    }

    @Override
    public fdj_0 i() {
        return fdj_0.h;
    }

    @Override
    public boolean a(fex_0 fex_02) {
        Object object;
        if (!fex_02.f().w()) {
            return false;
        }
        epq_2 epq_22 = (epq_2)fex_02.a();
        if (epq_22 == fex_02.h()) {
            return false;
        }
        faX faX2 = ((epq_2)fex_02.a()).fH();
        if (epq_22 == fex_02.g()) {
            object = fex_02.h().fE();
            if (!faX.a(object.m(), faX2)) {
                return false;
            }
            if (!object.t()) {
                return true;
            }
        }
        object = fex_02.i();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            faU faU2 = (faU)e2;
            faV faV2 = faU2.fE();
            if (!faX.a(faV2.m(), faX2) || faV2.t()) continue;
            return true;
        }
        return false;
    }
}

