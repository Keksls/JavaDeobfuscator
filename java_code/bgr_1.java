/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bGR
 */
public class bgr_1
extends bgn_1 {
    eEw a;
    private final fo_1 b = new bgs_1(this);

    public bgr_1(bbg_1 bbg_12, String string, int n) {
        super(bbg_12, string);
        if (n != 0) {
            this.a(exh_2.r.A, n);
        }
    }

    @Override
    public fo_1 f() {
        return this.b;
    }

    @Override
    public eaa_0 e() {
        return this.a;
    }

    public void a(ByteBuffer byteBuffer) {
        boolean bl = byteBuffer.get() == 1;
        this.a = bl ? eEw.b(byteBuffer) : null;
        this.b().u();
    }
}

