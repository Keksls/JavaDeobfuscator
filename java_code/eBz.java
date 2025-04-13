/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class eBz
implements Uo {
    private static final Logger a = Logger.getLogger(eBz.class);
    private final eBt b;

    public eBz(eBt eBt2) {
        this.b = eBt2;
    }

    @Override
    public void a(Uk uk) {
        if (!(uk instanceof um_0)) {
            return;
        }
        um_0 um_02 = (um_0)uk;
        ul_0 ul_02 = uk.b();
        switch (ul_02) {
            case a: 
            case b: {
                this.b(um_02.c());
                break;
            }
            case c: 
            case d: {
                this.a(um_02.c());
                break;
            }
            case e: {
                break;
            }
            case f: {
                break;
            }
            case g: {
                break;
            }
            case h: {
                break;
            }
        }
    }

    private void a(ts_0 ts_02) {
        this.a(ts_02, false);
        if (ts_02 instanceof exk_2) {
            ((exk_2)ts_02).P();
        }
    }

    private void b(ts_0 ts_02) {
        this.a(ts_02, true);
        if (ts_02 instanceof exk_2) {
            ((exk_2)ts_02).P();
        }
    }

    private void a(ts_0 ts_02, boolean bl) {
        if (!(ts_02 instanceof exk_2)) {
            return;
        }
        exk_2 exk_22 = (exk_2)ts_02;
        if (!exk_22.aU_()) {
            return;
        }
        exq_2 exq_22 = this.b.h();
        ezr_0<?> ezr_02 = exk_22.T();
        if (ezr_02 == null) {
            return;
        }
        exq_1<?> exq_12 = ezr_02.F();
        if (exq_12 == null) {
            return;
        }
        exk_2 exk_23 = exk_22.t();
        exk_22.b(exk_23);
        for (exh_2 exh_22 : exq_12.j()) {
            if (bl) {
                try {
                    exq_22.b(exk_23, exh_22.a());
                }
                catch (uz_0 uz_02) {
                    a.error((Object)"Exception levee", (Throwable)uz_02);
                }
                catch (Uy uy) {
                    a.error((Object)"Exception levee", (Throwable)uy);
                }
                catch (uc_0 uc_02) {
                    a.error((Object)"Exception levee", (Throwable)uc_02);
                }
                continue;
            }
            exq_22.b(exh_22.a());
        }
    }
}

