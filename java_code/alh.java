/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class alh
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false)};
    private static final akf_1[] b = new akf_1[]{new akf_1("isMobile", null, akg_2.f, false)};

    public alh(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "isMobile";
    }

    @Override
    public String b() {
        return "Return true if the mobile is a Mobile";
    }

    @Override
    public akf_1[] e() {
        return a;
    }

    @Override
    public akf_1[] f() {
        return b;
    }

    @Override
    public void a(int n) {
        long l = this.g(0);
        afv afv2 = this.a_(l);
        this.a(afv2 != null);
    }
}

