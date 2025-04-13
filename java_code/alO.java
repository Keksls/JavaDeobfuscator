/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class alO
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("animName", null, akg_2.c, true)};

    public alO(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setMobileAnimationStaticKey";
    }

    @Override
    public String b() {
        return "Set the name of the static animation of the mobile. Use only mobileId to revert to the default static animation";
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
        long l = this.g(0);
        abu abu2 = this.a(l);
        if (abu2 == null) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist");
            return;
        }
        String string = n == 2 ? this.i(1) : "AnimStatique";
        abu2.g(string);
    }
}

