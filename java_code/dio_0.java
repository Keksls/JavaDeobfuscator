/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from diO
 */
public class dio_0
extends akk_2 {
    public dio_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "createFullScreenText";
    }

    @Override
    public String b() {
        return "Affiche un texte centr\u00e9 \u00e0 l'\u00e9cran";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("startDuration", "Temps pendant lequel la transparence augmente progressivement (en ms)", akg_2.d, false), new akf_1("midDuration", "Dur\u00e9e de l'affichage en transparence max (en ms)", akg_2.d, false), new akf_1("endDuration", "Temps pendant lequel la transparence diminue progressivement (en ms)", akg_2.d, false), new akf_1("tradKey", "Clef de traduction", akg_2.c, false), new akf_1("red", "Teinte rouge (entre 0 et 1)", akg_2.e, true), new akf_1("green", "Teinte verte (entre 0 et 1)", akg_2.e, true), new akf_1("blue", "Teinte bleue (entre 0 et 1)", akg_2.e, true), new akf_1("alpha", "Transparence du texte", akg_2.e, true), new akf_1("font", "Police \u00e0 utiliser ('ibmplexsans' par d\u00e9faut)", akg_2.c, true), new akf_1("fontSize", "Taille de la police, 30 par d\u00e9faut", akg_2.d, true), new akf_1("fontStyle", "Style \u00e0 utiliser (Bit-mask, voir Font.java)", akg_2.d, true)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("effectId", "L'id de l'effet", akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        int n2 = this.d(0);
        int n3 = this.d(1);
        int n4 = this.d(2);
        String string = this.i(3);
        float f2 = n >= 5 ? this.f(4) : 1.0f;
        float f3 = n >= 6 ? this.f(5) : 1.0f;
        float f4 = n >= 7 ? this.f(6) : 1.0f;
        float f5 = n >= 8 ? this.f(7) : 1.0f;
        String string2 = n >= 9 ? this.i(8) : "ibmplexsans";
        int n5 = n >= 10 ? this.d(9) : 30;
        int n6 = n >= 11 ? this.d(10) : 0;
        adq_0 adq_02 = new adq_0(string2, n6, n5);
        String string3 = bae.h().a(string, new Object[0]);
        adq_02.a(string3);
        adq_02.a(f2, f3, f4, f5);
        if (n3 < 0) {
            adq_02.a(new adK(n2));
        } else {
            adq_02.a(new adO(n2, n3, n4));
        }
        aui_1.a().a(adq_02);
        this.q(adq_02.f());
    }
}

