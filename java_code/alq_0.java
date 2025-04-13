/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alq
 */
public final class alq_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("funcName", null, akg_2.c, false), new akf_1("funcParams", null, akg_2.h, true)};
    private static final akf_1[] b = new akf_1[]{new akf_1("listener", "Listener Object", akg_2.a, false)};

    public alq_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "onPathEnded";
    }

    @Override
    public String b() {
        return "Run a function when the mobile finish a movement";
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
        if (!(afv2 instanceof afe_0)) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist or is not a PathMobile");
            this.l();
            return;
        }
        afe_0 afe_02 = (afe_0)afv2;
        akx_2 akx_22 = this.m();
        String string = this.i(1);
        akr_2[] akr_2Array = this.a(2, n);
        int n2 = akx_22.a(string, akr_2Array);
        alr alr2 = new alr(this, akx_22, n2);
        afe_02.b(alr2);
        this.a(alr2);
    }
}

