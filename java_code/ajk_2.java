/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aJK
 */
public class ajk_2
extends akr_1 {
    static final Logger a = Logger.getLogger(ajk_2.class);
    static final akf_1[] d = new akf_1[]{new akf_1("time", "Script execution duration (ms)", akg_2.d, false)};
    static final akf_1[] e = new akf_1[]{new akf_1("time", "Start time for action (ms)", akg_2.d, false), new akf_1("loopCount", "Call count", akg_2.d, false), new akf_1("funcName", "Called function", akg_2.c, false), new akf_1("funcParams", "Params for called function", akg_2.h, true)};
    static final akf_1[] f = new akf_1[]{new akf_1("taskId", "Task id (default = -1 <=> all waiting or timed tasks)", akg_2.d, true)};
    static final akf_1[] g = new akf_1[]{new akf_1("taskId", "Task id", akg_2.d, false)};
    static final akf_1[] h = new akf_1[]{new akf_1("fileName", "Script file name", akg_2.c, false)};
    static final akf_1[] i = new akf_1[]{new akf_1("libName", "Path to a script", akg_2.c, false)};
    static final akf_1[] j = new akf_1[]{new akf_1("time", "Delay between function call (ms)", akg_2.d, false), new akf_1("funcName", "Called function", akg_2.c, false), new akf_1("funcParams", "Params for called function", akg_2.h, true)};
    static final akf_1[] k = new akf_1[]{new akf_1("taskId", "Task id", akg_2.d, false)};
    static final akf_1[] l = new akf_1[]{new akf_1("taskId", "Task id", akg_2.d, true)};
    static final akf_1[] m = new akf_1[]{new akf_1("message", "Logged string", akg_2.h, true)};
    static final akf_1[] n = new akf_1[]{new akf_1("param1", null, akg_2.b, false), new akf_1("param2", null, akg_2.e, true)};
    static final akf_1[] o = new akf_1[]{new akf_1("result", null, akg_2.f, false)};
    static final akf_1[] p = new akf_1[]{new akf_1("param1", null, akg_2.b, false), new akf_1("param2", null, akg_2.e, true)};
    static final akf_1[] q = new akf_1[]{new akf_1("result", null, akg_2.f, false)};
    static final akf_1[] r = new akf_1[]{new akf_1("param1", null, akg_2.b, false), new akf_1("param2", null, akg_2.e, true)};
    static final akf_1[] s = new akf_1[]{new akf_1("result", null, akg_2.f, false)};
    static final akf_1[] t = new akf_1[]{new akf_1("param1", null, akg_2.b, false), new akf_1("param2", null, akg_2.e, true)};
    static final akf_1[] u = new akf_1[]{new akf_1("result", null, akg_2.b, false)};
    static final akf_1[] v = new akf_1[]{new akf_1("param", null, akg_2.b, false)};
    static final akf_1[] w = new akf_1[]{new akf_1("result", null, akg_2.b, false)};
    static final akf_1[] x = new akf_1[]{new akf_1("param1", null, akg_2.b, false), new akf_1("param2", null, akg_2.b, false)};
    static final akf_1[] y = new akf_1[]{new akf_1("result", null, akg_2.b, false)};
    static final akf_1[] z = new akf_1[]{new akf_1("param1", null, akg_2.e, false), new akf_1("param2", null, akg_2.e, true)};
    static final akf_1[] A = new akf_1[]{new akf_1("result", null, akg_2.b, false)};
    static final akf_1[] B = new akf_1[]{new akf_1("param1", null, akg_2.e, false), new akf_1("param2", null, akg_2.e, true)};
    static final akf_1[] C = new akf_1[]{new akf_1("result", null, akg_2.e, false)};
    static final akf_1[] D = new akf_1[]{new akf_1("param", null, akg_2.a, false)};
    static final akf_1[] E = new akf_1[]{new akf_1("result", null, akg_2.b, false)};
    static final akf_1[] F = new akf_1[]{new akf_1("x", null, akg_2.e, false), new akf_1("y", null, akg_2.e, false), new akf_1("z", null, akg_2.e, false)};
    static final akf_1[] G = new akf_1[]{new akf_1("result", null, akg_2.b, false)};
    static final akf_1[] H = new akf_1[]{new akf_1("x", null, akg_2.b, false)};
    static final akf_1[] I = new akf_1[]{new akf_1("x", null, akg_2.e, false), new akf_1("y", null, akg_2.e, false), new akf_1("z", null, akg_2.e, false)};
    static final akf_1[] J = new akf_1[]{new akf_1("param1", null, akg_2.h, false)};
    static final akf_1[] K = new akf_1[]{new akf_1("result", null, akg_2.c, false)};
    static final akf_1[] L = new akf_1[]{new akf_1("func", null, akg_2.c, false), new akf_1("params", null, akg_2.h, true)};
    static final akf_1[] M = new akf_1[]{new akf_1("taskId", null, akg_2.d, false)};
    static final akf_1[] N = new akf_1[]{new akf_1("taskId", null, akg_2.d, false)};
    static final akf_1[] O = new akf_1[]{new akf_1("short 1", null, akg_2.d, false), new akf_1("short 2", null, akg_2.d, false)};
    static final akf_1[] P = new akf_1[]{new akf_1("integer", null, akg_2.d, false)};
    private static final ajk_2 Q = new ajk_2();

    @Override
    @Nullable
    public final String a() {
        return null;
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    public static ajk_2 d() {
        return Q;
    }

    @Override
    @Nullable
    public akk_2[] a(LuaState luaState) {
        return null;
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return new akk_2[]{new ajp_2(luaState), new ajs_2(luaState), new ajn_2(luaState), new ake_2(luaState), new aki_1(luaState), new ajr_2(luaState), new akd_1(luaState), new ajq_2(luaState), new ajt_2(luaState), new ajv_2(luaState), new aju_2(luaState), new akf_2(luaState), new aka_1(luaState), new akb_1(luaState), new ajl_2(luaState), new ajy_2(luaState), new akh_2(luaState), new ajz_2(luaState), new ajx_2(luaState), new akg_1(luaState), new ali_2(luaState), new akc_2(luaState), new ajm_2(luaState), new ajw_2(luaState), new ajo_2(luaState)};
    }
}

