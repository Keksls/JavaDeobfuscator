/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cAM
 */
public class cam_0
extends ps_0 {
    private long a;
    private long b;
    private long c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        return true;
    }

    public long b() {
        return this.c;
    }

    public long c() {
        return this.b;
    }

    public long d() {
        return this.a;
    }

    @Override
    public int a() {
        return 14588;
    }
}

