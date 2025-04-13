/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.Map;

/*
 * Renamed from QR
 */
class qr_0
extends fo_1 {
    final /* synthetic */ qq_0 d;

    qr_0(qq_0 qq_02) {
        this.d = qq_02;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        if (this.d.p == null) {
            byteBuffer.put((byte)0);
            return;
        }
        int n = this.d.p.size();
        if (n > 127) {
            a.error((Object)("Nombre d'actions " + n + " > 255"));
            return;
        }
        byteBuffer.put((byte)n);
        for (Map.Entry<Short, Integer> entry : this.d.p.entrySet()) {
            byteBuffer.putShort(entry.getKey());
            byteBuffer.putInt(entry.getValue());
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        throw new UnsupportedOperationException();
    }
}

