/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class coV
extends cpf_0 {
    private ne a;

    @Override
    protected void a(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.a = ne.a(byArray);
    }

    @Override
    public int a() {
        return 12277;
    }

    public ne b() {
        return this.a;
    }
}

