/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

/*
 * Renamed from cZh
 */
public class czh_0
implements ahr_1 {
    private static final czh_0 b = new czh_0();
    private static final Logger c = Logger.getLogger(czh_0.class);
    private ans_1 d;
    protected fwl a = new fwl();
    private bxy_2 e;

    private czh_0() {
        this.a.a((T string) -> {
            bxy_2 bxy_22 = (bxy_2)fis_1.a().d("furnitureCategories", "furnitureListDialog");
            if (bxy_22 == null) {
                return;
            }
            boolean bl = !Cz.f(string);
            for (bxx_2 bxx_22 : bxy_22.a()) {
                if (bl) {
                    bxx_22.a(false);
                }
                fis_1.a().a((ajf_1)bxx_22, "furnitureList", "collapsed");
            }
        });
    }

    public static czh_0 a() {
        return b;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public boolean a(adt_1 adt_12) {
        return true;
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            bxy_2 bxy_22;
            this.d = string -> {
                if (string.equals("furnitureListDialog")) {
                    azu_0.j().b(czh_0.a());
                }
            };
            fpm_0.b().a(this.d);
            fpm_0.b().a("wakfu.furniture", cHd.class);
            fpm_0.b().a("furnitureListDialog", cfi_0.a("furnitureListDialog"), 32769L, (short)10005);
            bmr_1 bmr_12 = azu_0.j().k();
            if (bmr_12 == null) {
                c.error((Object)"[Furniture] Unable to get local player. View will be empty by default");
                fis_1.a().a("furniture", (Object)new bxy_2(), "furnitureListDialog");
                return;
            }
            Optional<ffd> optional = czh_0.c();
            this.e = bxy_22 = optional.map(ffd2 -> new bxy_2(czh_0.a(ffd2))).orElseGet(bxy_2::new);
            fis_1.a().a("furnitureCategories", (Object)bxy_22, "furnitureListDialog");
            fis_1.a().a("furnitureListFilter", (Object)this.a, "furnitureListDialog");
            cdw_0.n().c(600012L);
        }
    }

    private static Optional<ffd> c() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            c.error((Object)"[Furniture] Unable to get local player. View will be empty by default");
            return Optional.empty();
        }
        return ena_0.a().b(bmr_12.R(), end_0.k);
    }

    private static List<bxb_1> a(List<Integer> list) {
        return list.stream().map(czh_0::a).filter(Objects::nonNull).sorted(Comparator.comparing(bxb_1::getFilterableStringValue)).collect(Collectors.toList());
    }

    private static bxb_1 a(Integer n) {
        bjw_1 bjw_12 = bhb_0.d().a(n);
        if (bjw_12 == null) {
            return null;
        }
        return new bxb_1(bjw_12);
    }

    private static List<bxx_2> a(ffd ffd2) {
        HashMap hashMap = new HashMap();
        ffd2.a().forEach(n2 -> {
            int n3 = eum_1.a().c((int)n2);
            hashMap.computeIfAbsent(bxa_1.a().a(n3).a(), n -> new ArrayList()).add(n2);
        });
        ArrayList<bxx_2> arrayList = new ArrayList<bxx_2>();
        for (Map.Entry entry : hashMap.entrySet()) {
            bxx_2 bxx_22 = new bxx_2(bxa_1.a().a((Integer)entry.getKey()), czh_0.a((List)entry.getValue()));
            arrayList.add(bxx_22);
        }
        arrayList.sort(Comparator.comparingInt(bxx_2::b));
        if (!arrayList.isEmpty()) {
            ((bxx_2)arrayList.get(0)).a(false);
        }
        return arrayList;
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        cdw_0.n().c(600013L);
        fpm_0.b().b(this.d);
        fpm_0.b().o("furnitureListDialog");
        fpm_0.b().e("wakfu.furniture");
        fis_1.a().a("furnitureCategories", (Object)null);
        fis_1.a().a("furnitureListFilter", (Object)null);
    }

    public void a(Set<Integer> set) {
        for (Integer n : set) {
            int n2 = eum_1.a().c(n);
            Optional<bxx_2> optional = this.a(n2);
            optional.ifPresentOrElse(bxx_22 -> bxx_22.a(czh_0.a(n)), () -> this.a(n, n2));
        }
    }

    private void a(Integer n, int n2) {
        bxz_2 bxz_22 = bxa_1.a().a(n2);
        bxb_1 bxb_12 = czh_0.a(n);
        if (bxb_12 == null) {
            return;
        }
        ArrayList<bxb_1> arrayList = new ArrayList<bxb_1>();
        arrayList.add(bxb_12);
        bxx_2 bxx_22 = new bxx_2(bxz_22, arrayList);
        this.e.a(bxx_22);
    }

    private Optional<bxx_2> a(int n) {
        for (bxx_2 bxx_22 : this.e.a()) {
            if (bxx_22.c().a() != n) continue;
            return Optional.of(bxx_22);
        }
        return Optional.empty();
    }
}

