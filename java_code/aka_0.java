/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aka
 */
class aka_0
extends akk_2 {
    aka_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setGlobalLightColor";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("lightId", null, akg_2.d, false), new akf_1("red", null, akg_2.e, false), new akf_1("green", null, akg_2.e, false), new akf_1("blue", null, akg_2.e, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        acO acO2 = ajV.a(this.d(0));
        if (acO2 != null) {
            acO2.a(this.f(1), this.f(2), this.f(3));
        } else {
            this.a(ajV.a, "La lumi?re n'existe pas");
        }
    }
}

