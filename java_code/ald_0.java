/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alD
 */
public final class ald_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("animationSuffix", null, akg_2.c, true)};

    public ald_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setMobileAnimationSuffix";
    }

    @Override
    public String b() {
        return "Set a suffix to the mobile animations. Use only mobileId to remove the suffix";
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
    public void a(int n) {
        long l = this.g(0);
        abu abu2 = this.a(l);
        if (abu2 == null) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist");
            return;
        }
        abu2.f(n == 2 ? this.i(1) : null);
    }
}

