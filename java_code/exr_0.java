/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from exR
 */
public class exr_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public exr_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object == null) {
            throw new aob_1("On cherche les summons d'un user null");
        }
        if (!(object instanceof erk_2)) {
            throw new aob_1("On cherche les summons d'un user qui n'a pas de symbiote");
        }
        Object t = ((erk_2)object).dQ();
        if (t == null) {
            throw new aob_1("On cherche les summons d'un user qui n'a pas de symbiote");
        }
        if (t.a() == null) {
            return -1;
        }
        if (t.b(t.c())) {
            return 0;
        }
        return -2;
    }

    @Override
    public Enum c() {
        return eyO.ht;
    }

    static {
        a.add(esa_0.i);
    }
}

