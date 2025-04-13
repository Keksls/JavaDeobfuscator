/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import java.util.HashSet;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from diP
 */
final class dip_0
extends akk_2 {
    private final int a = 4500;
    private final int b = 600;

    dip_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "displayFlyingText";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("R", "Valeur rouge appliqu?e au texte", akg_2.e, false), new akf_1("G", "Valeur verte appliqu?e au texte", akg_2.e, false), new akf_1("B", "Valeur bleue appliqu?e au texte", akg_2.e, false), new akf_1("font", "Font ? utiliser", akg_2.c, false), new akf_1("targetId", "Id du mobile concern?", akg_2.b, false), new akf_1("textKey", "Clef de traduction du texte", akg_2.c, false), new akf_1("style", "Style du texte", akg_2.e, false), new akf_1("size", "Taille du texte", akg_2.e, true), new akf_1("textParams", "Param?tres ?ventuels du texte (20 par d?faut)", akg_2.h, true)};
    }

    @Override
    public String b() {
        return "Affiche un texte volant au-dessus d'un mobile donn?";
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        Object[] objectArray;
        float f2 = (float)this.e(0);
        float f3 = (float)this.e(1);
        float f4 = (float)this.e(2);
        String string = this.i(3);
        long l = this.g(4);
        String string2 = this.i(5);
        int n2 = this.d(6);
        int n3 = 20;
        if (n > 7) {
            n3 = Math.max(1, this.d(7));
        }
        if (n > 8) {
            objectArray = new String[n - 8];
            for (int k = 0; k < objectArray.length; ++k) {
                objectArray[k] = this.k(8 + k);
            }
        } else {
            objectArray = new String[]{};
        }
        if (string.isEmpty()) {
            n2 = 5;
            string = "wci";
            n3 = 23;
        }
        bhe_1 bhe_12 = null;
        bhe_1 bhe_13 = bhf_1.a().a(l);
        if (bhe_13 != null && bhe_13.at()) {
            bhe_12 = bhe_13;
        }
        if (bhe_12 == null) {
            return;
        }
        String string3 = bae.h().a(string2, objectArray);
        if (string3 != null && string3.length() > 0) {
            this.a(f2, f3, f4, string, n2, n3, bhe_12, string3);
        }
    }

    private void a(float f2, float f3, float f4, String string, int n, int n2, apv_2 apv_22, String string2) {
        zv_0 zv_02 = new zv_0();
        zu_0 zu_02 = new zu_0(ayq_1.a(string, n, n2), string2, zv_02, 4500);
        zu_02.b(f2, f3, f4, 1.0f);
        zu_02.a(apv_22);
        HashSet<za_0> hashSet = zd_0.a().a(apv_22);
        if (hashSet != null) {
            zu_02.g(hashSet.size() * 600);
        }
        zd_0.a().a(zu_02);
    }
}

