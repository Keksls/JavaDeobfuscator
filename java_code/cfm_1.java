/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Iterator;
import java.util.Set;
import org.apache.log4j.Logger;

/*
 * Renamed from cfm
 */
public class cfm_1
implements ahr_1 {
    private static final Logger a = Logger.getLogger(cfm_1.class);
    private static final cfm_1 b = new cfm_1();

    private cfm_1() {
    }

    public static cfm_1 a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        int n = adt_12.a();
        switch (n) {
            case 1081: {
                this.a((cax_0)adt_12);
                return false;
            }
            case 1185: {
                this.a((cAq)adt_12);
                return false;
            }
            case 1077: {
                this.a((caa_0)adt_12);
                return false;
            }
            case 1160: {
                this.a((cAr)adt_12);
                return false;
            }
            case 1037: {
                this.a((caz_0)adt_12);
                return false;
            }
            case 1028: {
                this.a((cag_0)adt_12);
                return false;
            }
            case 1054: {
                this.a((caf_0)adt_12);
                return false;
            }
            case 1000: {
                this.a((cAt)adt_12);
                return false;
            }
            case 1038: {
                this.a((caw_0)adt_12);
                return false;
            }
            case 1062: {
                this.a((cav_0)adt_12);
                return false;
            }
            case 1155: {
                this.a((cAs)adt_12);
                return false;
            }
            case 1065: {
                this.a((cac_0)adt_12);
                return false;
            }
            case 1138: {
                this.a((cad_0)adt_12);
                return false;
            }
            case 1092: {
                this.a((cab_0)adt_12);
                return false;
            }
            case 1116: {
                this.a((cau_0)adt_12);
                return false;
            }
            case 1195: {
                this.a((cae_0)adt_12);
                return false;
            }
            case 1051: {
                this.a((cay_0)adt_12);
                return false;
            }
        }
        return true;
    }

    private void a(cay_0 cay_02) {
        byte by = cay_02.b();
        a.warn((Object)eLn.a("Erreur lors de la modification d'un evenement", by));
        eLo eLo2 = cay_02.c();
        aul_0.a().b(bae.h().a("calendar.event.modification.error", new Object[0]));
        this.a(by, eLo2);
        bvs_2.a().b(eLo2);
        bvt_2.a().g();
    }

    private void a(cad_0 cad_02) {
        byte by = cad_02.b();
        a.warn((Object)eLn.a("Impossible de changer la date de debut de l'\u00e9v\u00e8nement", by));
        aul_0.a().b(bae.h().a("calendar.start.date.change.error", new Object[0]));
        this.a(by, bvs_2.a().a(cad_02.c()));
        bvs_2.a().a(cad_02.c(), cad_02.d());
        bvt_2.a().g();
    }

    private void a(cae_0 cae_02) {
        byte by = cae_02.b();
        a.warn((Object)eLn.a("Impossible de changer le titre de l'\u00e9v\u00e8nement", by));
        eLo eLo2 = bvs_2.a().a(cae_02.c());
        if (eLo2 == null) {
            a.warn((Object)"[CALENDAR] Bizarre, on a re\u00e7u une reponse sur un changement de description d'un event mais nous ne connaissons pas cet event");
            return;
        }
        cfm_1.a("calendar.event.title.change.error", eLo2);
        eLo2.b(cae_02.d());
    }

    private void a(cau_0 cau_02) {
        byte by = cau_02.e();
        eLo eLo2 = bvs_2.a().a(cau_02.b());
        if (eLo2 == null) {
            a.error((Object)"On est notifi\u00e9 d'une modification d'un \u00e9v\u00e8nement dont on n'a pas connaissance");
            return;
        }
        switch (by) {
            case 1: {
                eLo2.b(cau_02.d(), cau_02.c());
                cYA.a().c();
                cfm_1.a("calendar.event.inscription", cau_02.c(), eLo2);
                return;
            }
            case 2: {
                eLo2.c(cau_02.d());
                cYA.a().c();
                cYA.a().d();
                cfm_1.a("calendar.event.other.leave.participants", cau_02.c(), eLo2);
                return;
            }
            case 3: {
                eLo2.d(cau_02.d());
                cYA.a().c();
                return;
            }
        }
        a.error((Object)("[CALENDAR] Action de type inconnue : " + by));
    }

    private void a(cab_0 cab_02) {
        byte by = cab_02.b();
        switch (by) {
            case 0: {
                a.error((Object)"[CALENDAR] Le serveur ne devrait envoyer aucune reponse si le changement de desc s'est bien passe");
                return;
            }
            case 11: {
                a.warn((Object)"[CALENDAR] Impossible de changer la desc de l'\u00e9v\u00e8nement : \u00e9v\u00e8nement inconnu");
                break;
            }
            case 14: {
                a.warn((Object)"[CALENDAR] Impossible de changer la desc de l'\u00e9v\u00e8nement personnnage non connect\u00e9");
                break;
            }
            case 13: {
                a.warn((Object)"[CALENDAR] Impossible de changer la desc de l'\u00e9v\u00e8nement personnage non propri\u00e9taire de l'evenement");
                break;
            }
            case 26: {
                a.warn((Object)"[CALENDAR] Impossible de changer la desc de l'\u00e9v\u00e8nement car on ne dipose pas des droits n\u00e9cessaires");
                break;
            }
            default: {
                a.error((Object)"[CALENDAR] Le serveur envoie un code d'erreur non trait\u00e9 dans le cas d'un message de reponse au changement de desc");
            }
        }
        eLo eLo2 = bvs_2.a().a(cab_02.c());
        if (eLo2 == null) {
            a.warn((Object)"[EVENTS_CALENDAR] Bizarre, on a re\u00e7u une reponse sur un changement de description d'un event mais nous ne connaissons pas cet event");
            return;
        }
        cfm_1.a("calendar.event.desc.change.error", eLo2);
        eLo2.b(cab_02.d());
    }

    private void a(cac_0 cac_02) {
        byte by = cac_02.b();
        switch (by) {
            case 0: {
                a.error((Object)"[CALENDAR] Le serveur ne devrait envoyer aucune reponse si le changement de titre s'est bien passe");
                return;
            }
            case 11: {
                a.warn((Object)"[CALENDAR] Impossible de changer le titre de l'\u00e9v\u00e8nement : \u00e9v\u00e8nement inconnu");
                break;
            }
            case 14: {
                a.warn((Object)"[CALENDAR] Impossible de changer le titre de l'\u00e9v\u00e8nement personnnage non connect\u00e9");
                break;
            }
            case 13: {
                a.warn((Object)"[CLAENDAR] Impossible de changer le titre de l'\u00e9v\u00e8nement personnage non propri\u00e9taire de l'evenement");
                break;
            }
            case 26: {
                a.warn((Object)"[CLAENDAR] Impossible de changer le titre de l'\u00e9v\u00e8nement car on ne dispose pas des droits n\u00e9cessaires");
                break;
            }
            case 12: {
                aUh.b("calendar.event.end.date.preceding.start", new Object[0]);
            }
            default: {
                a.error((Object)"[CALENDAR] Le serveur envoie un code d'erreur non trait\u00e9 dans le cas d'un message de reponse au changement de desc");
            }
        }
        eLo eLo2 = bvs_2.a().a(cac_02.c());
        if (eLo2 == null) {
            a.warn((Object)"[EVENTS_CALENDAR] Bizarre, on a re\u00e7u une reponse sur un changement de date de fin d'un event mais nous ne connaissons pas cet event");
            return;
        }
        eLo2.b(cac_02.d());
    }

    private void a(caa_0 caa_02) {
        byte by = caa_02.b();
        eLo eLo2 = bvs_2.a().a(caa_02.c());
        if (by == 0) {
            cfm_1.a("calendar.event.removed", eLo2);
            bvs_2.a().c(eLo2);
            a.info((Object)bvs_2.a().toString());
            return;
        }
        if (by == 9) {
            a.info((Object)"[CALENDAR] Le serveur a rejet\u00e9 la demande pour le retrait d'un evenement au calendrier");
            cfm_1.a("calendar.event.removed.error", eLo2);
            return;
        }
        a.error((Object)"[CALENDAR] Le serveur envoie un code d'erreur non trait\u00e9 dans le cas d'un message de reponse au retrait d'un evenement");
    }

    private void a(cAs cAs2) {
        Set<eLo> set = cAs2.b();
        Iterator<eLo> iterator = set.iterator();
        while (iterator.hasNext()) {
            bvs_2.a().a(iterator.next());
        }
    }

    private void a(cav_0 cav_02) {
        long l = cav_02.d();
        eLo eLo2 = bvs_2.a().a(l);
        byte by = cav_02.c();
        switch (by) {
            case 8: {
                eLo2.a(cav_02.e(), cav_02.b());
                cYA.a().d();
                cfm_1.a("calendar.event.invitation.accepted", cav_02.b(), eLo2);
                break;
            }
            case 7: {
                cfm_1.a("calendar.event.invitation.refused", cav_02.b(), eLo2);
                break;
            }
            case 5: {
                cfm_1.a("calendar.event.invited.not.connected", cav_02.b(), eLo2);
                break;
            }
            case 6: {
                cfm_1.a("calendar.event.invited.has.pending.invitation", cav_02.b(), eLo2);
                break;
            }
            default: {
                cfm_1.a("calendar.event.invitation.error", cav_02.b(), eLo2);
                this.a(by, eLo2);
            }
        }
    }

    private void a(caw_0 caw_02) {
        String string = bae.h().a("calendar.event.invitation.message", caw_02.c(), caw_02.b());
        fzm_0 fzm_02 = fpm_0.b().a(string, cfn_0.a(0), 2073L, 102, 1);
        fzm_02.a(new cfn_2(this, caw_02));
    }

    private void a(cAt cAt2) {
        Set<eLo> set = cAt2.b();
        for (eLo eLo2 : set) {
            bvs_2.a().a(eLo2);
        }
        bvt_2.a().g();
    }

    private void a(caf_0 caf_02) {
        byte by = caf_02.b();
        eLo eLo2 = bvs_2.a().a(caf_02.c());
        if (eLo2 == null) {
            a.warn((Object)"On recoit du serveur une reponse d'invalidation de participation sur un event que le client ne connait pas");
            return;
        }
        if (by == 0) {
            String string = eLo2.c(caf_02.d());
            eLo2.b(caf_02.d(), string);
            cYA.a().c();
            cYA.a().d();
            cfm_1.a("calendar.event.participation.invalidation", string, eLo2);
        } else {
            cfm_1.a("calendar.event.participation.unvalidation.error", eLo2);
            this.a(by, eLo2);
        }
    }

    private void a(cag_0 cag_02) {
        byte by = cag_02.b();
        eLo eLo2 = bvs_2.a().a(cag_02.c());
        if (eLo2 == null) {
            a.warn((Object)"On recoit du serveur une reponse de validation de participation sur un event que le client ne connait pas");
            return;
        }
        if (by == 0) {
            String string = eLo2.d(cag_02.d());
            eLo2.a(cag_02.d(), string);
            cYA.a().c();
            cYA.a().d();
            cfm_1.a("calendar.event.participation.validation.success", string, eLo2);
        } else {
            cfm_1.a("calendar.event.participation.validation.error", eLo2);
            this.a(by, eLo2);
        }
    }

    private void a(caz_0 caz_02) {
        byte by = caz_02.b();
        eLo eLo2 = bvs_2.a().a(caz_02.c());
        if (eLo2 == null) {
            a.warn((Object)"On recoit du serveur une reponse d'inscription sur un event que le client ne connait pas");
            return;
        }
        if (by == 0) {
            eLo2.b(azu_0.j().k().a_(), azu_0.j().k().dp());
            cYA.a().c();
            cfm_1.a("calendar.event.you.inscription.success", eLo2);
            return;
        }
        aul_0.a().b(bae.h().a("calendar.event.you.inscription.error", eLo2.b()));
        this.a(by, eLo2);
        a.error((Object)"[CALENDAR] Le serveur envoie un code d'erreur non trait\u00e9 dans le cas d'un message de reponse a la demande d'inscription");
    }

    private void a(cAr cAr2) {
        Set<eLo> set = cAr2.b();
        aUh.b("calendar.todays.events", new Object[0]);
        for (eLo eLo2 : set) {
            if (eLo2 == null) continue;
            String string = WN.a(bae.h().a("calendar.expectations", bvp_2.a(eLo2)), eLo2.a());
            aul_0.a().c(string);
        }
    }

    private void a(cAq cAq2) {
        byte by = cAq2.b();
        eLo eLo2 = bvs_2.a().c(cAq2.c());
        if (eLo2 == null) {
            a.warn((Object)"Impossible de valider l'ajout de l'evenement chez le client, il ne connait pas l'evenement avec le hashcode specifie");
            aUh.b("calendar.events.add.error", "");
            bvt_2.a().g();
            return;
        }
        if (by != 0) {
            this.a(by, eLo2);
            a.info((Object)"[CALENDAR] Le serveur a rejet\u00e9 la demande pour l'ajout d'un evenement au calendrier, on retire le dernier evt ajoute par le client");
            bvs_2.a().c(eLo2);
            bvt_2.a().g();
            return;
        }
        cfm_1.a("calendar.events.add.success", eLo2);
        bvs_2.a().e(eLo2);
        bvs_2.a().a(eLo2, cAq2.d());
        bvt_2.a().g();
    }

    private void a(cax_0 cax_02) {
        Set set = cax_02.b().b();
        for (eLo eLo2 : set) {
            bvs_2.a().a(eLo2);
        }
        bvs_2.a().f();
        bvt_2.a().g();
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void a(byte by, eLo eLo2) {
        switch (by) {
            case 1: {
                cfm_1.b("calendar.events.add.error", eLo2);
                break;
            }
            case 22: {
                aUh.a("calendar.events.too.many.for.owner", (byte)20);
                break;
            }
            case 19: {
                cfm_1.b("calendar.event.already.exists", eLo2);
                break;
            }
            case 27: {
                cfm_1.b("calendar.event.start.date.before.today", eLo2);
                break;
            }
            case 29: {
                cfm_1.b("calendar.event.expired", eLo2);
                break;
            }
            case 28: {
                cfm_1.b("calendar.event.already.registered", eLo2);
                break;
            }
            case 18: {
                cfm_1.b("calendar.event.too.much.registrations", eLo2);
                break;
            }
            case 30: {
                cfm_1.b("calendar.event.not.registered", eLo2);
                break;
            }
            case 17: {
                cfm_1.b("calendar.event.too.much.participants", eLo2);
                break;
            }
            case 13: {
                cfm_1.b("calendar.event.you.not.owner", eLo2);
                break;
            }
            case 32: {
                cfm_1.b("calendar.event.not.participant", eLo2);
                break;
            }
            case 33: {
                cfm_1.b("calendar.event.too.much.in.calendar", eLo2);
                break;
            }
            default: {
                aUh.a("calendar.events.unknown.error", by);
            }
        }
    }

    private static void a(String string, eLo eLo2) {
        aUh.b(string, bvp_2.a(eLo2));
    }

    private static void a(String string, String string2, eLo eLo2) {
        aUh.b(string, string2, bvp_2.a(eLo2));
    }

    private static void b(String string, eLo eLo2) {
        aUh.a(string, new Object[]{bvp_2.a(eLo2)});
    }
}

