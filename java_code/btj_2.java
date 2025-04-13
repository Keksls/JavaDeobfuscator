/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Comparator;

/*
 * Renamed from bTJ
 */
public class btj_2
implements ajh_1 {
    public static final Comparator<btm_2> a = new btk_2();
    public static final String b = "elements";
    public static final String d = "name";
    public static final String e = "iconStyle";
    public static final String f = "enabled";
    public static final String[] g = new String[]{"elements"};
    private final btu_2 i;
    final TIntObjectHashMap<btm_2> h = new TIntObjectHashMap();

    @Override
    public String[] d() {
        return g;
    }

    public btj_2(btu_2 btu_22) {
        this.i = btu_22;
    }

    @Override
    public Object b(String string) {
        if (string.equals(b)) {
            ArrayList<btm_2> arrayList = this.c();
            btm_2 btm_22 = arrayList.get(0);
            if (!btm_22.e()) {
                btm_22.b();
            }
            return arrayList;
        }
        if (string.equals(d)) {
            int n = this.i.c();
            return n == -1 ? bae.h().a(this.i.a(), new Object[0]) : btc_2.a().a(n);
        }
        if (string.equals(e)) {
            return this.i.b();
        }
        if (string.equals(f)) {
            return !this.h.isEmpty();
        }
        return null;
    }

    private ArrayList<btm_2> c() {
        ArrayList<btm_2> arrayList = new ArrayList<btm_2>();
        this.h.forEachValue((TObjectProcedure)new btl_2(this, arrayList));
        arrayList.sort(a);
        return arrayList;
    }

    public void a(btm_2 btm_22) {
        this.h.put(btm_22.c(), (Object)btm_22);
    }

    public btm_2 a(int n) {
        return (btm_2)this.h.get(n);
    }

    public byte a() {
        return (byte)this.i.c();
    }

    public byte b() {
        return (byte)this.i.ordinal();
    }
}

