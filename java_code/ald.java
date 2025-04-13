/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class ald
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("id", "mobile id", akg_2.e, false), new akf_1("hide", "true = hide mobile, false = show mobile", akg_2.f, false)};
    private static final akf_1[] b = new akf_1[]{new akf_1("mobileVisibilityChanged", null, akg_2.f, false)};

    public ald(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "hideMobile";
    }

    @Override
    public String b() {
        return "Hide specific mobile";
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
        boolean bl = this.l(1);
        afv afv2 = afz_0.d().b(l);
        if (afv2 == null) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist");
            this.a(false);
            return;
        }
        if (afv2.at() == !bl) {
            this.a(false);
            return;
        }
        afv2.c(!bl);
        this.a(true);
    }
}

