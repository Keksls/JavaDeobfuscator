/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXn
 */
class bxn_0
extends akk_2 {
    public bxn_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "enableAreaChallenges";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("enable", null, akg_2.f, false)};
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe.F, this.l(0));
    }
}

