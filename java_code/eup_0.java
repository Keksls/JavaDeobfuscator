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
 * Renamed from euP
 */
public final class eup_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public eup_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    protected ArrayList<aov_1[]> f() {
        return a;
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        int n = 0;
        ejh_0 ejh_02 = erQ.d(object3);
        while (ejh_02 != null) {
            ++n;
            ejh_0 ejh_03 = erQ.d(ejh_02);
            if (ejh_03 != ejh_02) {
                ejh_02 = ejh_03;
                continue;
            }
            ejh_02 = null;
        }
        return n;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public Enum c() {
        return eyO.et;
    }

    protected /* synthetic */ List i() {
        return this.f();
    }

    static {
        a.add(aov_1.j);
    }
}

