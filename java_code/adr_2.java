/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;

/*
 * Renamed from aDR
 */
class adr_2
extends adq_2 {
    private final long d;

    adr_2(Runnable runnable, long l) {
        super(runnable);
        this.d = l;
    }

    @Override
    public long a(long l) {
        long l2 = Calendar.getInstance().getTimeZone().getOffset(l);
        long l3 = (l + l2) / this.d;
        this.b = (1L + l3) * this.d - l2;
        return this.b;
    }

    public String toString() {
        return "ScheduledProcessOnFixedEvent{m_timeEventModulo=" + this.d + "}";
    }
}

