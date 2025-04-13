/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public final class biM
implements afu_0<afv> {
    private static final Logger b = Logger.getLogger(biM.class);
    private static final biQ c = new biQ();
    private static final int d = 630;
    private static final int e = 5;
    private final biI f;
    private static final wu_0 g = new wt_0(0, 0, 10, 14, 2, 2020);
    private static final wu_0 h = new wt_0(0, 0, 10, 21, 2, 2020);

    public biM(biI biI2) {
        assert (biI2 != null);
        this.f = biI2;
    }

    @Override
    public void a(afv afv2, boolean bl) {
        assert (afv2 == this.f);
        if (biM.a()) {
            return;
        }
        if (bl) {
            biM.a(this.f);
        } else {
            biM.b(this.f);
        }
    }

    public static void a(biI biI2) {
        fvE fvE2 = fta_0.getInstance().getMouseOver();
        if (fvE2 != null && fvE2 != fta_0.getInstance()) {
            return;
        }
        blx_1 blx_12 = biI2.bI();
        if (blx_12 == null) {
            return;
        }
        if (blx_12.bV()) {
            return;
        }
        if (blx_12.f(eoz_1.at)) {
            return;
        }
        dhg dhg2 = new dhg(biI2, biI2.bT());
        biM.a(blx_12, dhg2);
        dbm_0.a().a(dhg2);
        biI2.a(new biN(biI2));
    }

    public static void a(blx_1 blx_12, dhg dhg2) {
        Object object;
        boolean bl;
        boolean bl2;
        int n;
        bmr_1 bmr_12;
        int n2;
        blx_1 blx_13;
        blx_1 blx_14;
        blx_1 blx_15;
        ani_2[] ani_2Array = new ani_2[]{new ani_2(), new ani_2()};
        boolean bl3 = blx_12.bv().v();
        if (blx_12.a(eoz_1.ag)) {
            blx_15 = blx_12.ar();
            blx_14 = blx_12.ar();
            blx_13 = blx_12.ar();
        } else {
            blx_14 = blx_12;
            blx_15 = blx_12;
            blx_13 = blx_12.gO() == 1550 ? blx_12.aq() : blx_12;
        }
        String string = null;
        if (!blx_13.ab_()) {
            if (blx_13 instanceof bmv_1) {
                biM.a(bl3, blx_13, ani_2Array, dhg2);
            }
            string = biM.b(blx_13, false);
            biM.a(dhg2, blx_13);
            biM.e(blx_12, true);
        }
        boolean bl4 = (n2 = (bmr_12 = azu_0.j().k()).cQ()) == (n = blx_12.bA());
        bvx_2 bvx_22 = blx_12.bz();
        if (bl4 && bvx_22 != null && bvx_22.af_().u() && blx_13 instanceof bmv_1 && blx_13.a(erl_2.K)) {
            ani_2Array[1].m().i().a(azf_2.v.w());
            ani_2Array[1].a((CharSequence)bae.h().a("arcadeDungeon.monsterScoreBonus", ((bmv_1)blx_12).da()));
            ani_2Array[1].j();
        }
        if (bl4 && bvx_22 != null && bvx_22.e() == elp_0.b && bmr_12.Y() == blx_12.Y()) {
            if (blx_12.gY() == 5) {
                biM.e(blx_12, true);
            } else {
                aNC.d(blx_12.bv());
            }
        }
        biM.c(blx_12, bl4);
        boolean bl5 = bl2 = blx_12.ak() && !bl4;
        if (bl2) {
            ani_2Array[1].m().a((CharSequence)bae.h().a("desc.inFight", new Object[0]));
        }
        boolean bl6 = bl = bl2 && aPc.f().g() != n;
        if (bl) {
            biM.a(bwj_1.a().a(n));
        }
        if (bvx_22 != null && !box_2.a(blx_14) && (object = blx_14.ae()) != null && ((String)object).length() > 0) {
            ani_2Array[1].m().a((CharSequence)object);
        }
        if (dhg2.b().isEmpty()) {
            object = ani_2Array[0].r() + biM.a(blx_15, bl3) + ani_2Array[1].r();
            dhg2.a((String)object, string, biM.b(blx_12));
        }
    }

    public static void a(dhg dhg2, blx_1 blx_12) {
        String string = biM.c(blx_12);
        String string2 = null;
        if (string != null) {
            try {
                string2 = String.format(azs_0.a().a("popupIconPath"), string);
            }
            catch (gm_0 gm_02) {
                b.error((Object)gm_02.getMessage(), (Throwable)gm_02);
            }
        }
        dhg2.a(string2);
    }

    @NotNull
    private static List<String> b(blx_1 blx_12) {
        boolean bl;
        if (!(blx_12 instanceof bnh_1)) {
            return Collections.emptyList();
        }
        if (blx_12.dr() == 0) {
            return Collections.emptyList();
        }
        boolean bl2 = blx_12.bo() && eag_0.a(blx_12.U_());
        boolean bl3 = bl = !blx_12.bo() && ((bnh_1)blx_12).eo() < 50;
        if (!bl2 && !bl) {
            return Collections.emptyList();
        }
        try {
            return Lists.newArrayList((Object[])new String[]{String.format(azs_0.a().a("mentorIconPath"), "newPlayer_32")});
        }
        catch (gm_0 gm_02) {
            b.error((Object)gm_02.getMessage(), (Throwable)gm_02);
            return Collections.emptyList();
        }
    }

    private static String c(blx_1 blx_12) {
        if (blx_12 instanceof bnh_1) {
            return "breed" + blx_12.gO();
        }
        String string = null;
        if (blx_12 instanceof bmv_1) {
            bMn bMn2 = (bMn)blx_12.aa_();
            bpb_1 bpb_12 = bpc_1.a().a(blx_12.gO());
            epw_1 epw_12 = epx_1.b().a(bpb_12.t());
            int n = blx_12.a(erl_2.z) && bMn2 == null ? 0 : epw_12.e();
            biP biP2 = biP.b;
            if (n == 0) {
                biP2 = biP.a;
            }
            if (bMn2 != null) {
                biP2 = biP.c;
            }
            if (biP2 == biP.b) {
                string = "monsters";
            } else if (biP2 == biP.d) {
                string = "hooded";
            }
        }
        return string;
    }

    private static void c(blx_1 blx_12, boolean bl) {
        if (bl && !blx_12.ab_() && blx_12.S_()) {
            for (sd_0 sd_02 : blx_12.dR()) {
                Su su = sd_02.i();
                if (su == null || sd_02.f() == null || sd_02.f().i() != 25274) continue;
                CellParticleSystem cellParticleSystem = aij_0.a().b(78900);
                cellParticleSystem.a(su.G(), (float)su.H(), (float)su.I());
                cellParticleSystem.j(2000);
                aik_0.a().b(cellParticleSystem);
            }
        }
    }

    public static String a(blx_1 blx_12) {
        boolean bl;
        ani_2 ani_22 = new ani_2();
        String string = bae.h().a("levelShort.custom", blx_12.dr());
        ani_22.a((CharSequence)blx_12.dp()).a('\n').a('(').a((CharSequence)string);
        boolean bl2 = bl = blx_12.bM() != 0;
        if (bl) {
            fgY fgY2 = blx_12.fE().y();
            String string2 = bae.h().a("nation.pvpRank." + fgY2, new Object[0]);
            ani_22.a((CharSequence)", ").a((CharSequence)string2).a(')');
        } else {
            ani_22.a(')');
        }
        return ani_22.toString();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String a(blx_1 blx_12, boolean bl) {
        Object object;
        Object object2;
        boolean bl2;
        ani_2 ani_22 = new ani_2();
        bmr_1 bmr_12 = azu_0.j().k();
        boolean bl3 = bl2 = blx_12.gO() == 1550;
        if (biL.a(blx_12)) {
            biL.a(ani_22);
        }
        ani_22.a();
        if (blx_12.bz() != null) {
            ani_22.a((CharSequence)blx_12.gd());
            int n = blx_12.c(eps_0.b) + blx_12.c(eps_0.T);
            object2 = blx_12.a_(eps_0.b);
            object = blx_12.a_(eps_0.T);
            float f2 = (float)n / (float)(((epa_1)object2).c() + ((epa_1)object).c());
            ani_22.a((CharSequence)" (").a((CharSequence)bae.h().a("hp.var", n)).a((CharSequence)" - ").d((int)(f2 * 100.0f)).a((CharSequence)"%").a((CharSequence)")");
            float f3 = blx_12.hp();
            if (f3 > 1.0f) {
                ani_22.m().a((CharSequence)bae.h().a("desc.healRes", (int)f3));
            }
        } else {
            Object object3;
            if (bl) {
                ani_22.a((CharSequence)"[").a(blx_12.a_()).a((CharSequence)"] ");
            }
            if (blx_12 instanceof bmv_1 && (blx_12.ab_() || blx_12.a(erl_2.o))) {
                ani_22.a((CharSequence)bae.h().a("npc.corpse", new Object[0]));
            }
            ani_22.i();
            if (blx_12 instanceof bnh_1) {
                if (biM.b()) {
                    ani_22.a(azf_2.u);
                } else {
                    object3 = ((emh_0)((Object)blx_12)).N_().k().b(emt_0.i);
                    if (object3 != null && ((ems_0)object3).b() == (long)epj.l) {
                        ani_22.a(azf_2.y);
                    }
                }
            }
            ani_22.a((CharSequence)blx_12.gd());
            ani_22.j();
            if (bl) {
                ani_22.a((CharSequence)" (").d(blx_12.G()).a((CharSequence)";").d(blx_12.H()).a((CharSequence)") ");
            }
            if (blx_12.bo()) {
                ani_22.a((CharSequence)" (").a((CharSequence)bae.h().a("levelShort.custom", blx_12.dr()));
                try {
                    object3 = blx_12.dx();
                    if (object3 != null && ((ezm_1)object3).d().c() != -1) {
                        ani_22.a(' ').a(bac.a(116), 10, 12, null, null);
                    }
                }
                catch (gm_0 gm_02) {
                    b.error((Object)"Exception trying to getNameAndLevel", (Throwable)gm_02);
                }
                finally {
                    ani_22.a((CharSequence)")");
                }
            }
        }
        if (biM.d(blx_12, bl2)) {
            ani_22.a((CharSequence)"\n").a((CharSequence)bae.h().a("owners.summoning", blx_12.ar().dp()));
        }
        if (blx_12 instanceof bmv_1 && blx_12.a(erl_2.aq)) {
            ani_22.a((CharSequence)"\n").a((CharSequence)bae.h().a("companionOwnedBy", blx_12.aq().dp()));
        }
        if (blx_12 instanceof bmv_1 && !blx_12.ab_() && !blx_12.a(erl_2.o) && !bl2) {
            ani_22.a((CharSequence)"\n(").a((CharSequence)bae.h().a("levelShort.custom", blx_12.dr()));
            ani_22.a((CharSequence)")");
        }
        if (blx_12.p()) {
            ani_22.a((CharSequence)" ").a((CharSequence)bae.h().a("koMessage", blx_12.c(eps_0.l)));
        }
        ani_22.b();
        if (bmr_12.bz() != null && blx_12.bA() == bmr_12.bA() && blx_12.a_() != bmr_12.a_()) {
            biM.a(ani_22, blx_12, bmr_12);
        }
        if (bl2) {
            blx_12 = blx_12.aq();
        }
        faV faV2 = bmr_12.fE();
        if (blx_12 instanceof bmv_1) {
            object2 = (bMn)blx_12.aa_();
            if (object2 != null) {
                object = ((fgy_0)object2).D();
                int n = ((faX)object).c();
                ani_2 ani_23 = new ani_2();
                ani_23.i();
                ani_23.a(bUK.a(faV2, (faX)object).w());
                ani_23.a((CharSequence)bae.h().a(39, (long)n, new Object[0])).j();
                ani_22.a((CharSequence)"\n").a((CharSequence)ani_23.toString());
            }
        } else if (blx_12 instanceof bnh_1) {
            String string;
            object2 = (bnh_1)blx_12;
            object = ((bnh_1)object2).eL();
            if (object != null && ((bQF)object).c() && (string = ((bQF)object).a(((epq_2)object2).gX())) != null) {
                if (cbm_1.a.a((blx_1)object2)) {
                    ani_22.m().a(((bQF)object).f().b()).a((CharSequence)string).j();
                } else {
                    ani_22.m().a((CharSequence)string);
                }
            }
            if (((bnh_1)object2).eZ()) {
                bos_2 bos_22 = ((bnh_1)object2).eV();
                ani_22.m().a((CharSequence)bos_22.a());
            }
        }
        return ani_22.r();
    }

    private static boolean d(blx_1 blx_12, boolean bl) {
        return blx_12.C_() && !bl && blx_12.ar() != blx_12;
    }

    private static void a(ani_2 ani_22, blx_1 blx_12, bmr_1 bmr_12) {
        if (bmr_12.ev() == epn_2.m) {
            biM.b(ani_22, blx_12, bmr_12);
            return;
        }
        if (bmr_12.ev() == epn_2.f) {
            biM.a(ani_22, blx_12);
            return;
        }
    }

    private static void a(ani_2 ani_22, blx_1 blx_12) {
        epa_1 epa_12 = blx_12.a_(eps_0.b);
        epa_1 epa_13 = blx_12.a_(eps_0.T);
        float f2 = (float)(epa_12.a() + epa_13.a()) / (float)(epa_12.c() + epa_13.c());
        ani_22.m().i();
        if (0.35f > f2) {
            ani_22.a(azf_2.j.w());
        } else {
            ani_22.a(azf_2.o.w());
        }
        ani_22.a((CharSequence)bae.h().a("hasBledDryBonus", (int)(f2 * 100.0f))).j();
    }

    private static void b(ani_2 ani_22, blx_1 blx_12, bmr_1 bmr_12) {
        epa_1 epa_12 = blx_12.a_(eps_0.b);
        epa_1 epa_13 = blx_12.a_(eps_0.T);
        float f2 = (float)(epa_12.a() + epa_13.a()) / (float)(epa_12.c() + epa_13.c());
        epa_1 epa_14 = bmr_12.a_(eps_0.b);
        epa_1 epa_15 = bmr_12.a_(eps_0.T);
        float f3 = (float)(epa_14.a() + epa_15.a()) / (float)(epa_14.c() + epa_15.c());
        if (f3 < f2) {
            ani_22.m().i().a(azf_2.j.w()).a((CharSequence)bae.h().a("hasMoreLife", new Object[0])).j();
        }
    }

    public static void b(biI biI2) {
        dbm_0.a().a(biI2);
        blx_1 blx_12 = biI2.bI();
        if (blx_12 == null) {
            return;
        }
        if (blx_12 instanceof bmv_1) {
            bon_1 bon_12 = boq_1.a().a(((bmv_1)blx_12).cL());
            if (!blx_12.ak() && bon_12 != null) {
                for (bop_1 bop_12 : bon_12.b()) {
                    blx_1 blx_13 = bmf_2.a().c(bop_12.a());
                    if (blx_13 == null) continue;
                    blx_13.bv().ad();
                }
            }
        }
        biM.c();
        biM.e(blx_12, false);
    }

    private static void a(boolean bl, blx_1 blx_12, ani_2[] ani_2Array, dhg dhg2) {
        bon_1 bon_12 = boq_1.a().a(((bmv_1)blx_12).cL());
        if (!blx_12.ak() && bon_12 != null) {
            Object object;
            int n = bon_12.d();
            if (bon_12.b().size() > 1) {
                biM.a(dhg2, n);
            }
            if (bl) {
                biM.a(dhg2, bon_12.e());
                object = blx_12.aa_();
                if (object != null) {
                    biM.d(dhg2, ((fgy_0)object).B());
                }
            }
            object = bon_12.b();
            int n2 = object.size();
            for (int k = 0; k < n2; ++k) {
                bop_1 bop_12 = (bop_1)object.get(k);
                biM.a(bl, blx_12, dhg2, bop_12);
            }
            biM.a(ani_2Array, (double)n);
        }
        if (bl && blx_12.ak()) {
            biM.a(blx_12, ani_2Array);
        }
    }

    public static void a(dhg dhg2, int n) {
        dhg2.b(new ani_2().a().a((CharSequence)bae.h().a("levelShort.custom", n)).b().r());
    }

    public static void b(dhg dhg2, int n) {
        dhg2.d(new ani_2().a().a((CharSequence)bae.h().a("levelShort.custom", n)).b().r());
    }

    public static void c(dhg dhg2, int n) {
        dhg2.e(new ani_2().a().a((CharSequence)bae.h().a("levelShort.custom", n)).b().o().r());
    }

    private static void a(blx_1 blx_12, ani_2[] ani_2Array) {
        ani_2 ani_22 = ani_2Array[1];
        ani_22.m().g().a((CharSequence)"        ").h().m();
        ani_22.i().a("999999").a((CharSequence)"cheap fight debug panel :").m();
        ani_22.a((CharSequence)"summoned=").a(blx_12.C_()).m();
        ani_22.a((CharSequence)blx_12.hA()).j();
    }

    private static void a(ani_2[] ani_2Array, double d2) {
    }

    private static void a(dhg dhg2, double d2) {
        dhg2.c(String.format("<b>Group level: %.2f</b>", d2));
    }

    private static void a(dhg dhg2, long l) {
        dhg2.c(String.format("<b>Group ID: %d</b>", l));
    }

    private static void d(dhg dhg2, int n) {
        dhg2.c(String.format("<b>Protector ID: %d</b>", n));
    }

    public static void a(boolean bl, blx_1 blx_12, dhg dhg2, bop_1 bop_12) {
        Object object;
        Object object2;
        Object object3;
        ani_2 ani_22 = new ani_2();
        bpb_1 bpb_12 = bpc_1.a().a(bop_12.b());
        epw_1 epw_12 = epx_1.b().a(bpb_12.t());
        bMn bMn2 = (bMn)blx_12.aa_();
        int n = blx_12.a(erl_2.z) && bMn2 == null ? 0 : epw_12.e();
        bmr_1 bmr_12 = azu_0.j().k();
        biP biP2 = biP.b;
        if (n == 0) {
            biP2 = biP.a;
        }
        if (bMn2 != null) {
            biP2 = biP.c;
        }
        if (box_2.a(blx_12)) {
            biP2 = biP.d;
        }
        if (bop_12.a() == blx_12.a_() && biP2 != biP.a) {
            ani_22.a();
        }
        ani_22.a((CharSequence)bop_12.a(bl, biP2));
        if (bop_12.a() == blx_12.a_() && biP2 != biP.a) {
            ani_22.b();
        }
        boi_2 boi_22 = biM.a(bop_12, bpb_12);
        if (bMn2 != null) {
            if (bMn2.e() == blx_12.a_()) {
                boi_22 = boi_2.f;
            }
            object3 = bMn2.D();
            int n2 = ((faX)object3).c();
            object2 = bmr_12.fE();
            object = object2.m();
            if (!emp_0.a(azu_0.j().n().v(), emp_0.b)) {
                ani_22.a((CharSequence)" (").d(bMn2.B()).a((CharSequence)")");
            }
            ani_22.m().i();
            ani_22.a(bUK.a((faV)object2, (faX)object3).w());
            ani_22.a((CharSequence)bae.h().a(39, (long)n2, new Object[0])).j();
        }
        object3 = null;
        if (blx_12 instanceof bmv_1 && ((bmv_1)blx_12).cQ() > 0L) {
            bmv_1 bmv_12 = (bmv_1)blx_12;
            object3 = biM.a(bmv_12.cW().s());
        } else if (n != 0 && !cd_0.b((String)(object3 = boi_22.a(n)))) {
            object3 = boi_22.a(0);
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        object2 = bwy_2.h().j();
        if (object2 != null && ((fgp_0)(object = ((bMn)object2).y())).i(epw_12.b())) {
            arrayList.add(azs_0.a().a("ecosystemProtectedIconPath", "defaultIconPath", new Object[0]));
            dhg2.a(azf_2.h);
        }
        if (bmr_12.ev() == epn_2.d && bpb_12.a(eoz_1.N)) {
            arrayList.add(azs_0.a().a("osamodasMonsterIconPath", "defaultIconPath", new Object[0]));
        }
        if (blx_12.ak()) {
            boolean bl2;
            boolean bl3 = blx_12.bw().f() == blx_12.Y();
            boolean bl4 = bl2 = blx_12.ha() || blx_12.ab_();
            if (bl3) {
                dhg2.a(ani_22.toString(), null, (String)object3, null, bl2);
            } else {
                dhg2.b(ani_22.toString(), null, (String)object3, null, bl2);
            }
        } else {
            dhg2.a(ani_22.r(), (String)object3, arrayList);
        }
        bmv_1 bmv_13 = (bmv_1)bmf_2.a().c(bop_12.a());
        if (bmv_13 != null) {
            aNC.a(bmv_13.bv());
        }
    }

    private static String a(short s2) {
        try {
            return gg_0.a(azs_0.a().a("companionInFightIconsPath"), new Object[]{s2});
        }
        catch (gm_0 gm_02) {
            gm_02.printStackTrace();
            return null;
        }
    }

    private static boi_2 a(bop_1 bop_12, bpb_1 bpb_12) {
        switch (bpb_12.i()) {
            case f: {
                return boi_2.c;
            }
            case i: {
                return boi_2.b;
            }
        }
        return boi_2.a(azu_0.j().k().dr(), bop_12.c());
    }

    public static String b(blx_1 blx_12, boolean bl) {
        if (!(blx_12 instanceof bnh_1)) {
            return null;
        }
        bnh_1 bnh_12 = (bnh_1)blx_12;
        long l = bnh_12.fc();
        if (l <= 0L) {
            if (bl) {
                try {
                    return String.format(azs_0.a().a("guildBlazonBackgroundPartPath"), 5);
                }
                catch (gm_0 gm_02) {
                    return null;
                }
            }
            return null;
        }
        eqd_2 eqd_22 = new eqd_2(bnh_12.cX() ? bnh_12.fa() : bnh_12.eV().b());
        bxo_1 bxo_12 = new bxo_1(eqd_22.a(), eqd_22.c(), bxm_1.a().a(eqd_22.d()), bxm_1.a().a(eqd_22.b()));
        bxp_1.a().a(bxo_12);
        bxo_12.e();
        return String.valueOf(bxo_12.g());
    }

    private static void e(blx_1 blx_12, boolean bl) {
        bmr_1 bmr_12 = azu_0.j().k();
        bvx_2 bvx_22 = bmr_12.cP();
        if (bvx_22 != null && bvx_22.c() == blx_12.bA()) {
            bvx_22.A().a(blx_12, bl);
            if (bl) {
                ddy_0.a().d().a(blx_12);
            } else {
                ddy_0.a().d().O();
            }
        }
    }

    private static boolean a() {
        if (cYS.o().k()) {
            return true;
        }
        if (cyy_0.o().k()) {
            return true;
        }
        return cYZ.o().k();
    }

    private static boolean b() {
        return wc_0.p().a().d(g) && wc_0.p().a().b(h);
    }

    private static void a(bwh_0 bwh_02) {
        c.a();
        c.a(bwh_02);
        long l = (long)(((bvx_0)ans_0.D().h()).c(bWe.Q) * 1000.0f);
        adi_2.a().a(c, l, 0, 1L);
    }

    private static void c() {
        c.a();
    }
}

