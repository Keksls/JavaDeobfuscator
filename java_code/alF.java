/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class alF
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("id", "mobile id", akg_2.e, false), new akf_1("mobileRefId", "mobile id of reference mobile to grab his color", akg_2.e, false)};
    private static final akf_1[] b = new akf_1[]{new akf_1("mobileColorChanged", null, akg_2.f, false)};

    public alF(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setMobileColorFromAnotherMobile";
    }

    @Override
    public String b() {
        return "Set color of specific mobile from another mobile";
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
        long l2 = this.g(1);
        afv afv2 = afz_0.d().b(l);
        if (afv2 == null) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist");
            this.a(false);
            return;
        }
        afv afv3 = afz_0.d().b(l2);
        if (afv3 == null) {
            this.a(this.r_(), "Ref mobile " + l + " doesn't exist");
            this.a(false);
            return;
        }
        afv2.f(afv3);
        this.a(true);
    }
}

