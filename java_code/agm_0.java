/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/*
 * Renamed from agM
 */
public interface agm_0
extends agp_0 {
    public List<ags_0> a();

    default public List<ags_0> a(agn_0 agn_02) {
        return this.a(agn_02, true);
    }

    default public List<ags_0> a(agn_0 agn_02, boolean bl) {
        ArrayList<ags_0> arrayList = new ArrayList<ags_0>(this.a());
        if (bl) {
            arrayList.removeIf(Objects::isNull);
        }
        if (agn_02 == agn_0.a) {
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    public List<ajb_1> a(agk_0<?, ?> var1);

    default public List<ajb_1> a(agk_0<?, ?> agk_02, agn_0 agn_02) {
        return this.a(agk_02, agn_02, true);
    }

    default public List<ajb_1> a(agk_0<?, ?> agk_02, agn_0 agn_02, boolean bl) {
        ArrayList<ajb_1> arrayList = new ArrayList<ajb_1>(this.a(agk_02));
        if (bl) {
            arrayList.removeIf(Objects::isNull);
        }
        if (agn_02 == agn_0.a) {
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    @Override
    default public <R extends ajd_1 & ajw_1> R b(agk_0<?, ?> agk_02) {
        return (R)agi_0.a(agk_02, this.a(agn_0.a));
    }

    @Override
    default public <W extends aje_1 & ajw_1> W c(agk_0<?, ?> agk_02) {
        return (W)agi_0.a(agk_02, this.a(agn_0.a));
    }
}

