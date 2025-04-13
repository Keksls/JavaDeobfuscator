/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpn
 */
public class cpn_0
extends cpf_0 {
    private mk_0 a;

    @Override
    protected void a(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.a = mk_0.a(byArray);
    }

    @Override
    public int a() {
        return 12026;
    }

    public mk_0 b() {
        return this.a;
    }
}

