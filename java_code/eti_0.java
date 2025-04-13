/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from etI
 */
public final class eti_0
extends esi_0 {
    private static final ArrayList<aov_1[]> b = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    public eti_0(ArrayList<aot_2> arrayList) {
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        eqq_1 eqq_12 = erQ.c(object, object2, object3, object4);
        elm_0<?> elm_02 = erQ.a(object, object4);
        if (elm_02 == null) {
            throw new aob_1("Impossible de r\u00e9cup\u00e9rer le combat");
        }
        if (!(eqq_12 instanceof erp_1)) {
            throw new aob_1("Impossible de r\u00e9cup\u00e9rer la cible du crit\u00e8re");
        }
        erp_1 erp_12 = (erp_1)((Object)eqq_12);
        long l = erp_12.fm().d();
        if (l == 0L) {
            return 0L;
        }
        Collection collection = elm_02.g(eqq_12.Y());
        int n = -1;
        for (epq_2 epq_22 : collection) {
            erp_1 erp_13;
            if (!(epq_22 instanceof erp_1) || (erp_13 = (erp_1)((Object)epq_22)).fm().d() != l) continue;
            ++n;
        }
        assert (n >= 0);
        return n;
    }

    @Override
    public Enum c() {
        return eyO.fi;
    }

    static {
        b.add(aov_1.j);
    }
}

