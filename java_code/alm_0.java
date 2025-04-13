/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alm
 */
public final class alm_0
extends akk_2
implements all {
    private static final ut_0 a = new ut_0();
    private static final yy_0 b;
    private static final akf_1[] c;
    private static final akf_1[] d;

    public alm_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "moveMobile";
    }

    @Override
    public String b() {
        return "Starts a movement from the initial position to the given coordinates with the walk animation";
    }

    @Override
    public akf_1[] e() {
        return c;
    }

    @Override
    public akf_1[] f() {
        return d;
    }

    @Override
    public void a(int n) {
        long l = this.g(0);
        afv afv2 = afz_0.d().b(l);
        if (!(afv2 instanceof afe_0)) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist or is not a PathMobile");
            this.a(false);
            return;
        }
        afe_0 afe_02 = (afe_0)afv2;
        int n2 = this.d(1);
        int n3 = this.d(2);
        int n4 = this.d(3);
        yz_0.a(afv2.G(), afv2.H(), n2, n3, b);
        uq_0 uq_02 = uq_0.a();
        alm_0.a.a = afe_02.aT() != 8;
        uq_02.a(a);
        uq_02.a((int)afe_02.af(), afe_02.X(), afe_02.aU());
        uq_02.a(b);
        uq_02.a(afv2.G(), afv2.H(), (short)afv2.L());
        uq_02.b(n2, n3, (short)n4);
        uq_02.g();
        apl_1 apl_12 = uq_02.e();
        b.F();
        if (apl_12.b()) {
            afe_02.a(apl_12, true, true);
            this.a(true);
        } else {
            this.a(false);
        }
        uq_02.release();
        if (n > 4) {
            akx_2 akx_22 = this.m();
            String string = this.i(4);
            akr_2[] akr_2Array = this.a(5, n);
            afe_02.b(new aln(this, akx_22, string, akr_2Array));
        }
    }

    static {
        alm_0.a.a = true;
        alm_0.a.b = 400;
        alm_0.a.f = false;
        b = new yy_0();
        c = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("worldX", "Destination x", akg_2.d, false), new akf_1("worldY", "Destination y", akg_2.d, false), new akf_1("worldZ", "Destination z", akg_2.d, false), new akf_1("funcName", "Function to run when the mobile is arrived", akg_2.c, true), new akf_1("funcParams", "", akg_2.h, true)};
        d = new akf_1[]{new akf_1("pathFound", "Return true if the mobile have a valid path", akg_2.f, false)};
    }
}

