/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from clq
 */
public class clq_0
extends Pw {
    private long a;
    private byte b;
    private String c;
    private boolean e;

    @Override
    public byte[] b() {
        byte[] byArray = Cz.a(this.c);
        ByteBuffer byteBuffer = ByteBuffer.allocate(10 + byArray.length + 1);
        byteBuffer.putLong(this.a);
        byteBuffer.put(this.b);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.put((byte)(this.e ? 1 : 0));
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13514;
    }

    public void a(long l) {
        this.a = l;
    }

    public void a(byte by) {
        this.b = by;
    }

    public void a(String string) {
        this.c = string;
    }

    public void a(boolean bl) {
        this.e = bl;
    }
}

