/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class QD
extends ps_0 {
    private long a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 1194;
    }

    public long b() {
        return this.a;
    }
}

