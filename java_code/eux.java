/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class eux
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Override
    public boolean a() {
        return true;
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public eux(ArrayList<aot_2> arrayList) {
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(eyJ.b, object, object2, object4, object3);
        if (epq_22 == null) {
            return -1L;
        }
        if (!(epq_22 instanceof erk_2)) {
            return -1L;
        }
        erm_2 erm_22 = (erm_2)epq_22.dQ();
        if (erm_22 == null) {
            return -1L;
        }
        long l = erm_22.h();
        return this.e() * l;
    }

    @Override
    public Enum c() {
        return eyO.h;
    }

    static {
        a.add(esa_0.i);
    }
}

