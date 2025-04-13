/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from evz
 */
public class evz_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private final boolean b;
    private final boolean f;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public evz_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        if (arrayList.isEmpty()) {
            this.b = false;
            this.f = true;
        } else if (arrayList.size() == 1) {
            this.b = ((aov_2)arrayList.get(0)).b(null, null, null, null);
            this.f = true;
        } else {
            this.b = ((aov_2)arrayList.get(0)).b(null, null, null, null);
            this.f = ((aov_2)arrayList.get(1)).b(null, null, null, null);
        }
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.b(this.f, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1;
        }
        if (!(object instanceof epq_2)) {
            return -1;
        }
        elm_0 elm_02 = null;
        if (object4 instanceof elm_0) {
            elm_02 = (elm_0)object4;
        } else if (object4 instanceof efq_0) {
            elm_02 = ((efq_0)object4).l();
        }
        if (elm_02 == null) {
            return -1;
        }
        aff_1 aff_12 = null;
        if (eqq_12 instanceof epq_2) {
            aff_12 = ((epq_2)eqq_12).gg();
        } else if (eqq_12 instanceof aff_1) {
            aff_12 = (aff_1)((Object)eqq_12);
        }
        if (aff_12 != null) {
            tg_0 tg_02 = elm_02.g();
            if (this.a(tg_02, aff_12.d() + 1, aff_12.e(), this.b)) {
                return 0;
            }
            if (this.a(tg_02, aff_12.d() - 1, aff_12.e(), this.b)) {
                return 0;
            }
            if (this.a(tg_02, aff_12.d(), aff_12.e() + 1, this.b)) {
                return 0;
            }
            if (this.a(tg_02, aff_12.d(), aff_12.e() - 1, this.b)) {
                return 0;
            }
            return -1;
        }
        return -2;
    }

    private boolean a(tg_0 tg_02, int n, int n2, boolean bl) {
        if (tg_02.g(n, n2) != null) {
            return false;
        }
        if (bl) {
            return tg_02.c(n, n2);
        }
        return tg_02.b(n, n2);
    }

    @Override
    public Enum c() {
        return eyO.cp;
    }

    static {
        a.add(esa_0.i);
        a.add(esa_0.k);
        a.add(new aov_1[]{aov_1.c, aov_1.c});
    }
}

