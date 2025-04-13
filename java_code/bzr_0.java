/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bZr
 */
class bzr_0
extends akk_2 {
    public bzr_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "enableTutorialTooltips";
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
        btn_0.a().a(this.l(0));
    }
}

