/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class ajL
extends akk_2 {
    ajL(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "createCameraSeaSicknessEffect";
    }

    @Override
    public String b() {
        return "Active un effet de mal de mer";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("startDuration", "Temps pendant lequel la force augmente progressivement (en ms)", akg_2.e, true), new akf_1("midDuration", "Dur\u00e9e de l'effet \u00e0 la force max (en ms)", akg_2.e, true), new akf_1("endDuration", "Temps pendant lequel la force diminue progressivement (en ms)", akg_2.e, true), new akf_1("amplitude", "Amplitude max des mouvements", akg_2.e, true), new akf_1("period", "P\u00e9riode du tremblement", akg_2.e, true), new akf_1("rotation", null, akg_2.e, true), new akf_1("direction", "Application de l'effet selon l'axe 'X', 'Y', ou 'BOTH' ('XY')", akg_2.c, true)};
    }

    @Override
    public akf_1[] f() {
        return new akf_1[]{new akf_1("effectId", "Id de l'effet", akg_2.d, false)};
    }

    @Override
    protected void a(int n) {
        int n2 = 0;
        int n3 = -1;
        int n4 = 0;
        float f2 = 5.0f;
        float f3 = 1500.0f;
        float f4 = 0.025f;
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
        if (n >= 5) {
            f3 = (float)this.e(4);
        }
        if (n >= 6) {
            f4 = (float)this.e(6);
        }
        if (n >= 7) {
            string = this.i(6).toUpperCase();
        }
        adl_0 adl_02 = new adl_0();
        adl_02.a(string);
        adl_02.a(f3, f2, f4);
        ajJ.a(n2, n3, n4, adl_02, ajJ.f());
        aui_1.a().a(adl_02);
        this.q(adl_02.f());
    }
}

