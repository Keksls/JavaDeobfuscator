/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fbJ
 */
public class fbj_0
implements aea_2,
Runnable {
    private static final Logger b = Logger.getLogger(fbj_0.class);
    protected final fda a;
    private final long c = wc_0.p().e();
    private long d = wc_0.p().e();
    private int e;

    public fbj_0(fda fda2) {
        this.a = fda2;
        this.e = fda2.A();
    }

    @Override
    public long a() {
        return this.c;
    }

    @Override
    public long b() {
        this.run();
        long l = fbk_0.a(this.e);
        int n = this.a.B();
        if (l > 0L && n == -1) {
            b.error((Object)"Attention un cooldown de purgation tourne sur une nation vide");
        }
        return l;
    }

    protected long a(int n) {
        return fbk_0.a(n) - (wc_0.p().e() - this.d);
    }

    public long g() {
        return this.a(this.a.A());
    }

    public void e() {
    }

    @Override
    public boolean c() {
        this.a.d();
        return false;
    }

    public void d() {
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void run() {
        int n;
        int n2 = this.a.A();
        if (n2 != (n = fbk_0.a(this.e, wc_0.p().e() - this.c))) {
            this.d = wc_0.p().e();
        }
        this.a.f(n - n2);
    }

    public void a(int n, int n2) {
        this.e += n;
    }

    public void h() {
        this.e = 0;
        this.d = 0L;
    }
}

