/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bya
 */
public class bya_1 {
    private long a;
    private long b;
    private String c;
    private String d;
    private int e;
    private int f;
    private short g;

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public short g() {
        return this.g;
    }

    public void a(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.c = Cz.a(byArray);
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        this.d = Cz.a(byArray2);
        this.e = byteBuffer.getInt();
        this.f = byteBuffer.getInt();
        this.g = byteBuffer.getShort();
    }
}

