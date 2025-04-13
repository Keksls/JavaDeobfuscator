/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class coO
extends cpf_0 {
    private mq_0 a;

    @Override
    protected void a(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.a = mq_0.a(byArray);
    }

    @Override
    public int a() {
        return 12754;
    }

    public mq_0 b() {
        return this.a;
    }
}

