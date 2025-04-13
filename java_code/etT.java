/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class etT
extends esi_0 {
    private int a;
    private static final ArrayList<aov_1[]> b = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    public etT() {
    }

    public etT(ArrayList<aot_2> arrayList) {
        short s2 = this.a(arrayList);
        if (s2 == 0) {
            this.a = (int)((aoq_1)arrayList.get(0)).a(null, null, null, null);
        } else if (s2 == 1) {
            this.a = (int)((aoq_1)arrayList.get(0)).a(null, null, null, null);
        }
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        if (!(object instanceof fao_0)) {
            return 0L;
        }
        fao_0 fao_02 = (fao_0)object;
        fam_0 fam_02 = fao_02.cB();
        return fam_02.j(this.a);
    }

    @Override
    public Enum c() {
        return eyO.fd;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        b.add(aov_1Array);
    }
}

