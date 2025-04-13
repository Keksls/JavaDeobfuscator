/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

abstract class ewu
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    ewu(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        if (object2 == null) {
            if (this.f()) {
                return -1;
            }
            for (sr_0 sr_02 : ((els_0)object4).i().f()) {
                if (!this.a(sr_02)) continue;
                return 0;
            }
            return -1;
        }
        if (object2 instanceof sz_0) {
            return this.a(((sz_0)object2).am()) ? 0 : -1;
        }
        elm_0 elm_02 = null;
        if (object4 instanceof elm_0) {
            elm_02 = (elm_0)object4;
        } else if (object4 instanceof efq_0) {
            elm_02 = ((efq_0)object4).l();
        }
        if (object2 instanceof aff_1 && elm_02 != null) {
            for (sr_0 sr_03 : elm_02.i().f()) {
                aff_1 aff_12;
                if (!this.a(sr_03, aff_12 = (aff_1)object2)) continue;
                return 0;
            }
            return -1;
        }
        return -2;
    }

    protected boolean a(sr_0 sr_02, aff_1 aff_12) {
        if (sr_02 == null) {
            return false;
        }
        return this.a(sr_02) && sr_02.c(aff_12.d(), aff_12.e(), aff_12.f());
    }

    protected boolean a(sr_0 sr_02) {
        return sr_02.w() == this.b().a();
    }

    abstract ele_0 b();

    static {
        a.add(esa_0.i);
    }
}

