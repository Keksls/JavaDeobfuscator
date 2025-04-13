/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akc
 */
class akc_0
extends akk_2 {
    akc_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setPointLightPosition";
    }

    @Override
    public String b() {
        return "Repositionne une lumi?re pmonctuelle";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("lightId", "Id de lumi?re", akg_2.d, false), new akf_1("x", "Position x", akg_2.e, false), new akf_1("y", "Position y", akg_2.e, false), new akf_1("z", "Position z", akg_2.e, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        adS adS2 = ajV.c(this.d(0));
        if (adS2 != null) {
            afr_2 afr_22 = adS2.c();
            afr_22.a(this.f(1), this.f(2), this.f(3));
        } else {
            this.a(ajV.a, "La lumi?re n'existe pas");
        }
    }
}

