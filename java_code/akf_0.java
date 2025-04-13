/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akf
 */
public class akf_0
extends akr_1 {
    private static final akf_0 a = new akf_0();

    protected akf_0() {
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new ame_0(luaState), new alY(luaState), new amg_0(luaState), new amc_0(luaState), new ami_0(luaState), new ama_0(luaState), new amb_0(luaState), new amd_0(luaState), new amf_0(luaState), new amh_0(luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }

    public static akf_0 d() {
        return a;
    }

    @Override
    public final String a() {
        return "Particle";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }
}

