/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class euZ
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public euZ(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    protected ArrayList<aov_1[]> f() {
        return a;
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        Su su = erQ.e(object3);
        if (su == null) {
            return -1L;
        }
        if (!(su instanceof epq_2)) {
            return -1L;
        }
        return ((epq_2)su).gO();
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public Enum c() {
        return eyO.er;
    }

    protected /* synthetic */ List i() {
        return this.f();
    }

    static {
        a.add(aov_1.j);
    }
}

