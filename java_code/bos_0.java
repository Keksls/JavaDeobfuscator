/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;

/*
 * Renamed from bOS
 */
public class bos_0
implements Predicate<bph_0> {
    private blx_1 a;

    public bos_0() {
    }

    public bos_0(blx_1 blx_12) {
        this.a = blx_12;
    }

    public boolean a(bph_0 bph_02) {
        if (bph_02 == null) {
            return true;
        }
        apc_2 apc_22 = bph_02.t();
        if (apc_22 == null) {
            return true;
        }
        blx_1 blx_12 = this.a;
        if (blx_12 == null) {
            bmk_1 bmk_12 = dcX.a.j();
            blx_12 = bmk_12 == null ? azu_0.j().k() : bmk_12.l();
        }
        return apc_22.b(blx_12, blx_12, this, blx_12.bz());
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((bph_0)object);
    }
}

