/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from brC
 */
class brc_2
implements ebv_0 {
    private final brx_0 a;

    brc_2(brx_0 brx_02) {
        this.a = brx_02;
    }

    @Override
    public void a(@NotNull ect_0 ect_02) {
        this.a.b(ect_02.a());
    }

    @Override
    public void a(int n, long l) {
        brt_1 brt_12 = this.a.a(n);
        if (brt_12 instanceof brg_1) {
            long l2 = this.a.l().i(n);
            int n2 = ecu_0.c(l2) - ecu_0.c(l2 - l);
            if (n2 == 0) {
                ((brg_1)brt_12).x();
            } else {
                ((brg_1)brt_12).y();
            }
        }
    }

    @Override
    public void a(int n, int n2) {
        brt_1 brt_12 = this.a.a(n);
        if (brt_12 instanceof brg_1) {
            ((brg_1)brt_12).w();
        }
    }

    @Override
    public void a(int n) {
        brt_1 brt_12 = this.a.a(n);
        if (brt_12 instanceof brg_1) {
            ((brg_1)brt_12).v();
        }
    }
}

