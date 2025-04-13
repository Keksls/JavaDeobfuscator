/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.google.common.primitives.Ints
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TByteIntHashMap
 *  org.apache.commons.lang3.tuple.Pair
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.google.common.base.Stopwatch;
import com.google.common.primitives.Ints;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TByteIntHashMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ceF
 */
public class cef_0
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cef_0.class);
    private static final cef_0 b = new cef_0();
    private static final List<Long> c = new ArrayList<Long>();
    private static final List<Long> d = new ArrayList<Long>();
    private static boolean e = true;

    public static cef_0 a() {
        return b;
    }

    private cef_0() {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 13765: {
                return cef_0.a((crJ)adt_12);
            }
            case 13243: {
                return cef_0.a((crF)adt_12);
            }
            case 13784: {
                return cef_0.a((csn_1)adt_12);
            }
            case 12637: {
                return this.a((cxj_1)adt_12);
            }
            case 12619: {
                return cef_0.a((crI)adt_12);
            }
            case 13661: {
                return cef_0.a((crM)adt_12);
            }
            case 12579: {
                return this.a((crE)adt_12);
            }
            case 12564: {
                return this.a((crN)adt_12);
            }
            case 13506: {
                return cef_0.a((cqw_0)adt_12);
            }
            case 13972: {
                return this.a((cqv_0)adt_12);
            }
            case 13965: {
                return cef_0.a((crO)adt_12);
            }
            case 13004: {
                return cef_0.a((crH)adt_12);
            }
            case 13191: {
                return cef_0.a((crL)adt_12);
            }
            case 13487: {
                return cef_0.a((crh_0)adt_12);
            }
            case 13573: {
                return cef_0.a((crc)adt_12);
            }
            case 13427: {
                return cef_0.a((cre_0)adt_12);
            }
            case 593: {
                return cef_0.a((ckp_1)adt_12);
            }
            case 13602: {
                azu_0.j().k().fE().a(((cwt_2)adt_12).b());
                return false;
            }
            case 13911: {
                ((bUH)azu_0.j().k().fE()).e();
                return false;
            }
            case 12307: {
                return cef_0.a((cyz_1)adt_12);
            }
            case 13458: {
                return cef_0.a((cqx_0)adt_12);
            }
            case 12680: {
                return cef_0.a((crl_0)adt_12, dcv.i);
            }
            case 13396: {
                return cef_0.a((cqu_0)adt_12);
            }
            case 13571: {
                return cef_0.a((cwp_1)adt_12);
            }
            case 12913: {
                return cef_0.a((cra_0)adt_12);
            }
            case 12885: {
                return cef_0.a((cyz_2)adt_12);
            }
            case 13357: {
                throw new UnsupportedOperationException("On ne devrait plus passer par l\u00e0 mais par la GameActionPlayScript");
            }
            case 12083: {
                return cef_0.a((cqz_0)adt_12);
            }
            case 12125: {
                return cef_0.a((cza_2)adt_12);
            }
            case 12396: {
                return cef_0.a((czb_2)adt_12);
            }
            case 13063: {
                return cef_0.a((czc_2)adt_12);
            }
            case 12714: {
                cef_0.b(adt_12);
                return false;
            }
            case 13317: {
                return cef_0.a((cri_0)adt_12);
            }
            case 12660: {
                return cef_0.a((cyj_1)adt_12);
            }
            case 12058: {
                cvt_2 cvt_22 = (cvt_2)adt_12;
                bmr_1 bmr_12 = (bmr_1)bzf_1.a(cvt_22.d());
                if (bmr_12 == null) {
                    return false;
                }
                bmr_12.cB().b(cvt_22.c(), cvt_22.b());
                return false;
            }
            case 12900: {
                cvu_2 cvu_22 = (cvu_2)adt_12;
                bmr_1 bmr_13 = (bmr_1)bzf_1.a(cvu_22.e());
                if (bmr_13 == null) {
                    return false;
                }
                bmr_13.cB().a(cvu_22.d(), cvu_22.b());
                return false;
            }
            case 12606: {
                return cef_0.a((cum_1)adt_12);
            }
            case 12937: {
                return cef_0.a((cul_1)adt_12);
            }
            case 12674: {
                aUh.a("kick.error", new Object[0]);
                return false;
            }
            case 12553: {
                bmr_1 bmr_14 = azu_0.j().k();
                fis_1.a().a((ajf_1)bmr_14, bmr_14.d());
                break;
            }
            case 13312: {
                this.a((cyi_2)adt_12);
                return false;
            }
            case 13884: {
                cef_0.a((cti_1)adt_12);
                return false;
            }
        }
        return true;
    }

    private static boolean a(crJ crJ2) {
        boolean bl = crJ2.b();
        List<crK> list = crJ2.c();
        Comparator<crK> comparator = Comparator.comparing(crK2 -> crK2.c().length);
        list.sort(comparator.reversed());
        list.forEach(crK2 -> cef_0.a(bl, crK2));
        return false;
    }

    private static void a(boolean bl, crK crK2) {
        try {
            cef_0.a(crK2, bl);
        }
        catch (RuntimeException runtimeException) {
            a.error((Object)"Exception raised", (Throwable)runtimeException);
        }
    }

    private static void a(List<crK> list, boolean bl) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        while (stopwatch.elapsed(TimeUnit.MILLISECONDS) < 5L) {
            if (list.isEmpty()) {
                return;
            }
            crK crK2 = list.remove(0);
            long l = crK2.b();
            if (d.contains(l)) {
                d.remove(l);
                continue;
            }
            cef_0.a(crK2, bl);
            c.add(l);
        }
        stopwatch.stop();
        if (list.isEmpty()) {
            return;
        }
        ado_1.a().a(() -> cef_0.a(list, bl));
    }

    private static void a(crK crK2, boolean bl) {
        aoc_2 aoc_22;
        byte by = crK2.a();
        long l = crK2.b();
        byte[] byArray = crK2.c();
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 != null && l == bmr_12.a_()) {
            return;
        }
        if (euw_2.a.d(l) != null) {
            return;
        }
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 != null) {
            if (blx_12.bU()) {
                blx_12.bv().ak();
                bmf_2.a().e(blx_12);
            } else {
                if (bl) {
                    if (!blx_12.P()) {
                        blx_12.c(true);
                    }
                    return;
                }
                bmf_2.a().e(blx_12);
            }
        }
        blx_1 blx_13 = null;
        switch (by) {
            case 0: {
                blx_13 = new bnh_1();
                break;
            }
            case 1: {
                blx_13 = bmv_1.cy();
                break;
            }
            case 4: {
                blx_13 = new bmo_1();
            }
        }
        if (blx_13 == null) {
            return;
        }
        boolean bl2 = false;
        blx_13.b(byArray);
        blx_13.cw();
        if (bl) {
            blx_13.c(true);
        } else {
            blx_13.b(true);
        }
        if (bmf_2.a().a(blx_13)) {
            blx_13.bE();
            if (blx_13.bA() != -1) {
                bl2 = true;
            }
        } else {
            blx_13.cx();
            return;
        }
        if (blx_13 instanceof bnh_1) {
            aoc_22 = (bnh_1)blx_13;
            if (bmr_12.dE().d() && bmr_12.dE().a().f(l)) {
                dbO.a().e(l);
            }
            ((bnh_1)aoc_22).eS();
            ((blx_1)aoc_22).z();
            ((blx_1)aoc_22).bv().cn();
        }
        aoc_22 = blx_13.bv();
        if (bl2) {
            cef_0.a(blx_13, (biI)aoc_22);
        }
        if (blx_13.bV()) {
            blx_13.a((rx_0)eoz_1.f, rz_0.a);
        } else {
            ((abu)aoc_22).Q();
        }
        if (blx_13.gY() == 5) {
            ((biI)aoc_22).c(false);
        }
        if (blx_13 instanceof bmv_1 && blx_13.ab_() && (!blx_13.ak() || blx_13.S_())) {
            ((bmv_1)blx_13).cH();
        }
        aiI.a((aiG)((Object)aoc_22));
    }

    private static boolean a(crF crF2) {
        for (abo_2<Byte, Long> abo_22 : crF2.b()) {
            long l = abo_22.b();
            cef_0.a(crF2, abo_22, l);
        }
        return false;
    }

    private static void a(crF crF2, abo_2<Byte, Long> abo_22, long l) {
        try {
            cef_0.a(l, abo_22.a(), false, crF2.c());
        }
        catch (RuntimeException runtimeException) {
            a.error((Object)"Exception raised", (Throwable)runtimeException);
        }
    }

    private static boolean a(crI crI2) {
        long l = crI2.b();
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 == null) {
            return false;
        }
        biI biI2 = blx_12.bv();
        if (biI2.bb() != null) {
            if (crI2.f()) {
                return false;
            }
            blx_12.a(new biF(blx_12, crI2.c(), crI2.d(), crI2.e()));
        } else {
            fii fii2 = fij.a().a(crI2.c());
            if (fii2 == null) {
                return false;
            }
            bNK bNK2 = bNT.f().c(crI2.d(), crI2.e());
            pj_0 pj_02 = bNK2 == null ? ccm_1.g().a(crI2.h()) : null;
            blx_12.a(bNK2);
            String string = biI2.F();
            String[] stringArray = (bNK2 != null ? fii2.b() : (pj_02 != null ? "AnimCraft-Debut" : "")).split("-");
            if (crI2.f()) {
                String string2 = stringArray[0].isEmpty() ? "AnimStatique" : stringArray[0] + "-Fin";
                biI2.e(string2);
                biI2.bF().c();
            } else if (!string.equals(stringArray[0])) {
                if (bNK2 != null && pj_02 != null) {
                    short s2;
                    int n;
                    int n2;
                    if (bNK2 != null) {
                        n2 = bNK2.G();
                        n = bNK2.H();
                        s2 = bNK2.I();
                    } else {
                        n2 = pj_02.G();
                        n = pj_02.H();
                        s2 = pj_02.I();
                    }
                    aej_2 aej_22 = blx_12.gg().a(n2, n, s2);
                    if (aej_22 == null) {
                        aej_22 = blx_12.gg().b(new aff_1(crI2.d(), crI2.e(), 0));
                    }
                    if (aej_22 != null) {
                        biI2.a(aej_22);
                    }
                }
                if (pj_02 == null) {
                    bOE.a(biI2, fii2);
                } else {
                    biI2.e("AnimCraft-Debut");
                }
            }
        }
        return false;
    }

    private static boolean a(crM crM2) {
        blx_1 blx_12 = bmf_2.a().c(crM2.b());
        if (blx_12 == null) {
            return false;
        }
        biI biI2 = blx_12.bv();
        biI2.aW();
        if (!biI2.c(new aff_1(crM2.c(), crM2.d(), crM2.e()), false, false)) {
            biI2.b((float)crM2.c(), (float)crM2.d(), (float)crM2.e());
        }
        return false;
    }

    private boolean a(crE crE2) {
        blx_1 blx_12 = bmf_2.a().c(crE2.b());
        if (blx_12 == null) {
            return false;
        }
        biI biI2 = blx_12.bv();
        if (biI2.bb() == null || biI2.bb().a() == 0) {
            biI2.a(crE2.c());
            blx_12.bq();
        } else {
            aej_2 aej_22 = crE2.c();
            biI2.b(new ceg_0(this, aej_22));
        }
        return false;
    }

    private boolean a(crN crN2) {
        double d2;
        Object object;
        double d3;
        double d4;
        bmr_1 bmr_12 = azu_0.j().k();
        blx_1 blx_12 = bmf_2.a().c(crN2.b());
        if (blx_12 == null) {
            return false;
        }
        if (blx_12.ak()) {
            a.error((Object)"on ne catche pas un teleport dans les frames de fight ?");
            return true;
        }
        bvx_2 bvx_22 = bmr_12.dm();
        if (bvx_22 != null && blx_12.R() == bmr_12.R()) {
            baa_0.a().b(bvx_22.c());
            bxj_2 bxj_22 = new bxj_2();
            bxj_22.a();
        }
        int n = crN2.c();
        int n2 = crN2.d();
        short s2 = crN2.e();
        a.trace((Object)("T\u00e9l\u00e9portation de l'acteur ID=" + crN2.b() + " vers [" + n + ":" + n2 + ":" + crN2.e() + "]"));
        ace_0 ace_02 = ans_0.D().c();
        if (blx_12 == bmr_12 && !crN2.f() && ((d4 = ((d3 = (double)((ahq_0)(object = ace_02.b())).e_()) - (double)n) * (d3 - (double)n) + ((d2 = (double)((ahq_0)object).f_()) - (double)n2) * (d2 - (double)n2)) > 400.0 || crN2.g())) {
            long l = YX.a();
            aND.f().a(l);
            YX.a(ace_02, n, n2, s2);
        }
        if (blx_12 != bmr_12) {
            cef_0.a(blx_12, n, n2, s2, crN2.f());
        } else {
            object = bmr_12.bv();
            ceh_0 ceh_02 = new ceh_0(this, blx_12, n, n2, crN2);
            ((afv)object).c(ccm_1.g());
            cef_0.a(blx_12, n, n2, s2, crN2.f());
            ((afv)object).a(ccm_1.g());
            if (auy_2.a().b()) {
                auy_2.a().a(ceh_02);
            } else {
                ceh_02.c();
            }
        }
        return false;
    }

    private static boolean a(cqw_0 cqw_02) {
        blx_1 blx_12 = bmf_2.a().c(cqw_02.b());
        if (blx_12 == null) {
            return false;
        }
        biI biI2 = blx_12.bv();
        ael_2 ael_22 = cqw_02.c();
        biI2.a(ael_22);
        if (blx_12 instanceof bnh_1) {
            a.trace((Object)("Update de chemin re\u00e9ue pour le personnage " + blx_12.dp() + "(" + blx_12.a_() + ") : currentPos=[" + biI2.be() + ":" + biI2.bf() + "] newPath=" + ael_22));
        }
        return false;
    }

    private boolean a(cqv_0 cqv_02) {
        blx_1 blx_12 = bmf_2.a().c(cqv_02.b());
        if (blx_12 == null) {
            return false;
        }
        this.a(cqv_02, blx_12, cqv_02.g());
        return false;
    }

    private static boolean a(crH crH2) {
        rx_0 rx_02 = crH2.c();
        if (rx_02 == null) {
            return false;
        }
        blx_1 blx_12 = bmf_2.a().c(crH2.b());
        if (blx_12 == null) {
            return false;
        }
        switch (crH2.d()) {
            case c: {
                blx_12.c(rx_02);
                break;
            }
            case d: {
                blx_12.e(rx_02);
                break;
            }
            case e: {
                blx_12.d(rx_02);
            }
        }
        return false;
    }

    private static boolean a(crO crO2) {
        bmr_1 bmr_12 = azu_0.j().k();
        Iterator<Map.Entry<Long, Byte>> iterator = crO2.b();
        while (iterator.hasNext()) {
            Map.Entry<Long, Byte> entry = iterator.next();
            blx_1 blx_12 = bmf_2.a().c(entry.getKey());
            if (entry.getValue() == 1) {
                if (blx_12 == null || bmr_12 == null) continue;
                blx_12.a(afr_2.b(bmr_12.G() - blx_12.G(), bmr_12.H() - blx_12.H()));
                blx_12.bv().e((byte)-1);
                continue;
            }
            if (blx_12 == null) continue;
            blx_12.bv().cd();
        }
        return false;
    }

    private static boolean a(crc crc2) {
        bmr_1 bmr_12 = (bmr_1)euw_2.a.d(crc2.d());
        if (bmr_12 == null) {
            return false;
        }
        bmr_12.eu().a(crc2.b(), crc2.c());
        return false;
    }

    private static boolean a(cre_0 cre_02) {
        blx_1 blx_12 = bzf_1.a(cre_02.b());
        if (blx_12 == null) {
            return false;
        }
        blx_12.b(cre_02.c());
        return false;
    }

    public static boolean a(ckp_1 ckp_12) {
        byte[] byArray = ckp_12.b();
        if (byArray == null) {
            return false;
        }
        bai_0 bai_02 = new bai_0();
        bai_02.a_(byArray);
        azu_0.j().a(bai_02);
        if (azu_0.j().c(cxq_0.a)) {
            brd_0.k.i();
        }
        return false;
    }

    private static boolean a(cyz_1 cyz_12) {
        if (!cyz_12.d()) {
            if (!dcw.n().f()) {
                aul_0 aul_02 = aul_0.a();
                bQG.a();
                aul_02.c(bQG.b(13, new Object[0]));
            }
        } else if (azu_0.j().c(dcw.n())) {
            dcw.n().h();
        }
        dcw.n().k();
        bjy_1.a(dcw.n().a(), 1);
        return false;
    }

    private static boolean a(cqx_0 cqx_02) {
        exk_2 exk_22;
        if (!cqx_02.b()) {
            if (!dcv.i.f()) {
                bQG.a();
                bQG.a(38, new Object[0]);
            }
        } else if (azu_0.j().c(dcv.i)) {
            dcv.i.h();
            aUh.b("searchTreasureSuccess", new Object[0]);
        }
        if ((exk_22 = dcv.i.a()) == null) {
            a.error((Object)"[SEARCH_TREASURE] On creuse sans item !?");
        } else {
            eyw_1 eyw_12 = exk_22.T().p();
            if (eyw_12 != null && eyw_12.l()) {
                bjy_1.a(exk_22, 1);
            }
        }
        dcv.i.k();
        return false;
    }

    private static boolean a(cqu_0 cqu_02) {
        blx_1 blx_12 = bzf_1.a(cqu_02.c());
        if (blx_12 == null) {
            return false;
        }
        byte[] byArray = cqu_02.b().keys();
        for (int n = 0; n < byArray.length; n = (int)((byte)(n + 1))) {
            byte by = byArray[n];
            int n2 = (Integer)((Pair)cqu_02.b().get(by)).getLeft();
            int n3 = (Integer)((Pair)cqu_02.b().get(by)).getRight();
            cef_0.a(blx_12, by, n2);
            cef_0.b(blx_12, by, n3);
        }
        blx_12.bI();
        blx_12.aQ();
        return false;
    }

    private static boolean a(cra_0 cra_02) {
        ccm_1.g().d(cra_02.b(), cra_02.c());
        return false;
    }

    private static boolean a(cyz_2 cyz_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        long l = cyz_22.b();
        if (euw_2.a.d(bmr_12.R(), l)) {
            return false;
        }
        long l2 = cyz_22.c();
        bnh_1 bnh_12 = (bnh_1)bmf_2.a().c(l);
        if (bnh_12 != null) {
            bnh_12.i(l2);
        }
        return false;
    }

    private static boolean a(cqz_0 cqz_02) {
        a.info((Object)("[TRANSPORT] Message d'evenement de transport : " + cqz_02.b()));
        bFJ bFJ2 = (bFJ)ccm_1.g().a(cqz_02.c());
        switch (cqz_02.b()) {
            case a: {
                bFJ2.a(false);
                break;
            }
            case b: {
                bFJ2.a(true);
                break;
            }
            case c: {
                aUh.b("boat.startTravel", new Object[0]);
                return false;
            }
            case d: {
                aUh.a("boat.cantTravel", new Object[0]);
                return false;
            }
            case e: {
                aUh.a("boat.full", new Object[0]);
                return false;
            }
        }
        ArrayList<pj_0> arrayList = ccm_1.g().i();
        int n = arrayList.size();
        block11: for (int k = 0; k < n; ++k) {
            ban_1 ban_12;
            pj_0 pj_02 = arrayList.get(k);
            if (!(pj_02 instanceof ban_1) || (long)(ban_12 = (ban_1)pj_02).Z() != cqz_02.c()) continue;
            switch (cqz_02.b()) {
                case a: {
                    ban_12.a(bFJ2.ap());
                    ban_12.a(true);
                    continue block11;
                }
                case b: {
                    ban_12.b(bFJ2.ap());
                    ban_12.a(false);
                }
            }
        }
        return false;
    }

    private static boolean a(cri_0 cri_02) {
        long l = cri_02.b();
        blx_1 blx_12 = bzf_1.a(l);
        if (blx_12 == null || !blx_12.bo()) {
            a.error((Object)("Result of an aptitude change for an unknown or non local character " + l));
            return false;
        }
        return false;
    }

    private static boolean a(crL crL2) {
        bmr_1 bmr_12 = azu_0.j().k();
        a.trace((Object)"[SPELL] reception d'un message d'apprentissage de nouveaux sorts");
        ArrayList<abp_2<Integer, Long, Short>> arrayList = crL2.b();
        bmr_1 bmr_13 = (bmr_1)euw_2.a.d(crL2.c());
        for (abp_2<Integer, Long, Short> abp_22 : arrayList) {
            try {
                bpl_0 bpl_02 = new bpl_0(bpp_0.a().a(abp_22.a()), abp_22.c(), abp_22.b(), bmr_13);
                ((uf_0)bmr_13.aZ()).a(bpl_02);
                bmr_13.bb().a((bph_0)bpl_02.r());
                bua_0.a.a(new buv_2(((bph_0)bpl_02.r()).i()));
                String string = bpp_0.a().a(abp_22.a()).b();
                aUh.b("spell.newSpellLearn", aug_0.g, string);
                cxu_0.a().g();
                if (!((bph_0)bpl_02.r()).w()) continue;
                for (efh_0 efh_02 : bpl_02) {
                    if (efh_02.h() != 0) continue;
                    efh_02.a(bpl_02, bmr_13, bmr_13.cK(), efc_0.a(), bmr_13.G(), bmr_13.H(), bmr_13.I(), bmr_13, null, false);
                }
            }
            catch (uz_0 uz_02) {
                a.error((Object)"[SPELL] Plus de place dans l'inventaire des sort pour en apprendre un nouveau");
            }
            catch (Uy uy) {
                a.error((Object)"[SPELL] Sort d\u00e9j\u00e9 appri et pr\u00e9sent dans l'inventaire");
            }
        }
        if (fpm_0.b().q("spellDeckDialog")) {
            fis_1.a().a((ajf_1)bmr_12.bb(), bmr_13.bb().d());
        }
        return false;
    }

    private static boolean a(csn_1 csn_12) {
        int n = csn_12.b();
        String string = bae.h().a(80, (long)n, new Object[0]);
        if (!csn_12.c()) {
            aUh.a("error.emote.alreadyKnown", new Object[]{string});
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        bht bht2 = bht.i;
        bht2.a(n);
        aUh.b("emote.learnt", string);
        fis_1.a().a((ajf_1)bht2, bht2.d());
        bmr_12.cg().b(fid.a);
        bhx bhx2 = bht2.c(n);
        dhy dhy2 = new dhy();
        dhy2.b(bmr_12.a_());
        dhy2.b(bhx2);
        dhy2.c(-1);
        dhy2.d(-1);
        dhy2.a(false);
        dhy2.b(true);
        dhy2.a_(19194);
        add_2.b().a(dhy2);
        cef_0.a(bmr_12, bhx2);
        return false;
    }

    private boolean a(cxj_1 cxj_12) {
        bgo_1.a(Ints.toArray(cxj_12.b()));
        Set<Integer> set = cxj_12.b();
        String string = bgo_1.a(set);
        aUh.b("furniture.learnt", string, set.size());
        if (fpm_0.b().q("furnitureListDialog")) {
            czh_0 czh_02 = czh_0.a();
            czh_02.a(set);
        }
        return false;
    }

    private static boolean a(cza_2 cza_22) {
        fll_0 fll_02 = fln_0.a().a(cza_22.b());
        if (fll_02 != null) {
            bmr_1 bmr_12 = azu_0.j().k();
            a.info((Object)("Buff de zone id=" + cza_22.b() + " appliqu\u00e9 pour " + cza_22.c() + " ms"));
            bmr_12.dH().a(new flm_0(fll_02, cza_22.c()));
            bmr_12.v(true);
        } else {
            a.error((Object)("Buff de zone id=" + cza_22.b() + " inconnu"));
        }
        return false;
    }

    private static boolean a(czb_2 czb_22) {
        boolean bl = false;
        bmr_1 bmr_12 = azu_0.j().k();
        for (flm_0 flm_02 : bmr_12.dG()) {
            if (flm_02.b() != czb_22.b()) continue;
            a.info((Object)("Buff de zone id=" + czb_22.b() + " retir\u00e9"));
            bmr_12.dH().b(flm_02);
            bmr_12.v(true);
            bl = true;
            break;
        }
        if (!bl) {
            a.error((Object)("Buff de zone id=" + czb_22.b() + " inconnu"));
        }
        return false;
    }

    private static boolean a(czc_2 czc_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        bmr_12.dH().a();
        for (int k = 0; k < czc_22.b(); ++k) {
            fll_0 fll_02 = fln_0.a().a(czc_22.b(k));
            if (fll_02 != null) {
                a.info((Object)("Buff de zone id=" + czc_22.b(k) + " appliqu\u00e9 pour " + czc_22.c(k) + " ms"));
                bmr_12.dH().a(new flm_0(fll_02, czc_22.c(k)));
                continue;
            }
            a.error((Object)("Buff de zone id=" + czc_22.b(k) + " inconnu"));
        }
        bmr_12.v(true);
        return false;
    }

    private static boolean a(cum_1 cum_12) {
        TIntArrayList tIntArrayList = cum_12.b();
        TIntArrayList tIntArrayList2 = cum_12.c();
        TIntArrayList tIntArrayList3 = cum_12.d();
        bmr_1 bmr_12 = azu_0.j().k();
        bvx_2 bvx_22 = bmr_12.cP();
        if (bvx_22 != null) {
            baa_0.a().a(bmr_12.cQ(), (aku_1)new bbn_0(() -> {
                int n = tIntArrayList.size();
                for (int k = 0; k < n; ++k) {
                    int n2 = tIntArrayList.get(k);
                    int n3 = tIntArrayList2.get(k);
                    int n4 = tIntArrayList3.get(k);
                    eok_1 eok_12 = eop_1.a.b(n2);
                    if (eok_12 == null) continue;
                    bxr_2.a.a(eok_12, n3, n4);
                }
            }));
            baa_0.a().a(bvx_22);
        }
        return false;
    }

    private static boolean a(cul_1 cul_12) {
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            return false;
        }
        bvx_2 bvx_22 = bmr_12.cP();
        if (bvx_22 != null) {
            bmr_1 bmr_13 = azu_0.j().k();
            baa_0.a().a(bmr_13.cQ(), (aku_1)new bbn_0(() -> bxr_2.a.a(cul_12.b(), cul_12.c())));
            baa_0.a().a(bvx_22);
        }
        return false;
    }

    private static boolean a(cwp_1 cwp_12) {
        bsu_1.a().b(cwp_12.b());
        return false;
    }

    private static boolean a(crh_0 crh_02) {
        a.trace((Object)"[ERROR] reception d'une erreur");
        int n = crh_02.b();
        bQG.a();
        bQG.a(n, new Object[0]);
        if (buc_1.a(n)) {
            bua_0.a.a(new buc_1(n));
        }
        return false;
    }

    private static boolean a(crl_0 crl_02, cVc cVc2) {
        int n = crl_02.b();
        bQG.a();
        bQG.a(n, new Object[0]);
        if (buc_1.a(n)) {
            bua_0.a.a(new buc_1(n));
        }
        cVc2.c(n);
        return false;
    }

    private static void a(bmr_1 bmr_12, bhx bhx2) {
        zp_0 zp_02 = new zp_0();
        zo_0 zo_02 = new zo_0(bhx2.f(), 32, 32, (zt_0)zp_02, 3000);
        zo_02.a(bmr_12);
        int n = zd_0.a().b(bmr_12, 4);
        zo_02.g(n * 500);
        zd_0.a().a(zo_02);
    }

    private static void a(blx_1 blx_12, byte by, int n) {
        if (!(blx_12 instanceof bnh_1)) {
            return;
        }
        bnh_1 bnh_12 = (bnh_1)blx_12;
        if (n <= 0) {
            bnh_12.eI().remove(by);
        } else {
            bnh_12.eI().put(by, n);
        }
    }

    private static void b(blx_1 blx_12, byte by, int n) {
        TByteIntHashMap tByteIntHashMap = blx_12.bc();
        if (tByteIntHashMap == null) {
            return;
        }
        if (n <= 0) {
            tByteIntHashMap.remove(by);
        } else {
            tByteIntHashMap.put(by, n);
        }
    }

    private static boolean a(cyj_1 cyj_12) {
        long l = azu_0.j().n().u();
        if (fjq_0.b(l, cyj_12.b(), cyj_12.c())) {
            aUh.b("chat.travel.discovered", new Object[0]);
        }
        return false;
    }

    private static void a(blx_1 blx_12, int n, int n2, short s2, boolean bl) {
        a.info((Object)("tp " + blx_12.a_() + " to " + n + ", " + n2));
        if (bl) {
            blx_12.bv().b(n, n2, s2, false, false);
        } else {
            blx_12.a(n, n2, s2, false);
            blx_12.bv().cn();
        }
    }

    private static void a(blx_1 blx_12, biI biI2) {
        bar_0 bar_02;
        bwh_0 bwh_02 = bwj_1.a().a(blx_12.bA());
        if (!(bwh_02 instanceof bvw_2)) {
            return;
        }
        bvw_2 bvw_22 = (bvw_2)bwh_02;
        bvw_22.a(blx_12);
        bwa_0.b(blx_12);
        if (blx_12 instanceof bmv_1 && (bwh_02.e() == elp_0.b || bwh_02.e() == elp_0.d)) {
            biI2.e((byte)-1);
        }
        if (blx_12.m()) {
            bar_02 = new bar_0(alc_1.q(), emd_1.f.a(), 0, 0, bwh_02.c(), false);
            bar_02.c(blx_12.a_());
            baa_0.a().a(bwh_02.c(), (aku_1)bar_02);
            baa_0.a().a(bwh_02);
        }
        if (blx_12.ax_()) {
            bar_02 = new bar_0(alc_1.q(), emd_1.f.a(), 0, 2, bwh_02.c(), false);
            bar_02.c(blx_12.a_());
            baa_0.a().a(bwh_02.c(), (aku_1)bar_02);
            baa_0.a().a(bwh_02);
        }
    }

    private static void b(adt_1 adt_12) {
        bmr_1 bmr_12 = azu_0.j().k();
        crj_0 crj_02 = (crj_0)adt_12;
        long l = crj_02.b();
        int n = crj_02.c();
        bnh_1 bnh_12 = (bnh_1)bzf_1.a(l);
        if (bnh_12 == null) {
            a.error((Object)("R\u00e9ception d'un update de jauge wakfu pour un joueur inconnu id=" + l));
            return;
        }
        if (bnh_12.bz() != null) {
            baa_0.a().a(bnh_12.bA(), (aku_1)new ceI(alc_1.q(), emd_1.al.a(), 0, bnh_12, n, l, bmr_12));
        } else {
            bnh_12.i(n);
            if (l == bmr_12.a_()) {
                bua_0.a.a(new bvg_1());
            }
        }
    }

    private void a(cqv_0 cqv_02, blx_1 blx_12, afm_0 afm_02) {
        this.a(blx_12, new aff_1(cqv_02.c(), cqv_02.d(), cqv_02.e()), aej_2.a(cqv_02.f()), afm_02);
    }

    public void a(blx_1 blx_12, aff_1 aff_12, aej_2 aej_22) {
        this.a(blx_12, aff_12, aej_22, afm_0.p);
    }

    public void a(blx_1 blx_12, aff_1 aff_12, aej_2 aej_22, afm_0 afm_02) {
        biI biI2;
        if (!biI2.a(aff_12, false, (biI2 = blx_12.bv()).aT() == 8, afm_02)) {
            biI2.a(aff_12, true, false, biI2.aT() == 8);
            biI2.a(aej_22);
        }
        biI2.b(new ceJ(this, aej_22));
        if (a.isTraceEnabled() && blx_12 instanceof bnh_1) {
            a.trace((Object)String.format("Update de chemin re\u00e9ue pour le personnage %s(%d) : currentPos=[%d:%d] to=%s", blx_12.dp(), blx_12.a_(), biI2.be(), biI2.bf(), aff_12));
        }
    }

    public static void a(long l, byte by, boolean bl, boolean bl2) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 != null && l == bmr_12.a_()) {
            return;
        }
        if (euu_2.a() && bmr_12 != null && euw_2.a.d(bmr_12.U_(), l)) {
            return;
        }
        try {
            switch (by) {
                case 0: {
                    cef_0.b(l);
                    cef_0.a(l, bl, bmr_12, bl2);
                    break;
                }
                case 1: {
                    cef_0.a(l, bl, bmr_12, bl2);
                    break;
                }
                case 4: {
                    cef_0.a(l, bl, bmr_12, bl2);
                    break;
                }
                default: {
                    a.error((Object)("Unknown Actor Type " + by + " for actor " + l));
                    break;
                }
            }
        }
        catch (RuntimeException runtimeException) {
            a.error((Object)("Exception lors du despawn de l'acteur " + l), (Throwable)runtimeException);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(long l, boolean bl, bmr_1 bmr_12, boolean bl2) {
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 == null) {
            return;
        }
        if (bl) {
            if (!blx_12.P()) {
                a.info((Object)("Despawn de " + l + " de myFight alors qu'il ne l'\u00e9tait pas => ignor\u00e9"));
                return;
            }
            blx_12.c(false);
        } else {
            if (!blx_12.E()) {
                a.info((Object)("Despawn de " + l + " de world alors qu'il ne l'\u00e9tait pas => ignor\u00e9"));
                return;
            }
            blx_12.b(false);
            cSN cSN2 = dan.a().c();
            if (cSN2 != null) {
                int n = cSN2.b();
                for (int k = 0; k < n; ++k) {
                    if (cSN2.a(k) != blx_12) continue;
                    dan.a().d();
                    break;
                }
            }
            if (bmr_12 != null && bmr_12.eE() != null && bmr_12.bB() == blx_12.bv()) {
                bmr_12.eE().a(false, true);
            }
        }
        if (blx_12.E()) return;
        if (blx_12.bz() != null) {
            blx_12.bz().g(blx_12);
            return;
        }
        cef_0.a(bl2, blx_12);
    }

    public static void b(long l) {
        bnh_1 bnh_12 = (bnh_1)bmf_2.a().c(l);
        if (bnh_12 == null) {
            return;
        }
        faV faV2 = bnh_12.fE();
        if (faV2 == null) {
            return;
        }
        faV2.m().h(bnh_12.a_());
    }

    public static void a(boolean bl, blx_1 blx_12) {
        cef_0.a(blx_12, bl);
        if (blx_12.bv().bG()) {
            blx_12.h(true);
            blx_12.bv().a((abu abu2) -> {
                if (abu2 instanceof biE) {
                    blx_1 blx_12 = bmf_2.a().c(abu2.a());
                    bmf_2.a().e(blx_12);
                }
            });
        } else {
            bmf_2.a().e(blx_12);
        }
    }

    private static void a(@NotNull blx_1 blx_12, boolean bl) {
        cef_0.a(blx_12);
        cef_0.b(blx_12, bl);
    }

    private static void a(blx_1 blx_12) {
        if (blx_12.bA() == -1) {
            return;
        }
        bwh_0 bwh_02 = bwj_1.a().a(blx_12.bA());
        if (bwh_02 == null) {
            return;
        }
        if (bwh_02 instanceof bvw_2) {
            ((bvw_2)bwh_02).b(blx_12);
        }
    }

    private static void b(blx_1 blx_12, boolean bl) {
        if (bl) {
            FreeParticleSystem freeParticleSystem = aij_0.a().a(800030);
            freeParticleSystem.a(blx_12.bv());
            aik_0.a().b(freeParticleSystem);
        } else {
            aik_0.a().a(blx_12.bv());
        }
    }

    private void a(cyi_2 cyi_22) {
        fjj_0 fjj_02 = cyi_22.b();
        switch (fjj_02) {
            case a: {
                break;
            }
            case b: {
                bqd_0.a(cyi_22.c()).b();
                break;
            }
            case c: {
                bmr_1 bmr_12 = azu_0.j().k();
                if (!bmr_12.hI()) {
                    return;
                }
                bmr_12.hJ().b();
                break;
            }
        }
    }

    private static void a(cti_1 cti_12) {
        Object t = euw_2.a.d(cti_12.b());
        if (t == null) {
            a.error((Object)("[SYMBIOT] Cannot update symbiot, invalid hero id=" + cti_12.b()));
            return;
        }
        erp_2 erp_22 = ((epq_2)t).dQ();
        if (!(erp_22 instanceof bol_0)) {
            a.error((Object)("[SYMBIOT] Cannot update symbiot, hero " + cti_12.b() + " has no symbiot"));
            return;
        }
        ers_2.a((erm_2)erp_22, cti_12.c());
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        e = true;
        c.clear();
        d.clear();
    }

    public void a(boolean bl) {
        e = bl;
    }
}

