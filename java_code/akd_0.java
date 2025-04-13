/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akd
 */
class akd_0
extends akk_2 {
    akd_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setPointLightRange";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("lightId", null, akg_2.d, false), new akf_1("range", null, akg_2.e, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        adS adS2 = ajV.c(this.d(0));
        if (adS2 != null) {
            adS2.a(this.f(1));
        } else {
            this.a(ajV.a, "La lumi?re n'existe pas");
        }
    }
}

