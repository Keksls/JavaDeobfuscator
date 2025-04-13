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
 * Renamed from esS
 */
public final class ess_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public ess_0(ArrayList<aot_2> arrayList) {
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        elm_0<?> elm_02 = erQ.a(object, object4);
        if (elm_02 == null) {
            return 0L;
        }
        eof_2 eof_22 = elm_02.O();
        if (!eof_22.p()) {
            return 0L;
        }
        return eof_22.q();
    }

    @Override
    public Enum c() {
        return eyO.fY;
    }

    static {
        a.add(esa_0.i);
    }
}

