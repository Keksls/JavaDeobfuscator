/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cAv
 */
public class cav_0
extends ps_0 {
    private long a;
    private long b;
    private String c;
    private byte d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.get()];
        byteBuffer.get(byArray2);
        this.c = Cz.a(byArray2);
        this.d = byteBuffer.get();
        return true;
    }

    public String b() {
        return this.c;
    }

    public byte c() {
        return this.d;
    }

    public long d() {
        return this.a;
    }

    public long e() {
        return this.b;
    }

    @Override
    public int a() {
        return 1062;
    }
}

