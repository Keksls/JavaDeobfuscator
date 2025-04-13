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
 * Renamed from eve
 */
public final class eve_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private boolean b;

    public eve_0(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        if (by == 1) {
            this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
        }
    }

    protected ArrayList<aov_1[]> f() {
        return a;
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        if (this.b && object2 instanceof aff_1) {
            return ((aff_1)object2).d();
        }
        eqq_1 eqq_12 = erQ.b(this.b, object, object2, object4, object3);
        if (eqq_12 == null) {
            return Long.MIN_VALUE;
        }
        return eqq_12.G();
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public Enum c() {
        return eyO.eG;
    }

    protected /* synthetic */ List i() {
        return this.f();
    }

    static {
        a.add(esa_0.i);
        a.add(esa_0.j);
    }
}

