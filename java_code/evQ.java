/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class evQ
extends evo_0 {
    public evQ(ArrayList<aot_2> arrayList) {
        super(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.a(this.f, object, object2, object4, object3);
        eqq_1 eqq_13 = erQ.b(false, object, object2, object4, object3);
        if (eqq_12 == null && object3 instanceof eyc_0) {
            eqq_12 = ((eyc_0)object3).b();
        }
        if (eqq_12 == null) {
            return -1;
        }
        boolean bl = this.b == null ? eqq_12.a(this.a.a(object, object2, object3, object4), eqq_13) : eqq_12.a(this.a.a(object, object2, object3, object4), this.b.a(object, object2, object3, object4), eqq_13);
        if (bl) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.fe;
    }
}

