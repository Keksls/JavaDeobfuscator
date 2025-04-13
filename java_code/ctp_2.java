/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctP
 */
public class ctp_2
extends csy_2 {
    private boolean b = false;
    private boolean c = false;
    private long d = -1L;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        this.b = byteBuffer.get() == 1;
        boolean bl = this.c = byteBuffer.get() == 1;
        if (this.b) {
            this.d = byteBuffer.getLong();
        }
        return true;
    }

    @Override
    public int a() {
        return 12356;
    }

    public boolean b() {
        return this.b;
    }

    public long c() {
        return this.d;
    }

    public boolean e() {
        return this.c;
    }
}

