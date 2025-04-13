/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from euR
 */
public final class eur_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public eur_0(ArrayList<aot_2> arrayList) {
    }

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        ejh_0 ejh_02 = erQ.d(object3);
        if (ejh_02 == null) {
            return -1L;
        }
        if (!(ejh_02 instanceof eGm)) {
            return -1L;
        }
        eGm eGm2 = (eGm)ejh_02;
        return eGm2.aJ();
    }

    @Override
    public Enum c() {
        return eyO.gb;
    }

    static {
        a.add(esa_0.i);
    }
}

