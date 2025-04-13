/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.chat.console.command.AwayCommand;
import org.apache.log4j.Logger;

/*
 * Renamed from cfo
 */
public class cfo_1
implements ahr_1 {
    private static final cfo_1 b = new cfo_1();
    protected static final Logger a = Logger.getLogger(cfo_1.class);

    public static cfo_1 a() {
        return b;
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            return;
        }
        bvc_2 bvc_22 = bvz_2.a.b();
        if (bvc_22 == null) {
            return;
        }
        if (bvc_22.h() == tx_0.b) {
            bvc_22.a((bvd_2)bvc_22.e(), Ur.a);
        }
    }

    @Override
    public boolean a(adt_1 adt_12) {
        bmr_1 bmr_12 = azu_0.j().k();
        switch (adt_12.a()) {
            case 12193: {
                csq_1 csq_12 = (csq_1)adt_12;
                bvc_2 bvc_22 = bvz_2.a.b();
                if (bvc_22 != null && bvc_22.a() != csq_12.c()) {
                    return false;
                }
                bnh_1 bnh_12 = (bnh_1)bmf_2.a().c(csq_12.b());
                if (bnh_12 == null) {
                    return false;
                }
                bvd_2 bvd_22 = new bvd_2(bnh_12);
                bvd_2 bvd_23 = new bvd_2(bmr_12);
                bvc_2 bvc_23 = new bvc_2(csq_12.c(), bvd_22, bvd_23);
                bvb_2 bvb_22 = new bvb_2(bvc_23);
                bvd_22.a(bvb_22);
                bvd_23.a(bvb_22);
                if (aUL.a().f().a(bnh_12.U_()) != null) {
                    bvc_23.a(bvd_22, Ur.g);
                    return false;
                }
                if (AwayCommand.a && !AwayCommand.b.isEmpty()) {
                    aUh.a(AwayCommand.b, bnh_12.dp());
                    bvc_23.a(bvd_22, Ur.a);
                    return false;
                }
                bvc_23.ad_();
                if (bvc_23.h() != tx_0.d) {
                    bvz_2.a.a(bvc_23);
                }
                return false;
            }
            case 13824: {
                csp_1 csp_12 = (csp_1)adt_12;
                bvc_2 bvc_24 = bvz_2.a.b();
                if (bvc_24 != null && bvc_24.a() != csp_12.b()) {
                    return false;
                }
                switch (csp_12.d()) {
                    case 0: {
                        bnh_1 bnh_13 = (bnh_1)bmf_2.a().c(csp_12.c());
                        bvd_2 bvd_24 = new bvd_2(bmr_12);
                        bvd_2 bvd_25 = new bvd_2(bnh_13);
                        bvc_2 bvc_25 = new bvc_2(csp_12.b(), bvd_24, bvd_25);
                        bvb_2 bvb_23 = new bvb_2(bvc_25);
                        bvd_24.a(bvb_23);
                        bvd_25.a(bvb_23);
                        bvc_25.ad_();
                        if (bvc_25.h() == tx_0.d) break;
                        bvz_2.a.a(bvc_25);
                        break;
                    }
                    case 3: {
                        if (bvc_24 != null) {
                            bnh_1 bnh_14 = (bnh_1)bmf_2.a().c(csp_12.c());
                            bvc_24.b(bnh_14.a_());
                        }
                        cyt_0.a().h();
                        break;
                    }
                    case 1: {
                        bnh_1 bnh_15 = (bnh_1)bmf_2.a().c(csp_12.e());
                        String string = bae.h().a("exchange.canceledUserBusy", bnh_15 == null ? "" : bnh_15.dp());
                        fpm_0.b().a(string, cfn_0.a(1), 4099L, 102, 1);
                        if (bvc_24 == null) break;
                        if (bnh_15 != null) {
                            bvc_24.c(bnh_15.a_());
                            break;
                        }
                        bvc_24.p().g();
                        azu_0.j().b(cye_0.a());
                        Ua.a().b(bvc_24);
                        break;
                    }
                    case 2: {
                        if (bvc_24 == null) break;
                        bvc_24.a((bvd_2)bvc_24.a(csp_12.c()), Ur.c);
                        break;
                    }
                    case 4: {
                        bnh_1 bnh_16 = (bnh_1)bmf_2.a().c(csp_12.c());
                        aUh.a("error.chat.userIgnoreYou", new Object[]{bnh_16.dp()});
                        if (bvc_24 == null) break;
                        bvc_24.d(bmr_12.a_());
                        break;
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

