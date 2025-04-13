/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bZV
 */
final class bzv_0
extends cap_2 {
    private static final String a = "getArmorLossValue";
    private static final String c = "Retourne la valeur d'armure perdue";
    private static final akf_1[] d = new akf_1[]{new akf_1("value", null, akg_2.d, false)};

    bzv_0(LuaState luaState, bbo_0 bbo_02) {
        super(luaState, bbo_02);
    }

    @Override
    public String a() {
        return a;
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public akf_1[] f() {
        return d;
    }

    @Override
    public void a(int n) {
        this.q(this.b.I());
    }

    @Override
    public String b() {
        return c;
    }
}

