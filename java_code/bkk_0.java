/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bKk
 */
public class bkk_0
implements ajh_1 {
    private final String x;
    private final Map<bKG, TreeMap<Integer, bKH>> y = new EnumMap<bKG, TreeMap<Integer, bKH>>(bKG.class);
    private final Set<bKH> z = new TreeSet<bKH>(Comparator.comparing(bKH::aV_).thenComparingInt(bKH::aW_));
    private final bku_0 A;
    private final List<bLe> B = new ArrayList<bLe>();
    private final List<bLl> C = bLl.a();
    private boolean D = false;
    private final List<bKD> E = Arrays.stream(bKC.values()).sorted(Comparator.comparingInt(bKC::a)).map(bKD::new).collect(Collectors.toList());
    public static final String a = "itemRarities";
    public static final String b = "currentFilters";
    public static final String d = "allSelectedRarities";
    public static final String e = "rootItemTypes";
    public static final String f = "nameSearch";
    public static final String g = "minLevel";
    public static final String h = "maxLevel";
    public static final String i = "onlyExtremePrice";
    public static final String j = "onlyIfValid";
    public static final String k = "minPrice";
    public static final String l = "maxPrice";
    public static final String m = "minQuantity";
    public static final String n = "maxQuantity";
    public static final String o = "slotColorsFilter";
    public static final String p = "selectedSlotColors";
    public static final String q = "allSlotColors";
    public static final String r = "availableSublimations";
    public static final String s = "specialSublimations";
    public static final String t = "selectedBasicSublimation";
    public static final String u = "selectedSpecialSublimation";
    public static final String v = "allCharacteristicsGroups";
    public static final String[] w = new String[]{"itemRarities", "nameSearch", "currentFilters", "allSelectedRarities", "rootItemTypes", "minLevel", "maxLevel", "minPrice", "maxPrice", "slotColorsFilter", "selectedSlotColors", "allSlotColors", "availableSublimations", "specialSublimations", "onlyExtremePrice", "onlyIfValid", "selectedBasicSublimation", "selectedSpecialSublimation", "allCharacteristicsGroups", "minQuantity", "maxQuantity"};

    bkk_0(String string) {
        this.A = new bku_0();
        this.x = string;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "itemRarities": {
                return this.C;
            }
            case "currentFilters": {
                return this.z;
            }
            case "allSelectedRarities": {
                TreeMap<Integer, bKH> treeMap = this.y.get((Object)bKG.c);
                if (treeMap == null) {
                    return bae.h().a("market.filter.rarities.all", new Object[0]);
                }
                return treeMap.values().stream().map(bKH::b).collect(Collectors.joining(", "));
            }
            case "rootItemTypes": {
                return this.B;
            }
            case "nameSearch": {
                Object t = this.a(bKG.a);
                if (t == null) {
                    return null;
                }
                return ((bKK)t).g();
            }
            case "onlyExtremePrice": {
                return this.d(bKG.d);
            }
            case "onlyIfValid": {
                return this.d(bKG.e);
            }
            case "minLevel": {
                return this.a(bKG.b, true);
            }
            case "maxLevel": {
                return this.a(bKG.b, false);
            }
            case "minPrice": {
                return this.a(bKG.f, true);
            }
            case "maxPrice": {
                return this.a(bKG.f, false);
            }
            case "minQuantity": {
                return this.a(bKG.h, true);
            }
            case "maxQuantity": {
                return this.a(bKG.h, false);
            }
            case "slotColorsFilter": {
                return this.a(bKG.i);
            }
            case "selectedSlotColors": {
                return this.A.f();
            }
            case "allSlotColors": {
                return this.A.k();
            }
            case "availableSublimations": {
                return this.A.g();
            }
            case "specialSublimations": {
                return this.A.h();
            }
            case "selectedBasicSublimation": {
                bks_0 bks_02 = (bks_0)this.a(bKG.j, 0);
                return bks_02 == null ? this.A.n() : bks_02.g();
            }
            case "selectedSpecialSublimation": {
                bks_0 bks_03 = (bks_0)this.a(bKG.j, 1);
                return bks_03 == null ? this.A.o() : bks_03.g();
            }
            case "allCharacteristicsGroups": {
                return this.E;
            }
        }
        return null;
    }

    private void c(bKG bKG2) {
        if (bKG2 == bKG.b || bKG2 == bKG.c || bKG2 == bKG.l) {
            this.n();
        }
    }

    private void n() {
        Object object2;
        bKJ bKJ2 = (bKJ)this.a(bKG.b);
        short s2 = bKJ2 != null && bKJ2.g() ? (short)bKJ2.i() : (short)0;
        short s3 = bKJ2 != null && bKJ2.h() ? (short)bKJ2.j() : (short)245;
        EnumSet<exw_1> enumSet = EnumSet.noneOf(exw_1.class);
        Collection collection = this.b(bKG.c);
        for (Object object2 : collection) {
            if (object2 == null) continue;
            enumSet.add(((bKQ)object2).g());
        }
        LinkedList linkedList = new LinkedList();
        object2 = this.b(bKG.l);
        Iterator iterator = object2.iterator();
        while (iterator.hasNext()) {
            bki_0 bki_02 = (bki_0)iterator.next();
            if (bki_02 == null) continue;
            linkedList.add(bki_02.g());
        }
        if (bKJ2 == null && enumSet.isEmpty() && linkedList.isEmpty()) {
            bhc_1.a().b();
        } else {
            bhc_1.a().a((Map.Entry<String, bjw_1> entry) -> {
                bjw_1 bjw_12 = (bjw_1)entry.getValue();
                if (bjw_12.G() < s2 || bjw_12.G() > s3) {
                    return false;
                }
                if (!enumSet.isEmpty() && !enumSet.contains(bjw_12.M())) {
                    return false;
                }
                return linkedList.isEmpty() || bkk_0.a(linkedList, bjw_12.F());
            });
        }
    }

    private static boolean a(List<bhg_0> list, exq_1 exq_12) {
        for (bhg_0 bhg_02 : list) {
            if (!exq_12.c(bhg_02)) continue;
            return true;
        }
        return false;
    }

    @Nullable
    public <T extends bKH> T a(bKG bKG2) {
        bKH bKH3 = this.z.stream().filter(bKH2 -> bKH2.aV_() == bKG2).findFirst().orElse(null);
        return (T)bKH3;
    }

    @Nullable
    public <T extends bKH> T a(bKG bKG2, int n) {
        bKH bKH3 = this.z.stream().filter(bKH2 -> bKH2.aV_() == bKG2 && bKH2.aW_() == n).findFirst().orElse(null);
        return (T)bKH3;
    }

    @NotNull
    public <T extends bKH> Collection<T> b(bKG bKG2) {
        return this.z.stream().filter(bKH2 -> bKH2.aV_() == bKG2).map(bKH2 -> bKH2).collect(Collectors.toList());
    }

    @Nullable
    private Long a(bKG bKG2, boolean bl) {
        bkp_0 bkp_02 = (bkp_0)this.a(bKG2);
        if (bkp_02 == null) {
            return null;
        }
        long l = bl ? bkp_02.i() : bkp_02.j();
        return l == -1L ? null : Long.valueOf(l);
    }

    @Nullable
    private Boolean d(bKG bKG2) {
        bKE bKE2 = (bKE)this.a(bKG2);
        if (bKE2 == null) {
            return null;
        }
        return bKE2.c();
    }

    public void a(bKH bKH2) {
        bKH bKH3 = this.y.computeIfAbsent(bKH2.aV_(), bKG2 -> new TreeMap()).put(bKH2.aW_(), bKH2);
        if (bKH3 != null) {
            this.z.remove(bKH3);
        }
        this.z.add(bKH2);
        this.c(bKH2.aV_());
        fis_1.a().a((ajf_1)this, b);
    }

    public void b(bKH bKH2) {
        if (bKH2.a()) {
            this.a(bKH2);
        } else {
            this.c(bKH2);
        }
    }

    public void c(bKH bKH2) {
        bKG bKG2 = bKH2.aV_();
        TreeMap<Integer, bKH> treeMap = this.y.get((Object)bKG2);
        if (treeMap != null) {
            treeMap.remove(bKH2.aW_());
            this.z.remove(bKH2);
            if (treeMap.isEmpty()) {
                this.y.remove((Object)bKG2);
            }
        }
        this.c(bKH2.aV_());
        fis_1.a().a((ajf_1)this, b);
    }

    public void a(@Nullable faC faC2) {
        ArrayList<bKH> arrayList = new ArrayList<bKH>(this.z);
        this.y.clear();
        this.z.clear();
        if (faC2 != null) {
            arrayList.forEach(bKH2 -> bKH2.c(faC2));
        }
        this.n();
        fis_1.a().a((ajf_1)this, b);
    }

    public void a() {
        this.A.b();
        fis_1.a().a((ajf_1)this, p);
    }

    public void a(boolean bl) {
        this.A.a(bl);
        fis_1.a().a((ajf_1)this, r, s);
    }

    @Nullable
    public bLj a(String string, boolean bl) {
        return this.A.a(string, bl);
    }

    @NotNull
    public bKR b(boolean bl) {
        ArrayList<faL> arrayList = new ArrayList<faL>();
        for (bLi bLi2 : this.A.f()) {
            arrayList.add(bLi2.a());
        }
        bKR bKR2 = new bKR(arrayList, bl, () -> {
            this.A.a();
            fis_1.a().a((ajf_1)this, p);
        });
        this.b(bKR2);
        return bKR2;
    }

    public void b() {
        fis_1.a().a((ajf_1)this, f);
    }

    public void c() {
        fis_1.a().a((ajf_1)this, g, h);
    }

    public void e() {
        fis_1.a().a((ajf_1)this, i);
    }

    public void f() {
        fis_1.a().a((ajf_1)this, k, l);
    }

    public void g() {
        fis_1.a().a((ajf_1)this, m, n);
    }

    public void h() {
        fis_1.a().a((ajf_1)this, j);
    }

    public void i() {
        fis_1.a().a((ajf_1)this, t, u);
    }

    public void j() {
        fis_1.a().a((ajf_1)this, a, d);
    }

    void c(boolean bl) {
        if (!bl) {
            this.y.clear();
            this.z.forEach(bKH::f);
            this.z.clear();
            this.C.forEach(bLl2 -> bLl2.a(false));
            this.k();
        }
        if (!bl || this.B.isEmpty()) {
            this.o();
        }
        this.n();
        fis_1.a().a((ajf_1)this, b, a);
    }

    private void o() {
        this.B.clear();
        for (bhg_0 bhg_02 : bHJ.a().d()) {
            if (!bhg_02.k()) continue;
            this.B.add(new bLe(bhg_02, null));
        }
        this.B.sort(bLe.a);
    }

    public void k() {
        this.y.remove((Object)bKG.i);
        this.z.removeIf(bKH2 -> bKH2.aV_() == bKG.i);
        this.A.a();
        this.a();
        this.a(false);
        fis_1.a().a((ajf_1)this, b, p);
    }

    @Override
    public String[] d() {
        return w;
    }

    public String toString() {
        return "MarketFilterSetView{" + this.x + "}";
    }

    public bku_0 l() {
        return this.A;
    }

    public boolean m() {
        return this.D;
    }

    public void d(boolean bl) {
        this.D = bl;
    }
}

