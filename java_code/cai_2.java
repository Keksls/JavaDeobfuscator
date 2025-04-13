/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from cai
 */
final class cai_2
extends cap_2 {
    private static final String a = "getTarget";
    private static final String c = "Retourne l'id de la cible de l'effet";
    private static final akf_1[] d = new akf_1[]{new akf_1("targetId", null, akg_2.b, false)};

    cai_2(LuaState luaState, bbo_0 bbo_02) {
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
        this.b(this.b.h());
    }

    @Override
    public String b() {
        return c;
    }
}

