/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Metric
 *  com.codahale.metrics.MetricRegistry
 *  com.codahale.metrics.MetricSet
 */
import com.codahale.metrics.Metric;
import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.MetricSet;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryPoolMXBean;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/*
 * Renamed from HZ
 */
public class hz_2
implements MetricSet {
    private static final Pattern a = Pattern.compile("[\\s]+");
    final MemoryMXBean b = ManagementFactory.getMemoryMXBean();
    private final List<MemoryPoolMXBean> c = ManagementFactory.getMemoryPoolMXBeans();

    public Map<String, Metric> getMetrics() {
        HashMap hashMap = new HashMap();
        hashMap.put("total.init", new id_2("jvm.memory.total.init", () -> this.b.getHeapMemoryUsage().getInit() + this.b.getNonHeapMemoryUsage().getInit()));
        hashMap.put("total.used", new id_2("jvm.memory.total.used", () -> this.b.getHeapMemoryUsage().getUsed() + this.b.getNonHeapMemoryUsage().getUsed()));
        hashMap.put("total.max", new id_2("jvm.memory.total.max", () -> this.b.getHeapMemoryUsage().getMax() + this.b.getNonHeapMemoryUsage().getMax()));
        hashMap.put("total.committed", new id_2("jvm.memory.total.committed", () -> this.b.getHeapMemoryUsage().getCommitted() + this.b.getNonHeapMemoryUsage().getCommitted()));
        hashMap.put("heap.init", new id_2("jvm.memory.heap.init", () -> this.b.getHeapMemoryUsage().getInit()));
        hashMap.put("heap.used", new id_2("jvm.memory.heap.used", () -> this.b.getHeapMemoryUsage().getUsed()));
        hashMap.put("heap.max", new id_2("jvm.memory.heap.max", () -> this.b.getHeapMemoryUsage().getMax()));
        hashMap.put("heap.committed", new id_2("jvm.memory.heap.committed", () -> this.b.getHeapMemoryUsage().getCommitted()));
        hashMap.put("heap.usage", new id_2("jvm.memory.heap.usage", new ia_2(this)));
        hashMap.put("non-heap.init", new id_2("jvm.memory.non-heap.init", () -> this.b.getNonHeapMemoryUsage().getInit()));
        hashMap.put("non-heap.used", new id_2("jvm.memory.non-heap.used", () -> this.b.getNonHeapMemoryUsage().getUsed()));
        hashMap.put("non-heap.max", new id_2("jvm.memory.non-heap.max", () -> this.b.getNonHeapMemoryUsage().getMax()));
        hashMap.put("non-heap.committed", new id_2("jvm.memory.non-heap.committed", () -> this.b.getNonHeapMemoryUsage().getCommitted()));
        hashMap.put("non-heap.usage", new id_2("jvm.memory.non-heap.usage", new ib_2(this)));
        for (MemoryPoolMXBean memoryPoolMXBean : this.c) {
            String string = MetricRegistry.name((String)"pools", (String[])new String[]{a.matcher(memoryPoolMXBean.getName()).replaceAll("-")});
            hashMap.put(string + ".usage", new id_2("jvm.memory." + string + ".usage", new ic_2(this, memoryPoolMXBean)));
            hashMap.put(string + ".max", new id_2("jvm.memory." + string + ".max", () -> memoryPoolMXBean.getUsage().getMax()));
            hashMap.put(string + ".used", new id_2("jvm.memory." + string + ".used", () -> memoryPoolMXBean.getUsage().getUsed()));
            hashMap.put(string + ".committed", new id_2("jvm.memory." + string + ".committed", () -> memoryPoolMXBean.getUsage().getCommitted()));
            if (memoryPoolMXBean.getCollectionUsage() != null) {
                hashMap.put(string + ".used-after-gc", new id_2("jvm.memory." + string + ".used-after-gc", () -> memoryPoolMXBean.getCollectionUsage().getUsed()));
            }
            hashMap.put(string + ".init", new id_2("jvm.memory." + string + ".init", () -> memoryPoolMXBean.getUsage().getInit()));
        }
        return Collections.unmodifiableMap(hashMap);
    }
}

