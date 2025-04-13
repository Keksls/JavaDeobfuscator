/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class esv
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    public esv(ArrayList<aot_2> arrayList) {
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        elm_0<?> elm_02 = erQ.a(object, object4);
        if (elm_02 == null) {
            return -1L;
        }
        if (elm_02.T() == null) {
            return -1L;
        }
        return elm_02.T().c();
    }

    @Override
    public Enum c() {
        return eyO.fQ;
    }

    static {
        a.add(esa_0.i);
    }
}

