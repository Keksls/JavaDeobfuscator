/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

final class eKv
implements Comparator<Su> {
    private final int a;
    private final int b;

    eKv(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public int a(Su su, Su su2) {
        int n = su.P_().c(this.a, this.b);
        int n2 = su2.P_().c(this.a, this.b);
        return Integer.compare(n2, n);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Su)object, (Su)object2);
    }
}

