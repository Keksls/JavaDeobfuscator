/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

final class ePP
extends ePX {
    ePP(epl_0 epl_02) {
        super(epl_02);
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        if (!(this.d instanceof epk_0)) {
            return;
        }
        eBt eBt2 = ((epk_0)this.d).b();
        byteBuffer.put(eBv.b(eBt2));
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        if (!(this.d instanceof epk_0)) {
            return;
        }
        eBt eBt2 = eBv.b(byteBuffer);
        ((epk_0)this.d).a(eBt2);
    }

    @Override
    public int j() {
        return eBv.a(((epk_0)this.d).b());
    }
}

