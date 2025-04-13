/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eyn
extends eym_0 {
    private static final ArrayList<aov_1[]> c = new ArrayList();
    private long e;

    @Override
    protected List<aov_1[]> i() {
        return c;
    }

    public eyn(ArrayList<aot_2> arrayList) {
        short s2 = this.a(arrayList);
        this.a = true;
        this.b = "caster";
        if (s2 == 0) {
            this.e = ((aoq_1)arrayList.get(0)).a(null, null, null, null);
        } else if (s2 == 1) {
            this.a = false;
            this.e = ((aoq_1)arrayList.get(0)).a(null, null, null, null);
            this.b = ((apd_2)arrayList.get(1)).b();
        }
    }

    @Override
    protected int f() {
        return -1;
    }

    @Override
    protected boolean a(sr_0 sr_02) {
        return sr_02.A() == this.e;
    }

    @Override
    public Enum c() {
        return eyO.eJ;
    }

    static {
        c.add(esa_0.l);
        c.add(new aov_1[]{aov_1.b, aov_1.a});
    }
}

