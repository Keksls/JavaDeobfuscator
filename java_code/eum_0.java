/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ContiguousSet
 *  com.google.common.collect.DiscreteDomain
 *  com.google.common.collect.Range
 *  gnu.trove.list.array.TLongArrayList
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;
import gnu.trove.list.array.TLongArrayList;
import java.util.ArrayList;

/*
 * Renamed from eum
 */
@Criterion(description="Returns a pseudorandom, uniformly distributed value between 0 (inclusive) and the specified value (exclusive)", signatures={@Signature(description="Default", params={@Parameter(name="limit", type=VarType.NUMBER)}), @Signature(description="With exclusion", params={@Parameter(name="limit", type=VarType.NUMBER), @Parameter(name="exclusionList", type=VarType.NUMBERLIST)})})
public class eum_0
extends esi_0 {
    private final aoq_1 a;
    private final aom_1 b;

    public eum_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.a = (aoq_1)arrayList.get(0);
        this.b = arrayList.size() > 1 ? (aom_1)arrayList.get(1) : new aoy_2(new ArrayList());
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        if (!this.a.a()) {
            throw new aob_1("Limit not an integer");
        }
        long l2 = this.a.a(object, object2, object3, object4);
        TLongArrayList tLongArrayList = this.b.a(object, object2, object3, object4);
        Long[] longArray = (Long[])ContiguousSet.create((Range)Range.closedOpen((Comparable)Long.valueOf(0L), (Comparable)Long.valueOf(l2)), (DiscreteDomain)DiscreteDomain.longs()).stream().filter(l -> !tLongArrayList.contains(l.longValue())).toArray(Long[]::new);
        if (longArray.length <= 0) {
            throw new aob_1("No number to roll");
        }
        return longArray[Hw.a(longArray.length)];
    }

    @Override
    public Enum c() {
        return eyO.aN;
    }
}

