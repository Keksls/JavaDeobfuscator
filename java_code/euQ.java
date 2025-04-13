/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class euQ
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public euQ(ArrayList<aot_2> arrayList) {
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
        return eGm2.aI();
    }

    @Override
    public Enum c() {
        return eyO.ga;
    }

    static {
        a.add(esa_0.i);
    }
}

