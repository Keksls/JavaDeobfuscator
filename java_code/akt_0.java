/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from akT
 */
public final class akt_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false)};
    private static final akf_1[] b = new akf_1[]{new akf_1("alpha", null, akg_2.e, false)};

    public akt_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "getMobileAlpha";
    }

    @Override
    public String b() {
        return "Return the alpha value of the mobile (between 0 and 1)";
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
        abu abu2 = this.a(l);
        if (abu2 == null) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist");
            this.l();
            return;
        }
        this.a(abu2.au());
    }
}

