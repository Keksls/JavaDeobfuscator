/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csP
 */
public class csp_1
extends ps_0 {
    private long a;
    private byte b;
    private long c;
    private long d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.get();
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 13824;
    }

    public long b() {
        return this.a;
    }

    public long c() {
        return this.c;
    }

    public byte d() {
        return this.b;
    }

    public long e() {
        return this.d;
    }
}

