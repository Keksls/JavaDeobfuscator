/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alH
 */
public final class alh_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("jumpCapacity", null, akg_2.d, false)};

    public alh_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setMobileJumpCapacity";
    }

    @Override
    public String b() {
        return "Set the jump capacity of the mobile (default = 4)";
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
        if (!(abu2 instanceof afe_0)) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist or is not a PathMobile");
            return;
        }
        short s2 = (short)this.d(1);
        ((afe_0)abu2).b(s2);
    }
}

