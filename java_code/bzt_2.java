/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bzt
 */
public class bzt_2
extends bzw_2 {
    public static final String a = "itemCategoriesList";
    public static final String b = "formattedItemAmount";
    public static final String d = "splitByEquipmentPosition";
    public static final String e = "displayOtherHeroesItems";
    public static final String f = "selectedEquipmentSlot";
    public static final String g = "selectedEquipmentSlotName";
    public static final String h = "selectedEquipmentSlotIcon";
    public static final String i = "currentEquipmentSheetView";
    public static final String j = "actorDescriptorLibrary";
    public static final String k = "actorAnimationName";
    public static final String l = "filters";
    private static final String[] r = (String[])ArrayUtils.addAll((Object[])bzw_2.q, (Object[])new String[]{"itemCategoriesList", "formattedItemAmount", "splitByEquipmentPosition", "displayOtherHeroesItems", "selectedEquipmentSlot", "selectedEquipmentSlotName", "selectedEquipmentSlotIcon", "currentEquipmentSheetView", "actorDescriptorLibrary", "actorAnimationName", "filters"});
    private static final String s = "downscaling";
    private final bzo_1 t;
    @NotNull
    private bjc_1 u;
    @Nullable
    private bja_1 v = null;
    private final bzs_1 w;
    private boolean x = false;
    private boolean y;
    private boolean z;
    private final Map<Long, bzr_2> A = new LinkedHashMap<Long, bzr_2>();
    private final Map<Byte, bzr_2> B = new LinkedHashMap<Byte, bzr_2>();
    private final Map<Byte, Map<Long, bzr_2>> C = new LinkedHashMap<Byte, Map<Long, bzr_2>>();
    private final List<bzc_1> D = new ArrayList<bzc_1>();
    @NotNull
    private bzh_2 E = bzh_2.g;

    public bzt_2(bzo_1 bzo_12, @NotNull bjc_1 bjc_12, @Nullable bzt_2 bzt_22) {
        this.t = bzo_12;
        this.u = bjc_12;
        if (bzt_22 != null) {
            this.D.addAll(bzt_22.D);
        }
        this.w = new bzs_1(Collections.unmodifiableList(this.D));
        this.y = ((bvx_0)ans_0.D().h()).a(bWe.aV);
        this.z = ((bvx_0)ans_0.D().h()).a(bWe.aW);
        bzt_2.h();
    }

    private void a(String ... stringArray) {
        fis_1.a().a((ajf_1)this, stringArray);
    }

    private static void h() {
        fyy_0 fyy_02 = fpm_0.b().h().d("heroBuildDialog");
        if (fyy_02 == null) {
            return;
        }
        fyb_0 fyb_02 = fyy_02.a("currentCharacterDisplay");
        if (!(fyb_02 instanceof frO)) {
            return;
        }
        frO frO2 = (frO)fyb_02;
        frO2.setDirection(aej_2.a((int)frO2.getDirection()).c((int)0).l);
    }

    public void a(@NotNull bji_1 bji_12) {
        this.u = bji_12;
        this.j();
        this.a(i, j, k);
        this.k();
    }

    public void a(boolean bl) {
        this.y = bl;
        this.a(a, b);
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe.aV, this.y);
    }

    public void b(boolean bl) {
        this.z = bl;
        this.a(a, b);
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe.aW, this.z);
    }

    @Override
    protected int a() {
        return 0;
    }

    @Override
    protected String b() {
        return s;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "itemCategoriesList": {
                return this.i();
            }
            case "formattedItemAmount": {
                int n = 0;
                for (bzr_2 bzr_22 : this.i()) {
                    n += bzr_22.b().size();
                }
                return "(" + n + ")";
            }
            case "splitByEquipmentPosition": {
                return this.y;
            }
            case "displayOtherHeroesItems": {
                return this.z;
            }
            case "selectedEquipmentSlot": {
                return this.v;
            }
            case "selectedEquipmentSlotName": {
                return this.v != null ? bae.h().a(this.v.a().B, new Object[0]) : bae.h().a("equipments", new Object[0]);
            }
            case "selectedEquipmentSlotIcon": {
                if (this.v == null) {
                    return null;
                }
                return azs_0.a().a(this.v.a().b());
            }
            case "currentEquipmentSheetView": {
                return this.u;
            }
            case "actorDescriptorLibrary": {
                return ((blx_1)this.t.j()).bv();
            }
            case "actorAnimationName": {
                if (this.t.b()) {
                    return "AnimStatique";
                }
                exk_2 exk_22 = ((bji_1)this.u).e().a(this.t.c().dC(), exh_2.p);
                if (exk_22 != null) {
                    return "AnimStatique03-Boucle-" + bwd_0.a(exk_22.U());
                }
                return "AnimStatique";
            }
            case "filters": {
                return this.w;
            }
        }
        return super.b(string);
    }

    public void a(Collection<bmk_1> collection) {
        Object object;
        HashMap hashMap = new HashMap();
        this.A.forEach((l, bzr_22) -> hashMap.put(l, bzr_22.a()));
        HashMap hashMap2 = new HashMap();
        this.B.forEach((by, bzr_22) -> hashMap2.put(by, bzr_22.a()));
        HashMap hashMap3 = new HashMap();
        this.C.forEach((by, map2) -> map2.forEach((l, bzr_22) -> hashMap3.put(Cm.a(by, l), bzr_22.a())));
        this.A.clear();
        this.B.clear();
        this.C.clear();
        for (exh_2 object2 : exh_2.z) {
            this.B.put(object2.A, new bzr_2(object2));
            this.C.put(object2.A, new LinkedHashMap());
        }
        if (collection.isEmpty()) {
            object = azu_0.j().k();
            if (object != null) {
                this.a(((epq_2)object).a_(), ((bmr_1)object).dp(), this.a((bmr_1)object));
            }
        } else {
            for (bmk_1 bmk_12 : bzt_2.b(collection)) {
                bmr_1 bmr_12 = (bmr_1)bmk_12.l();
                this.a(bmr_12.a_(), bmr_12.dp(), this.a(bmr_12));
            }
        }
        if (this.t.b()) {
            object = this.t.d();
            this.a(((eBt)object).b(), bqV.b((eBt)object), bzt_2.a((eBt)object));
        }
        this.B.values().removeIf(bzr_22 -> bzr_22.b().isEmpty());
        this.A.forEach((l, bzr_22) -> bzr_22.a(hashMap.getOrDefault(l, false)));
        this.B.forEach((by, bzr_22) -> bzr_22.a(hashMap2.getOrDefault(by, false)));
        this.C.forEach((by, map2) -> map2.forEach((l, bzr_22) -> bzr_22.a(hashMap3.getOrDefault(Cm.a(by, l), false))));
        this.a(a, b);
    }

    private static Collection<bmk_1> b(Collection<bmk_1> collection) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return collection;
        }
        Optional<bmk_1> optional = collection.stream().filter(bmk_12 -> bmk_12.f() == bmr_12.a_()).findFirst();
        if (optional.isEmpty()) {
            return collection;
        }
        ArrayList<bmk_1> arrayList = new ArrayList<bmk_1>(collection);
        if (arrayList.remove(optional.get())) {
            arrayList.add(0, optional.get());
        }
        return arrayList;
    }

    private void a(long l, String string, List<exk_2> list) {
        List<exk_2> list2 = this.a(list);
        this.b(list2);
        bzr_2 bzr_22 = new bzr_2(string);
        bzr_22.a(list2);
        this.A.put(l, bzr_22);
        this.b(l, string, list2);
    }

    private List<exk_2> a(bmr_1 bmr_12) {
        eyt_0 eyt_02 = bmr_12.dC();
        if (eyt_02 == null || bmr_12.a_() != this.t.e()) {
            return List.of(bmr_12.da().e());
        }
        ArrayList<exk_2> arrayList = new ArrayList<exk_2>();
        HashSet<Long> hashSet = new HashSet<Long>();
        for (exk_2 exk_22 : bmr_12.da().e()) {
            if (hashSet.contains(exk_22.a())) continue;
            arrayList.add(exk_22);
            hashSet.add(exk_22.a());
        }
        for (exk_2 exk_23 : eyt_02.a().values()) {
            if (hashSet.contains(exk_23.a())) continue;
            arrayList.add(exk_23);
            hashSet.add(exk_23.a());
        }
        return arrayList;
    }

    private static List<exk_2> a(eBt eBt2) {
        ArrayList<exk_2> arrayList = new ArrayList<exk_2>();
        eBt2.h().forEach(arrayList::add);
        return arrayList;
    }

    private void b(long l2, String string, List<exk_2> list) {
        for (exk_2 exk_22 : list) {
            for (exh_2 exh_22 : exk_22.T().F().h()) {
                this.B.get(exh_22.a()).a(exk_22);
                this.C.get(exh_22.a()).computeIfAbsent(l2, l -> new bzr_2(string)).a(exk_22);
            }
        }
    }

    private List<exk_2> a(List<exk_2> list) {
        return list.stream().filter(exk_22 -> !(exk_22 instanceof exj_2)).filter(exk_22 -> exk_22.T().T()).filter(this::b).collect(Collectors.toList());
    }

    private void b(List<exk_2> list) {
        list.sort(this.E.a().thenComparingInt(exk_2::aT_).thenComparingLong(exk_2::a));
    }

    private boolean b(exk_2 exk_22) {
        for (bzc_1 bzc_12 : this.D) {
            if (bzc_12.a(exk_22)) continue;
            return false;
        }
        return true;
    }

    private Collection<bzr_2> i() {
        if (this.v == null) {
            if (this.y) {
                return this.B.values();
            }
            return this.A.values();
        }
        if (this.z) {
            return this.C.get(this.v.a().a()).values();
        }
        bzr_2 bzr_22 = this.C.get(this.v.a().a()).get(this.t.e());
        return bzr_22 == null ? Collections.emptyList() : List.of(bzr_22);
    }

    public void a(@Nullable bja_1 bja_12) {
        if (this.v != null) {
            this.v.a(false);
            fis_1.a().a((ajf_1)this.v, this.v.d());
        }
        if (bja_12 != null && this.v == bja_12) {
            this.v = null;
            this.a(a, b, f, g, h);
            return;
        }
        this.v = bja_12;
        if (this.v != null) {
            this.v.a(true);
            fis_1.a().a((ajf_1)this.v, this.v.d());
        }
        this.a(a, b, f, g, h);
    }

    private void j() {
        if (this.v != null) {
            this.v = this.u.a(this.v.a());
            this.v.a(true);
            this.a(f, g, h);
        }
    }

    private void k() {
        this.i().forEach(bzr_22 -> bzr_22.b().forEach(exk_2::P));
    }

    public void a(bzc_1 bzc_12) {
        this.D.removeIf(bzc_13 -> bzc_13.b() == bzc_12.b());
        if (bzc_12.a()) {
            this.D.add(bzc_12);
        }
        this.a(cxo_0.o().valueCollection());
        fis_1.a().a((ajf_1)this.w, this.w.d());
        if (bzc_12.b() == bzd_1.b) {
            ((bvx_0)ans_0.D().h()).a((agp_0)bWe.aX, bzc_12.c());
        }
    }

    public <T extends bzc_1> Optional<T> a(bzd_1 bzd_12) {
        for (bzc_1 bzc_12 : this.D) {
            if (bzc_12.b() != bzd_12) continue;
            return Optional.of(bzc_12);
        }
        return Optional.empty();
    }

    public void a(bzh_2 bzh_22) {
        this.E = bzh_22;
        this.a(cxo_0.o().valueCollection());
    }

    public void c() {
        this.u.c();
    }

    public void a(exk_2 exk_22) {
        if (exk_22 == null) {
            return;
        }
        @NotNull Object[] objectArray = exk_22.U().h();
        if (objectArray.length == 0) {
            this.x = false;
            return;
        }
        this.x = true;
        for (bja_1 bja_12 : this.u.b().values()) {
            bja_12.b(ArrayUtils.contains((Object[])objectArray, (Object)bja_12.a()));
            fis_1.a().a((ajf_1)bja_12, "additionalBorder");
        }
    }

    public void e() {
        if (!this.x) {
            return;
        }
        for (bja_1 bja_12 : this.u.b().values()) {
            bja_12.b(false);
            fis_1.a().a((ajf_1)bja_12, "additionalBorder");
        }
        this.x = false;
    }

    @Override
    public String[] d() {
        return r;
    }

    @NotNull
    public bjc_1 f() {
        return this.u;
    }
}

