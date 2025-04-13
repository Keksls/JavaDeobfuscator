/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class PA
extends ps_0 {
    private byte a;

    @Override
    public boolean a(byte[] byArray) {
        if (!this.a(byArray.length, 1, true)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        return true;
    }

    public byte b() {
        return this.a;
    }

    @Override
    public int a() {
        return 356;
    }
}

