/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cAp
extends ps_0 {
    private int a;
    private long b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getLong();
        return false;
    }

    public int b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    @Override
    public int a() {
        return 15501;
    }
}

