/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from dii
 */
public class dii_0
extends akr_1 {
    private static final dii_0 a = new dii_0();

    private dii_0() {
    }

    public static dii_0 d() {
        return a;
    }

    @Override
    public final String a() {
        return "SystemMessage";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new dij_0(luaState)};
    }
}

