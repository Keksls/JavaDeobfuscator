/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class eQS
implements eqw_0 {
    private erl_1 a;

    eQS() {
    }

    eQS(erl_1 erl_12) {
        this.a = erl_12;
    }

    @Override
    public byte[] a() {
        return eQw.a(this.a);
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.a = eQw.d(byteBuffer);
    }

    @Override
    public void a(eQk eQk2) {
        eQk2.a(this.a);
    }

    @Override
    public eqy_0 b() {
        return eqy_0.a;
    }

    public String toString() {
        return "AddMemberChange{m_member=" + this.a + "}";
    }
}

