/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fgE
 */
public abstract class fge_0<TProtector extends fgy_0> {
    protected static final Logger b = Logger.getLogger(fge_0.class);
    private final TIntObjectHashMap<TProtector> a = new TIntObjectHashMap();
    final List<fgh_0<? super TProtector>> c = new ArrayList<fgh_0<? super TProtector>>();
    private final List<fgh_0<? super TProtector>> d = new ArrayList<fgh_0<? super TProtector>>();

    protected fge_0() {
    }

    public void a(fgh_0<? super TProtector> fgh_02) {
        if (!this.c.contains(fgh_02)) {
            this.c.add(fgh_02);
        }
    }

    public void b(fgh_0<? super TProtector> fgh_02) {
        this.d.add(fgh_02);
    }

    private void a() {
        this.c.removeAll(this.d);
        this.d.clear();
    }

    public boolean a(TProtector TProtector) {
        int n = ((fgy_0)TProtector).B();
        fgy_0 fgy_02 = (fgy_0)this.a.get(n);
        if (fgy_02 != null && fgy_02 != TProtector) {
            b.error((Object)("Un protecteur avec cet ID (" + n + ") est d\u00e9j\u00e0 pr\u00e9sent enregistr\u00e9, et n'est pas celui-ci."));
            return false;
        }
        if (((fgy_0)TProtector).E() == null) {
            b.error((Object)("Tentative d'enregistrement d'un protecteur avec des donn\u00e9es incorrectes : " + TProtector));
            return false;
        }
        this.a.put(n, TProtector);
        try {
            this.a();
            int n2 = this.c.size();
            for (int k = 0; k < n2; ++k) {
                this.c.get(k).a(TProtector);
            }
            this.a();
        }
        catch (Exception exception) {
            b.error((Object)("Exception lev\u00e9e par un observer lors de l'enregistrement d'un protecteur (ID=" + n + ")"), (Throwable)exception);
        }
        return true;
    }

    public void a(fgm_0<? super TProtector> fgm_02, Collection<? super TProtector> collection) {
        this.a.forEachEntry((TIntObjectProcedure)new fgf_0(this, fgm_02, collection));
    }

    @Nullable
    public TProtector e(int n) {
        return (TProtector)((fgy_0)this.a.get(n));
    }

    public void b() {
        if (!this.c.isEmpty()) {
            this.a();
            this.a.forEachValue((TObjectProcedure)new fgg_0(this));
            this.a();
        }
        this.a.clear();
    }

    public TIntObjectIterator<TProtector> c() {
        return this.a.iterator();
    }

    public TProtector d() {
        ArrayList arrayList = new ArrayList(this.a.valueCollection());
        return (TProtector)((fgy_0)arrayList.get(Hw.a(arrayList.size())));
    }
}

