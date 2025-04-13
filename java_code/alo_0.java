/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alo
 */
public final class alo_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("startX", null, akg_2.d, false), new akf_1("startY", null, akg_2.d, false), new akf_1("checkPositionIsSameThatGiven", "True to check if the mobile is at startX, startY", akg_2.f, false), new akf_1("funcName", null, akg_2.c, false), new akf_1("funcParams", null, akg_2.h, true)};

    public alo_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "onCellTransition";
    }

    @Override
    public String b() {
        return "Run a function when the mobile change cell";
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
        afv afv2 = afz_0.d().b(l);
        if (!(afv2 instanceof afe_0)) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist or is not a PathMobile");
            return;
        }
        afe_0 afe_02 = (afe_0)afv2;
        akx_2 akx_22 = this.m();
        int n2 = this.d(1);
        int n3 = this.d(2);
        boolean bl = this.l(3);
        String string = this.i(4);
        akr_2[] akr_2Array = this.a(5, n);
        int n4 = akx_22.a(string, akr_2Array);
        alp alp2 = new alp(this, bl, n2, n3, afv2, akx_22, n4);
        ((afv)afe_02).a(alp2);
    }
}

