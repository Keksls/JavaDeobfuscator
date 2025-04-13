/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crc
extends ps_0 {
    private long a;
    private int b;
    private int c;

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        return true;
    }

    public long d() {
        return this.a;
    }

    @Override
    public int a() {
        return 13573;
    }
}

