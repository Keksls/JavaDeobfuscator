/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ddh
 */
public class ddh_0
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(ddh_0.class);
    private static final ddh_0 b = new ddh_0();
    private bPW c;
    private ans_1 d;

    public static ddh_0 a() {
        return b;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        this.d = string -> {
            if (!string.equals("steleDialog")) {
                return;
            }
            if (azu_0.j().c(ddh_0.a())) {
                azu_0.j().b(ddh_0.a());
            }
        };
        fpm_0.b().a(this.d);
        fpm_0.b().a("wakfu.stele", cJN.class);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        bmr_1 bmr_12;
        if (bl) {
            return;
        }
        fpm_0.b().e("wakfu.stele");
        fpm_0.b().b(this.d);
        if (fpm_0.b().q("steleDialog")) {
            fpm_0.b().o("steleDialog");
        }
        if ((bmr_12 = azu_0.j().k()).hB() == 34) {
            bmr_12.a(false, true);
        }
        fis_1.a().a("stele");
    }

    public void a(bFf bFf2, Ae ae) {
        List<bPU> list = this.c(bFf2.ar(), ae);
        evv_1 evv_12 = bFf2.ar();
        List<bPT> list2 = this.b(evv_12, ae);
        this.c = ddh_0.a(bFf2, evv_12, list, list2);
        this.c.f();
        if (!fpm_0.b().q("steleDialog")) {
            fpm_0.b().a("steleDialog", cfi_0.a("steleDialog"), 17L, (short)10000);
        }
        fis_1.a().a("stele", (Object)this.c, "steleDialog");
    }

    public void a(evv_1 evv_12, Ae ae) {
        List<bPU> list = this.c(evv_12, ae);
        List<bPT> list2 = this.b(evv_12, ae);
        this.c = ddh_0.a(null, evv_12, list, list2);
        if (!fpm_0.b().q("steleDialog")) {
            fpm_0.b().a("steleDialog", cfi_0.a("steleDialog"), 17L, (short)10000);
        }
        fis_1.a().a("stele", (Object)this.c, "steleDialog");
    }

    @NotNull
    private static bPW a(bFf bFf2, evv_1 evv_12, List<bPU> list, List<bPT> list2) {
        return new bPW(evv_12, bFf2, list, list2);
    }

    private List<bPT> b(evv_1 evv_12, Ae ae) {
        ArrayList<bPT> arrayList = new ArrayList<bPT>();
        for (evx_1 evx_12 : evv_12.g()) {
            bpe_0 bpe_02 = (bpe_0)fih_0.a().a(evx_12.c());
            if (bpe_02 == null) {
                a.debug((Object)("[STELE] Invalid state " + evx_12.c() + " for stele " + evv_12.m()));
                continue;
            }
            bPT bPT2 = new bPT(evx_12.a(), evx_12.b(), bpe_02);
            if (ae.g().contains(evx_12.a())) {
                bPT2.a(true);
            }
            arrayList.add(bPT2);
        }
        arrayList.sort(Comparator.comparingInt(bPT::c).thenComparingInt(bPT::b));
        return arrayList;
    }

    private List<bPU> c(evv_1 evv_12, Ae ae) {
        ArrayList<bPU> arrayList = new ArrayList<bPU>();
        int n = bPR.a(evv_12, ae);
        for (Aa aa : ae.d()) {
            ArrayList<bPV> arrayList2 = new ArrayList<bPV>();
            ArrayList<bPV> arrayList3 = new ArrayList<bPV>();
            for (Ai ai : aa.d()) {
                this.a(ai).ifPresentOrElse(arrayList2::add, () -> a.error((Object)("[STELE] Unknown static reward item " + ai.e() + " in stele " + evv_12.m())));
            }
            for (Ai ai : aa.g()) {
                this.a(ai).ifPresentOrElse(arrayList3::add, () -> a.error((Object)("[STELE] Unknown dynamic reward item " + ai.e() + " in stele " + evv_12.m())));
            }
            Optional<evb_1> optional = evv_12.i().stream().filter(evb_12 -> evb_12.b() == aa.c()).findFirst();
            if (optional.isEmpty()) {
                a.error((Object)("[STELE] Unable to find reward tier" + aa.c() + "in stele definition while creating views. Skipping"));
                continue;
            }
            evb_1 evb_13 = (evb_1)optional.get();
            int n2 = evb_13.d();
            arrayList.add(new bPU(aa.c(), n >= aa.k(), aa.k(), arrayList2, arrayList3, n2));
        }
        return arrayList;
    }

    private Optional<bPV> a(Ai ai) {
        exk_2 exk_22 = bhb_0.d().g(ai.e());
        if (exk_22 == null) {
            return Optional.empty();
        }
        bPV bPV2 = new bPV(ai.c(), exk_22, ai.g());
        if (ai.i()) {
            bPV2.a(true);
        }
        return Optional.of(bPV2);
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17666: {
                this.c();
                return false;
            }
            case 17429: {
                dhD dhD2 = (dhD)adt_12;
                bPT bPT2 = dhD2.k();
                this.c.a(bPT2, dhD2.o());
                this.c.f();
                return false;
            }
            case 17051: {
                dhE dhE2 = (dhE)adt_12;
                bPV bPV2 = dhE2.k();
                this.c.a(bPV2);
                this.c.f();
                return false;
            }
        }
        return true;
    }

    private void c() {
        long l = this.c.a();
        List<Integer> list = this.c.b();
        List<Integer> list2 = this.c.c();
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            return;
        }
        if (!this.c.a(list)) {
            return;
        }
        if (!this.c.a(bmr_12)) {
            return;
        }
        azu_0.j().K().c(new cqL(l, list, list2));
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

