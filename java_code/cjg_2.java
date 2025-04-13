/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from cjg
 */
class cjg_2
implements adx_1<cak_0> {
    cjg_2() {
    }

    @Override
    public boolean a(cak_0 cak_02) {
        ArrayList arrayList = new ArrayList();
        euw_2.a.b(azu_0.j().k().R(), bmr_12 -> {
            bot_2 bot_22 = (bot_2)bmr_12.eV();
            erg_1 erg_12 = bot_22.f();
            if (erg_12 == null || erg_12.a() != cak_02.c()) {
                return true;
            }
            arrayList.add(erg_12);
            return true;
        });
        if (arrayList.isEmpty()) {
            return false;
        }
        for (erg_1 erg_12 : arrayList) {
            bxz_1 bxz_12 = new bxz_1(erg_12);
            Iterator<eqw_0> iterator = cak_02.b();
            while (iterator.hasNext()) {
                iterator.next().a(bxz_12);
            }
        }
        return false;
    }

    @Override
    public int a() {
        return 15427;
    }
}

