/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csL
 */
public class csl_0
extends ps_0 {
    private long a;
    private int b;
    private int c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getInt();
        return false;
    }

    public long b() {
        return this.a;
    }

    @Override
    public int a() {
        return 12111;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }
}

