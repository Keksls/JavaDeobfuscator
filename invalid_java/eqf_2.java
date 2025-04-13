/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eqF
 */
class eqf_2
extends WY<WV> {
    final /* synthetic */ eqe_2 d;

    eqf_2(eqe_2 eqe_22, WV wV, int n) {
        this.d = eqe_22;
        super(wV, n);
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.d.k);
        byteBuffer.putInt(this.d.l);
        byteBuffer.putInt(this.d.m);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.d.k = byteBuffer.getInt();
        this.d.l = byteBuffer.getInt();
        this.d.m = byteBuffer.getInt();
    }

    @Override
    public int j() {
        return 12;
    }

    @Override
    public void b() {
        for (WX wX : eqe_2.a(this.d)) {
            wX.a(this);
        }
    }

    @Override
    public void a() {
    }
}

