/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from aFN
 */
public final class afn_2
extends Thread
implements afm_2 {
    protected static final Logger a = Logger.getLogger(afn_2.class);
    private boolean b;
    private int c;
    private long d;
    private static final afn_2 e = new afn_2();
    private final HashMap<Long, Long> f = new HashMap();

    public static afn_2 a() {
        return e;
    }

    private afn_2() {
        super("ThreadMonitor");
    }

    @Override
    public String f() {
        return this.getName();
    }

    @Override
    public int g() {
        return this.c;
    }

    @Override
    public void a(int n) {
        this.c = n;
    }

    @Override
    public synchronized void start() {
        if (!this.b) {
            this.b = true;
            this.d = System.nanoTime();
            super.start();
        }
    }

    @Override
    public synchronized void run() {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        if (threadMXBean == null) {
            return;
        }
        if (!threadMXBean.isThreadCpuTimeSupported()) {
            return;
        }
        threadMXBean.setThreadCpuTimeEnabled(true);
        while (this.b) {
            double d2 = System.nanoTime() - this.d;
            long[] lArray = threadMXBean.getAllThreadIds();
            long l = 0L;
            a.info((Object)"-----------------------------------------------------------------------");
            for (long l2 : lArray) {
                long l3 = threadMXBean.getThreadCpuTime(l2);
                long l4 = l3 - this.a(l2);
                if (l4 <= 0L) continue;
                this.a(l2, l3);
                double d3 = 100.0 * ((double)l4 / d2);
                ThreadInfo threadInfo = threadMXBean.getThreadInfo(l2);
                a.info((Object)("[" + threadInfo.getThreadName() + "] usage = " + d3 + " %"));
                l += l4;
            }
            double d4 = 100.0 * ((double)l / d2);
            a.info((Object)("total cpu usage = " + d4 + " %"));
            this.d = System.nanoTime();
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                a.error((Object)"InterruptedException during ThreadMonitor run", (Throwable)interruptedException);
            }
        }
    }

    public long a(long l) {
        if (this.f.containsKey(l)) {
            return this.f.get(l);
        }
        return 0L;
    }

    public void a(long l, long l2) {
        this.f.put(l, l2);
    }
}

