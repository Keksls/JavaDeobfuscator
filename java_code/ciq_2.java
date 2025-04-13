/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ciq
 */
final class ciq_2
extends chd_1<ctg_2, bvx_2> {
    ciq_2() {
    }

    @Override
    public boolean a(ctg_2 ctg_22) {
        blx_1 blx_12 = (blx_1)((bvx_2)this.a).n(ctg_22.b());
        if (blx_12 == null) {
            return false;
        }
        blx_12.gh().a(ByteBuffer.wrap(ctg_22.c()));
        return false;
    }
}

