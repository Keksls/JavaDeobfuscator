/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alC
 */
public final class alc_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("speed", "Mobile animation speed (default = 1.0)", akg_2.e, false)};

    public alc_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setMobileAnimationSpeed";
    }

    @Override
    public String b() {
        return "Set the mobile animation speed (default = 1.0)";
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
        float f2 = (float)this.e(1);
        abu2.b(f2);
    }
}

