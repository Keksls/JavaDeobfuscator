/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TLongObjectHashMap;

public class cDq
implements akj_0,
cde_0 {
    private final TLongObjectHashMap<cDr> a = new TLongObjectHashMap();
    private String b = null;

    private akr_0 b(alo_1 alo_12, int n, int n2) {
        if (!(alo_12 instanceof biI)) {
            return null;
        }
        biI biI2 = (biI)alo_12;
        epq_1 epq_12 = biI2.bI().Z_();
        long l = 910L;
        if (epq_12 instanceof epn_2) {
            l = l * 10000L + (long)(n != -1 ? n : (int)epq_12.s());
            l = l * 10L + (long)biI2.bI().gX();
        } else {
            l = l * 100000L + (long)(n != -1 ? n : (int)epq_12.s());
        }
        l = l * 100L + (long)n2;
        cDr cDr2 = (cDr)this.a.get(l);
        if (cDr2 == null) {
            return null;
        }
        return cDr2.a();
    }

    @Override
    public akr_0 a(alo_1 alo_12, int n) {
        return this.b(alo_12, -1, n);
    }

    @Override
    public akr_0 a(alo_1 alo_12, int n, int n2) {
        return this.b(alo_12, n2, n);
    }

    public void a() {
        this.a(this.b);
    }

    public void a(String string) {
        this.b = string;
        atg_2 atg_22 = new atg_2();
        ath_2 ath_22 = new ath_2();
        atg_22.a(string);
        atg_22.a(ath_22, new aqy_2[0]);
        atg_22.l();
        this.a.clear();
        ati_2 ati_22 = ath_22.a();
        long l = 0L;
        aqx_2 aqx_22 = ati_22.f("prefix");
        if (aqx_22 != null) {
            l = aqx_22.h();
        }
        for (aqx_2 aqx_23 : ati_22.e("bark")) {
            int n = 0;
            aqx_2 aqx_24 = aqx_23.f("type");
            if (aqx_24 != null) {
                n = aqx_24.g();
            }
            for (aqx_2 aqx_25 : aqx_23.e("skin")) {
                Object object;
                TIntArrayList tIntArrayList = new TIntArrayList();
                aqx_2 aqx_26 = aqx_25.f("value");
                if (aqx_26 != null) {
                    object = aqx_26.c();
                    String[] stringArray = ((String)object).split(",");
                    for (String string2 : stringArray) {
                        int n2 = Co.a((Object)string2.trim(), -1);
                        if (n2 == -1) continue;
                        tIntArrayList.add(n2);
                    }
                }
                object = new cDr();
                for (aqx_2 aqx_27 : aqx_25.e("sound")) {
                    akr_0 akr_02 = this.a(aqx_27);
                    if (akr_02 == null) continue;
                    ((cDr)object).a(akr_02);
                }
                int n3 = tIntArrayList.size();
                for (int k = 0; k < n3; ++k) {
                    long l2 = l;
                    l2 = l2 * 100000L + (long)tIntArrayList.get(k);
                    l2 = l2 * 100L + (long)n;
                    this.a.put(l2, object);
                }
            }
        }
        this.a.compact();
    }
}

