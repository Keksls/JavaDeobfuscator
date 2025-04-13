/*
 * Decompiled with CFR 0.152.
 */
import java.util.TimerTask;

/*
 * Renamed from bTr
 */
class btr_1
extends TimerTask {
    final /* synthetic */ btq_1 a;

    btr_1(btq_1 btq_12) {
        this.a = btq_12;
    }

    @Override
    public void run() {
        boolean bl;
        boolean bl2 = bl = !azu_0.j().c(ddO.a()) || ddO.a().f().o() != btn_1.d;
        if (bl || this.a.y != btv_0.d) {
            this.cancel();
            this.a.F = null;
            return;
        }
        fis_1.a().a((ajf_1)this.a, "lastRefreshDelayText");
    }
}

