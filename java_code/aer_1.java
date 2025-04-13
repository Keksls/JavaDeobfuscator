/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from aEr
 */
class aer_1
implements Runnable {
    final /* synthetic */ aeo_1 a;
    final /* synthetic */ IOException b;
    final /* synthetic */ aeo_1 c;

    aer_1(aeo_1 aeo_12, aeo_1 aeo_13, IOException iOException) {
        this.c = aeo_12;
        this.a = aeo_13;
        this.b = iOException;
    }

    @Override
    public void run() {
        for (aev_1 aev_12 : this.c.h) {
            aev_12.a(this.a, this.b);
        }
    }
}

