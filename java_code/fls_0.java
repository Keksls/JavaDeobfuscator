/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.iterator.TShortFloatIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.map.hash.TShortFloatHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.iterator.TShortFloatIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.map.hash.TShortFloatHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from fls
 */
public class fls_0 {
    private static final Logger b = Logger.getLogger(fls_0.class);
    public static final fls_0 a = new fls_0();
    private final TLongObjectHashMap<TShortFloatHashMap> c = new TLongObjectHashMap();
    private final HashSet<Integer> d = new HashSet();

    public boolean a(short s2, float f2, wt_0 wt_02, wt_0 wt_03) {
        return this.a(-1L, s2, f2, wt_02, wt_03);
    }

    public boolean a(long l, short s2, float f2, wt_0 wt_02, wt_0 wt_03) {
        flr_0 flr_02 = new flr_0(wt_02, f2, s2, l);
        flq_0 flq_02 = new flq_0(wt_03, s2, l);
        return this.a(l, s2, wt_02, wt_03, flr_02, flq_02);
    }

    public boolean a(long l, short s2, wt_0 wt_02, wt_0 wt_03, we_0 we_02, we_0 we_03) {
        if (wt_02 == null || wt_03 == null || wc_0.p().d(wt_03) || wt_02.e(wt_03)) {
            return false;
        }
        ArrayList arrayList = (ArrayList)this.d(s2).get(l);
        if (arrayList != null) {
            for (flp_0 flp_02 : arrayList) {
                if (!flp_02.a().e(wt_02) || !flp_02.a().c(wt_03)) continue;
                wc_0.p().a(flp_02);
            }
        }
        wc_0.p().b(we_02);
        wc_0.p().b(we_03);
        return true;
    }

    void a(long l, short s2, float f2) {
        TShortFloatHashMap tShortFloatHashMap = (TShortFloatHashMap)this.c.get(l);
        if (tShortFloatHashMap == null) {
            tShortFloatHashMap = new TShortFloatHashMap();
        }
        tShortFloatHashMap.put(s2, f2);
        this.c.put(l, (Object)tShortFloatHashMap);
    }

    void a(long l, short s2) {
        TShortFloatHashMap tShortFloatHashMap = (TShortFloatHashMap)this.c.get(l);
        if (tShortFloatHashMap == null) {
            b.warn((Object)("Aucune commande de bonus enregistr\u00e9e pour l'instance d'id=" + l));
            return;
        }
        tShortFloatHashMap.remove(s2);
        if (tShortFloatHashMap.isEmpty()) {
            this.c.remove(l);
        }
    }

    void a(int n) {
        this.d.add(n);
    }

    void b(int n) {
        this.d.remove(n);
    }

    public boolean a(int n, wt_0 wt_02, wt_0 wt_03, we_0 we_02, we_0 we_03) {
        if (wt_02 == null || wt_03 == null || wc_0.p().d(wt_03) || wt_02.e(wt_03)) {
            return false;
        }
        ArrayList<flo_0> arrayList = this.e(n);
        if (arrayList != null) {
            for (flo_0 flo_02 : arrayList) {
                if (!flo_02.a().e(wt_02) || !flo_02.a().c(wt_03)) continue;
                wc_0.p().a(flo_02);
            }
        }
        wc_0.p().b(we_02);
        wc_0.p().b(we_03);
        return true;
    }

    public float a(long l) {
        float f2 = this.b(l, (short)402);
        if (f2 == 1.0f) {
            return this.a();
        }
        return f2;
    }

    public float b(long l) {
        float f2 = this.b(l, (short)429);
        if (f2 == 1.0f) {
            return this.b();
        }
        return f2;
    }

    public float c(long l) {
        float f2 = this.b(l, (short)99);
        if (f2 == 1.0f) {
            return this.c();
        }
        return f2;
    }

    public float d(long l) {
        float f2 = this.b(l, (short)314);
        if (f2 == 1.0f) {
            return this.d();
        }
        return f2;
    }

    public float e(long l) {
        float f2 = this.b(l, (short)279);
        if (f2 == 1.0f) {
            return this.e();
        }
        return f2;
    }

    public float a() {
        return this.a((short)402);
    }

    public float b() {
        return this.a((short)429);
    }

    public float c() {
        return this.a((short)99);
    }

    public float d() {
        return this.a((short)314);
    }

    public float e() {
        return this.a((short)279);
    }

    public float f() {
        return this.a((short)249);
    }

    public float g() {
        return this.a((short)454);
    }

    public boolean c(int n) {
        return this.d.contains(n);
    }

    public HashSet<Integer> h() {
        return this.d;
    }

    public float a(short s2) {
        return this.b(-1L, s2);
    }

    public float b(long l, short s2) {
        TShortFloatHashMap tShortFloatHashMap = (TShortFloatHashMap)this.c.get(l);
        if (tShortFloatHashMap == null) {
            return 1.0f;
        }
        float f2 = tShortFloatHashMap.get(s2);
        return f2 == 0.0f ? 1.0f : f2;
    }

    public boolean b(short s2) {
        for (long l : this.c.keys()) {
            this.a(l, s2);
        }
        TLongObjectIterator tLongObjectIterator = this.d(s2).iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            for (flp_0 flp_02 : (ArrayList)tLongObjectIterator.value()) {
                wc_0.p().a(flp_02);
            }
        }
        return true;
    }

    public boolean c(long l, short s2) {
        this.a(l, s2);
        ArrayList arrayList = (ArrayList)this.d(s2).get(l);
        if (arrayList != null) {
            for (flp_0 flp_02 : arrayList) {
                wc_0.p().a(flp_02);
            }
        }
        return true;
    }

    public String i() {
        ArrayList<abo_2<Long, Float>> arrayList = new ArrayList<abo_2<Long, Float>>();
        ArrayList<abo_2<Long, Float>> arrayList2 = new ArrayList<abo_2<Long, Float>>();
        ArrayList<abo_2<Long, Float>> arrayList3 = new ArrayList<abo_2<Long, Float>>();
        ArrayList<abo_2<Long, Float>> arrayList4 = new ArrayList<abo_2<Long, Float>>();
        ArrayList<abo_2<Long, Float>> arrayList5 = new ArrayList<abo_2<Long, Float>>();
        ArrayList<abo_2<Long, Float>> arrayList6 = new ArrayList<abo_2<Long, Float>>();
        ArrayList<abo_2<Long, Float>> arrayList7 = new ArrayList<abo_2<Long, Float>>();
        Object object = this.c.iterator();
        while (object.hasNext()) {
            object.advance();
            if (object.key() == -1L) continue;
            TShortFloatHashMap tShortFloatHashMap = (TShortFloatHashMap)object.value();
            TShortFloatIterator tShortFloatIterator = tShortFloatHashMap.iterator();
            while (tShortFloatIterator.hasNext()) {
                tShortFloatIterator.advance();
                if (tShortFloatIterator.key() == 402) {
                    arrayList.add(new abo_2<Long, Float>(object.key(), Float.valueOf(tShortFloatIterator.value())));
                    continue;
                }
                if (tShortFloatIterator.key() == 429) {
                    arrayList2.add(new abo_2<Long, Float>(object.key(), Float.valueOf(tShortFloatIterator.value())));
                    continue;
                }
                if (tShortFloatIterator.key() == 99) {
                    arrayList3.add(new abo_2<Long, Float>(object.key(), Float.valueOf(tShortFloatIterator.value())));
                    continue;
                }
                if (tShortFloatIterator.key() == 314) {
                    arrayList4.add(new abo_2<Long, Float>(object.key(), Float.valueOf(tShortFloatIterator.value())));
                    continue;
                }
                if (tShortFloatIterator.key() == 279) {
                    arrayList5.add(new abo_2<Long, Float>(object.key(), Float.valueOf(tShortFloatIterator.value())));
                    continue;
                }
                if (tShortFloatIterator.key() == 249) {
                    arrayList6.add(new abo_2<Long, Float>(object.key(), Float.valueOf(tShortFloatIterator.value())));
                    continue;
                }
                if (tShortFloatIterator.key() != 454) continue;
                arrayList7.add(new abo_2<Long, Float>(object.key(), Float.valueOf(tShortFloatIterator.value())));
            }
        }
        object = new ani_2();
        this.a(arrayList, (ani_2)object, "===Bonus factor fight===", this.a(), (short)402);
        this.a(arrayList2, (ani_2)object, "===Bonus factor craft===", this.b(), (short)429);
        this.a(arrayList3, (ani_2)object, "===Bonus factor prospection===", this.c(), (short)99);
        this.a(arrayList4, (ani_2)object, "===Bonus factor kamas===", this.d(), (short)314);
        this.a(arrayList5, (ani_2)object, "===Bonus loot tries===", this.e(), (short)279);
        this.a(arrayList6, (ani_2)object, "===Bonus guild bonus learning factor===", this.f(), (short)249);
        this.a(arrayList7, (ani_2)object, "===Bonus pvp factor===", this.g(), (short)454);
        this.a(Collections.emptyList(), (ani_2)object, "===Free Heroes===", 0.0f, (short)88);
        return ((ani_2)object).toString();
    }

    private void a(List<abo_2<Long, Float>> list, ani_2 ani_22, String string, float f2, short s2) {
        ani_22.i().a("FFFFFF").a().a((CharSequence)string).b().j().a((CharSequence)"\n");
        ani_22.a((CharSequence)"G\u00e9n\u00e9ral=").a("00FF00").a(f2).j().a((CharSequence)"\n");
        for (abo_2<Long, Float> tLongObjectIterator2 : list) {
            Long l = tLongObjectIterator2.a();
            ani_22.a((CharSequence)"Instance ").a(l).a((CharSequence)"=").a("00FF00").a(tLongObjectIterator2.b()).j().a((CharSequence)"\n");
        }
        Iterator<abo_2<Long, Float>> iterator = this.d(s2);
        if (!iterator.isEmpty()) {
            ani_22.i().a("FFFFFF").a((CharSequence)"Events pr\u00e9vus :").j().a((CharSequence)"\n");
        }
        TLongObjectIterator tLongObjectIterator = iterator.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            long l = tLongObjectIterator.key();
            if (l == -1L) {
                ani_22.a((CharSequence)"G\u00e9n\u00e9ral");
            } else {
                ani_22.a((CharSequence)"Instance ").a(l);
            }
            ani_22.a((CharSequence)" :\n");
            ArrayList arrayList = (ArrayList)tLongObjectIterator.value();
            for (flp_0 flp_02 : arrayList) {
                ani_22.a((CharSequence)flp_02.toString()).a((CharSequence)"\n");
            }
        }
        ani_22.a((CharSequence)"\n");
    }

    public TLongObjectHashMap<ArrayList<flp_0>> d(int n) {
        TLongObjectHashMap tLongObjectHashMap = new TLongObjectHashMap();
        for (we_0 we_02 : wc_0.p().c()) {
            flp_0 flp_02;
            if (!(we_02 instanceof flp_0) || (flp_02 = (flp_0)we_02).b() != n) continue;
            long l = flp_02.c();
            ArrayList<flp_0> arrayList = (ArrayList<flp_0>)tLongObjectHashMap.get(l);
            if (arrayList == null) {
                arrayList = new ArrayList<flp_0>();
                tLongObjectHashMap.put(l, arrayList);
            }
            arrayList.add(flp_02);
        }
        return tLongObjectHashMap;
    }

    public ArrayList<flo_0> e(int n) {
        ArrayList<flo_0> arrayList = new ArrayList<flo_0>();
        for (we_0 we_02 : wc_0.p().c()) {
            flo_0 flo_02;
            if (!(we_02 instanceof flo_0) || (flo_02 = (flo_0)we_02).b() != n) continue;
            arrayList.add(flo_02);
        }
        return arrayList;
    }
}

