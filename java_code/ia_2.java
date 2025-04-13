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
 * Renamed from Ia
 */
class ia_2
extends RatioGauge {
    final /* synthetic */ hz_2 a;

    ia_2(hz_2 hz_22) {
        this.a = hz_22;
    }

    protected RatioGauge.Ratio getRatio() {
        MemoryUsage memoryUsage = this.a.b.getHeapMemoryUsage();
        return RatioGauge.Ratio.of((double)memoryUsage.getUsed(), (double)memoryUsage.getMax());
    }
}

