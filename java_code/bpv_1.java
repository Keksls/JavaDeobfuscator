/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bpv
 */
class bpv_1
extends bpp_1 {
    bpv_1(int n, byte by, apc_2 apc_22, boolean bl, fii fii2, int n2, long l, boolean bl2, boolean bl3, boolean bl4) {
        super(n, by, apc_22, bl, fii2, n2, l, bl2, bl3, bl4);
    }

    @Override
    public void a(bmv_1 bmv_12) {
        super.a(bmv_12);
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 != null && !bmr_12.a(false, true)) {
            return;
        }
        this.a(bmv_12.a_());
        cfb_1.a.a(new bpz_2(ddZ.d()));
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public void c() {
    }
}

