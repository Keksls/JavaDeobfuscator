/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class PZ
extends ps_0 {
    private byte a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        return true;
    }

    public byte b() {
        return this.a;
    }

    @Override
    public int a() {
        return 721;
    }
}

