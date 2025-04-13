/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eqH
 */
class eqh_2
extends WY<WV> {
    private boolean e;
    final /* synthetic */ eqe_2 d;

    eqh_2(eqe_2 eqe_22, WV wV, int n) {
        this.d = eqe_22;
        super(wV, n);
        this.e = false;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.d.x);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        short s2 = byteBuffer.getShort();
        this.e = this.d.x != 0 && this.d.x != s2;
        this.d.x = s2;
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
        if (this.e) {
            for (WX wX : eqe_2.c(this.d)) {
                wX.a(this);
            }
        }
        this.e = false;
    }
}

