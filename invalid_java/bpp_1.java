/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bpp
 */
public abstract class bpp_1
extends ean_0 {
    protected final fii a;
    protected final int b;
    private final boolean i;

    bpp_1(int n, byte by, apc_2 apc_22, boolean bl, fii fii2, int n2, long l, boolean bl2, boolean bl3, boolean bl4) {
        super(n, by, apc_22, bl, bl3, l, bl4);
        this.a = fii2;
        this.b = n2;
        this.i = bl2;
    }

    public void a(bmv_1 bmv_12) {
        if (this.i) {
            azu_0.j().k().do().a(this.g);
        }
    }

    public boolean b(bmv_1 bmv_12) {
        bmr_1 bmr_12 = azu_0.j().k();
        blx_1 blx_12 = this.f ? bmv_12 : bmr_12;
        blx_1 blx_13 = this.f ? bmr_12 : bmv_12;
        return this.e == null || this.e.b(blx_12, blx_13, this, blx_12.Q_());
    }

    public fii a() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    protected void a(long l) {
        cmb cmb2 = new cmb(l, this);
        azu_0.j().K().c(cmb2);
        this.c();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("Pas de d\u00e9s\u00e9rialization dans le Client");
    }
}

