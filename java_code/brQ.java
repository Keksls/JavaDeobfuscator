/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

final class brQ
implements Comparator<brr_0> {
    static final brQ a = new brQ();

    private brQ() {
    }

    public int a(brr_0 brr_02, brr_0 brr_03) {
        if (brr_02.e() != brr_03.e()) {
            return brr_02.e() - brr_03.e();
        }
        if (!brr_02.i().equals(brr_03.i())) {
            String string = brr_02.i();
            String string2 = brr_03.i();
            return Cz.d(string, string2);
        }
        String string = brr_02.a();
        String string3 = brr_03.a();
        return Cz.d(string, string3);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((brr_0)object, (brr_0)object2);
    }
}

