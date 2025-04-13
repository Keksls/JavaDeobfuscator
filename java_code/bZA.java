/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

final class bZA
extends bZs {
    private static final String b = "getLevel";
    private static final String c = "Permet de r?cup?rer le niveau du sort ou du skill associ? ? l'action";
    private static final akf_1[] d = new akf_1[]{new akf_1("castLevel", null, akg_2.d, false)};

    bZA(LuaState luaState, bal_0 bal_02) {
        super(luaState, bal_02);
    }

    @Override
    public String a() {
        return b;
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
        this.q(this.a.w());
    }

    @Override
    public String b() {
        return c;
    }
}

