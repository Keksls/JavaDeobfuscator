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
 * Renamed from HP
 */
class hp_1
extends Histogram
implements ip_2 {
    final long a;

    hp_1(long l) {
        super((Reservoir)new HdrHistogramResetOnSnapshotReservoir());
        this.a = l;
    }

    @Override
    public hl_1 a(hb_1 hb_12) {
        return new hq_1(this);
    }

    @Override
    public io_2 a() {
        return io_2.b;
    }
}

