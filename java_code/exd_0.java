/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from exD
 */
public class exd_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private final aov_2 b;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public exd_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = arrayList.isEmpty() ? null : (aov_2)arrayList.get(0);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        Su su = erQ.c(object);
        Su su2 = erQ.c(object2);
        if (object == null) {
            return -1;
        }
        if (object2 instanceof sq_0) {
            if ((this.b() == null || ((sq_0)object2).w() == this.b().a()) && su2 == su) {
                return 0;
            }
            return -1;
        }
        if (object2 == null) {
            for (sr_0 sr_02 : ((elm_0)object4).i().f()) {
                if (this.b() != null && sr_02.w() != this.b().a() || !this.a(su, sr_02)) continue;
                return 0;
            }
            return -1;
        }
        boolean bl = this.b != null && this.b.b(object, object3, object3, object4);
        elm_0 elm_02 = erQ.b(object4);
        if (object2 instanceof aff_1 && elm_02 != null) {
            aff_1 aff_12 = (aff_1)object2;
            for (sr_0 sr_03 : elm_02.i().f()) {
                if (bl && !sr_03.P_().a((Object)aff_12) || !this.a(aff_12, sr_03) || !this.a(su, sr_03)) continue;
                return 0;
            }
            return -1;
        }
        return -2;
    }

    private boolean a(Su su, sr_0 sr_02) {
        return erQ.c(sr_02) == su;
    }

    private boolean a(aff_1 aff_12, sr_0 sr_02) {
        return (this.b() == null || sr_02.w() == this.b().a()) && sr_02.c(aff_12.d(), aff_12.e(), aff_12.f());
    }

    ele_0 b() {
        return null;
    }

    @Override
    public Enum c() {
        return eyO.dP;
    }

    static {
        a.add(esa_0.i);
        a.add(esa_0.k);
    }
}

