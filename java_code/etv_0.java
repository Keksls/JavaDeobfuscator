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
 * Renamed from etv
 */
public final class etv_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private String b;

    public etv_0(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = ((apd_2)arrayList.get(0)).b();
    }

    public etv_0(String string) {
        this.b = string;
    }

    protected ArrayList<aov_1[]> f() {
        return a;
    }

    @Override
    public Enum c() {
        return eyO.fy;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        eqq_1 eqq_12 = erQ.a(this.b, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1L;
        }
        return eqq_12.a_();
    }

    protected /* synthetic */ List i() {
        return this.f();
    }

    static {
        a.add(esa_0.j);
    }
}

