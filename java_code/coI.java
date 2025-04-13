/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class coI
extends cpf_0 {
    private long a;

    @Override
    protected void a(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getLong();
    }

    @Override
    public int a() {
        return 13133;
    }

    public long b() {
        return this.a;
    }
}

