/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from QS
 */
class qs_0
extends fo_1 {
    static final /* synthetic */ boolean d;
    final /* synthetic */ qq_0 e;

    qs_0(qq_0 qq_02) {
        this.e = qq_02;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.e.d);
        byteBuffer.putInt(this.e.a);
        byteBuffer.putInt(this.e.b);
        byteBuffer.putShort(this.e.c);
        byte[] byArray = Cz.a(this.e.m);
        if (!d && byArray.length >= 65535) {
            throw new AssertionError((Object)"chaine des parametres trop longue");
        }
        byteBuffer.putShort((short)(byArray.length & 0xFFFF));
        byteBuffer.put(byArray);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int j() {
        return 14 + Cz.a(this.e.m).length;
    }

    static {
        d = !qq_0.class.desiredAssertionStatus();
    }
}

