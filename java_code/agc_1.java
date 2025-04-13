/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aGC
 */
class agc_1
implements agi_1 {
    protected static final Logger a = Logger.getLogger(agg_1.class);
    private adt_1 b;
    private boolean c;
    private Exception d;
    private final Lock e = new ReentrantLock();
    private final Condition f = this.e.newCondition();

    agc_1() {
        this.a();
    }

    public void a() {
        this.b = null;
        this.c = false;
        this.d = null;
    }

    public void c() {
        this.e.lock();
    }

    public void d() {
        this.e.unlock();
    }

    public void e() {
        try {
            this.f.await();
        }
        catch (InterruptedException interruptedException) {
            a.info((Object)"BlockingRequestRecipient wait interrupted", (Throwable)interruptedException);
        }
    }

    @Nullable
    public adt_1 f() {
        return this.b;
    }

    public boolean g() {
        return this.c;
    }

    public boolean h() {
        return this.d != null;
    }

    @Nullable
    public Exception i() {
        return this.d;
    }

    private void j() {
        this.e.lock();
        try {
            this.f.signalAll();
        }
        finally {
            this.e.unlock();
        }
    }

    @Override
    public void a(agf_1 agf_12, Exception exception) {
        this.d = exception;
        this.c = true;
        this.j();
        agi_1.super.a(agf_12, exception);
    }

    @Override
    public boolean a(adt_1 adt_12) {
        this.b = adt_12;
        this.c = true;
        this.j();
        return false;
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }
}

