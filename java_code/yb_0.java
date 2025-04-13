/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from YB
 */
class yb_0
implements Runnable {
    final /* synthetic */ short a;
    final /* synthetic */ short b;

    yb_0(short s2, short s3) {
        this.a = s2;
        this.b = s3;
    }

    @Override
    public void run() {
        try {
            yz_0.b(this.a, this.b);
        }
        catch (IOException iOException) {
            yz_0.h.error((Object)"", (Throwable)iOException);
        }
    }
}

