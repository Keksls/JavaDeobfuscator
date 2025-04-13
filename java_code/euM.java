/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class euM
extends esi_0 {
    private boolean a;
    private static final ArrayList<aov_1[]> b = new ArrayList();

    public euM(ArrayList<aot_2> arrayList) {
        this.a(arrayList);
        this.a = ((apd_2)arrayList.get(0)).b().equalsIgnoreCase("target");
    }

    @Override
    protected List<aov_1[]> i() {
        return b;
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public long a(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        throw new UnsupportedOperationException("Can't get Long value of a double");
    }

    @Override
    public double b(@Nullable Object object, @Nullable Object object2, @Nullable Object object3, @Nullable Object object4) {
        double d2 = 0.0;
        eqq_1 eqq_12 = erQ.b(this.a, object, object2, object4, object3);
        if (eqq_12 == null) {
            return -1.0;
        }
        eps_0 eps_02 = eps_0.b;
        eps_0 eps_03 = eps_0.T;
        int n = 0;
        int n2 = 0;
        if (eqq_12.a(eps_02)) {
            n = eqq_12.c(eps_02);
            n2 = eqq_12.d(eps_02);
        }
        if (eqq_12.a(eps_03)) {
            n += eqq_12.c(eps_03);
            n2 += eqq_12.d(eps_03);
        }
        if (n2 == 0) {
            return 0.0;
        }
        d2 = (float)n / (float)n2 * 100.0f;
        return (double)super.e() * d2;
    }

    @Override
    public Enum c() {
        return eyO.eQ;
    }

    static {
        b.add(esa_0.j);
    }
}

