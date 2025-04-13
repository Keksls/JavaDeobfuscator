/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alN
 */
public final class aln_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("scale", null, akg_2.e, false)};

    public aln_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "setMobileScale";
    }

    @Override
    public String b() {
        return "Set the scale of the mobile (default = 1)";
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
        float f2 = this.f(1);
        abu2.a(f2);
    }
}

