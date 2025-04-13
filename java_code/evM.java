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
import java.util.Optional;

@Criterion(description="Is there a resource satisfaction on the protector of the current zone?", signatures={@Signature(description="Check satisfaction for specific resource family", params={@Parameter(name="familyId", type=VarType.NUMBER)})})
public class evM
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private final aoq_1 b;

    public evM(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = (aoq_1)arrayList.get(0);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        Optional<fgv_0> optional = erQ.b(object, object2, object4, object3);
        long l = this.b.a(object, object2, object3, object4);
        if (optional.isPresent()) {
            fgy_0 fgy_02 = optional.get().h();
            if (fgy_02 == null) {
                return -1;
            }
            return Optional.of(fgy_02).map(arg_0 -> erQ.a.apply(arg_0)).map(arg_0 -> erQ.c.apply(arg_0)).map(tIntObjectHashMap -> new evn_0(l).a((TIntObjectHashMap<aeo_2>)tIntObjectHashMap)).orElse(false) != false ? 0 : -1;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.gB;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        a.add(aov_1Array);
    }
}

