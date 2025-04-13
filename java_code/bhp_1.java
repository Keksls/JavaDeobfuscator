/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bhP
 */
public final class bhp_1 {
    public static final bhp_1 a = new bhp_1();
    private static final Logger b = Logger.getLogger(bhp_1.class);
    private final TIntObjectHashMap<bic_1> c = new TIntObjectHashMap();
    private final TIntObjectHashMap<bhq_1> d = new TIntObjectHashMap();
    private final TIntObjectHashMap<bhj_1> e = new TIntObjectHashMap();
    private final TIntObjectHashMap<bhx_2> f = new TIntObjectHashMap();
    private final TIntObjectHashMap<bib_2> g = new TIntObjectHashMap();
    private final ArrayList<bhq_1> h = new ArrayList();
    private bhr_1 i;

    public boolean a(int n, String string, boolean bl) {
        this.c.put(n, (Object)new bic_1(n, string, bl));
        return true;
    }

    public boolean a(int n, int n2, String string) {
        bhq_1 bhq_12 = (bhq_1)this.d.get(n2);
        if (bhq_12 == null && n2 != 0) {
            b.error((Object)("Categorie parente non enregistr\u00e9e : " + n2));
            return false;
        }
        bhq_1 bhq_13 = new bhq_1(n, bhq_12, string);
        if (bhq_12 != null) {
            bhq_12.a(bhq_13);
        }
        this.d.put(n, (Object)bhq_13);
        if (bhq_12 == null && !this.h.contains(bhq_13)) {
            this.h.add(bhq_13);
        }
        return true;
    }

    public boolean a(int n, int n2, boolean bl, boolean bl2, String string, String string2, apc_2 apc_22, int n3, long l, boolean bl3, boolean bl4, boolean bl5, int n4, int n5, boolean bl6, int n6, wu_0 wu_02, wx_0 wx_02, boolean bl7, boolean bl8, int n7, byte by, apc_2 apc_23, int n8) {
        bhq_1 bhq_12 = (bhq_1)this.d.get(n2);
        if (bhq_12 != null && !bhq_12.a(4)) {
            while (bhq_12.f() != null) {
                bhq_12 = bhq_12.f();
            }
        }
        if (bhq_12 != null) {
            bhj_1 bhj_12 = new bhj_1(n, bhq_12, bl, bl2, string, string2, apc_22, n3, l, bl3, bl4, bl5, n4, n5, bl6, n6, wu_02, wx_02, bl8, n7, by, apc_23, n8);
            bhj_12.a(bl7);
            this.e.put(n, (Object)bhj_12);
            bhq_12.a(bhj_12);
            return true;
        }
        b.error((Object)("La cat\u00e9gorie sp\u00e9cifi\u00e9e n'est pas enregistr\u00e9e : " + n2));
        return false;
    }

    public boolean a(int n, int n2, int[] nArray, String string, String string2, boolean bl, apc_2 apc_22, apc_2 apc_23, aqe_0[] aqe_0Array) {
        bhj_1 bhj_12 = (bhj_1)this.e.get(n2);
        if (bhj_12 != null) {
            bic_1[] bic_1Array = null;
            if (nArray != null && nArray.length > 0) {
                bic_1Array = new bic_1[nArray.length];
                for (int k = 0; k < nArray.length; ++k) {
                    bic_1Array[k] = (bic_1)this.c.get(nArray[k]);
                    if (bic_1Array[k] != null) continue;
                    b.error((Object)("Une variable sp\u00e9cifi\u00e9e n'est pas enregistr\u00e9e : " + nArray[k]));
                    return false;
                }
            }
            bhx_2 bhx_22 = new bhx_2(n, bhj_12, bic_1Array, string, string2, bl, aqe_0Array);
            bhx_22.a(apc_22);
            bhx_22.b(apc_23);
            this.f.put(n, (Object)bhx_22);
            bhj_12.a(bhx_22);
            return true;
        }
        b.error((Object)("L'achievement sp\u00e9cifi\u00e9 n'est pas enregistr\u00e9 : " + n2));
        return false;
    }

    public boolean a(int n, int n2, OR oR, int[] nArray) {
        bhj_1 bhj_12 = (bhj_1)this.e.get(n2);
        if (bhj_12 == null) {
            b.error((Object)("L'achievement sp\u00e9cifi\u00e9 n'est pas enregistr\u00e9 : " + n2));
            return false;
        }
        if (oR == null) {
            b.error((Object)("Le type de reward sp\u00e9cifi\u00e9 n'existe pas : " + oR));
            return false;
        }
        bib_2 bib_22 = new bib_2(n, bhj_12, oR, nArray);
        this.g.put(n, (Object)bib_22);
        bhj_12.a(bib_22);
        return true;
    }

    public bhj_1 a(int n) {
        return (bhj_1)this.e.get(n);
    }

    public bhr_1 a() {
        if (this.i == null) {
            this.i = new bhr_1(0, this.c, this.e);
        }
        return new bhr_1(this.i);
    }

    public bhq_1 b(int n) {
        return (bhq_1)this.d.get(n);
    }

    public ArrayList<bhq_1> b() {
        return this.h;
    }

    public bhx_2 c(int n) {
        return (bhx_2)this.f.get(n);
    }

    public rn_0 a(String string) {
        TIntObjectIterator tIntObjectIterator = this.c.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bic_1 bic_12 = (bic_1)tIntObjectIterator.value();
            if (!bic_12.b().equals(string)) continue;
            return bic_12;
        }
        return null;
    }

    public boolean a(TIntObjectProcedure<bhj_1> tIntObjectProcedure) {
        return this.e.forEachEntry(tIntObjectProcedure);
    }
}

