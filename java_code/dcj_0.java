/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Random;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from dcJ
 */
public class dcj_0
implements ahr_1,
bOy {
    private static final dcj_0 a = new dcj_0();
    private static final Logger b = Logger.getLogger(dcj_0.class);
    private bOw c;
    private final TIntObjectHashMap<fvk_0> d = new TIntObjectHashMap();
    private boolean e = false;

    public static dcj_0 a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        bmr_1 bmr_12 = azu_0.j().k();
        switch (adt_12.a()) {
            case 18843: {
                int n;
                dfc dfc2 = (dfc)adt_12;
                Object t = dfc2.j();
                if (t instanceof ble_0) {
                    n = ((ble_0)t).c();
                } else if (t instanceof boq_0 && ((fib)t).n() == fie.f) {
                    n = ((ts_0)t).aT_();
                } else {
                    return false;
                }
                cZI.a().b(bmr_12.a_(), n);
                return false;
            }
            case 16401: {
                azu_0.j().b(this);
                return false;
            }
            case 19011: {
                this.a(aej_2.h);
                return false;
            }
            case 17515: {
                this.a(aej_2.f);
                return false;
            }
            case 16377: {
                this.a(aej_2.b);
                return false;
            }
            case 19296: {
                this.a(aej_2.d);
                return false;
            }
            case 19573: {
                if (fis_1.a().c("spellInventoryDisplay")) {
                    fis_1.a().a("spellInventoryDisplay", false);
                } else {
                    this.c();
                    fis_1.a().a("spellInventoryDisplay", true);
                }
                return false;
            }
            case 16597: {
                if (fis_1.a().c("itemInventoryDisplay")) {
                    fis_1.a().a("itemInventoryDisplay", false);
                } else {
                    this.c();
                    fis_1.a().a("itemInventoryDisplay", true);
                }
                return false;
            }
            case 19168: {
                if (fpm_0.b().q("osamodasSymbiotDialog")) {
                    azu_0.j().b(dbJ.a());
                } else {
                    this.c();
                    azu_0.j().a(dbJ.a());
                }
                return false;
            }
            case 18537: {
                if (fis_1.a().c("fightActionsDisplay")) {
                    fis_1.a().a("fightActionsDisplay", false);
                } else {
                    this.c();
                    fis_1.a().a("fightActionsDisplay", true);
                }
                return false;
            }
            case 18338: {
                if (fis_1.a().c("kardsDisplay")) {
                    fis_1.a().a("kardsDisplay", false);
                } else {
                    this.c();
                    fis_1.a().a("kardsDisplay", true);
                }
                return false;
            }
            case 17322: {
                if (fis_1.a().c("spellInventoryDisplay")) {
                    fis_1.a().a("spellInventoryDisplay", false);
                }
                return false;
            }
            case 19194: {
                ajf_1 ajf_12;
                dhy dhy2 = (dhy)adt_12;
                bmr_12 = dhy2.t() != 0L ? (bmr_1)euw_2.a.d(dhy2.t()) : azu_0.j().k();
                if (bmr_12 == null) {
                    return false;
                }
                bOw bOw2 = bmr_12.cg();
                Object object = dhy2.k();
                boolean bl = dhy2.i();
                boolean bl2 = dhy2.s();
                boolean bl3 = bmr_12.f(erl_2.Z);
                if (bl3 && !bl2) {
                    return false;
                }
                if (object == null) {
                    return false;
                }
                int n = dhy2.o();
                byte by = dhy2.q();
                int n2 = dhy2.p();
                boq_0 boq_02 = null;
                fid fid2 = bOw2.b();
                if (n2 != -1 && n != -1 && (boq_02 = bOw2.f((byte)n).b((short)n2)) != null) {
                    boq_02 = (boq_0)boq_02.i();
                }
                int n3 = dhy2.r();
                fid fid3 = null;
                boq_0 boq_03 = null;
                if (object instanceof bpl_0) {
                    fid3 = fid.b;
                    ajf_12 = (bpl_0)object;
                    boq_03 = boq_0.a(fie.a, ((fio_0)((Object)ajf_12)).a(), ((fio_0)((Object)ajf_12)).aT_(), ((bpl_0)ajf_12).n());
                } else if (object instanceof boq_0) {
                    boq_03 = (boq_0)object;
                    if (boq_03.n() == fie.d) {
                        ajf_12 = eyo_1.g().d(2145);
                        if (boq_03.aT_() != ((ezr_0)((Object)ajf_12)).n()) {
                            exk_2 exk_22 = bmr_12.cG().a(bmr_12.dC(), exh_2.a((byte)(-(boq_03.a() + 1L))));
                            fid fid4 = fid3 = exk_22.W() ? fid.a : fid.b;
                            if (exk_22.aU_()) {
                                boq_03 = boq_0.a(fie.c, exk_22.a(), exk_22.aT_(), exk_22.I());
                                if (exk_22.X()) {
                                    boq_03.a((byte)2);
                                } else {
                                    boq_03.a((byte)3);
                                }
                            }
                        }
                    }
                } else if (object instanceof exk_2) {
                    ajf_12 = (exk_2)object;
                    fid3 = fid.a;
                    if (bmr_12.da().a((ts_0)((Object)ajf_12)) != null) {
                        if (((exk_2)ajf_12).T().F().h().length > 0) {
                            boq_03 = boq_0.a(fie.c, ((exk_2)ajf_12).a(), ((exk_2)ajf_12).aT_(), ((exk_2)ajf_12).I());
                            boq_03.a((byte)0);
                        } else if (((exk_2)ajf_12).X()) {
                            boq_03 = boq_0.a(fie.b, ((exk_2)ajf_12).a(), ((exk_2)ajf_12).aT_(), ((exk_2)ajf_12).I());
                            boq_03.a((byte)4);
                        } else {
                            boq_03 = boq_0.a(fie.c, ((exk_2)ajf_12).a(), ((exk_2)ajf_12).aT_(), ((exk_2)ajf_12).I());
                            boq_03.a((byte)0);
                        }
                    } else if (bmr_12.cG().a(((exk_2)ajf_12).a()) != null) {
                        boq_03 = boq_0.a(fie.c, ((exk_2)ajf_12).a(), ((exk_2)ajf_12).aT_(), ((exk_2)ajf_12).I());
                        if (((exk_2)ajf_12).X()) {
                            boq_03.a((byte)2);
                        } else {
                            boq_03.a((byte)3);
                        }
                    } else {
                        boq_03 = null;
                    }
                } else if (object instanceof bja_1) {
                    ajf_12 = ((bja_1)object).h();
                    if (bmr_12.cG().a(((exk_2)ajf_12).a()) != null) {
                        boq_03 = boq_0.a(fie.c, ((exk_2)ajf_12).a(), ((exk_2)ajf_12).aT_(), ((exk_2)ajf_12).I());
                        if (((exk_2)ajf_12).X()) {
                            boq_03.a((byte)2);
                        } else {
                            boq_03.a((byte)3);
                        }
                    }
                } else if (object instanceof bhx) {
                    fid3 = fid.a;
                    ajf_12 = (bhx)object;
                    boq_03 = boq_0.a(fie.e, new Random().nextLong(), ((bhx)ajf_12).k(), ((bhx)ajf_12).k());
                } else if (object instanceof ble_0) {
                    fid3 = fid.a;
                    ajf_12 = (ble_0)object;
                    if (((ble_0)ajf_12).a() != euv_2.a.b(bhh_1.b())) {
                        return false;
                    }
                    boq_03 = boq_0.a(fie.f, ((ble_0)ajf_12).c(), ((ble_0)ajf_12).c(), ((ble_0)ajf_12).b().d());
                }
                if (fid3 != null && bOw2.b() != fid3) {
                    bOw2.b(fid3);
                    n2 = -1;
                    n = -1;
                }
                if (!bOw2.a(boq_03, n, (short)n2)) {
                    if (boq_02 != null && n3 != -1) {
                        bOw2.a(boq_02, n, (short)n2);
                    }
                    if (boq_03 != null) {
                        boq_03.release();
                    }
                    if (bl3) {
                        bOw2.b(fid2);
                    }
                    return false;
                }
                if (boq_02 != null && n3 != -1) {
                    ajf_12 = boq_0.a(boq_02.n(), boq_02.a(), boq_02.aT_(), boq_02.o());
                    bOw2.a((boq_0)ajf_12, (int)by, (short)n3);
                }
                if (bl) {
                    cdw_0.n().c(600053L);
                }
                if (bl3) {
                    bOw2.b(fid2);
                }
                return false;
            }
            case 18564: {
                dhy dhy3 = (dhy)adt_12;
                int n = dhy3.o();
                int n4 = dhy3.p();
                boolean bl = dhy3.s();
                boolean bl4 = bmr_12.f(erl_2.Z);
                if (bl4 && !bl) {
                    return false;
                }
                this.c.a(n, (short)n4, false);
                cdw_0.n().c(600059L);
                return false;
            }
            case 19562: {
                dhy dhy4 = (dhy)adt_12;
                Object object = dhy4.k();
                boolean bl = dhy4.s();
                boolean bl5 = bmr_12.f(erl_2.Z);
                if (bl5 && !bl) {
                    return false;
                }
                if (object instanceof boq_0) {
                    this.c.b((boq_0)object, dhy4.o(), (short)dhy4.p());
                }
                cdw_0.n().B();
                return false;
            }
            case 16577: {
                if (dcj_0.a(bmr_12)) {
                    return false;
                }
                this.c.n();
                this.f();
                return false;
            }
            case 17752: {
                if (dcj_0.a(bmr_12)) {
                    return false;
                }
                this.c.o();
                this.f();
                return false;
            }
            case 17181: {
                fis_1.a().a("spellDescriptionDisplay", true);
                return false;
            }
            case 19237: {
                if (fis_1.a().c("spellDescriptionDisplay")) {
                    fis_1.a().a("spellDescriptionDisplay", false);
                }
                return false;
            }
            case 19973: {
                fid fid5 = this.c.b();
                this.c.a(fid5 == fid.a ? fid.b : fid.a, true);
                return false;
            }
            case 19946: {
                dfc dfc3 = (dfc)adt_12;
                if (dcj_0.a(bmr_12)) {
                    return false;
                }
                byte by = (byte)(this.c.b().e() + dfc3.b());
                this.c.a(by, true);
                return false;
            }
            case 19241: {
                dfc dfc4 = (dfc)adt_12;
                byte by = dfc4.b();
                byte by2 = (byte)(by - this.c.b().e());
                this.a(by2);
                return false;
            }
            case 18154: {
                dfc dfc5 = (dfc)adt_12;
                bvx_2 bvx_22 = bmr_12.bz();
                if (bvx_22 != null && bvx_22.e() != elp_0.b) {
                    return false;
                }
                int n = dfc5.c();
                byte by = dfc5.b();
                fiL fiL2 = new fiL();
                long l = bmr_12.a_();
                if (!fiL2.a(l, n, bmr_12.C(), by)) break;
                cqF cqF2 = new cqF(l, n, bmr_12.C(), by);
                azu_0.j().K().c(cqF2);
                bPJ.a(bmr_12.dz(), bmr_12.aZ(), bmr_12.cg());
                if (!cZI.A()) break;
                cZI.a().y();
            }
        }
        return true;
    }

    private static boolean a(bmr_1 bmr_12) {
        return bmr_12 != null && bmr_12.ak() && ((bvx_0)ans_0.D().h()).a(bWe.aK);
    }

    private void a(aej_2 aej_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (!bmr_12.ak()) {
            return;
        }
        clf_1 clf_12 = new clf_1(aej_22);
        azu_0.j().K().c(clf_12);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void c() {
        fis_1.a().a("throwableInventoryDisplay", false);
        if (!azu_0.j().k().ak()) {
            fis_1.a().a("fightActionsDisplay", false);
        }
    }

    public void a(byte by) {
        if (dcj_0.a(azu_0.j().k())) {
            return;
        }
        bOv bOv2 = this.c.e(by);
        if (bOv2 == null) {
            return;
        }
        if (!bOv2.o()) {
            this.b(by);
        } else {
            this.a(by, true);
        }
    }

    public void d() {
        byte by = this.c.b().d();
        for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
            this.b(by2);
        }
    }

    public void e() {
        byte by = this.c.b().d();
        for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
            this.a(by2, false);
        }
    }

    public void b(byte by) {
        String string;
        String string2;
        String string3;
        bOv bOv2;
        block6: {
            bOv2 = this.c.e(by);
            if (bOv2 == null || bOv2.o()) {
                return;
            }
            string3 = bOv2.p() ? "verticalSecondaryShortcutBarDialog" : "secondaryShortcutBarDialog";
            string2 = string3 + by;
            if (fpm_0.b().q(string2)) {
                return;
            }
            string = null;
            try {
                if (this.d.isEmpty()) break block6;
                int n = 0;
                do {
                    fvk_0 fvk_02;
                    if ((fvk_02 = (fvk_0)this.d.get(n)) == null || fvk_02.isUnloading() || fvk_02.getUserDefinedManager().e()) continue;
                    string = fvk_02.getElementMap().c();
                    break;
                } while ((n = (int)((byte)(n + 1))) < this.d.size());
            }
            catch (Exception exception) {
                b.error((Object)"Erreur au contr\u00f4le du placement d'une barre de raccourci secondaire");
                return;
            }
        }
        fvk_0 fvk_03 = string != null ? (fvk_0)fpm_0.b().a(string2, cfi_0.a(string3), null, string, string3, 40960L, (short)10005) : (fvk_0)fpm_0.b().a(string2, cfi_0.a(string3), 40960L, (short)10005);
        fvk_03.setHorizontalDialog("secondaryShortcutBarDialog");
        fvk_03.setVerticalDialog("verticalSecondaryShortcutBarDialog");
        if (!this.d.contains((int)by)) {
            this.d.put((int)by, (Object)fvk_03);
        }
        fbf_2.a().a(fvk_03, false);
        fis_1.a().a("shortcutBar", (Object)bOv2, fvk_03.getElementMap());
        bOv2.a(true);
        this.g();
    }

    public void a(byte by, boolean bl) {
        if (this.c == null) {
            return;
        }
        bOv bOv2 = this.c.e(by);
        if (bOv2 == null || !bOv2.o()) {
            return;
        }
        String string = (bOv2.p() ? "verticalSecondaryShortcutBarDialog" : "secondaryShortcutBarDialog") + by;
        if (fpm_0.b().q(string)) {
            fpm_0.b().o(string);
        }
        bOv2.a(false);
        if (bl) {
            this.g();
        }
    }

    public void b(byte by, boolean bl) {
        for (fid fid2 : fid.i()) {
            bOv bOv2 = this.c.b(fid2, by);
            if (bOv2 == null) continue;
            bOv2.b(bl);
        }
        this.g();
    }

    public void f() {
        fid fid2;
        if (this.c != null && (fid2 = this.c.b()) != null) {
            byte by = fid2.d();
            for (byte by2 = 0; by2 < by; by2 = (byte)(by2 + 1)) {
                this.c(by2);
            }
        }
    }

    public void c(byte by) {
        bOv bOv2 = this.c.e(by);
        if (bOv2 == null) {
            return;
        }
        String string = (bOv2.p() ? "verticalSecondaryShortcutBarDialog" : "secondaryShortcutBarDialog") + by;
        if (fpm_0.b().q(string)) {
            fis_1.a().a("shortcutBar", (Object)bOv2, string);
        }
    }

    public void g() {
        int n;
        boolean[] blArray = new boolean[this.c.b().d() * 2];
        int n2 = this.c.b().d();
        for (n = 0; n < n2; n = (int)((byte)(n + 1))) {
            bOv bOv2 = this.c.e((byte)n);
            if (bOv2 == null) continue;
            blArray[n * 2] = bOv2.o();
            blArray[n * 2 + 1] = bOv2.p();
        }
        n = 0;
        n2 = Math.min(32, blArray.length);
        for (int k = 0; k < n2; ++k) {
            if (!blArray[k]) continue;
            n += 1 << k;
        }
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe.i, n);
    }

    public void a(bOw bOw2) {
        if (!this.e) {
            return;
        }
        if (this.c != null && bOw2 != null) {
            ArrayList<bOv> arrayList = this.c.b(false);
            bOw2.a(this);
            if (arrayList != null) {
                for (bOv bOv2 : arrayList) {
                    bOw2.f(bOv2.n()).a(bOv2.o());
                }
            }
        }
        this.c = bOw2;
        fis_1.a().a("shortcutBarManager", this.c);
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!this.e) {
            this.e = true;
            bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
            this.a(azu_0.j().k().cg());
            this.c.a(this);
            fid fid2 = fid.valueOf(bvx_02.f(bWe.k));
            bWe bWe2 = fid2 == fid.b ? bWe.l : bWe.m;
            byte by = (byte)bvx_02.d(bWe2);
            if (fid2 != null) {
                if (this.c.b() != fid2) {
                    this.c.a(fid2, by);
                } else {
                    this.c.a(by, true);
                }
            }
            this.c();
            bvx_2 bvx_22 = azu_0.j().k().bz();
            if (bvx_22 != null && bvx_22.A().H() == azu_0.j().k()) {
                azu_0.j().a(cyo_0.a());
            }
            fpm_0.b().a("wakfu.shortcutBar", cJz.class);
            fpm_0.b().a("wakfu.osamodasSymbiot", ciy_0.class);
            try {
                int n = bvx_02.d(bWe.i);
                int n2 = Math.min(32, fid.i()[0].d() * 2);
                boolean[] blArray = new boolean[n2];
                for (int k = 0; k < n2; ++k) {
                    blArray[k] = (n >> k & 1) == 1;
                }
                boolean[] blArray2 = blArray;
                for (fid fid3 : fid.i()) {
                    byte by2 = fid3.d();
                    for (byte by3 = 0; by3 < by2; by3 = (byte)(by3 + 1)) {
                        bOv bOv2 = this.c.b(fid3, by3);
                        bOv2.b(blArray2[by3 * 2 + 1]);
                    }
                }
                int n3 = this.c.b().d();
                for (int n4 = 0; n4 < n3; n4 = (byte)(n4 + 1)) {
                    if (!blArray2[n4 * 2]) continue;
                    this.b((byte)n4);
                }
            }
            catch (RuntimeException runtimeException) {
                b.error((Object)"Unable to load shortcut bar preferences", (Throwable)runtimeException);
            }
            cgu_2.a().a(this);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (this.e) {
            this.d.clear();
            blc_2.a().b();
            this.e();
            fpm_0.b().e("wakfu.shortcutBar");
            fpm_0.b().e("wakfu.osamodasSymbiot");
            azu_0.j().b(cyo_0.a());
            this.c = null;
            this.e = false;
            cgu_2.a().b(this);
        }
    }

    @Override
    public void a(fid fid2) {
        switch (fid2) {
            case b: {
                for (byte by = 4; by < 4; by = (byte)(by + 1)) {
                    bOv bOv2 = this.c.f(by);
                    if (!bOv2.o()) continue;
                    String string = (bOv2.p() ? "verticalSecondaryShortcutBarDialog" : "secondaryShortcutBarDialog") + by;
                    fpm_0.b().o(string);
                }
                break;
            }
            case a: {
                for (byte by = 4; by < 4; by = (byte)(by + 1)) {
                    bOv bOv3 = this.c.f(by);
                    if (!bOv3.o()) continue;
                    String string = bOv3.p() ? "verticalSecondaryShortcutBarDialog" : "secondaryShortcutBarDialog";
                    String string2 = string + by;
                    fpm_0.b().a(string2, cfi_0.a(string), 40960L, (short)10005);
                }
                break;
            }
        }
    }

    @Nullable
    public bOw h() {
        return this.c;
    }
}

