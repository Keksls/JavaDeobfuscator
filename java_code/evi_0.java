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
 * Renamed from evi
 */
@Criterion(description="Return true if the target has the specified cosmetic item and it's activated", signatures={@Signature(description="Per category", params={@Parameter(name="type", type=VarType.NUMBER), @Parameter(name="itemRefId", type=VarType.NUMBER)})})
public final class evi_0
extends esf {
    private final aoq_1 a;
    private final aoq_1 b;

    public evi_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = (aoq_1)arrayList.get(0);
        this.a = (aoq_1)arrayList.get(1);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (!(object instanceof epq_2)) {
            return -1;
        }
        epq_2 epq_22 = (epq_2)object;
        Optional<emy_0> optional = ena_0.a().a(epq_22.R(), end_0.i);
        long l = this.a.a(object, object2, object3, object4);
        ft_1 ft_12 = ft_1.b((int)this.b.a(object, object2, object3, object4));
        if (optional.isEmpty() || ft_12 == null) {
            return -1;
        }
        ebo_0 ebo_02 = (ebo_0)optional.get();
        if (ebo_02.b(epq_22.a_(), ft_12).map(fv_22 -> fv_22.b().stream().anyMatch(fk_22 -> (long)fk_22.c() == l)).orElse(false).booleanValue()) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.hz;
    }
}

