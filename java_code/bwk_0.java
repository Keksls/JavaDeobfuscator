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
 * Renamed from bWK
 */
public class bwk_0
extends akr_1 {
    static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("fromMobileId", null, akg_2.b, false)};
    static final akf_1[] d = new akf_1[]{new akf_1("mobileId", "Use Mobile.generateClientMobileId() if you don't know what you do", akg_2.b, false), new akf_1("spriteName", "GFX name", akg_2.c, false), new akf_1("worldX", "Position X", akg_2.d, false), new akf_1("worldY", "Position Y", akg_2.d, false), new akf_1("altitude", "Position Z", akg_2.d, false), new akf_1("availableDirection", "Available movement directions (use 4 if isn't a character class)", akg_2.d, true), new akf_1("setId", "Equipped set id", akg_2.d, true)};
    static final akf_1[] e = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("height", null, akg_2.d, false)};
    static final akf_1[] f = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false)};
    static final akf_1[] g = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("layer", "Layer id (default = 7)", akg_2.d, false)};
    static final akf_1[] h = new akf_1[]{new akf_1("mobileId", "Mobile id", akg_2.b, false)};
    static final akf_1[] i = new akf_1[]{new akf_1("mobileId", "Mobile id", akg_2.b, false)};
    static final akf_1[] j = new akf_1[]{new akf_1("sex", "Mobile gender (0 = male, 1 = female)", akg_2.d, false)};
    static final akf_1[] k = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("source", null, akg_2.c, false), new akf_1("partNames", null, akg_2.h, true)};
    static final akf_1[] l = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("skinId", null, akg_2.c, false), new akf_1("callback", null, akg_2.c, true), new akf_1("args", null, akg_2.h, true)};
    static final akf_1[] m = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("source", null, akg_2.c, false), new akf_1("partNames", null, akg_2.h, true)};
    static final akf_1[] n = new akf_1[]{new akf_1("characterId", null, akg_2.b, false)};
    static final akf_1[] o = new akf_1[]{new akf_1("weaponTypeId", null, akg_2.d, false)};
    static final akf_1[] p = new akf_1[]{new akf_1("characterId", null, akg_2.b, false)};
    static final akf_1[] q = new akf_1[]{new akf_1("handsOccuped", null, akg_2.d, false)};
    static final akf_1[] r = new akf_1[]{new akf_1("srcId", "Mobile model id", akg_2.b, false), new akf_1("destId", "Mobile destination id", akg_2.b, false)};
    static final akf_1[] s = new akf_1[]{new akf_1("spellId", "Spell id of spell added", akg_2.d, false), new akf_1("position", "Slot index", akg_2.d, true)};
    static final akf_1[] t = new akf_1[]{new akf_1("petOwner", "Character id of pet owner", akg_2.b, false)};
    static final akf_1[] u = new akf_1[]{new akf_1("activePetMobileId", "Return id of mobile of pet or -1 if pet owner isn't a character or if current character doesn't have pet mobile", akg_2.b, false)};
    private static final bwk_0 v = new bwk_0();

    @Override
    public final String a() {
        return "Actor";
    }

    @Override
    public String b() {
        return "NO Description<br/>Please Dev... implement me!";
    }

    private bwk_0() {
    }

    public static bwk_0 d() {
        return v;
    }

    @Override
    public akk_2[] a(LuaState luaState) {
        return new akk_2[]{new bwm_0(luaState), new bWS(luaState), new bWU(luaState), new bxa_0(luaState), new bXb(luaState), new bWZ(luaState), new bWO(luaState), new bWN(luaState), new bWP(luaState), new bWV(luaState), new bWX(luaState), new bWY(luaState), new bWR(luaState), new bXg(luaState), new bwl_0(luaState), new car_1(luaState), new bWW(luaState)};
    }

    @Override
    public akk_2[] b(LuaState luaState) {
        return null;
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

    static /* synthetic */ Logger i() {
        return b;
    }

    static /* synthetic */ Logger j() {
        return b;
    }

    static /* synthetic */ Logger k() {
        return b;
    }

    static /* synthetic */ Logger l() {
        return b;
    }

    static /* synthetic */ Logger m() {
        return b;
    }

    static /* synthetic */ Logger n() {
        return b;
    }

    static /* synthetic */ Logger o() {
        return b;
    }

    static /* synthetic */ Logger p() {
        return b;
    }

    static /* synthetic */ Logger q() {
        return b;
    }

    static /* synthetic */ Logger r() {
        return b;
    }

    static /* synthetic */ Logger s() {
        return b;
    }

    static /* synthetic */ Logger t() {
        return b;
    }
}

