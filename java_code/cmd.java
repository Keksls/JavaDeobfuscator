/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cmd
extends Pw {
    private int a;
    private int b;
    private float c;
    private float e;

    public void a(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public void a(float f2, float f3) {
        this.c = f2;
        this.e = f3;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(16);
        byteBuffer.putInt(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.putFloat(this.c);
        byteBuffer.putFloat(this.e);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13057;
    }
}

