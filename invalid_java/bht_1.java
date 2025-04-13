/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHT
 */
public class bht_1
implements ajh_1 {
    private static final Logger aA = Logger.getLogger(bht_1.class);
    public static final String a = "name";
    public static final String b = "nameWithRarity";
    public static final String d = "description";
    public static final String e = "type";
    public static final String f = "itemTypeColor";
    public static final String g = "isRefItem";
    public static final String h = "set";
    public static final String i = "isEquiped";
    public static final String j = "isEquipableType";
    public static final String k = "isEquipable";
    public static final String l = "isPreviewable";
    public static final String m = "isInInventory";
    public static final String n = "level";
    public static final String o = "levelDescription";
    public static final String p = "shortenedLevelDesc";
    public static final String q = "effect";
    public static final String r = "allCharacteristics";
    public static final String s = "effectAndCaracteristic";
    public static final String t = "effectDetails";
    public static final String u = "completeEffectUse";
    public static final String v = "criticalEffectDetails";
    public static final String w = "shortEffectDetails";
    public static final String x = "hasCaracteristic";
    public static final String y = "caracteristic";
    public static final String z = "requirement";
    public static final String A = "useRequirement";
    public static final String B = "craftRequirement";
    public static final String C = "conditionDescription";
    public static final String D = "iconUrl";
    public static final String E = "baseIconUrl";
    public static final String F = "iconBigUrl";
    public static final String G = "iconTypeUrl";
    public static final String H = "ap";
    public static final String I = "apDesc";
    public static final String J = "range";
    public static final String K = "areaOfEffectIconURL";
    public static final String L = "isActionLinked";
    public static final String M = "ingredients";
    public static final String N = "storingCapacity";
    public static final String O = "craftMovable";
    public static final String P = "isRelic";
    public static final String Q = "isRelic2";
    public static final String R = "isCraftable";
    public static final String S = "isUsedInCraft";
    public static final String T = "craftsUsedIntoDescription";
    public static final String U = "hasCraftsUsingItem";
    public static final String V = "hasCraftsProducingItem";
    public static final String W = "hasXp";
    public static final String X = "shards";
    public static final String Y = "itemUseStyle";
    public static final String Z = "itemUseDescription";
    public static final String aa = "hasHealEffect";
    public static final String ab = "canBeEquiped";
    public static final String ac = "boundDescription";
    public static final String ad = "dropQuantity";
    public static final String ae = "themeItemBorderUrl";
    public static final String af = "themeItemBorderStyle";
    public static final String ag = "themeItemHoverBorderStyle";
    public static final String ah = "themeItemPressedBorderStyle";
    public static final String ai = "themeItemDisabledBorderStyle";
    public static final String aj = "isBlindBox";
    public static final String ak = "blindBoxLootList";
    public static final String al = "rarityText";
    public static final String am = "rawRarityText";
    public static final String an = "rarityColor";
    public static final String ao = "hasBrightBackground";
    public static final String ap = "rarityContainer";
    public static final String aq = "marketAveragePrice";
    public static final String ar = "isLearnt";
    public static final String as = "hasLearnAction";
    public static final String at = "sublimationColorPattern";
    public static final String au = "sublimationColorPatternSize";
    public static final String av = "effectLabel";
    public static final String aw = "requirementsLabel";
    public static final String ax = "utilizationLabel";
    public static final String ay = "rarityBackgroundUrl";
    public static final String[] az = new String[]{"name", "description", "type", "level", "effect", "effectAndCaracteristic", "criticalEffectDetails", "shortEffectDetails", "caracteristic", "requirement", "iconUrl", "iconBigUrl", "ap", "range", "areaOfEffectIconURL", "set", "isEquiped", "isInInventory", "isEquipable", "isPreviewable", "ingredients", "storingCapacity", "conditionDescription", "craftMovable", "isRelic", "isRelic2", "isCraftable", "shards", "itemUseStyle", "canBeEquiped", "itemUseDescription", "dropQuantity", "isBlindBox", "blindBoxLootList", "rarityText", "hasLearnAction", "isLearnt", "themeItemBorderUrl", "themeItemBorderStyle", "themeItemHoverBorderStyle", "themeItemPressedBorderStyle", "themeItemDisabledBorderStyle"};
    private final ezr_0<bhg_0> aB;
    private ArrayList<String> aC = null;
    private ArrayList<String> aD = null;
    private String aE = null;
    private ArrayList<String> aF = null;
    private ArrayList<String> aG = null;
    private ArrayList<exi_2> aH = null;
    private bia_0 aI;

    @Override
    public String[] d() {
        return az;
    }

    public bht_1(ezr_0<bhg_0> ezr_02) {
        this.aB = ezr_02;
    }

    @Override
    public Object b(String string) {
        if (string.equals(g)) {
            return true;
        }
        if (string.equals(a)) {
            return this.aB.e();
        }
        if (string.equals(b)) {
            return new ani_2().i().a(bhc_0.b(this.aB.M())).a((CharSequence)this.aB.e()).j().r();
        }
        if (string.equals(f)) {
            return this.aB.O().a().toString();
        }
        if (string.equals(d)) {
            String string2 = this.aB.g();
            if (string2 == null || string2.length() == 0) {
                return null;
            }
            return "\"" + string2 + "\"";
        }
        if (string.equals(e)) {
            String string3 = bHJ.a().a(this.aB.F().d()).a();
            boolean bl = false;
            String string4 = string3;
            return string4.length() == 0 ? null : "[" + string4 + "]";
        }
        if (string.equals(n)) {
            return this.aB.G();
        }
        if (string.equals(o)) {
            bmr_1 bmr_12 = cyt_0.s();
            if (bmr_12 == null) {
                return bae.h().a("levelShort.custom", this.aB.G());
            }
            exf_1 exf_12 = exf_1.a();
            if (exf_12 == null) {
                return bae.h().a("levelShort.custom", this.aB.G());
            }
            ani_2 ani_22 = new ani_2();
            boolean bl = true;
            if (this.aB.F().h().length == 0) {
                if (this.aB.p() instanceof bjc_2) {
                    short s2 = ((bjc_2)this.aB.p()).h();
                    ece_0 ece_02 = bmr_12.eX();
                    bl = ece_02.f(((bjc_2)this.aB.p()).g()) >= s2;
                }
            } else {
                exh_2[] exh_2Array;
                bl = false;
                bji_1 bji_12 = bjb_1.a.h();
                bmr_1 bmr_13 = bjb_1.a.g();
                if (bmr_13 == null) {
                    bmr_13 = azu_0.j().k();
                }
                eyz_0 eyz_02 = bji_12 == null ? bmr_13.cG() : bji_12.e();
                for (exh_2 exh_22 : exh_2Array = this.aB.F().h()) {
                    if (!eyf_1.a((epq_2)bmr_13, eyz_02, this.aB, exh_22)) continue;
                    bl = true;
                }
            }
            if (!bl) {
                ani_22.i().a(azf_2.h.w());
            }
            ani_22.a((CharSequence)bae.h().a("levelShort.custom", this.aB.G()));
            if (!bl) {
                ani_22.j();
            }
            return ani_22.r();
        }
        if (string.equals(p)) {
            return bae.h().a("levelShort.custom", this.aB.G());
        }
        if (string.equals(j)) {
            return this.b();
        }
        if (string.equals(k)) {
            return this.a();
        }
        if (string.equals(l)) {
            return this.aB.F().h().length > 0;
        }
        if (string.equals(i)) {
            bmr_1 bmr_14 = cyt_0.s();
            eyz_0 eyz_03 = bmr_14.cG();
            int n = -1;
            for (Long l : eyz_03.a().values()) {
                exk_2 exk_22;
                Optional<exk_2> optional = bmr_14.dC().b(l);
                if (optional.isEmpty() || (exk_22 = optional.get()).T().n() != this.aB.n()) continue;
                return true;
            }
            return false;
        }
        if (string.equals(m)) {
            bmr_1 bmr_15 = cyt_0.s();
            TLongObjectIterator<exg_2> tLongObjectIterator = bmr_15.da().i();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                exg_2 exg_22 = (exg_2)tLongObjectIterator.value();
                if (!exg_22.a(this.aB.n())) continue;
                return true;
            }
            return false;
        }
        if (string.equals(h)) {
            short s3 = this.aB.x();
            if (s3 != 0) {
                return bhe_0.a().a(s3);
            }
            return null;
        }
        if (string.equals(I)) {
            byte by = this.aB.t();
            if (by > 0) {
                return "<b color=\"00afea\">" + this.aB.t() + " " + bae.h().a("APShort", new Object[0]) + "</b>";
            }
            return null;
        }
        if (string.equals(H)) {
            return this.aB.t();
        }
        if (string.equals(J)) {
            int n = this.aB.I();
            int n2 = this.aB.H();
            if (n == 0 && n2 == 0) {
                return null;
            }
            if (n == n2) {
                return n;
            }
            return n + "-" + n2;
        }
        if (string.equalsIgnoreCase(K)) {
            return this.c();
        }
        if (string.equals(x)) {
            return !this.g().isEmpty();
        }
        if (string.equals(y)) {
            ArrayList<String> arrayList = new ArrayList<String>();
            ArrayList<String> arrayList2 = this.g();
            if (!arrayList2.isEmpty()) {
                arrayList.add(bae.h().a("effectOnEquip", new Object[0]));
                for (String string5 : arrayList2) {
                    arrayList.add(string5);
                }
            }
            return arrayList.isEmpty() ? null : arrayList;
        }
        if (string.equals(q)) {
            ArrayList<String> arrayList = this.e();
            return arrayList.isEmpty() ? null : arrayList;
        }
        if (string.equals(s)) {
            return this.a(null);
        }
        if (string.equals(t)) {
            return bht_1.a(eDk.b, this.aB, null);
        }
        if (string.equals(w)) {
            return bht_1.a(eDk.b, this.aB, null);
        }
        if (string.equals(v)) {
            if (this.aD == null) {
                this.aD = bht_1.a(eDk.c, this.aB, null);
            }
            return !this.aD.isEmpty() ? this.aD : null;
        }
        if (string.equals(u)) {
            ArrayList<String> arrayList;
            ArrayList<String> arrayList3;
            ArrayList<Object> arrayList4 = new ArrayList<Object>();
            if (this.aB.t() > 0) {
                arrayList4.add(bae.h().a("cost", new Object[0]) + " : " + this.b(H) + " " + bht_1.a(eps_0.c));
            }
            if (this.b(J) != null) {
                arrayList4.add(bae.h().a(J, new Object[0]) + " : " + this.b(J) + " " + bht_1.a(eps_0.j));
            }
            if ((arrayList3 = bht_1.a(eDk.b, this.aB, null)) != null && !arrayList3.isEmpty()) {
                arrayList4.add(bae.h().a("normal", new Object[0]) + " : ");
                arrayList4.addAll(arrayList3);
            }
            if ((arrayList = bht_1.a(eDk.c, this.aB, null)) != null && !arrayList.isEmpty()) {
                arrayList4.add(bae.h().a("critical", new Object[0]) + " : ");
                arrayList4.addAll(arrayList);
            }
            return arrayList4;
        }
        if (string.equals(z)) {
            String string6;
            StringBuilder stringBuilder = new StringBuilder();
            apc_2 apc_22 = this.aB.a(exz_1.c);
            bmr_1 bmr_16 = cyt_0.s();
            if (apc_22 != null && (string6 = eDm.a((aot_2)apc_22)).length() > 0) {
                if (apc_22.b(bmr_16, this, null, bmr_16.ge())) {
                    stringBuilder.append(string6);
                } else {
                    stringBuilder.append("<text color=\"cc4444\">").append(string6).append("</text>");
                }
            }
            return stringBuilder.toString();
        }
        if (string.equals(A)) {
            String string7;
            Object object;
            Object object2;
            boolean bl = true;
            bmr_1 bmr_17 = cyt_0.s();
            ani_2 ani_23 = new ani_2();
            apc_2 apc_23 = bmr_17.bz() == null || bmr_17.bz().e() == elp_0.b ? this.aB.a(exz_1.a) : this.aB.a(exz_1.b);
            if (apc_23 != null) {
                object2 = eDm.a((aot_2)apc_23);
                if (apc_23.b(bmr_17, this, null, null)) {
                    ani_23.a((CharSequence)object2);
                } else {
                    ani_23.i().a("cc4444").a((CharSequence)object2).j();
                }
                bl = false;
            }
            apc_23 = null;
            object2 = this.aB.p();
            if (object2 != null) {
                apc_23 = ((eyw_1)object2).n();
            }
            if (apc_23 != null) {
                if (!bl) {
                    ani_23.m();
                }
                object = eDm.a((aot_2)apc_23);
                if (apc_23.b(bmr_17, this, null, null)) {
                    ani_23.a((CharSequence)object);
                } else {
                    ani_23.i().a("cc4444").a((CharSequence)object).j();
                }
                bl = false;
            }
            if ((object = (big_1)this.aB.p()) != null && object instanceof bjc_2) {
                if (!bl) {
                    ani_23.m();
                }
                short s4 = ((bjc_2)object).h();
                int n = ((bjc_2)object).g();
                String string8 = bae.h().a(43, (long)n, new Object[0]);
                String string9 = bae.h().a("craft.neededAtLevel", string8, (int)s4);
                ani_23.a((CharSequence)string9);
                bl = false;
            }
            if (object != null && (string7 = ((big_1)object).a()) != null) {
                ani_23.i().a("cc4444").a((CharSequence)string7).j();
            }
            return ani_23.r();
        }
        if (string.equals(C)) {
            String string10;
            big_1 big_12;
            bmr_1 bmr_18 = cyt_0.s();
            ArrayList<String> arrayList = new ArrayList<String>();
            apc_2 apc_24 = this.aB.a(exz_1.c);
            if (apc_24 != null) {
                this.a(apc_24, arrayList, bmr_18.ge());
            }
            if ((apc_24 = bmr_18.bz() == null || bmr_18.bz().e() == elp_0.b ? this.aB.a(exz_1.a) : this.aB.a(exz_1.b)) != null) {
                this.a(apc_24, arrayList, null);
            }
            apc_24 = null;
            eyw_1 eyw_12 = this.aB.p();
            if (eyw_12 != null) {
                apc_24 = eyw_12.n();
            }
            if (apc_24 != null) {
                this.a(apc_24, arrayList, null);
            }
            if ((big_12 = (big_1)this.aB.p()) != null && big_12 instanceof bjc_2) {
                short s5 = ((bjc_2)big_12).h();
                int n = ((bjc_2)big_12).g();
                ece_0 ece_03 = bmr_18.eX();
                boolean bl = ece_03.e(n) && ece_03.f(n) >= s5;
                String string11 = bae.h().a(43, (long)n, new Object[0]);
                String string12 = bae.h().a("craft.neededAtLevel", string11, (int)s5);
                if (!bl) {
                    string12 = String.format("<text color=\"%s\">%s</text>", "cc4444", string12);
                }
                arrayList.add(string12);
            }
            if (big_12 != null && (string10 = big_12.a()) != null) {
                arrayList.add(String.format("<text color=\"%s\">%s</text>", "cc4444", string10));
            }
            return arrayList;
        }
        if (string.equals(D) || string.equals(E)) {
            bmr_1 bmr_19 = cyt_0.s();
            return azs_0.a().d(bmr_19 != null && bmr_19.gX() == 1 ? this.aB.D() : this.aB.C());
        }
        if (string.equals(F)) {
            bmr_1 bmr_110 = cyt_0.s();
            return azs_0.a().f(bmr_110 != null && bmr_110.gX() == 1 ? this.aB.D() : this.aB.C());
        }
        if (string.equals(L)) {
            return this.aB.p() != null;
        }
        if (string.equals(N)) {
            return exd_1.a.c(this.aB.n());
        }
        if (string.equals(B)) {
            ani_2 ani_24 = new ani_2();
            apc_2 apc_25 = this.aB.a(exz_1.f);
            if (apc_25 != null) {
                bmr_1 bmr_111 = cyt_0.s();
                String string13 = eDm.a((aot_2)apc_25);
                if (apc_25.b(bmr_111, this, null, bmr_111.ge())) {
                    ani_24.a((CharSequence)string13);
                } else {
                    ani_24.i().a("cc4444").a((CharSequence)string13).j();
                }
            }
            return ani_24.r();
        }
        if (!string.equals(M)) {
            if (string.equals(O)) {
                return this.aB.i();
            }
            if (string.equals(P)) {
                return this.aB.M() == exw_1.f;
            }
            if (string.equals(Q)) {
                return this.aB.M() == exw_1.h;
            }
            if (string.equals(R)) {
                return this.m();
            }
            if (string.equals(S)) {
                return !brj_1.a.a(this.aB.n(), bgg.a.b()).isEmpty();
            }
            if (string.equals(U)) {
                ece_0 ece_04 = bgg.a.b();
                ArrayList<Integer> arrayList = new ArrayList<Integer>(brj_1.a.a(this.aB.n(), ece_04));
                arrayList.sort(Integer::compareTo);
                Iterator iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    int n = (Integer)iterator.next();
                    if (!ece_04.e(n)) continue;
                    return true;
                }
                return false;
            }
            if (string.equals(V)) {
                int n = this.aB.n();
                bhv_0 bhv_02 = new bhv_0(n);
                ecn_0.a.b(bhv_02);
                return bhv_02.b;
            }
            if (string.equals(T)) {
                ece_0 ece_05 = bgg.a.b();
                ArrayList<Integer> arrayList = new ArrayList<Integer>(brj_1.a.a(this.aB.n(), ece_05));
                arrayList.sort(Integer::compareTo);
                if (arrayList.isEmpty()) {
                    return null;
                }
                ani_2 ani_25 = new ani_2();
                ani_25.a((CharSequence)bae.h().a("crafts.item.isUsedIn", new Object[0])).m();
                int n = arrayList.size();
                for (int k = 0; k < n; ++k) {
                    int n3;
                    boolean bl;
                    if (k != 0) {
                        ani_25.a((CharSequence)", ");
                    }
                    if (!(bl = ece_05.e(n3 = ((Integer)arrayList.get(k)).intValue()))) {
                        ani_25.i().a(azf_2.h.w());
                    }
                    ani_25.a((CharSequence)bae.h().a(43, (long)n3, new Object[0]));
                    if (bl) continue;
                    ani_25.j();
                }
                return ani_25.toString();
            }
            if (string.equals(W)) {
                return false;
            }
            if (string.equals(X)) {
                return this.l();
            }
            if (string.equals(Y)) {
                bjw_1 bjw_12 = (bjw_1)this.aB;
                return bjw_12.c().b();
            }
            if (string.equals(Z)) {
                bjw_1 bjw_13 = (bjw_1)this.aB;
                return bae.h().a(bjw_13.c().c(), new Object[0]);
            }
            if (string.equals(aa)) {
                return this.aB.af();
            }
            if (string.equals(ac)) {
                if (this.aB.N() == eyh_1.a) {
                    return null;
                }
                ani_2 ani_26 = new ani_2().i().a(azf_2.h).a((CharSequence)bae.h().a(this.aB.N().h(), new Object[0]));
                return ani_26.r();
            }
            if (string.equals(ab)) {
                return this.aB.l();
            }
            if (string.equals(aj)) {
                return this.aB.p() != null && this.aB.p().f() == eyx_1.v;
            }
            if (string.equals(ak)) {
                bIA bIA2;
                if (this.aH == null && this.aB.p() != null && this.aB.p().f() == eyx_1.v && (bIA2 = (bIA)this.aB.p()).h()) {
                    this.aH = cwi_0.a(bIA2.g());
                }
                return this.aH;
            }
            if (string.equals(ae)) {
                return this.aB.M().h();
            }
            if (string.equals(af)) {
                return this.aB.M().i();
            }
            if (string.equals(ag)) {
                return this.aB.M().j();
            }
            if (string.equals(ah)) {
                return this.aB.M().k();
            }
            if (string.equals(ai)) {
                return this.aB.M().l();
            }
            if (string.equals(al)) {
                return new ani_2().i().a(bhc_0.b(this.aB.M())).a((CharSequence)bae.h().a("item.rarity." + this.aB.M().name(), new Object[0])).j().r();
            }
            if (string.equals(am)) {
                return bae.h().a("item.rarity." + this.aB.M().name(), new Object[0]);
            }
            if (string.equals(G)) {
                String string14 = azs_0.a().a(this.aB.F().d());
                if ((string14 == null || string14.isEmpty()) && this.aB.F().f() != null) {
                    return azs_0.a().a(this.aB.F().f().d());
                }
                return string14;
            }
        }
        if (string.equals(aq)) {
            Long l = bjo_1.a().a(this.aB.n());
            return bht_1.a(l);
        }
        if (string.equals(at)) {
            if (this.aB.aa() == null) {
                return null;
            }
            return Stream.of(this.aB.aa().a()).map(tc_02 -> bib_0.a(tc_02, false)).collect(Collectors.toList());
        }
        if (string.equals(au)) {
            if (this.aB.aa() == null) {
                return 0;
            }
            if (this.aB.aa().a() == null) {
                return 0;
            }
            return this.aB.aa().a().length;
        }
        if (as.equals(string)) {
            return bht_1.a((bjw_1)this.aB) != null;
        }
        if (ar.equals(string)) {
            return bht_1.b((bjw_1)this.aB);
        }
        if (ay.equals(string)) {
            return this.k();
        }
        if (an.equals(string)) {
            return bhc_0.a(this.aB.M());
        }
        if (ap.equals(string)) {
            switch (this.aB.M()) {
                case a: {
                    return "labelItemRarityOld";
                }
                case b: {
                    return "labelItemRarityCommon";
                }
                case c: {
                    return "labelItemRarityRare";
                }
                case d: {
                    return "labelItemRarityMythic";
                }
                case e: {
                    return "labelItemRarityLegendary";
                }
                case f: {
                    return "labelItemRarityRelic";
                }
                case g: {
                    return "labelItemRarityMemory";
                }
                case h: {
                    return "labelItemRarityEpic";
                }
                case i: {
                    return "labelItemRarityAdmin";
                }
            }
        }
        if (ao.equals(string)) {
            return this.aB.M() == exw_1.e || this.aB.M() == exw_1.b;
        }
        if (av.equals(string)) {
            return bae.h().a("effects", new Object[0]).toUpperCase();
        }
        if (aw.equals(string)) {
            return bae.h().a("requirements", new Object[0]).toUpperCase();
        }
        if (ax.equals(string)) {
            return bae.h().a("utilization", new Object[0]).toUpperCase();
        }
        return null;
    }

    private String k() {
        switch (this.aB.M()) {
            case a: {
                return "itemTooltipOld";
            }
            case b: {
                return "itemTooltipCommon";
            }
            case c: {
                return "itemTooltipRare";
            }
            case d: {
                return "itemTooltipMythic";
            }
            case e: {
                return "itemTooltipLegendary";
            }
            case f: {
                return "itemTooltipRelic";
            }
            case g: {
                return "itemTooltipMemory";
            }
            case h: {
                return "itemTooltipEpic";
            }
            case i: {
                return "itemTooltipAdmin";
            }
        }
        return "itemTooltipCommon";
    }

    public static bjs_2 a(bjw_1 bjw_12) {
        eyw_1 eyw_12 = bjw_12.p();
        if (eyw_12 == null) {
            return null;
        }
        if (!eyx_1.S.contains(eyw_12.f())) {
            return null;
        }
        return (bjs_2)((Object)eyw_12);
    }

    public static boolean a(ezr_0<?> ezr_02) {
        bmr_1 bmr_12 = (bmr_1)euu_2.a(azu_0.j().k().U_());
        if (bmr_12 == null) {
            return false;
        }
        apc_2 apc_22 = ezr_02.a(exz_1.a);
        if (!ezr_02.K()) {
            return false;
        }
        return apc_22 == null || apc_22.b(bmr_12, bmr_12.P_(), ezr_02, bmr_12.ge());
    }

    public static boolean b(bjw_1 bjw_12) {
        bjs_2 bjs_22 = bht_1.a(bjw_12);
        if (bjs_22 == null) {
            return false;
        }
        bmr_1 bmr_12 = (bmr_1)euu_2.a(azu_0.j().n().u());
        return bjs_22.a(bmr_12, bjw_12);
    }

    /*
     * WARNING - void declaration
     */
    private void a(apc_2 apc_22, ArrayList<String> arrayList, Object object) {
        String string = eDm.a((aot_2)apc_22);
        if (string.length() <= 0) {
            return;
        }
        String[] stringArray = Cz.a(string, '\n');
        bmr_1 bmr_12 = cyt_0.s();
        for (String string2 : stringArray) {
            void object2;
            if (!apc_22.b(bmr_12, this, null, object)) {
                String string3 = "<text color=\"cc4444\">" + string2 + "</text>";
            }
            arrayList.add((String)object2);
        }
    }

    private bia_0 l() {
        if (this.aI == null) {
            this.aI = new bia_0(this.aB);
        }
        return this.aI;
    }

    public ArrayList<String> a(exk_2 exk_22) {
        Object object;
        Object object2;
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> arrayList2 = bht_1.a(eDk.b, this.aB, exk_22);
        if (!arrayList2.isEmpty()) {
            arrayList.add(bae.h().a("effectOnUse", new Object[0]));
            object2 = arrayList2.iterator();
            while (object2.hasNext()) {
                object = (String)object2.next();
                arrayList.add((String)object);
            }
        }
        if (!((ArrayList)(object2 = bht_1.a(this.aB, exk_22))).isEmpty()) {
            arrayList.add(bae.h().a("effectOnEquip", new Object[0]));
            object = ((ArrayList)object2).iterator();
            while (object.hasNext()) {
                String string = (String)object.next();
                arrayList.add(string);
            }
        }
        return arrayList.isEmpty() ? null : arrayList;
    }

    private boolean m() {
        return ((bhb_0)eyo_1.g()).b(this.aB.n());
    }

    public boolean a() {
        if (this.aB.F().h().length > 0) {
            TLongObjectIterator<exg_2> tLongObjectIterator = azu_0.j().k().da().i();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                exg_2 exg_22 = (exg_2)tLongObjectIterator.value();
                if (!exg_22.a(this.aB.n())) continue;
                apc_2 apc_22 = this.aB.a(exz_1.c);
                if (apc_22 != null && !apc_22.b(azu_0.j().k(), this, null, azu_0.j().k().ge())) break;
                return true;
            }
        }
        return false;
    }

    public boolean b() {
        return this.aB.F().h().length > 0;
    }

    public String c() {
        if (this.aE == null) {
            Object object;
            Iterator<efh_0> iterator = this.aB.u();
            ArrayList<aqd_1> arrayList = new ArrayList<aqd_1>();
            this.aE = "";
            while (iterator.hasNext()) {
                object = iterator.next();
                if (!object.L()) continue;
                arrayList.add(object.u());
            }
            if (!arrayList.isEmpty()) {
                object = aqe_1.a(arrayList);
                String string = ((aqd_1)object).i().toString();
                if (string.equals("SPECIAL")) {
                    return "";
                }
                try {
                    string = String.format(azs_0.a().a("areasIconsPath"), string);
                    this.aE = fkq_1.a(string, -1, -1, null);
                }
                catch (gm_0 gm_02) {
                    aA.error((Object)gm_02);
                }
            }
        }
        return this.aE;
    }

    public ArrayList<String> e() {
        if (this.aC == null) {
            this.aC = bht_1.a(eDk.b, this.aB, null);
        }
        return this.aC;
    }

    public ArrayList<String> f() {
        if (this.aD == null) {
            this.aD = bht_1.a(eDk.c, this.aB, null);
        }
        return this.aD;
    }

    public static ArrayList<String> a(eDk eDk2, ezr_0 ezr_02, @Nullable exk_2 exk_22) {
        switch (eDk2) {
            case c: {
                return bht_1.a(eDx.c, ezr_02, exk_22);
            }
        }
        return bht_1.a(eDx.b, ezr_02, exk_22);
    }

    private static ArrayList<String> a(eDx eDx2, ezr_0 ezr_02, exk_2 exk_22) {
        bmr_1 bmr_12 = cyt_0.s();
        edc_0 edc_02 = new edc_0(ezr_02, exk_22, eDx2);
        return edc_02.a();
    }

    public ArrayList<String> g() {
        if (this.aF == null) {
            this.aF = bht_1.b(this.aB, null);
        }
        return this.aF;
    }

    public static ArrayList<String> a(ezr_0 ezr_02, @Nullable exk_2 exk_22) {
        edc_0 edc_02 = new edc_0(ezr_02, exk_22, eDx.a);
        ArrayList<String> arrayList = edc_02.a();
        if (exk_22 != null && exk_22.y()) {
            arrayList.addAll(bht_1.b(exk_22));
        }
        return arrayList;
    }

    @NotNull
    public static List<String> b(@NotNull exk_2 exk_22) {
        return new edf_0(exk_22.C(), exk_22.T().F().h()).a();
    }

    public static ArrayList<String> b(ezr_0 ezr_02, @Nullable exk_2 exk_22) {
        edc_0 edc_02 = new edc_0(ezr_02, exk_22, eDx.a);
        return edc_02.a();
    }

    public static ArrayList<String> a(ezr_0 ezr_02, @Nullable exk_2 exk_22, short s2) {
        edc_0 edc_02 = new edc_0(ezr_02, exk_22, s2, eDx.a);
        return edc_02.a();
    }

    public void h() {
        bhd_1 bhd_12;
        this.aG = null;
        this.aF = null;
        this.aC = null;
        this.aD = null;
        if (this.aB.x() != 0 && (bhd_12 = bhe_0.a().a(this.aB.x())) != null) {
            bhd_12.g();
        }
    }

    public ezr_0<bhg_0> i() {
        return this.aB;
    }

    public exw_1 j() {
        return this.aB.M();
    }

    public static String a(@Nullable Long l) {
        return bae.h().a("market.item.average.price.suffix", l != null && l > 0L ? l : -1L);
    }

    private static String a(eps_0 eps_02) {
        try {
            return bac.a.a(CC.b, eps_02.name(), null, 22, 22);
        }
        catch (gm_0 gm_02) {
            aA.warn((Object)("Icon not found for " + eps_02.name()), (Throwable)gm_02);
            return null;
        }
    }
}

