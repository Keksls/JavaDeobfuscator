/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cBg
extends ps_0 {
    private fgZ a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.remaining() > 0 ? new fgZ(byteBuffer) : null;
        return true;
    }

    @Override
    public int a() {
        return 14003;
    }

    public fgZ b() {
        return this.a;
    }
}

