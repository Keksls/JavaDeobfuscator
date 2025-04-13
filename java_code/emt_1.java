/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from eMT
 */
public final class emt_1
implements emw_1 {
    @Override
    public boolean a(els_0<? extends epq_2> els_02) {
        Collection<? extends epq_2> collection = els_02.ar();
        for (epq_2 epq_22 : collection) {
            if (epq_22.gY() != 0) continue;
            return true;
        }
        return false;
    }
}

