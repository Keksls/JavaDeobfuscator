/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akb
 */
class akb_0
extends akk_2 {
    akb_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setPointLightColor";
    }

    @Override
    public String b() {
        return "Change la couleur d'une lumi?re ponctuelle";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("lightId", "Id de la lumi?re", akg_2.d, false), new akf_1("red", "Teinte de rouge", akg_2.e, false), new akf_1("green", "Teinte de vert", akg_2.e, false), new akf_1("blue", "Teinte de bleu", akg_2.e, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        adS adS2 = ajV.c(this.d(0));
        if (adS2 != null) {
            adS2.d(this.f(1), this.f(2), this.f(3));
        } else {
            this.a(ajV.a, "La lumi?re n'existe pas");
        }
    }
}

