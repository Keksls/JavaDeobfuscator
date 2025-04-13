/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from epH
 */
public abstract class eph_2<B extends epq_1> {
    protected static final Logger a = Logger.getLogger(eph_2.class);
    protected final TShortObjectHashMap<B> b = new TShortObjectHashMap();
    protected final TIntObjectHashMap<List<B>> c = new TIntObjectHashMap();

    @Nullable
    public B b(short s2) {
        return (B)((epq_1)this.b.get(s2));
    }

    public void a(B b2) {
        if (b2 == null) {
            a.error((Object)"[esp\u00e8ce ignor\u00e9e] on tente d'ajouter une esp\u00e8ce null");
            return;
        }
        if (this.b.containsKey(b2.s())) {
            a.error((Object)("[esp\u00e8ce ignor\u00e9e] on tente de rajouter une esp\u00e8ce dont l'id existe d\u00e9j\u00e0 pour une autre " + b2.s()));
            return;
        }
        this.b.put(b2.s(), b2);
        int n = b2.t();
        ArrayList<B> arrayList = (ArrayList<B>)this.c.get(n);
        if (arrayList == null) {
            arrayList = new ArrayList<B>();
            this.c.put(n, arrayList);
        }
        arrayList.add(b2);
    }

    public List<B> a(int n) {
        if (!this.c.containsKey(n)) {
            return Collections.emptyList();
        }
        return (List)this.c.get(n);
    }

    public void a(TObjectProcedure<B> tObjectProcedure) {
        this.b.forEachValue(tObjectProcedure);
    }
}

