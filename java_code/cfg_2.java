/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.Optional;

/*
 * Renamed from cfG
 */
class cfg_2
implements adx_1<cuu_2> {
    cfg_2() {
    }

    @Override
    public boolean a(cuu_2 cuu_22) {
        Optional optional = bhh_1.a(end_0.e);
        if (optional.isEmpty()) {
            return false;
        }
        evm_2 evm_22 = (evm_2)optional.get();
        Map<Integer, Integer> map = evm_22.a();
        map.merge(cuu_22.b(), cuu_22.c(), Integer::sum);
        if (map.getOrDefault(cuu_22.b(), 0) <= 0) {
            map.remove(cuu_22.b());
        }
        exk_2 exk_22 = eyo_1.g().g(cuu_22.b());
        if (cuu_22.c() > 0) {
            bjy_1.a(exk_22, cuu_22.c(), null);
        } else {
            bjy_1.a(exk_22, -cuu_22.c());
        }
        bmr_1 bmr_12 = bjb_1.a.g();
        if (bmr_12 == null) {
            return false;
        }
        euu_2.a(bmr_12.R(), epq_22 -> ((bHi)epq_22.dS()).b());
        return false;
    }

    @Override
    public int a() {
        return 13014;
    }
}

