/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TShortObjectHashMap
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TShortObjectHashMap;

/*
 * Renamed from Pf
 */
public abstract class pf_0<T extends pj_0>
extends TB<T> {
    private final TShortObjectHashMap<abn_1<ph_0>> b = new TShortObjectHashMap();
    private final TIntObjectHashMap<pg_0> c = new TIntObjectHashMap();

    public final void a(pi_0[] pi_0Array) {
        for (pi_0 pi_02 : pi_0Array) {
            this.b.put(pi_02.a(), pi_02.b());
        }
    }

    public final void a(int n, short s2, int n2, byte by, int n3, int n4, int n5) {
        this.c.put(n, (Object)new pg_0(s2, n2, by, n3, n4, n5));
    }

    public final TIntIntHashMap a(short s2) {
        TIntIntHashMap tIntIntHashMap = new TIntIntHashMap();
        TIntObjectIterator tIntObjectIterator = this.c.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            pg_0 pg_02 = (pg_0)tIntObjectIterator.value();
            if (pg_02.f != s2) continue;
            tIntIntHashMap.put(tIntObjectIterator.key(), pg_02.a);
        }
        return tIntIntHashMap;
    }

    public final abn_1<ph_0> a(int n) {
        pg_0 pg_02 = (pg_0)this.c.get(n);
        if (pg_02 == null) {
            a.error((Object)("Aucune d\u00e9finition pour la vue de viewModelId=" + n));
            return null;
        }
        short s2 = pg_02.f;
        abn_1 abn_12 = (abn_1)this.b.get(s2);
        if (abn_12 == null) {
            a.error((Object)("Aucune factory d'enregistr\u00e9e pour le viewTypeId=" + s2));
        }
        return abn_12;
    }

    public final ph_0 b(int n) {
        abn_1<ph_0> abn_12 = this.a(n);
        if (abn_12 == null) {
            return null;
        }
        pg_0 pg_02 = (pg_0)this.c.get(n);
        if (pg_02 == null) {
            return null;
        }
        ph_0 ph_02 = abn_12.b();
        ph_02.a(n);
        ph_02.b(pg_02.a);
        ph_02.a(pg_02.b);
        ph_02.a(pg_02.b == 0);
        ph_02.c(pg_02.c);
        ph_02.a(pg_02.d, pg_02.e);
        return ph_02;
    }
}

