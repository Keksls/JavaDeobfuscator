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
 * Renamed from esC
 */
@Deprecated
public final class esc_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    protected ArrayList<aov_1[]> f() {
        return a;
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        return 60000L;
    }

    @Override
    public Enum c() {
        return eyO.fD;
    }

    @Override
    public boolean a() {
        return true;
    }

    protected /* synthetic */ List i() {
        return this.f();
    }

    static {
        a.add(esa_0.i);
    }
}

