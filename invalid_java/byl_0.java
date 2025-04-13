/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bYL
 */
class byl_0
extends akk_2 {
    final /* synthetic */ bye_0 a;

    byl_0(bye_0 bye_02, LuaState luaState) {
        this.a = bye_02;
        super(luaState);
    }

    @Override
    public String a() {
        return "setClientVar";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("varValue", null, akg_2.b, false)};
    }

    @Override
    public final akf_1[] f() {
        return null;
    }

    @Override
    public void a(int n) {
        this.a.d.d(this.g(0));
    }
}

