/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cfq
 */
public class cfq_2
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cfq_2.class);
    private static final cfq_2 b = new cfq_2();

    public static cfq_2 a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        bsx_2 bsx_22 = cuu_0.a();
        switch (adt_12.a()) {
            case 12779: {
                cvz_2 cvz_22 = (cvz_2)adt_12;
                a.info((Object)("[DIMENSIONAL_BAG_FLEA_CONTENT_MESSAGE] ownerId=" + cvz_22.b()));
                bsx_22.w().b(cvz_22.d());
                bsx_22.w().a(cvz_22.e());
                bsx_22.a(bsx_22.w().a(cvz_22.c()));
                return false;
            }
            case 13430: {
                cvy_2 cvy_22 = (cvy_2)adt_12;
                switch (cvy_22.b()) {
                    case 0: {
                        exk_2 exk_22 = new exk_2();
                        if (!exk_22.b(cvy_22.d())) {
                            a.error((Object)"On essaie d'acheter un item qui n'existe pas ?");
                        }
                        a.info((Object)("[FLEA_BUY_RESULT_MESSAGE] : container=" + cvy_22.c() + ", item=" + exk_22.N()));
                        bHi bHi2 = azu_0.j().k().da();
                        try {
                            bHi2.d(cvy_22.c()).f(exk_22);
                        }
                        catch (uz_0 uz_02) {
                            a.error((Object)("Exception lev\u00e9e lors de l'ajout d'un item(" + exk_22.N() + ") dans un container(" + cvy_22.c() + ") : "), (Throwable)uz_02);
                        }
                        catch (Uy uy) {
                            a.error((Object)("Exception lev\u00e9e lors de l'ajout d'un item(" + exk_22.N() + ") dans un container(" + cvy_22.c() + ") : "), (Throwable)uy);
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
                bsx_22.C().p();
                return false;
            }
            case 13183: {
                cwa_2 cwa_22 = (cwa_2)adt_12;
                a.info((Object)("[FLEA_LOCK_MESSAGE] merchantInventory=" + cwa_22.b() + ", lock=" + cwa_22.c()));
                bsx_22.a(cwa_22.b(), cwa_22.c());
                return false;
            }
            case 13334: {
                cwe_2 cwe_22 = (cwe_2)adt_12;
                a.info((Object)("[MERCHANT_ITEM_REMOVE_MESSAGE] itemUid=" + cwe_22.b()));
                abo_2 abo_22 = bsx_22.w().d(cwe_22.b());
                if (abo_22 == null) {
                    a.error((Object)"Remove failed...");
                }
                bsx_22.C().p();
                return false;
            }
            case 12609: {
                cwf_2 cwf_22 = (cwf_2)adt_12;
                a.info((Object)("[MERCHANT_ITEM_UPDATE_MESSAGE] itemUid=" + cwf_22.b()));
                abo_2 abo_23 = bsx_22.w().c(cwf_22.b());
                if (abo_23 != null) {
                    bhm_0 bhm_02 = (bhm_0)abo_23.a();
                    bHN bHN2 = (bHN)abo_23.b();
                    fev_0 fev_02 = cwf_22.e();
                    int n = cwf_22.d();
                    short s2 = cwf_22.c();
                    if (bHN2.e() != s2) {
                        bhm_02.a(bHN2.a(), (short)(s2 - bHN2.e()));
                    }
                    if (bHN2.p() != (long)n) {
                        bhm_02.a((exx_2)bHN2, (long)n);
                    }
                    if (bHN2.q() != fev_02) {
                        bhm_02.a((exx_2)bHN2, fev_02);
                    }
                    bhm_02.p();
                } else {
                    a.error((Object)("L'item (ID=" + cwf_22.b() + ") n'existe pas/plus dans la brocante brows\u00e9e."));
                }
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

