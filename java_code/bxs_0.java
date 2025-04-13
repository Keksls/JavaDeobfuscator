/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXs
 */
public class bxs_0
extends akr_1 {
    private static final bxs_0 a = new bxs_0();

    public static bxs_0 d() {
        return a;
    }

    @Override
    public final String a() {
        return "Event";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new bXu(luaState), new bXv(luaState), new bXC(luaState), new bxe_0(luaState), new bxz_0(luaState), new bxf_0(luaState), new bXA(luaState), new bXt(luaState), new bxy_0(luaState), new bxb_0(luaState), new bxg_0(luaState), new bxx_0(luaState), new bXw(luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }

    private bxs_0() {
    }

    static /* synthetic */ Logger e() {
        return b;
    }
}

