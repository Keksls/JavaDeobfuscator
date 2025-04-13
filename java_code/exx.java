/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class exx
extends exz_0 {
    public exx(ArrayList<aot_2> arrayList) {
        super(arrayList);
    }

    @Override
    protected boolean a(sr_0 sr_02, Object object, Object object2, Object object3, Object object4) {
        if (sr_02 == null) {
            return false;
        }
        if (!(sr_02 instanceof eqq_1)) {
            return false;
        }
        Su su = sr_02.v();
        if (su == null) {
            return false;
        }
        eqq_1 eqq_12 = erQ.a(this.g, object, object2, object4, object3);
        return eqq_12.B_() == su.a_();
    }

    @Override
    public Enum c() {
        return eyO.eY;
    }
}

