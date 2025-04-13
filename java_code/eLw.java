/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class eLw
extends fo_1 {
    final /* synthetic */ eLu d;

    eLw(eLu eLu2) {
        this.d = eLu2;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        String string = this.d.b.b();
        byte[] byArray = Cz.a(string);
        if (byArray.length > 32) {
            return;
        }
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        if (this.d.b == null) {
            this.d.b = eLu.j.b();
        }
        byte by = byteBuffer.get();
        byte[] byArray = new byte[by];
        byteBuffer.get(byArray);
        this.d.b.a(Cz.a(byArray));
    }

    @Override
    public int j() {
        byte[] byArray = Cz.a(this.d.b.b());
        int n = 1 + byArray.length;
        return n;
    }
}

