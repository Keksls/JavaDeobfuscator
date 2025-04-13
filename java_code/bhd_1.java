/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from bHD
 */
public class bhd_1
extends exo_2<bjw_1>
implements ajh_1 {
    private static final Logger r = Logger.getLogger(bhd_1.class);
    public static final String a = "name";
    public static final String b = "nameUnderline";
    public static final String d = "id";
    public static final String e = "items";
    public static final String f = "nameAndNumber";
    public static final String g = "itemNumber";
    public static final String h = "bonusThreshold";
    public static final String i = "condition";
    public static final String j = "bonusByItem";
    public static final String k = "allBonuses";
    public static final String l = "requirement";
    public static final String m = "isEquipable";
    public static final String n = "isPreviewable";
    public static final String o = "description";
    public static final String[] p = new String[]{"name", "nameUnderline", "nameAndNumber", "items", "itemNumber", "bonusThreshold", "condition", "requirement", "isEquipable", "isPreviewable", "allBonuses", "bonusByItem", "description", "id"};
    private ArrayList<String> s;
    private Object[] t;

    public bhd_1(short s2, int n, List<bjw_1> list) {
        super(s2, n, list);
    }

    public String a() {
        return bae.h().a(20, (long)this.h(), new Object[0]);
    }

    public String b() {
        if (!bae.h().a(21, (long)this.h())) {
            return null;
        }
        return bae.h().a(21, (long)this.h(), new Object[0]);
    }

    public void c() {
        ArrayList<apc_2> arrayList = new ArrayList<apc_2>();
        List list = this.i();
        for (int k = 0; k < list.size(); ++k) {
            bjw_1 bjw_12 = (bjw_1)list.get(k);
            arrayList.add(bjw_12.a(exz_1.c));
        }
        this.s = eDm.a(arrayList);
    }

    private byte l() {
        byte by = 0;
        bmr_1 bmr_12 = azu_0.j().k();
        eyz_0 eyz_02 = bmr_12.cG();
        for (bjw_1 bjw_12 : this) {
            if (eyz_02.a(bmr_12.dC(), bjw_12.n()) == null) continue;
            by = (byte)(by + 1);
        }
        return by;
    }

    public String a(int n) {
        ArrayList<efh_0> arrayList = this.b(n);
        if (arrayList == null) {
            return "";
        }
        return bhd_1.a(arrayList);
    }

    public Object[] e() {
        List list = this.i();
        TIntArrayList tIntArrayList = new TIntArrayList();
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        for (int k = 0; k < list.size(); ++k) {
            exg_2 exg_22;
            TLongObjectIterator<exg_2> tLongObjectIterator;
            bjw_1 bjw_12 = (bjw_1)list.get(k);
            int n = bjw_12.n();
            exk_2 exk_22 = null;
            int n2 = -1;
            int n3 = -1;
            bmr_1 bmr_12 = azu_0.j().c(cyt_0.a()) ? cyt_0.s() : azu_0.j().k();
            exk_22 = eyf_1.a(bmr_12.R(), n);
            if (exk_22 == null) {
                tLongObjectIterator = bmr_12.da().i();
                while (exk_22 == null && tLongObjectIterator.hasNext()) {
                    tLongObjectIterator.advance();
                    exg_22 = (exg_2)tLongObjectIterator.value();
                    exk_22 = exg_22.c(n);
                }
            }
            tLongObjectIterator = bmr_12.da().i();
            while (exk_22 == null && tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                exg_22 = (exg_2)tLongObjectIterator.value();
                exk_22 = exg_22.c(n);
            }
            if (exk_22 != null) {
                tIntObjectHashMap.put(n3 == -1 ? n : n3, (Object)exk_22);
            } else if (n2 == -1) {
                tIntObjectHashMap.put(n3 == -1 ? n : n3, (Object)bjw_12);
            }
            if (n3 == -1) continue;
            tIntArrayList.add(n3);
        }
        this.t = new Object[tIntObjectHashMap.size()];
        tIntObjectHashMap.values(this.t);
        return this.t;
    }

    public static String a(ArrayList<efh_0> arrayList) {
        arrayList.sort(box_1.a);
        edb_0 edb_02 = new edb_0(arrayList);
        ArrayList<String> arrayList2 = edb_02.a();
        return arrayList2.isEmpty() ? "" : arrayList2.get(0);
    }

    @Override
    public Object b(String string) {
        if (string == null) {
            return null;
        }
        if (string.equalsIgnoreCase(a)) {
            return this.a();
        }
        if (string.equalsIgnoreCase(b)) {
            return "<u>" + this.a() + "</u>";
        }
        if (string.equals(d)) {
            return this.h();
        }
        if (string.equals(f)) {
            byte by = this.l();
            ani_2 ani_22 = new ani_2();
            int n = this.f();
            if (by == n) {
                ani_22.i().a(new azf_2(0.0f, 0.7f, 0.0f, 1.0f).w());
            }
            ani_22.a((CharSequence)this.a()).a((CharSequence)" (").a(by).a((CharSequence)"/").d(n).a((CharSequence)")");
            return ani_22.r();
        }
        if (string.equals(m)) {
            TLongObjectIterator<exg_2> tLongObjectIterator = azu_0.j().k().da().i();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                exg_2 exg_22 = (exg_2)tLongObjectIterator.value();
                for (bjw_1 bjw_12 : this) {
                    if (!exg_22.a(bjw_12.n())) continue;
                    return true;
                }
            }
            return false;
        }
        if (string.equals(n)) {
            return true;
        }
        if (string.equals(g)) {
            byte by = this.l();
            return "(" + by + "/" + this.f() + ")";
        }
        if (string.equals(h)) {
            if (!this.q.isEmpty()) {
                Object[] objectArray = new Integer[this.q.size()];
                int n = 0;
                for (int n2 : this.q.keys()) {
                    objectArray[n++] = n2;
                }
                Arrays.sort(objectArray);
                return objectArray;
            }
            return null;
        }
        if (string.equals(e)) {
            return this.e();
        }
        if (string.equals(j)) {
            return this.m();
        }
        if (string.equals(k)) {
            return this.a(this.f());
        }
        if (string.equals(o)) {
            return this.b();
        }
        if (string.equalsIgnoreCase(l)) {
            Object object = "";
            if (this.s != null) {
                for (String string2 : this.s) {
                    object = (String)object + string2 + "\n";
                }
            }
            return object;
        }
        return null;
    }

    @Override
    public int f() {
        return this.e().length;
    }

    private String m() {
        ani_2 ani_22 = new ani_2();
        int n = 0;
        for (int k = 0; k < this.e().length; ++k) {
            boolean bl;
            int n2 = k + 1;
            String string = this.a(n2);
            if (string.length() == 0) continue;
            if (n > 0) {
                ani_22.m().m();
            }
            ani_22.a();
            boolean bl2 = bl = this.l() >= n2;
            if (bl) {
                ani_22.a("00b400");
            }
            ani_22.a((CharSequence)bae.h().a("object", n2)).a((CharSequence)" :");
            ani_22.b().m();
            ani_22.a((CharSequence)string);
            ++n;
        }
        return ani_22.r();
    }

    @Override
    public String[] d() {
        return p;
    }

    public void g() {
        this.t = null;
        fis_1.a().a((ajf_1)this, m);
        fis_1.a().a((ajf_1)this, p);
    }
}

