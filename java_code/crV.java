/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crV
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
        return true;
    }

    @Override
    public int a() {
        return 12242;
    }

    public long b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }
}

