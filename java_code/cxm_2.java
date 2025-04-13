/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxM
 */
public final class cxm_2
extends ps_0 {
    private long a;
    private fhq b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = new fhq(this.a);
        int n = byteBuffer.getShort();
        for (int k = 0; k < n; ++k) {
            long l = byteBuffer.getLong();
            this.b.a(l, fgY.a(byteBuffer.get()));
            this.b.b(l, fgY.a(byteBuffer.get()));
            this.b.b(l, byteBuffer.getInt());
            this.b.a(l, byteBuffer.getInt());
            this.b.c(l, byteBuffer.getInt());
            this.b.d(l, byteBuffer.getInt());
            this.b.e(l, byteBuffer.getInt());
        }
        return false;
    }

    public long b() {
        return this.a;
    }

    public fhq c() {
        return this.b;
    }

    @Override
    public int a() {
        return 15781;
    }
}

