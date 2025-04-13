/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eNb
 */
public class enb_1 {
    private final enc_1 a;
    private final long b;
    private final byte c;

    public enb_1(enc_1 enc_12, long l, byte by) {
        this.a = enc_12;
        this.b = l;
        this.c = by;
    }

    public int a() {
        return 10;
    }

    public void a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a.a());
        byteBuffer.putLong(this.b);
        byteBuffer.put(this.c);
    }

    public static enb_1 b(ByteBuffer byteBuffer) {
        enc_1 enc_12 = enc_1.a(byteBuffer.get());
        long l = byteBuffer.getLong();
        byte by = byteBuffer.get();
        return new enb_1(enc_12, l, by);
    }

    public boolean b() {
        return this.a != enc_1.a;
    }

    public boolean c() {
        return this.a == enc_1.c;
    }

    public long d() {
        return this.b;
    }

    public byte e() {
        return this.c;
    }
}

