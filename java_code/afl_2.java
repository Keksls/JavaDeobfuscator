/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import org.apache.log4j.Logger;

/*
 * Renamed from aFL
 */
public final class afl_2
extends Thread
implements afm_2 {
    protected static final Logger a = Logger.getLogger(afl_2.class);
    private static final afl_2 b = new afl_2();
    private int c;
    private boolean d;

    public static afl_2 a() {
        return b;
    }

    private afl_2() {
        super("MemoryMonitor");
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
        if (!this.d) {
            this.d = true;
            super.start();
        }
    }

    @Override
    public void run() {
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        while (this.d) {
            MemoryUsage memoryUsage = memoryMXBean.getHeapMemoryUsage();
            MemoryUsage memoryUsage2 = memoryMXBean.getNonHeapMemoryUsage();
            a.error((Object)("Memory usage : heap(" + this.a(memoryUsage.getUsed()) + " / " + this.a(memoryUsage.getMax()) + ") non-heap(" + this.a(memoryUsage2.getUsed()) + " / " + this.a(memoryUsage2.getMax()) + ")"));
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                a.error((Object)"InterruptedException during MemoryMonitor run", (Throwable)interruptedException);
            }
        }
    }

    private float a(long l) {
        return (float)l / 1024000.0f;
    }
}

