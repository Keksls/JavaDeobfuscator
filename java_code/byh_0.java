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
 * Renamed from bYh
 */
public class byh_0
extends akr_1 {
    static final Logger a = Logger.getLogger(byh_0.class);
    private static final byh_0 d = new byh_0();

    @Override
    public final String a() {
        return "InteractiveElement";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new byz_0(luaState), new bYn(luaState), new byp_0(luaState), new byo_0(luaState), new bYm(luaState), new bYD(luaState), new bYw(luaState), new bYs(luaState), new byt_0(luaState), new bYv(luaState), new bYC(luaState), new bYB(luaState), new byi_0(luaState), new bYk(luaState), new byq_0(luaState), new byu_0(luaState), new byr_0(luaState), new byx_0(luaState), new byy_0(luaState), new caw_2(luaState)};
    }

    private byh_0() {
    }

    public static byh_0 d() {
        return d;
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }
}

