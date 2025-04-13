/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class bqL
extends ebc_0
implements bqK {
    public bqL(euw_1 euw_12) {
        super(euw_12);
    }

    @Override
    public void a(byte[] byArray) {
        this.e.j();
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        tv_0 tv_02 = this.e.f();
        vf_2 vf_22 = new vf_2();
        this.d.b(byteBuffer.getInt());
        while (byteBuffer.hasRemaining()) {
            vf_22.c();
            vf_22.b(byteBuffer);
            this.b((exk_2)tv_02.a(vf_22));
        }
    }

    public tr_0<exk_2> b() {
        return this.e;
    }
}

