/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public abstract class fda
implements faV {
    protected static final Logger a = Logger.getLogger(fda.class);
    private faX c;
    private final EnumSet<fct_0> d = EnumSet.noneOf(fct_0.class);
    private final wt_0 e = wt_0.b();
    private fep_0 f = fep_0.b;
    private fgY g = fgY.a;
    private long h;
    protected final faU b;

    protected fda(faU faU2) {
        this.b = faU2;
    }

    @Override
    public long o() {
        return this.b.a_();
    }

    @Override
    public void a(faV faV2) {
        this.a(faV2.m());
        this.a(faV2.w());
        this.a(faV2.x());
        this.a(faV2.p());
        this.f = faV2.v();
        this.g = faV2.y();
        this.h = faV2.z();
    }

    @Override
    public void a(@NotNull faX faX2) {
        this.c = faX2;
        Object t = euw_2.a.d(this.b.a_());
        if (t != null && ((epq_2)t).fE().n() != faX2.c()) {
            ((epq_2)t).fE().a(faX2);
        }
    }

    @Override
    @NotNull
    public faX m() {
        return this.c;
    }

    @Override
    public int n() {
        return this.c.c();
    }

    @Override
    public wu_0 p() {
        if (this.c == faX.i) {
            return wt_0.c;
        }
        if (this.e != null) {
            return this.e;
        }
        return wt_0.c;
    }

    @Override
    public void a(@NotNull wu_0 wu_02) {
        if (this.c == faX.i) {
            return;
        }
        this.e.a(wu_02);
    }

    @Override
    public boolean c() {
        fgo fgo2 = (fgo)ena_0.a().a(this.b.U_(), end_0.p).orElse(new fgo());
        if (fgo2.a()) {
            return true;
        }
        return this.c != faX.i && this.e != null && !this.e.c() && this.c.w().b(this.e);
    }

    @Override
    public boolean q() {
        return this.c.v() && !this.c();
    }

    @Override
    public boolean j() {
        return this.c.d(this.o());
    }

    @Override
    public fcf r() {
        return this.c.e(this.o());
    }

    @Override
    public boolean b(fct_0 fct_02) {
        return this.d.add(fct_02);
    }

    @Override
    public boolean c(fct_0 fct_02) {
        return this.d.remove((Object)fct_02);
    }

    @Override
    public boolean a(fct_0 fct_02) {
        return this.d.contains((Object)fct_02);
    }

    @Override
    public EnumSet<fct_0> x() {
        return this.d;
    }

    @Override
    public void a(Collection<fct_0> collection) {
        this.d.clear();
        this.d.addAll(collection);
    }

    @Override
    public fep_0 v() {
        return this.f;
    }

    @Override
    public void a(fep_0 fep_02) {
        this.f = fep_02;
    }

    @Override
    public void b() {
        this.b(faX.i);
    }

    @Override
    public void b(@NotNull faX faX2) {
        this.a(faX2);
        this.a((fcu_0)null);
        this.a(Collections.emptySet());
        this.a(wt_0.c);
        this.f = fep_0.b;
        this.h = 0L;
    }

    @Override
    public int c(int n) {
        return 0;
    }

    @Override
    public void a(int n) {
        throw new UnsupportedOperationException("Impossible de lancer une purgation de peine : \u00e0 impl\u00e9menter autre part");
    }

    public void d() {
        throw new UnsupportedOperationException("Impossible de stopper une purgation de peine : \u00e0 impl\u00e9menter autre part");
    }

    public int A() {
        throw new UnsupportedOperationException("Pas de purgation ici : \u00e0 impl\u00e9menter autre part");
    }

    public int B() {
        throw new UnsupportedOperationException("Pas de purgation ici : \u00e0 impl\u00e9menter autre part");
    }

    public int f(int n) {
        throw new UnsupportedOperationException("Pas de purgation ici : \u00e0 impl\u00e9menter autre part");
    }

    @Override
    public boolean s() {
        throw new UnsupportedOperationException("Impossible de Savoir si on est enemy de la nation : \u00e0 impl\u00e9menter autre part");
    }

    @Override
    public boolean d(int n) {
        throw new UnsupportedOperationException("Impossible de Savoir si on est enemy de la nation : \u00e0 impl\u00e9menter autre part");
    }

    @Override
    public boolean t() {
        throw new UnsupportedOperationException("Impossible de savoir si on est hors la loi de la nation : \u00e0 impl\u00e9menter autre part");
    }

    @Override
    public boolean e(int n) {
        throw new UnsupportedOperationException("Impossible de savoir si on est hors la loi de la nation : \u00e0 impl\u00e9menter autre part");
    }

    @Override
    public void b(boolean bl) {
        throw new UnsupportedOperationException("Impossible de Savoir si on est enemy de la nation : \u00e0 impl\u00e9menter autre part");
    }

    @Override
    public boolean u() {
        throw new UnsupportedOperationException("Impossible de Savoir si on est enemy de la nation : \u00e0 impl\u00e9menter autre part");
    }

    @Override
    public fgY y() {
        return this.g;
    }

    @Override
    public void a(fgY fgY2) {
        this.g = fgY2;
    }

    @Override
    public void a(long l) {
        this.h = l;
    }

    @Override
    public long z() {
        return this.h;
    }
}

