/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bpr
 */
class bpr_1
extends bpp_1 {
    private static final Logger i = Logger.getLogger(bpr_1.class);

    bpr_1(int n, byte by, apc_2 apc_22, boolean bl, fii fii2, int n2, long l, boolean bl2, boolean bl3, boolean bl4) {
        super(n, by, apc_22, bl, fii2, n2, l, bl2, bl3, bl4);
    }

    @Override
    public void a(bmv_1 bmv_12) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (!emj_0.b.a(new emh_0[]{bmr_12})) {
            i.error((Object)"Impossible pour un joueur non abonn\u00e9 de d\u00e9marrer une action de dialogue");
            return;
        }
        super.a(bmv_12);
        this.a(bmv_12.a_());
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

