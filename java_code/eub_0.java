/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from euB
 */
public class eub_0
extends esi_0 {
    private boolean a = false;
    private static final ArrayList<aov_1[]> b = new ArrayList();

    public eub_0(ArrayList<aot_2> arrayList) {
        short s2 = this.a(arrayList);
        if (s2 == 0) {
            this.a = false;
        }
        if (s2 == 1) {
            this.a = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
        }
    }

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    public boolean f() {
        return this.a;
    }

    @Override
    public Enum c() {
        return eyO.aW;
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22 = erQ.a(this.a, object, object2, object4, object3);
        if (epq_22 == null) {
            return -1L;
        }
        long l = (long)(epq_22.cu() * 100.0f);
        return super.e() * l * -1L;
    }

    static {
        b.add(aov_1.j);
        b.add(new aov_1[]{aov_1.a});
    }
}

