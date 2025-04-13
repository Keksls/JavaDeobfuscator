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

@Criterion(description="Get the minimum protector satisfaction of a monster family", signatures={@Signature(params={@Parameter(name="familyId", type=VarType.NUMBER)})})
public class eur
extends esi_0 {
    private final aoq_1 a;

    @Override
    public boolean a() {
        return true;
    }

    public eur(ArrayList<aot_2> arrayList) {
        this.a = (aoq_1)arrayList.get(0);
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        long l = this.a.a(object, object2, object3, object4);
        Optional<fgv_0> optional = erQ.b(object, object2, object3, object4);
        Integer n = optional.map(arg_0 -> erQ.f.apply(arg_0)).map(arg_0 -> erQ.a.apply(arg_0)).map(arg_0 -> erQ.b.apply(arg_0)).map(tIntObjectHashMap -> new eus_0(l).a((TIntObjectHashMap<aeo_2>)tIntObjectHashMap)).map(arg_0 -> erQ.d.apply(arg_0)).orElse(0);
        return this.e() * (long)n.intValue();
    }

    @Override
    public Enum c() {
        return eyO.bt;
    }
}

