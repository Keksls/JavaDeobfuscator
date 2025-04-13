/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class ewv
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private final long b;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public ewv(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = ((aoq_1)arrayList.get(0)).a(null, null, null, null);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object2 == null) {
            for (sr_0 sr_02 : ((els_0)object4).i().f()) {
                if ((long)sr_02.w() != this.b) continue;
                return 0;
            }
            return -1;
        }
        if (object2 instanceof sz_0) {
            sr_0 sr_03 = ((sz_0)object2).am();
            if (sr_03 == null) {
                return -1;
            }
            return (long)sr_03.w() == this.b ? 0 : -1;
        }
        elm_0 elm_02 = null;
        if (object4 instanceof elm_0) {
            elm_02 = (elm_0)object4;
        } else if (object4 instanceof efq_0) {
            elm_02 = ((efq_0)object4).l();
        }
        if (object2 instanceof aff_1 && elm_02 != null) {
            aff_1 aff_12 = (aff_1)object2;
            for (sr_0 sr_04 : elm_02.i().f()) {
                if ((long)sr_04.w() != this.b || !sr_04.c(aff_12.d(), aff_12.e(), aff_12.f())) continue;
                return 0;
            }
            return -1;
        }
        return -2;
    }

    @Override
    public Enum c() {
        return eyO.gJ;
    }

    static {
        a.add(esa_0.l);
    }
}

