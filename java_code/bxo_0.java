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
 * Renamed from bXo
 */
public class bxo_0
extends akr_1 {
    private static final Logger a = Logger.getLogger(bxo_0.class);
    private static final bxo_0 d = new bxo_0();

    public static bxo_0 d() {
        return d;
    }

    protected bxo_0() {
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new bXp(luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }

    @Override
    public final String a() {
        return "Climate";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }
}

