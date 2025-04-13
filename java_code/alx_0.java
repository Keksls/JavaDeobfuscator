/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alX
 */
public final class alx_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", "Mobile to unlink", akg_2.b, false)};

    public alx_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "unlinkMobile";
    }

    @Override
    public String b() {
        return "Unlink the mobile (see Mobile.linkMobile)";
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
        afv afv2 = this.a_(l);
        if (afv2 == null) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist");
            return;
        }
        afv2.aI();
    }
}

