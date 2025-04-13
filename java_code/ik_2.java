/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Histogram
 *  com.codahale.metrics.Reservoir
 *  org.mpierce.metrics.reservoir.hdrhistogram.HdrHistogramResetOnSnapshotReservoir
 */
import com.codahale.metrics.Histogram;
import com.codahale.metrics.Reservoir;
import org.mpierce.metrics.reservoir.hdrhistogram.HdrHistogramResetOnSnapshotReservoir;

/*
 * Renamed from Ik
 */
class ik_2
extends Histogram
implements ip_2 {
    final int a;

    ik_2(int n) {
        super((Reservoir)new HdrHistogramResetOnSnapshotReservoir());
        this.a = n;
    }

    @Override
    public hl_1 a(hb_1 hb_12) {
        return new il_2(this);
    }

    @Override
    public io_2 a() {
        return io_2.d;
    }
}

