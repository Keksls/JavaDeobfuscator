/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.Optional;

/*
 * Renamed from ezD
 */
public class ezd_2 {
    public static final ezd_2 a = new ezd_2();
    private final TIntObjectHashMap<ezb_2> b = new TIntObjectHashMap();
    final TIntIntHashMap c = new TIntIntHashMap();

    public void a(ezb_2 ezb_22) {
        this.b.put(ezb_22.a(), (Object)ezb_22);
        ezb_22.a(new eze_2(this, ezb_22));
    }

    public ezb_2 a(int n) {
        return (ezb_2)this.b.get(n);
    }

    public void a(TObjectProcedure<ezb_2> tObjectProcedure) {
        this.b.forEachValue(tObjectProcedure);
    }

    public ezb_2 b(int n) {
        return this.a(this.c.get(n));
    }

    public Optional<ezb_2> a(long l) {
        Optional<ezb_2> optional = this.b.valueCollection().stream().filter(ezb_22 -> ezb_22.f().contains(l)).findAny();
        return Optional.ofNullable(optional.orElse(null));
    }
}

