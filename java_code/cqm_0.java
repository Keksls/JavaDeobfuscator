/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqm
 */
public class cqm_0
extends Pw {
    private int a;
    private int b;
    private byte c;

    public void a(int n, fgo_0 fgo_02, int n2) {
        this.a = n;
        this.c = fgo_02.d;
        this.b = n2;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putInt(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.put(this.c);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12460;
    }
}

