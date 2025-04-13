/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.Arrays;

/*
 * Renamed from cbg
 */
public class cbg_2
implements eQg {
    @Override
    public void a(eQf eQf2, epl_0 epl_02) {
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            return;
        }
        if (epl_02.w()) {
            cbf_2.a("has_hero_in_party", true);
            if (epl_02.o() == bmr_12.R()) {
                cbf_2.a("has_own_hero_in_party", true);
            }
        }
        if (epl_02.v()) {
            cbf_2.a("has_sidekick_in_party", true);
            if (epl_02.o() == bmr_12.R()) {
                cbf_2.a("has_own_sidekick_in_party", true);
            }
        }
    }

    @Override
    public void a(eQf eQf2, epl_0 epl_02, boolean bl) {
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            return;
        }
        TLongObjectHashMap<epl_0> tLongObjectHashMap = eQf2.a(2);
        if (tLongObjectHashMap.isEmpty()) {
            cbf_2.a("has_sidekick_in_party", false);
            cbf_2.a("has_own_sidekick_in_party", false);
        } else {
            boolean bl2 = Arrays.stream(tLongObjectHashMap.values()).anyMatch(object -> ((epl_0)object).o() == bmr_12.R());
            cbf_2.a("has_own_sidekick_in_party", bl2);
        }
        TLongObjectHashMap<epl_0> tLongObjectHashMap2 = eQf2.a(1);
        if (tLongObjectHashMap2.isEmpty()) {
            cbf_2.a("has_hero_in_party", false);
            cbf_2.a("has_own_hero_in_party", false);
        } else {
            cbh_2 cbh_22 = new cbh_2(bmr_12.R());
            tLongObjectHashMap2.forEachValue((TObjectProcedure)cbh_22);
            cbf_2.a("has_hero_in_party", cbh_22.a() > 0);
            cbf_2.a("has_own_hero_in_party", cbh_22.b() > 0);
        }
    }

    @Override
    public void a(eQf eQf2, long l, long l2) {
    }
}

