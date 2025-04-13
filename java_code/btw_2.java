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

/*
 * Renamed from bTW
 */
public class btw_2
implements ajh_1,
esr_1 {
    public static final String a = "itemList";
    public static final String b = "baseResourcesQuantityValue";
    public static final String d = "resourcesQuantityValue";
    public static final String e = "resourcesQuantityText";
    public static final String f = "validEnabled";
    public static final String[] g = new String[]{"itemList", "resourcesQuantityValue", "resourcesQuantityText", "validEnabled"};
    private final TLongObjectHashMap<exi_2> h = new TLongObjectHashMap();
    private int i;
    private final int j;

    @Override
    public String[] d() {
        return g;
    }

    public btw_2(int n) {
        this.j = n;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            ArrayList<exi_2> arrayList = new ArrayList<exi_2>();
            TLongObjectIterator tLongObjectIterator = this.h.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                arrayList.add((exi_2)tLongObjectIterator.value());
            }
            return arrayList;
        }
        if (string.equals(b)) {
            return Float.valueOf((float)this.j / 5.0E7f);
        }
        if (string.equals(d)) {
            return Float.valueOf((float)this.g() / 5.0E7f);
        }
        if (string.equals(e)) {
            ani_2 ani_22 = new ani_2();
            ani_22.a(this.g() > 50000000 ? new azf_2(1.0f, 0.0f, 0.0f, 1.0f).w() : azf_2.e.w());
            ani_22.a((CharSequence)bae.h().a((long)this.g()));
            ani_22.j();
            ani_22.a((CharSequence)(" / " + bae.h().a(50000000L)));
            return ani_22.r();
        }
        if (string.equals(f)) {
            return this.i > 0;
        }
        return null;
    }

    private int g() {
        return this.j + this.i;
    }

    public TLongObjectHashMap<exi_2> a() {
        return this.h;
    }

    public int b() {
        return this.i;
    }

    public void a(exi_2 exi_22) {
        long l = exi_22.a();
        if (!this.h.containsKey(l)) {
            return;
        }
        this.h.remove(l);
        this.i = (int)((long)this.i - esv_1.a(exi_22, exi_22.e()));
        exk_2 exk_22 = azu_0.j().k().da().i(l);
        fis_1.a().a((ajf_1)this, g);
        fis_1.a().a((ajf_1)exk_22, "movable", "deletable");
    }

    public void a(exk_2 exk_22, short s2) {
        long l = exk_22.a();
        if (this.h.containsKey(l)) {
            return;
        }
        exi_2 exi_22 = new exi_2(exk_22.T());
        exi_22.a(l);
        exi_22.a(s2);
        if (exk_22.w()) {
            exi_22.a(exk_22);
        }
        this.h.put(l, (Object)exi_22);
        this.i = (int)((long)this.i + esv_1.a(exi_22, s2));
        fis_1.a().a((ajf_1)this, g);
        fis_1.a().a((ajf_1)exk_22, "movable", "deletable");
    }

    public boolean a(long l) {
        return this.h.containsKey(l);
    }

    public void c() {
        this.h.clear();
        this.i = 0;
        fis_1.a().a((ajf_1)this, g);
    }

    @Override
    public void a(int n) {
        fis_1.a().a((ajf_1)this, e, d);
    }

    public int e() {
        return this.h.size();
    }

    public boolean f() {
        return this.h.isEmpty();
    }
}

