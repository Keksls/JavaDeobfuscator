/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class cLi
extends cLm<fkv_0> {
    private static final Logger b = Logger.getLogger(cLi.class);
    private final cLj[] c;

    public cLi(fkv_0 fkv_02, cLj ... cLjArray) {
        super(fkv_02);
        this.c = cLjArray;
    }

    @Override
    public cLn a() {
        return cLn.a;
    }

    @Override
    public void a(fkj_0 fkj_02) {
        for (cLj cLj2 : this.c) {
            cLj2.a(fkj_02);
        }
    }

    @Override
    public void a(cks_2 cks_22) {
        for (cLj cLj2 : this.c) {
            if (cLi.a(((fkw)cLj2.e()).h()) && cLi.a(cLj2.b())) continue;
            cLj2.a(cks_22);
        }
        afe_1 afe_12 = this.f();
        cLi.a(cks_22, afe_12.a(), afe_12.b());
        cks_22.b();
    }

    private static boolean a(int n) {
        return fkk_0.a(n).a() == 1;
    }

    private static void a(cks_2 cks_22, int n, int n2) {
        fkj_0 fkj_02 = cks_22.getWorkingHavenWorld();
        short[][] sArray = fkj_02.d();
        for (int k = n2 - 1; k <= n2 + 2; ++k) {
            for (int i2 = n - 1; i2 <= n + 2; ++i2) {
                short s2 = fkj_02.a(sArray, i2, k);
                if (s2 == 0) continue;
                new cLj(new fkw(null, i2, k), s2).a(cks_22);
            }
        }
    }

    @Override
    public void c(cks_2 cks_22) {
        for (cLj cLj2 : this.c) {
            cLj2.e(cks_22);
        }
        cks_22.b();
        this.a(cks_22);
    }

    @Override
    public void b(cks_2 cks_22) {
    }
}

