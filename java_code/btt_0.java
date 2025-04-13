/*
 * Decompiled with CFR 0.152.
 */
import java.util.TimerTask;

/*
 * Renamed from bTt
 */
class btt_0
extends TimerTask {
    final /* synthetic */ String a;
    final /* synthetic */ btq_1 b;

    btt_0(btq_1 btq_12, String string) {
        this.b = btq_12;
        this.a = string;
    }

    @Override
    public void run() {
        if (this.b.I == null) {
            return;
        }
        if (!this.b.I.equals(this.a)) {
            return;
        }
        this.b.I = null;
        fis_1.a().a((ajf_1)this.b, "notificationMessage");
    }
}

