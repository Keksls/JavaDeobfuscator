/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from czS
 */
public class czs_1
extends Pw {
    private int a;
    private byte b;

    public void b(int n) {
        this.a = n;
    }

    public void a(byte by) {
        this.b = by;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(5);
        byteBuffer.putInt(this.a);
        byteBuffer.put(this.b);
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int a() {
        return 14579;
    }
}

