/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvg
 */
public class cvg_2
extends ps_0 {
    private byte[] a;
    private long b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = byteBuffer.getLong();
        this.a = new byte[byteBuffer.remaining()];
        byteBuffer.get(this.a);
        return true;
    }

    @Override
    public int a() {
        return 12218;
    }

    public byte[] b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }
}

