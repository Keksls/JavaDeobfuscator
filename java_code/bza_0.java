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
 * Renamed from bZa
 */
public class bza_0
extends akr_1 {
    private static final bza_0 a = new bza_0();

    public static bza_0 d() {
        return a;
    }

    private bza_0() {
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new bzb_0(luaState), new bzc_0(luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }

    @Override
    public final String a() {
        return "Pet";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
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

    static /* synthetic */ Logger h() {
        return b;
    }
}

