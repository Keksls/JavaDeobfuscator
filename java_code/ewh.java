/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class ewh
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private aoq_1 b;

    public ewh(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = (aoq_1)arrayList.get(0);
    }

    public long b() {
        return this.b.b() && this.b.a() ? this.b.a(null, null, null, null) * 1000L : -1L;
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (!(object instanceof ere_2)) {
            throw new aob_1("Le user d'un crit\u00e8re HasWorldProperty doit \u00eatre un character.");
        }
        ere_2 ere_22 = (ere_2)object;
        if (this.b != null) {
            long l = this.b();
            if (System.currentTimeMillis() - ere_22.a() >= l) {
                return 0;
            }
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.eO;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        a.add(aov_1Array);
    }
}

