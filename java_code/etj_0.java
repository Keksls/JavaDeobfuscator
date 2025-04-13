/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from etJ
 */
public class etj_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    public etj_0(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        this.b = by == 1 && ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("hhmm");
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        wu_0 wu_02 = wc_0.p().a();
        if (this.b) {
            return wu_02.k() * 100 + wu_02.l();
        }
        return wu_02.k();
    }

    @Override
    public Enum c() {
        return eyO.e;
    }

    static {
        a.add(aov_1.j);
        a.add(new aov_1[]{aov_1.a});
    }
}

