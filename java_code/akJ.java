/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaState;

public final class akJ
extends akk_2
implements all {
    private static final akf_1[] a = new akf_1[]{new akf_1("mobileId", null, akg_2.b, false), new akf_1("destX", null, akg_2.d, false), new akf_1("destY", null, akg_2.d, false), new akf_1("destZ", null, akg_2.d, false), new akf_1("duration", null, akg_2.d, false), new akf_1("startVectorX", null, akg_2.e, false), new akf_1("startVectorY", null, akg_2.e, false), new akf_1("startVectorZ", null, akg_2.e, false), new akf_1("endVectorX", null, akg_2.e, false), new akf_1("endVectorY", null, akg_2.e, false), new akf_1("endVectorZ", null, akg_2.e, false)};

    public akJ(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "addCubicSplineTweenToMobile";
    }

    @Override
    public String b() {
        return "Move the mobile based on vectors trajectories";
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
        int n2 = this.d(1);
        int n3 = this.d(2);
        int n4 = this.d(3);
        int n5 = this.d(4);
        float f2 = (float)this.e(5);
        float f3 = (float)this.e(6);
        float f4 = (float)this.e(7);
        float f5 = (float)this.e(8);
        float f6 = (float)this.e(9);
        float f7 = (float)this.e(10);
        ais_0 ais_02 = new ais_0(abu2);
        ais_02.c(new afr_2(n2, n3, n4));
        ais_02.a(new afr_2(abu2.G(), abu2.H(), abu2.I()));
        ais_02.a((long)n5);
        ais_02.b(new afr_2(f2, f3, f4));
        ais_02.d(new afr_2(f5, f6, f7));
        aix_0.a().a(ais_02);
    }
}

