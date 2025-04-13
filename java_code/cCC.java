/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Optional;
import org.apache.log4j.Logger;

public final class cCC
implements adx_1<cxz_1> {
    private static final Logger a = Logger.getLogger(cCC.class);

    @Override
    public boolean a(cxz_1 cxz_12) {
        bmr_1 bmr_12 = azu_0.j().k();
        Optional<ece_0> optional = bmr_12.eW();
        if (optional.isEmpty()) {
            return false;
        }
        if (!optional.get().e(cxz_12.f())) {
            return false;
        }
        byte by = cxz_12.b();
        if (by == 7) {
            return false;
        }
        if (by == 4) {
            aUh.b("collect.error.resourceOccupied", new Object[0]);
            return false;
        }
        if (by != 5) {
            return false;
        }
        for (abo_2<Long, exk_2> abo_22 : cxz_12.g()) {
            exk_2 exk_22 = abo_22.b();
            exg_2 exg_22 = bmr_12.da().d(abo_22.a());
            if (exg_22 == null || exg_22.o() == null || exg_22.o().a(exg_22.g(), exk_22) < 0) continue;
            try {
                exg_22.f(exk_22);
                bjy_1.b(exk_22, null);
                if (!((bvx_0)ans_0.D().h()).a(bWe.al)) continue;
                ezr_0<?> ezr_02 = exk_22.T();
                ArrayList<bOv> arrayList = azu_0.j().k().cg().d(false);
                boolean bl = false;
                for (bOv bOv2 : arrayList) {
                    ArrayList<boq_0> arrayList2 = bOv2.a(ezr_02.n());
                    for (boq_0 boq_02 : arrayList2) {
                        if (boq_02.n() != fie.b) continue;
                        bl = true;
                        break;
                    }
                    if (!bl) continue;
                    break;
                }
                if (bl || !(ezr_02.p() instanceof bjc_2)) continue;
                dhy dhy2 = new dhy();
                dhy2.b(exg_22.c(ezr_02.n()));
                dhy2.c(-1);
                dhy2.d(-1);
                dhy2.a(false);
                dhy2.b(true);
                dhy2.a_(19194);
                add_2.b().a(dhy2);
            }
            catch (Exception exception) {
                a.error((Object)"Exception during ResourceSynchroMessageRunner.run", (Throwable)exception);
            }
        }
        if (bmr_12.eE() != null && bmr_12.eE().ac_() == 3) {
            bmr_12.dN();
        }
        return false;
    }

    @Override
    public int a() {
        return 12831;
    }
}

