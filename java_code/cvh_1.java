/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvH
 */
public class cvh_1
extends ps_0 {
    private byte a;
    private long b;
    private byte c;
    private byte[] d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get();
        this.d = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.d);
        return true;
    }

    @Override
    public int a() {
        return 12437;
    }

    public byte b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public byte[] d() {
        return this.d;
    }

    public byte e() {
        return this.c;
    }
}

