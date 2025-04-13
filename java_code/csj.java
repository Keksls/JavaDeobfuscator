/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class csj
extends ps_0 {
    private eBt a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = eBv.b(byteBuffer);
        return true;
    }

    public eBt b() {
        return this.a;
    }

    @Override
    public int a() {
        return 12819;
    }
}

