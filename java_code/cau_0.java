/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cAu
 */
public class cau_0
extends ps_0 {
    private byte a;
    private long b;
    private long c;
    private String d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        byte by = byteBuffer.get();
        byte[] byArray2 = new byte[by];
        byteBuffer.get(byArray2);
        this.d = Cz.a(byArray2);
        return true;
    }

    public long b() {
        return this.b;
    }

    public String c() {
        return this.d;
    }

    public long d() {
        return this.c;
    }

    public byte e() {
        return this.a;
    }

    @Override
    public int a() {
        return 1116;
    }
}

