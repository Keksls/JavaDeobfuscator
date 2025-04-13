/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.log4j.Logger;

/*
 * Renamed from aDO
 */
public class ado_1 {
    private static final Logger a = Logger.getLogger(ado_1.class);
    private static final ado_1 b = new ado_1();
    private static final int c = 30;
    private final ConcurrentLinkedQueue<adt_2> d = new ConcurrentLinkedQueue();
    private final List<adq_2> e = new ArrayList<adq_2>();
    private final List<adq_2> f = new ArrayList<adq_2>();
    private final AtomicInteger g = new AtomicInteger(0);
    private final AtomicInteger h = new AtomicInteger(0);

    private ado_1() {
    }

    public static ado_1 a() {
        return b;
    }

    public void a(Runnable runnable) {
        this.a(runnable, 1L, 1);
    }

    public void a(Runnable runnable, long l) {
        this.a(runnable, l, -1);
    }

    public void a(Runnable runnable, adn_2 adn_22, long l, int n) {
        if (runnable == null) {
            a.error((Object)"Tentative d'insertion d'un Runnable null");
            return;
        }
        if (n == 0) {
            a.warn((Object)"On schedule un runnable pour \u00eatre execut\u00e9 0 fois, WTF ? (Gros blaireau)");
            return;
        }
        adr_2 adr_22 = new adr_2(runnable, adn_22.a(l));
        adr_22.a(n);
        this.a(adr_22);
    }

    public void a(Runnable runnable, long l, int n) {
        if (runnable == null) {
            a.error((Object)"Tentative d'insertion d'un Runnable null");
            return;
        }
        if (n == 0) {
            a.warn((Object)"On schedule un runnable pour \u00eatre execut\u00e9 0 fois");
            return;
        }
        ads_2 ads_22 = new ads_2(runnable, l);
        ads_22.a(n);
        this.a(ads_22);
    }

    public void b(Runnable runnable, long l) {
        this.a(runnable);
        this.a(runnable, l);
    }

    private void a(adq_2 adq_22) {
        adt_2 adt_22 = new adt_2(adu_2.a, adq_22, null);
        this.d.offer(adt_22);
        this.h.incrementAndGet();
        add_2.b().e();
    }

    public void b(Runnable runnable) {
        adt_2 adt_22 = new adt_2(adu_2.b, null, runnable);
        this.d.offer(adt_22);
        this.h.incrementAndGet();
    }

    public void b() {
        this.e.clear();
        this.d.clear();
        this.h.set(0);
        this.g.set(0);
    }

    private void a(adq_2 adq_22, long l) {
        long l2 = adq_22.a(l);
        for (int k = 0; k < this.e.size(); ++k) {
            adq_2 adq_23 = this.e.get(k);
            if (l2 >= adq_23.a()) continue;
            this.e.add(k, adq_22);
            return;
        }
        this.e.add(adq_22);
    }

    public long c() {
        if (this.e.isEmpty()) {
            return 30L;
        }
        long l = this.e.get(0).a() - System.currentTimeMillis();
        return Math.max(0L, l);
    }

    public boolean d() {
        return !this.e.isEmpty() || this.d.peek() != null;
    }

    public void e() {
        if (!this.d()) {
            return;
        }
        this.g();
    }

    private void g() {
        adt_2 adt_22;
        long l = System.currentTimeMillis();
        while ((adt_22 = this.d.poll()) != null) {
            block0 : switch (adt_22.a()) {
                case b: {
                    Iterator<adq_2> iterator = this.e.iterator();
                    while (iterator.hasNext()) {
                        adq_2 adq_22 = iterator.next();
                        if (adq_22.b() != adt_22.c()) continue;
                        this.g.decrementAndGet();
                        iterator.remove();
                        break block0;
                    }
                    break;
                }
                case a: {
                    this.g.incrementAndGet();
                    this.a(adt_22.b(), l);
                    break;
                }
                default: {
                    a.error((Object)("Undefined operation ! : " + adt_22.a()));
                }
            }
            this.h.decrementAndGet();
        }
    }

    public void f() {
        if (!this.d()) {
            return;
        }
        long l = System.currentTimeMillis();
        this.g();
        Iterator<adq_2> iterator = this.e.iterator();
        while (iterator.hasNext()) {
            adq_2 adq_22 = iterator.next();
            long l2 = l - adq_22.a();
            if (l2 < 0L) continue;
            iterator.remove();
            this.g.decrementAndGet();
            int n = adq_22.c();
            if (n == 0) continue;
            if (n > 0) {
                --n;
            }
            adq_22.a(n);
            Runnable runnable = null;
            try {
                runnable = adq_22.b();
                if (runnable != null) {
                    runnable.run();
                } else {
                    a.error((Object)"(Paranoia) Process null ?!");
                }
            }
            catch (Throwable throwable) {
                a.error(runnable != null ? "ProcessScheduler exception (" + runnable.getClass().getName() + "): " : "ProcessScheduler exception (null process): ", throwable);
            }
            if (n == 0) continue;
            this.f.add(adq_22);
        }
        if (!this.f.isEmpty()) {
            l = System.currentTimeMillis();
            int n = this.f.size();
            for (int k = 0; k < n; ++k) {
                this.a(this.f.get(k), l);
            }
            this.f.clear();
        }
        this.g();
    }
}

