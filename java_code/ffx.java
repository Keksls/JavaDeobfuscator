/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class ffx {
    public static final ffx a = new ffx();
    private final ArrayList<ffw> b = new ArrayList();

    private ffx() {
    }

    public boolean a(ffw ffw2) {
        return this.b.add(ffw2);
    }

    public ffu_0 a(fge fge2) {
        ffa_0 ffa_02 = new ffa_0();
        ffa_02.a(fge2);
        this.a(ffa_02);
        return ffa_02;
    }

    public ffu_0 a(xn_1 xn_12) {
        ffa_0 ffa_02 = new ffa_0();
        ffa_02.b(xn_12);
        this.a(ffa_02);
        return ffa_02;
    }

    public ffu_0 a(lg_0 lg_02) {
        ffa_0 ffa_02 = new ffa_0();
        ffa_02.a(fgh.a.a(lg_02.c()));
        ffa_02.a(lg_02.e());
        ffa_02.b(lg_02.h());
        ffa_02.c(lg_02.j());
        ffa_02.a(lg_02.l());
        ffa_02.d(lg_02.n());
        ffa_02.a(wt_0.b(lg_02.p()));
        ffa_02.b(wt_0.b(lg_02.r()));
        ffa_02.e(lg_02.t());
        ffa_02.c(wt_0.b(lg_02.v()));
        this.a(ffa_02);
        return ffa_02;
    }

    public ffu_0 a(ffu_0 ffu_02) {
        ffa_0 ffa_02 = new ffa_0();
        ffa_02.a(ffu_02.a());
        ffa_02.a(ffu_02.b());
        ffa_02.b(ffu_02.c());
        ffa_02.c(ffu_02.e());
        ffa_02.a(ffu_02.f());
        ffa_02.d(ffu_02.h());
        ffa_02.a(ffu_02.k());
        ffa_02.b(ffu_02.l());
        ffa_02.e(ffu_02.m());
        ffa_02.c(ffu_02.n());
        this.a(ffa_02);
        return ffa_02;
    }

    private void a(ffa_0 ffa_02) {
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            this.b.get(k).a(ffa_02);
        }
    }

    public String toString() {
        return "PetFactory{m_listeners=" + this.b.size() + "}";
    }
}

