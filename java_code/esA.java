/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class esA
extends esf {
    private static final List<aov_1[]> a = List.of(new aov_1[]{aov_1.a});
    private String b = null;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public esA(List<aot_2> list) {
        this.a(list);
        this.b = ((apd_2)list.get(0)).b();
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        ens_2 ens_22 = ens_2.a(this.b);
        if (ens_22 == null) {
            return -1;
        }
        return enp_2.a.d(ens_22) ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.fn;
    }
}

