/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alK
 */
public final class alk_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false)};

    public alk_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setMobileNext4Direction";
    }

    @Override
    public String b() {
        return "Set the mobile direction for it to be in direction4";
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
        if (!(abu2 instanceof aby_0)) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist or is not an AnimatedElementWithDirection");
            return;
        }
        aby_0 aby_02 = (aby_0)abu2;
        if (!aby_02.aC().c()) {
            aby_02.a(aej_2.a((aby_02.aC().l + 1) % 8));
        }
    }
}

