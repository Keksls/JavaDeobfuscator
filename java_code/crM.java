/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crM
extends ps_0 {
    private long a;
    private int b;
    private int c;
    private short d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getShort();
        return true;
    }

    @Override
    public int a() {
        return 13661;
    }

    public long b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public short e() {
        return this.d;
    }
}

