/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class akO
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("animationName", null, akg_2.c, false)};
    private static final akf_1[] b = new akf_1[]{new akf_1("duration", null, akg_2.d, false)};

    public akO(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getAnimationDuration";
    }

    @Override
    public String b() {
        return "Return the duration (ms) of the animation (0 if the animation is a loop)";
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
        abu abu2 = this.a(l);
        if (abu2 == null) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist");
            this.l();
            return;
        }
        String string = this.i(1);
        int n2 = abu2.j(string);
        this.q(n2 == -1 ? 0 : n2);
    }
}

