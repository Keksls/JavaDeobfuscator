/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class coB
extends cpf_0 {
    private mu_0 a;
    private faK b;

    @Override
    protected void a(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.a = mu_0.a(byArray);
        this.b = faK.a(byteBuffer.get());
    }

    @Override
    public int a() {
        return 13409;
    }

    public mu_0 b() {
        return this.a;
    }

    public faK c() {
        return this.b;
    }
}

