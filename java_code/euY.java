/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class euY
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public euY(List<aot_2> list) {
        this.a(list);
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
        return su.a_();
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public Enum c() {
        return eyO.ev;
    }

    protected /* synthetic */ List i() {
        return this.f();
    }

    static {
        a.add(aov_1.j);
    }
}

