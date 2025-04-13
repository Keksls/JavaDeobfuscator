/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.LinkedList;
import java.util.List;

public class eKt
extends eKp {
    public static final eKp a = new eKt();

    @Override
    public fiz<fio_0> a(epq_2 epq_22, eKq eKq2, short s2) {
        fiz<? extends fio_0> fiz2 = epq_22.hr();
        LinkedList<fio_0> linkedList = new LinkedList<fio_0>();
        LinkedList<fio_0> linkedList2 = new LinkedList<fio_0>();
        for (fio_0 iterable2 : fiz2) {
            Object Spell;
            byte by;
            efa_0 efa_02;
            fio_0 fio_02;
            fio_0 fio_03 = fio_02 = eKq2.j() ? (fio_0)iterable2.aP_() : iterable2;
            if (eKq2.j()) {
                fio_02.c(abd_1.c());
            }
            if ((efa_02 = efa_0.a(by = ((fin_0)(Spell = fio_02.r())).q())) == null) continue;
            if (efa_02.i()) {
                linkedList.add(fio_02);
                continue;
            }
            if (efa_02 != efa_0.h || ((fin_0)Spell).w() && !eKq2.k()) continue;
            ((AbstractList)linkedList2).add(fio_02);
        }
        fiz fiz3 = new fiz(eKq2.d(), fiz2.a(), fiz2.e(), false, false, false);
        List<fio_0> list = linkedList2.subList(0, Math.min(((AbstractCollection)linkedList2).size(), eKq2.c()));
        eKt.a(list, fiz3, eKq2.d());
        eKt.a(linkedList, fiz3, eKq2.d());
        return fiz3;
    }

    private static void a(List<fio_0> list, uf_0 uf_02, short s2) {
        int n = list.size();
        for (int k = 0; k < n && uf_02.b() < s2; ++k) {
            fio_0 fio_02 = list.get(k);
            try {
                uf_02.a(fio_02);
                continue;
            }
            catch (uz_0 uz_02) {
                b.error((Object)"InventoryCapacityReachedException during addToInventory", (Throwable)uz_02);
                continue;
            }
            catch (Uy uy) {
                b.error((Object)"ContentAlreadyPresentException during addToInventory", (Throwable)uy);
            }
        }
    }
}

