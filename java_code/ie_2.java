/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Metric
 *  com.codahale.metrics.MetricSet
 *  com.codahale.metrics.jvm.ThreadDeadlockDetector
 *  com.google.common.primitives.Ints
 */
import com.codahale.metrics.Metric;
import com.codahale.metrics.MetricSet;
import com.codahale.metrics.jvm.ThreadDeadlockDetector;
import com.google.common.primitives.Ints;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

/*
 * Renamed from Ie
 */
public class ie_2
implements MetricSet {
    private static final int a = 0;
    private final ThreadMXBean b = ManagementFactory.getThreadMXBean();
    private final ThreadDeadlockDetector c = new ThreadDeadlockDetector();

    public Map<String, Metric> getMetrics() {
        HashMap hashMap = new HashMap();
        for (Thread.State state : Thread.State.values()) {
            String string = state.toString().toLowerCase();
            hashMap.put(string + ".count", new if_2("jvm.threads." + string + ".count", () -> this.a(state)));
        }
        hashMap.put("count", new if_2("jvm.threads.count", this.b::getThreadCount));
        hashMap.put("daemon.count", new if_2("jvm.threads.daemon.count", this.b::getDaemonThreadCount));
        hashMap.put("deadlock.count", new if_2("jvm.threads.deadlock.count", () -> this.c.getDeadlockedThreads().size()));
        hashMap.put("deadlocks", new if_2("jvm.threads.deadlocks", () -> ((ThreadDeadlockDetector)this.c).getDeadlockedThreads()));
        return Collections.unmodifiableMap(hashMap);
    }

    private int a(Thread.State state) {
        ThreadInfo[] threadInfoArray = this.b.getThreadInfo(this.b.getAllThreadIds(), 0);
        return Ints.saturatedCast((long)Stream.of(threadInfoArray).filter(Objects::nonNull).filter(threadInfo -> threadInfo.getThreadState() == state).count());
    }
}

