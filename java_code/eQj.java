/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

final class eQj
implements erh_1 {
    private final ArrayList<erj_1> a = new ArrayList();
    private final int b;
    private final wt_0 c = new wt_0(wt_0.c);
    private final wt_0 d = new wt_0(wt_0.c);

    eQj(int n) {
        this.b = n;
    }

    @Override
    public int a() {
        return this.b;
    }

    @Override
    public wu_0 b() {
        return this.c;
    }

    @Override
    public wu_0 c() {
        return this.d;
    }

    void a(wu_0 wu_02) {
        this.c.a(wu_02);
    }

    void b(wu_0 wu_02) {
        this.d.a(wu_02);
    }

    @Override
    public boolean d() {
        return !wt_0.b().equals(this.d) && wc_0.p().e(this.d);
    }

    @Override
    public void e() {
        this.f();
    }

    private void f() {
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            this.a.get(k).b(this);
        }
    }

    @Override
    public boolean a(erj_1 erj_12) {
        return !this.a.contains(erj_12) && this.a.add(erj_12);
    }

    @Override
    public boolean b(erj_1 erj_12) {
        return this.a.remove(erj_12);
    }

    public String toString() {
        return "GuildBonusModel{m_buyDate=" + this.c + "m_activationDate=" + this.d + ", m_bonusId=" + this.b + ", m_buyDate=" + this.c + "}";
    }
}

