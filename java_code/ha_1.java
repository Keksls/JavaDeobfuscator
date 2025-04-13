/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Counter
 *  com.codahale.metrics.Histogram
 *  com.codahale.metrics.Meter
 *  com.codahale.metrics.Metric
 *  com.codahale.metrics.MetricFilter
 *  com.codahale.metrics.MetricRegistry
 *  com.codahale.metrics.ScheduledReporter
 *  com.codahale.metrics.Timer
 *  com.google.inject.Inject
 *  javax.inject.Provider
 *  org.jetbrains.annotations.Nullable
 */
import com.codahale.metrics.Counter;
import com.codahale.metrics.Histogram;
import com.codahale.metrics.Meter;
import com.codahale.metrics.Metric;
import com.codahale.metrics.MetricFilter;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.ScheduledReporter;
import com.codahale.metrics.Timer;
import com.google.inject.Inject;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import javax.inject.Provider;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from HA
 */
public class ha_1 {
    private final MetricRegistry a;
    private final Provider<ScheduledReporter> b;
    @Nullable
    private ScheduledReporter c;
    private final Set<String> d = new HashSet<String>();

    @Inject
    private ha_1(MetricRegistry metricRegistry, Provider<ScheduledReporter> provider) {
        this.a = metricRegistry;
        this.b = provider;
    }

    public void a() {
        this.a.register("jvm.class", (Metric)new hv_2());
        this.a.register("jvm.threads", (Metric)new ie_2());
        this.a.register("jvm.gc", (Metric)new hx_2());
        this.a.register("jvm.memory", (Metric)new hz_2());
        this.a.register("jvm.buffer", (Metric)new ht_2());
    }

    private <T extends Metric> T e(String string, Supplier<T> supplier) {
        this.d.add(string);
        return (T)this.a.register(string, (Metric)supplier.get());
    }

    public Meter a(String string, Supplier<Meter> supplier) {
        try {
            return this.d.contains(string) ? this.a.meter(string) : this.e(string, supplier);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return this.a.meter(string);
        }
    }

    public Histogram b(String string, Supplier<Histogram> supplier) {
        try {
            return this.d.contains(string) ? this.a.histogram(string) : this.e(string, supplier);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return this.a.histogram(string);
        }
    }

    public Timer c(String string, Supplier<Timer> supplier) {
        try {
            return this.d.contains(string) ? this.a.timer(string) : this.e(string, supplier);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return this.a.timer(string);
        }
    }

    public Counter d(String string, Supplier<Counter> supplier) {
        try {
            return this.d.contains(string) ? this.a.counter(string) : this.e(string, supplier);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return this.a.counter(string);
        }
    }

    public SortedSet<String> b() {
        return this.a.getNames();
    }

    public Map<String, Metric> c() {
        return this.a.getMetrics();
    }

    public hc_1 a(PrintStream printStream, MetricFilter metricFilter) {
        return new hc_1(this.a, printStream, metricFilter, TimeUnit.SECONDS, TimeUnit.MILLISECONDS);
    }

    public void a(int n, TimeUnit timeUnit) {
        this.d();
        this.c = (ScheduledReporter)this.b.get();
        this.c.start((long)n, timeUnit);
    }

    public void d() {
        if (this.c != null) {
            this.c.stop();
        }
    }

    public String toString() {
        return "MetricsManager{m_registry=" + this.a.getNames().size() + "}";
    }
}

