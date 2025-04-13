/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.common.SteamUtils
 *  com.ankamagames.steam.wrapper.CSteamID
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.log4j.Logger
 */
import com.ankamagames.steam.common.SteamUtils;
import com.ankamagames.steam.wrapper.CSteamID;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;

public class ceT
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(ceT.class);
    private static final ceT b = new ceT();
    private static String c;

    public static ceT a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 594: {
                ckv_0 ckv_02 = (ckv_0)adt_12;
                ceT.a(ckv_02);
                return false;
            }
            case 531: {
                ckt_0 ckt_02 = (ckt_0)adt_12;
                byte by = ckt_02.b();
                String string = "error.connection.nicknameNotSet";
                switch (by) {
                    case 13: {
                        string = "error.connection.nicknameNotSet";
                        break;
                    }
                    case 14: {
                        string = "error.connection.nicknameInvalidContent";
                        break;
                    }
                    case 15: {
                        string = "error.connection.nicknameDuplicate";
                        break;
                    }
                    case 16: {
                        string = "error.connection.nicknameTooLong";
                        break;
                    }
                    case 17: {
                        string = "error.connection.nicknameTooShort";
                        break;
                    }
                    case 18: {
                        string = "error.connection.nicknameEqualsLogin";
                        break;
                    }
                    case 19: {
                        string = "error.connection.nicknameInvalidFormat";
                    }
                }
                fpm_0.b().a("nicknameChoiceDialog", cfi_0.a("nicknameChoiceDialog"), 8448L, (short)10000);
                fpm_0.b().a(bae.h().a(string, new Object[0]), cfn_0.a(1), 1027L, 1, 2);
                return false;
            }
            case 515: {
                ckq_1 ckq_12 = (ckq_1)adt_12;
                azu_0.j().a((byte)53);
                azu_0.j().a(azp_0.d);
                if (ckq_12.b()) {
                    azu_0.j().b(true);
                    byte[] byArray = ckq_12.d();
                    if (byArray != null) {
                        bai_0 bai_02 = new bai_0();
                        bai_02.a_(byArray);
                        azu_0.j().a(bai_02);
                        cbf_2.a(bai_02);
                        ((bvx_0)ans_0.D().h()).a((agp_0)bWe.av, false);
                        aZG.e().a("admin", !emp_0.a(bai_02.v(), emp_0.b));
                        fis_1.a().a("isAdmin", !emp_0.a(bai_02.v(), emp_0.b));
                        boolean bl = emp_0.b(bai_02.v(), emq_0.W);
                        fis_1.a().a("hasDebugRights", bl);
                        if (bl) {
                            agB.a().e();
                        }
                    }
                    azu_0.j().b(this);
                    azu_0.j().b(cvv_0.a());
                    azu_0.j().a(cgs_2.a());
                    ceX.a().a(false);
                    azu_0.j().a(ceX.a());
                    azu_0.j().a(cfb_0.a());
                    azu_0.j().a(cft_1.a());
                    azu_0.j().a(ceW.b);
                    azu_0.j().a(cgr_2.b);
                    azu_0.j().a(cfm_1.a());
                    azu_0.j().a(bde.a);
                    bjo_1.a().b();
                } else {
                    String string;
                    Object[] objectArray = new Object[]{};
                    byte by = (byte)(ckq_12.c() & 0xFF);
                    if (by == 13 || by == 15 || by == 18 || by == 14 || by == 19 || by == 16 || by == 17) {
                        azu_0.j().a(cvv_0.a());
                        ceT.a(by);
                        return false;
                    }
                    if (by == 24) {
                        this.c();
                        return false;
                    }
                    switch (by) {
                        case 124: {
                            string = "anonymous.ip.forbidden";
                            break;
                        }
                        case 110: {
                            string = "error.connection.account.unsecured";
                            break;
                        }
                        case 113: {
                            string = "error.connection.account.no.2fa";
                            break;
                        }
                        case 111: {
                            string = "error.connection.account.unsecuredMail";
                            break;
                        }
                        case 112: {
                            string = "error.connection.account.unsecuredGsm";
                            break;
                        }
                        case 114: {
                            string = "error.connection.account.noIdentity";
                            break;
                        }
                        case 121: {
                            string = "error.connection.ip.threshold";
                            objectArray = new Object[]{ckq_12.e()};
                            break;
                        }
                        case 122: {
                            string = "error.connection.no.mac.address.provided";
                            break;
                        }
                        case 123: {
                            string = "error.connection.mac.already.in.use";
                            break;
                        }
                        case 8: {
                            string = "error.connection.account.locked";
                            break;
                        }
                        case 2: {
                            string = "error.connection.invalidLogin";
                            break;
                        }
                        case 3: {
                            string = "error.connection.alreadyConnected";
                            break;
                        }
                        case 4: {
                            string = "error.connection.saveInProgress";
                            break;
                        }
                        case 60: {
                            string = "error.connection.earlyAccess";
                            break;
                        }
                        case 61: {
                            string = "error.connection.closedBeta";
                            break;
                        }
                        case 9: {
                            string = "error.connection.locked";
                            break;
                        }
                        case 10: {
                            string = "error.connection.loginServerDown";
                            break;
                        }
                        case 11: {
                            string = "error.connection.tooManyConnection";
                            break;
                        }
                        case 12: {
                            string = "error.connection.invalidPartner";
                            break;
                        }
                        case 5: {
                            string = "error.connection.banned";
                            int n = ckq_12.e();
                            int n2 = n / 1440;
                            int n3 = (n -= n2 * 60 * 24) / 60;
                            n -= n3 * 60;
                            if (n2 > 0) {
                                objectArray = new Object[]{n2, n3, 0};
                                break;
                            }
                            objectArray = new Object[]{0, n3, n};
                            break;
                        }
                        case 20: {
                            string = "error.connection.invalidEmail";
                            try {
                                String string2 = azs_0.a().a("accountValidationUrl");
                                String string3 = String.format(string2, bae.h().f().i());
                                objectArray = new Object[]{string3};
                            }
                            catch (gm_0 gm_02) {
                                a.error((Object)"Impossible de r\u00e9cup\u00e9rer la propri\u00e9t\u00e9 de validation d'e-mail");
                            }
                            break;
                        }
                        case 22: {
                            string = "error.connection.OTPAuthFailed";
                            try {
                                String string4 = azs_0.a().a("accountValidationUrl");
                                String string5 = String.format(string4, bae.h().f().i());
                                objectArray = new Object[]{string5};
                            }
                            catch (gm_0 gm_03) {
                                a.error((Object)"Impossible de r\u00e9cup\u00e9rer la propri\u00e9t\u00e9 de validation d'e-mail");
                            }
                            break;
                        }
                        case 21: {
                            string = "error.connection.accountModeration";
                            break;
                        }
                        case 40: {
                            string = "error.connection.invalidLogin";
                            break;
                        }
                        case 42: {
                            string = "error.connection.invalidToken";
                            break;
                        }
                        case 27: 
                        case 28: 
                        case 29: 
                        case 30: 
                        case 31: 
                        case 32: 
                        case 33: 
                        case 34: 
                        case 35: 
                        case 36: 
                        case 37: 
                        case 38: 
                        case 39: 
                        case 43: {
                            string = "steam.genericError";
                            objectArray = new Object[]{String.valueOf(by)};
                            break;
                        }
                        default: {
                            string = "error.connection.invalidLogin";
                        }
                    }
                    this.a(adt_12, string, objectArray);
                }
                return false;
            }
            case 591: {
                this.a(adt_12, "error.connection.worldLoading", new Object[0]);
                return false;
            }
            case 22: {
                pz_0 pz_02 = (pz_0)adt_12;
                this.a(adt_12, "error.connection.loginServerDown", pz_02.c());
                return false;
            }
            case 431: {
                cky_0 cky_02 = (cky_0)adt_12;
                byte by = cky_02.b();
                String string = cky_02.c();
                a.info((Object)("Authentication token received from dispatch server : " + string + " errorCode=" + by));
                switch (by) {
                    case 0: {
                        this.a(string);
                        return false;
                    }
                }
                return false;
            }
            case 542: {
                ckr_1 ckr_12 = (ckr_1)adt_12;
                byte by = ckr_12.b();
                cfd_0.a.a(false);
                a.info((Object)("Authentication result " + by));
                Object[] objectArray = null;
                switch (by) {
                    case 0: {
                        bah_0.a(ckr_12.d(), ckr_12.e(), ckr_12.f(), ckr_12.g());
                        azr_0.a().a(ckr_12.h());
                        fis_1.a().a("account.name", (Object)ckr_12.h());
                        fis_1.a().a("account.community", new azl_0(ckr_12.e()));
                        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
                        boolean bl = bvx_02.a(bWe.d);
                        bvx_02.a((agp_0)bWe.e, bl ? ckr_12.h() : "");
                        if (bvx_02.g() != null && ((bvo_0)bvx_02.g()).o() != ckr_12.c()) {
                            bvx_02.a((bvo_0)null);
                        }
                        if (bvx_02.g() == null) {
                            bvo_0 bvo_02 = new bvo_0(ckr_12.c());
                            bvx_02.a(bvo_02);
                            try {
                                bvo_02.i();
                            }
                            catch (IOException iOException) {
                                a.warn((Object)"Error occurred on load of AccountPreferenceStore", (Throwable)iOException);
                            }
                        }
                        azu_0.j().d(null);
                        ceT.d();
                        return false;
                    }
                    case 13: 
                    case 14: 
                    case 15: 
                    case 16: 
                    case 17: 
                    case 18: 
                    case 19: {
                        ceT.a(by);
                        return false;
                    }
                    case 20: {
                        try {
                            String string = azs_0.a().a("accountValidationUrl");
                            objectArray = new String[]{String.format(string, bae.h().f().i())};
                        }
                        catch (gm_0 gm_04) {
                            a.error((Object)"Impossible de r\u00e9cup\u00e9rer la propri\u00e9t\u00e9 de validation d'e-mail", (Throwable)gm_04);
                        }
                        break;
                    }
                    default: {
                        fzw_0.a.a("loginLock", true);
                        cuo_0.e().b();
                        this.a(adt_12, bqi_0.a((byte)by).r, new Object[0]);
                        return false;
                    }
                }
                fzw_0.a.a("loginLock", true);
                cuo_0.e().b();
                this.a(adt_12, bqi_0.a((byte)by).r, ArrayUtils.isEmpty((Object[])objectArray) ? ArrayUtils.EMPTY_STRING_ARRAY : objectArray);
                return false;
            }
            case 491: {
                cku_0 cku_02 = (cku_0)adt_12;
                TIntObjectHashMap<eru_2> tIntObjectHashMap = cku_02.b();
                TIntObjectHashMap<ery_2> tIntObjectHashMap2 = cku_02.c();
                ArrayList<bwj_0> arrayList = new ArrayList<bwj_0>();
                TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
                while (tIntObjectIterator.hasNext()) {
                    tIntObjectIterator.advance();
                    eru_2 eru_22 = (eru_2)tIntObjectIterator.value();
                    ery_2 ery_22 = (ery_2)tIntObjectHashMap2.get(eru_22.a());
                    if (ery_22 == null) continue;
                    arrayList.add(new bwj_0(eru_22, ery_22));
                }
                dcD.a.a(Optional.of(arrayList));
                cuo_0.e().b();
                azu_0.j().a(dcD.a);
                return false;
            }
            case 523: {
                ckx_0 ckx_02 = (ckx_0)adt_12;
                long l = ckx_02.b();
                byte[] byArray = ckx_02.c();
                cvv_0.a().a(l, byArray);
                this.c();
                return false;
            }
        }
        return true;
    }

    private void c() {
        fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("steamLinkAccountQuestion", new Object[0]), cfn_0.a(0), 2077L, 102, 2);
        fzm_02.a((int n, String string) -> {
            if (n == 8) {
                azu_0.j().a(azp_0.a);
                fpm_0.b().a("steamLinkAccountDialog", cfi_0.a("steamLinkAccountDialog"), 8448L, (short)10000);
            } else if (n == 16) {
                CSteamID cSteamID = bPL.a.f();
                ckc_1 ckc_12 = new ckc_1();
                ckc_12.a(bae.h().f().i());
                ckc_12.a(SteamUtils.serializeSteamId((CSteamID)cSteamID));
                azu_0.j().K().c(ckc_12);
            } else {
                cuo_0.e().b();
                azu_0.j().a("Cancel Steam Link");
                azu_0.j().a(cvv_0.a());
            }
        });
    }

    private void a(String string) {
        c = string;
        dcD.a();
    }

    private static void d() {
        if (azu_0.j().o() == azp_0.a) {
            azu_0.j().a(azp_0.b);
        }
        azu_0.j().K().c(new ckj_1());
        azu_0.j().b(cvv_0.a());
        fis_1.a().a("account.password");
    }

    private static void a(ckv_0 ckv_02) {
        long l = ckv_02.b();
        byte[] byArray = ckv_02.c();
        ccl_0.a.a(byArray);
        switch (azu_0.j().o()) {
            case c: {
                ckb_1 ckb_12 = new ckb_1();
                ckb_12.a(c);
                ckb_12.b(azm_0.c().orElse(""));
                azu_0.j().K().c(ckb_12);
                break;
            }
            case a: {
                a.error((Object)"Pouet public key receive through steam link !!!");
                break;
            }
            case b: {
                eoW eoW2 = eoW.a();
                boolean bl = eoW2.d();
                if (bl) {
                    CSteamID cSteamID = bPL.a.f();
                    cke_1 cke_12 = new cke_1();
                    cke_12.a(SteamUtils.serializeSteamId((CSteamID)cSteamID));
                    cke_12.a(bPL.a.a().getAuthTicket());
                    cvv_0.a().a(l, byArray);
                    azu_0.j().K().c(cke_12);
                    break;
                }
                ceT.b(l);
                break;
            }
        }
    }

    private static void b(long l) {
        String string = azu_0.j().C();
        if (string != null) {
            byte[] byArray = azu_0.c(l);
            ckh_1 ckh_12 = new ckh_1();
            ckh_12.a(byArray);
            azu_0.j().K().c(ckh_12);
        } else if (!fis_1.a().c("demo")) {
            byte[] byArray = azu_0.b(l);
            ckd_1 ckd_12 = new ckd_1();
            ckd_12.a(byArray);
            azu_0.j().K().c(ckd_12);
        } else {
            byte[] byArray = azu_0.b(l);
            ckf_1 ckf_12 = new ckf_1();
            ckf_12.a(byArray);
            azu_0.j().K().c(ckf_12);
        }
    }

    private static void a(byte by) {
        String string = "error.connection.nicknameNotSet";
        switch (by) {
            case 13: {
                string = "error.connection.nicknameNotSet";
                break;
            }
            case 14: {
                string = "error.connection.nicknameInvalidContent";
                break;
            }
            case 15: {
                string = "error.connection.nicknameDuplicate";
                break;
            }
            case 16: {
                string = "error.connection.nicknameTooLong";
                break;
            }
            case 17: {
                string = "error.connection.nicknameTooShort";
                break;
            }
            case 18: {
                string = "error.connection.nicknameEqualsLogin";
                break;
            }
            case 19: {
                string = "error.connection.nicknameInvalidFormat";
            }
        }
        fpm_0.b().a("nicknameChoiceDialog", cfi_0.a("nicknameChoiceDialog"), 8448L, (short)10000);
        fpm_0.b().a(bae.h().a(string, new Object[0]), cfn_0.a(1), 1027L, 1, 2);
    }

    protected final void a(adt_1 adt_12, String string, Object ... objectArray) {
        azu_0.j().b((String)null);
        azu_0.j().c((String)null);
        azu_0.j().d(null);
        ((aav_2)adt_12.l()).b(this);
        fpm_0.b().a(bae.h().a(string, objectArray), cfn_0.a(1), 1027L, 1, 2);
        azu_0.j().a("Login Error");
        azu_0.j().a(cvv_0.a());
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
        if (!bl) {
            c = null;
        }
    }
}

