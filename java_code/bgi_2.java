/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bGi
 */
public abstract class bgi_2 {
    protected static final Logger a = Logger.getLogger(bgi_2.class);
    private final int b;
    private apc_2 c;
    private ArrayList<aot_2> d;
    private String e;

    bgi_2(int n) {
        this.b = n;
    }

    public void a() {
        this.g();
    }

    public void a(euo_1 euo_12) {
        this.c(euo_12);
        ArrayList<aot_2> arrayList = this.b(euo_12);
        if (UM.a(euo_12.f(), arrayList)) {
            this.d = arrayList;
        } else {
            a.error((Object)("L'action " + euo_12.b() + " de l'ie generic id=" + this.b() + " n'a pas des param\u00e8tres du bon type"));
        }
    }

    private ArrayList<aot_2> b(euo_1 euo_12) {
        String[] stringArray = euo_12.d();
        ArrayList<aot_2> arrayList = new ArrayList<aot_2>(stringArray.length);
        int n = stringArray.length;
        for (int k = 0; k < n; ++k) {
            try {
                ArrayList<aot_2> arrayList2 = eyS.a(stringArray[k]);
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                    continue;
                }
                arrayList.add(null);
                continue;
            }
            catch (Exception exception) {
                a.error((Object)("Erreur lors de la compilation du crit\u00e8re sur une action de l'ie generic id=" + this.b() + " actionid = " + euo_12.b() + " params : " + stringArray[k]), (Throwable)exception);
            }
        }
        return arrayList;
    }

    private void c(euo_1 euo_12) {
        apc_2 apc_22 = null;
        try {
            apc_22 = eyS.c(euo_12.c());
        }
        catch (Exception exception) {
            a.error((Object)("Erreur de compilation du crit\u00e8re sur l'action id=" + euo_12.b() + " de l'ie generic id=" + this.b()), (Throwable)exception);
        }
        this.c = apc_22;
    }

    public int b() {
        return this.b;
    }

    public apc_2 c() {
        return this.c;
    }

    final aot_2 a(int n) {
        return this.d.get(n);
    }

    public final int d() {
        return this.d.size();
    }

    public ArrayList<aot_2> e() {
        return this.d;
    }

    public String f() {
        return this.e;
    }

    protected void a(String string) {
        this.e = string;
    }

    protected abstract void g();

    public abstract boolean a(blx_1 var1);

    public abstract boolean b(blx_1 var1);
}

