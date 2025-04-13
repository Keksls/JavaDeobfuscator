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
 * Renamed from bXI
 */
public class bxi_0
extends akr_1 {
    private static final bxi_0 a = new bxi_0();
    static final akf_1[] d = new akf_1[]{new akf_1("funcName", null, akg_2.c, false), new akf_1("params", null, akg_2.h, true)};
    static final akf_1[] e = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("funcName", null, akg_2.c, false), new akf_1("params", null, akg_2.h, true)};
    static final akf_1[] f = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("spellElement", null, akg_2.b, false), new akf_1("funcName", null, akg_2.c, false), new akf_1("params", null, akg_2.h, true)};
    static final akf_1[] g = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("eventType", "see FightEventType.java", akg_2.c, false)};

    public static bxi_0 d() {
        return a;
    }

    @Override
    public final String a() {
        return "FightEvent";
    }

    @Override
    public String b() {
        return "Callback are removed at end of fight";
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new bXS(luaState), new bXR(luaState), new bxk_0(luaState), new bXJ(luaState), new bxu_0(luaState), new bxt_0(luaState), new bxp_0(luaState), new bXO(luaState), new bxl_0(luaState), new bxm_0(luaState), new bxq_0(luaState), new bXN(luaState), new bYa(luaState), new bXZ(luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
    }

    private bxi_0() {
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

