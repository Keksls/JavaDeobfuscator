/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwo
 */
public class cwo_1
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

    @Override
    public int a() {
        return 12299;
    }

    public long b() {
        return this.b;
    }

    public long c() {
        return this.a;
    }

    public long d() {
        return this.c;
    }
}

