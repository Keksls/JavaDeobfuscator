/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bYZ
extends akk_2 {
    final /* synthetic */ byw_0 a;

    bYZ(byw_0 byw_02, LuaState luaState)
    {
        this.a = byw_02;
        super(luaState);
    }

    @Override
    public String a() {
        return "getMonster";
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public final akf_1[] f() {
        return new akf_1[]{new akf_1("monsterId", null, akg_2.b, false)};
    }

    @Override
    public void a(int n) {
        this.b(this.a.a.r());
    }
}

