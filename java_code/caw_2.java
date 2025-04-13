/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from caW
 */
public final class caw_2
extends akk_2 {
    private static final Logger a = Logger.getLogger(caw_2.class);
    private static final String b = "GetDistanceBetween";
    private static final String c = "Return distance between 2 interativeElements, with possibility to choose if that distance must be calculated with pathFinding";
    private static final akf_1[] d = new akf_1[]{new akf_1("IE 1 Id", null, akg_2.e, false), new akf_1("IE 2 Id", null, akg_2.e, false), new akf_1("With pathfind", null, akg_2.f, true)};
    private static final akf_1[] g = new akf_1[]{new akf_1("distance", null, akg_2.e, false)};

    public caw_2(LuaState luaState) {
        super(luaState);
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return d;
    }

    @Override
    @Nullable
    public akf_1[] f() {
        return g;
    }

    @Override
    protected void a(int n) {
        long l = this.g(0);
        long l2 = this.g(1);
        boolean bl = this.l(2);
        ahv ahv2 = ahs.d().b(l);
        if (ahv2 == null) {
            a.warn((Object)("Le premier \u00e9l\u00e9ment est introuvable " + l));
            return;
        }
        ahv ahv3 = ahs.d().b(l2);
        if (ahv3 == null) {
            a.warn((Object)("Le second \u00e9l\u00e9ment est introuvable " + l));
            return;
        }
        pj_0 pj_02 = ahv2.d();
        if (pj_02 == null) {
            a.warn((Object)("Le premier \u00e9l\u00e9ment est introuvable " + l));
            return;
        }
        pj_0 pj_03 = ahv3.d();
        if (pj_03 == null) {
            a.warn((Object)("Le second \u00e9l\u00e9ment est introuvable " + l));
            return;
        }
        aff_1 aff_12 = pj_02.P_();
        aff_1 aff_13 = pj_03.P_();
        if (!bl) {
            this.q(aff_12.e(aff_13));
            return;
        }
        int n2 = caw_2.a(aff_12, aff_13);
        this.q(n2);
    }

    private static int a(aff_1 aff_12, aff_1 aff_13) {
        bmr_1 bmr_12 = azu_0.j().k();
        ut_0 ut_02 = new ut_0();
        ut_02.a = true;
        ut_02.b = 400;
        ut_02.f = false;
        yy_0 yy_02 = new yy_0();
        yz_0.a(aff_12.d(), aff_12.e(), aff_13.d(), aff_13.e(), yy_02);
        uq_0 uq_02 = uq_0.a();
        ut_02.a = ((afe_0)bmr_12.e()).aT() != 8;
        uq_02.a(ut_02);
        uq_02.a((int)bmr_12.W(), bmr_12.X(), bmr_12.fV());
        uq_02.a(yy_02);
        uq_02.a(aff_12);
        uq_02.b(aff_13);
        uq_02.g();
        apl_1 apl_12 = uq_02.e();
        yy_02.F();
        uq_02.release();
        return apl_12.a();
    }

    @Override
    public String b() {
        return c;
    }

    @Override
    public String a() {
        return b;
    }
}

