/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class akP
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("carrierMobileId", null, akg_2.b, false)};
    private static final akf_1[] b = new akf_1[]{new akf_1("carriedMobileId", null, akg_2.b, false)};

    public akP(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getCarriedMobileId";
    }

    @Override
    public String b() {
        return "Return the ID of the carried mobile. Return 1 on error";
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
    protected void a(int n) {
        long l = this.g(0);
        afv afv2 = this.a_(l);
        if (afv2 == null) {
            this.a(this.r_(), "Mobile carrier " + l + " doesn't exist");
            this.b(1L);
            return;
        }
        afv afv3 = afv2.c();
        if (afv3 == null) {
            this.a(this.r_(), "Mobile carrier " + l + " doesn't carry anything");
            this.b(1L);
            return;
        }
        this.b(afv3.a());
    }
}

