/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class coE
extends cpf_0 {
    private mq_0 a;
    private faK b;

    @Override
    protected void a(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.a = mq_0.a(byArray);
        this.b = faK.a(byteBuffer.get());
    }

    @Override
    public int a() {
        return 12781;
    }

    public mq_0 b() {
        return this.a;
    }

    public faK c() {
        return this.b;
    }
}

