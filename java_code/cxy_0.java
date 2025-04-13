/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Arrays;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from cXy
 */
public class cxy_0
implements ahr_1 {
    private static final cxy_0 b = new cxy_0();
    protected static final Logger a = Logger.getLogger(cxy_0.class);

    public static cxy_0 a() {
        return b;
    }

    private cxy_0() {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 19646: {
                dga dga2 = (dga)adt_12;
                blx_1 blx_12 = dga2.k();
                if (blx_12 == null) {
                    return false;
                }
                this.a(dga2.o(), blx_12);
                return false;
            }
            case 18481: {
                Object object;
                dfZ dfZ2 = (dfZ)adt_12;
                blx_1 blx_13 = dfZ2.k();
                if (blx_13 == null) {
                    return false;
                }
                bjx_2 bjx_22 = dfZ2.o();
                fm_2 fm_22 = fk_2.i().a(bjx_22.c());
                if (bjx_22.e() == ft_1.b && (object = fgl.a.b((Integer)bjx_22.c())) != null) {
                    fm_22.b(object.d());
                }
                fk_2 fk_22 = fm_22.j();
                object = new cmn(blx_13.a_(), bjx_22.e(), !bjx_22.b(), fk_22);
                azu_0.j().K().c(object);
                if (azu_0.j().c(ddn.a())) {
                    int n = bjx_22.b() ? 0 : bjx_22.c();
                    ddn.a().a(n, blx_13.W_());
                }
                return false;
            }
            case 19732: {
                blx_1 blx_14 = (blx_1)((dfc)adt_12).j();
                if (blx_14 == null) {
                    return false;
                }
                if (blx_14.ak()) {
                    return false;
                }
                cmp cmp2 = new cmp();
                cmp2.a(blx_14.a_());
                boolean bl = ((dfc)adt_12).i();
                cmp2.a(!bl);
                azu_0.j().K().c(cmp2);
                return false;
            }
        }
        return true;
    }

    private void a(String string, bqv_1 bqv_12) {
        fis_1.a().a(string, (Object)bqv_12, cyt_0.a().f());
    }

    private void a(bjx_2 bjx_22, blx_1 blx_12) {
        ft_1 ft_12 = bjx_22.e();
        int n = bjx_22.c();
        this.a(blx_12, ft_12, n);
    }

    public void a(blx_1 blx_12, ft_1 ft_12, int n) {
        switch (ft_12) {
            case a: {
                fgb fgb2 = fgd.a.b(n);
                if (fgb2 == null) break;
                bqu_1 bqu_12 = new bqu_1();
                bqu_12.a(fgb2, blx_12.bv());
                this.a("mountPreview", bqu_12);
                break;
            }
            case b: {
                fgj fgj2 = fgl.a.b((Integer)n);
                if (fgj2 == null) break;
                bqu_1 bqu_13 = new bqu_1();
                bqu_13.a(fgj2);
                this.a("petPreview", bqu_13);
                break;
            }
            case f: 
            case d: {
                bqx_1 bqx_12 = this.a(blx_12, exh_2.p, exh_2.q, exh_2.r);
                bok_1.a(bqx_12, n, true);
                bqx_12.a();
                this.a("previewDialogActor", bqx_12);
                break;
            }
            case c: {
                bqx_1 bqx_13 = this.a(blx_12, exh_2.p, exh_2.q, exh_2.r);
                bqx_13.a(n);
                bqx_13.a((String)null);
                bqx_13.a();
                this.a("previewDialogActor", bqx_13);
                break;
            }
            case e: {
                bqx_1 bqx_14 = this.a(blx_12, exh_2.p, exh_2.q, exh_2.r);
                this.a("previewDialogActor", bqx_14);
                break;
            }
            case h: 
            case i: 
            case j: 
            case k: 
            case m: 
            case n: 
            case l: {
                bqx_1 bqx_15 = this.a(blx_12, exh_2.r);
                bqx_15.a((String)null);
                Optional<exh_2> optional = bol_1.g(ft_12);
                if (optional.isEmpty()) {
                    a.error((Object)("[COSMETIC] Trying to update preview with an unknown item : " + n + "on a slot that is not previewable : " + ft_12));
                    break;
                }
                exh_2 exh_22 = optional.get();
                exk_2 exk_23 = bhb_0.d().g(n);
                if (exk_23 == null) {
                    bqx_15.b(exh_22.a());
                    eyz_0 eyz_02 = blx_12.cG();
                    Optional<exk_2> optional2 = eZi.a(blx_12, eyz_02, exh_22);
                    optional2.ifPresent(exk_22 -> bqx_15.b((exk_2)exk_22, exh_22.a()));
                    this.a("previewDialogActor", bqx_15);
                    bqx_15.a();
                    break;
                }
                exh_2 exh_23 = exk_23.U().h()[0];
                bqx_15.b(exk_23, exh_23.a());
                this.a("previewDialogActor", bqx_15);
                bqx_15.a(exh_23);
                break;
            }
        }
        fis_1.a().a("cosmeticPreviewType", bol_1.d(ft_12));
    }

    private bqx_1 a(blx_1 blx_12, exh_2 ... exh_2Array) {
        bqx_1 bqx_12;
        bqv_1 bqv_12 = (bqv_1)fis_1.a().d("previewDialogActor", cyt_0.a().f());
        if (bqv_12 instanceof bqx_1) {
            bqx_12 = (bqx_1)bqv_12;
            bqx_12.a(Arrays.asList(exh_2Array));
        } else if (blx_12 instanceof bmr_1) {
            bqx_12 = new bqx_1();
            bqx_12.a((bmr_1)blx_12, blx_12.cG(), exh_2Array);
        } else {
            bqx_12 = bjb_1.a.c();
        }
        return bqx_12;
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        this.a("previewDialogActor", null);
        this.a("petPreview", null);
        this.a("mountPreview", null);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

