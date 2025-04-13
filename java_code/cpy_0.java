/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpy
 */
public class cpy_0
extends Pw {
    private int a;

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(6);
        byteBuffer.putInt(this.a);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12947;
    }

    public void b(int n) {
        this.a = n;
    }
}

