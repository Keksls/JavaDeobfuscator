/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

class bZu
extends bZs {
    private static final String b = "getCaster";
    private static final String c = "Permet de r?cup?rer l'id du lanceur de l'action";
    private static final akf_1[] d = new akf_1[]{new akf_1("casterId", null, akg_2.b, false)};

    bZu(LuaState luaState, bal_0 bal_02) {
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
    public final akf_1[] f() {
        return d;
    }

    @Override
    public void a(int n) {
        this.b(this.a.f());
    }

    @Override
    public String b() {
        return c;
    }
}

