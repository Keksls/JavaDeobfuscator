/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIntIterator
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntIntIterator;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.procedure.TObjectProcedure;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cfQ
 */
public class cfq_1
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cfq_1.class);
    public static final ahr_1 b = new cfq_1();
    private static final TObjectProcedure<blx_1> c = new cfr_1();

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        fis_1.a().a("nations", bVr.b);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        TIntObjectIterator<faX> tIntObjectIterator = fbc_0.a.a(new Integer[0]);
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            tIntObjectIterator.remove();
        }
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 15494: {
                cwr_2 cwr_22 = (cwr_2)adt_12;
                Object object = cwr_22.b();
                while (object.hasNext()) {
                    feo_0 feo_02;
                    object.advance();
                    int n = object.key();
                    byte[] byArray = (byte[])object.value();
                    boolean bl = false;
                    faX faX2 = fbc_0.a.a(n);
                    if (faX2 == null) {
                        a.info((Object)("[NATION] Reception d'un message de synchro de nation demandant l'ajout d'une nouvelle nation : " + n));
                        faX2 = faX.a(n);
                        fbc_0.a.a(faX2);
                        bl = true;
                    }
                    faX2.a(byArray, epj.k);
                    if (cfq_1.a(byArray) && (feo_02 = faX2.E()) != null) {
                        TIntObjectIterator<fem_0> tIntObjectIterator = feo_02.a();
                        while (tIntObjectIterator.hasNext()) {
                            tIntObjectIterator.advance();
                            fem_0 fem_02 = (fem_0)tIntObjectIterator.value();
                            bMs.a.a(fem_02.a(), fem_02.c());
                        }
                    }
                    if (!bl) continue;
                    faX2.d();
                }
                bUW.a().w();
                object = azu_0.j().k();
                if (object != null) {
                    if (!faX.a(faX.i, ((epq_2)object).fE().m())) {
                        bUH bUH2 = (bUH)((epq_2)object).fE();
                        bUH2.g();
                    }
                    ((blx_1)object).z();
                }
                return false;
            }
            case 15052: {
                Object object;
                Object object2;
                Object object3;
                cwh_1 cwh_12 = (cwh_1)adt_12;
                a.info((Object)("[NATION] Un vote a commenc\u00e9 pour ma nation, d'une dur\u00e9e de " + cwh_12.b()));
                bmr_1 bmr_12 = azu_0.j().k();
                if (bmr_12 == null) {
                    return false;
                }
                if (bUW.a().C()) {
                    object3 = bae.h().a("notification.preventiveElectionTitle", new Object[0]);
                    object2 = cIg.createLink(bae.h().a("notification.preventiveElectionText", new Object[0]), blr_1.e, "0");
                    object = new dhc((String)object3, (String)object2, blr_1.e, 600132);
                    add_2.b().a((adt_1)object);
                } else {
                    object3 = bae.h().a("notification.newElectionTitle", new Object[0]);
                    object2 = cIg.createLink(bae.h().a("notification.newElectionText", new Object[0]), blr_1.e, "0");
                    object = new dhc((String)object3, (String)object2, blr_1.e, 600132);
                    add_2.b().a((adt_1)object);
                }
                object3 = bmr_12.fE();
                object2 = object3.m();
                ((faX)object2).a(cwh_12.c(), cwh_12.b(), true);
                object = bmr_12.dt() >= 1 ? bae.h().a("nation.vote.start.can.be.candidate", 3000) : (bmr_12.dt() >= 1 ? bae.h().a("nation.vote.start.can.vote", (short)1) : bae.h().a("nation.vote.start.cant.do.anything", (short)1));
                aul_0.a().e((String)object);
                if (fpm_0.b().q("nationDialog")) {
                    bUW.a().l();
                }
                if (azu_0.j().c(ddH.a())) {
                    azu_0.j().b(ddH.a());
                }
                return false;
            }
            case 15849: {
                String string;
                String string2;
                cwe_1 cwe_12 = (cwe_1)adt_12;
                bmr_1 bmr_13 = azu_0.j().k();
                if (bmr_13 == null) {
                    return false;
                }
                bUH bUH3 = (bUH)bmr_13.fE();
                faX faX3 = bUH3.m();
                bUH3.a(false);
                bmf_2.a().a(c);
                String string3 = cwe_12.g();
                boolean bl = bmr_13.dp().equals(string3);
                String string4 = cwe_12.f();
                boolean bl2 = string4 != null;
                boolean bl3 = cwe_12.e();
                boolean bl4 = bl2 && bmr_13.dp().equals(string4);
                boolean bl5 = bUH3.j();
                faX3.m().a();
                faX3.a(cwe_12.c(), cwe_12.d(), false);
                faX3.u();
                bUH3.g();
                a.info((Object)("[NATION] Un vote commenc\u00e9 le " + cwe_12.b() + "vient de se terminer pour ma nation. Gouverneur : " + string4 + " Gouverneur \u00e9lu d\u00e9mocratiquement : " + bl3));
                if (bl2) {
                    if (bl4) {
                        string2 = bl ? (bl3 ? bae.h().a("nation.vote.end.result.reelected", new Object[0]) : bae.h().a("nation.vote.end.result.reelectedByDefault", new Object[0])) : bae.h().a("nation.vote.end.result.elected", new Object[0]);
                        string = bae.h().a("notification.governorEndElectionText", new Object[0]);
                    } else {
                        string2 = bl ? (bl5 ? bae.h().a("nation.vote.end.result.reelectionLost", string4) : bae.h().a("nation.vote.end.result.noMoreGovernor", string4)) : (bl5 ? bae.h().a("nation.vote.end.result.electionLost", string4) : (bl3 ? bae.h().a("nation.vote.end.result.someoneElected", string4) : bae.h().a("nation.vote.end.result.someoneReelected", string4)));
                        string = bae.h().a("notification.endElectionText", string4);
                    }
                } else {
                    string2 = bae.h().a("nation.vote.end.result.noGovernor", new Object[0]);
                    string = bae.h().a("notification.noGovernorEndElectionText", new Object[0]);
                }
                String string5 = bae.h().a("notification.endElectionTitle", new Object[0]);
                String string6 = cIg.createLink(string, blr_1.e, "0");
                dhc dhc2 = new dhc(string5, string6, blr_1.e);
                add_2.b().a(dhc2);
                cdw_0.n().b(600133L, 0.0f, 500, 2000, 6400);
                String string7 = bae.h().a("nation.vote.end", new Object[0]) + "\n" + string2;
                aul_0.a().e(string7);
                if (fpm_0.b().q("nationDialog")) {
                    czw_1 czw_12 = new czw_1();
                    azu_0.j().K().c(czw_12);
                }
                if (azu_0.j().c(ddH.a())) {
                    azu_0.j().b(ddH.a());
                }
                return false;
            }
            case 15465: {
                cwi_1 cwi_12 = (cwi_1)adt_12;
                int n = cwi_12.c();
                int n2 = cwi_12.b();
                bMs.a.a(n2, n);
                a.info((Object)("protector " + n2 + " changed to nation " + n));
                return false;
            }
            case 14254: {
                String string;
                String string8;
                cwf_1 cwf_12 = (cwf_1)adt_12;
                String string9 = cwf_12.c();
                switch (cwf_12.b()) {
                    case b: {
                        string8 = bae.h().a("nation.vote.end.resultDelayed.voteLost", string9);
                        string = bae.h().a("notification.endElectionText", string9);
                        break;
                    }
                    case c: {
                        string8 = bae.h().a("nation.vote.end.resultDelayed.voteLostStatusLost", string9);
                        string = bae.h().a("notification.endElectionText", string9);
                        break;
                    }
                    case d: {
                        string8 = bae.h().a("nation.vote.end.resultDelayed.voteMissed", string9);
                        string = bae.h().a("notification.endElectionText", string9);
                        break;
                    }
                    case a: {
                        string8 = bae.h().a("nation.vote.end.resultDelayed.voteWon", string9);
                        string = bae.h().a("notification.governorEndElectionText", new Object[0]);
                        break;
                    }
                    default: {
                        return false;
                    }
                }
                aul_0.a().e(string8);
                String string10 = bae.h().a("notification.endElectionTitle", new Object[0]);
                String string11 = cIg.createLink(string, blr_1.e, "0");
                dhc dhc3 = new dhc(string10, string11, blr_1.e, 600132);
                add_2.b().a(dhc3);
                return false;
            }
            case 12966: {
                cwv_2 cwv_22 = (cwv_2)adt_12;
                boolean bl = cwv_22.b();
                String string = !bl ? bae.h().a("nation.vote.candidateRegistration.error", new Object[0]) : bae.h().a("nation.vote.candidateRegistration.success", new Object[0]);
                aul_0.a().c(string);
                return false;
            }
            case 12968: {
                cwq_2 cwq_22 = (cwq_2)adt_12;
                fcf fcf2 = cwq_22.b();
                faX faX4 = azu_0.j().k().fE().m();
                faX4.a(fcf2);
                faX4.a(cwq_22.c(), cwq_22.d());
                return false;
            }
            case 15487: {
                cwg_1 cwg_12 = (cwg_1)adt_12;
                ArrayList<fcf> arrayList = cwg_12.b();
                faX faX5 = azu_0.j().k().fE().m();
                if (faX5.v()) {
                    faX5.a(arrayList);
                    faX5.a(cwg_12.c(), cwg_12.d());
                } else {
                    ((bUv)faX5.C()).a(arrayList, cwg_12.c(), cwg_12.d());
                }
                bUW.a().w();
                return false;
            }
            case 14318: {
                cwu_2 cwu_22 = (cwu_2)adt_12;
                if (cwu_22.b()) {
                    long l = azu_0.j().k().a_();
                    if (cwu_22.c() == l) {
                        aUh.b("nation.desist.result.sender", cwu_22.f(), cwu_22.g());
                    } else if (cwu_22.e() == l) {
                        aUh.b("nation.desist.result.receiver", cwu_22.d(), cwu_22.g(), cwu_22.h());
                    } else {
                        a.error((Object)("[NATION] On re\u00e7oit un r\u00e9sultat de d\u00e9sistement de " + cwu_22.c() + " pour " + cwu_22.e() + " alors qu'on est d'id " + l + ". Message pas arriv\u00e9 au bon destinataire ???"));
                    }
                } else {
                    a.error((Object)"[NATION] R\u00e9sultat de la demande de d\u00e9sistement : erreur");
                }
                return false;
            }
            case 12678: {
                cwy_2 cwy_22 = (cwy_2)adt_12;
                fcu_0 fcu_02 = cwy_22.b();
                String string = bae.h().a(57, (long)((int)fcu_02.a()), new Object[0]);
                fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("nation.governmentNominationQuestion", string), cfn_0.a(0), 25L, 102, 1);
                fzm_02.a(new cfs_2(this, fcu_02));
                return false;
            }
            case 14783: {
                cwz_2 cwz_22 = (cwz_2)adt_12;
                String string = cwz_22.b();
                fcu_0 fcu_03 = cwz_22.c();
                int n = cwz_22.d();
                String string12 = bae.h().a(57, (long)((int)fcu_03.a()), new Object[0]);
                if (n == 0) {
                    String string13 = bae.h().a("nation.governmentNominationChatMessage", string, string12);
                    aul_0.a().e(string13);
                    String string14 = bae.h().a("notification.governmentNominationTitle", new Object[0]);
                    String string15 = cIg.createLink(bae.h().a("notification.governmentNominationText", string, string12), blr_1.e);
                    dhc dhc4 = new dhc(string14, string15, blr_1.e, 600132);
                    add_2.b().a(dhc4);
                    if (azu_0.j().c(dbd.a())) {
                        azu_0.j().b(dbd.a());
                    }
                } else {
                    bQG.a();
                    bQG.a(n, string, string12);
                }
                return false;
            }
            case 14799: {
                cwa_1 cwa_12 = (cwa_1)adt_12;
                long l = cwa_12.e();
                String string = cwa_12.b();
                fcu_0 fcu_04 = cwa_12.c();
                int n = cwa_12.d();
                String string16 = bae.h().a(57, (long)((int)fcu_04.a()), new Object[0]);
                if (n == 0) {
                    blx_1 blx_12;
                    String string17 = bae.h().a("nation.governmentRevokeChatMessage", string, string16);
                    aul_0.a().e(string17);
                    String string18 = bae.h().a("notification.governmentRevokeTitle", new Object[0]);
                    String string19 = cIg.createLink(bae.h().a("notification.governmentRevokeText", string, string16), blr_1.e);
                    dhc dhc5 = new dhc(string18, string19, blr_1.e, 600132);
                    add_2.b().a(dhc5);
                    if (azu_0.j().c(dbd.a())) {
                        azu_0.j().b(dbd.a());
                    }
                    if ((blx_12 = bzf_1.a(l)) instanceof bnh_1) {
                        blx_12.aQ();
                    }
                } else {
                    bQG.a();
                    bQG.a(n, string, string16);
                }
                return false;
            }
            case 13899: {
                cwb_1 cwb_12 = (cwb_1)adt_12;
                int n = cwb_12.b();
                long l = cwb_12.c();
                faV faV2 = azu_0.j().k().fE();
                fdk_0 fdk_02 = faV2.m().m();
                String string = new ani_2().a().a("cc4444").a((CharSequence)bae.h().a(97, (long)((int)l), new Object[0])).b().r();
                fbl_0 fbl_02 = cSR.j();
                if (fbl_02 != null) {
                    int n3 = fdk_02.a(l);
                    int n4 = fdk_02.b(l);
                    int n5 = faV2.c(n);
                    if (n5 > 0) {
                        n3 += n5 * n4 / 100;
                    }
                    String string20 = new ani_2().a().a("cc4444").a((CharSequence)((n3 > 0 ? "+" : "") + n3)).b().r();
                    aUh.b("nation.chatLaw", string20, string);
                }
                return false;
            }
            case 15201: {
                cAZ cAZ2 = (cAZ)adt_12;
                TIntObjectIterator<byte[]> tIntObjectIterator = cAZ2.b();
                TIntIntIterator tIntIntIterator = cAZ2.c();
                while (tIntObjectIterator.hasNext() && tIntIntIterator.hasNext()) {
                    tIntObjectIterator.advance();
                    tIntIntIterator.advance();
                    int n = tIntObjectIterator.key();
                    byte[] byArray = (byte[])tIntObjectIterator.value();
                    int n6 = tIntIntIterator.value();
                    faX faX6 = fbc_0.a.a(n);
                    bUW.a().a(n, n6);
                    fbu_0 fbu_02 = faX6.a(fbz_0.g);
                    fbu_02.a(ByteBuffer.wrap(byArray), epj.k);
                    fbu_02.b();
                }
                return false;
            }
            case 14834: {
                cAY cAY2 = (cAY)adt_12;
                long l = cAY2.c();
                String string = blv_2.a((short)(l / 1000L));
                bQG.a();
                String string21 = bQG.b(cAY2.b(), string);
                bQG.a();
                bQG.a(cAY2.b(), string);
                fpm_0.b().a(string21, cfn_0.a(1), 1026L, 102, 1);
                dbd.a().a(true);
                return false;
            }
            case 13154: {
                csd csd2 = (csd)adt_12;
                int n = csd2.b();
                boolean bl = csd2.c();
                feo_0.a(n, bl);
                bUW.a().m();
                bmf_0 bmf_02 = (bmf_0)bMs.a.a(n).E();
                String string = null;
                if (bae.h().a(66, (long)bmf_02.e())) {
                    string = bae.h().a(66, (long)bmf_02.e(), new Object[0]);
                }
                if (bl) {
                    bmn_0 bmn_02 = (bmn_0)bmt_0.h.b();
                    bmn_02.a(bmf_02);
                    fgV.a.a(bmn_02);
                    if (azu_0.j().k().dI() == bmf_02) {
                        dlx.a().a(new dlq(dly.g, bae.h().a("notification.chaosStartedTitle", new Object[0]), 500, 2500, "AnimChallenge1"));
                        cdw_0.n().c(600144L);
                    }
                    dhc dhc6 = new dhc(bae.h().a("notification.chaosStartedTitle", new Object[0]), bae.h().a("notification.chaosStartedText", string), blr_1.h);
                    add_2.b().a(dhc6);
                } else {
                    bmm_0 bmm_02 = (bmm_0)bmt_0.i.b();
                    bmm_02.a(bmf_02);
                    fgV.a.a(bmm_02);
                    dhc dhc7 = new dhc(bae.h().a("notification.chaosStoppedTitle", new Object[0]), bae.h().a("notification.chaosStoppedText", string), blr_1.h);
                    add_2.b().a(dhc7);
                }
                return false;
            }
        }
        return true;
    }

    private static boolean a(byte[] byArray) {
        if (byArray == null || byArray.length == 0) {
            return false;
        }
        byte by = byArray[0];
        if (by < 0 || by >= fby_0.values().length) {
            return false;
        }
        for (fbz_0 fbz_02 : fby_0.values()[by].a()) {
            if (fbz_02 != fbz_0.k) continue;
            return true;
        }
        return false;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

