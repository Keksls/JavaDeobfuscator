/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eyw
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b = true;
    private aot_2 c;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    public eyw(ArrayList<aot_2> arrayList) {
        short s2 = this.a(arrayList);
        if (s2 == 0) {
            this.b = false;
        }
        if (s2 == 1) {
            this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
        }
        if (s2 == 2) {
            this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
            this.c = arrayList.get(1);
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
            throw new aob_1("On essaie de compter les invocations en dehors d'un combat..." + (String)(this.c == null ? "" : " summonId = " + (int)((aoq_1)this.c).a(null, null, null, null)));
        }
        eqq_1 eqq_12 = erQ.b(this.b, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1L;
        }
        long l = this.a(eqq_12);
        return this.e() * l;
    }

    protected int a(eqq_1 eqq_12) {
        int n = this.c == null ? eqq_12.D_() : eqq_12.c_((int)((aoq_1)this.c).a(null, null, null, null));
        return n;
    }

    @Override
    public Enum c() {
        return eyO.u;
    }

    static {
        a.add(esa_0.i);
        a.add(esa_0.j);
        a.add(new aov_1[]{aov_1.a, aov_1.b});
    }
}

