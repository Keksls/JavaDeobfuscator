/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.RatioGauge
 *  com.codahale.metrics.RatioGauge$Ratio
 */
import com.codahale.metrics.RatioGauge;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryUsage;

/*
 * Renamed from Ic
 */
class ic_2
extends RatioGauge {
    final /* synthetic */ MemoryPoolMXBean a;
    final /* synthetic */ hz_2 b;

    ic_2(hz_2 hz_22, MemoryPoolMXBean memoryPoolMXBean) {
        this.b = hz_22;
        this.a = memoryPoolMXBean;
    }

    protected RatioGauge.Ratio getRatio() {
        MemoryUsage memoryUsage = this.a.getUsage();
        return RatioGauge.Ratio.of((double)memoryUsage.getUsed(), (double)(memoryUsage.getMax() == -1L ? (double)memoryUsage.getCommitted() : (double)memoryUsage.getMax()));
    }
}

