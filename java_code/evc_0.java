/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from evc
 */
public class evc_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private aoq_1 b;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    public evc_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = (aoq_1)arrayList.get(0);
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        long l = 0L;
        if (object4 instanceof elm_0) {
            if (!(object instanceof elw_0)) {
                throw new aob_1("On essaie de compter les walls \u00e0 port\u00e9e d'autre chose qu'un BasicFighter");
            }
            elm_0 elm_02 = (elm_0)object4;
            elw_0 elw_02 = (elw_0)object;
            for (sr_0 sr_02 : elm_02.i().f()) {
                int n;
                if (sr_02 == null || sr_02.w() != ele_0.h.a() || (long)(n = aob_2.c((aoc_2)sr_02, elw_02)) > this.b.a(object, object2, object3, object4)) continue;
                ++l;
            }
        }
        return super.e() * l;
    }

    @Override
    public Enum c() {
        return eyO.db;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{};
        a.add(aov_1Array);
        aov_1Array = new aov_1[]{aov_1.b};
        a.add(aov_1Array);
    }
}

