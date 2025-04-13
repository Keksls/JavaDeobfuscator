/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class csc
extends ps_0 {
    private boolean a;
    private long b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get() == 1;
        this.b = byteBuffer.getLong();
        return true;
    }

    public boolean b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    @Override
    public int a() {
        return 13124;
    }
}

