/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.commons.pool.PoolableObjectFactory
 *  org.apache.commons.pool.impl.StackObjectPool
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.commons.pool.ObjectPool;
import org.apache.commons.pool.PoolableObjectFactory;
import org.apache.commons.pool.impl.StackObjectPool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from arM
 */
public abstract class arm_1
extends Thread {
    private static final boolean e = false;
    protected static final Logger a = LoggerFactory.getLogger(art_1.class);
    protected final ArrayList<asg_1> b = new ArrayList();
    private final Queue<arp_1> f = new ConcurrentLinkedQueue<arp_1>();
    private volatile boolean g;
    private int h;
    private final Lock i = new ReentrantLock();
    private final Condition j = this.i.newCondition();
    protected static final String c = "id";
    protected static final int d = "id".hashCode();
    private final ObjectPool k = new StackObjectPool((PoolableObjectFactory)new arn_1(this));

    private arp_1 h() {
        try {
            return (arp_1)this.k.borrowObject();
        }
        catch (Exception exception) {
            a.error("Exception lev\u00e9e lors d'un checkOut d'op\u00e9ration", (Throwable)exception);
            return null;
        }
    }

    private void a(arp_1 arp_12) {
        try {
            this.k.returnObject((Object)arp_12);
        }
        catch (Exception exception) {
            a.error("Exception lev\u00e9e lors du retour au pool d'un process", (Throwable)exception);
        }
    }

    public void a(asg_1 asg_12) {
        if (!this.b.contains(asg_12)) {
            this.b.add(asg_12);
        }
    }

    public void b(asg_1 asg_12) {
        this.b.remove(asg_12);
    }

    @Override
    public synchronized void start() {
        if (!this.g) {
            this.g = true;
            super.start();
        }
    }

    public void a() {
        this.a(arq_1.c, null);
    }

    public boolean b() {
        return this.g;
    }

    public void a(boolean bl) {
        this.g = bl;
        this.i();
    }

    private void i() {
        this.i.lock();
        this.j.signal();
        this.i.unlock();
    }

    public void a(arq_1 arq_12, Object object) {
        arp_1 arp_12 = this.h();
        if (arp_12 != null) {
            arp_12.a = arq_12;
            arp_12.b = object;
            this.f.offer(arp_12);
            this.i();
        }
    }

    public int c() {
        return this.f.size();
    }

    public int d() {
        return this.h;
    }

    public void a(int n) {
        this.h = n;
    }

    public abstract ars_1 a(int var1, ars_1 var2);

    public abstract ars_1[] a(ars_1 var1);

    public abstract ars_1[] a(String var1, Object var2, ars_1 var3);

    protected abstract boolean e();

    protected abstract void b(ars_1 var1);

    protected abstract void c(ars_1 var1);

    protected abstract String f();

    protected abstract void g();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        a.info("BinaryStorage started " + this);
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        this.g = true;
        while (this.g) {
            arp_1 arp_12;
            while ((arp_12 = this.f.poll()) != null) {
                arq_1 arq_12 = arp_12.a;
                switch (arq_12) {
                    case a: {
                        ++n3;
                        Object object = (ars_1)arp_12.b;
                        this.b((ars_1)object);
                        for (asg_1 asg_12 : this.b) {
                            asg_12.b(this, (ars_1)object);
                        }
                        break;
                    }
                    case b: {
                        ++n2;
                        Object object = (ars_1)arp_12.b;
                        this.c((ars_1)object);
                        for (asg_1 asg_12 : this.b) {
                            asg_12.a(this, (ars_1)object);
                        }
                        break;
                    }
                    case c: {
                        this.a(false);
                        for (asg_1 asg_13 : this.b) {
                            asg_13.a(this);
                        }
                        break;
                    }
                }
                ++n;
                this.a(arp_12);
            }
            if (!this.g || !this.i.tryLock()) continue;
            try {
                this.j.await();
            }
            catch (InterruptedException interruptedException) {
                a.warn("Interrupt", (Throwable)interruptedException);
            }
            finally {
                this.i.unlock();
            }
        }
        a.info("BinaryStorage stopped : " + n + " operations, " + n2 + " saved, " + n3 + " destroyed");
    }
}

