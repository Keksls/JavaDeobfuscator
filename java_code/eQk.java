/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class eQk {
    private final eqq_0 a;

    public eQk(erg_1 erg_12) {
        this.a = (eqq_0)erg_12;
    }

    public void a(erl_1 erl_12) {
        if (this.a.a(erl_12.a()) == null) {
            this.a.a(erl_12);
        }
    }

    public void b(long l) {
        erl_1 erl_12 = this.a.a(l);
        if (erl_12 == null) {
            throw new erq_1("Membre non-pr\u00e9sent dans la guilde");
        }
        this.a.g(l);
    }

    public void a(erh_1 erh_12) {
        if (this.a.a(erh_12.a()) != null) {
            throw new erq_1("Bonus d\u00e9j\u00e0 pr\u00e9sent dans la guilde");
        }
        this.a.a(erh_12);
    }

    public void a(int n) {
        erh_1 erh_12 = this.a.a(n);
        if (erh_12 == null) {
            throw new erq_1("Bonus non-pr\u00e9sent dans la guilde");
        }
        this.a.g(n);
    }

    public void a(ern_1 ern_12) {
        if (this.a.c(ern_12.a()) != null) {
            throw new erq_1("Rank d\u00e9j\u00e0 pr\u00e9sent dans la guilde");
        }
        if (ern_12.b().length() > 16) {
            throw new erq_1("Le nom de rang demand\u00e9 est trop long");
        }
        this.a.a(ern_12);
    }

    public void a(long l, short s2) {
        ern_1 ern_12 = this.a.c(l);
        if (ern_12 == null) {
            throw new erq_1("Rang non-pr\u00e9sent dans la guilde");
        }
        this.a.a(l, s2);
    }

    public void c(long l) {
        ern_1 ern_12 = this.a.c(l);
        if (ern_12 == null) {
            throw new erq_1("Rang non-pr\u00e9sent dans la guilde");
        }
        if (l == this.a.b()) {
            throw new erq_1("Impossible de supprimer le plus haut rang de la guilde");
        }
        if (l == this.a.d()) {
            throw new erq_1("Impossible de supprimer rang le plus bas de la guilde");
        }
        if (!this.a.a(new eql_0(l))) {
            throw new erq_1("Des membres de la guildes ont encore ce rang assign\u00e9");
        }
        this.a.f(l);
    }

    public void b(int n) {
        if (n < 0) {
            throw new erq_1("Impossible de retirer des points n\u00e9gatifs");
        }
        this.a.c((int)Math.max((long)(this.a.j() - n), 0L));
    }

    public void c(int n) {
        if (n < 0) {
            throw new erq_1("Impossible de retirer des points n\u00e9gatifs");
        }
        this.a.c((int)Math.max((long)(this.a.j() - n), 0L));
        this.a.b((int)Math.max((long)(this.a.k() - n), 0L));
    }

    public int d(int n) {
        if (n < 0) {
            throw new erq_1("Impossible d'ajouter des points n\u00e9gatifs");
        }
        if (this.a.r() <= 0) {
            this.e(n);
            return n;
        }
        this.b();
        int n2 = this.a.r() - this.a.s();
        if (n2 <= 0) {
            return 0;
        }
        int n3 = Math.min(n, n2);
        this.e(n3);
        return n3;
    }

    private void b() {
        int n;
        int n2 = this.a.t();
        if (n2 != (n = wc_0.p().get(3))) {
            this.a.f(n);
            this.a.e(0);
        }
    }

    void e(int n) {
        this.a.c((int)Math.min((long)(n + this.a.j()), Long.MAX_VALUE));
        this.a.b((int)Math.min((long)(n + this.a.k()), Long.MAX_VALUE));
        this.a.e(this.a.s() + n);
    }

    public void f(int n) {
        this.a.d(n);
    }

    public void a(short s2) {
        if (s2 < 0) {
            throw new erq_1("Impossible d'appliquer un niveau n\u00e9gatif");
        }
        if (this.a().i() >= s2) {
            throw new erq_1("Mauvais level \u00e0 d\u00e9bloquer");
        }
        if (s2 > 10) {
            throw new erq_1("Impossible d'appliquer un niveau > 10");
        }
        this.a.a(s2);
    }

    public void a(String string) {
        this.a.b(xu_0.a().a(string, true));
    }

    public void b(String string) {
        this.a.a(string);
    }

    public void a(long l) {
        this.a.e(l);
    }

    public void c(String string) {
        this.a.c(xu_0.a().a(string, true));
    }

    public void a(long l, String string) {
        eQv eQv2 = (eQv)this.a.c(l);
        if (eQv2 == null) {
            throw new erq_1("Rang non-pr\u00e9sent dans la guilde");
        }
        if (string.length() > 16) {
            throw new erq_1("Le nom de rang demand\u00e9 est trop long");
        }
        eQv2.a(string);
    }

    public void b(long l, long l2) {
        eQv eQv2 = (eQv)this.a.c(l);
        if (eQv2 == null) {
            throw new erq_1("Rang non-pr\u00e9sent dans la guilde");
        }
        if (l == this.a.b() && l2 != eQt.B) {
            throw new erq_1("Impossible de modifier le plus haut rang de la guilde");
        }
        if (l == this.a.d() && l2 != eQt.C) {
            throw new erq_1("Impossible de modifier rang le plus bas de la guilde");
        }
        eQv2.b(l2);
    }

    public void a(long l, byte by) {
        eQp eQp2 = (eQp)this.a.a(l);
        if (eQp2 == null) {
            throw new erq_1("Membre non-pr\u00e9sent dans la guilde");
        }
        eQp2.a(by);
    }

    public void a(long l, int n) {
        eQp eQp2 = (eQp)this.a.a(l);
        if (eQp2 == null) {
            throw new erq_1("Membre non-pr\u00e9sent dans la guilde");
        }
        eQp2.a(n);
    }

    public void c(long l, long l2) {
        eQp eQp2 = (eQp)this.a.a(l);
        if (eQp2 == null) {
            throw new erq_1("Membre non-pr\u00e9sent dans la guilde");
        }
        eQp2.b(l2);
    }

    public void b(long l, int n) {
        if (this.a.m() <= 0) {
            return;
        }
        eQp eQp2 = (eQp)this.a.a(l);
        if (eQp2 == null) {
            throw new erq_1("Membre non-pr\u00e9sent dans la guilde");
        }
        eQp2.b(n);
    }

    public void b(long l, String string) {
        eQp eQp2 = (eQp)this.a.a(l);
        if (eQp2 == null) {
            throw new erq_1("Membre non-pr\u00e9sent dans la guilde");
        }
        eQp2.a(string);
    }

    public void b(long l, short s2) {
        eQp eQp2 = (eQp)this.a.a(l);
        if (eQp2 == null) {
            throw new erq_1("Membre non-pr\u00e9sent dans la guilde");
        }
        eQp2.a(s2);
    }

    public void b(long l, byte by) {
        eQp eQp2 = (eQp)this.a.a(l);
        if (eQp2 == null) {
            throw new erq_1("Membre non-pr\u00e9sent dans la guilde");
        }
        eQp2.b(by);
    }

    public void a(long l, long l2) {
        eQp eQp2 = (eQp)this.a.a(l);
        if (eQp2 == null) {
            throw new erq_1("Membre non-pr\u00e9sent dans la guilde");
        }
        ern_1 ern_12 = this.a.c(l2);
        if (ern_12 == null) {
            throw new erq_1("Le rank demand\u00e9 n'existe pas");
        }
        eQp2.a(l2);
    }

    public void a(long l, boolean bl) {
        eQp eQp2 = (eQp)this.a.a(l);
        if (eQp2 == null) {
            throw new erq_1("Membre non-pr\u00e9sent dans la guilde");
        }
        eQp2.d(wc_0.p().a().h());
        eQp2.a(bl);
    }

    public void a(int n, wu_0 wu_02) {
        eQj eQj2 = (eQj)this.a.a(n);
        if (eQj2 == null) {
            throw new erq_1("Bonus non-pr\u00e9sent dans la guilde");
        }
        eQj2.b(wu_02);
        if (eQj2.d()) {
            eQj2.e();
        }
    }

    public void a(long l, List<Ow> list, xz_0 xz_02) {
        eQp eQp2 = (eQp)this.a.a(l);
        if (eQp2 == null) {
            throw new erq_1("Unknown guild member " + l + " in guild " + this.a.a());
        }
        eQp2.a(list);
        eQp2.a(xz_02);
    }

    public void g(int n) {
        this.a.h(n);
    }

    public erg_1 a() {
        return this.a;
    }

    public String toString() {
        return "GuildController{m_guild=" + this.a + "}";
    }
}

