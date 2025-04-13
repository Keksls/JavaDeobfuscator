/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class bXm
extends akr_1 {
    private static final Logger a = Logger.getLogger(bXm.class);
    private static final bXm d = new bXm();

    public static bXm d() {
        return d;
    }

    protected bXm() {
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new bxn_0(luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }

    @Override
    public final String a() {
        return "Challenge";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }
}

