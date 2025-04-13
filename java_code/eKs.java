/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.LinkedList;

public class eKs
extends eKp {
    public static final eKp a = new eKs();

    @Override
    public fiz<fio_0> a(epq_2 epq_22, eKq eKq2, short s2) {
        fiz<? extends fio_0> fiz2 = epq_22.hr();
        LinkedList<fio_0> linkedList = new LinkedList<fio_0>();
        for (fio_0 gq_122 : fiz2) {
            byte by;
            efa_0 efa_02;
            fio_0 k;
            fio_0 fio_02 = k = eKq2.j() ? (fio_0)gq_122.aP_() : gq_122;
            if (eKq2.j()) {
                k.c(abd_1.c());
            }
            Object uz_02 = k.r();
            Iterator<efh_0> iterator = ((fin_0)uz_02).a(s2);
            boolean bl = false;
            while (iterator.hasNext() && !bl) {
                efh_0 by2 = iterator.next();
                if (by2.j() != efc_0.dI.a() && by2.j() != efc_0.dO.a()) continue;
                bl = true;
            }
            if (bl || (efa_02 = efa_0.a(by = ((fin_0)uz_02).q())) == null || !efa_02.i()) continue;
            linkedList.add(k);
        }
        int n = eKq2.d();
        fiz<fio_0> fiz3 = new fiz<fio_0>((short)n, fiz2.a(), fiz2.e(), false, false, false);
        for (int k = 0; k < n && k < linkedList.size(); ++k) {
            try {
                ((uf_0)fiz3).a((fio_0)linkedList.get(k));
                continue;
            }
            catch (uz_0 uy) {
                b.error((Object)"InventoryCapacityReachedException during getSpells", (Throwable)uy);
                continue;
            }
            catch (Uy uy) {
                b.error((Object)"ContentAlreadyPresentException during getSpells", (Throwable)uy);
            }
        }
        return fiz3;
    }
}

