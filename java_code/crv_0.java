/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crv
 */
public class crv_0
extends ps_0 {
    private long a;
    private int b;
    private long c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 12806;
    }

    public long b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }
}

