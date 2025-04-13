/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import java.util.ArrayList;
import java.util.Optional;

@Criterion(description="Return the current player dungeon min level (-1 if no dungeon)")
public class esc
extends esi_0 {
    @Override
    public boolean a() {
        return true;
    }

    public esc(ArrayList<aot_2> arrayList) {
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.c(object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1L;
        }
        if (!(eqq_12 instanceof epq_2)) {
            return -1L;
        }
        epq_2 epq_22 = (epq_2)eqq_12;
        long l = epq_22.T_();
        Optional<ezb_2> optional = ezd_2.a.a(l);
        return optional.isPresent() ? (long)optional.get().c() : -1L;
    }

    @Override
    public Enum c() {
        return eyO.cN;
    }
}

