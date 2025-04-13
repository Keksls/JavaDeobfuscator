/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from euW
 */
public final class euw_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public euw_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (!(object3 instanceof sd_0)) {
            throw new aob_1("Le crit\u00e8re d'effet est employ\u00e9 pour autre chose qu'un effet");
        }
        Su su = ((sd_0)object3).h();
        if (erQ.f(object3) != su) {
            return -1;
        }
        return 0;
    }

    @Override
    public Enum c() {
        return eyO.eg;
    }

    static {
        a.add(aov_1.j);
    }
}

