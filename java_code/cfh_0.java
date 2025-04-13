/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

/*
 * Renamed from cfH
 */
class cfh_0
implements adx_1<cuv_2> {
    cfh_0() {
    }

    @Override
    public boolean a(cuv_2 cuv_22) {
        bmr_1 bmr_12 = (bmr_1)euw_2.a.d(cuv_22.c());
        ewx_2 ewx_22 = (ewx_2)bmr_12.a(ewl_1.a);
        ewo_1 ewo_12 = new ewo_1(ewx_22);
        Iterator<ewz_1> iterator = cuv_22.b();
        while (iterator.hasNext()) {
            iterator.next().a(ewo_12);
        }
        return false;
    }

    @Override
    public int a() {
        return 12633;
    }
}

