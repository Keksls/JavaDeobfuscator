/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.TLinkable
 *  gnu.trove.list.linked.TLinkedList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.TLinkable;
import gnu.trove.list.linked.TLinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.log4j.Logger;

/*
 * Renamed from aDI
 */
public class adi_2
extends Thread {
    private static final long h = 3L;
    private static final Logger i = Logger.getLogger(adi_2.class);
    protected static final adi_2 a = new adi_2();
    protected boolean b = false;
    protected final TLinkedList<adm_1> c = new TLinkedList();
    protected final Queue<adl_1> d = new ConcurrentLinkedQueue<adl_1>();
    protected final Lock e = new ReentrantLock();
    protected final Condition f = this.e.newCondition();
    protected long g;

    protected adi_2() {
        super("MessageScheduler");
    }

    public static adi_2 a() {
        return a;
    }

    private void e() {
        this.e.lock();
        this.f.signalAll();
        this.e.unlock();
    }

    public long a(adv_1 adv_12, long l, int n) {
        return this.a(adv_12, l, n, -1L);
    }

    public long a(adv_1 adv_12, long l, int n, long l2) {
        adm_1 adm_12 = new adm_1();
        adm_12.a(adv_12);
        adm_12.c(l);
        adm_12.a(n);
        adm_12.b(l2);
        adm_12.d(System.currentTimeMillis());
        ++this.g;
        adm_12.a(this.g);
        adl_1 adl_12 = new adl_1();
        adl_12.a = adk_2.e;
        adl_12.b = adm_12;
        this.d.offer(adl_12);
        this.e();
        return adm_12.d();
    }

    public void a(long l) {
        adl_1 adl_12 = new adl_1();
        adl_12.a = adk_2.a;
        adl_12.c = l;
        this.d.offer(adl_12);
        this.e();
    }

    public void b() {
        adl_1 adl_12 = new adl_1();
        adl_12.a = adk_2.d;
        this.d.offer(adl_12);
        this.e();
    }

    public void a(adv_1 adv_12) {
        adl_1 adl_12 = new adl_1();
        adl_12.a = adk_2.b;
        adl_12.d = adv_12;
        this.d.offer(adl_12);
        this.e();
    }

    public void a(adv_1 adv_12, int n) {
        adl_1 adl_12 = new adl_1();
        adl_12.a = adk_2.c;
        adl_12.d = adv_12;
        adl_12.e = n;
        this.d.offer(adl_12);
        this.e();
    }

    @Override
    public void start() {
        if (!this.b) {
            this.b = true;
            super.start();
        }
    }

    public boolean c() {
        return this.b;
    }

    public void a(boolean bl) {
        this.b = bl;
        this.e();
    }

    private void a(adm_1 adm_12) {
        boolean bl = false;
        long l = adm_12.g();
        for (adm_1 adm_13 : this.c) {
            if (adm_13.g() <= l) continue;
            this.c.addBefore((TLinkable)adm_13, (TLinkable)adm_12);
            bl = true;
            break;
        }
        if (!bl) {
            this.c.add((TLinkable)adm_12);
        }
    }

    private void a(adm_1 adm_12, long l) {
        try {
            adh_2 adh_22 = new adh_2();
            adh_22.a(adm_12.i());
            adh_22.a(adm_12.d());
            adh_22.b(adm_12.a());
            adh_22.b(l);
            add_2.b().a(adh_22);
        }
        catch (Exception exception) {
            i.error((Object)("Unable to push ClockMessage, exception raised : " + exception.getMessage()));
        }
    }

    private void f() {
        while (!this.d.isEmpty()) {
            adl_1 adl_12 = this.d.poll();
            block0 : switch (adl_12.a) {
                case e: {
                    this.a(adl_12.b);
                    break;
                }
                case a: {
                    adm_1 adm_12;
                    Iterator iterator = this.c.iterator();
                    while (iterator.hasNext()) {
                        adm_12 = (adm_1)iterator.next();
                        if (adm_12.d() != adl_12.c) continue;
                        adm_12.k();
                        iterator.remove();
                        break block0;
                    }
                    break;
                }
                case b: {
                    adm_1 adm_12;
                    Iterator iterator = this.c.iterator();
                    while (iterator.hasNext()) {
                        adm_12 = (adm_1)iterator.next();
                        if (adm_12.i() != adl_12.d) continue;
                        iterator.remove();
                    }
                    break;
                }
                case c: {
                    adm_1 adm_12;
                    Iterator iterator = this.c.iterator();
                    while (iterator.hasNext()) {
                        adm_12 = (adm_1)iterator.next();
                        if (adm_12.i() != adl_12.d || adm_12.a() != adl_12.e) continue;
                        iterator.remove();
                    }
                    break;
                }
                case d: {
                    this.c.clear();
                }
            }
        }
    }

    @Override
    public void run() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        i.info((Object)"MessageScheduler running");
        while (this.b) {
            try {
                try {
                    if (!this.c.isEmpty()) {
                        long l = System.currentTimeMillis();
                        arrayList.clear();
                        Iterator iterator = this.c.iterator();
                        while (iterator.hasNext()) {
                            adm_1 adm_12 = (adm_1)iterator.next();
                            if (adm_12.g() <= l + 3L) {
                                if (!adm_12.j()) {
                                    this.a(adm_12, l);
                                    adm_12.d(l);
                                    iterator.remove();
                                    if (!adm_12.h()) continue;
                                    arrayList.add(adm_12);
                                    continue;
                                }
                                iterator.remove();
                                continue;
                            }
                            if (!arrayList.isEmpty()) break;
                            this.e.lock();
                            this.f.await(Math.max(1L, adm_12.g() - l), TimeUnit.MILLISECONDS);
                            this.f.signalAll();
                            this.e.unlock();
                            break;
                        }
                        if (!arrayList.isEmpty()) {
                            for (adm_1 adm_13 : arrayList) {
                                this.a(adm_13);
                            }
                        }
                        this.f();
                        continue;
                    }
                    if (this.e.tryLock()) {
                        this.f.await();
                        this.e.unlock();
                    }
                    this.f();
                }
                catch (Exception exception) {
                    i.error((Object)"Exception during run", (Throwable)exception);
                }
            }
            catch (Exception exception) {
                i.error((Object)"Exception during run", (Throwable)exception);
            }
        }
        i.info((Object)"Message Scheduler stopped");
    }

    public final String d() {
        long l = System.currentTimeMillis();
        Iterator iterator = this.c.iterator();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Found ").append(this.c.size()).append(" clocks:\n");
        while (iterator.hasNext()) {
            adm_1 adm_12 = (adm_1)iterator.next();
            stringBuilder.append(adm_12.i().getClass().getSimpleName()).append(" : ").append(adm_12.f()).append(" ms ");
            if (adm_12.h()) {
                stringBuilder.append("repeatable ").append(adm_12.e()).append(" times ");
            }
            stringBuilder.append("next tick in ").append(adm_12.g() - l).append(" ms\n");
        }
        return stringBuilder.toString();
    }
}

