/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Qb
 */
public class qb_0
extends ps_0 {
    private String a;
    private String b;
    private long c;
    private String d;
    private short e;
    private long f;
    private byte g;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray2);
        this.a = Cz.a(byArray2);
        byte[] byArray3 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray3);
        this.b = Cz.a(byArray3);
        byte[] byArray4 = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(byArray4);
        this.d = Cz.a(byArray4);
        this.c = byteBuffer.getLong();
        this.e = byteBuffer.getShort();
        this.g = byteBuffer.get();
        this.f = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 768;
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

    public byte e() {
        return this.g;
    }

    public short f() {
        return this.e;
    }

    public String g() {
        return this.d;
    }

    public long h() {
        return this.f;
    }
}

