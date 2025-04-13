/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class PU
extends ps_0 {
    private boolean a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get() != 0;
        return true;
    }

    public boolean b() {
        return this.a;
    }

    @Override
    public int a() {
        return 796;
    }
}

