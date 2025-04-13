/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

class WW
extends WY<WV> {
    private byte[] e;
    final /* synthetic */ WV d;

    WW(WV wV, WV wV2) {
        this.d = wV;
        super(wV2);
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.d.c);
        byteBuffer.putLong(this.d.d);
        byteBuffer.put((byte)this.e.length);
        byteBuffer.put(this.e);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.d.c = byteBuffer.getLong();
        this.d.d = byteBuffer.getLong();
        this.e = new byte[byteBuffer.get() & 0xFF];
        byteBuffer.get(this.e);
        this.d.e = Cz.a(this.e);
    }

    @Override
    public int j() {
        this.e = Cz.a(this.d.e);
        return 21 + this.e.length;
    }

    @Override
    public void b() {
        for (WX wX : this.d.b) {
            wX.a(this);
        }
    }

    @Override
    public void a() {
    }
}

