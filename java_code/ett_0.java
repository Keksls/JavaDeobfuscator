/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from ett
 */
public final class ett_0
extends esi_0 {
    private static final List<aov_1[]> a = new ArrayList<aov_1[]>();

    public ett_0(ArrayList<aot_2> arrayList) {
    }

    @Override
    protected List<aov_1[]> i() {
        return Collections.unmodifiableList(a);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        els_0 els_02 = erQ.b(object4);
        if (els_02 == null && object3 != null && object3 instanceof eyc_0) {
            els_02 = ((eyc_0)object3).b().ck();
        }
        if (els_02 == null && object != null && object instanceof epq_2) {
            els_02 = ((epq_2)object).ck();
        }
        if (els_02 == null) {
            return 0L;
        }
        return els_02.af_().a();
    }

    @Override
    public Enum c() {
        return eyO.dt;
    }

    static {
        a.add(aov_1.j);
    }
}

