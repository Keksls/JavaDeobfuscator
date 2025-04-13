/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyc
 */
public class cyc_2
extends Pw {
    private int a;

    @Override
    public byte[] b() {
        int n = 4;
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.a);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12635;
    }

    public int c() {
        return this.a;
    }

    public void b(int n) {
        this.a = n;
    }
}

