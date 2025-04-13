/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.nio.ByteBuffer;

/*
 * Renamed from cvD
 */
public class cvd_1
extends ps_0 {
    private long a;
    private hx_0 b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        int n = byteBuffer.getInt();
        boolean bl = byteBuffer.get() == 1;
        byte[] byArray2 = new byte[n];
        byteBuffer.get(byArray2);
        if (bl) {
            try {
                byArray2 = flI.b(byArray2);
                this.b = eyy_0.c(byArray2);
            }
            catch (IOException iOException) {
                A.error((Object)("Unable to uncompress equipment inventory data for character " + this.a), (Throwable)iOException);
                this.b = hx_0.f().g();
            }
        } else {
            this.b = eyy_0.c(byArray2);
        }
        return true;
    }

    @Override
    public int a() {
        return 12004;
    }

    public long b() {
        return this.a;
    }

    public hx_0 c() {
        return this.b;
    }
}

