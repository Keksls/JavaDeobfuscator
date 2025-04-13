/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class csd
extends ps_0 {
    private int a;
    private boolean b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.get() == 0;
        return true;
    }

    @Override
    public int a() {
        return 13154;
    }

    public int b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }
}

