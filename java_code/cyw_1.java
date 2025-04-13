/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyw
 */
public class cyw_1
extends ps_0 {
    private long a;
    private byte b;
    private long c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.get();
        this.c = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 13214;
    }

    public long b() {
        return this.a;
    }

    public byte c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }
}

