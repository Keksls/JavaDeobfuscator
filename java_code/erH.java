/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Criterion(description="Return 0 if the current player dungeon difficulty can be changed, or -1")
public class erH
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public erH(ArrayList<aot_2> arrayList) {
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.c(object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1;
        }
        if (!(eqq_12 instanceof epq_2)) {
            return -1;
        }
        epq_2 epq_22 = (epq_2)eqq_12;
        Optional<fkU> optional = epq_22.dP();
        return optional.filter(fkU::e).map(fkU2 -> 0).orElse(-1);
    }

    @Override
    public Enum c() {
        return eyO.gH;
    }

    static {
        a.add(esa_0.i);
    }
}

