/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eqJ
 */
class eqj_1
extends WY<WV> {
    private boolean e;
    final /* synthetic */ eqe_2 d;

    eqj_1(eqe_2 eqe_22, WV wV, int n) {
        this.d = eqe_22;
        super(wV, n);
        this.e = false;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.put((byte)(this.d.p ? 1 : 0));
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        boolean bl = byteBuffer.get() == 1;
        this.e = this.d.p != bl;
        this.d.p = bl;
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
        if (this.e) {
            for (WX wX : eqe_2.e(this.d)) {
                wX.a(this);
            }
        }
        this.e = false;
    }
}

