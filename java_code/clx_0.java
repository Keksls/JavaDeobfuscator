/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from clX
 */
public class clx_0
extends ps_0 {
    private long a;
    private byte b;
    private boolean c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.get();
        this.c = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int a() {
        return 13652;
    }

    public long b() {
        return this.a;
    }

    public byte c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }
}

