/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class eyq
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b = true;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    public eyq(ArrayList<aot_2> arrayList) {
        short s2 = this.a(arrayList);
        if (s2 == 0) {
            this.b = false;
        }
        if (s2 == 1) {
            this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
        }
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        if (object4 == null) {
            throw new aob_1("Pas de contexte...");
        }
        boolean bl = object4 instanceof elm_0;
        boolean bl2 = object4 instanceof efq_0;
        if (!bl && !bl2) {
            throw new aob_1("On essaie de compter les invocations en dehors d'un combat...");
        }
        if (!(object instanceof epq_2)) {
            throw new aob_1("On essaie de compter les invocations d'un caster qui n'est pas un perso");
        }
        epq_2 epq_22 = erQ.a(this.b, object, object2, object4, object3);
        if (epq_22 == null) {
            return -1L;
        }
        els_0 els_02 = epq_22.ck();
        if (els_02 == null) {
            return 0L;
        }
        int n = 0;
        Collection<sr_0> collection = els_02.aB();
        for (sr_0 sr_02 : collection) {
            if (sr_02.v() != epq_22 || !(sr_02 instanceof ekh_0)) continue;
            ++n;
        }
        return super.e() * (long)n;
    }

    @Override
    public Enum c() {
        return eyO.cZ;
    }

    static {
        a.add(aov_1.j);
        a.add(new aov_1[]{aov_1.a});
    }
}

