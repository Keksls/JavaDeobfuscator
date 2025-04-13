/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bYW
 */
public class byw_0
extends akr_1 {
    final bbv_0 a;

    @Override
    public final String a() {
        return "Evolution";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    public byw_0(bbv_0 bbv_02) {
        this.a = bbv_02;
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new bYZ(this, luaState), new bYY(this, luaState), new bYX(this, luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }
}

