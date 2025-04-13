/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class bOI
extends erd_2 {
    protected static final Logger a = Logger.getLogger(bOI.class);

    public bOI() {
    }

    @Override
    public erd_2 b() {
        return new bOI();
    }

    public bOI(short s2, String string, int n, short s3, epq_2 epq_22, int n2, fiz<fio_0> fiz2) {
        super(s2, string, n, s3, epq_22, n2, fiz2);
    }

    public bOI a(short s2, String string, int n, short s3, epq_2 epq_22, int n2, fiz<fio_0> fiz2) {
        return new bOI(s2, string, n, s3, epq_22, n2, fiz2);
    }

    public bOI(short s2, tv_0<fio_0, yt_2> tv_02, tt_0<fio_0> tt_02, boolean bl, boolean bl2, boolean bl3) {
        super(s2, tv_02, tt_02, bl, bl2, bl3);
    }

    @Override
    public erd_2 b(short s2, tv_0<fio_0, yt_2> tv_02, tt_0<fio_0> tt_02, boolean bl, boolean bl2, boolean bl3) {
        return new bOI(s2, tv_02, tt_02, bl, bl2, bl3);
    }

    @Override
    public void a(epq_2 epq_22, epq_2 epq_23) {
        super.a(epq_22, epq_23);
        this.a((bmv_1)epq_22, (blx_1)epq_23);
    }

    public void a(bmv_1 bmv_12, blx_1 blx_12) {
        bOF.a(bmv_12, blx_12, this.n(), this.f());
    }

    @Override
    protected void a(epq_2 epq_22) {
        super.a(epq_22);
        bmv_1 bmv_12 = (bmv_1)epq_22;
        bpa_0 bpa_02 = bmv_12.cJ();
        if (bpa_02 == null || this.b == null) {
            return;
        }
        for (fio_0 fio_02 : this.b) {
            bpl_0 bpl_02 = ((bpl_0)fio_02).a((epq_2)bmv_12);
            bpa_02.a(bpl_02);
        }
    }

    public void a(epq_2 epq_22, yx_2 yx_22) {
        fiz<? extends fio_0> fiz2 = epq_22.aZ();
        if (fiz2 == null) {
            return;
        }
        for (yy_1 yy_12 : yx_22.a) {
            bpl_0 bpl_02 = new bpl_0(epq_22);
            bpl_02.b(yy_12.a);
            try {
                ((uf_0)fiz2).a(bpl_02);
            }
            catch (uz_0 uz_02) {
                a.error((Object)"InventoryCapacityReachedException lors de l'initialisation des sorts d'un double : ", (Throwable)uz_02);
            }
            catch (Uy uy) {
                a.error((Object)"ContentAlreadyPresentException lors de l'initialisation des sorts d'un double : ", (Throwable)uy);
            }
        }
    }

    public /* synthetic */ erd_2 b(short s2, String string, int n, short s3, epq_2 epq_22, int n2, fiz fiz2) {
        return this.a(s2, string, n, s3, epq_22, n2, fiz2);
    }
}

