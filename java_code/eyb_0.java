/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eyB
 */
public class eyb_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public eyb_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object == null || !(object instanceof epq_2)) {
            throw new aob_1("on test l'appartenance d'une balise \u00e0 autre chose qu'un perso");
        }
        if (object2 instanceof ekf_0) {
            if (((ekf_0)object2).v() != object) {
                return 0;
            }
            return -1;
        }
        if (object2 instanceof aff_1 && object4 instanceof elm_0) {
            elm_0 elm_02 = (elm_0)object4;
            aff_1 aff_12 = (aff_1)object2;
            for (Su su : elm_02.a(aff_12)) {
                if (!(su instanceof ekf_0)) continue;
                if (((ekf_0)su).v() != object) {
                    return 0;
                }
                return -1;
            }
        }
        throw new aob_1("on test l'appartenance d'autre chose qu'une balise");
    }

    @Override
    public Enum c() {
        return eyO.s;
    }

    static {
        a.add(aov_1.j);
    }
}

