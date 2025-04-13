/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alA
 */
public final class ala_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("animationName", null, akg_2.c, false), new akf_1("funcName", null, akg_2.c, true), new akf_1("funcParams", null, akg_2.h, true)};

    public ala_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setMobileAnimation";
    }

    @Override
    public String b() {
        return "Set the animation of the mobile";
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
        String string = this.i(1);
        abu2.e(string);
        abu2.E();
        if (n > 2) {
            akx_2 akx_22 = this.m();
            String string2 = this.i(2);
            akr_2[] akr_2Array = this.a(3, n);
            int n2 = akx_22.a(string2, akr_2Array);
            abu2.a(new alB(this, abu2, akx_22, n2));
        }
    }
}

