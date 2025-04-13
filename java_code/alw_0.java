/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from alW
 */
public final class alw_0
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("destX", null, akg_2.d, false), new akf_1("destY", null, akg_2.d, false), new akf_1("destZ", null, akg_2.d, false), new akf_1("duration", null, akg_2.d, false), new akf_1("startVectorZ", null, akg_2.e, false), new akf_1("endVectorZ", null, akg_2.e, false)};

    public alw_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "throwCarriedMobile";
    }

    @Override
    public String b() {
        return "Throw the carried mobile at the coordinates with the specified trajectory";
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
        afv afv2 = this.a_(l);
        if (afv2 == null) {
            this.a(this.r_(), "Mobile " + l + " doesn't exist");
            return;
        }
        afv afv3 = afv2.c();
        if (afv3 == null) {
            this.a(this.r_(), "Mobile " + l + " doesn't carry");
            return;
        }
        int n2 = this.d(1);
        int n3 = this.d(2);
        int n4 = this.d(3);
        int n5 = this.d(4);
        float f2 = (float)this.e(5);
        float f3 = (float)this.e(6);
        afv3.c(true);
        afv2.a(false, (aff_1)null);
        ais_0 ais_02 = new ais_0(afv3);
        ais_02.c(new afr_2(n2, n3, n4));
        ais_02.a(new afr_2(afv3.G(), afv3.H(), afv3.I() + afv2.af()));
        ais_02.a((long)n5);
        ais_02.b(new afr_2(0.0f, 0.0f, f2));
        ais_02.d(new afr_2(0.0f, 0.0f, f3));
        aix_0.a().a(ais_02);
    }
}

