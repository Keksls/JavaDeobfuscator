/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class deu {
    private deu() {
    }

    public static void a(fvE fvE2) {
        azf_2 azf_22 = new azf_2(anr_0.U.i());
        azf_2 azf_23 = new azf_2(azf_2.e.i());
        fqj fqj2 = fvE2.getAppearance();
        fjp_2 fjp_22 = new fjp_2(azf_22, azf_23, fqj2, 0, 500, -1, fjw_2.b);
        fqj2.addTween(fjp_22);
        dev dev2 = new dev(fqj2, fvE2);
        fvE2.addEventListener(frd_0.C, dev2, false);
    }

    public static void a(fyy_0 fyy_02) {
        Object object;
        Object object2;
        fvE fvE2 = null;
        ArrayList<fqt> arrayList = new ArrayList<fqt>();
        Object object3 = new fjj_1(fyy_02);
        while (((fjj_1)object3).hasNext()) {
            object2 = ((fjj_1)object3).a();
            if (!(object2 instanceof fvE)) continue;
            object = (fvE)object2;
            if (fvE2 == null) {
                fvE2 = object;
            }
            arrayList.add(((fvE)object).getAppearance());
        }
        if (fvE2 == null) {
            return;
        }
        object3 = new azf_2(azf_2.e.i());
        object2 = new azf_2(azf_2.b.i());
        object = new fjo_2((azj_2)object3, (azj_2)object2, arrayList, 0, 250, 6, fjw_2.b);
        fvE2.addTween((fjg_2)object);
    }
}

