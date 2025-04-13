/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

final class ePZ
extends ePX {
    ePZ(epl_0 epl_02) {
        super(epl_02);
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.d.h());
        aff_1 aff_12 = this.d.g();
        byteBuffer.putInt(aff_12.d());
        byteBuffer.putInt(aff_12.e());
        byteBuffer.putShort(aff_12.f());
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.d.d(byteBuffer.getLong());
        aff_1 aff_12 = new aff_1(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getShort());
        this.d.a(aff_12);
    }

    @Override
    public int j() {
        return 18;
    }
}

