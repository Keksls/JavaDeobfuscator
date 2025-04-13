/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class exp
extends esf {
    private int a;
    private boolean b;
    private static final ArrayList<aov_1[]> f = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return f;
    }

    public exp() {
    }

    public exp(ArrayList<aot_2> arrayList) {
        short s2 = this.a(arrayList);
        if (s2 == 0) {
            this.a = (int)((aoq_1)arrayList.get(0)).a(null, null, null, null);
            this.b = false;
        } else if (s2 == 1) {
            this.a = (int)((aoq_1)arrayList.get(0)).a(null, null, null, null);
            this.b = ((apc_2)arrayList.get(1)).b(null, null, null, null);
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        boolean bl;
        if (this.b) {
            bl = fas.a.a(this.a);
        } else {
            if (!(object instanceof fao_0)) {
                return -1;
            }
            fao_0 fao_02 = (fao_0)object;
            fam_0 fam_02 = fao_02.cB();
            bl = fam_02.e(this.a);
        }
        return bl ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.fd;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        f.add(aov_1Array);
        aov_1Array = new aov_1[]{aov_1.b, aov_1.c};
        f.add(aov_1Array);
    }
}

