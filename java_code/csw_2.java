/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csW
 */
public class csw_2
extends ps_0 {
    private long a;
    private long b;
    private boolean c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int a() {
        return 12970;
    }

    public long b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }
}

