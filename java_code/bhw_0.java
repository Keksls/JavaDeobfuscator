/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHW
 */
public class bhw_0 {
    private static final Logger a = Logger.getLogger(bhw_0.class);

    private bhw_0() {
    }

    private static big_0 c(asm_0 asm_02) {
        return big_0.a(asm_02.y());
    }

    private static bHL d(asm_0 asm_02) {
        return bHL.a(asm_02.z());
    }

    private static void a(bjx_1 bjx_12, asm_0 asm_02, Map<exz_1, apc_2> map) {
        ((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)((bjx_1)bjx_12.a(asm_02.c())).a(asm_02.d())).b(asm_02.e())).c(asm_02.f() == 0 ? asm_02.e() : asm_02.f())).d(asm_02.g())).b(asm_02.h())).a(map)).a(bhw_0.e(asm_02))).c(asm_02.k())).a(asm_02.l())).b(asm_02.m())).c(asm_02.n())).e(asm_02.o())).f(asm_02.p())).a(asm_02.q())).b(asm_02.r())).c(asm_02.s())).d(asm_02.t())).a(bhw_0.g(asm_02))).a(bhw_0.h(asm_02))).a(bhw_0.f(asm_02))).a(bhw_0.b(asm_02))).a(bhw_0.a(asm_02))).d(asm_02.A())).e(asm_02.B())).b(asm_02.D())).a(asm_02.C())).a(exy_1.a(asm_02.E()));
    }

    private static exq_1 e(asm_0 asm_02) {
        return bHJ.a().a(asm_02.j());
    }

    private static eyc_1 f(asm_0 asm_02) {
        return eyc_1.valueOf(asm_02.w());
    }

    private static exw_1 g(asm_0 asm_02) {
        return exw_1.a(asm_02.u());
    }

    private static eyh_1 h(asm_0 asm_02) {
        eyh_1 eyh_12 = eyh_1.a(asm_02.v());
        if (eyh_12 != eyh_1.a && enp_2.a.d(ens_2.ax)) {
            return eyh_1.a(true, eyh_12.g(), eyh_12.b());
        }
        return eyh_12;
    }

    public static bjw_1 a(asm_0 asm_02, Map<exz_1, apc_2> map) {
        bjx_1 bjx_12 = new bjx_1();
        bhw_0.a(bjx_12, asm_02, map);
        bjx_12.a(bhw_0.c(asm_02)).a(bhw_0.d(asm_02));
        return (bjw_1)bjx_12.a();
    }

    @Nullable
    public static eZu a(asm_0 asm_02) {
        byte[] byArray;
        eZu eZu2 = new eZu();
        aso_0 aso_02 = asm_02.H();
        if (aso_02 == null) {
            return null;
        }
        for (byte by : byArray = aso_02.b()) {
            exh_2 exh_22 = exh_2.a(by);
            if (exh_22 == null) {
                a.fatal((Object)("Item " + asm_02.c() + " has invalid EquipmentPosition : " + by));
                continue;
            }
            eZu2.a(exh_22);
        }
        tc_0 tc_02 = tc_0.a(aso_02.a());
        if (tc_02 == null) {
            a.fatal((Object)("Item " + asm_02.c() + " has invalid SlotColor : " + aso_02.a()));
        } else {
            eZu2.a(tc_02);
        }
        eZu2.a(aso_02.c()).b(aso_02.d()).a(aso_02.e());
        return eZu2;
    }

    @Nullable
    public static ezf_0 b(asm_0 asm_02) {
        aSp aSp2 = asm_02.I();
        if (aSp2 == null) {
            return null;
        }
        byte[] byArray = aSp2.b();
        if (byArray == null) {
            return null;
        }
        ezf_0 ezf_02 = new ezf_0();
        tc_0[] tc_0Array = new tc_0[byArray.length];
        for (int k = 0; k < byArray.length; ++k) {
            tc_0 tc_02 = tc_0.a(byArray[k]);
            if (tc_02 == null) {
                a.fatal((Object)("Item " + asm_02.c() + " has invalid SlotColor : " + k + " for slotColorPattern"));
                return null;
            }
            tc_0Array[k] = tc_02;
        }
        ezf_02.a(tc_0Array);
        ezh_0 ezh_02 = ezh_0.a(aSp2.c(), aSp2.d());
        ezf_02.a(ezh_02);
        return ezf_02;
    }
}

