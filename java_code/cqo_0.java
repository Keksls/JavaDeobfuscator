/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cqo
 */
public class cqo_0
extends Pw {
    private int a;
    private int b;
    private boolean c;

    public void b(int n) {
        this.a = n;
    }

    public void c(int n) {
        this.b = n;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putInt(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.put(this.c ? (byte)1 : 0);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13657;
    }
}

