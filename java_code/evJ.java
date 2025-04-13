/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import java.util.ArrayList;

@Criterion(description="Check if a new player is in the same fight team")
public final class evJ
extends esf {
    public evJ(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.c(object, object2, object4, object3);
        elm_0<?> elm_02 = erQ.a(object, object4);
        byte by = eqq_12.Y();
        if (elm_02 == null) {
            return -1;
        }
        boolean bl = elm_02.j().stream().filter(epq_22 -> epq_22.Y() == by).anyMatch(epq_22 -> eag_0.a(epq_22.U_()));
        return bl ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.dR;
    }
}

