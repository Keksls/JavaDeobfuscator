/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import org.apache.log4j.Logger;

/*
 * Renamed from cfk
 */
public class cfk_2
implements ahr_1 {
    private static final boolean c = false;
    public static final Comparator<bsc_1> a = Comparator.comparing(bsc_1::c);
    protected static final Logger b = Logger.getLogger(cfk_2.class);
    private static final cfk_2 d = new cfk_2();

    public static cfk_2 a() {
        return d;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 12023: {
                b.info((Object)"[PERSONAL_SPACE_UPDATE_MESSAGE] : Mise \u00e0 jour du sac dimensionnel du propri\u00e9taire");
                bmr_1 bmr_12 = azu_0.j().k();
                bsx_2 bsx_22 = bmr_12.di();
                if (bsx_22 != null) {
                    bsx_22.a(((cwy_1)adt_12).b());
                }
                return false;
            }
            case 12788: {
                cxk_1 cxk_12 = (cxk_1)adt_12;
                bmr_1 bmr_13 = azu_0.j().k();
                bmr_1 bmr_14 = (bmr_1)euu_2.c(bmr_13.U_(), cxk_12.b());
                if (bmr_14 == null) {
                    b.error((Object)("Unable to find gem owner for item " + cxk_12.b()));
                    return false;
                }
                bHi bHi2 = bmr_14.da();
                exg_2 exg_22 = bHi2.f(cxk_12.b());
                if (exg_22 != null) {
                    exk_2 exk_22 = exg_22.c(cxk_12.b());
                    bsx_2 bsx_23 = bmr_13.dj();
                    ffj ffj2 = bsx_23.b(cxk_12.c(), true) != null ? bsx_23.a(cxk_12.c(), exk_22, exg_22.f(), true) : bsx_23.b(cxk_12.c(), exk_22, exg_22.f(), true);
                    if (ffj2 == ffj.a) {
                        bsx_23.a(cxk_12.c());
                    } else {
                        b.error((Object)"DIMENSIONAL_BAG_INVENTORY_TO_ROOM_GEM_EXCHANGE failed!");
                    }
                } else {
                    b.error((Object)("Gemme introuvable dans l'inventaire du client : " + cxk_12.b()));
                }
                return false;
            }
            case 13775: {
                cxl_1 cxl_12 = (cxl_1)adt_12;
                bmr_1 bmr_15 = azu_0.j().k();
                bsx_2 bsx_24 = bmr_15.dj();
                ffj ffj3 = bsx_24.a(cxl_12.b(), cxl_12.d(), cxl_12.e(), cxl_12.c(), true);
                if (ffj3 != ffj.a) {
                    b.error((Object)"DIMENSIONAL_BAG_ROOM_TO_INVENTORY_GEM_EXCHANGE failed!");
                } else {
                    bsx_24.a(cxl_12.b());
                }
                return false;
            }
            case 13748: {
                cxm_1 cxm_12 = (cxm_1)adt_12;
                bmr_1 bmr_16 = azu_0.j().k();
                bsx_2 bsx_25 = bmr_16.dj();
                ffj ffj4 = bsx_25.a(cxm_12.d(), cxm_12.b(), cxm_12.e(), cxm_12.c(), true);
                if (ffj4 != ffj.a) {
                    b.error((Object)"DIMENSIONAL_BAG_ROOMS_GEMS_EXCHANGE_RESULT failed!");
                } else {
                    bsx_25.a(cxm_12.d());
                    bsx_25.a(cxm_12.e());
                }
                return false;
            }
            case 12751: {
                cxn_1 cxn_12 = (cxn_1)adt_12;
                zs_1 zs_12 = cxn_12.b();
                this.a(zs_12);
                return false;
            }
            case 13172: {
                fis_1.a().a("showRoomBagDetails", false);
                azu_0.j().b(dao.d());
                if (fpm_0.b().q("splitStackDialog")) {
                    fpm_0.b().o("splitStackDialog");
                }
                return false;
            }
            case 12555: {
                cxi_1 cxi_12 = (cxi_1)adt_12;
                long l = cxi_12.b();
                byte[] byArray = cxi_12.c();
                bmr_1 bmr_17 = azu_0.j().k();
                bsx_2 bsx_26 = bmr_17.di();
                if (bsx_26 != null && bsx_26.q() == l) {
                    ud_2 ud_22 = new ud_2();
                    ud_22.b(ByteBuffer.wrap(byArray));
                    bsx_26.a(ud_22);
                    if (azu_0.j().c(cXC.a())) {
                        azu_0.j().b(cXC.a());
                    }
                }
                return false;
            }
            case 12596: {
                cxg_1 cxg_12 = (cxg_1)adt_12;
                long l = cxg_12.b();
                dw_1 dw_12 = cxg_12.c();
                bmr_1 bmr_18 = azu_0.j().k();
                bsx_2 bsx_27 = bmr_18.di();
                if (bsx_27 != null && bsx_27.q() == l) {
                    bnh_1 bnh_12 = bsx_27.r();
                    ece_0 ece_02 = bnh_12.eX();
                    ece_02.a(dw_12);
                }
                if (azu_0.j().c(cXC.a())) {
                    cXC.e();
                    cXC.a().j();
                    fpm_0.b().a(bae.h().a("craft.secured.fee.changed", new Object[0]), cfn_0.a(7), 2L, 102, 1);
                    aUh.b("craft.secured.fee.changed", new Object[0]);
                }
                return false;
            }
            case 12101: {
                csb_0 csb_02 = (csb_0)adt_12;
                long l = csb_02.b();
                bmr_1 bmr_19 = azu_0.j().k();
                if (bmr_19.U_() == l) {
                    return false;
                }
                bsx_2 bsx_28 = bmr_19.di();
                if (bsx_28 == null) {
                    return false;
                }
                ebu_0 ebu_02 = new ebu_0();
                ebu_02.a(csb_02.c());
                bgg.a.a(l, ebu_02);
                return false;
            }
            case 13208: {
                Object object;
                csz_1 csz_12 = (csz_1)adt_12;
                if (Cz.f(csz_12.e())) {
                    b.error((Object)"A craft notification has been received but the player name is missing.");
                    return false;
                }
                eco_0 eco_02 = csz_12.c();
                String string = bae.h().a(15, (long)eco_02.k().a(), new Object[0]);
                if (csz_12.d()) {
                    object = bgg.a.b();
                    object.c(eco_02.p());
                }
                object = csz_12.d() ? bae.h().a("craft.secured.notification.success", string, csz_12.e()) : bae.h().a("craft.secured.notification.failure", string, csz_12.e());
                aul_0.a().c((String)object);
                return false;
            }
            case 12255: {
                cwv_1 cwv_12 = (cwv_1)adt_12;
                if (cwv_12.b() == 0) {
                    // empty if block
                }
                return false;
            }
            case 13534: {
                cxr_1 cxr_12 = (cxr_1)adt_12;
                return false;
            }
            case 12175: {
                cxd_1 cxd_12 = (cxd_1)adt_12;
                return false;
            }
        }
        return true;
    }

    private void a(zs_1 zs_12) {
        abq_2<bsc_1> abq_22 = new abq_2<bsc_1>(a);
        for (int k = 0; k < zs_12.a.size(); ++k) {
            zt_1 zt_12 = zs_12.a.get(k);
            long l = zt_12.a;
            String string = zt_12.c;
            long l2 = zt_12.e;
            ArrayList<zu_1> arrayList = zt_12.d;
            wt_0 wt_02 = wt_0.b(l);
            wt_02.d();
            bsc_1 bsc_12 = abq_22.b();
            if (bsc_12 == null || !bsc_12.c().equals(wt_02)) {
                bsc_12 = new bsc_1(wt_02);
                abq_22.add(bsc_12);
            }
            bse_1 bse_12 = new bse_1(wt_0.b(l), string, l2);
            for (zu_1 zu_12 : arrayList) {
                bse_12.a(zu_12.a, zu_12.b);
            }
            bsc_12.a(bse_12);
        }
        bsw_2 bsw_22 = new bsw_2(abq_22);
        cXT.a().a(bsw_22);
        azu_0.j().a(cXT.a());
    }

    private void a(abq_2<bsc_1> abq_22) {
        int n = 200;
        int n2 = 10;
        boolean bl = false;
        TIntObjectIterator tIntObjectIterator = eyo_1.g().i();
        for (int k = 0; k < 200; ++k) {
            long l = Hw.a(0L, System.currentTimeMillis());
            String string = bpa_1.c().a();
            long l2 = Hw.a(0L, Long.MAX_VALUE);
            wt_0 wt_02 = wt_0.b(l);
            wt_02.d();
            bsc_1 bsc_12 = abq_22.b();
            if (bsc_12 == null || !bsc_12.c().equals(wt_02)) {
                bsc_12 = new bsc_1(wt_02);
                abq_22.add(bsc_12);
            }
            bse_1 bse_12 = new bse_1(wt_0.b(l), string, l2);
            int n3 = Hw.a(10);
            for (int i2 = 0; i2 < n3; ++i2) {
                if (!tIntObjectIterator.hasNext()) {
                    tIntObjectIterator = eyo_1.g().i();
                }
                tIntObjectIterator.advance();
                bse_12.a(tIntObjectIterator.key(), (short)Hw.a((int)((bjw_1)tIntObjectIterator.value()).o()));
            }
            bsc_12.a(bse_12);
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        bmr_1 bmr_12;
        if (!bl && (bmr_12 = azu_0.j().k()) != null) {
            bmr_12.a((bsx_2)null);
        }
    }
}

