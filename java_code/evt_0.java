/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from evT
 */
abstract class evt_0
extends esf {
    protected boolean a;
    protected evU b;

    evt_0() {
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        boolean bl;
        epq_2 epq_22 = erQ.a(false, object, object2, object4, object3);
        if (epq_22 == null) {
            return -1;
        }
        elm_0 elm_02 = erQ.b(object4);
        if (elm_02 == null) {
            return -1;
        }
        aff_1 aff_12 = null;
        if (this.a) {
            if (object2 instanceof epq_2) {
                aff_12 = ((epq_2)object2).gg();
            } else if (object2 instanceof aff_1) {
                aff_12 = (aff_1)object2;
            }
            if (aff_12 == null) {
                return 0;
            }
        } else {
            aff_12 = epq_22.P_();
        }
        if (bl = this.a(epq_22, elm_02, aff_12)) {
            return 0;
        }
        return -1;
    }

    protected abstract boolean a(epq_2 var1, elm_0 var2, aff_1 var3);

    protected void b(String string) {
        if (string.equalsIgnoreCase(evU.a.toString())) {
            this.b = evU.a;
        } else if (string.equalsIgnoreCase(evU.b.toString())) {
            this.b = evU.b;
        }
    }
}

