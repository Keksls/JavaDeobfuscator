/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bZZ
 */
final class bzz_0
extends cap_2 {
    private static final String a = "getCaster";
    private static final String c = "Retourne l'id du caster de l'effet";
    private static final akf_1[] d = new akf_1[]{new akf_1("casterId", null, akg_2.b, false)};

    bzz_0(LuaState luaState, bbo_0 bbo_02) {
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
    protected void a(int n) {
        this.b(this.b.t());
    }

    @Override
    public String b() {
        return c;
    }
}

