/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Optional;
import org.apache.log4j.Logger;

public class ceB
implements aht_1 {
    private static final Logger a = Logger.getLogger(ceB.class);

    @Override
    public void b(aaw_2 aaw_22) {
        a.info((Object)("Connexion avec le serveur perdue " + aaw_22.g().c()));
        azn_0.a.a(azo_0.a);
        Runnable runnable = () -> {
            String string;
            byte by = azu_0.j().M();
            if (by == 71) {
                return;
            }
            switch (by) {
                case 32: {
                    string = bae.h().a("disconnection.spam", new Object[0]);
                    break;
                }
                case 76: {
                    string = bae.h().a("disconnection.timeout", new Object[0]);
                    break;
                }
                case 65: {
                    string = bae.h().a("disconnection.kickedByReco", new Object[0]);
                    break;
                }
                case 12: 
                case 69: {
                    string = bae.h().a("disconnection.kickedByAdmin", new Object[0]);
                    break;
                }
                case 46: 
                case 67: {
                    string = bae.h().a("disconnection.accountBanned", new Object[0]);
                    break;
                }
                case 87: {
                    string = bae.h().a("disconnection.bannedByAdmin", new Object[0]);
                    break;
                }
                case 45: {
                    string = bae.h().a("disconnection.architectureNotReady", new Object[0]);
                    break;
                }
                case 13: {
                    string = bae.h().a("disconnection.sessionDestroyed", new Object[0]);
                    break;
                }
                case 7: {
                    string = bae.h().a("disconnection.remoteServerDoesNotAnswer", new Object[0]);
                    break;
                }
                case 58: {
                    string = bae.h().a("disconnection.serverShutdown", new Object[0]);
                    break;
                }
                case 48: {
                    string = bae.h().a("disconnection.invalidPosition", new Object[0]);
                    break;
                }
                case 24: {
                    string = bae.h().a("disconnection.openOfflineFlea", new Object[0]);
                    break;
                }
                case 4: {
                    string = bae.h().a("disconnection.unknown", new Object[0]);
                    break;
                }
                case 35: {
                    string = bae.h().a("disconnection.serverError", new Object[0]);
                    break;
                }
                case 78: {
                    string = bae.h().a("disconnection.synchronisationError", new Object[0]);
                    break;
                }
                case 50: {
                    string = bae.h().a("disconnection.timedSessionEnd", new Object[0]);
                    break;
                }
                case 51: {
                    string = bae.h().a("disconnection.serverFull", new Object[0]);
                    break;
                }
                default: {
                    string = bae.h().a("connection.closed", new Object[0]);
                }
            }
            Optional<fzm_0> optional = fzs_0.a().a(102, "ModerationPopup");
            if (optional.isPresent()) {
                fzm_0 fzm_02 = optional.get();
                fzm_02.a((int n, String string2) -> this.a(by, string));
            } else {
                ado_1.a().a(() -> this.a(by, string), 20L, 1);
            }
            azu_0.j().y();
        };
        if (azu_0.j().c(cZJ.a) && cZJ.a.c()) {
            cZJ.a.a(runnable);
        } else {
            ado_1.a().a(runnable);
        }
    }

    @Override
    public void a(aaw_2 aaw_22) {
        a.info((Object)("onNewConnection " + aaw_22.g().c()));
        azn_0.a.a(azo_0.c);
        ado_1.a().a(() -> {
            azu_0 azu_02 = azu_0.j();
            azu_02.a(ceT.a());
            azu_02.a(cfc_1.a);
            azu_02.G();
        }, 20L, 1);
    }

    private void a(byte by, String string) {
        if (azu_0.j().E()) {
            ans_0.D().y();
            ans_0.D().w();
            azu_0.j().a(dai_0.a);
            azu_0.j().a(cvv_0.a());
        }
        if (by != 53) {
            fpm_0.b().a(string, cfn_0.a(1), 1026L, 1, 1);
        }
        cuo_0.e().b();
        fzw_0.a.a("loginLock", true);
    }
}

