/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dig
 */
class dig_0
extends akk_2 {
    dig_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getItemPath";
    }

    @Override
    public akf_1[] e() {
        return new akf_1[]{new akf_1("id", null, akg_2.d, false)};
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("path", null, akg_2.c, false)};
    }

    @Override
    public void a(int n) {
        Object r2 = eyo_1.g().d(this.d(0));
        String string = azs_0.a().f(((ezr_0)r2).C());
        this.a(string);
    }
}

