/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from esU
 */
public class esu_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private wt_0 b;

    public esu_0(ArrayList<aot_2> arrayList) {
        if (this.a(arrayList) == 1) {
            this.b = new wt_0((int)((aoq_1)arrayList.get(5)).a(null, null, null, null), (int)((aoq_1)arrayList.get(4)).a(null, null, null, null), (int)((aoq_1)arrayList.get(3)).a(null, null, null, null), (int)((aoq_1)arrayList.get(0)).a(null, null, null, null), (int)((aoq_1)arrayList.get(1)).a(null, null, null, null), (int)((aoq_1)arrayList.get(2)).a(null, null, null, null));
        }
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        if (this.b != null) {
            return this.b.h();
        }
        return wc_0.p().a().h();
    }

    @Override
    public Enum c() {
        return eyO.aY;
    }

    static {
        a.add(aov_1.j);
        a.add(new aov_1[]{aov_1.b, aov_1.b, aov_1.b, aov_1.b, aov_1.b, aov_1.b});
    }
}

