/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from ace
 */
public abstract class ace_0
extends acb_0 {
    final ArrayList<acG> n = new ArrayList(3);
    final ArrayList<acG> I = new ArrayList(3);
    private final aug_2 J = new acf_0(this);
    boolean K = true;

    protected ace_0() {
    }

    public void g(boolean bl) {
        this.K = bl;
    }

    public void a(acG acG2) {
        if (!acG2.u()) {
            return;
        }
        acG2.a((int)this.D, (int)this.E);
        if (acG2.v()) {
            if (!this.n.contains(acG2)) {
                this.n.add(acG2);
            }
        } else if (!this.I.contains(acG2)) {
            this.I.add(acG2);
        }
    }

    public void b(acG acG2) {
        if (acG2.v()) {
            this.n.remove(acG2);
        } else {
            this.I.remove(acG2);
        }
    }

    @Override
    public void g() {
        int n;
        super.g();
        for (n = this.n.size() - 1; n >= 0; --n) {
            this.n.get(n).g();
        }
        for (n = this.I.size() - 1; n >= 0; --n) {
            this.I.get(n).g();
        }
    }

    @Override
    public void a(int n, int n2) {
        int n3;
        super.a(n, n2);
        for (n3 = this.n.size() - 1; n3 >= 0; --n3) {
            this.n.get(n3).a(n, n2);
        }
        for (n3 = this.I.size() - 1; n3 >= 0; --n3) {
            this.I.get(n3).a(n, n2);
        }
    }

    @Override
    protected void a(avx_2 avx_22) {
    }

    @Override
    protected void b(avx_2 avx_22) {
        aui_1.a().a(this.J, avx_22);
    }

    @Override
    public void a(int n) {
        int n2;
        super.a(n);
        if (!this.K) {
            return;
        }
        for (n2 = this.n.size() - 1; n2 >= 0; --n2) {
            this.n.get(n2).a(n);
        }
        for (n2 = this.I.size() - 1; n2 >= 0; --n2) {
            this.I.get(n2).a(n);
        }
    }

    @Override
    public void b(boolean bl) {
        super.b(bl);
        this.t();
    }

    public final void t() {
        int n;
        for (n = this.n.size() - 1; n >= 0; --n) {
            this.n.get(n).t();
        }
        for (n = this.I.size() - 1; n >= 0; --n) {
            this.I.get(n).t();
        }
        this.n.clear();
        this.I.clear();
    }

    @Override
    protected void a(acb_0 acb_02) {
        acG acG2;
        int n;
        super.a(acb_02);
        ace_0 ace_02 = (ace_0)acb_02;
        for (n = 0; n < ace_02.n.size(); ++n) {
            acG2 = ace_02.n.get(n);
            this.n.add((acG)acG2.p());
            acG2.o();
        }
        for (n = 0; n < ace_02.I.size(); ++n) {
            acG2 = ace_02.I.get(n);
            this.I.add((acG)acG2.p());
            acG2.o();
        }
    }
}

