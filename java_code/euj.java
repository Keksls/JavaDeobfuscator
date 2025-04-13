/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class euj
extends esi_0 {
    private static final List<aov_1[]> a = new ArrayList<aov_1[]>();

    @Override
    protected List<aov_1[]> i() {
        return Collections.unmodifiableList(a);
    }

    @Override
    public boolean a() {
        return true;
    }

    public euj(List<aot_2> list) {
        this.a(list);
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        if (object instanceof fgx_0) {
            eyu_1 eyu_12 = ((fgx_0)object).a();
            return eyu_12.a();
        }
        return -1L;
    }

    @Override
    public Enum c() {
        return eyO.eR;
    }

    static {
        a.add(aov_1.j);
    }
}

