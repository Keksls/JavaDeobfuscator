/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eqG
 */
class eqg_2
extends WY<WV> {
    final /* synthetic */ eqe_2 d;

    eqg_2(eqe_2 eqe_22, WV wV, int n) {
        this.d = eqe_22;
        super(wV, n);
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.d.g);
        byteBuffer.putInt(this.d.h);
        byteBuffer.putInt(this.d.i);
        byteBuffer.putShort(this.d.j);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.d.g = byteBuffer.getLong();
        this.d.h = byteBuffer.getInt();
        this.d.i = byteBuffer.getInt();
        this.d.j = byteBuffer.getShort();
    }

    @Override
    public int j() {
        return 12;
    }

    @Override
    public void b() {
        for (WX wX : eqe_2.b(this.d)) {
            wX.a(this);
        }
    }

    @Override
    public void a() {
    }
}

