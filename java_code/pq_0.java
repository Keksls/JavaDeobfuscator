/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from PQ
 */
public class pq_0
extends ps_0 {
    private String a;
    private String b;
    private long c;
    private short d;
    private byte e;
    private long f;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray2);
        this.a = Cz.a(byArray2);
        byte[] byArray3 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray3);
        this.b = Cz.a(byArray3);
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getShort();
        this.e = byteBuffer.get();
        this.f = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 641;
    }

    public String b() {
        return this.a;
    }

    public long c() {
        return this.c;
    }

    public String d() {
        return this.b;
    }

    public short e() {
        return this.d;
    }

    public byte f() {
        return this.e;
    }

    public long g() {
        return this.f;
    }
}

