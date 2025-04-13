/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXc
 */
public class bxc_0
extends akr_1 {
    private static final bxc_0 a = new bxc_0();

    protected bxc_0() {
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new bxd_0(luaState), new bXf(luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return new akk_2[0];
    }

    public static bxc_0 d() {
        return a;
    }

    @Override
    public final String a() {
        return "Ambiance";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }
}

