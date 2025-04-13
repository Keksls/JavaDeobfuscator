/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TLongArrayList
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TLongArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cft
 */
public class cft_1
implements ahr_1 {
    private static final boolean a = false;
    private static final Logger b = Logger.getLogger(cft_1.class);
    private static final cft_1 c = new cft_1();

    public static cft_1 a() {
        return c;
    }

    private cft_1() {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 1094: {
                QE qE = (QE)adt_12;
                bmr_1 bmr_12 = euu_2.a() ? bzf_1.a() : azu_0.j().k();
                if (bmr_12 == null) {
                    return false;
                }
                byn_1 byn_12 = bmr_12.dE();
                Xd xd = Xd.a(qE.c());
                switch (xd) {
                    case b: {
                        Object object;
                        boolean bl = byn_12.d();
                        TLongArrayList tLongArrayList = null;
                        if (bl) {
                            tLongArrayList = new TLongArrayList(byn_12.a().d());
                            TLongObjectIterator tLongObjectIterator = byn_12.a().e().iterator();
                            while (tLongObjectIterator.hasNext()) {
                                tLongObjectIterator.advance();
                                tLongArrayList.add(((epl_0)tLongObjectIterator.value()).f());
                            }
                        }
                        boolean bl2 = false;
                        if (!bl || byn_12.b() != qE.c()) {
                            object = new eQb(qE.c());
                            ((eQb)object).a(new bym_1());
                            if (azu_0.j().c(cxq_0.a)) {
                                ((eQb)object).a(cxq_0.a);
                            }
                            byn_12.a((eQb)object);
                            bl2 = true;
                            bua_0.a.a(new bul_2());
                        }
                        if ((object = (Object)qE.d()) != null) {
                            eQh eQh2 = new eQh(byn_12.a());
                            eQh2.a((byte[])object);
                            bl2 = true;
                        }
                        for (abo_2 abo_22 : qE.e()) {
                            ePY ePY2;
                            long l = (Long)abo_22.a();
                            byte[] byArray = (byte[])abo_22.b();
                            epl_0 epl_02 = byn_12.a().e(l);
                            if (epl_02 == null) {
                                epl_02 = l < 0L ? new byx_1() : new epm_0();
                                epl_02.a(new bza_1());
                                ePY2 = new ePY(epl_02);
                                ePY2.i().a(new byz_1(epl_02));
                                ePY2.b(byArray);
                                byn_12.a().b(epl_02);
                                aUh.b("group.party.invitationAccepted", epl_02.a());
                            } else {
                                ePY2 = new ePY(epl_02);
                                ePY2.i().a(new byz_1(epl_02));
                                ePY2.b(byArray);
                            }
                            bl2 = true;
                        }
                        if (!bl && byn_12.d() && !azu_0.j().c(dbO.a())) {
                            azu_0.j().a(dbO.a());
                        } else if (azu_0.j().c(dbO.a()) && bl2) {
                            dbO.a().c();
                        }
                        byv_1.b(byn_12.a());
                        if (!bl2) break;
                        byv_1.a(byn_12.a());
                        break;
                    }
                }
                return false;
            }
            case 1115: {
                QF qF = (QF)adt_12;
                bmr_1 bmr_13 = azu_0.j().k();
                eQb eQb2 = bmr_13.dE().a();
                if (eQb2 != null) {
                    eQb2.e(qF.b()).d(true);
                    eQb2.e(qF.c()).d(false);
                    byp_1 byp_12 = dbO.a().d();
                    byp_12.a(bmr_13.dE());
                    fis_1.a().a((ajf_1)byp_12, "members");
                    byv_1.a(eQb2);
                }
                return false;
            }
            case 1046: {
                QH qH = (QH)adt_12;
                bmr_1 bmr_14 = azu_0.j().k();
                dgr_0 dgr_02 = new dgr_0();
                String string = qH.b();
                if (bmr_14.a(erl_2.T) || aUL.a().f().a(qH.d()) != null) {
                    Qu qu = new Qu();
                    qu.a(false);
                    qu.a(qH.b());
                    qu.a(qH.d());
                    qu.a(qH.c());
                    azu_0.j().K().c(qu);
                    return false;
                }
                dgr_02.a(Xd.a(qH.c()));
                dgr_02.b(qH.d());
                dgr_02.b(string);
                add_2.b().a(dgr_02);
                return false;
            }
            case 1142: {
                QJ qJ = (QJ)adt_12;
                bQG.a();
                bQG.a(qJ.c(), new Object[0]);
                brd_0.k.b(true);
                return false;
            }
            case 1193: {
                QI qI = (QI)adt_12;
                bmr_1 bmr_15 = azu_0.j().k();
                byn_1 byn_13 = bmr_15.dE();
                long l = qI.b();
                Xd xd = Xd.a(l);
                TLongArrayList tLongArrayList = qI.c();
                if (xd != Xd.b) {
                    return false;
                }
                if (tLongArrayList.contains(bmr_15.a_())) {
                    this.a(bmr_15);
                    return false;
                }
                for (int k = 0; k < tLongArrayList.size(); ++k) {
                    long l2;
                    if (byn_13.d()) {
                        l2 = tLongArrayList.getQuick(k);
                        this.a(byn_13, l2);
                    } else {
                        b.error((Object)"Removing a character from our group, but we don't have one!");
                    }
                    l2 = tLongArrayList.getQuick(k);
                    if (euw_2.a.d(l2) != null) {
                        euw_2.a.b(bmr_15.U_(), l2);
                    }
                    if (!azu_0.j().c(dbO.a())) continue;
                    dbO.a().c();
                }
                return false;
            }
            case 1191: {
                QB qB = (QB)adt_12;
                return false;
            }
            case 1194: {
                QD qD = (QD)adt_12;
                long l = qD.b();
                Xd xd = Xd.a(l);
                dbO.a().d();
                byp_1.a();
                return false;
            }
            case 14537: {
                cai_0 cai_02 = (cai_0)adt_12;
                if (cai_02.b() == 0) {
                    if (azu_0.j().c(cZl.a())) {
                        azu_0.j().b(cZl.a());
                    }
                    return false;
                }
                fpm_0 fpm_02 = fpm_0.b();
                bQG.a();
                fpm_02.a(bQG.b(cai_02.b(), new Object[0]), cfn_0.a(1), 2L, 102, 3);
                return false;
            }
            case 1091: {
                QL qL = (QL)adt_12;
                String string = bae.h().a("notification.guildCreateText", qL.b());
                dbo_0.a.a(string, 4);
                azu_0.j().b(cZl.a());
                cZl.a().c();
                return false;
            }
            case 1168: {
                String string = bae.h().a("notification.guildBlazonChangedText", new Object[0]);
                dbo_0.a.a(string, 4);
                azu_0.j().b(cZl.a());
                cZl.a().c();
                return false;
            }
            case 1071: {
                QM qM = (QM)adt_12;
                String string = bae.h().a("notification.guildNameChangedText", qM.b());
                dbo_0.a.a(string, 4);
                azu_0.j().b(cZl.a());
                cZl.a().c();
                return false;
            }
            case 1131: {
                qo_0 qo_02 = (qo_0)adt_12;
                Object t = euw_2.a.d(qo_02.c());
                if (t == null) {
                    return false;
                }
                String string = bae.h().a("notification.guildSelfQuitText", qo_02.b(), ((epq_2)t).dp());
                dbo_0.a.a(string, 4);
                return false;
            }
            case 1123: {
                QA qA = (QA)adt_12;
                Object t = euw_2.a.d(qA.c());
                if (t == null) {
                    return false;
                }
                String string = bae.h().a("notification.guildDisbandText", qA.b());
                dbo_0.a.a(string, 4);
                return false;
            }
        }
        return true;
    }

    private void a(bmr_1 bmr_12) {
        if (azu_0.j().c(dbO.a())) {
            azu_0.j().b(dbO.a());
        }
        for (long l : euw_2.a.e(bmr_12.U_())) {
            bmr_1 bmr_13;
            if (l == bmr_12.a_() || (bmr_13 = (bmr_1)euw_2.a.d(l)) == null) continue;
            euw_2.a.b(bmr_12.U_(), l);
        }
        bmr_12.dE().a().c();
        bmr_12.dE().a((eQb)null);
        byp_1.a();
        brd_0.k.a(true);
        aUh.b("group.party.leave", new Object[0]);
    }

    private void a(byn_1 byn_12, long l) {
        eQb eQb2 = byn_12.a();
        epl_0 epl_02 = eQb2.e(l);
        if (epl_02 == null) {
            return;
        }
        boolean bl = epl_02.v();
        eQb2.b(l);
        bmk_1 bmk_12 = cxq_0.a.b(bl ? (long)(-epl_02.c()) : l);
        if (bmk_12 != null) {
            brd_0.k.f(bmk_12);
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

