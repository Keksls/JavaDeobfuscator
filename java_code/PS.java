/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class PS
extends ps_0 {
    private Long a;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        return true;
    }

    public Long b() {
        return this.a;
    }

    @Override
    public int a() {
        return 627;
    }
}

