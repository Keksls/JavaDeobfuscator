/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bxN
 */
class bxn_1
implements Comparator<azj_2> {
    private static bxn_1 a = new bxn_1();

    private bxn_1() {
    }

    public int a(azj_2 azj_22, azj_2 azj_23) {
        int n;
        int n2;
        int n3;
        int n4;
        if (azj_22.q() >= azj_22.s() && azj_22.q() >= azj_22.r()) {
            n4 = 0;
            n3 = azj_22.d() - azj_22.e();
        } else if (azj_22.r() >= azj_22.s()) {
            n4 = 1;
            n3 = azj_22.e() - azj_22.c();
        } else {
            n4 = 2;
            n3 = azj_22.c() - azj_22.e();
        }
        if (azj_23.q() >= azj_23.s() && azj_23.q() >= azj_23.r()) {
            n2 = 0;
            n = azj_23.d() - azj_23.e();
        } else if (azj_23.r() >= azj_23.s()) {
            n2 = 1;
            n = azj_23.e() - azj_23.c();
        } else {
            n2 = 2;
            n = azj_23.c() - azj_23.e();
        }
        if (n4 != n2) {
            return n4 - n2;
        }
        return n3 - n;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((azj_2)object, (azj_2)object2);
    }
}

