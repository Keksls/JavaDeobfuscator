/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cAo
extends ps_0 {
    private int a;
    private byte[] b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = new byte[byteBuffer.getInt()];
        return false;
    }

    public int b() {
        return this.a;
    }

    public byte[] c() {
        return this.b;
    }

    @Override
    public int a() {
        return 14299;
    }
}

