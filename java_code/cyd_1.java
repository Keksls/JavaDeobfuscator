/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyD
 */
public class cyd_1
extends ps_0 {
    private long a;
    private byte b;
    private int c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.get();
        this.c = byteBuffer.getInt();
        return false;
    }

    public long b() {
        return this.a;
    }

    public byte c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    @Override
    public int a() {
        return 12401;
    }
}

