/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class brO
implements Comparator<brm_1> {
    final /* synthetic */ brn_1 a;

    brO(brn_1 brn_12) {
        this.a = brn_12;
    }

    public int a(brm_1 brm_12, brm_1 brm_13) {
        String string = brm_12.a();
        String string2 = brm_13.a();
        return Cz.d(string, string2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((brm_1)object, (brm_1)object2);
    }
}

