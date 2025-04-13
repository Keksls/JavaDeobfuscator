/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class ewE
extends esf {
    private boolean a = false;
    private static final ArrayList<aov_1[]> b = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    public ewE(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        switch (by) {
            case 0: {
                this.a = false;
                break;
            }
            case 1: {
                String string = ((apd_2)arrayList.get(0)).b();
                if (!string.equalsIgnoreCase("target")) break;
                this.a = true;
            }
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.b(this.a, object, object2, object4, object3);
        if (!(eqq_12 instanceof erc_2)) {
            return -1;
        }
        erc_2 erc_22 = (erc_2)((Object)eqq_12);
        if (erc_22.hh()) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.cv;
    }

    static {
        b.add(aov_1.j);
        b.add(new aov_1[]{aov_1.a});
    }
}

