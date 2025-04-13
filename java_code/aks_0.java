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
 * Renamed from aks
 */
public class aks_0
extends akr_1 {
    private static final Logger a = Logger.getLogger(aks_0.class);
    private static final aks_0 d = new aks_0();

    private aks_0() {
    }

    public static aks_0 d() {
        return d;
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new amL(luaState), new amN(luaState), new amQ(luaState), new amS(luaState), new amR(luaState), new amP(luaState), new amT(luaState), new amK(luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }

    @Override
    public final String a() {
        return "World";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }
}

