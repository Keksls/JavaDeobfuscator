/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public abstract class fib
implements ts_0,
abq_1,
gq_1<yp_2> {
    protected static final Logger c = Logger.getLogger(fib.class);
    protected fie r;
    protected ObjectPool s;
    protected int t;
    protected long u;
    protected int v;

    protected fib() {
    }

    public fie n() {
        return this.r;
    }

    protected void a(int n, long l, int n2) {
        this.t = n;
        this.u = l;
        this.v = n2;
    }

    @Override
    public void release() {
        if (this.s != null) {
            try {
                this.s.returnObject((Object)this);
            }
            catch (Exception exception) {
                c.error((Object)("Exception dans le release de " + this.getClass().toString() + ". Normalement impossible"));
            }
            this.s = null;
        } else {
            this.onCheckIn();
        }
    }

    @Override
    public long a() {
        return this.u;
    }

    @Override
    public int aT_() {
        return this.t;
    }

    public int o() {
        return this.v;
    }

    public void a(int n) {
        this.v = n;
    }

    public void b(fie fie2, long l, int n, int n2) {
        this.r = fie2;
        this.u = fie2 != fie.b ? l : (long)n;
        this.t = n;
        this.v = n2;
    }

    @Override
    public boolean b(yp_2 yp_22) {
        yp_22.a = this.r.a();
        yp_22.b = this.u;
        yp_22.c = this.t;
        yp_22.d = this.v;
        return true;
    }

    @Override
    public boolean a(yp_2 yp_22) {
        this.r = fie.a(yp_22.a);
        this.u = yp_22.b;
        this.t = yp_22.c;
        this.v = yp_22.d;
        return this.r != null;
    }

    @Override
    public short e() {
        return 1;
    }

    @Override
    public void a(short s2) {
    }

    @Override
    public void b(short s2) {
    }

    @Override
    public boolean a(ts_0 ts_02) {
        return false;
    }

    @Override
    public short aR_() {
        return 1;
    }

    @Override
    public void onCheckOut() {
        this.t = 0;
        this.u = 0L;
        this.v = 0;
    }

    @Override
    public void onCheckIn() {
        this.r = null;
    }

    @Override
    public boolean j() {
        return true;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "[m_targetReferenceId=" + this.t + "]";
    }

    @Override
    public /* synthetic */ boolean b(Object object) {
        return this.a((yp_2)object);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.b((yp_2)object);
    }
}

