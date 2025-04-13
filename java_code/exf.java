/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import java.util.ArrayList;

@Criterion(description="Return true if the user is in a Admin Jail (ModerationConstants.MODERATION_JAIL_INSTANCE_ID)", signatures={@Signature})
public final class exf
extends esf {
    public exf() {
    }

    public exf(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.c(object, object2, object4, object3);
        if (!(eqq_12 instanceof epq_2)) {
            return -1;
        }
        if (((epq_2)eqq_12).T_() == 725L) {
            return 0;
        }
        return -1;
    }

    @Override
    public Enum c() {
        return eyO.hr;
    }
}

