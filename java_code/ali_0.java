/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from ali
 */
public final class ali_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false)};
    private static final akf_1[] b = new akf_1[]{new akf_1("isVisible", null, akg_2.f, false)};

    public ali_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "isMobileVisible";
    }

    @Override
    public String b() {
        return "Return true if the mobile is visible";
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
    protected void a(int n) {
        long l = this.g(0);
        abu abu2 = this.a(l);
        this.a(abu2 != null && abu2.at());
    }
}

