/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from cKC
 */
public class ckc_2
implements Comparator<ftj_0> {
    private static ckc_2 a = new ckc_2();

    public int a(ftj_0 ftj_02, ftj_0 ftj_03) {
        csa_1 csa_12 = (csa_1)ftj_02.getItemValue();
        csa_1 csa_13 = (csa_1)ftj_03.getItemValue();
        return csa_12.c(eps_0.B) - csa_13.c(eps_0.B);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ftj_0)object, (ftj_0)object2);
    }
}

