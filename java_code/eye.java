/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import java.util.ArrayList;

@Criterion(description="Return true if the triggering effect is a MELEE effect", signatures={@Signature})
public class eye
extends esf {
    public eye(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        ejh_0 ejh_02 = erQ.d(object3);
        if (ejh_02 == null) {
            return -1;
        }
        efh_0 efh_02 = (efh_0)ejh_02.f();
        if (efh_02 == null) {
            return -1;
        }
        if (eiu_0.b(ejh_02.h(), ejh_02.i(), efh_02)) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.hp;
    }
}

