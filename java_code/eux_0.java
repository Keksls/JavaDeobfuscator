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
 * Renamed from euX
 */
public final class eux_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private long b;

    public eux_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = 1L;
        if (arrayList.size() >= 1) {
            this.b = ((aoq_1)arrayList.get(0)).a(null, null, null, null);
        }
    }

    protected ArrayList<aov_1[]> f() {
        return a;
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        ejh_0 ejh_02 = null;
        int n = 0;
        while ((long)n < this.b) {
            ejh_02 = erQ.d(object3);
            if (ejh_02 == null) {
                return -1L;
            }
            ++n;
        }
        if (ejh_02 == null) {
            return -1L;
        }
        return ejh_02.o();
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public Enum c() {
        return eyO.es;
    }

    protected /* synthetic */ List i() {
        return this.f();
    }

    static {
        a.add(esa_0.i);
        a.add(esa_0.l);
    }
}

