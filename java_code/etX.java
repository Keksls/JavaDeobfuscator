/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class etX
extends esi_0 {
    private static final int a = -1;
    private static final ArrayList<aov_1[]> b = new ArrayList();
    private aoq_1 c;
    private aoq_1 e;

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    @Override
    public boolean a() {
        return true;
    }

    public etX(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        if (by == 0) {
            this.c = null;
            this.e = (aoq_1)arrayList.get(0);
        } else if (by == 1) {
            this.c = (aoq_1)arrayList.get(0);
            this.e = (aoq_1)arrayList.get(1);
        }
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        int n;
        Object object5;
        if (this.c == null) {
            object5 = erQ.a(object, object2, object4, object3);
            if (object5 == null) {
                throw new aob_1("Impossible de r\u00e9cup\u00e9rer la cible du crit\u00e8re");
            }
            n = ((epq_2)object5).fE().n();
        } else {
            n = (int)this.c.a(object, object2, object3, object4);
        }
        int n2 = (int)this.e.a(object, object2, object3, object4);
        object5 = fbc_0.a.a(n).F().c(n2);
        return super.e() * (long)((fbl_0)object5).a();
    }

    @Override
    public Enum c() {
        return eyO.aU;
    }

    public aoq_1 f() {
        return this.c;
    }

    public aoq_1 j() {
        return this.e;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        b.add(aov_1Array);
        aov_1Array = new aov_1[2];
        aov_1Array[0] = aov_1Array[1] = aov_1.b;
        b.add(aov_1Array);
    }
}

