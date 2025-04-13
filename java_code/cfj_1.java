/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TByteArrayList
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TByteArrayList;
import gnu.trove.list.array.TIntArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from cfj
 */
public class cfj_1
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cfj_1.class);
    private static final cfj_1 b = new cfj_1();

    public static cfj_1 a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 12018: {
                cvw_2 cvw_22 = (cvw_2)adt_12;
                List<wh_2> list = cvw_22.b();
                TByteArrayList tByteArrayList = cvw_22.c();
                TIntArrayList tIntArrayList = cvw_22.d();
                bsq_1 bsq_12 = cuu_0.a().w();
                bsq_12.g();
                for (int k = 0; k < list.size(); ++k) {
                    bhm_0 bhm_02 = bsq_12.a(list.get(k));
                    byte by = tByteArrayList.get(k);
                    bhm_02.e((int)by);
                    int n = tIntArrayList.get(k);
                    Object r2 = eyo_1.g().d(n);
                    bhm_02.a(r2 != null ? ((ezr_0)r2).e() : "<UNKNOWN>");
                    bhm_02.f(((ezr_0)r2).C());
                    cWt.e().a(bhm_02.r(), new abo_2(by, r2));
                }
                return false;
            }
            case 13221: {
                cvx_2 cvx_22 = (cvx_2)adt_12;
                wh_2 wh_22 = cvx_22.b();
                bsq_1 bsq_13 = cuu_0.a().w();
                cuu_0.a().a(bsq_13.a(wh_22));
                return false;
            }
            case 13430: {
                UF uF;
                bsx_2 bsx_22 = cuu_0.a();
                cvy_2 cvy_22 = (cvy_2)adt_12;
                switch (cvy_22.b()) {
                    case 0: {
                        uF = new exk_2();
                        if (!((exk_2)uF).b(cvy_22.d())) {
                            a.error((Object)"On essaie d'acheter un item qui n'existe pas ?");
                        }
                        a.info((Object)("[FLEA_BUY_RESULT_MESSAGE] : container=" + cvy_22.c() + ", item=" + ((exk_2)uF).N()));
                        bHi bHi2 = azu_0.j().k().da();
                        try {
                            bHi2.d(cvy_22.c()).f((exk_2)uF);
                        }
                        catch (uz_0 uz_02) {
                            a.error((Object)("Exception lev\u00e9e lors de l'ajout d'un item(" + ((exk_2)uF).N() + ") dans un container(" + cvy_22.c() + ") : "), (Throwable)uz_02);
                        }
                        catch (Uy uy) {
                            a.error((Object)("Exception lev\u00e9e lors de l'ajout d'un item(" + ((exk_2)uF).N() + ") dans un container(" + cvy_22.c() + ") : "), (Throwable)uy);
                        }
                        break;
                    }
                    case 2: {
                        aUh.a("error.flea.buy.inventoryfull", new Object[0]);
                        break;
                    }
                    case 3: {
                        aUh.a("error.flea.buy.inventoryLocked", new Object[0]);
                        break;
                    }
                    case 1: {
                        aUh.a("error.flea.buy", new Object[0]);
                    }
                }
                uF = bsx_22.C();
                if (uF == null) {
                    cWt.e().f();
                    return false;
                }
                ((bhm_0)uF).p();
                return false;
            }
            case 13183: {
                bsx_2 bsx_23 = cuu_0.a();
                cwa_2 cwa_22 = (cwa_2)adt_12;
                a.info((Object)("[FLEA_LOCK_MESSAGE] merchantInventory=" + cwa_22.b() + ", lock=" + cwa_22.c()));
                bsx_23.a(cwa_22.b(), cwa_22.c());
                return false;
            }
            case 13334: {
                bsx_2 bsx_24 = cuu_0.a();
                cwe_2 cwe_22 = (cwe_2)adt_12;
                bhm_0 bhm_03 = (bhm_0)bsx_24.w().b(cwe_22.c());
                byte by = (byte)(bhm_03.q() - 1);
                bhm_03.e((int)by);
                fis_1.a().a((ajf_1)bsx_24, "fleaList");
                bhm_0 bhm_04 = bsx_24.C();
                if (bhm_04 != null) {
                    long l = cwe_22.b();
                    a.info((Object)("[MERCHANT_ITEM_REMOVE_MESSAGE] itemUid=" + l));
                    abo_2 abo_22 = bsx_24.w().d(l);
                    if (abo_22 == null) {
                        a.error((Object)"Remove failed...");
                        return false;
                    }
                    if (azu_0.j().c(cWt.e())) {
                        bsx_2 bsx_25 = cWt.a();
                        if (bhm_04.m() && bhm_04.equals(bsx_25.C())) {
                            bsx_25.c();
                        }
                        long l2 = bhm_03.r();
                        abo_2 abo_23 = cWt.e().c(l2);
                        abo_23 = new abo_2(by, abo_23.b());
                        cWt.e().a(l2, abo_23);
                    }
                    bhm_04.p();
                }
                return false;
            }
            case 12609: {
                bsx_2 bsx_26 = cuu_0.a();
                cwf_2 cwf_22 = (cwf_2)adt_12;
                a.info((Object)("[MERCHANT_ITEM_UPDATE_MESSAGE] itemUid=" + cwf_22.b()));
                abo_2 abo_24 = bsx_26.w().c(cwf_22.b());
                if (abo_24 != null) {
                    bhm_0 bhm_05 = (bhm_0)abo_24.a();
                    bHN bHN2 = (bHN)abo_24.b();
                    fev_0 fev_02 = cwf_22.e();
                    int n = cwf_22.d();
                    short s2 = cwf_22.c();
                    if (bHN2.e() != s2) {
                        bhm_05.a(bHN2.a(), (short)(s2 - bHN2.e()));
                    }
                    if (bHN2.p() != (long)n) {
                        bhm_05.a((exx_2)bHN2, (long)n);
                    }
                    if (bHN2.q() != fev_02) {
                        bhm_05.a((exx_2)bHN2, fev_02);
                    }
                    bhm_05.p();
                } else {
                    a.error((Object)("L'item (ID=" + cwf_22.b() + ") n'existe pas/plus dans la brocante brows\u00e9e."));
                }
                return false;
            }
            case 13463: {
                cwc_2 cwc_22 = (cwc_2)adt_12;
                wh_2 wh_23 = cwc_22.b();
                byte by = cwc_22.c();
                int n = cwc_22.d();
                bsx_2 bsx_27 = cuu_0.a();
                bhm_0 bhm_06 = bsx_27.w().a(wh_23);
                bhm_06.e((int)by);
                Object r3 = eyo_1.g().d(n);
                bhm_06.a(r3 != null ? ((ezr_0)r3).e() : "<UNKNOWN>");
                bhm_06.f(((ezr_0)r3).C());
                cWt.e().a(bhm_06.r(), new abo_2(by, r3));
                return false;
            }
            case 13462: {
                cwd_2 cwd_22 = (cwd_2)adt_12;
                long l = cwd_22.b();
                bsx_2 bsx_28 = cuu_0.a();
                bsx_28.w().a(l);
                cWt.e().b(l);
                return false;
            }
        }
        return true;
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }
}

