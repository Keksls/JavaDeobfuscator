/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class euO
extends esi_0 {
    private static final List<aov_1[]> a = Collections.singletonList(aov_1.j);

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public euO(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        if (object == null) {
            return 0L;
        }
        if (!(object instanceof Su)) {
            throw new aob_1("Le crit\u00e8re d'effet est employ\u00e9 pour autre chose qu'un effet");
        }
        return ((Su)object).a_();
    }

    @Override
    public Enum c() {
        return eyO.S;
    }
}

