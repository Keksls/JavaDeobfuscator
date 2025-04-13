/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cso
 */
public final class cso_0
extends ps_0 {
    private byte[] a;
    private byte[] b;
    private byte[] c;

    public byte[] b() {
        return this.b;
    }

    public byte[] c() {
        return this.c;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.a);
        this.b = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.b);
        this.c = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.c);
        return false;
    }

    public byte[] d() {
        return this.a;
    }

    @Override
    public int a() {
        return 12073;
    }
}

