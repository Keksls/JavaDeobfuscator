/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class akN
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("UID", null, akg_2.b, false)};

    public akN(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "generateClientMobileId";
    }

    @Override
    public String b() {
        return "Generate an unique ID used for mobiles creation";
    }

    @Override
    public akf_1[] e() {
        return null;
    }

    @Override
    public akf_1[] f() {
        return a;
    }

    @Override
    public void a(int n) {
        this.b(abd_1.c());
    }
}

