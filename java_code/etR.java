/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class etR
extends esi_0 {
    private static final List<aov_1[]> a = Collections.singletonList(aov_1.j);

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    public etR(ArrayList<aot_2> arrayList) {
    }

    public etR() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22;
        if (object == null) {
            if (!(object3 instanceof eyc_0)) throw new aob_1("on cherche le nombre de kamas d'un user null");
            epq_22 = ((eyc_0)object3).b();
            return epq_22.cq();
        } else {
            if (!(object instanceof epq_2)) {
                throw new aob_1("on cherche le nombre de kamas d'autre chose qu'un character");
            }
            epq_22 = (epq_2)object;
        }
        return epq_22.cq();
    }

    @Override
    public Enum c() {
        return eyO.W;
    }
}

