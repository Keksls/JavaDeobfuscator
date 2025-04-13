/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class exS
extends esf {
    private byte a;
    private boolean b = false;
    private static final ArrayList<aov_1[]> f = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return f;
    }

    public boolean b() {
        return this.b;
    }

    public exS(ArrayList<aot_2> arrayList) {
        String string;
        byte by = this.a(arrayList);
        if (by == 1 && (string = ((apd_2)arrayList.get(1)).b()).equalsIgnoreCase("target")) {
            this.b = true;
        }
        this.a = (string = ((apd_2)arrayList.get(0)).b()).equalsIgnoreCase("Male") ? (byte)0 : 1;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(this.b, object, object2, object4, object3);
        if (epq_22 == null) {
            return -1;
        }
        if (epq_22.gX() == this.a) {
            return 0;
        }
        return 1;
    }

    @Override
    public Enum c() {
        return eyO.O;
    }

    public byte d() {
        return this.a;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.a};
        f.add(aov_1Array);
        aov_1Array = new aov_1[]{aov_1.a, aov_1.a};
        f.add(aov_1Array);
    }
}

