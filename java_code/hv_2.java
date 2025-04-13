/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Metric
 *  com.codahale.metrics.MetricSet
 */
import com.codahale.metrics.Metric;
import com.codahale.metrics.MetricSet;
import java.lang.management.ClassLoadingMXBean;
import java.lang.management.ManagementFactory;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from HV
 */
public class hv_2
implements MetricSet {
    private final ClassLoadingMXBean a = ManagementFactory.getClassLoadingMXBean();

    public Map<String, Metric> getMetrics() {
        HashMap hashMap = new HashMap();
        hashMap.put("loaded", new hw_2("jvm.class.loaded", this.a::getTotalLoadedClassCount));
        hashMap.put("unloaded", new hw_2("jvm.class.unloaded", this.a::getUnloadedClassCount));
        return Collections.unmodifiableMap(hashMap);
    }
}

