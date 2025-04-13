/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class etn
extends esi_0 {
    private static final ArrayList<aov_1[]> a = new ArrayList();
    private final boolean b;
    private final TIntArrayList c;

    public etn(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.b = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
        this.c = new TIntArrayList();
        int n = arrayList.size();
        for (int k = 1; k < n; ++k) {
            this.c.add((int)((aoq_1)arrayList.get(k)).a(null, null, null, null));
        }
    }

    protected ArrayList<aov_1[]> f() {
        return a;
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        eqq_1 eqq_12 = erQ.b(this.b, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1L;
        }
        se_0 se_02 = eqq_12.x_();
        if (se_02 == null) {
            return -1L;
        }
        long l = 0L;
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            int n2 = this.c.get(k);
            if (!se_02.e(n2)) continue;
            ++l;
        }
        return l;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public Enum c() {
        return eyO.eK;
    }

    protected /* synthetic */ List i() {
        return this.f();
    }

    static {
        a.add(new aov_1[]{aov_1.a, aov_1.d});
    }
}

