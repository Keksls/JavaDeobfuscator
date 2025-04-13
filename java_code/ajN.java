/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class ajN
extends akk_2 {
    ajN(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "createFullScreenSprite";
    }

    @Override
    public String b() {
        return "Affiche une image remplissant compl\u00e8tement l'\u00e9cran";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("startDuration", "Temps pendant lequel la transparence augmente progressivement (en ms)", akg_2.e, true), new akf_1("midDuration", "Dur\u00e9e de l'effet \u00e0 la transparence max (en ms)", akg_2.e, true), new akf_1("endDuration", "Temps pendant lequel la transparence diminue progressivement (en ms)", akg_2.e, true), new akf_1("red", "Teinte rouge (entre 0 et 1)", akg_2.e, true), new akf_1("green", "Teinte verte (entre 0 et 1)", akg_2.e, true), new akf_1("blue", "Teinte bleue (entre 0 et 1)", akg_2.e, true), new akf_1("alpha", "Transparence de l'image", akg_2.e, true), new akf_1("textureFileName", "Fichier de l'image ? afficher", akg_2.c, true)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("effectId", "L'id de l'effet", akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        int n2 = 1000;
        int n3 = 2000;
        int n4 = 1000;
        float f2 = 1.0f;
        float f3 = 1.0f;
        float f4 = 1.0f;
        float f5 = 1.0f;
        String string = null;
        if (n >= 1) {
            n2 = (int)this.e(0);
        }
        if (n >= 2) {
            n3 = (int)this.e(1);
        }
        if (n >= 3) {
            n4 = (int)this.e(2);
        }
        if (n >= 4) {
            f2 = (float)this.e(3);
        }
        if (n >= 5) {
            f3 = (float)this.e(4);
        }
        if (n >= 6) {
            f4 = (float)this.e(5);
        }
        if (n >= 7) {
            f5 = (float)this.e(6);
        }
        if (n >= 8) {
            string = this.i(7);
        }
        adp_0 adp_02 = new adp_0();
        adp_02.a(string);
        adp_02.a(f2, f3, f4, f5);
        if (n3 < 0) {
            adp_02.a(new adK(n2));
        } else {
            adp_02.a(new adO(n2, n3, n4));
        }
        aui_1.a().a(adp_02);
        this.q(adp_02.f());
    }
}

