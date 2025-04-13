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
 * Renamed from euD
 */
public final class eud_0
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private String b = "caster";
    private final aoq_1 c;

    public eud_0(ArrayList<aot_2> arrayList) {
        byte by = this.a(arrayList);
        this.c = (aoq_1)arrayList.get(0);
        if (by == 1) {
            this.b = ((apd_2)arrayList.get(1)).b();
        }
    }

    protected ArrayList<aov_1[]> f() {
        return a;
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        eqq_1 eqq_12 = erQ.a(this.b, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1L;
        }
        long l = this.c.a(object, object2, object3, object4);
        return eqq_12.e_(l);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public Enum c() {
        return eyO.eX;
    }

    protected /* synthetic */ List i() {
        return this.f();
    }

    static {
        a.add(esa_0.l);
        a.add(new aov_1[]{aov_1.b, aov_1.a});
    }
}

