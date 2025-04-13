/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class ajM
extends akk_2 {
    ajM(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "createCameraShakeEffect";
    }

    @Override
    public String b() {
        return "Active un effet de tremblement de la cam?ra";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("startDuration", "Temps pendant lequel la force augmente progressivement (en ms)", akg_2.e, true), new akf_1("midDuration", "Dur\u00e9e de l'effet \u00e0 la force max (en ms)", akg_2.e, true), new akf_1("endDuration", "Temps pendant lequel la force diminue progressivement (en ms)", akg_2.e, true), new akf_1("amplitude", "Amplitude max des mouvements", akg_2.e, true), new akf_1("period", "P\u00e9riode du tremblement", akg_2.e, true), new akf_1("direction", "Application de l'effet selon l'axe 'X', 'Y', ou 'BOTH' ('XY')", akg_2.c, true)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("effectId", "Id de l'effet", akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        int n2 = 1000;
        int n3 = 2000;
        int n4 = 1000;
        float f2 = 0.5f;
        float f3 = 77.0f;
        String string = "BOTH";
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
        if (n == 5) {
            f3 = (float)this.e(4);
        }
        if (n == 6) {
            string = this.i(5).toUpperCase();
        }
        adm_0 adm_02 = new adm_0();
        adm_02.a(string);
        adm_02.a(f3, f2);
        ajJ.a(n2, n3, n4, adm_02, ajJ.f());
        aui_1.a().a(adm_02);
        this.q(adm_02.f());
    }
}

