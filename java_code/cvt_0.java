/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from cVt
 */
public class cvt_0
implements ahr_1 {
    private static final cvt_0 a = new cvt_0();
    private ScheduledExecutorService b;

    public static cvt_0 a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17791: {
                azu_0.j().b(this);
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        fpm_0.b().a(new cVu(this));
        fis_1.a().a("statistics", bus_2.a());
        fpm_0.b().a("adminMonitorDialog", cfi_0.a("adminMonitorDialog"), 1L, (short)10000);
        bus_2.a().b();
        this.b = Executors.newSingleThreadScheduledExecutor();
        this.b.scheduleWithFixedDelay(new cVv(this), 0L, 5L, TimeUnit.SECONDS);
        if (!azu_0.j().c(ceL.a())) {
            azu_0.j().a(ceL.a());
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        fis_1.a().a("statistics");
        fpm_0.b().o("adminMonitorDialog");
        bus_2.a().b();
        if (this.b != null) {
            this.b.shutdown();
            this.b = null;
        }
        azu_0.j().b(ceL.a());
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

