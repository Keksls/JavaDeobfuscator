/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from bHv
 */
public class bhv_1
implements exp_2 {
    public static final String a = "itemRefId";
    public static final String b = "uId";
    public static final String c = "isEnabled";
    public static final String d = "isActive";
    public static final String e = "quantity";
    public static final String f = "quantityText";
    public static final String g = "description";
    public static final String h = "levelDescription";
    public static final String i = "iconUrl";
    public static final String j = "baseIconUrl";
    public static final String k = "iconBigUrl";
    public static final String l = "movable";
    public static final String m = "usableInFight";
    public static final String n = "backgroundStyle";
    public static final String o = "isEquiped";
    public static final String p = "isCurrentlyEquipped";
    public static final String q = "isInInventoryOrEquipment";
    public static final String r = "isInInventory";
    public static final String s = "usedInCurrentRecipe";
    public static final String t = "deletable";
    public static final String u = "usable";
    public static final String v = "usableNow";
    public static final String w = "clickDescription";
    public static final String x = "isEmptySlot";
    public static final String y = "hasPet";
    public static final String z = "hasXp";
    public static final String A = "currentXpPercentage";
    public static final String B = "currentXpDescription";
    public static final String C = "currentXpLevel";
    public static final String D = "isRefItem";
    public static final String E = "isSortable";
    public static final String F = "isItemSetMergeable";
    public static final String G = "isLevelValid";
    public static final String H = "canMergeItemSet";
    public static final String I = "hasInvalidActions";
    public static final String J = "invalidActionsDescription";
    public static final String K = "companionLevel";
    public static final String L = "setItems";
    public static final String M = "hasMimiSymbic";
    public static final String N = "canFullRegenWith";
    public static final String O = "themeItemBorderUrl";
    public static final String P = "themeItemBorderStyle";
    public static final String Q = "themeItemDisabledBorderStyle";
    public static final String R = "hasVariableElements";
    public static final String S = "hasRollableItemElements";
    public static final String T = "hasChoosableItemElements";
    public static final String U = "canRollItemElements";
    public static final String V = "randomElementsText";
    public static final String W = "isRecyclable";
    public static final String X = "recyclingResult";
    public static final String Y = "identificationNeeded";
    public static final String Z = "darkened";
    public static final String aa = "hasShards";
    public static final String ab = "tabbedContainerSize";
    public static final String[] ac = new String[]{"itemRefId", "isActive", "quantity", "levelDescription", "movable", "usableInFight", "backgroundStyle", "isEquiped", "usedInCurrentRecipe", "deletable", "usable", "usableNow", "clickDescription", "isEmptySlot", "hasXp", "currentXpPercentage", "currentXpDescription", "currentXpLevel", "hasPet", "isRefItem", "canMergeItemSet", "companionLevel", "setItems", "hasMimiSymbic", "isRecyclable", "recyclingResult", "identificationNeeded", "hasVariableElements", "hasShards", "quantityText", "themeItemBorderUrl", "themeItemBorderStyle", "themeItemDisabledBorderStyle", "darkened", "isLevelValid"};
    protected static final Logger ad = Logger.getLogger(bhv_1.class);
    private final String[] af = new String[]{"itemPopupDetail"};
    private final TLongObjectHashMap<bia_0> ag = new TLongObjectHashMap();
    private final TLongObjectHashMap<ArrayList<String>> ah = new TLongObjectHashMap();
    private final TLongObjectHashMap<ArrayList<String>> ai = new TLongObjectHashMap();
    private final TLongObjectHashMap<ArrayList<String>> aj = new TLongObjectHashMap();
    private final TLongObjectHashMap<ArrayList<String>> ak = new TLongObjectHashMap();
    private final TLongHashSet al = new TLongHashSet();
    private static final int am = 330;
    private static final int an = 106;
    private static final int ao = 24;
    private static final int ap = 35;
    private static final int aq = 288;
    private static final int ar = 309;

    public bhv_1() {
        enp_2.a.a((ens_22, object) -> {
            if (ens_22 != ens_2.aL) {
                return;
            }
            this.c();
        });
    }

    @Override
    public String[] a() {
        return ac;
    }

    @Override
    public Object a(exk_2 exk_22, String string) {
        bmr_1 bmr_12;
        bmr_1 bmr_13 = bmr_12 = cZI.D() != null ? cZI.D() : azu_0.j().k();
        if (string.equals(D)) {
            return false;
        }
        if (string.equals(e)) {
            return exk_22.e();
        }
        if (string.equals(f)) {
            return "\u00d7" + exk_22.e();
        }
        if (string.equals(a)) {
            return "(" + exk_22.aT_() + ")";
        }
        if (string.equals(g)) {
            String string2 = exk_22.T().g();
            if (string2 == null || string2.isEmpty()) {
                return null;
            }
            return "\"" + string2 + "\"";
        }
        if (string.equals("level")) {
            return exk_22.c();
        }
        if (string.equals(h)) {
            boolean bl = bhv_1.A(exk_22);
            ani_2 ani_22 = new ani_2();
            if (!bl) {
                ani_22.i().a("ff4a4a");
            }
            ani_22.a((CharSequence)bae.h().a("levelShort.custom", exk_22.c()));
            if (!bl) {
                ani_22.j();
            }
            return ani_22.r();
        }
        if (string.equals(c)) {
            return true;
        }
        if (string.equals(d)) {
            return exk_22.aU_();
        }
        if (string.equals(n)) {
            return bhv_1.i(exk_22);
        }
        if (string.equals(i)) {
            return this.g(exk_22);
        }
        if (string.equals(j)) {
            return this.h(exk_22);
        }
        if (string.equals(k)) {
            Object t = euu_2.f(bmr_12.U_(), exk_22.a());
            if (t != null) {
                return azs_0.a().f(((epq_2)t).gX() == 1 ? exk_22.K() : exk_22.I());
            }
            return azs_0.a().f(bmr_12.gX() == 1 ? exk_22.K() : exk_22.I());
        }
        if (string.equals(l)) {
            return this.p(exk_22) && !bhv_1.d(exk_22) && !bhv_1.c(exk_22) && !((bjw_1)exk_22.T()).h() && !daw.b(exk_22);
        }
        if (string.equals(m)) {
            return exk_22.V();
        }
        if (string.equals(r)) {
            return euu_2.c(bmr_12.U_(), exk_22.a()) != null;
        }
        if (string.equals(o)) {
            return euu_2.e(bmr_12.U_(), exk_22.a()) != null;
        }
        if (string.equals(p)) {
            eyz_0 eyz_02 = bmr_12.cG();
            if (eyz_02 == null) {
                return false;
            }
            for (exh_2 exh_22 : exk_22.T().F().h()) {
                Long l = eyz_02.a(exh_22);
                if (l == null || l.longValue() != exk_22.a()) continue;
                return true;
            }
            return bhv_1.a(bmr_12, exk_22);
        }
        if (string.equals(q)) {
            return euu_2.f(bmr_12.U_(), exk_22.a()) != null || bhv_1.a(bmr_12, exk_22);
        }
        if (string.equals(s)) {
            return ((bjw_1)exk_22.T()).h();
        }
        if (string.equals(t)) {
            apc_2 apc_22 = exk_22.T().a(exz_1.h);
            bmr_1 bmr_14 = (bmr_1)euu_2.c(bmr_12.U_(), exk_22.a());
            if (bmr_14 == null) {
                return false;
            }
            return !bhv_1.d(exk_22) && !bhv_1.c(exk_22) && !((bjw_1)exk_22.T()).h() && (apc_22 == null || apc_22.b(bmr_14, bmr_14.P_(), exk_22, bmr_14.ge()));
        }
        if (string.equals(u)) {
            big_1 big_12 = (big_1)exk_22.T().p();
            boolean bl = big_12 != null && big_12.e();
            return big_12 == null && exk_22.W() || bl;
        }
        if (string.equals(v)) {
            return bhv_1.k(exk_22);
        }
        if (string.equals("boundDescription")) {
            if (!exk_22.aa()) {
                return null;
            }
            if (exk_22.ab()) {
                return bae.h().a(exk_22.n().a().g() ? "item.bound.character" : "item.bound", new Object[0]);
            }
            ani_2 ani_23 = new ani_2().i().a(azf_2.h).a((CharSequence)bae.h().a(exk_22.n().a().h(), new Object[0]));
            return ani_23.r();
        }
        if (string.equals(x)) {
            return false;
        }
        if (string.equals(w)) {
            String string3;
            boolean bl;
            ani_2 ani_24 = new ani_2();
            if (azu_0.j().c(dao.d())) {
                return bae.h().a("clickToSell", new Object[0]);
            }
            Boolean bl2 = (Boolean)this.a(exk_22, u);
            if (bl2.booleanValue()) {
                bl = bhv_1.k(exk_22);
                if (!bl) {
                    ani_24.i().a("ff0000");
                }
                ani_24.a((CharSequence)bae.h().a("leftClickToUse", new Object[0]));
                if (!bl) {
                    ani_24.j();
                }
            }
            if (exk_22.T().U()) {
                if (bl2.booleanValue()) {
                    ani_24.m();
                }
                if (!(bl = bhv_1.x(exk_22))) {
                    ani_24.i().a("ff0000");
                }
                ani_24.a((CharSequence)bae.h().a("leftClickToEquip", new Object[0]));
                if (!bl) {
                    ani_24.j();
                }
            }
            if (exk_22.aQ_()) {
                ani_24.m();
                ani_24.a((CharSequence)bae.h().a("rightClickToManagePet", new Object[0]));
                if (exk_22.f().o()) {
                    ani_24.m();
                    ani_24.i().a("ff0000");
                    ani_24.a((CharSequence)bae.h().a("pet.sleeping", new Object[0]));
                    ani_24.j();
                }
            }
            return !(string3 = ani_24.r()).isEmpty() ? string3 : null;
        }
        if (string.equals("effect") || string.equals("shortEffectDetails")) {
            return this.s(exk_22);
        }
        if (string.equals("criticalEffectDetails")) {
            return this.t(exk_22);
        }
        if (string.equals("allCharacteristics")) {
            ArrayList<String> arrayList = new ArrayList<String>();
            ArrayList<String> arrayList2 = this.v(exk_22);
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
            return arrayList.isEmpty() ? null : arrayList;
        }
        if (string.equals("effectAndCaracteristic")) {
            Object object;
            Object object2;
            ArrayList<Object> arrayList = new ArrayList<Object>();
            ArrayList<String> arrayList3 = this.s(exk_22);
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                arrayList.add(bae.h().a("effectOnUse", new Object[0]));
                object2 = arrayList3.iterator();
                while (object2.hasNext()) {
                    object = (String)object2.next();
                    arrayList.add(object);
                }
            }
            if (!((ArrayList)(object2 = this.v(exk_22))).isEmpty()) {
                arrayList.add(bae.h().a("effectOnEquip", new Object[0]));
                object = ((ArrayList)object2).iterator();
                while (object.hasNext()) {
                    String string4 = (String)object.next();
                    arrayList.add(string4);
                }
            }
            return !arrayList.isEmpty() ? arrayList : null;
        }
        if (string.equals("hasCaracteristic")) {
            ArrayList<String> arrayList = this.u(exk_22);
            return arrayList != null && !arrayList.isEmpty();
        }
        if (string.equals("caracteristic")) {
            ArrayList<String> arrayList = new ArrayList<String>();
            ArrayList<String> arrayList4 = this.u(exk_22);
            if (!arrayList4.isEmpty()) {
                for (String string5 : arrayList4) {
                    arrayList.add(string5);
                }
            }
            return arrayList.isEmpty() ? null : arrayList;
        }
        if (string.equals(z)) {
            return exk_22.w();
        }
        if (string.equals(A)) {
            if (!exk_22.w()) {
                return Float.valueOf(0.0f);
            }
            return Float.valueOf(exk_22.x().e());
        }
        if (string.equals(C)) {
            if (!exk_22.w()) {
                return (short)0;
            }
            return exk_22.x().c();
        }
        if (string.equals(B)) {
            if (!exk_22.w()) {
                return null;
            }
            ezv_0 ezv_02 = exk_22.x();
            return bae.h().a("xpRatio", ezv_02.f().c(ezv_02.b()), ezv_02.f().b(ezv_02.c()));
        }
        if (string.equals(y)) {
            return exk_22.aQ_();
        }
        if (string.equals(D)) {
            return false;
        }
        if (string.equals(E)) {
            return bmr_12.da().l(exk_22.a()) != null;
        }
        if (string.equals(F)) {
            short s2 = exk_22.T().x();
            bhd_1 bhd_12 = bhe_0.a().a(s2);
            return bhd_12 != null && eya_2.a(bhd_12);
        }
        if (string.equals(H)) {
            short s3 = exk_22.T().x();
            bhd_1 bhd_13 = bhe_0.a().a(s3);
            if (bhd_13 == null) {
                return false;
            }
            if (!eya_2.a(bhd_13)) {
                return false;
            }
            return enp_2.a.d(ens_2.aM) && eya_2.a(bmr_12, bhd_13);
        }
        if (string.equals("shards")) {
            return this.e(exk_22);
        }
        if (string.equals(aa)) {
            return exk_22.y();
        }
        if (string.equals(I)) {
            return this.q(exk_22);
        }
        if (string.equals(J)) {
            return this.r(exk_22);
        }
        if (string.equals(L)) {
            eZo eZo2 = exk_22.ap();
            if (eZo2 == null) {
                return null;
            }
            return eZo2.b();
        }
        if (string.equals(K)) {
            eyi_1 eyi_12 = exk_22.am();
            return eyi_12 == null ? null : bae.h().a(K, Oz.c.a(eyi_12.a()));
        }
        if (string.equals(M)) {
            return exk_22.l() != 0;
        }
        if (string.equals(N)) {
            Object t = euu_2.c(bmr_12.U_(), exk_22.a());
            if (t == null) {
                return false;
            }
            apc_2 apc_23 = exk_22.T().a(exz_1.a);
            boolean bl = apc_23 != null && apc_23.b(t, t, exk_22, ((epq_2)t).Q_());
            boolean bl3 = t.ck() == null || t.ck().e() == elp_0.b;
            boolean bl4 = exk_22.c() <= ((epq_2)t).dr() && bl;
            return bl3 && bl4;
        }
        if (string.equals(O)) {
            return exk_22.G().h();
        }
        if (string.equals(P)) {
            return exk_22.G().i();
        }
        if (string.equals(Q)) {
            return exk_22.G().l();
        }
        if (string.equals(R)) {
            return exk_22.T().ag();
        }
        if (string.equals(S)) {
            return exk_22.T().ag() && !exk_22.ak();
        }
        if (string.equals(T)) {
            return exk_22.ak();
        }
        if (string.equals(U)) {
            return exk_22.al() != null && exk_22.al().b();
        }
        if (string.equals(W)) {
            bmr_1 bmr_15 = (bmr_1)euu_2.f(azu_0.j().n().u(), exk_22.a());
            return bmr_12 != null && eZq.a(exk_22, bmr_15) == eZp.a;
        }
        if (string.equals(V)) {
            return bhv_1.f(exk_22);
        }
        if (string.equals(G)) {
            return bhv_1.A(exk_22);
        }
        if (string.equals(X)) {
            bmr_1 bmr_16 = (bmr_1)euu_2.f(azu_0.j().n().u(), exk_22.a());
            eZp eZp2 = eZq.a(exk_22, bmr_16);
            ani_2 ani_25 = new ani_2();
            if (eZp2 == eZp.b) {
                return ani_25.a(azf_2.g.w()).a().a((CharSequence)bae.h().a("recycling.error.item.not.recyclable", new Object[0])).b().r();
            }
            boolean bl = exk_22.ah();
            Optional<Cm<Integer, Float>> optional = eZq.a(exk_22);
            optional.ifPresent(cm -> {
                if (bl) {
                    ani_25.a();
                }
                ani_25.a(Hw.a(((Float)cm.b()).floatValue(), 2));
                if (bl) {
                    ani_25.b();
                }
                ani_25.a((CharSequence)" x ").a((CharSequence)bae.h().a(15, (long)((Integer)cm.a()).intValue(), new Object[0]));
            });
            if (eZp2 == eZp.c) {
                ani_25.m().m().a(azf_2.g.w()).a().a((CharSequence)bae.h().a("recycling.error.item.slotted", new Object[0])).b().j();
            }
            if (bl) {
                ani_25.m().m().a(azf_2.j.w()).a().a((CharSequence)bae.h().a("recycling.bonus.item.not.identified", new Object[0])).b().j();
            }
            return ani_25.r();
        }
        if (string.equals(Y)) {
            return exk_22.ah() || exk_22.ai();
        }
        if (Z.equals(string)) {
            return this.al.contains(exk_22.a());
        }
        if ("isLearnt".equals(string)) {
            return bhv_1.b(exk_22);
        }
        if ("marketAveragePrice".equals(string)) {
            Long l = bjo_1.a().a(exk_22);
            return bht_1.a(l);
        }
        if (string.equals(ab)) {
            ArrayList arrayList = (ArrayList)exk_22.b("allCharacteristics");
            int n = 0;
            if (arrayList != null) {
                ayf_2 ayf_22 = fpm_0.b().g().d("fontDefault14");
                for (String string6 : arrayList) {
                    fxN fxN2 = new fxN();
                    fxN2.b(string6);
                    int n2 = 0;
                    for (fxQ fxQ2 : fxN2) {
                        switch (fxQ2.b()) {
                            case b: {
                                fxS fxS2 = (fxS)fxQ2;
                                n2 += ayf_22.a(fxS2.j());
                                break;
                            }
                            case c: {
                                fxR fxR2 = (fxR)fxQ2;
                                n2 += fxR2.k();
                            }
                        }
                    }
                    n += n2 / 288 + 1;
                }
            }
            int n3 = 35 + n * 24;
            n3 = Hw.a(n3, 106, 330);
            return "309," + n3;
        }
        if (b.equals(string)) {
            return exk_22.a();
        }
        return ((bHS)((Object)exk_22.T())).b(string);
    }

    private static boolean a(bmr_1 bmr_12, exk_2 exk_22) {
        eQb eQb2 = bmr_12.dE().a();
        if (eQb2 == null) {
            return false;
        }
        for (epl_0 epl_02 : eQb2.c(bmr_12.U_())) {
            eBt eBt2 = eBo.a.c(-epl_02.f());
            if (eBt2 == null || !eBt2.h().d(exk_22.a())) continue;
            return true;
        }
        return false;
    }

    public static boolean a(exk_2 exk_22) {
        long l = azu_0.j().n().u();
        bmr_1 bmr_12 = Optional.ofNullable(euu_2.c(l, exk_22.a())).orElse(bzf_1.a());
        if (bmr_12 == null) {
            return false;
        }
        ezr_0<?> ezr_02 = exk_22.T();
        apc_2 apc_22 = ezr_02.a(exz_1.a);
        if (!ezr_02.K()) {
            return false;
        }
        return apc_22 == null || apc_22.b(bmr_12, bmr_12.P_(), ezr_02, bmr_12.ge());
    }

    public static boolean b(exk_2 exk_22) {
        bjs_2 bjs_22 = bht_1.a((bjw_1)exk_22.T());
        if (bjs_22 == null) {
            return false;
        }
        bmr_1 bmr_12 = (bmr_1)euu_2.c(azu_0.j().n().u(), exk_22.a());
        if (bmr_12 == null) {
            bmr_1 bmr_13 = bzf_1.a();
            return bjs_22.a(bmr_13, exk_22);
        }
        return bjs_22.a(bmr_12, exk_22);
    }

    private boolean p(exk_2 exk_22) {
        if (!azu_0.j().c(daJ.a)) {
            return true;
        }
        if (!faq_0.b(exk_22)) {
            return false;
        }
        exk_2 exk_23 = daJ.a.a().b();
        exk_2 exk_24 = daJ.a.a().c();
        return !exk_22.equals(exk_23) && !exk_22.equals(exk_24);
    }

    private boolean q(exk_2 exk_22) {
        exz_1[] exz_1Array;
        bmr_1 bmr_12 = cyt_0.s();
        bmr_1 bmr_13 = (bmr_1)euu_2.f(bmr_12.U_(), exk_22.a());
        if (bmr_13 == null) {
            bmr_13 = azu_0.j().k();
        }
        for (exz_1 exz_12 : exz_1Array = new exz_1[]{exz_1.h, exz_1.d, exz_1.e}) {
            apc_2 apc_22 = exk_22.T().a(exz_12);
            if (apc_22 == null || apc_22.b(bmr_13, null, null, bmr_13.cK())) continue;
            return true;
        }
        return false;
    }

    public static boolean c(exk_2 exk_22) {
        if (!azu_0.j().c(cZD.d())) {
            return false;
        }
        ezr_0<?> ezr_02 = exk_22.T();
        bmr_1 bmr_12 = (bmr_1)euu_2.f(azu_0.j().k().U_(), exk_22.a());
        if (bmr_12 == null) {
            return false;
        }
        if (ezr_02.a(exz_1.d) != null && !ezr_02.a(exz_1.d).b(bmr_12, -1, ezr_02, bmr_12.ge())) {
            return true;
        }
        boolean bl = false;
        for (short s2 : eoD.r) {
            if (!exk_22.U().c(bHJ.a().a(s2))) continue;
            bl = true;
            break;
        }
        return !bl || cZD.d().b(exk_22.a());
    }

    public static boolean d(exk_2 exk_22) {
        return azu_0.j().c(dcx_0.d()) && (!dcx_0.d().a(exk_22) || dcx_0.d().b(exk_22.a()));
    }

    private String r(exk_2 exk_22) {
        bmr_1 bmr_12 = cyt_0.s();
        bmr_1 bmr_13 = (bmr_1)euu_2.f(bmr_12.U_(), exk_22.a());
        if (bmr_13 == null) {
            return "";
        }
        exz_1[] exz_1Array = new exz_1[]{exz_1.h, exz_1.d, exz_1.e};
        ani_2 ani_22 = new ani_2();
        boolean bl = true;
        for (exz_1 exz_12 : exz_1Array) {
            apc_2 apc_22 = exk_22.T().a(exz_12);
            if (apc_22 != null && !apc_22.b(bmr_13, null, null, bmr_13.cK())) {
                bl = this.a(ani_22, bl, exz_12);
                continue;
            }
            if (!exk_22.ab() || exz_12 != exz_1.d) continue;
            bl = this.a(ani_22, bl, exz_12);
        }
        return ani_22.r();
    }

    private boolean a(ani_2 ani_22, boolean bl, exz_1 exz_12) {
        if (bl) {
            bl = false;
        } else {
            ani_22.m();
        }
        ani_22.a((CharSequence)bae.h().a("actionsOnItem.invalid." + exz_12.name(), new Object[0]));
        return bl;
    }

    public bia_0 e(exk_2 exk_22) {
        bia_0 bia_02 = (bia_0)this.ag.get(exk_22.a());
        if (bia_02 == null) {
            bia_0 bia_03 = new bia_0(exk_22);
            if (exk_22.a() != 0L) {
                this.ag.put(exk_22.a(), (Object)bia_03);
            }
            return bia_03;
        }
        return bia_02;
    }

    private static ArrayList<String> a(exk_2 exk_22, TLongObjectHashMap<ArrayList<String>> tLongObjectHashMap, eDk eDk2) {
        ArrayList<String> arrayList = (ArrayList<String>)tLongObjectHashMap.get(exk_22.a());
        if (arrayList == null || exk_22.a() == 0L) {
            arrayList = bht_1.a(eDk2, exk_22.T(), exk_22);
            tLongObjectHashMap.put(exk_22.a(), arrayList);
        }
        return arrayList.isEmpty() ? null : arrayList;
    }

    private ArrayList<String> s(exk_2 exk_22) {
        return bhv_1.a(exk_22, this.aj, eDk.b);
    }

    private ArrayList<String> t(exk_2 exk_22) {
        return bhv_1.a(exk_22, this.ak, eDk.c);
    }

    private ArrayList<String> u(exk_2 exk_22) {
        ArrayList<String> arrayList = (ArrayList<String>)this.ai.get(exk_22.a());
        if (arrayList == null || exk_22 instanceof exi_2 || exk_22.a() == 0L) {
            arrayList = bht_1.b(exk_22.T(), exk_22);
            this.ai.put(exk_22.a(), arrayList);
        }
        return arrayList;
    }

    private ArrayList<String> v(exk_2 exk_22) {
        ArrayList<String> arrayList = (ArrayList<String>)this.ah.get(exk_22.a());
        if (arrayList == null || exk_22.a() == 0L) {
            arrayList = bht_1.a(exk_22.T(), exk_22);
            this.ah.put(exk_22.a(), arrayList);
        }
        return arrayList;
    }

    public static String f(exk_2 exk_22) {
        try {
            if (!exk_22.T().F().i()) {
                return null;
            }
            if (exk_22.T().ag()) {
                if (exk_22.ai()) {
                    return "";
                }
                eyj_1 eyj_12 = exk_22.al();
                if (eyj_12 == null) {
                    throw new IllegalStateException("Trying to describe random elements for an item without random elements");
                }
                HashSet<efa_0> hashSet = eyj_12.b(efc_0.p.a());
                HashSet<efa_0> hashSet2 = eyj_12.b(efc_0.q.a());
                ani_2 ani_22 = new ani_2();
                if (hashSet != null) {
                    ani_22.a(bac.a(138), -1, -1, null).a((CharSequence)" ");
                    for (efa_0 efa_02 : hashSet) {
                        ani_22.a(String.format(azs_0.a().a("elementsSmallIconsPath"), efa_02.name()), -1, -1, null);
                    }
                }
                if (hashSet != null && hashSet2 != null) {
                    ani_22.a((CharSequence)"\n");
                }
                if (hashSet2 != null) {
                    ani_22.a(bac.a(137), -1, -1, null).a((CharSequence)" ");
                    for (efa_0 efa_02 : hashSet2) {
                        ani_22.a(String.format(azs_0.a().a("elementsSmallIconsPath"), efa_02.name()), -1, -1, null);
                    }
                }
                return ani_22.r();
            }
            return "";
        }
        catch (gm_0 gm_02) {
            ad.error((Object)"PropertyException computing random elements display", (Throwable)gm_02);
            return null;
        }
    }

    @Override
    public String g(exk_2 exk_22) {
        bmr_1 bmr_12 = cyt_0.s();
        bmr_1 bmr_13 = (bmr_1)euu_2.f(bmr_12.U_(), exk_22.a());
        bmr_1 bmr_14 = bmr_13 != null ? bmr_13 : azu_0.j().k();
        return azs_0.a().d(bmr_14.gX() == 1 ? exk_22.K() : exk_22.I());
    }

    public String h(exk_2 exk_22) {
        bmr_1 bmr_12 = cyt_0.s();
        bmr_1 bmr_13 = (bmr_1)euu_2.f(bmr_12.U_(), exk_22.a());
        bmr_1 bmr_14 = bmr_13 != null ? bmr_13 : azu_0.j().k();
        return azs_0.a().d(bmr_14.gX() == 1 ? exk_22.L() : exk_22.J());
    }

    public static String i(exk_2 exk_22) {
        return bhv_1.b(exk_22, "inventoryDialog");
    }

    public static String b(exk_2 exk_22, String string) {
        exk_2 exk_23 = (exk_2)fis_1.a().d("itemDetail", string);
        if (exk_23 != null && exk_22.a() == 0L && exk_23.a() == 0L ? exk_22.aT_() == exk_23.aT_() : exk_23 != null && exk_22.a() == exk_23.a()) {
            return bhx_0.b.a();
        }
        if (exk_22.aQ_() && exk_22.f().o()) {
            return bhx_0.a.a();
        }
        if (!bhv_1.j(exk_22)) {
            return bhx_0.c.a();
        }
        return bhx_0.d.a();
    }

    public static boolean j(exk_2 exk_22) {
        if (exk_22.T().F().h().length > 0) {
            return bhv_1.x(exk_22);
        }
        return !exk_22.X() || bhv_1.k(exk_22);
    }

    public static boolean k(exk_2 exk_22) {
        bpc_2 bpc_22;
        bmr_1 bmr_12 = (bmr_1)euu_2.c(azu_0.j().k().U_(), exk_22.a());
        if (bmr_12 == null) {
            return false;
        }
        bmr_1 bmr_13 = bzf_1.a();
        if (bmr_13 == null || bmr_13.ab_()) {
            return false;
        }
        ezr_0<?> ezr_02 = exk_22.T();
        big_1 big_12 = (big_1)ezr_02.p();
        if (big_12 != null) {
            if (!big_12.e()) {
                return false;
            }
            if (!big_12.b(exk_22)) {
                return false;
            }
            if (big_12.f() == eyx_1.g && (bmr_13.eY() || bmr_13.ba() != fhD.a)) {
                return false;
            }
        }
        if ((bpc_22 = bmr_13.eE()) != null && bpc_22.ac_() != 14) {
            if (bpc_22.ac_() == 19) {
                return !daw.a(exk_22);
            }
            if (big_12 == null || !big_12.p()) {
                return false;
            }
        }
        if (exk_22.U().d() == 218 || exk_22.U().d() == 399) {
            return true;
        }
        if (bmr_12.da().a((ts_0)exk_22) == null) {
            return false;
        }
        bvx_2 bvx_22 = bmr_12.bz();
        if (bvx_22 != null) {
            if (!bhv_1.a(exk_22.T(), bmr_12, bvx_22, exk_22.a())) {
                return false;
            }
        } else {
            apc_2 apc_22 = ezr_02.a(exz_1.a);
            if (!exk_22.W() || apc_22 != null && !apc_22.b(bmr_12, bmr_12.P_(), exk_22, bmr_12.ge())) {
                return false;
            }
        }
        if (big_12 instanceof bjf_2) {
            return true;
        }
        if (big_12 instanceof biw_0) {
            return true;
        }
        if (big_12 instanceof bjc_2) {
            int n;
            short s2 = ((bjc_2)big_12).h();
            ece_0 ece_02 = bmr_12.eX();
            return ece_02.e(n = ((bjc_2)big_12).g()) && ece_02.f(n) >= s2;
        }
        return !bhv_1.w(exk_22) || exk_22.c() <= bmr_12.dr();
    }

    public static boolean a(ezr_0 ezr_02, blx_1 blx_12, bvx_2 bvx_22, long l) {
        va_0 va_02 = bvx_22.h().d();
        apc_2 apc_22 = ezr_02.a(bvx_22.e() == elp_0.b ? exz_1.a : exz_1.b);
        return !(va_02.p() && va_02.q() != blx_12.a_() || ezr_02.U() && blx_12.dC().b(l) == null || !ezr_02.J() && bvx_22.e() != elp_0.b || apc_22 != null && !apc_22.b(blx_12, blx_12.P_(), ezr_02, blx_12.ge()));
    }

    private static boolean w(exk_2 exk_22) {
        ezr_0<?> ezr_02 = exk_22.T();
        if (ezr_02 == null) {
            return true;
        }
        return !ezr_02.b(ext_1.k);
    }

    private static boolean x(exk_2 exk_22) {
        exh_2[] exh_2Array;
        Object object;
        assert (exk_22.T().U()) : "On appelle isEquipmentEquipable avec un item qui n'est pas un equipment : " + exk_22.N();
        if (exk_22.ai()) {
            return false;
        }
        bmr_1 bmr_12 = cZI.D();
        if (bmr_12 == null) {
            object = cZI.E();
            bmv_1 bmv_12 = cZI.F();
            if (object != null && bmv_12 != null) {
                exh_2[] exh_2Array2 = exk_22.U().h();
                bmr_1 bmr_13 = azu_0.j().k();
                if (bmr_13 == null) {
                    return false;
                }
                for (exh_2 exh_22 : exh_2Array2) {
                    if (!eBx.a((epq_2)bmr_13, (epq_2)bmv_12, exk_22, exh_22.A, true).isEmpty()) continue;
                    return true;
                }
                return false;
            }
            bmr_12 = azu_0.j().k();
        }
        object = bmr_12.cG();
        boolean bl = ((eyz_0)object).a(exk_22);
        for (exh_2 exh_23 : exh_2Array = exk_22.U().h()) {
            if (!eyf_1.a((epq_2)bmr_12, (eyz_0)object, exk_22, exh_23, bmr_12.Q_(), !bl)) continue;
            return true;
        }
        return false;
    }

    private static epq_2 y(exk_2 exk_22) {
        bmr_1 bmr_12 = (bmr_1)euu_2.f(azu_0.j().k().U_(), exk_22.a());
        if (bmr_12 != null && bmr_12.g(exk_22.a()) != null) {
            return bmr_12;
        }
        return bhv_1.z(exk_22);
    }

    private static epq_2 z(exk_2 exk_22) {
        long l = azu_0.j().n().u();
        List<eBt> list = eBo.a.a(l);
        blx_1 blx_12 = null;
        for (eBt eBt2 : list) {
            if (!eBt2.h().e(exk_22)) continue;
            bmk_1 bmk_12 = cxo_0.c(eBt2.a());
            if (bmk_12 == null) {
                blx_12 = cxo_0.a(eBt2);
                break;
            }
            blx_12 = bmk_12.l() != null ? bmk_12.l() : cxo_0.a(eBt2);
            break;
        }
        return blx_12;
    }

    private static boolean A(exk_2 exk_22) {
        Object object;
        bmr_1 bmr_12 = cZI.D();
        if (bmr_12 == null) {
            object = cZI.E();
            if (object != null) {
                return eBx.a((eBt)object, exk_22);
            }
            bmr_12 = azu_0.j().k();
        }
        if (((ezr_0)(object = exk_22.T())).F().h().length > 0) {
            exh_2[] exh_2Array;
            eyz_0 eyz_02 = bmr_12.cG();
            for (exh_2 exh_22 : exh_2Array = exk_22.U().h()) {
                if (!eyf_1.a((epq_2)bmr_12, eyz_02, exk_22, exh_22)) continue;
                return true;
            }
            return false;
        }
        if (((ezr_0)object).p() instanceof bjc_2) {
            short s2 = ((bjc_2)((ezr_0)object).p()).h();
            ece_0 ece_02 = bmr_12.eX();
            return ece_02.f(((bjc_2)((ezr_0)object).p()).g()) >= s2;
        }
        return ((ezr_0)object).G() <= bmr_12.dr();
    }

    @Override
    public String l(exk_2 exk_22) {
        ezr_0<?> ezr_02 = exk_22.T();
        return ezr_02 != null ? ezr_02.e() : "<undefined name>";
    }

    @Override
    public String m(exk_2 exk_22) {
        ezr_0<?> ezr_02 = exk_22.T();
        return ezr_02 != null ? ezr_02.g() : "<undefined desc>";
    }

    @Override
    public void n(exk_2 exk_22) {
        ArrayList<fit_1> arrayList = new ArrayList<fit_1>();
        for (String string : this.af) {
            fit_1 fit_12 = fis_1.a().f(string);
            if (fit_12 == null || fit_12.f() != exk_22 || fit_12.r()) continue;
            arrayList.add(fit_12);
        }
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            fis_1.a().c((fit_1)arrayList.get(k));
        }
    }

    private void c() {
        this.ah.clear();
        this.ag.clear();
        this.aj.clear();
        this.ak.clear();
        this.ai.clear();
    }

    @Override
    public void o(exk_2 exk_22) {
        this.al.remove(exk_22.a());
        this.ag.remove(exk_22.a());
        this.ai.remove(exk_22.a());
        this.ah.remove(exk_22.a());
        this.aj.remove(exk_22.a());
        this.ak.remove(exk_22.a());
        bHS bHS2 = (bHS)((Object)exk_22.T());
        if (bHS2 != null) {
            bHS2.b().h();
        }
        try {
            fis_1.a().a((ajf_1)exk_22, "isEquipable", "requirement", "effect", "caracteristic", o, p, r, "effectAndCaracteristic", "shards");
        }
        catch (Exception exception) {
            ad.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    @Override
    public void a(exk_2 exk_22, boolean bl) {
        if (bl) {
            this.al.add(exk_22.a());
        } else {
            this.al.remove(exk_22.a());
        }
    }

    @Override
    public void b() {
        this.al.clear();
    }
}

