/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class ajV
extends akr_1 {
    static final Logger a = Logger.getLogger(ajV.class);
    private static final boolean d = true;
    private static final ajV e = new ajV();
    static int f = 0;
    private final TIntObjectHashMap<adS> g = new TIntObjectHashMap();
    private final TIntObjectHashMap<acO> h = new TIntObjectHashMap();

    @Override
    public final String a() {
        return "Light";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    static acO a(int n) {
        return (acO)ajV.e.h.get(n);
    }

    static void b(int n) {
        ajV.e.h.remove(n);
    }

    static void a(int n, acO acO2) {
        ajV.e.h.put(n, (Object)acO2);
    }

    static adS c(int n) {
        return (adS)ajV.e.g.get(n);
    }

    static void d(int n) {
        ajV.e.g.remove(n);
    }

    static void a(int n, adS adS2) {
        ajV.e.g.put(n, (Object)adS2);
    }

    public static ajV d() {
        return e;
    }

    private ajV() {
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new ajX(luaState), new ajZ(luaState), new akc_0(luaState), new akb_0(luaState), new akd_0(luaState), new ajW(luaState), new ajY(luaState), new aka_0(luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }
}

