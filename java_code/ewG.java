/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class ewG
extends esf {
    private boolean a;
    private static final ArrayList<aov_1[]> b = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    public ewG(ArrayList<aot_2> arrayList) {
        String string;
        byte by = this.a(arrayList);
        if (by == 0) {
            this.a = false;
        } else if (by == 1 && (string = ((apd_2)arrayList.get(0)).b()).equalsIgnoreCase("target")) {
            this.a = true;
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(this.a, object, object2, object4, object3);
        if (epq_22 == null) {
            return -1;
        }
        erc_2 erc_22 = epq_22.he();
        if (!(erc_22 instanceof ekd_0)) {
            return -1;
        }
        if (((sq_0)((Object)erc_22)).v() == epq_22) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.cx;
    }

    static {
        b.add(esa_0.i);
        b.add(esa_0.j);
    }
}

