/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class alx
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("speed", "Global animation speed (default = 1.0)", akg_2.e, false)};

    public alx(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setGlobalAnimationSpeed";
    }

    @Override
    public String b() {
        return "Set the global animation speed. (default = 1.0)";
    }

    @Override
    public akf_1[] e() {
        return a;
    }

    @Override
    public akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        abc_0.a(this.f(0));
    }
}

