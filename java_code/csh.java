/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class csh
extends ps_0 {
    private int a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        return false;
    }

    public int b() {
        return this.a;
    }

    @Override
    public int a() {
        return 13294;
    }
}

