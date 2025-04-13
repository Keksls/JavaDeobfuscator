/*
 * Decompiled with CFR 0.152.
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from exs
 */
@Criterion(description="Check if the targetted player is a new player (@see Mentorat)")
public final class exs_0
extends esf {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public exs_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public int a(Object object, Object object2, Object object3, Object object4) {
        eqq_1 eqq_12 = erQ.c(object, object2, object4, object3);
        if (!(eqq_12 instanceof faU)) {
            return -1;
        }
        return eag_0.a(((faU)((Object)eqq_12)).U_()) ? 0 : -1;
    }

    @Override
    public Enum c() {
        return eyO.fH;
    }

    static {
        a.add(esa_0.i);
    }
}

