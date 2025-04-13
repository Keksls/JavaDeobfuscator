/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.set.hash.TIntHashSet;
import java.io.Serializable;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from dab
 */
public class dab_0
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(dab_0.class);
    private static final dab_0 c = new dab_0();
    public static final int b = 30;
    final ArrayList<String> d = new ArrayList();
    String e;
    private ans_1 f;

    public static dab_0 a() {
        return c;
    }

    private void c() {
        for (String string : this.d) {
            fpm_0.b().o(string);
        }
        this.d.clear();
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (azu_0.j().n().a(adt_12.a())) {
            return false;
        }
        switch (adt_12.a()) {
            case 19922: {
                anw_1 anw_12 = (anw_1)adt_12;
                int n = anw_12.c();
                ece_0 ece_02 = bgg.a.b();
                ArrayList<Integer> arrayList = new ArrayList<Integer>(brj_1.a.a(n, ece_02));
                arrayList.sort(Integer::compareTo);
                if (arrayList.isEmpty()) {
                    return false;
                }
                int n2 = -1;
                Object object = arrayList.iterator();
                while (object.hasNext()) {
                    int n3 = (Integer)object.next();
                    if (!ece_02.e(n3)) continue;
                    n2 = n3;
                    break;
                }
                if (!azu_0.j().c(cxa_0.a())) {
                    azu_0.j().a(cxa_0.a());
                }
                if (n2 != -1) {
                    object = new dfc();
                    ((anw_1)object).a_(19554);
                    ((anw_1)object).b(n2);
                    add_2.b().a((adt_1)object);
                }
                object = new dfc();
                ((anw_1)object).a_(19731);
                ((anw_1)object).b(n);
                add_2.b().a((adt_1)object);
                return false;
            }
            case 17220: {
                dgM dgM2 = (dgM)adt_12;
                bhd_1 bhd_12 = (bhd_1)dgM2.k();
                String string = dgM2.o();
                if (bhd_12 == null) {
                    if (string == null) {
                        return false;
                    }
                    fpm_0.b().o(string);
                    if (this.d.isEmpty()) {
                        azu_0.j().b(this);
                    }
                    return false;
                }
                String string2 = "setDetailDialog";
                String string3 = "setDetailDialog_" + bhd_12.h();
                this.a(dgM2, bhd_12, string, "setDetailDialog", string3, dgM2.r());
                return false;
            }
            case 17713: 
            case 18168: 
            case 19026: {
                dgO dgO2 = (dgO)adt_12;
                bMd bMd2 = (bMd)dgO2.k();
                if (bMd2 == null) {
                    a.error((Object)"Impossible de r\u00e9cup\u00e9rer le familier \u00e0 d\u00e9crire");
                    return false;
                }
                String string = dgO2.o();
                if (adt_12.a() == 18168) {
                    this.a(dgO2, bMd2, string, "itemDetailDialogLocal", this.a(bMd2.h(), true, dgO2.r()), dgO2.r());
                } else if (adt_12.a() == 19026) {
                    this.b(dgO2, bMd2, string, "itemDetailDialog", this.a(bMd2.h(), false, dgO2.r()), dgO2.r());
                } else {
                    dab_0.a(this.a(bMd2.h(), false, dgO2.r()));
                    dab_0.a(this.a(bMd2.h(), true, dgO2.r()));
                }
                return false;
            }
            case 16490: {
                dgF dgF2 = (dgF)adt_12;
                brw_0 brw_02 = (brw_0)dgF2.k();
                String string = dgF2.o();
                if (brw_02 == null) {
                    if (string == null) {
                        return false;
                    }
                    fpm_0.b().o(string);
                    if (this.d.isEmpty()) {
                        azu_0.j().b(this);
                    }
                    return false;
                }
                bjw_1 bjw_12 = brw_02.h();
                int n = bjw_12 != null ? bjw_12.n() : -1;
                String string4 = "craftItemDetailDialog";
                String string5 = "craftItemDetailDialog_" + n;
                this.a(dgF2, brw_02, string, "craftItemDetailDialog", string5, dgF2.r());
                return false;
            }
            case 16130: 
            case 16236: 
            case 17123: {
                boolean bl;
                dgK dgK2 = (dgK)adt_12;
                exk_2 exk_22 = (exk_2)dgK2.k();
                String string = dgK2.o();
                if (exk_22 == null) {
                    if (string == null) {
                        return false;
                    }
                    fpm_0.b().o(string);
                    if (this.d.isEmpty()) {
                        azu_0.j().b(this);
                    }
                    return false;
                }
                bjz_2 bjz_22 = null;
                if (exk_22.w()) {
                    exk_22 = exk_22.v();
                    bjz_22 = new bjz_2(exk_22);
                }
                String string6 = "itemDetailDialog_" + exk_22.a() + (Serializable)(dgK2.r() ? Character.valueOf('h') : "");
                String string7 = "itemDetailDialogLocal_" + exk_22.a() + (Serializable)(dgK2.r() ? Character.valueOf('h') : "");
                if (adt_12.a() == 16130) {
                    bl = this.a(dgK2, exk_22, string, "itemDetailDialogLocal", string7, dgK2.r());
                } else if (adt_12.a() == 17123) {
                    this.b(dgK2, exk_22, string, "itemDetailDialog", string6, dgK2.r());
                    bl = true;
                } else {
                    dab_0.a(string6);
                    dab_0.a(string7);
                    bl = false;
                }
                if (bl && bjz_22 != null) {
                    fis_1.a().a("itemLevelController", bjz_22, fpm_0.b().h().d(string6), true);
                }
                return false;
            }
            case 17408: {
                bvx_2 bvx_22 = azu_0.j().k().bz();
                if (bvx_22 != null && bvx_22.e() != elp_0.b) {
                    return false;
                }
                bmr_1 bmr_12 = cyt_0.s();
                if (bmr_12.ab_()) {
                    aUh.a("action.error.cantWhileDead", new Object[0]);
                    return false;
                }
                dgL dgL2 = (dgL)adt_12;
                bmk_1 bmk_12 = dgL2.x();
                exk_2 exk_23 = dgL2.o();
                exg_2 exg_22 = bmr_12.da().a(exk_23);
                if (!bmk_12.k() && !bmr_12.R_().f(exk_23)) {
                    return false;
                }
                if (exg_22 == null) {
                    fpm_0.b().a(bae.h().a("error.bagFull", new Object[0]), cfn_0.a(1), 1027L, 102, 1);
                    return false;
                }
                long l = exg_22.f();
                if (l == -1L) {
                    return false;
                }
                try {
                    if (!exg_22.a(dgL2.o())) {
                        return false;
                    }
                }
                catch (Exception exception) {
                    return false;
                }
                if (bmk_12.k()) {
                    long l2 = ((bqU)bmk_12).w();
                    long l3 = exk_23.a();
                    short s2 = -1;
                    if (s2 == -1 && (s2 = (short)exg_22.c(exk_23)) == -1) {
                        s2 = exg_22.l();
                    }
                    cmk cmk2 = new cmk(l2, l3, l, s2);
                    azu_0.j().K().c(cmk2);
                }
                fis_1.a().a((ajf_1)azu_0.j().k(), "actorEquipment");
                return false;
            }
            case 18594: {
                blx_1 blx_12;
                bvx_2 bvx_23 = azu_0.j().k().bz();
                if (bvx_23 != null && bvx_23.e() != elp_0.b) {
                    return false;
                }
                bmr_1 bmr_13 = azu_0.j().k();
                if (bmr_13.ab_()) {
                    aUh.a("action.error.cantWhileDead", new Object[0]);
                    return false;
                }
                dgL dgL3 = (dgL)adt_12;
                bmk_1 bmk_13 = dgL3.y();
                blx_1 blx_13 = blx_12 = bmk_13 != null ? bmk_13.l() : null;
                if (blx_12 == null) {
                    return false;
                }
                exk_2 exk_24 = dgL3.o();
                exh_2[] exh_2Array = exk_24.U().h();
                if (exh_2Array.length == 0) {
                    bQG.a();
                    bQG.a(60, new Object[0]);
                    return false;
                }
                exq_2 exq_22 = blx_12.R_();
                int n = -1;
                if (dgL3.p() == -1) {
                    for (exh_2 exh_22 : exh_2Array) {
                        if (exq_22.e(exh_22.A) != null) continue;
                        n = exh_22.A;
                        break;
                    }
                }
                if (dgL3.p() == -2) {
                    n = exh_2Array[0].A;
                }
                if (dgL3.p() == -3 && exh_2Array.length > 1) {
                    n = exh_2Array[1].A;
                }
                if (n == -1) {
                    n = exh_2Array[0].A;
                }
                if (bmk_13.k()) {
                    this.a(bmk_13, exk_24, (short)n);
                }
                return false;
            }
            case 18194: {
                bmr_1 bmr_14 = cyt_0.s();
                bvx_2 bvx_24 = bmr_14.bz();
                if (bvx_24 != null && bvx_24.e() != elp_0.b) {
                    return false;
                }
                if (flC.a(bmr_14.hB())) {
                    a.warn((Object)("Cannot groupe items from heroes with occupation " + bmr_14.eE()));
                    return false;
                }
                dgN dgN2 = (dgN)adt_12;
                bmk_1 bmk_14 = dgN2.o();
                bmk_1 bmk_15 = dgN2.k();
                if (bmk_14 == null || bmk_15 == null || bmk_15.equals(bmk_14)) {
                    return false;
                }
                if (bmk_14.k() || bmk_15.k()) {
                    return false;
                }
                bmr_1 bmr_15 = (bmr_1)euw_2.a.d(bmk_15.l().a_());
                exk_2[] exk_2Array = bmr_15.da().e();
                ArrayList<Long> arrayList = new ArrayList<Long>();
                for (exk_2 exk_25 : exk_2Array) {
                    exg_2 exg_23;
                    boolean bl;
                    if (!this.a(bmr_15, exk_25) || !(bl = exk_25.U().m()) || exk_25.U().i() && exk_25.y()) continue;
                    long l = exk_25.a();
                    blx_1 blx_14 = bmk_14.l();
                    exg_2 exg_24 = bmr_15.da().f(l);
                    exg_2 exg_25 = blx_14.dS().e(exk_25);
                    exg_2 exg_26 = exg_23 = exg_25 != null ? exg_25 : blx_14.dS().b(exk_25);
                    if (exg_23 == null) continue;
                    short s3 = exg_25 != null ? exg_23.c(exk_25) : exg_23.l();
                    try {
                        if (evj_2.a().a(exg_24.g(), exg_23.g(), s3, exk_25, exk_25.e(), null, bmr_15, bmr_15.ge()) != 0) continue;
                        arrayList.add(l);
                    }
                    catch (Uy | uz_0 ua_02) {
                        a.error((Object)("Error while trying to add item : " + exk_25 + " in bag : " + exg_23.f()), (Throwable)ua_02);
                    }
                }
                if (arrayList.isEmpty()) {
                    return false;
                }
                cnu_0 cnu_02 = new cnu_0();
                cnu_02.a(bmk_14.l().a_());
                cnu_02.g(bmk_15.l().a_());
                cnu_02.a(arrayList);
                azu_0.j().K().c(cnu_02);
                return false;
            }
            case 16942: {
                bmr_1 bmr_16 = cyt_0.s();
                bvx_2 bvx_25 = bmr_16.bz();
                if (bvx_25 != null && bvx_25.e() != elp_0.b) {
                    return false;
                }
                if (flC.a(bmr_16.hB())) {
                    a.warn((Object)("Cannot move items between heroes with occupation " + bmr_16.eE()));
                    return false;
                }
                dgL dgL4 = (dgL)adt_12;
                bmk_1 bmk_16 = dgL4.y();
                long l = dgL4.t();
                if (bmk_16 == null) {
                    bmk_16 = bzg_1.a.a((bnh_1)euu_2.b(azu_0.j().k().U_(), l));
                }
                bmk_1 bmk_17 = dgL4.x();
                bmr_1 bmr_17 = (bmr_1)euw_2.a.d(bmk_17.l().a_());
                exk_2 exk_26 = dgL4.o();
                short s4 = dgL4.r();
                if (bmk_16 != null && bmk_17 != null && !bmk_17.equals(bmk_16)) {
                    long l4 = exk_26.a();
                    if (!bmk_16.k() && !bmk_17.k()) {
                        exk_2 exk_27;
                        if (!this.a(bmr_17, exk_26)) {
                            aUh.a("item.error.badBind", new Object[0]);
                            return false;
                        }
                        blx_1 blx_15 = bmk_16.l();
                        exh_1 exh_12 = blx_15.dS();
                        exg_2 exg_27 = exh_12.d(l);
                        if (exg_27 != null && (exk_27 = exg_27.a(s4)) != null && bmk_17.f() != bmk_16.f() && !this.a(blx_15, exk_27)) {
                            aUh.a("item.error.badBind", new Object[0]);
                            return false;
                        }
                        bmr_17.a(exk_26, dgL4.u(), s4, dgL4.s(), l);
                    } else if (bmk_16.k()) {
                        this.a(bmk_16, exk_26, s4);
                    } else {
                        long l5 = ((bqU)bmk_17).w();
                        long l6 = l;
                        cmk cmk3 = new cmk(l5, l4, l6, s4);
                        azu_0.j().K().c(cmk3);
                    }
                } else {
                    bmr_17.a(exk_26, dgL4.u(), s4, dgL4.s(), l);
                }
                if (fpm_0.b().q("splitStackDialog")) {
                    fpm_0.b().o("splitStackDialog");
                }
                fis_1.a().a((ajf_1)azu_0.j().k(), "actorEquipment");
                return false;
            }
            case 16568: {
                dgL dgL5 = (dgL)adt_12;
                cnV cnV2 = new cnV(dgL5.o().aT_(), dgL5.y().l().a_());
                aaw_2 aaw_22 = azu_0.j().K();
                if (aaw_22 != null) {
                    aaw_22.c(cnV2);
                }
                return false;
            }
            case 19313: {
                dgL dgL6 = (dgL)adt_12;
                bmr_1 bmr_18 = (bmr_1)euw_2.a.d(dgL6.y().l().a_());
                if (bmr_18.bz() != null || bvz_2.a.a()) {
                    return false;
                }
                if (bmr_18.a(erl_2.ax)) {
                    aUA.a(erl_2.ax.b());
                    return false;
                }
                exk_2 exk_28 = dgL6.o();
                if (exk_28 != null && exk_28.T().a(exz_1.d) != null && exk_28.T().a(exz_1.h) != null && !exk_28.T().a(exz_1.d).b(bmr_18, bmr_18.P_(), exk_28, bmr_18.ge()) && !exk_28.T().a(exz_1.h).b(bmr_18, bmr_18.P_(), exk_28, bmr_18.ge())) {
                    bjy_1.a(exk_28);
                    return false;
                }
                fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("question.deleteItem", exk_28.N()), cfn_0.a(0), 2073L, 102, 1);
                fzm_02.a(new dac_0(this, exk_28));
                return false;
            }
            case 17597: {
                dhs dhs2 = (dhs)adt_12;
                bmr_1 bmr_19 = cyt_0.s();
                bmr_1 bmr_110 = bzf_1.a();
                if (bmr_110 != null && bmr_110.ab_()) {
                    aUh.a("action.error.cantWhileDead", new Object[0]);
                    return false;
                }
                exk_2 exk_29 = dhs2.k();
                if (exk_29 == null || !exk_29.W()) {
                    return false;
                }
                if (azu_0.j().c(dej_0.a()) && dej_0.a().c() == exk_29) {
                    azu_0.j().b(dej_0.a());
                    return false;
                }
                ezr_0<?> ezr_02 = exk_29.T();
                switch (((bjw_1)ezr_02).j()) {
                    case a: {
                        this.a(bmr_19, exk_29, ezr_02);
                        break;
                    }
                    case c: 
                    case b: {
                        dej_0.a().a(exk_29);
                        dej_0.a().a(bmr_19);
                        azu_0.j().a(dej_0.a());
                        break;
                    }
                }
                return false;
            }
            case 17155: {
                anw_1 anw_13 = (anw_1)adt_12;
                long l = anw_13.d();
                bmr_1 bmr_111 = (bmr_1)euu_2.c(azu_0.j().k().U_(), l);
                bpc_2 bpc_22 = bmr_111.eE();
                if (bpc_22 != null && bpc_22.ac_() == 24) {
                    return false;
                }
                exk_2 exk_210 = bmr_111.da().i(l);
                if (exk_210 == null) {
                    return false;
                }
                short s5 = exk_210.T().x();
                bhd_1 bhd_13 = bhe_0.a().a(s5);
                if (bhd_13 == null) {
                    a.warn((Object)"On essaye de merger un itemSet inexistant");
                    return false;
                }
                if (!eya_2.a(bhd_13)) {
                    a.warn((Object)("Le set d'id=" + s5 + " n'est pas mergeable."));
                    return false;
                }
                boolean bl = eya_2.a((epq_2)bmr_111, (exo_2<? extends ezr_0>)bhd_13, true);
                if (bl) {
                    cnt_0 cnt_02 = new cnt_0();
                    cnt_02.a(s5);
                    cnt_02.a(bmr_111.a_());
                    azu_0.j().K().c(cnt_02);
                }
                return false;
            }
            case 16321: {
                dfc dfc2 = (dfc)adt_12;
                cnX cnX2 = new cnX();
                cnX2.a(dfc2.d());
                azu_0.j().K().c(cnX2);
                return false;
            }
        }
        return true;
    }

    private void a(bmr_1 bmr_12, exk_2 exk_22, ezr_0 ezr_02) {
        if (ezr_02.p() == null && exk_22.iterator().hasNext()) {
            int n = exk_22.aT_();
            boolean bl = this.a(n);
            if (bl) {
                this.a(exk_22, bmr_12);
            } else {
                this.a(exk_22);
            }
        }
        if (!dab_0.a(bmr_12, exk_22, bmr_12.gg())) {
            return;
        }
        big_1 big_12 = (big_1)exk_22.T().p();
        if (big_12 instanceof bja_2) {
            return;
        }
        aUh.b("chat.item.selfUse", aUi.a(exk_22));
    }

    private boolean a(blx_1 blx_12, exk_2 exk_22) {
        boolean bl = exk_22.ab();
        if (bl && exk_22.n().a().g()) {
            return false;
        }
        apc_2 apc_22 = exk_22.T().a(exz_1.e);
        boolean bl2 = apc_22 == null || apc_22.b(blx_12, euu_2.d(blx_12.U_()), exk_22, blx_12.ge());
        return bl2;
    }

    private boolean a(int n) {
        dai[] daiArray = dai.values();
        for (int k = 0; k < daiArray.length; ++k) {
            dai dai2 = daiArray[k];
            if (n != dai2.f) continue;
            return true;
        }
        return false;
    }

    private void a(exk_2 exk_22, bmr_1 bmr_12) {
        String string;
        Object object;
        int n = exk_22.aT_();
        boolean bl = false;
        TIntHashSet tIntHashSet = new TIntHashSet();
        dai dai2 = dai.a(n);
        if (dai2 == null) {
            this.a(exk_22);
            return;
        }
        int[] nArray = dai2.g;
        for (int k = 0; k < nArray.length; ++k) {
            int n2 = nArray[k];
            if (!bmr_12.d_(n2)) continue;
            bl = true;
            tIntHashSet.add(n2);
        }
        if (!bl || tIntHashSet.isEmpty()) {
            this.a(exk_22);
            return;
        }
        if (tIntHashSet.size() == 1) {
            object = bae.h().a(8, (long)tIntHashSet.toArray()[0], new Object[0]);
            string = bae.h().a("question.willUnapplyState", object);
        } else {
            object = bae.h().a(8, (long)tIntHashSet.toArray()[0], new Object[0]);
            String string2 = bae.h().a(8, (long)tIntHashSet.toArray()[1], new Object[0]);
            string = bae.h().a("question.willUnapplyState.2", object, string2);
        }
        object = fpm_0.b().a(string, cfn_0.a(0), 2073L, 102, 1);
        ((fzm_0)object).a(new dad_0(this, exk_22));
    }

    void a(exk_2 exk_22) {
        clw_0 clw_02 = new clw_0();
        clw_02.a(exk_22.a());
        azu_0.j().K().c(clw_02);
    }

    private void a(bmk_1 bmk_12, exk_2 exk_22, short s2) {
        bqU bqU2 = (bqU)bmk_12;
        long l = bqU2.w();
        byte by = (byte)s2;
        long l2 = exk_22.a();
        exq_2 exq_22 = bqU2.m();
        eyr_1 eyr_12 = ((exf_1)exq_22.e()).b(exk_22, bqU2.l(), bqU2.l().Q_());
        if (eyr_12 != eyr_1.a) {
            aUh.a("equipment.build.error." + eyr_12.name(), new Object[0]);
            return;
        }
        if (exk_22.aa() && !exk_22.ab() && !exk_22.n().a().c()) {
            String string = bae.h().a("item.bound.onEquipQuestion", new Object[0]);
            fzn_0 fzn_02 = new fzn_0(102, 0, string, null, cfn_0.a(8), 24L);
            fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
            fzm_02.a(new dae_0(this, l, by, l2));
        } else {
            cmh cmh2 = new cmh(l, by, l2);
            azu_0.j().K().c(cmh2);
        }
    }

    public static boolean a(blx_1 blx_12, exk_2 exk_22, aff_1 aff_12) {
        big_1 big_12 = (big_1)exk_22.T().p();
        if (big_12 != null && !blx_12.ak()) {
            bua_0.a.a(new buk_2(exk_22.T()));
            big_12.a(aff_12);
            return big_12.b(exk_22) && big_12.a(exk_22);
        }
        return false;
    }

    private boolean a(dgE dgE2, Object object, String string, String string2, String string3, boolean bl) {
        if (!fpm_0.b().q(string3) && this.d.size() < 30) {
            this.b(dgE2, object, string, string2, string3, bl);
            return true;
        }
        dab_0.a(string3);
        return false;
    }

    private static void a(String string) {
        if (fpm_0.b().q(string)) {
            fpm_0.b().o(string);
        }
    }

    private void b(dgE dgE2, Object object, String string, String string2, String string3, boolean bl) {
        fvk_0 fvk_02;
        if (fpm_0.b().q(string3) || this.d.size() >= 30) {
            return;
        }
        fkg_1 fkg_12 = new fkg_1();
        fkg_12.b(string3).a(cfi_0.a(string2)).a(129L);
        if (string == null) {
            fvk_02 = (fvk_0)fpm_0.b().a(fkg_12.a());
            fvk_02.a(new daf(this, fvk_02, dgE2));
        } else {
            fkg_12.c(this.e == null ? string : this.e).d(string).f(string2);
            fvk_02 = (fvk_0)fpm_0.b().a(fkg_12.a());
        }
        this.e = string3;
        if (bl) {
            fis_1.a().a("itemPopupDetail", object);
        } else {
            fis_1.a().a("itemDetail", object, fvk_02.getElementMap(), true);
        }
        this.d.add(string3);
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.f = new dag_0(this);
            fpm_0.b().a(this.f);
            fpm_0.b().a("wakfu.itemDetails", chw_0.class);
            cgu_2.a().a(this);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.e = null;
            this.d.clear();
            fpm_0.b().b(this.f);
            fpm_0.b().e("wakfu.itemDetails");
            this.c();
            cgu_2.a().b(this);
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public String a(long l, boolean bl, boolean bl2) {
        if (bl) {
            return "itemDetailDialogLocal_" + l + (bl2 ? "h" : "");
        }
        return "itemDetailDialog_" + l + (bl2 ? "h" : "");
    }
}

