/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.RatioGauge
 *  com.codahale.metrics.RatioGauge$Ratio
 */
import com.codahale.metrics.RatioGauge;
import java.lang.management.MemoryUsage;

/*
 * Renamed from Ib
 */
class ib_2
extends RatioGauge {
    final /* synthetic */ hz_2 a;

    ib_2(hz_2 hz_22) {
        this.a = hz_22;
    }

    protected RatioGauge.Ratio getRatio() {
        MemoryUsage memoryUsage = this.a.b.getNonHeapMemoryUsage();
        return RatioGauge.Ratio.of((double)memoryUsage.getUsed(), (double)memoryUsage.getMax());
    }
}

