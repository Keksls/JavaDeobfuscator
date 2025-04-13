/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * Renamed from evG
 */
@Criterion(description="Is there a monster satisfaction on the protector of the current zone?", signatures={@Signature(description="Check satisfaction for specific monster family", params={@Parameter(name="familyId", type=VarType.NUMBER)})})
public class evg_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private final aoq_1 b;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public evg_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = (aoq_1)arrayList.get(0);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        Optional<fgv_0> optional = erQ.b(object, object2, object4, object3);
        long l = this.b.a(object, object2, object3, object4);
        return optional.map(arg_0 -> erQ.f.apply(arg_0)).map(arg_0 -> erQ.a.apply(arg_0)).map(arg_0 -> erQ.b.apply(arg_0)).map(tIntObjectHashMap -> new evh_0(l).a((TIntObjectHashMap<aeo_2>)tIntObjectHashMap)).orElse(false) != false ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.gA;
    }

    static {
        a.add(esa_0.l);
    }
}

