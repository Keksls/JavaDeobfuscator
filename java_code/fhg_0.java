/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from fhG
 */
public class fhg_0<ReferenceRessource extends fhf_0> {
    protected final TIntObjectHashMap<ReferenceRessource> a = new TIntObjectHashMap();

    public void a(ReferenceRessource ReferenceRessource) {
        this.a.put(((fhf_0)ReferenceRessource).h(), ReferenceRessource);
    }

    public ReferenceRessource a(int n) {
        return (ReferenceRessource)((fhf_0)this.a.get(n));
    }

    public boolean b() {
        return this.a.isEmpty();
    }

    public TIntObjectIterator<ReferenceRessource> c() {
        return this.a.iterator();
    }
}

