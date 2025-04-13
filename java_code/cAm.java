/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cAm
extends ps_0 {
    private byte[] a;
    private byte[] b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.a);
        this.b = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.b);
        return false;
    }

    public byte[] b() {
        return this.a;
    }

    public byte[] c() {
        return this.b;
    }

    @Override
    public int a() {
        return 14820;
    }
}

