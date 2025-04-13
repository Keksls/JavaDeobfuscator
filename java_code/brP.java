/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;

public class brP {
    private static final Logger b = Logger.getLogger(brP.class);
    public static final brP a = new brP();
    private final Set<Short> c = new HashSet<Short>();
    private final TIntObjectHashMap<brr_0> d = new TIntObjectHashMap();
    private final TIntObjectHashMap<TIntArrayList> e = new TIntObjectHashMap();
    private boolean f = false;

    private brP() {
    }

    public void a() {
        int n9;
        int n2;
        Object object;
        Object object2;
        TIntObjectIterator tIntObjectIterator = bNJ.a().c();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            object2 = (bNI)tIntObjectIterator.value();
            object = eAJ.a(((fhf_0)object2).j());
            if (object == null) continue;
            int n3 = ((fhf_0)object2).l();
            for (int k = 0; k < n3; ++k) {
                bNR bNR2 = (bNR)((fhf_0)object2).a(k);
                n2 = bNR2.g();
                for (n9 = 0; n9 < n2; ++n9) {
                    brw_1 n9 = (brw_1)bNR2.c(n9);
                    if (!n9.d()) continue;
                    for (int n4 : n9.e()) {
                        Object n7;
                        brr_0 brr_02 = (brr_0)this.d.get(n4);
                        if (n4 == 0) continue;
                        if (brr_02 == null) {
                            n7 = bhb_0.d().g(n4);
                            if (n7 == null) {
                                b.error((Object)("Impossible to find the ref item " + n4 + " for step " + k + " of resource " + ((fhf_0)object2).h()));
                                continue;
                            }
                            brr_02 = new bry_0(n4, n9.h(), ((fhf_0)object2).h(), n9.k(), n9.m(), n9.j() > 1, (eAJ)((Object)object), !((exk_2)n7).a(ext_1.r), n9.l(), n9.q());
                            this.d.put(n4, (Object)brr_02);
                        } else {
                            n7 = brr_02.h();
                            int n5 = brr_02.j();
                            bNI bNI2 = (bNI)bNJ.a().a(n5);
                            if (bNI2.j() != ((eAJ)((Object)n7)).b()) {
                                brr_02.b(((fhf_0)object2).h());
                            }
                            int n6 = Math.min(brr_02.e(), n9.k());
                            brr_02.a(n6);
                        }
                        int n8 = n9.l();
                        TIntArrayList n5 = (TIntArrayList)this.e.get(n8);
                        if (n5 == null) {
                            n5 = new TIntArrayList();
                            this.e.put(n8, (Object)n5);
                        }
                        if (n5.contains(n4)) continue;
                        n5.add(n4);
                    }
                }
            }
        }
        object2 = bpc_1.a().c().iterator();
        while (object2.hasNext()) {
            object2.advance();
            object = (bpb_1)object2.value();
            for (int n9 : ((epj_2)object).r()) {
                if (n9 != erl_2.aq.b()) continue;
                this.c.add(((epj_2)object).s());
            }
            TIntObjectIterator tIntObjectIterator2 = ((epj_2)object).o();
            while (tIntObjectIterator2.hasNext()) {
                tIntObjectIterator2.advance();
                brw_1 brw_12 = (brw_1)tIntObjectIterator2.value();
                if (!brw_12.d()) continue;
                int[] nArray = brw_12.e();
                n9 = nArray.length;
                for (n2 = 0; n2 < n9; ++n2) {
                    epw_1 epw_12;
                    epw_1 epw_13;
                    int n10 = nArray[n2];
                    Object object3 = (brr_0)this.d.get(n10);
                    if (object3 == null) {
                        epw_13 = epx_1.b().a(((epj_2)object).t());
                        object3 = new brR(n10, brw_12.h(), epw_13.e(), epw_13.b(), brw_12.k(), brw_12.m(), brw_12.j() > 1, true, brw_12.l(), brw_12.q());
                        this.d.put(n10, object3);
                    } else {
                        int n4;
                        epw_13 = epx_1.b().a(((brr_0)object3).j());
                        epw_12 = epx_1.b().a(((epj_2)object).t());
                        if (epw_13.f() != epy_1.a) {
                            ((brr_0)object3).b(epw_12.b());
                        }
                        n4 = Math.min(((brr_0)object3).e(), brw_12.k());
                        ((brr_0)object3).a(n4);
                    }
                    int epw_132 = brw_12.l();
                    epw_12 = (TIntArrayList)this.e.get(epw_132);
                    if (epw_12 == null) {
                        epw_12 = new TIntArrayList();
                        this.e.put(epw_132, (Object)epw_12);
                    }
                    if (epw_12.contains(n10)) continue;
                    epw_12.add(n10);
                }
            }
        }
        this.f = true;
    }

    public Set<Short> b() {
        if (!this.f) {
            this.a();
        }
        return Collections.unmodifiableSet(this.c);
    }

    public boolean a(short s2) {
        if (!this.f) {
            this.a();
        }
        return this.c.contains(s2);
    }

    public boolean a(int n) {
        TIntArrayList tIntArrayList;
        if (!this.f) {
            this.a();
        }
        return (tIntArrayList = (TIntArrayList)this.e.get(n)) != null && tIntArrayList.size() != 0;
    }

    public List<brr_0> a(int n, int n2) {
        TIntArrayList tIntArrayList;
        if (!this.f) {
            this.a();
        }
        if ((tIntArrayList = (TIntArrayList)this.e.get(n)) != null) {
            ArrayList<brr_0> arrayList = new ArrayList<brr_0>(tIntArrayList.size());
            int n3 = tIntArrayList.size();
            for (int k = 0; k < n3; ++k) {
                brr_0 brr_02 = (brr_0)this.d.get(tIntArrayList.get(k));
                if (brr_02.e() > n2 || !brr_02.l()) continue;
                arrayList.add(brr_02);
            }
            arrayList.sort(brQ.a);
            return arrayList;
        }
        return Collections.emptyList();
    }
}

