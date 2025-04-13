/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.chat.console.command.AwayCommand;
import gnu.trove.iterator.TIntObjectIterator;
import java.util.ArrayList;
import java.util.function.Function;
import org.apache.log4j.Logger;

/*
 * Renamed from cfb
 */
public class cfb_0
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cfb_0.class);
    private static final cfb_0 b = new cfb_0();
    private static final String c = "UNDEFINED";
    private static final String d = "[Zone] ";

    public static cfb_0 a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 691: {
                pn_0 pn_02 = (pn_0)adt_12;
                aUm aUm2 = new aUm(pn_02);
                int n = pn_02.b();
                eog_0 eog_02 = eog_0.a(n);
                if (eog_02 == null || !((bvx_0)ans_0.D().h()).b(eog_02.c())) {
                    return false;
                }
                aup_0 string2 = aup_0.a(eog_02);
                if (string2 == aup_0.a) {
                    return false;
                }
                aUm2.a(string2);
                aul_0.a().a(aUm2);
                return false;
            }
            case 711: {
                PX pX = (PX)adt_12;
                String string = pX.b();
                long l = pX.d();
                String eY2 = pX.c();
                daz_0.a().a(string, l, eY2);
                return false;
            }
            case 674: {
                py_0 py_02 = (py_0)adt_12;
                int n = py_02.b();
                this.a(n);
                return false;
            }
            case 721: {
                PZ pZ = (PZ)adt_12;
                dfc dfc2 = new dfc(18283);
                dfc2.a(pZ.b());
                add_2.b().a(dfc2);
                return false;
            }
            case 796: {
                PU pU = (PU)adt_12;
                boolean bl = pU.b();
                fis_1.a().a("hasModeratorChatRequest", !bl);
                return false;
            }
            case 633: {
                qm_0 qm_02 = (qm_0)adt_12;
                String string = "unknown";
                switch (qm_02.b()) {
                    case 2: {
                        string = "contactModerator.noRequest";
                        break;
                    }
                    case 1: {
                        string = "contactModerator.contactdisconnected";
                        break;
                    }
                    case 3: {
                        string = "contactModerator.error.ignored";
                    }
                }
                aUh.a(string, new Object[0]);
                return false;
            }
            case 641: {
                pq_0 pq_02 = (pq_0)adt_12;
                aUK aUK2 = new aUK(pq_02.d(), pq_02.b(), true, pq_02.c(), true, pq_02.e(), pq_02.f(), "", pq_02.g());
                aUL.a().a((short)1, aUK2);
                ani_2 ani_22 = new ani_2();
                aUr.a(ani_22, "characterName_" + pq_02.c(), pq_02.d());
                aUh.b("chat.notify.addFriend", ani_22.r(), pq_02.b());
                return false;
            }
            case 627: {
                PS pS = (PS)adt_12;
                String string = "";
                if (aUL.a().e().b(pS.b()) != null) {
                    string = aUL.a().e().b(pS.b()).g();
                }
                if (!aUL.a().a((short)1, pS.b())) {
                    aUh.a("error.chat.userNotFound", new Object[]{string});
                } else {
                    aUh.b("chat.notify.removeFriend", string);
                }
                return false;
            }
            case 768: {
                qb_0 qb_02 = (qb_0)adt_12;
                aUB aUB2 = aUL.a().e();
                if (aUB2 != null) {
                    aUK aUK3 = aUB2.a(qb_02.c());
                    if (aUK3 == null) {
                        aUK3 = aUB2.a(qb_02.b());
                    }
                    if (aUK3 != null) {
                        aUK3.c(qb_02.b());
                        aUK3.d(qb_02.d());
                        aUK3.c(true);
                        aUK3.b(qb_02.c());
                        aUK3.a(qb_02.g());
                        aUK3.d(qb_02.f());
                        aUK3.a(qb_02.e());
                        aUK3.a(qb_02.h());
                        if (aUK3.b()) {
                            ani_2 ani_23 = new ani_2();
                            aUr.a(ani_23, "characterName_" + qb_02.c(), qb_02.d());
                            aUh.b("chat.notify.friendOnline", ani_23.r(), qb_02.b(), aUK3.c());
                        }
                    } else {
                        a.error((Object)("Ami inconnu " + qb_02.b()));
                        aUh.a("error.chat.userNotFound", new Object[]{qb_02.b()});
                        return false;
                    }
                    aUK3.f();
                }
                return false;
            }
            case 671: {
                qa_0 qa_02 = (qa_0)adt_12;
                aUB aUB3 = aUL.a().e();
                if (aUB3 != null) {
                    aUK aUK4 = aUB3.a(qa_02.d());
                    if (aUK4 == null) {
                        aUK4 = aUB3.a(qa_02.b());
                    }
                    if (aUK4 != null) {
                        aUK4.b(qa_02.d());
                        aUK4.d("");
                        aUK4.c(false);
                        aUK4.d((short)-1);
                        aUK4.a(-1L);
                        if (aUK4.b()) {
                            aUh.b("chat.notify.friendOffline", qa_02.c(), qa_02.b(), aUK4.c());
                        }
                        fis_1.a().a((ajf_1)aUK4, aUK4.d());
                        fis_1.a().a((ajf_1)aUB3, "contentList");
                    } else {
                        a.error((Object)("Ami inconnu " + qa_02.b()));
                    }
                }
                return false;
            }
            case 731: {
                pr_0 pr_02 = (pr_0)adt_12;
                a.info((Object)"Received FriendListMessage");
                if (pr_02.b() == null) {
                    a.error((Object)"Error : Received friend list is null");
                    return false;
                }
                ArrayList<aUK> arrayList = new ArrayList<aUK>();
                for (eY object : pr_02.b().b()) {
                    arrayList.add(new aUK(object.j(), object.e(), object.h(), object.c(), object.m(), (short)object.o(), (byte)object.q(), object.s(), object.v()));
                }
                aUL.a().a((short)1, arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (eY bl : pr_02.b().e()) {
                    aUK aUK6 = new aUK(bl.c(), bl.e(), bl.j());
                    aUK6.c(bl.h());
                    arrayList2.add(aUK6);
                }
                aUL.a().a((short)2, arrayList2);
                return false;
            }
            case 769: {
                ckv ckv2 = (ckv)adt_12;
                aUB aUB4 = aUL.a().e();
                if (aUB4 == null) {
                    return false;
                }
                for (long string3 : ckv2.b()) {
                    aUK l2 = aUB4.b(string3);
                    if (l2 == null) continue;
                    l2.a(ckv2.a(string3));
                    l2.a(ckv2.b(string3));
                    fis_1.a().a((ajf_1)l2, "characterNameWithLanguages");
                }
                return false;
            }
            case 702: {
                PV pV = (PV)adt_12;
                aUK aUK7 = new aUK(pV.d(), pV.b(), pV.c());
                aUK7.c(pV.d() != -1L);
                aUL.a().a((short)2, aUK7);
                aUh.b("chat.notify.addIgnore", pV.c(), pV.b());
                return false;
            }
            case 700: {
                pw_0 pw_02 = (pw_0)adt_12;
                if (!aUL.a().a((short)2, pw_02.c())) {
                    aUh.a("error.chat.userNotFound", new Object[]{pw_02.b()});
                } else {
                    aUh.a("chat.notify.removeIgnore", new Object[]{pw_02.b()});
                }
                return false;
            }
            case 625: {
                qd_0 qd_02 = (qd_0)adt_12;
                aUB aUB5 = aUL.a().f();
                if (aUB5 != null) {
                    aUK aUK8 = aUB5.a(qd_02.d());
                    if (aUK8 == null) {
                        aUK8 = aUB5.a(qd_02.b());
                    }
                    if (aUK8 != null) {
                        aUK8.d(qd_02.c());
                        aUK8.c(true);
                        aUK8.c(qd_02.b());
                        aUK8.b(qd_02.d());
                        aUK8.f();
                    } else {
                        a.error((Object)("Ignor\u00e9 inconnu " + qd_02.b()));
                    }
                }
                return false;
            }
            case 739: {
                qc_0 qc_02 = (qc_0)adt_12;
                aUB aUB6 = aUL.a().f();
                if (aUB6 != null) {
                    aUK aUK9 = aUB6.a(qc_02.c());
                    if (aUK9 == null) {
                        aUK9 = aUB6.a(qc_02.b());
                    }
                    if (aUK9 != null) {
                        aUK9.b(qc_02.c());
                        aUK9.d("");
                        aUK9.c(false);
                        aUK9.f();
                    } else {
                        a.error((Object)("Ignor\u00e9 inconnu " + qc_02.b()));
                    }
                }
                return false;
            }
            case 658: {
                qg_0 qg_02 = (qg_0)adt_12;
                bmr_1 bmr_12 = azu_0.j().k();
                long l = bmr_12.R();
                boolean bl = l == qg_02.c();
                long bl3 = bl ? bmr_12.a_() : qg_02.c();
                boolean aUm3 = bl || qg_02.d();
                String bl4 = bl ? qg_02.b() : qg_02.e();
                long string5 = bl ? qg_02.i() : qg_02.c();
                aUq aUq2 = new aUq(bl4, bl3, qg_02.h(), string5);
                aUq2.b(aUm3);
                aUq2.a(qg_02.f());
                aUq2.a(qg_02.g());
                aul_0.a().a(aUq2, bl4, bl);
                aul_0.a().f(bl4);
                if (AwayCommand.a && !bl && !AwayCommand.b.isEmpty()) {
                    aUh.a(AwayCommand.b, qg_02.e());
                }
                this.d();
                return false;
            }
            case 760: {
                aUm aUm2;
                String tIntObjectIterator2;
                qi_0 qi_02 = (qi_0)adt_12;
                long l = qi_02.c();
                String string = cfb_0.a(qi_02.e(), l);
                boolean tIntObjectIterator = qi_02.k();
                boolean aUv2 = qi_02.j();
                String string2 = tIntObjectIterator2 = tIntObjectIterator ? bae.h().a(qi_02.h(), new Object[0]) : qi_02.h();
                if (tIntObjectIterator2.startsWith("\"")) {
                    tIntObjectIterator2 = tIntObjectIterator2.substring(1);
                }
                if (tIntObjectIterator2.endsWith("\"")) {
                    tIntObjectIterator2 = tIntObjectIterator2.substring(0, tIntObjectIterator2.length() - 1);
                }
                if (aUv2) {
                    boolean ani_25 = azu_0.j().k().R() == qi_02.c();
                    String string3 = ani_25 ? qi_02.b() : qi_02.e();
                    long l2 = ani_25 ? qi_02.i() : qi_02.c();
                    ani_2 ani_22 = cfb_0.a("characterName_" + l2, ani_25, string3, aup_0.k.d(), tIntObjectIterator2);
                    aUm2 = new aUm(string3, l2, ani_22.r());
                } else {
                    ani_2 ani_23 = new ani_2();
                    ani_23.a(aup_0.k.d());
                    ani_23.a((CharSequence)d);
                    if (!c.equalsIgnoreCase(string)) {
                        ani_23.a((CharSequence)string).a((CharSequence)" : ");
                    }
                    ani_23.a((CharSequence)tIntObjectIterator2);
                    aUm2 = new aUm(ani_23.r());
                }
                aUm2.a(aup_0.d);
                if (aUm2.e().isEmpty()) {
                    return false;
                }
                aul_0.a().a(aUm2);
                if (qi_02.h().toUpperCase().contains(azu_0.j().k().dp().toUpperCase())) {
                    this.d();
                }
                return false;
            }
            case 723: {
                ql_0 ql_02 = (ql_0)adt_12;
                cfb_0.a(ql_02, aup_0.b);
                if (ql_02.h().toUpperCase().contains(azu_0.j().k().dp().toUpperCase())) {
                    this.d();
                }
                return false;
            }
            case 631: {
                qj_0 qj_02 = (qj_0)adt_12;
                cfb_0.a(qj_02, aup_0.h);
                return false;
            }
            case 746: {
                qh_0 qh_02 = (qh_0)adt_12;
                aup_0 aup_03 = cfb_0.a(aup_0::b, qh_02.b());
                if (aup_03 != aup_0.a) {
                    cfb_0.a(qh_02, aup_03);
                }
                return false;
            }
            case 683: {
                qf_0 qf_02 = (qf_0)adt_12;
                cfb_0.a(qf_02, aup_0.i);
                if (qf_02.c() != azu_0.j().k().a_()) {
                    this.c();
                }
                return false;
            }
            case 681: {
                pm_0 pm_02 = (pm_0)adt_12;
                cfb_0.a(pm_02, aup_0.l);
                return false;
            }
            case 610: {
                pt_0 pt_02 = (pt_0)adt_12;
                cfb_0.a(pt_02, aup_0.g);
                return false;
            }
            case 637: {
                qe_0 qe_02 = (qe_0)adt_12;
                cfb_0.a(qe_02, aup_0.f);
                return false;
            }
            case 741: {
                pp_0 pp_02 = (pp_0)adt_12;
                aup_0 aup_04 = cfb_0.a(aup_0::a, pp_02.b());
                if (aup_04 != aup_0.a) {
                    cfb_0.a(pp_02, aup_04);
                }
                return false;
            }
            case 677: {
                qk_0 qk_02 = (qk_0)adt_12;
                aUh.b("info.chat.doNotDisturbStatus", qk_02.b() ? 1 : 0);
                return false;
            }
            case 785: {
                qn_0 qn_02 = (qn_0)adt_12;
                short s2 = qn_02.b();
                aUA.a(s2);
                return false;
            }
            case 13844: {
                cku cku2 = (cku)adt_12;
                boolean bl = cku2.b();
                boolean bl5 = cku2.c();
                if (bl && bl5) {
                    fpm_0.b().a(bae.h().a("moderationPanel.restrictLanguages.text", new Object[0]), "ModerationPopup", cfn_0.a(1), 17411L, 102, 2);
                    ((bvx_0)ans_0.D().h()).a(bah_0.d());
                }
                fis_1.a().a("isClientLanguageRestricted", bl);
                dbA.g();
                return false;
            }
            case 13048: {
                csf_0 csf_02 = (csf_0)adt_12;
                long l = csf_02.b();
                String string = csf_02.c();
                TIntObjectIterator<aUv> tIntObjectIterator = aUxx.a().h();
                while (tIntObjectIterator.hasNext()) {
                    tIntObjectIterator.advance();
                    aUv aUv2 = (aUv)tIntObjectIterator.value();
                    TIntObjectIterator<aUr> tIntObjectIterator2 = aUv2.c();
                    while (tIntObjectIterator2.hasNext()) {
                        tIntObjectIterator2.advance();
                        ((aUr)tIntObjectIterator2.value()).a(l, string);
                        ((aUr)tIntObjectIterator2.value()).a();
                    }
                }
                return false;
            }
        }
        return true;
    }

    private static aup_0 a(Function<Ow, aup_0> function, byte by) {
        Ow ow = Ow.a(by);
        if (!((bvx_0)ans_0.D().h()).b(ow)) {
            return aup_0.a;
        }
        aup_0 aup_02 = function.apply(ow);
        if (aup_02 == aup_0.a) {
            a.warn((Object)("Message received in unknown community channel with language : " + ow));
        }
        return aup_02;
    }

    private static void a(PO pO, aup_0 aup_02) {
        aUm aUm2 = new aUm(pO);
        aUm2.a(aup_02);
        aul_0.a().a(aUm2);
    }

    private static String a(String string, long l) {
        if (!string.isEmpty()) {
            return string;
        }
        blx_1 blx_12 = bmf_2.a().c(l);
        return blx_12 != null ? blx_12.dp() : c;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    private void c() {
        cdw_0.n().c(600109L);
    }

    private void d() {
        cdw_0.n().c(600145L);
    }

    public void a(int n) {
        fis_1.a().a("numModeratorHelpRequestText", (Object)("Requests:" + n));
    }

    private static ani_2 a(String string, boolean bl, String string2, azj_2 azj_22, String string3) {
        ani_2 ani_22 = new ani_2();
        if (azj_22 != null) {
            ani_22.i();
            ani_22.a(azj_22);
        }
        if (bl) {
            ani_22.a((CharSequence)bae.h().a("chat.to", new Object[0])).a((CharSequence)" ");
        }
        if (string2 != null) {
            cfb_0.a(ani_22, string, string2);
        }
        ani_22.a((CharSequence)bae.h().a("colon", new Object[0])).a((CharSequence)string3);
        if (azj_22 != null) {
            ani_22.j();
        }
        return ani_22;
    }

    public static void a(ani_2 ani_22, String string, String string2) {
        ani_22.a().g();
        ani_22.c(string);
        ani_22.a((CharSequence)string2);
        ani_22.h().b();
    }
}

