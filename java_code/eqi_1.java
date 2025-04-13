/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eqI
 */
class eqi_1
extends WY<WV> {
    private boolean e;
    final /* synthetic */ eqe_2 d;

    eqi_1(eqe_2 eqe_22, WV wV, int n) {
        this.d = eqe_22;
        super(wV, n);
        this.e = false;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.put((byte)(this.d.o ? 1 : 0));
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        boolean bl = byteBuffer.get() == 1;
        this.e = this.d.o != bl;
        this.d.o = bl;
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
        if (this.e) {
            for (WX wX : eqe_2.d(this.d)) {
                wX.a(this);
            }
        }
        this.e = false;
    }
}

