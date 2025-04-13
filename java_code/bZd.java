/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class bZd
extends akr_1 {
    public static final bZd a = new bZd();

    private bZd() {
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new bzm_0(luaState), new bZk(luaState), new bzl_0(luaState), new bZi(luaState), new bze_0(luaState), new bZg(luaState), new bZj(luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }

    @Override
    public final String a() {
        return "Resource";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    static /* synthetic */ Logger d() {
        return b;
    }

    static /* synthetic */ Logger e() {
        return b;
    }

    static /* synthetic */ Logger f() {
        return b;
    }

    static /* synthetic */ Logger g() {
        return b;
    }
}

