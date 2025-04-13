/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class euL
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    public euL(ArrayList<aot_2> arrayList) {
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(object, object2, object4, object3);
        if (epq_22 == null) {
            throw new aob_1("Unable to retrieve title of character null");
        }
        if (!(object instanceof fjk_0)) {
            throw new aob_1("Unable to retrieve title of character who cannot hold titles");
        }
        return super.e() * (long)((fjk_0)((Object)epq_22)).eM();
    }

    @Override
    public Enum c() {
        return eyO.cM;
    }

    static {
        a.add(aov_1.j);
    }
}

