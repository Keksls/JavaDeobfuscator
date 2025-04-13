/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from cad
 */
final class cad_2
extends cap_2 {
    private static final String a = "getEffectValue";
    private static final String c = "Retourne la valeur de l'effet";
    private static final akf_1[] d = new akf_1[]{new akf_1("value", null, akg_2.d, false)};

    cad_2(LuaState luaState, bbo_0 bbo_02) {
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
        this.q(this.b.w());
    }

    @Override
    public String b() {
        return c;
    }
}

