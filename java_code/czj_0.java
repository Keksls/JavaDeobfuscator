/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from cZj
 */
public class czj_0
implements ahr_1 {
    private static final Logger a = Logger.getLogger(czj_0.class);
    private static final czj_0 b = new czj_0();
    private ans_1 c;
    private final HashSet<Integer> d = new HashSet();
    private final fwl e = new fwl();

    public static czj_0 a() {
        return b;
    }

    public czj_0() {
        this.e.a((T string) -> {
            List list = (List)fis_1.a().e("guideCategories");
            boolean bl = !Cz.f(string);
            for (brq_1 brq_12 : list) {
                if (bl) {
                    brq_12.a(false);
                }
                fis_1.a().a((ajf_1)brq_12, "guides", "collapsed");
            }
        });
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 18404: {
                dfc dfc2 = (dfc)adt_12;
                brr_2 brr_22 = (brr_2)dfc2.j();
                czj_0.a(brr_22);
                this.b(brr_22);
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        this.c = string -> {
            if (string.equals("guideListDialog")) {
                azu_0.j().b(b);
            }
        };
        fpm_0.b().a(this.c);
        fpm_0.b().a("guideListDialog", cfi_0.a("guideListDialog"), 32768L, (short)10000);
        fpm_0.b().a("wakfu.guideList", chf_0.class);
        fpm_0.b().a("wakfu.guidePopup", cHg.class);
        fis_1.a().a("guideListFilter", this.e);
        czj_0.c();
        cdw_0.n().c(600012L);
    }

    private static void c() {
        Optional optional = bhh_1.a(end_0.m);
        if (optional.isEmpty()) {
            return;
        }
        ArrayList<brq_1> arrayList = czj_0.a((fjh_0)optional.get());
        arrayList.sort(Comparator.comparingInt(brq_1::b));
        for (brq_1 brq_12 : arrayList) {
            brq_12.e();
        }
        fis_1.a().a("guideCategories", arrayList);
        czj_0.a(arrayList, (fjh_0)optional.get());
    }

    private static ArrayList<brq_1> a(fjh_0 fjh_02) {
        HashMap<Integer, brq_1> hashMap = new HashMap<Integer, brq_1>();
        for (int n : fjh_02.a()) {
            ajf_1 ajf_12;
            apc_2 apc_22;
            brm_2 brm_22;
            Optional<brm_2> optional = brp_2.a().b(n);
            if (optional.isEmpty() || (brm_22 = optional.get()).g().isEmpty() || (apc_22 = brm_22.f()) != null && ((ajf_12 = azu_0.j().k()) == null || !apc_22.b(ajf_12, ajf_12, null, ((epq_2)((Object)ajf_12)).Q_()))) continue;
            ajf_12 = new brr_2(brm_22);
            ((brr_2)ajf_12).a(fjh_02.b().contains(n));
            brq_1 brq_12 = hashMap.getOrDefault(brm_22.c(), czj_0.a(brm_22.c()));
            if (brq_12 == null) {
                a.warn((Object)("[GUIDE] No category found for id=" + brm_22.c()));
                continue;
            }
            brq_12.a((brr_2)ajf_12);
            hashMap.putIfAbsent(brm_22.c(), brq_12);
        }
        return new ArrayList<brq_1>(hashMap.values());
    }

    private static void a(ArrayList<brq_1> arrayList, fjh_0 fjh_02) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean bl = czj_0.b(arrayList, fjh_02);
        if (bl) {
            return;
        }
        czj_0.a(arrayList);
    }

    private static boolean b(ArrayList<brq_1> arrayList, fjh_0 fjh_02) {
        int n = ((bvx_0)ans_0.D().h()).d(bWe.aR);
        if (n <= 0) {
            return false;
        }
        if (!fjh_02.a().contains(n)) {
            return false;
        }
        for (brq_1 brq_12 : arrayList) {
            Optional<brr_2> optional = brq_12.f().stream().filter(brr_22 -> brr_22.i() == n).findFirst();
            if (!optional.isPresent()) continue;
            brq_12.a(false);
            czj_0.a(optional.get());
            return true;
        }
        return false;
    }

    private static void a(ArrayList<brq_1> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        brq_1 brq_12 = arrayList.get(0);
        if (brq_12.f().isEmpty()) {
            return;
        }
        brq_12.a(false);
        czj_0.a(brq_12.f().get(0));
    }

    private static void a(brr_2 brr_22) {
        brr_2 brr_23 = (brr_2)fis_1.a().d("guideViewPopup", "guideListDialog");
        if (brr_23 != null) {
            brr_23.b(false);
        }
        brr_22.b(true);
        fis_1.a().a("guideViewPopup", (Object)brr_22, "guideListDialog");
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe.aR, brr_22.i());
    }

    private static brq_1 a(int n) {
        Optional<brn_2> optional = brp_2.a().a(n);
        return optional.map(brq_1::new).orElse(null);
    }

    private void b(brr_2 brr_22) {
        if (!brr_22.c()) {
            return;
        }
        this.d.add(brr_22.i());
        brr_22.a(false);
        int n = brr_22.j();
        List list = (List)fis_1.a().e("guideCategories");
        if (list == null) {
            return;
        }
        for (brq_1 brq_12 : list) {
            if (brq_12.g() != n) continue;
            fis_1.a().a((ajf_1)brq_12, "unread");
            break;
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        if (!this.d.isEmpty()) {
            brl_2.a(this.d);
            this.d.clear();
        }
        cdw_0.n().c(600013L);
        fpm_0.b().b(this.c);
        fpm_0.b().o("guideListDialog");
        fis_1.a().a("guideCategories", (Object)null);
        fis_1.a().a("guideListFilter", (Object)null);
        fpm_0.b().e("wakfu.guideList");
        if (!fpm_0.b().q("guidePopupDialog")) {
            fpm_0.b().e("wakfu.guidePopup");
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

