/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from Rh
 */
public class rh_0 {
    protected static final Logger a = Logger.getLogger(rh_0.class);
    private static final rh_0 b = new rh_0();
    private final abc_2<rg_0> c = new abc_2();

    public static rh_0 a() {
        return b;
    }

    private rh_0() {
    }

    public static rg_0 a(ri_0 ri_02, String string, boolean bl) {
        try {
            rg_0 rg_02 = ri_02.c().newInstance();
            rg_02.a(bl);
            if (rg_02.a(string)) {
                return rg_02;
            }
            a.error((Object)("Impossible d'initialiser l'HMIAction de type " + ri_02 + " parametres=" + string));
            return null;
        }
        catch (InstantiationException instantiationException) {
            a.error((Object)("Erreur d'instanciation d'un actionType : " + ri_02.b()));
            return null;
        }
        catch (IllegalAccessException illegalAccessException) {
            a.error((Object)("Acc\u00e8s non authoris\u00e9 pour l'instanciation d'un actionType : " + ri_02.b()));
            return null;
        }
    }

    public rg_0 a(byte by, String string, boolean bl) {
        return this.b(ri_0.a(by), string, bl);
    }

    private rg_0 b(ri_0 ri_02, String string, boolean bl) {
        rg_0 rg_02 = rh_0.a(ri_02, string, bl);
        if (rg_02 != null) {
            this.c.a(rg_02.b(), rg_02);
        }
        return rg_02;
    }

    public static ArrayList<rg_0> a(String string) {
        ArrayList<rg_0> arrayList = new ArrayList<rg_0>();
        if (string.length() == 0) {
            return arrayList;
        }
        for (String string2 : Cz.a(string, '~')) {
            rg_0 rg_02 = rg_0.b(string2);
            if (rg_02 == null) continue;
            arrayList.add(rg_02);
        }
        return arrayList;
    }

    public rg_0 a(int n) {
        return this.c.a(n);
    }

    public int b() {
        return this.c.a();
    }
}

