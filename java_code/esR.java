/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class esR
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private aoq_1 b;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public esR(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        if (arrayList.size() == 1) {
            this.b = (aoq_1)arrayList.get(0);
        }
    }

    public int f() {
        if (this.b != null && this.b.b() && this.b.a()) {
            return (int)this.b.a(null, null, null, null);
        }
        return -1;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = null;
        if (object instanceof epq_2) {
            epq_22 = (epq_2)object;
        } else if (object3 instanceof eyc_0) {
            epq_22 = ((eyc_0)object3).b();
        }
        if (epq_22 == null) {
            throw new aob_1("Impossible de r\u00e9cup\u00e9rer la cible du crit\u00e8re");
        }
        if (this.b != null) {
            int n = (int)this.b.a(object, object2, object3, object4);
            return epq_22.fE().c(n);
        }
        return epq_22.fE().c(epq_22.fE().n());
    }

    @Override
    public Enum c() {
        return eyO.bh;
    }

    static {
        a.add(aov_1.j);
        a.add(new aov_1[]{aov_1.b});
    }
}

