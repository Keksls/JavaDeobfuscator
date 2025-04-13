/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from exq
 */
public class exq_0
extends esf {
    private aoq_1 a;
    private static final ArrayList<aov_1[]> b = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    public exq_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.a = (aoq_1)arrayList.get(0);
    }

    public int b() {
        if (this.a.b() && this.a.a()) {
            return (int)this.a.a(null, null, null, null);
        }
        return -1;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (!(object instanceof epq_2)) {
            throw new aob_1("Le user d'un crit\u00e8re IsMonsterBreed doit \u00eatre un player.");
        }
        epq_2 epq_22 = (epq_2)object;
        epq_1 epq_12 = epq_22.Z_();
        int n = this.b();
        if (n == epq_12.s()) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.Z;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.b};
        b.add(aov_1Array);
    }
}

