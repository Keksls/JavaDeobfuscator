/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bZn
 */
public class bzn_0
extends akr_1 {
    private static final bzn_0 a = new bzn_0();

    public static bzn_0 d() {
        return a;
    }

    @Override
    public final String a() {
        return "Server";
    }

    @Override
    public String b() {
        return "Fonctions critiques qu'il vaut mieux ?viter d'utiliser";
    }

    private bzn_0() {
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new bzp_0(luaState), new bzo_0(luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return new akk_2[0];
    }
}

