/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cAn
extends ps_0 {
    private long a;
    private byte[] b;
    private byte[] c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.b);
        this.c = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.c);
        return false;
    }

    public byte[] b() {
        return this.b;
    }

    public byte[] c() {
        return this.c;
    }

    @Override
    public int a() {
        return 15795;
    }

    public long d() {
        return this.a;
    }
}

