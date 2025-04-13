/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crC
 */
public class crc_0
extends ps_0 {
    private int a;
    private long b;
    private boolean c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.get() != 0;
        return true;
    }

    @Override
    public int a() {
        return 12699;
    }

    public int b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }
}

