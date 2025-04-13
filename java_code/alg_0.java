/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alG
 */
public final class alg_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("direction8Index", null, akg_2.d, false)};

    public alg_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setMobileDirection";
    }

    @Override
    public String b() {
        return "Set the direction of the mobile";
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
        if (!(abu2 instanceof aby_0)) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist or is not an AnimatedElementWithDirection");
            return;
        }
        int n2 = this.d(1);
        ((aby_0)abu2).a(aej_2.a(n2));
    }
}

