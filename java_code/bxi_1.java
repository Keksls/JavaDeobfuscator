/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from bxi
 */
public final class bxi_1 {
    public static void a(cti_2 cti_22) {
        if (!enp_2.a.d(ens_2.aG)) {
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        bmr_12.a(false, false);
        bwj_1.a().b(cti_22.d());
        bvx_2 bvx_22 = bxi_1.b(cti_22);
        bvx_22.A().a().a(cti_22.c());
        bmr_12.b(bvx_22);
        aPc.f().c(bvx_22.c());
        aPc.f().i();
        bxi_1.d();
        azu_0.j().a(cYX.c);
        apw_0.a().b();
        bvx_22.b();
        long l = bvx_22.A().l() - wc_0.p().getTimeInMillis();
        bvx_22.f(Duration.ofMillis(l).toSeconds());
        if (bvx_22.e() == elp_0.b) {
            bvx_22.Z();
        } else if (bvx_22.e() == elp_0.c) {
            bvx_22.A().b();
        }
        bxi_1.a(bvx_22);
        cbf_2.a("is_in_fight_spectator", true);
        chb_2.a().a(bvx_22);
        bxi_1.c();
        amb_1 amb_12 = cdw_0.n().a(bvx_22);
        cdw_0.n().a(amb_12);
    }

    private static bvx_2 b(cti_2 cti_22) {
        bwo_0 bwo_02 = new bwo_0();
        new eml_2(bwo_02).a(ByteBuffer.wrap(cti_22.h()));
        bvx_2 bvx_22 = bwj_1.a().a((int)cti_22.i(), cti_22.d(), (tg_0)bwo_02, cti_22.r(), cti_22.s(), cti_22.b());
        bwa_1 bwa_12 = new bwa_1();
        bwa_12.a((ctj_1)cti_22, bvx_22);
        return bvx_22;
    }

    private static void c() {
        List<ahr_1> list = bxi_1.b();
        for (int k = 0; k < list.size(); ++k) {
            ahr_1 ahr_12 = list.get(k);
            azu_0.j().a(ahr_12);
        }
    }

    private static void d() {
        azu_0.j().b(dcw.n());
        List<ahr_1> list = bxi_1.a();
        for (int k = 0; k < list.size(); ++k) {
            ahr_1 ahr_12 = list.get(k);
            azu_0.j().b(ahr_12);
        }
    }

    private static void a(bvx_2 bvx_22) {
        fis_1.a().a("fight", bvx_22);
        fis_1.a().a("fight.timeline", bvx_22.A());
        fis_1.a().a("isInFightCreationOrPlacement", true);
        fis_1.a().a("isFightSpectator", true);
    }

    public static List<ahr_1> a() {
        ArrayList<ahr_1> arrayList = new ArrayList<ahr_1>();
        arrayList.add(cfu_1.a());
        return arrayList;
    }

    public static List<ahr_1> b() {
        ArrayList<ahr_1> arrayList = new ArrayList<ahr_1>();
        arrayList.add(ddy_0.a());
        arrayList.add(chb_2.a());
        arrayList.add(cYH.a());
        return arrayList;
    }
}

