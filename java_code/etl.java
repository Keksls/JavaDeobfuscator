/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class etl
extends esi_0 {
    private static final List<aov_1[]> a = Collections.singletonList(aov_1.j);

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public etl(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.b(true, object, object2, object4, object3);
        if (eqq_12 == null) {
            return 0L;
        }
        if (!(eqq_12 instanceof apq_2)) {
            d.error((Object)("Le crit\u00e8re d'effet est employ\u00e9 pour autre chose qu'un targetFinder.Target : " + object + " - " + object2 + " - " + object3 + " - " + object4));
            return 0L;
        }
        return eqq_12.a_();
    }

    @Override
    public Enum c() {
        return eyO.S;
    }
}

