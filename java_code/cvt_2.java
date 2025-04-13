/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvT
 */
public class cvt_2
extends ps_0 {
    private int a;
    private wu_0 b;
    private long c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = wt_0.b(byteBuffer.getLong());
        this.c = byteBuffer.getLong();
        return true;
    }

    public wu_0 b() {
        return this.b;
    }

    public int c() {
        return this.a;
    }

    public long d() {
        return this.c;
    }

    @Override
    public int a() {
        return 12058;
    }
}

