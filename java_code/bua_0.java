/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bua
 */
public class bua_0 {
    private static final Logger b = Logger.getLogger(bua_0.class);
    public static final bua_0 a = new bua_0();
    private final TIntObjectHashMap<btZ> c = new TIntObjectHashMap();
    private final TIntObjectHashMap<ArrayList<btZ>> d = new TIntObjectHashMap();

    public void a(btZ btZ2) {
        int n = btZ2.b();
        ArrayList<btZ> arrayList = (ArrayList<btZ>)this.d.get(n);
        if (arrayList == null) {
            arrayList = new ArrayList<btZ>();
            this.d.put(n, arrayList);
        }
        arrayList.add(btZ2);
        this.c.put(btZ2.f(), (Object)btZ2);
    }

    public void a(bvi_2 bvi_22) {
        int n = bvi_22.b();
        String[] stringArray = bvi_22.a();
        ArrayList arrayList = (ArrayList)this.d.get(n);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int n2 = arrayList.size();
        for (int k = 0; k < n2; ++k) {
            btZ btZ2 = (btZ)arrayList.get(k);
            String[] stringArray2 = btZ2.c();
            try {
                if (!btZ2.g() || !this.a(stringArray, stringArray2)) continue;
                btZ2.a(bvi_22);
                continue;
            }
            catch (Exception exception) {
                b.error((Object)("Probl\u00e8me \u00e0 l'execution d'un event Client id=" + btZ2.f()), (Throwable)exception);
            }
        }
    }

    public btZ a(int n) {
        return (btZ)this.c.get(n);
    }

    private boolean a(String[] stringArray, String[] stringArray2) {
        if (stringArray == null || stringArray2 == null || stringArray.length == 0 || stringArray2.length == 0) {
            return true;
        }
        for (int k = 0; k < stringArray2.length; ++k) {
            if (stringArray[k] == null || stringArray2[k] == null || stringArray[k].equals(stringArray2[k])) continue;
            return false;
        }
        return true;
    }

    public void a() {
        fpm_0.b().a(bvo_2.a);
        fpm_0.b().a(bvo_2.a);
    }

    public void b() {
        this.c.forEachValue((TObjectProcedure)new bub_1(this));
    }
}

