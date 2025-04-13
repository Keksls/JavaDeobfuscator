/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class ets
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();

    public ets(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
    }

    protected ArrayList<aov_1[]> f() {
        return a;
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        elm_0<?> elm_02 = erQ.a(object, object4);
        if (elm_02 == null) {
            d.error((Object)"Le critere ne peut pas etre utilis\u00e9 autre part que dans un contexte de combat");
            return -1L;
        }
        eof_2 eof_22 = elm_02.O();
        if (eof_22 == null) {
            return -1L;
        }
        return eof_22.u();
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public Enum c() {
        return eyO.eo;
    }

    protected /* synthetic */ List i() {
        return this.f();
    }

    static {
        a.add(aov_1.j);
    }
}

