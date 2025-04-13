/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class alM
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("radius", null, akg_2.e, false)};
    private static final akf_1[] b = new akf_1[]{new akf_1("oldRadius", null, akg_2.e, false)};

    public alM(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setMobileRadius";
    }

    @Override
    public String b() {
        return "Set the radius of the mobile (default = 1)";
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
        afv afv2;
        afv afv3;
        long l = this.g(0);
        abu abu2 = this.a(l);
        if (abu2 == null) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist");
            this.l();
            return;
        }
        this.a(abu2.ai());
        float f2 = this.f(1);
        abu2.c(f2);
        if (abu2 instanceof afv && (afv3 = (afv2 = (afv)abu2).c()) != null) {
            afv3.c(f2);
        }
    }
}

