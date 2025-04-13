/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import java.util.ArrayList;

/*
 * Renamed from ewA
 */
@Criterion(description="Return true if the user is really brave.", signatures={@Signature})
public final class ewa_0
extends esf {
    public ewa_0() {
    }

    public ewa_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.c(object, object2, object4, object3);
        if (!(eqq_12 instanceof epq_2)) {
            return -1;
        }
        if (((epq_2)eqq_12).en() == 30637) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.hF;
    }
}

