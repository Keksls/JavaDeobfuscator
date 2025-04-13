/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from Pe
 */
public class pe_0<T extends pj_0, C extends pf_0<T>>
extends TA<T, C> {
    private final TLongObjectHashMap<int[]> e = new TLongObjectHashMap();

    public void a(TD tD, int[] nArray) {
        this.a(tD);
        this.e.put(tD.a(), (Object)nArray);
    }

    @Override
    protected void a(T t, TD tD) {
        int[] nArray = (int[])this.e.get(((TG)t).a_());
        assert (nArray != null) : "element interactif " + ((TG)t).a_() + " n'a pas de vue";
        for (int n : nArray) {
            ph_0 ph_02;
            if (b.isTraceEnabled()) {
                b.trace((Object)("Adding view " + n + " to element " + ((TG)t).a_()));
            }
            if ((ph_02 = this.a(n)) == null) continue;
            ((pj_0)t).a(ph_02);
        }
    }

    public ph_0 a(int n) {
        return ((pf_0)this.c).b(n);
    }
}

