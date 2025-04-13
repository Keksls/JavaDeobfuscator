/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bPl
 */
public class bpl_0
extends fio_0<bph_0>
implements ajh_1,
Comparable<bpl_0> {
    public static final String a = "id";
    public static final String b = "name";
    public static final String d = "level";
    public static final String e = "uiSelectedDeckCappedLevel";
    public static final String f = "minLevel";
    public static final String g = "maxLevel";
    public static final String h = "levelTextShort";
    public static final String i = "uiSelectedDeckCappedLevelTextShort";
    public static final String j = "spell";
    public static final String k = "ap";
    public static final String l = "mp";
    public static final String m = "wp";
    public static final String n = "huppermageResource";
    public static final String o = "sp";
    public static final String p = "chrage";
    public static final String q = "range";
    public static final String r = "areaOfEffectIconURL";
    public static final String s = "areaOfEffectBigIconURL";
    public static final String t = "elementsUsedIconURL";
    public static final String u = "smallIconUrl";
    public static final String v = "bigIconUrl";
    public static final String w = "longDescription";
    public static final String x = "description";
    public static final String y = "shortDescription";
    public static final String z = "shortOrCriticalDescription";
    public static final String A = "criticalDescription";
    public static final String B = "shortDescriptionElement";
    public static final String C = "usable";
    public static final String D = "unlockLevel";
    public static final String E = "hasCastIntervalRestrictions";
    public static final String F = "castIntervalRestrictionsDescription";
    public static final String G = "castMaxPerTarget";
    public static final String H = "castMaxPerTurn";
    public static final String I = "castInterval";
    public static final String J = "testLineOfSight";
    public static final String K = "castOnlyInLine";
    public static final String L = "testFreeCell";
    public static final String M = "testNotBorderCell";
    public static final String N = "conditionsDescription";
    public static final String O = "isMonsterSpell";
    public static final String P = "hasCriticalEffect";
    public static final String Q = "isCriticalDescription";
    public static final String R = "isSupport";
    public static final String S = "isPassive";
    public static final String T = "modifiableRange";
    public static final String U = "hasEvolutionCondition";
    public static final String V = "evolutionText";
    public static final String W = "isUnlockedSpell";
    public static final String X = "isInCurrentDeck";
    public static final String Y = "tabbedContainerSize";
    public static final String Z = "isCastableOnCaster";
    public static final String aa = "isCastableThroughPortal";
    public static final String ab = "isCastableOnDiag";
    public static final String ac = "isAreaSpell";
    public static final String ad = "isSingleTargetSpell";
    public static final String ae = "elementColor";
    public static final String af = "effectLabel";
    public static final String ag = "requirementsLabel";
    public static final String[] ah = new String[]{"id", "name", "levelTextShort", "level", "ap", "mp", "wp", "huppermageResource", "sp", "chrage", "range", "elementsUsedIconURL", "spell", "smallIconUrl", "bigIconUrl", "longDescription", "description", "usable", "castMaxPerTarget", "castMaxPerTurn", "castInterval", "testLineOfSight", "castOnlyInLine", "testFreeCell", "testNotBorderCell", "conditionsDescription", "areaOfEffectIconURL", "areaOfEffectBigIconURL", "isMonsterSpell", "shortDescription", "hasEvolutionCondition", "evolutionText", "criticalDescription", "hasCriticalEffect", "isSupport", "isPassive", "modifiableRange", "isInCurrentDeck", "isCastableOnCaster", "isCastableThroughPortal", "isCastableOnDiag", "isAreaSpell", "isSingleTargetSpell", "uiSelectedDeckCappedLevelTextShort", "isUnlockedSpell", "unlockLevel", "elementColor", "tabbedContainerSize", "shortOrCriticalDescription", "uiSelectedDeckCappedLevel", "isCriticalDescription", "effectLabel", "requirementsLabel"};
    private boolean ap;
    private final short aq = (short)enp_2.a.b(ens_2.v);
    private final epq_2 ar;
    private static final int as = 225;
    private static final int at = 0;
    private static final int au = 24;
    private static final int av = 26;
    private static final int aw = 309;
    private static final int ax = 38;

    public bpl_0(epq_2 epq_22) {
        this.ar = epq_22;
    }

    public bpl_0(bph_0 bph_02, short s2, long l, epq_2 epq_22) {
        this.ar = epq_22;
        this.am = bph_02;
        this.ao = (short)Math.min(s2, bph_02.k());
        this.an = l;
    }

    public epq_2 g() {
        return this.ar;
    }

    @Override
    public fip_0<bph_0> k() {
        return bpp_0.a();
    }

    public bpl_0 a(boolean bl) {
        bpl_0 bpl_02 = new bpl_0(this.ar);
        bpl_02.am = this.am;
        bpl_02.ao = bl ? (short)0 : this.ao;
        bpl_02.c(bpl_02.ao);
        bpl_02.an = abd_1.c();
        return bpl_02;
    }

    public bpl_0 l() {
        return this.a(false);
    }

    public bpl_0 m() {
        bpl_0 bpl_02 = new bpl_0(this.ar);
        bpl_02.am = this.am;
        bpl_02.ao = this.ao;
        bpl_02.an = this.an;
        return bpl_02;
    }

    public bpl_0 a(epq_2 epq_22) {
        bpl_0 bpl_02 = new bpl_0(epq_22);
        bpl_02.am = this.am;
        bpl_02.ao = this.ao;
        bpl_02.an = this.an;
        return bpl_02;
    }

    @Override
    public int n() {
        return ((bph_0)this.am).h();
    }

    @Override
    public String[] d() {
        return ah;
    }

    @Override
    public Object b(String string) {
        bmr_1 bmr_12 = cZI.D();
        if (bmr_12 == null) {
            bmr_12 = azu_0.j().k();
        }
        switch (string) {
            case "id": {
                return ((bph_0)this.am).i();
            }
            case "levelTextShort": {
                return bae.h().a("levelShort.custom", this.c());
            }
            case "uiSelectedDeckCappedLevelTextShort": {
                return bae.h().a("levelShort.custom", this.a(bmr_12));
            }
            case "minLevel": {
                return 1;
            }
            case "maxLevel": {
                return Math.min(this.u(), this.aq);
            }
            case "level": {
                return this.c();
            }
            case "spell": {
                return this.am;
            }
            case "uiSelectedDeckCappedLevel": {
                return this.a(bmr_12);
            }
            case "smallIconUrl": {
                return azs_0.a().g(this.n());
            }
            case "bigIconUrl": {
                return azs_0.a().h(this.n());
            }
            case "name": {
                if (this.am != null) {
                    return ((bph_0)this.am).b();
                }
                return null;
            }
            case "ap": {
                if (this.am != null) {
                    int n;
                    bmr_1 bmr_13;
                    if (((bph_0)this.am).y()) {
                        bmr_13 = azu_0.j().k();
                        if (bmr_13.cG().a(exh_2.p) != null) {
                            exk_2 exk_22 = bmr_13.cG().a(bmr_13.dC(), exh_2.p);
                            n = ((bph_0)this.am).h(this, bmr_12, null, bmr_12.ge()) + exk_22.T().t();
                        } else {
                            n = ((bph_0)this.am).h(this, bmr_12, null, bmr_12.ge());
                        }
                    } else {
                        n = ((bph_0)this.am).h(this, bmr_12, null, bmr_12.ge());
                    }
                    bmr_13 = azu_0.j().k();
                    if (bmr_13 != null && n > 0) {
                        if (bmr_13.a(eoz_1.D)) {
                            n += 2;
                        } else if (bmr_13.a(eoz_1.C)) {
                            ++n;
                        }
                    }
                    return n;
                }
                return null;
            }
            case "mp": {
                if (this.am != null) {
                    int n = ((bph_0)this.am).g((fio_0)this, (Object)bmr_12, null, bmr_12.ge());
                    bmr_1 bmr_14 = azu_0.j().k();
                    if (bmr_14 != null && n > 0) {
                        if (bmr_14.a(eoz_1.G)) {
                            n += 2;
                        } else if (bmr_14.a(eoz_1.F)) {
                            ++n;
                        }
                    }
                    return n;
                }
                return null;
            }
            case "wp": {
                if (this.am != null) {
                    bmr_1 bmr_15 = azu_0.j().k();
                    int n = ((bph_0)this.am).e((fio_0)this, (Object)bmr_12, null, bmr_12.ge());
                    if (bmr_15 != null && n > 0) {
                        if (bmr_15.a(eoz_1.x)) {
                            n += 2;
                        } else if (bmr_15.a(eoz_1.w)) {
                            ++n;
                        }
                    }
                    return n;
                }
                return null;
            }
            case "chrage": {
                if (this.am != null) {
                    fiy fiy2 = ((bph_0)this.am).g((fio_0)this, bmr_12, null, bmr_12.ge());
                    return fiy2.a(eps_0.J);
                }
                return null;
            }
            case "huppermageResource": {
                if (this.am != null) {
                    fiy fiy3 = ((bph_0)this.am).g((fio_0)this, bmr_12, null, bmr_12.ge());
                    int n = fiu_0.a(fiy3, bmr_12);
                    return n < 0 ? -n : n;
                }
                return null;
            }
            case "sp": {
                if (this.am != null) {
                    fiy fiy4 = ((bph_0)this.am).g((fio_0)this, bmr_12, null, bmr_12.ge());
                    return fiy4.a(eps_0.ax);
                }
                return null;
            }
            case "range": {
                if (this.am == null) {
                    return null;
                }
                int n = this.q();
                int n2 = this.p();
                if ((n > 0 || n2 > 0) && n != n2) {
                    return n + "-" + n2;
                }
                return n2;
            }
            case "areaOfEffectIconURL": {
                if (this.am != null) {
                    for (efh_0 efh_02 : this) {
                        aqs_1 aqs_12 = efh_02.u().i();
                        if (aqs_12 == aqs_1.b || aqs_12 == aqs_1.a) {
                            return null;
                        }
                        String string2 = aqs_12.toString();
                        try {
                            return String.format(azs_0.a().a("areasIconsPath"), string2);
                        }
                        catch (Exception exception) {
                            c.error((Object)("Impossible de trouver l'url de la zone " + string2));
                        }
                    }
                }
                return null;
            }
            case "areaOfEffectBigIconURL": {
                if (this.am != null) {
                    for (efh_0 efh_03 : this) {
                        String string3 = efh_03.u().i().toString();
                        try {
                            return String.format(azs_0.a().a("areasBigIconsPath"), string3);
                        }
                        catch (Exception exception) {
                            c.error((Object)("Impossible de trouver l'url de la zone " + string3));
                        }
                    }
                }
                return null;
            }
            case "elementsUsedIconURL": {
                if (this.am != null) {
                    efa_0 efa_02 = ((bph_0)this.am).b(fic_0.q) ? efa_0.g : efa_0.a(((bph_0)this.am).q());
                    String string4 = "";
                    if (efa_02 != null) {
                        try {
                            string4 = String.format(azs_0.a().a("elementsIconsPath"), efa_02.name());
                        }
                        catch (gm_0 gm_02) {
                            c.error((Object)"PropertyException during getFieldValue for ELEMENT_USED_ICON_URL_FIELD", (Throwable)gm_02);
                        }
                        return string4;
                    }
                    return null;
                }
                return null;
            }
            case "longDescription": {
                if (this.am != null) {
                    return ((bph_0)this.am).c();
                }
                return null;
            }
            case "description": {
                return this.a(eDk.a);
            }
            case "shortDescription": {
                return this.a(eDk.b);
            }
            case "shortOrCriticalDescription": {
                return this.ap ? this.a(eDk.c) : this.a(eDk.b);
            }
            case "criticalDescription": {
                return this.a(eDk.c);
            }
            case "shortDescriptionElement": {
                if (this.am != null) {
                    efa_0 efa_03 = efa_0.a(((bph_0)this.am).q());
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(bae.h().a("spellDescription.levelShort", new Object[0])).append(" ").append(this.c());
                    if (efa_03.equals(efa_0.h)) {
                        stringBuilder.append(" ").append(bae.h().a(efa_03.name(), new Object[0]));
                    } else if (!efa_03.equals(efa_0.a)) {
                        stringBuilder.append(" ").append(bae.h().a("spellDescription.element", new Object[0])).append(" ").append(bae.h().a(efa_03.name(), new Object[0]));
                    }
                    return stringBuilder;
                }
                return null;
            }
            case "usable": {
                bmr_1 bmr_16 = azu_0.j().k();
                bvx_2 bvx_22 = bmr_16.bz();
                if (bvx_22 == null) {
                    return true;
                }
                blx_1 blx_12 = bvx_22.A().H();
                bpl_0 bpl_02 = null;
                if (blx_12 != null && blx_12.bp()) {
                    bpl_02 = blx_12.c(this.a());
                }
                if (blx_12 == null || bpl_02 == null) {
                    return false;
                }
                fir_0 fir_02 = bvx_22.a((epq_2)blx_12, bpl_02, null, true);
                return fir_02 == fir_0.a;
            }
            case "castIntervalRestrictionsDescription": {
                StringBuilder stringBuilder = new StringBuilder();
                boolean bl = true;
                byte by = ((bph_0)this.am).a((fio_0)this, bmr_12, null, bmr_12.Q_());
                byte by2 = this.b(bmr_12, null, bmr_12.Q_());
                byte by3 = this.o();
                if (by > 0) {
                    bl = false;
                    stringBuilder.append(bae.h().a("spell.cast.maxPerTarget", by));
                }
                if (by2 > 0) {
                    if (bl) {
                        bl = false;
                    } else {
                        stringBuilder.append("\n");
                    }
                    stringBuilder.append(bae.h().a("spell.cast.maxPerTurn", by2));
                }
                if (by3 == -1 || by3 > 0) {
                    if (bl) {
                        bl = false;
                    } else {
                        stringBuilder.append("\n");
                    }
                    if (by3 == -1) {
                        stringBuilder.append(bae.h().a("spell.cast.oncePerFight", new Object[0]));
                    } else {
                        stringBuilder.append(bae.h().a("spell.cast.minInterval", by3));
                    }
                }
                return stringBuilder.toString();
            }
            case "hasCastIntervalRestrictions": {
                return ((bph_0)this.am).a((fio_0)this, bmr_12, null, bmr_12.Q_()) > 0 || this.b(bmr_12, null, bmr_12.Q_()) > 0 || this.o() > 0;
            }
            case "castMaxPerTurn": {
                return this.b(bmr_12, null, null) > 0 ? Byte.valueOf(this.b(bmr_12, null, bmr_12.Q_())) : "-";
            }
            case "castMaxPerTarget": {
                return ((bph_0)this.am).a((fio_0)this, bmr_12, null, null) > 0 ? Byte.valueOf(((bph_0)this.am).a((fio_0)this, bmr_12, null, bmr_12.Q_())) : "-";
            }
            case "castInterval": {
                return this.o();
            }
            case "testLineOfSight": {
                return ((bph_0)this.am).a((fio_0)this, (Object)bmr_12, null, bmr_12.ge());
            }
            case "testFreeCell": {
                return ((bph_0)this.am).f((fio_0)this, bmr_12, null, bmr_12.Q_());
            }
            case "testNotBorderCell": {
                return ((bph_0)this.am).n();
            }
            case "castOnlyInLine": {
                return ((bph_0)this.am).e(this.c()) > 1 && ((bph_0)this.am).b((fio_0)this, (Object)bmr_12, null, bmr_12.ge());
            }
            case "conditionsDescription": {
                String string5;
                apc_2 apc_22 = ((bph_0)this.am).p();
                ArrayList<String> arrayList = new ArrayList<String>();
                if (apc_22 != null && !(string5 = eDm.a((aot_2)apc_22)).isEmpty()) {
                    String[] stringArray;
                    String[] stringArray2 = stringArray = string5.split("\n");
                    int n = stringArray2.length;
                    for (int k = 0; k < n; ++k) {
                        String string6 = stringArray2[k];
                        arrayList.add(string6);
                    }
                }
                if (!(string5 = (String)this.b(F)).isEmpty()) {
                    for (String string7 : string5.split("\n")) {
                        arrayList.add(string7);
                    }
                }
                return !arrayList.isEmpty() ? arrayList : null;
            }
            case "isMonsterSpell": {
                return bkt_1.a().a(((bph_0)this.am).l()) == null;
            }
            case "hasCriticalEffect": {
                for (efh_0 efh_04 : this) {
                    if (!efh_04.a(1L)) continue;
                    return true;
                }
                return false;
            }
            case "isSupport": {
                return ((bph_0)this.r()).q() == 9;
            }
            case "isPassive": {
                return ((bph_0)this.r()).w();
            }
            case "modifiableRange": {
                return ((bph_0)this.r()).d((fio_0)this, (Object)bmr_12, null, bmr_12.ge());
            }
            case "hasEvolutionCondition": {
                if (bmr_12 == null) {
                    return false;
                }
                if (!this.y()) {
                    return true;
                }
                return null;
            }
            case "evolutionText": {
                short s2;
                Object object;
                if (!this.y()) {
                    ArrayList<String> arrayList = new ArrayList<String>();
                    object = ((bph_0)this.r()).u();
                    if (object != null) {
                        arrayList.add(eDm.a((aot_2)object));
                        return arrayList;
                    }
                }
                if ((s2 = ((bph_0)this.r()).m()) <= 1) {
                    return null;
                }
                object = new ArrayList();
                object.add(bae.h().a("required.level.custom", s2));
                return object;
            }
            case "unlockLevel": {
                return ((bph_0)this.am).m();
            }
            case "isUnlockedSpell": {
                if (bmr_12 == null) {
                    return true;
                }
                if (cZI.E() != null) {
                    return true;
                }
                return this.y();
            }
            case "isCastableOnCaster": {
                return ((bph_0)this.am).l(this, bmr_12, null, bmr_12.Q_());
            }
            case "isCastableThroughPortal": {
                return ((bph_0)this.am).b(fic_0.l);
            }
            case "isCastableOnDiag": {
                return ((bph_0)this.am).k(this, bmr_12, null, bmr_12.Q_());
            }
            case "isAreaSpell": {
                return ((bph_0)this.am).b(fic_0.i);
            }
            case "isSingleTargetSpell": {
                return ((bph_0)this.am).b(fic_0.h);
            }
            case "isInCurrentDeck": {
                return this.a((blx_1)bmr_12);
            }
            case "tabbedContainerSize": {
                ArrayList<String> arrayList = this.a(eDk.b);
                int n = arrayList == null ? 0 : arrayList.size() + 2;
                int n3 = 26 + n * 24;
                n3 = Hw.a(n3, 0, 225);
                return new fjf_2(309, n3 + 38);
            }
            case "elementColor": {
                efa_0 efa_04 = efa_0.a(((bph_0)this.am).q());
                if (((bph_0)this.am).b(fic_0.q)) {
                    return new fyr_0(elw_1.dx);
                }
                fiy fiy5 = ((bph_0)this.am).g((fio_0)this, this.ar, null, this.ar.ge());
                if (fiy5.a(eps_0.ax) > 0) {
                    return new fyr_0(elw_1.dy);
                }
                switch (efa_04) {
                    case b: {
                        return new fyr_0(elw_1.dt);
                    }
                    case c: {
                        return new fyr_0(elw_1.du);
                    }
                    case d: {
                        return new fyr_0(elw_1.dv);
                    }
                    case e: {
                        return new fyr_0(elw_1.dw);
                    }
                }
                return new fyr_0(elw_1.dz);
            }
            case "isCriticalDescription": {
                return this.ap;
            }
            default: {
                return null;
            }
            case "effectLabel": {
                return ((bph_0)this.am).w() ? bae.h().a("passive", new Object[0]).toUpperCase() : bae.h().a("effects", new Object[0]).toUpperCase();
            }
            case "requirementsLabel": 
        }
        return bae.h().a("requirements", new Object[0]).toUpperCase();
    }

    private int x() {
        if (this.ar == null || this.ar.dw() == null || this.ar.dx() == null) {
            return 0;
        }
        ezm_1 ezm_12 = this.ar.dx();
        fiO fiO2 = this.ar.dw().b(ezm_12.d().e());
        return this.a(fiO2);
    }

    public short a(fiO fiO2) {
        int n = fiT.a(((bph_0)this.am).i(), fiO2, this.ar);
        if (n == -1) {
            return this.c();
        }
        return (short)n;
    }

    private int a(bmr_1 bmr_12) {
        fiO fiO2;
        if (this.ar instanceof bmv_1) {
            return this.ao;
        }
        if (azu_0.j().c(cZI.a()) && (fiO2 = bmr_12.dz()) != null) {
            return this.a(fiO2);
        }
        return this.x();
    }

    private boolean y() {
        bmr_1 bmr_12;
        bmr_1 bmr_13 = cZI.D();
        bmr_1 bmr_14 = bmr_12 = bmr_13 != null ? bmr_13 : azu_0.j().k();
        if (bmr_12 == null) {
            return true;
        }
        fiO fiO2 = bmr_12.dz();
        if (fiO2 == null) {
            return false;
        }
        int n = fiO2.b() <= 0 ? bmr_12.dr() : fiO2.b();
        return n >= ((bph_0)this.am).m();
    }

    protected byte o() {
        return ((bph_0)this.am).d((fio_0)this, this.ar, null, null);
    }

    public ArrayList<String> a(eDk eDk2) {
        if (this.am != null) {
            apc_2 apc_22 = ((bph_0)this.am).p();
            ArrayList<String> arrayList = null;
            ArrayList<String> arrayList2 = null;
            if (apc_22 != null) {
                ArrayList<abo_2<String, apc_2>> arrayList3 = eDm.b(apc_22);
                bmr_1 bmr_12 = azu_0.j().k();
                bvx_2 bvx_22 = bmr_12.bz();
                for (abo_2<String, apc_2> abo_22 : arrayList3) {
                    try {
                        if (bvx_22 == null || abo_22.b().b(bmr_12, bmr_12, this, bvx_22)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList<String>();
                            }
                            arrayList.add(abo_22.a());
                            continue;
                        }
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList<String>();
                        }
                        arrayList2.add(abo_22.a());
                    }
                    catch (aob_1 aob_12) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(abo_22.a());
                    }
                }
            }
            return eDi.a(new edg_0(this, arrayList, arrayList2, eDk2));
        }
        return null;
    }

    public int p() {
        if (this.ar == null) {
            bmr_1 bmr_12 = azu_0.j().k();
            return ((bph_0)this.am).i(this, bmr_12, null, bmr_12.Q_());
        }
        int n = this.ar.c(eps_0.j);
        int n2 = ((bph_0)this.am).i(this, this.ar, null, this.ar.Q_());
        int n3 = ((bph_0)this.am).d((fio_0)this, (Object)this.ar, null, this.ar.Q_()) ? n2 + n : n2;
        return Math.max(this.q(), n3);
    }

    public int q() {
        if (this.ar == null) {
            bmr_1 bmr_12 = azu_0.j().k();
            return ((bph_0)this.am).j(this, bmr_12, null, bmr_12.Q_());
        }
        return ((bph_0)this.am).j(this, this.ar, null, this.ar.Q_());
    }

    public int a(@NotNull bpl_0 bpl_02) {
        return ((bph_0)this.am).b().compareTo(((bph_0)bpl_02.r()).b());
    }

    @Override
    public short c(short s2) {
        if (this.ao != super.c(s2)) {
            fis_1.a().a((ajf_1)this, d, h);
        }
        return this.ao;
    }

    @Override
    public boolean a(blx_1 blx_12) {
        if (blx_12 == null) {
            return false;
        }
        fiO fiO2 = blx_12.dz();
        if (fiO2 == null) {
            return false;
        }
        if (((bph_0)this.am).w()) {
            return fiO2.f().contains(((bph_0)this.am).i());
        }
        return fiO2.d().contains(((bph_0)this.am).i());
    }

    public void b(boolean bl) {
        if (this.ap == bl) {
            return;
        }
        this.ap = bl;
        fis_1.a().a((ajf_1)this, z, Q);
    }

    @Override
    public /* synthetic */ ts_0 i() {
        return this.m();
    }

    @Override
    public /* synthetic */ ts_0 aP_() {
        return this.l();
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((bpl_0)object);
    }
}

