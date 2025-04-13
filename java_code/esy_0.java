/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from esY
 */
public class esy_0
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

    public esy_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = (aoq_1)arrayList.get(0);
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        long l = 0L;
        if (object4 != null && object4 instanceof elm_0) {
            if (!(object instanceof elw_0)) {
                throw new aob_1("On essaie de compter les \u00e9l\u00e9ments interactifs \u00e0 port\u00e9e d'autre chose qu'un BasicFighter");
            }
            elm_0 elm_02 = (elm_0)object4;
            elw_0 elw_02 = (elw_0)object;
            Iterator<Su> iterator = elm_02.V();
            while (iterator.hasNext()) {
                int n;
                Su su = iterator.next();
                if (su == elw_02 || su == null || su.J_() != 10 || (long)(n = aob_2.c((aoc_2)su, elw_02)) > this.b.a(object, object2, object3, object4)) continue;
                ++l;
            }
        }
        return super.e() * l;
    }

    @Override
    public Enum c() {
        return eyO.aR;
    }

    static {
        a.add(aov_1.j);
        a.add(new aov_1[]{aov_1.b});
    }
}

