/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class coQ
extends cpf_0 {
    private mu_0 a;

    @Override
    protected void a(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.a = mu_0.a(byArray);
    }

    @Override
    public int a() {
        return 13883;
    }

    public mu_0 b() {
        return this.a;
    }
}

