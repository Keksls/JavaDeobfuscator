/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

final class bcT
implements adx_1<csi> {
    private static final Logger a = Logger.getLogger(bcT.class);

    bcT() {
    }

    @Override
    public boolean a(csi csi2) {
        boolean bl;
        Object object;
        ajf_1 ajf_12;
        bai_0 bai_02 = azu_0.j().n();
        long l = csi2.b();
        eBt eBt2 = eBo.a.a(bai_02.u(), l);
        if (eBt2 == null) {
            a.error((Object)("Impossible de modifier l'inventaire du compagnon " + l));
            return false;
        }
        ArrayList<exk_2> arrayList = new ArrayList<exk_2>();
        try {
            exk_2 exk_22;
            eBk eBk2 = new eBk(eBt2);
            exq_2 exq_22 = eBt2.h();
            ajf_12 = (exk_2)exq_22.e(csi2.d());
            if (ajf_12 != null && !((exk_2)ajf_12).aU_() && (exk_22 = exq_22.a(((exk_2)ajf_12).aT_(), new bcU(this))) != null) {
                object = exk_22.T().F().j();
                short s2 = exq_22.f(exk_22.a());
                int n = 0;
                for (Object object2 : object) {
                    if (((exh_2)object2).a() != csi2.d()) continue;
                    n = 1;
                }
                if (n != 0) {
                    arrayList.add((exk_2)exq_22.b(s2));
                }
            }
            exk_22 = csi2.e();
            object = exk_22.T().F().j();
            arrayList.add((exk_2)exq_22.b(csi2.d()));
            for (exh_2 exh_22 : object) {
                arrayList.add((exk_2)exq_22.b(exh_22.a()));
            }
            eBk2.a(csi2.d(), exq_22, exk_22);
        }
        catch (Exception exception) {
            a.error((Object)"Exception levee", (Throwable)exception);
        }
        long l2 = csi2.c();
        ajf_12 = (bmr_1)euu_2.c(bai_02.u(), l2);
        if (ajf_12 == null) {
            return false;
        }
        try {
            bjp_1.a(csi2.f());
        }
        catch (Exception exception) {
            a.error((Object)"Exception levee", (Throwable)exception);
        }
        boolean bl2 = bl = !cxo_0.b(eBt2.a());
        if (bl) {
            object = cxo_0.a(eBt2);
            bqU bqU2 = new bqU((blx_1)object, new bqY(eBt2));
            cxo_0.b(bqU2);
            cyt_0.a().t();
        } else {
            cyt_0.a().i();
        }
        for (exk_2 exk_22 : arrayList) {
            cxo_0.a(eBt2, exk_22);
        }
        return false;
    }

    @Override
    public int a() {
        return 12181;
    }
}

