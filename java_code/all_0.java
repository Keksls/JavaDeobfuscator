/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alL
 */
public final class all_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("posX", null, akg_2.e, false), new akf_1("posY", null, akg_2.e, false), new akf_1("posZ", null, akg_2.e, false)};

    public all_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setMobilePosition";
    }

    @Override
    public String b() {
        return "Set the mobile position at the specified coordinates";
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
        float f2 = this.f(1);
        float f3 = this.f(2);
        float f4 = this.f(3);
        abu abu2 = this.a(l);
        if (abu2 == null) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist");
            return;
        }
        abu2.b(f2, f3, f4);
    }
}

