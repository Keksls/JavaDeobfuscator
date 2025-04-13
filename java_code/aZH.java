/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.ArrayList;
import java.util.HashMap;

public class aZH
implements ajh_1 {
    public static final String a = "shortcuts";
    public static final String b = "bindNumberList";
    public static final String d = "currentBind";
    public static final String e = "binds";
    public static final String f = "listFilter";
    private final HashMap<String, aZF> g = new HashMap();
    private final TLongObjectHashMap<String> h = new TLongObjectHashMap();
    private final ArrayList<Long> i = new ArrayList();
    private aZF j;
    private static short k = 0;
    private final TLongObjectHashMap<aZE> l = new TLongObjectHashMap();
    private final fwl m = new fwl();
    private final String[] n = new String[]{"shortcuts", "bindNumberList", "currentBind", "binds"};
    private static final aZH o = new aZH();

    public static aZH a() {
        return o;
    }

    @Override
    public String[] d() {
        return this.n;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            ArrayList<aZE> arrayList = new ArrayList<aZE>();
            TLongObjectIterator tLongObjectIterator = this.l.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                ArrayList<aZF> arrayList2 = new ArrayList<aZF>();
                aZE aZE2 = (aZE)tLongObjectIterator.value();
                for (aZF aZF2 : this.g.values()) {
                    any_1 any_12 = aZF2.e();
                    if (any_12 == null || any_12.k() == null || !aZE2.a().equals(any_12.k())) continue;
                    arrayList2.add(aZF2);
                }
                arrayList2.sort(new aZI(this));
                aZE2.a(arrayList2);
                arrayList.add(aZE2);
            }
            return arrayList;
        }
        if (string.equals(d)) {
            return this.j;
        }
        if (string.equals(e)) {
            return this.e("binding");
        }
        if (string.equals(f)) {
            return this.m;
        }
        return this.g.get(string);
    }

    private ArrayList<aZF> e(String string) {
        ArrayList<aZF> arrayList = new ArrayList<aZF>();
        for (aZF aZF2 : this.g.values()) {
            if (!aZF2.h().equalsIgnoreCase(string)) continue;
            arrayList.add(aZF2);
        }
        return arrayList;
    }

    private boolean f(String string) {
        return string.equals("common") || string.equals("world") || string.equals("fight") || string.equals("binding") || string.equals("default");
    }

    public aZF a(String string) {
        return this.g.get(string);
    }

    public void b() {
        any_1[] any_1Array;
        this.g.clear();
        this.h.clear();
        this.l.clear();
        k = 0;
        for (any_1 any_12 : any_1Array = aZG.e().c()) {
            String string2 = any_12.j();
            if (any_12.g() != null && this.f(string2)) {
                int n;
                if (string2.equals("binding")) {
                    k = (short)(k + 1);
                }
                this.g.put(any_12.g(), new aZF(any_12));
                this.h.put(Hw.c(any_12.b(), any_12.l()), (Object)any_12.g());
                String string3 = any_12.k();
                if (string3 != null && !this.l.containsKey((long)(n = string3.hashCode()))) {
                    this.l.put((long)n, (Object)new aZE(string3));
                }
                fis_1.a().a((ajf_1)this, any_12.g());
                continue;
            }
            this.i.add(Hw.c(any_12.b(), any_12.l()));
        }
        this.m.a((T string) -> this.l.forEachValue(aZE2 -> {
            aZE2.a((String)string);
            return true;
        }));
        this.a((aZF)null);
    }

    public boolean a(long l) {
        return this.i.contains(l);
    }

    public boolean b(long l) {
        return this.h.containsKey(l) || this.i.contains(l);
    }

    public aZF c(long l) {
        aZF aZF2;
        String string = (String)this.h.get(l);
        if (string != null && (aZF2 = this.g.get(string)) != null) {
            return aZF2;
        }
        return null;
    }

    public void c() {
        this.b();
        bOw bOw2 = azu_0.j().m();
        if (bOw2 != null) {
            fis_1.a().a((ajf_1)bOw2.v(), "keyList");
        }
        fis_1.a().a((ajf_1)this, this.n);
    }

    public void a(aZF aZF2) {
        this.j = aZF2;
        fis_1.a().a((ajf_1)this, d);
    }

    public aZF e() {
        return this.j;
    }

    public any_1 c(String string) {
        if ((k = (short)(k + 1)) > 20) {
            return null;
        }
        return new any_1("binding" + k, -1, "!/common/bind ", false, false, false, false, false, string);
    }

    public void a(boolean bl) {
        if (bl) {
            ArrayList<aZF> arrayList = this.e("binding");
            if (arrayList.size() > 0) {
                this.a(arrayList.get(0));
            }
        } else {
            this.a((aZF)null);
        }
    }
}

