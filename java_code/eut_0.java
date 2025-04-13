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

/*
 * Renamed from eut
 */
@Criterion(description="Get the maximum protector satisfaction of a resource family", signatures={@Signature(params={@Parameter(name="familyId", type=VarType.NUMBER)})})
public class eut_0
extends esi_0 {
    private final aoq_1 a;

    @Override
    public boolean a() {
        return true;
    }

    public eut_0(ArrayList<aot_2> arrayList) {
        this.a = (aoq_1)arrayList.get(0);
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        long l = this.a.a(object, object2, object3, object4);
        Optional<fgv_0> optional = erQ.b(object, object2, object3, object4);
        Integer n = optional.map(arg_0 -> erQ.f.apply(arg_0)).map(arg_0 -> erQ.a.apply(arg_0)).map(arg_0 -> erQ.c.apply(arg_0)).map(tIntObjectHashMap -> new euu(l).a((TIntObjectHashMap<aeo_2>)tIntObjectHashMap)).map(arg_0 -> erQ.e.apply(arg_0)).orElse(0);
        return this.e() * (long)n.intValue();
    }

    @Override
    public Enum c() {
        return eyO.bt;
    }
}

