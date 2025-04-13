/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import java.util.ArrayList;
import java.util.Optional;

/*
 * Renamed from evq
 */
@Criterion(description="Return true if the target has the specified cosmetic item", signatures={@Signature(description="itemRefId", params={@Parameter(name="itemRefId", type=VarType.NUMBER)})})
public final class evq_0
extends esf {
    private final aoq_1 a;

    public evq_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.a = (aoq_1)arrayList.get(0);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (!(object instanceof epq_2)) {
            return -1;
        }
        epq_2 epq_22 = (epq_2)object;
        Optional<emy_0> optional = ena_0.a().a(epq_22.R(), end_0.i);
        long l = this.a.a(object, object2, object3, object4);
        for (ft_1 ft_12 : ebk_0.a) {
            if (!ebk_0.b(ft_12, (int)l)) continue;
            return 0;
        }
        if (optional.isEmpty()) {
            return -1;
        }
        ebo_0 ebo_02 = (ebo_0)optional.get();
        for (ft_1 ft_13 : ebk_0.a) {
            if (!ebo_02.a(ft_13, l)) continue;
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.hy;
    }
}

