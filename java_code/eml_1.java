/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eML
 */
public abstract class eml_1<F extends epq_2>
extends els_0<F> {
    protected eml_1(int n, emr_2 emr_22, tg_0 tg_02) {
        super(n, emr_22, tg_02);
    }

    public eof_2 O() {
        return this.x;
    }

    public void c(boolean bl) {
        if (this.O() != null) {
            this.O().a(bl);
        }
    }

    public void p(long l) {
        if (this.O() != null) {
            this.O().e(l);
        }
    }

    @Override
    public void h(long l) {
        if (this.O() != null) {
            this.O().f(l);
        }
    }

    public void d(int n) {
        if (this.O() != null) {
            this.O().c(n);
        }
    }

    public long q(long l) {
        if (this.O() != null) {
            return this.O().D(l);
        }
        return -1L;
    }

    public void aF() {
        if (this.O() != null && this.O().ai_()) {
            this.O().v();
        }
    }

    public boolean R(F f2) {
        if (!this.aG()) {
            return false;
        }
        boolean bl = this.O().o(((epq_2)f2).a_());
        if (!bl) {
            p.error((Object)this.a("Impossible de d\u00e9buter le tour de " + ((epq_2)f2).a_()));
        }
        return bl;
    }

    public boolean S(F f2) {
        if (!this.aG()) {
            return false;
        }
        boolean bl = this.O().n(((epq_2)f2).a_());
        if (!bl) {
            p.error((Object)this.a("Impossible de pr\u00e9parer le tour de " + ((epq_2)f2).a_()));
        }
        return bl;
    }

    protected boolean aG() {
        if (this.O() == null || !this.O().ai_()) {
            p.error((Object)this.a("timeline null ou arret\u00e9e"));
            return false;
        }
        return true;
    }

    public boolean T(F f2) {
        return f2 != null && this.r(((epq_2)f2).a_());
    }

    @Override
    public boolean r(long l) {
        if (!this.aG()) {
            return false;
        }
        boolean bl = this.O().p(l);
        if (!bl) {
            p.error((Object)this.a("Impossible de terminer le tour de " + l));
        }
        return bl;
    }

    protected final void s(long l) {
        Object f2 = this.n(l);
        if (f2 != null) {
            this.d(f2);
        }
    }

    protected final void t(long l) {
        Object f2 = this.n(l);
        if (f2 != null) {
            this.U(f2);
        }
    }

    protected void d(@NotNull F tn_02) {
        ((epq_2)((Object)tn_02)).a((tn_0)new tn_0());
    }

    protected void U(@NotNull F f2) {
    }

    protected void u(long l) {
        Object f2 = this.n(l);
        if (f2 != null) {
            this.c(f2);
        }
    }

    protected void c(@NotNull F tm_02) {
        try {
            ((epq_2)((Object)tm_02)).a((tm_0)new tm_0());
        }
        catch (Exception exception) {
            p.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    public void F() {
        this.l();
        for (epq_2 epq_22 : this.w.b(enw_2.e())) {
            if (epq_22 == null) continue;
            epq_22.a(new to_0());
            epa_1 epa_12 = epq_22.a_(eps_0.l);
            epa_12.d(1);
        }
    }

    public void M() {
        this.l();
    }

    @Override
    public /* synthetic */ va_0 P() {
        return this.O();
    }
}

