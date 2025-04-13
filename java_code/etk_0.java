/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from etk
 */
public final class etk_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public etk_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        if (object3 == null) {
            return 0L;
        }
        if (!(object3 instanceof sd_0)) {
            throw new aob_1("Le crit\u00e8re d'effet est employ\u00e9 pour autre chose qu'un effet");
        }
        Su su = ((sd_0)object3).h();
        if (su == null || !(su instanceof eqq_1)) {
            return 0L;
        }
        return ((eqq_1)((Object)su)).B_();
    }

    @Override
    public Enum c() {
        return eyO.eb;
    }

    static {
        a.add(aov_1.j);
    }
}

