/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class erG
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public erG(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object2 == null || !(object2 instanceof erc_2)) {
            return -1;
        }
        if (object == null || !(object instanceof erb_2)) {
            return -1;
        }
        erb_2 erb_22 = (erb_2)object;
        erc_2 erc_22 = (erc_2)object2;
        if (erb_22.b(erc_22) && erc_22.b(erb_22)) {
            return 0;
        }
        return -2;
    }

    @Override
    public Enum c() {
        return eyO.ai;
    }

    static {
        a.add(aov_1.j);
    }
}

