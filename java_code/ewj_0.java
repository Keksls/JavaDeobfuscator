/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Renamed from ewj
 */
public class ewj_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public ewj_0(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        switch (by) {
            case 0: {
                return;
            }
        }
        e.error((Object)("Mauvais param\u00e9trage du crit\u00e8re : " + Arrays.toString(arrayList.toArray())));
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(object, object2, object4, object3);
        if (epq_22 == null) {
            throw new aob_1("Impossible de r\u00e9cup\u00e9rer la cible du crit\u00e8re");
        }
        if (!(epq_22 instanceof emv_0)) {
            throw new aob_1("La cible " + epq_22 + " du crit\u00e8re est invalide");
        }
        emg_0 emg_02 = (emg_0)((emv_0)((Object)epq_22)).c();
        return emg_02.c(enu_0.b) ? -1 : 0;
    }

    @Override
    public Enum c() {
        return eyO.ef;
    }

    static {
        a.add(esa_0.i);
    }
}

