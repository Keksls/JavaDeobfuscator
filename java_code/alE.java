/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class alE
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("canPlaySound", null, akg_2.f, false)};

    public alE(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setMobileCanPlaySound";
    }

    @Override
    public String b() {
        return "Set if the mobile can play sound";
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
        boolean bl = this.l(1);
        abu2.b(bl);
    }
}

