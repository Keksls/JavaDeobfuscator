/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class eLC
extends fo_1 {
    final /* synthetic */ eLu d;

    eLC(eLu eLu2) {
        this.d = eLu2;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        String string = this.d.b.c();
        byte[] byArray = Cz.a(string);
        byteBuffer.put((byte)byArray.length);
        byteBuffer.put(byArray);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        short s2;
        if (this.d.b == null) {
            this.d.b = eLu.j.b();
        }
        if ((s2 = (short)byteBuffer.get()) < 0) {
            s2 = (short)(s2 + 256);
        }
        byte[] byArray = new byte[s2];
        byteBuffer.get(byArray);
        this.d.b.b(Cz.a(byArray));
    }

    @Override
    public int j() {
        int n = 0;
        byte[] byArray = Cz.a(this.d.b.c());
        return n += 1 + byArray.length;
    }
}

