/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Metric
 *  com.codahale.metrics.MetricSet
 */
import com.codahale.metrics.Metric;
import com.codahale.metrics.MetricSet;
import java.lang.invoke.CallSite;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/*
 * Renamed from HX
 */
public class hx_2
implements MetricSet {
    private static final Pattern a = Pattern.compile("[\\s]+");
    private final List<GarbageCollectorMXBean> b = ManagementFactory.getGarbageCollectorMXBeans();

    public Map<String, Metric> getMetrics() {
        HashMap hashMap = new HashMap();
        for (GarbageCollectorMXBean garbageCollectorMXBean : this.b) {
            String string = a.matcher(garbageCollectorMXBean.getName()).replaceAll("-");
            hashMap.put((CallSite)((Object)(string + ".count")), new hy_2("jvm.gc." + string + ".count", garbageCollectorMXBean::getCollectionCount));
            hashMap.put((CallSite)((Object)(string + ".time")), new hy_2("jvm.gc." + string + ".time", garbageCollectorMXBean::getCollectionTime));
        }
        return Collections.unmodifiableMap(hashMap);
    }
}

