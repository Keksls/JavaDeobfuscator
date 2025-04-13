/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class bZq
extends akr_1 {
    private static final Logger a = Logger.getLogger(bZq.class);
    private static final bZq d = new bZq();

    public static bZq d() {
        return d;
    }

    private bZq() {
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new bzr_0(luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }

    @Override
    public final String a() {
        return "Tutorial";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }
}

