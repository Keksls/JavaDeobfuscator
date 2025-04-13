/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import org.apache.log4j.Logger;

public class Vd<TQuotaType extends Va<TQuotaObjectType>, TQuotaObjectType extends RI> {
    private static final Logger b = Logger.getLogger(Vd.class);
    private static final boolean c = false;
    protected final TIntObjectHashMap<TQuotaType> a = new TIntObjectHashMap();

    protected Vd() {
    }

    public void a(TQuotaType TQuotaType) {
        if (this.a.containsKey(((UZ)TQuotaType).a())) {
            b.warn((Object)("Surcharge du quota pour le referenceId " + ((UZ)TQuotaType).a() + " : \u00e9trange"));
        }
        this.a.put(((UZ)TQuotaType).a(), TQuotaType);
    }

    protected void a(TQuotaObjectType TQuotaObjectType) {
        Va va = (Va)this.a.get(TQuotaObjectType.a());
        if (va != null) {
            va.a(TQuotaObjectType);
        }
    }

    protected void b(TQuotaObjectType TQuotaObjectType) {
        Va va = (Va)this.a.get(TQuotaObjectType.a());
        if (va != null) {
            va.b(TQuotaObjectType);
        }
    }

    public boolean a(int n) {
        Va va = (Va)this.a.get(n);
        if (va != null) {
            return va.d();
        }
        return true;
    }

    public boolean b(int n) {
        return this.a.get(n) != null;
    }

    public TIntObjectIterator<TQuotaType> a() {
        return this.a.iterator();
    }

    public TIntObjectHashMap<TQuotaType> b() {
        return this.a;
    }

    public void c() {
        this.a.forEachValue((TObjectProcedure)new Ve(this));
    }
}

