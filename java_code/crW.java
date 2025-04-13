/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crW
extends ps_0 {
    private long a;
    private byte[] b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        int n = byteBuffer.getInt();
        this.b = new byte[n];
        byteBuffer.get(this.b);
        return true;
    }

    @Override
    public int a() {
        return 12519;
    }

    public long b() {
        return this.a;
    }

    public byte[] c() {
        return this.b;
    }
}

