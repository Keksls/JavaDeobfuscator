/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from clB
 */
public class clb_1
extends Pw {
    private int a;

    @Override
    public byte[] b() {
        byte[] byArray = new byte[4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byteBuffer.putInt(this.a);
        return this.a((byte)3, byArray);
    }

    @Override
    public int a() {
        return 12753;
    }

    public void b(int n) {
        this.a = n;
    }
}

