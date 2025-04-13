/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

final class eKy
implements Comparator<Su> {
    eKy() {
    }

    public int a(Su su, Su su2) {
        if (!su.a(eps_0.b)) {
            return 1;
        }
        if (!su2.a(eps_0.b)) {
            return -1;
        }
        rs_0 rs_02 = su.b(eps_0.b);
        Float f2 = Float.valueOf((float)rs_02.a() / (float)rs_02.c() * 100.0f);
        rs_0 rs_03 = su2.b(eps_0.b);
        Float f3 = Float.valueOf((float)rs_03.a() / (float)rs_03.c() * 100.0f);
        return -f2.compareTo(f3);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Su)object, (Su)object2);
    }
}

