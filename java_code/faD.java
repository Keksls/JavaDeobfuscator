/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class faD {
    private faD() {
    }

    public static faF a(exk_2 exk_22, mq_1 mq_12) {
        Short s2;
        if (exk_22.aT_() != mq_12.e()) {
            return faF.b;
        }
        if (exk_22.ab()) {
            return faF.c;
        }
        if (mq_12.w() && ((s2 = exk_22.F()) == null || s2 < mq_12.x())) {
            return faF.d;
        }
        boolean bl = exk_22.y();
        List<Integer> list = mq_12.y();
        if (!list.isEmpty() && !list.equals(faH.b)) {
            if (bl) {
                boolean bl2 = mq_12.A() && mq_12.B();
                List<Integer> list2 = faH.a(exk_22.C());
                if (!faH.a(mq_12.y(), list2, bl2)) {
                    return faF.e;
                }
            } else if (!list.equals(faH.a)) {
                return faF.e;
            }
        }
        if (mq_12.C()) {
            if (!bl) {
                return faF.f;
            }
            eZw eZw2 = exk_22.C();
            if (eZw2.l() != mq_12.D()) {
                return faF.f;
            }
        }
        if (mq_12.E()) {
            if (!bl) {
                return faF.g;
            }
            eZw eZw3 = exk_22.C();
            if (eZw3.n() != mq_12.F()) {
                return faF.g;
            }
        }
        return faF.a;
    }
}

