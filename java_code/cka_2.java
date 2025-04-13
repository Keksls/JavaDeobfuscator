/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from cKA
 */
public class cka_2
implements Comparator<csb_1> {
    private static cka_2 a = new cka_2();

    public int a(csb_1 csb_12, csb_1 csb_13) {
        csa_1 csa_12 = csb_12.m();
        csa_1 csa_13 = csb_13.m();
        return csa_12.c(eps_0.B) - csa_13.c(eps_0.B);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((csb_1)object, (csb_1)object2);
    }
}

