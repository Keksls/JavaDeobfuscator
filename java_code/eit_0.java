/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * Renamed from eIT
 */
abstract class eit_0
extends ejh_0 {
    private static final short v = 8;
    private static final short w = 2;
    private fiz<fio_0> x;

    eit_0() {
    }

    protected void aE() {
        if (!(this.f instanceof epq_2)) {
            return;
        }
        epq_2 epq_22 = (epq_2)this.f;
        fiz<fio_0> fiz2 = epq_22.aZ();
        ArrayList<fio_0> arrayList = new ArrayList<fio_0>();
        ArrayList<fio_0> arrayList2 = new ArrayList<fio_0>();
        this.a(fiz2, arrayList, true, false);
        this.a(fiz2, arrayList2, false, true);
        arrayList.sort(fkx_0.a());
        arrayList2.sort(fkx_0.a());
        List list = arrayList2.size() > 0 ? arrayList2.subList(0, Math.min(arrayList2.size(), 2)) : new LinkedList();
        list.addAll(arrayList.subList(0, Math.min(arrayList.size(), 8 - list.size())));
        this.x = new fiz(8, fiz2.a(), fiz2.e(), false, false, false);
        for (fio_0 fio_02 : list) {
            try {
                if (this.x.e(fio_02)) {
                    a.warn((Object)("Le sort est deja contenu dans l'inventaire, il faut v\u00e9rifier si son \u00e9l\u00e9ment n'est pas PHYSICAL id : " + fio_02.aT_()));
                    continue;
                }
                ((uf_0)this.x).a(fio_02);
            }
            catch (uz_0 uz_02) {
                a.error((Object)"InventoryCapacityReachedException during createSpellInventoryForController", (Throwable)uz_02);
            }
            catch (Uy uy) {
                a.error((Object)"ContentAlreadyPresentException during createSpellInventoryForController", (Throwable)uy);
            }
        }
    }

    private void a(fiz<fio_0> fiz2, List<fio_0> list, boolean bl, boolean bl2) {
        for (fio_0 fio_02 : fiz2) {
            Object Spell = fio_02.r();
            Iterator<efh_0> iterator = ((fin_0)Spell).a(this.aZ());
            byte by = ((fin_0)Spell).q();
            efa_0 efa_02 = efa_0.a(by);
            if (efa_02 == null || !bl && efa_02.i() || !bl2 && efa_02 == efa_0.h || ((fin_0)Spell).w()) continue;
            boolean bl3 = false;
            while (iterator.hasNext()) {
                efh_0 efh_02 = iterator.next();
                if (efh_02.j() != efc_0.dI.a() && efh_02.j() != efc_0.dK.a() && efh_02.j() != efc_0.dO.a()) continue;
                bl3 = true;
                break;
            }
            if (bl3) continue;
            list.add(fio_02);
        }
    }

    @Override
    protected void b(iQ iQ2) {
        iQ2.a(iq_0.ai().a(this.x.f()));
    }

    @Override
    protected void c(iO iO2) {
        if (iO2.q()) {
            epq_2 epq_22 = (epq_2)this.i();
            if (epq_22 == null || epq_22.a_() < 0L) {
                return;
            }
            epq_22.a(iO2.r().af());
        }
    }
}

