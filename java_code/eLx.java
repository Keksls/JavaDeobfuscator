/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class eLx
extends fo_1 {
    final /* synthetic */ eLu d;

    eLx(eLu eLu2) {
        this.d = eLu2;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.d.b.i());
        byteBuffer.putLong(this.d.b.d());
        byteBuffer.put(this.d.b.e());
        byteBuffer.put(this.d.b.n());
        byteBuffer.put(this.d.b.j() ? (byte)1 : 0);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        if (this.d.b == null) {
            this.d.b = eLu.j.b();
        }
        this.d.b.a(byteBuffer.getLong());
        this.d.b.b(byteBuffer.getLong());
        this.d.b.a(byteBuffer.get());
        this.d.b.b(byteBuffer.get());
        this.d.b.a(byteBuffer.get() == 1);
    }

    @Override
    public int j() {
        return 19;
    }
}

