/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eLT
 */
class elt_0
extends fo_1 {
    final /* synthetic */ els_0 d;

    elt_0(els_0 els_02) {
        this.d = els_02;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byte[] byArray = this.d.P().e();
        byteBuffer.putShort((short)byArray.length);
        byteBuffer.put(byArray);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        byte[] byArray = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray);
        this.d.c(byArray);
    }

    @Override
    public int j() {
        return 2 + this.d.P().B();
    }
}

