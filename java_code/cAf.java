/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cAf
extends Pw {
    private int a;
    private int b;
    private int c;

    public void b(int n) {
        this.a = n;
    }

    public void c(int n) {
        this.b = n;
    }

    public void d(int n) {
        this.c = n;
    }

    @Override
    public byte[] b() {
        byte[] byArray = new byte[12];
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byteBuffer.putInt(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.putInt(this.c);
        return this.a((byte)6, byArray);
    }

    @Override
    public int a() {
        return 15573;
    }
}

