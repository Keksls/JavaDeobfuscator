/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from exX
 */
public final class exx_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private final String b;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public exx_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = ((apd_2)arrayList.get(0)).b();
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.a(this.b, object, object2, object4, object3);
        return eqq_12 != null && eqq_12.C_() ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.dB;
    }

    static {
        a.add(new aov_1[]{aov_1.a});
    }
}

