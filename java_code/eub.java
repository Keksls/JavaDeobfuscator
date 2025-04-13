/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class eub
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public eub(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        elm_0<?> elm_02 = erQ.a(object, object4);
        if (elm_02 == null) {
            return 0L;
        }
        eof_2 eof_22 = elm_02.O();
        if (eof_22 == null) {
            return 0L;
        }
        long l = eof_22.G();
        return l;
    }

    protected ArrayList<aov_1[]> f() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public Enum c() {
        return eyO.fk;
    }

    protected /* synthetic */ List i() {
        return this.f();
    }

    static {
        a.add(esa_0.i);
    }
}

