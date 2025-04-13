/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class crQ
extends ps_0 {
    private long a;
    private byte b;
    private byte c;
    private int d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.get();
        this.c = byteBuffer.get();
        this.d = byteBuffer.getInt();
        return false;
    }

    public long b() {
        return this.a;
    }

    public byte c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public byte e() {
        return this.b;
    }

    @Override
    public int a() {
        return 13671;
    }
}

