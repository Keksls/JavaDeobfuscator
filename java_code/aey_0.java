/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from aeY
 */
class aey_0
implements Runnable {
    final /* synthetic */ short a;
    final /* synthetic */ short b;
    final /* synthetic */ aew_0 c;

    aey_0(aew_0 aew_02, short s2, short s3) {
        this.c = aew_02;
        this.a = s2;
        this.b = s3;
    }

    @Override
    public void run() {
        try {
            this.c.b(this.a, this.b);
        }
        catch (IOException iOException) {
            aew_0.g.error((Object)"", (Throwable)iOException);
        }
    }
}

