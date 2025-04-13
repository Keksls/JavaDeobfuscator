/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntShortIterator
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.list.array.TShortArrayList
 *  gnu.trove.map.hash.TByteShortHashMap
 *  gnu.trove.map.hash.TIntShortHashMap
 */
import gnu.trove.iterator.TIntShortIterator;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.list.array.TShortArrayList;
import gnu.trove.map.hash.TByteShortHashMap;
import gnu.trove.map.hash.TIntShortHashMap;
import java.util.ArrayList;
import java.util.LinkedList;

public class eDm {
    public static final String a = "or";
    public static final String b = "xor";
    public static final String c = "critere.true";
    public static final String d = "critere.false";
    public static final String e = "critere.hp";
    public static final String f = "critere.ap";
    public static final String g = "critere.mp";
    public static final String h = "critere.wp";
    public static final String i = "critere.chrage";
    public static final String j = "critere.control";
    public static final String k = "critere.tackle";
    public static final String l = "critere.block";
    public static final String m = "critere.ranged.dmg";
    public static final String n = "critere.ferocity";
    public static final String o = "critere.dodge";
    public static final String p = "critere.range";
    public static final String q = "LEADERSHIPShort";
    public static final String r = "critere.willpower";
    public static final String s = "critere.casterbreed";
    public static final String t = "critere.targetbreed";
    public static final String u = "critere.casterbreedId";
    public static final String v = "critere.targetbreedId";
    public static final String w = "critere.nottargetbreedid";
    public static final String x = "critere.hassummon";
    public static final String y = "critere.nothassummon";
    public static final String z = "critere.hasequip";
    public static final String A = "critere.nothasequip";
    public static final String B = "critere.hasequipwithpos";
    public static final String C = "critere.nothasequipwithpos";
    public static final String D = "critere.targethour";
    public static final String E = "critere.nottargethour";
    public static final String F = "critere.isennemy";
    public static final String G = "critere.isnotennemy";
    public static final String H = "critere.petinrange";
    public static final String I = "critere.summoned";
    public static final String J = "critere.not.summoned";
    public static final String K = "critere.beaconamount";
    public static final String L = "critere.barrelamount";
    public static final String M = "critere.trapamount";
    public static final String N = "critere.nbsummons";
    public static final String O = "critere.nbroublabot";
    public static final String P = "critere.inf";
    public static final String Q = "critere.sup";
    public static final String R = "critere.infeq";
    public static final String S = "critere.supeq";
    public static final String T = "critere.isSex.";
    public static final String U = "critere.getSpellTreeLevel";
    public static final String V = "critere.kamaCount";
    public static final String W = "critere.hasState";
    public static final String X = "critere.notHasState";
    public static final String Y = "critere.hasStateFromLevel";
    public static final String Z = "critere.notHasStateFromLevel";
    public static final String aa = "critere.hasCraft";
    public static final String ab = "critere.notHasCraft";
    public static final String ac = "critere.symbiotSpace";
    public static final String ad = "critere.craftLevel";
    public static final String ae = "critere.getWakfuGaugeValue";
    public static final String af = "critere.getStasisGauge";
    public static final String ag = "critere.getCrimeScore";
    public static final String ah = "critere.isDay";
    public static final String ai = "critere.notIsDay";
    public static final String aj = "critere.isDead";
    public static final String ak = "critere.isNotDead";
    public static final String al = "critere.istargetonsameteam";
    public static final String am = "critere.notistargetonsameteam";
    public static final String an = "critere.getZoneWakfu";
    public static final String ao = "critere.getZoneStasis";
    public static final String ap = "critere.hasSummonWithBreed";
    public static final String aq = "critere.nothasSummonWithBreed";
    public static final String ar = "critere.getInstanceId";
    public static final String as = "critere.notGetInstanceId";
    public static final String at = "critere.getNationId";
    public static final String au = "critere.notGetNationId";
    public static final String av = "critere.getNationAlignment";
    public static final String aw = "critere.getNoNationAlignment";
    public static final String ax = "critere.target";
    public static final String ay = "critere.isCarryingOwnBarrel";
    public static final String az = "critere.hasSurrondingCellWithOwnBarrel";
    public static final String aA = "critere.distanceBetweenTargetAndNearestAllyBeacon";
    public static final String aB = "critere.isTargetCellValidForNewObstacle";
    public static final String aC = "critere.nbBombs";
    public static final String aD = "critere.getTotalLeadership";
    public static final String aE = "critere.hasAvailableCreature";
    public static final String aF = "critere.isOnOwnDial";
    public static final String aG = "critere.not.isCarried";
    public static final String aH = "critere.isCarried";
    public static final String aI = "critere.add";
    public static final String aJ = "critere.guildLevel";
    public static final String aK = "critere.guildBonus";
    public static final String aL = "critere.hasAnotherSameEquipment";
    public static final String aM = "critere.isOnHour";
    public static final String aN = "critere.notIsOnHour";
    public static final String aO = "critere.isObstacle";
    public static final String aP = "critere.notIsObstacle";
    public static final String aQ = "critere.hasEquipmentId";
    public static final String aR = "critere.hasUnlockedCompanion";
    public static final String aS = "critere.isCompanion";
    public static final String aT = "critere.isCompanionNegated";
    public static final String aU = "critere.notHasUnlockedCompanion";
    public static final String aV = "critere.getStateCountInRange";
    public static final String aW = "critere.getOwnTeamStateCountInRange";
    public static final String aX = "critere.hasSubscriptionLevel";
    public static final String aY = "critere.hasPvpRank";
    public static final String aZ = "critere.isAchievementActive";
    public static final String ba = "critere.not.isAchievementActive";
    public static final String bb = "critere.isAchievementComplete";
    public static final String bc = "critere.not.isAchievementComplete";
    public static final String bd = "critere.isAchievementFailed";
    public static final String be = "critere.not.isAchievementFailed";
    public static final String bf = "critere.isAchievementObjectiveComplete";
    public static final String bg = "critere.not.isAchievementObjectiveComplete";
    public static final String bh = "critere.isAchievementRepeatable";
    public static final String bi = "critere.not.isAchievementRepeatable";
    public static final String bj = "critere.isAchievementRunning";
    public static final String bk = "critere.not.isAchievementRunning";
    public static final String bl = "critere.getCompanyRank";
    public static final String bm = "critere.isKnownRecipe";
    public static final String bn = "critere.not.isInNationJail";
    public static final String bo = "critere.isInNationJail";
    public static final String bp = "critere.not.isInAdminJail";
    public static final String bq = "critere.isInAdminJail";
    public static final String br = "critere.not.isInHavenBag";
    public static final String bs = "critere.isInHavenBag";
    public static final String bt = "critere.not.isBattleground";
    public static final String bu = "critere.isBattleground";
    public static final String bv = "critere.getAchievementCategoryActiveCount";

    public static ArrayList<String> a(ArrayList<apc_2> arrayList) {
        TIntShortIterator tIntShortIterator;
        short s2;
        short s3;
        Object object;
        TShortArrayList tShortArrayList = null;
        TByteShortHashMap tByteShortHashMap = null;
        TByteShortHashMap tByteShortHashMap2 = null;
        TIntShortHashMap tIntShortHashMap = null;
        TIntShortHashMap tIntShortHashMap2 = null;
        ArrayList arrayList2 = null;
        for (int k = 0; k < arrayList.size(); ++k) {
            object = arrayList.get(k);
            if (object == null) continue;
            LinkedList<apc_2> linkedList = eDm.a((apc_2)object);
            block15: for (apc_2 apc_22 : linkedList) {
                byte by;
                aot_2 aot_22;
                boolean bl = false;
                s3 = 0;
                s2 = 0;
                boolean bl2 = false;
                aoq_1 aoq_12 = null;
                aoq_1 aoq_13 = null;
                Enum enum_ = apc_22.c();
                if (enum_ instanceof aoc_1) {
                    switch ((aoc_1)enum_) {
                        case i: {
                            aot_22 = (aoh_2)apc_22;
                            if (((aoh_2)aot_22).b().b()) {
                                bl = true;
                                aoq_12 = ((aoh_2)aot_22).b();
                                aoq_13 = ((aoh_2)aot_22).d();
                                break;
                            }
                            s3 = 1;
                            aoq_13 = ((aoh_2)aot_22).b();
                            aoq_12 = ((aoh_2)aot_22).d();
                            break;
                        }
                        case j: {
                            aot_22 = (aoi_2)apc_22;
                            if (((aoi_2)aot_22).b().b()) {
                                s2 = 1;
                                aoq_12 = ((aoi_2)aot_22).b();
                                aoq_13 = ((aoi_2)aot_22).d();
                                break;
                            }
                            bl2 = true;
                            aoq_13 = ((aoi_2)aot_22).b();
                            aoq_12 = ((aoi_2)aot_22).d();
                            break;
                        }
                        case g: {
                            aot_22 = (aoe_1)apc_22;
                            s2 = 1;
                            bl2 = true;
                            if (((aoe_1)aot_22).b().b()) {
                                aoq_12 = ((aoe_1)aot_22).b();
                                aoq_13 = ((aoe_1)aot_22).d();
                                break;
                            }
                            aoq_13 = ((aoe_1)aot_22).b();
                            aoq_12 = ((aoe_1)aot_22).d();
                        }
                    }
                } else if (enum_ instanceof eyO) {
                    switch ((eyO)enum_) {
                        case p: {
                            aot_22 = (ewb_0)apc_22;
                            if (tShortArrayList == null) {
                                tShortArrayList = ((ewb_0)aot_22).b();
                                break;
                            }
                            for (by = 0; by < tShortArrayList.size(); ++by) {
                                if (((ewb_0)aot_22).b().contains(tShortArrayList.get((int)by))) continue;
                                tShortArrayList.removeAt((int)by);
                            }
                            break;
                        }
                    }
                }
                if (aoq_12 != null && enum_ instanceof eyO) {
                    switch ((eyO)enum_) {
                        case i: {
                            aot_22 = (euz_0)aoq_13;
                            by = ((euz_0)aot_22).f();
                            if (by != -1) {
                                if (s2 != 0 || bl) {
                                    if (tIntShortHashMap == null) {
                                        tIntShortHashMap = new TIntShortHashMap();
                                    }
                                    if (!bl) continue block15;
                                    tIntShortHashMap.put((int)by, (short)Math.max((double)tIntShortHashMap.get((int)by), aoq_12.b(null, null, null, null) + 1.0));
                                    break;
                                }
                                if (tIntShortHashMap2 == null) {
                                    tIntShortHashMap2 = new TIntShortHashMap();
                                }
                                if (s3 == 0) continue block15;
                                tIntShortHashMap2.put((int)by, (short)Math.min((double)(tIntShortHashMap2.contains((int)by) ? (int)tIntShortHashMap2.get((int)by) : Short.MAX_VALUE), aoq_12.b(null, null, null, null) - 1.0));
                                break;
                            }
                            if (arrayList2 == null) continue block15;
                            arrayList2.add(apc_22);
                            break;
                        }
                        case c: {
                            aot_22 = (esH)aoq_13;
                            by = ((esH)aot_22).f().a();
                            if (s2 != 0 || bl) {
                                if (tByteShortHashMap == null) {
                                    tByteShortHashMap = new TByteShortHashMap();
                                }
                                if (bl) {
                                    tByteShortHashMap.put(by, (short)Math.max((double)tByteShortHashMap.get(by), aoq_12.b(null, null, null, null) + 1.0));
                                    break;
                                }
                                tByteShortHashMap.put(by, (short)Math.max((double)tByteShortHashMap.get(by), aoq_12.b(null, null, null, null)));
                                break;
                            }
                            if (tByteShortHashMap2 == null) {
                                tByteShortHashMap2 = new TByteShortHashMap();
                            }
                            if (s3 != 0) {
                                tByteShortHashMap2.put(by, (short)Math.min((double)(tByteShortHashMap2.contains(by) ? (int)tByteShortHashMap2.get(by) : Short.MAX_VALUE), aoq_12.b(null, null, null, null) - 1.0));
                                break;
                            }
                            tByteShortHashMap2.put(by, (short)Math.min((double)(tByteShortHashMap2.contains(by) ? (int)tByteShortHashMap2.get(by) : Short.MAX_VALUE), aoq_12.b(null, null, null, null)));
                            break;
                        }
                        default: {
                            if (arrayList2 == null) continue block15;
                            arrayList2.add(apc_22);
                            break;
                        }
                    }
                    continue;
                }
                if (aoq_12 == null || !(enum_ instanceof aoc_1)) continue;
                switch ((aoc_1)enum_) {
                    default: 
                }
                if (arrayList2 == null) continue;
                arrayList2.add(apc_22);
            }
        }
        ArrayList<String> arrayList3 = new ArrayList<String>();
        if (tShortArrayList != null) {
            object = eDi.ap.a(s, new Object[0]);
            for (int k = 0; k < tShortArrayList.size(); ++k) {
                object = (String)object + " " + eDi.ar.g(tShortArrayList.get(k));
            }
            arrayList3.add((String)object);
        }
        for (eps_0 eps_02 : eps_0.values()) {
            s3 = 0;
            s2 = 0;
            if (tByteShortHashMap != null && tByteShortHashMap.get(eps_02.a()) > 0) {
                s3 = tByteShortHashMap.get(eps_02.a());
            }
            if (tByteShortHashMap2 != null && tByteShortHashMap2.get(eps_02.a()) > 0) {
                s2 = tByteShortHashMap2.get(eps_02.a());
            }
            if (s2 > 0 && s3 > 0) {
                if (s3 < s2) {
                    arrayList3.add(s3 + " < " + eDm.a(eps_02) + " < " + s2);
                    continue;
                }
                arrayList3.add(eDm.a(eps_02) + " = " + s3);
                continue;
            }
            if (s2 > 0) {
                arrayList3.add(eDm.a(eps_02) + " < " + s2);
                continue;
            }
            if (s3 <= 0) continue;
            arrayList3.add(eDm.a(eps_02) + " > " + s3);
        }
        if (tIntShortHashMap != null) {
            tIntShortIterator = tIntShortHashMap.iterator();
            while (tIntShortIterator.hasNext()) {
                tIntShortIterator.advance();
                ani_2 ani_22 = eDi.aq.a();
                fin_0 fin_02 = eDi.ar.a((short)tIntShortIterator.key());
                eDi.ar.a(ani_22, fin_02);
                ani_22.a((CharSequence)" > ").a(tIntShortIterator.value());
                arrayList3.add(ani_22.r());
            }
        }
        if (tIntShortHashMap2 != null) {
            tIntShortIterator = tIntShortHashMap2.iterator();
            while (tIntShortIterator.hasNext()) {
                tIntShortIterator.advance();
                ani_2 ani_23 = eDi.aq.a();
                fin_0 fin_03 = eDi.ar.a((short)tIntShortIterator.key());
                eDi.ar.a(ani_23, fin_03);
                ani_23.a((CharSequence)" < ").a(tIntShortIterator.value());
                arrayList3.add(ani_23.r());
            }
        }
        return arrayList3;
    }

    public static LinkedList<apc_2> a(apc_2 apc_22) {
        if (apc_22 == null) {
            return null;
        }
        if (apc_22.c() == aoc_1.b) {
            aos_1 aos_12 = (aos_1)apc_22;
            LinkedList<apc_2> linkedList = new LinkedList<apc_2>();
            linkedList.addAll(eDm.a(aos_12.b()));
            linkedList.addAll(eDm.a(aos_12.d()));
            return linkedList;
        }
        LinkedList<apc_2> linkedList = new LinkedList<apc_2>();
        linkedList.add(apc_22);
        return linkedList;
    }

    public static String a(eps_0 eps_02) {
        if (eps_02 == eps_0.b) {
            return eDi.ap.a(e, new Object[0]);
        }
        if (eps_02 == eps_0.c) {
            return eDi.ap.a(f, new Object[0]);
        }
        if (eps_02 == eps_0.e) {
            return eDi.ap.a(h, new Object[0]);
        }
        if (eps_02 == eps_0.d) {
            return eDi.ap.a(g, new Object[0]);
        }
        if (eps_02 == eps_0.k) {
            return eDi.ap.a(q, new Object[0]);
        }
        if (eps_02 == eps_0.C) {
            return eDi.ap.a(eDi.ay, new Object[0]);
        }
        if (eps_02 == eps_0.E) {
            return eDi.ap.a(eDi.az, new Object[0]);
        }
        if (eps_02 == eps_0.F) {
            return eDi.ap.a(eDi.aA, new Object[0]);
        }
        if (eps_02 == eps_0.D) {
            return eDi.ap.a(eDi.aB, new Object[0]);
        }
        if (eps_02 == eps_0.G) {
            return eDi.ap.a(eDi.aC, new Object[0]);
        }
        if (eps_02 == eps_0.al) {
            return eDi.ap.a(eDi.aE, new Object[0]);
        }
        if (eps_02 == eps_0.ax) {
            return eDi.ap.a(eDi.aG, new Object[0]);
        }
        if (eps_02 == eps_0.ar) {
            return eDi.ap.a(eDi.aF, new Object[0]);
        }
        if (eps_02 == eps_0.J) {
            return eDi.ar.b();
        }
        if (eps_02 == eps_0.f) {
            return eDi.ap.a(k, new Object[0]);
        }
        if (eps_02 == eps_0.Q) {
            return eDi.ap.a(l, new Object[0]);
        }
        if (eps_02 == eps_0.ae) {
            return eDi.ap.a(m, new Object[0]);
        }
        if (eps_02 == eps_0.j) {
            return eDi.ap.a(p, new Object[0]);
        }
        if (eps_02 == eps_0.h) {
            return eDi.ap.a(n, new Object[0]);
        }
        if (eps_02 == eps_0.g) {
            return eDi.ap.a(o, new Object[0]);
        }
        if (eps_02 == eps_0.P) {
            return eDi.ap.a(r, new Object[0]);
        }
        return "";
    }

    public static String a(aot_2 aot_22) {
        return eDm.a(aot_22, null);
    }

    public static String a(aot_2 aot_22, edo_0 edo_02) {
        Object object;
        boolean bl;
        if (!aot_22.g()) {
            return "";
        }
        if (edo_02 != null && edo_02.e() && aot_22 instanceof apc_2 && (bl = eDm.a((apc_2)(object = (apc_2)aot_22), edo_02))) {
            return "";
        }
        if (aot_22.h() != null) {
            if (aot_22 instanceof apc_2) {
                object = (apc_2)aot_22;
                if (edo_02 != null && !eDm.a((apc_2)object, edo_02)) {
                    return Oy.d().a(aot_22.h(), new Object[0]);
                }
                return "";
            }
            return Oy.d().a(aot_22.h(), new Object[0]);
        }
        object = aot_22.c();
        Object object2 = "";
        if (object instanceof aoc_1) {
            switch ((aoc_1)((Object)object)) {
                case i: {
                    aoh_2 aoh_22 = (aoh_2)aot_22;
                    String string = eDm.a(aoh_22.b(), edo_02);
                    String string2 = eDm.a(aoh_22.d(), edo_02);
                    if (string.length() == 0 || string2.length() == 0) {
                        return "";
                    }
                    if (aoh_22.d().b()) {
                        object2 = eDi.ap.a(P, string, string2);
                        break;
                    }
                    if (aoh_22.b().b()) {
                        object2 = eDi.ap.a(Q, string2, string);
                        break;
                    }
                    object2 = eDi.ap.a(P, string, string2);
                    break;
                }
                case j: {
                    aoi_2 aoi_22 = (aoi_2)aot_22;
                    String string = eDm.a(aoi_22.b(), edo_02);
                    String string3 = eDm.a(aoi_22.d(), edo_02);
                    if (string.length() == 0 || string3.length() == 0) {
                        return "";
                    }
                    if (aoi_22.d().b()) {
                        object2 = eDi.ap.a(R, string, eDm.a(aoi_22.d(), edo_02));
                        break;
                    }
                    if (aoi_22.b().b()) {
                        object2 = eDi.ap.a(S, eDm.a(aoi_22.d(), edo_02), string);
                        break;
                    }
                    object2 = eDi.ap.a(R, string, eDm.a(aoi_22.d(), edo_02));
                    break;
                }
                case b: {
                    aos_1 aos_12 = (aos_1)aot_22;
                    String string = eDm.a((aot_2)aos_12.b(), edo_02);
                    String string4 = eDm.a((aot_2)aos_12.d(), edo_02);
                    if (string.isEmpty() && string4.isEmpty()) {
                        return "";
                    }
                    if (string.isEmpty()) {
                        object2 = string4;
                        break;
                    }
                    if (string4.isEmpty()) {
                        object2 = string;
                        break;
                    }
                    object2 = string + (string.isEmpty() ? "" : "\n") + string4;
                    break;
                }
                case g: {
                    boolean bl2;
                    aoq_1 aoq_12;
                    aoq_1 aoq_13;
                    if (aot_22 instanceof aoe_1) {
                        aoe_1 aoe_12 = (aoe_1)aot_22;
                        aoq_13 = aoe_12.b();
                        aoq_12 = aoe_12.d();
                        bl2 = true;
                    } else {
                        aol_2 aol_22 = (aol_2)aot_22;
                        aoq_13 = aol_22.b();
                        aoq_12 = aol_22.d();
                        bl2 = false;
                    }
                    if (aoq_13.b()) {
                        object2 = eDm.a(aoq_12, aoq_13, bl2);
                        break;
                    }
                    object2 = eDm.a(aoq_13, aoq_12, bl2);
                    break;
                }
                case l: {
                    aor_1 aor_12 = (aor_1)aot_22;
                    String string = eDm.a((aot_2)aor_12.d(), edo_02);
                    String string5 = eDm.a((aot_2)aor_12.b(), edo_02);
                    if (string5.length() == 0 && string.length() == 0) {
                        return "";
                    }
                    if (string5.length() == 0) {
                        object2 = string;
                        break;
                    }
                    if (string.length() == 0) {
                        object2 = string5;
                        break;
                    }
                    object2 = string + "\n" + eDi.ap.a(a, new Object[0]) + " " + string5;
                    break;
                }
                case m: {
                    apf_2 apf_22 = (apf_2)aot_22;
                    String string = eDm.a((aot_2)apf_22.d(), edo_02);
                    String string6 = eDm.a((aot_2)apf_22.b(), edo_02);
                    if (string6.isEmpty() && string.isEmpty()) {
                        return "";
                    }
                    if (string6.isEmpty()) {
                        object2 = string;
                        break;
                    }
                    if (string.isEmpty()) {
                        object2 = string6;
                        break;
                    }
                    object2 = string + "\n" + eDi.ap.a(b, new Object[0]) + " " + string6;
                    break;
                }
                case n: {
                    apd_2 apd_22 = (apd_2)aot_22;
                    object2 = apd_22.b();
                    break;
                }
                case e: {
                    aox_1 aox_12 = (aox_1)aot_22;
                    object2 = String.valueOf(aox_12.a(null, null, null, null));
                    break;
                }
                case a: {
                    aoq_2 aoq_22 = (aoq_2)aot_22;
                    String string = eDm.a(aoq_22.d(), edo_02);
                    String string7 = eDm.a(aoq_22.e(), edo_02);
                    if (string.length() == 0 && string7.length() == 0) {
                        return "";
                    }
                    if (string.length() == 0) {
                        return string7;
                    }
                    if (string7.length() == 0) {
                        return string;
                    }
                    object2 = eDi.ap.a(aI, string, string7);
                    break;
                }
                default: {
                    object2 = "";
                    break;
                }
            }
        } else if (object instanceof eyO) {
            switch ((eyO)((Object)object)) {
                case c: {
                    esH esH2 = (esH)aot_22;
                    object2 = eDm.a(esH2.f());
                    break;
                }
                case aM: {
                    esj_0 esj_02 = (esj_0)aot_22;
                    object2 = eDm.a(esj_02.f()) + " " + eDi.ap.a(eDi.aH, new Object[0]);
                    break;
                }
                case d: {
                    esI esI2 = (esI)aot_22;
                    object2 = eDm.a(esI2.f()) + " %";
                    break;
                }
                case aq: {
                    object2 = eDi.ap.a(eDi.aI, new Object[0]);
                    break;
                }
                case gv: {
                    object2 = eDi.ap.a(eDi.aJ, new Object[0]);
                    break;
                }
                case i: {
                    euz_0 euz_02 = (euz_0)aot_22;
                    int n = euz_02.f();
                    if (n != -1) {
                        ani_2 ani_22 = eDi.aq.a();
                        fin_0 fin_02 = eDi.ar.a((short)n);
                        eDi.ar.a(ani_22, fin_02);
                        object2 = ani_22.r();
                        break;
                    }
                    object2 = "";
                    break;
                }
                case p: {
                    ewb_0 ewb_02 = (ewb_0)aot_22;
                    Object object3 = ewb_02.d() ? eDi.ap.a(t, new Object[0]) : eDi.ap.a(s, new Object[0]);
                    for (int k = 0; k < ewb_02.b().size(); ++k) {
                        object3 = (String)object3 + " ";
                        object3 = (String)object3 + eDi.ar.g(ewb_02.b().get(k));
                    }
                    object2 = object3;
                    break;
                }
                case aa: {
                    ewd_0 ewd_02 = (ewd_0)aot_22;
                    boolean bl3 = ((apc_2)aot_22).f();
                    Object object4 = ewd_02.d() ? eDi.ap.a(bl3 ? w : v, new Object[0]) : eDi.ap.a(u, new Object[0]);
                    for (int k = 0; k < ewd_02.b().size(); ++k) {
                        object4 = (String)object4 + " ";
                        object4 = (String)object4 + eDi.ar.c(ewd_02.b().get(k));
                    }
                    object2 = object4;
                    break;
                }
                case ar: {
                    ewc_0 ewc_02 = (ewc_0)aot_22;
                    boolean bl4 = ((apc_2)aot_22).f();
                    Object object5 = ewc_02.d() ? eDi.ap.a(bl4 ? w : v, new Object[0]) : eDi.ap.a(u, new Object[0]);
                    for (int k = 0; k < ewc_02.b().size(); ++k) {
                        object5 = (String)object5 + " ";
                        object5 = (String)object5 + eDi.ar.d((short)ewc_02.b().get(0));
                    }
                    object2 = object5;
                    break;
                }
                case a: {
                    if (((apc_2)aot_22).f()) {
                        object2 = eDi.ap.a(y, new Object[0]);
                        break;
                    }
                    object2 = eDi.ap.a(x, new Object[0]);
                    break;
                }
                case fb: {
                    object2 = eDi.ap.a(aL, new Object[0]);
                    break;
                }
                case m: {
                    evw evw2 = (evw)aot_22;
                    Object object6 = "";
                    boolean bl5 = ((apc_2)aot_22).f();
                    if (evw2.d().size() > 0) {
                        object6 = eDi.ap.a(evw2.d().get((int)0).B, new Object[0]);
                    }
                    for (int k = 1; k < evw2.d().size(); ++k) {
                        object6 = (String)object6 + " " + eDi.ap.a(a, new Object[0]) + " " + eDi.ap.a(evw2.d().get((int)k).B, new Object[0]);
                    }
                    Object object7 = "";
                    if (evw2.b().size() > 0) {
                        object7 = eDi.ar.d(evw2.b().get(0));
                    }
                    for (int k = 1; k < evw2.b().size(); ++k) {
                        int n = evw2.b().get(k);
                        object7 = (String)object7 + " " + eDi.ap.a(a, new Object[0]) + " " + eDi.ar.d(n);
                    }
                    if (evw2.d().size() > 0) {
                        if (bl5) {
                            object2 = eDi.ap.a(C, object7, object6);
                            break;
                        }
                        object2 = eDi.ap.a(B, object7, object6);
                        break;
                    }
                    if (bl5) {
                        object2 = eDi.ap.a(A, object7);
                        break;
                    }
                    object2 = eDi.ap.a(z, object7);
                    break;
                }
                case cW: {
                    if (((apc_2)aot_22).f()) {
                        object2 = eDi.ap.a(E, new Object[0]);
                        break;
                    }
                    object2 = eDi.ap.a(D, new Object[0]);
                    break;
                }
                case dk: {
                    exz_0 exz_02 = (exz_0)aot_22;
                    long l = exz_02.b().a(null, null, null, null);
                    ekk_0 ekk_02 = elg_0.a().i(l);
                    if (ekk_02 == null || ekk_02.w() != ele_0.b.a()) break;
                    if (((apc_2)aot_22).f()) {
                        object2 = eDi.ap.a(aN, new Object[0]);
                        break;
                    }
                    object2 = eDi.ap.a(aM, new Object[0]);
                    break;
                }
                case gi: {
                    if (((apc_2)aot_22).f()) {
                        object2 = eDi.ap.a(aP, new Object[0]);
                        break;
                    }
                    object2 = eDi.ap.a(aO, new Object[0]);
                    break;
                }
                case W: {
                    object2 = eDi.ap.a(V, new Object[0]);
                    break;
                }
                case b: {
                    if (((apc_2)aot_22).f()) {
                        object2 = eDi.ap.a(G, new Object[0]);
                        break;
                    }
                    object2 = eDi.ap.a(F, new Object[0]);
                    break;
                }
                case v: {
                    object2 = eDi.ap.a(K, new Object[0]);
                    break;
                }
                case w: {
                    object2 = eDi.ap.a(L, new Object[0]);
                    break;
                }
                case k: {
                    object2 = eDi.ap.a(M, new Object[0]);
                    break;
                }
                case u: {
                    object2 = eDi.ap.a(N, new Object[0]);
                    break;
                }
                case dU: {
                    object2 = eDi.ap.a(O, new Object[0]);
                    break;
                }
                case h: {
                    object2 = eDi.ap.a(ac, new Object[0]);
                    break;
                }
                case cF: {
                    esQ esQ2 = (esQ)aot_22;
                    String string = eDi.ar.b((short)esQ2.f());
                    object2 = eDi.ap.a(ad, string);
                    break;
                }
                case O: {
                    exS exS2 = (exS)aot_22;
                    object2 = eDi.ap.a(String.format("%s%s", T, exS2.d()), new Object[0]);
                    break;
                }
                case I: {
                    eua_0 eua_02 = (eua_0)aot_22;
                    byte by = (byte)eua_02.f();
                    object2 = eDi.ap.a(U, eDm.a(by));
                    break;
                }
                case n: {
                    evo_0 evo_02 = (evo_0)aot_22;
                    fie_0 fie_02 = fih_0.a().a(evo_02.b());
                    String string = ((apc_2)aot_22).f() ? X : W;
                    object2 = eDi.ap.a(string, fie_02.g(), evo_02.d());
                    break;
                }
                case dN: {
                    evP evP2 = (evP)aot_22;
                    fie_0 fie_03 = fih_0.a().a(evP2.b());
                    String string = ((apc_2)aot_22).f() ? Z : Y;
                    object2 = eDi.ap.a(string, fie_03.g(), evP2.d());
                    break;
                }
                case cE: {
                    evr evr2 = (evr)aot_22;
                    String string = eDi.ar.b((short)evr2.b());
                    if (((apc_2)aot_22).f()) {
                        object2 = eDi.ap.a(ab, string);
                        break;
                    }
                    object2 = eDi.ap.a(aa, string);
                    break;
                }
                case aL: {
                    object2 = eDi.ap.a(ae, new Object[0]);
                    break;
                }
                case aW: {
                    object2 = eDi.ap.a(af, new Object[0]);
                    break;
                }
                case bh: {
                    esR esR2 = (esR)aot_22;
                    int n = esR2.f();
                    if (n > 0) {
                        String string = eDi.ar.h(n);
                        object2 = eDi.ap.a(ag, string);
                        break;
                    }
                    object2 = eDi.ar.c();
                    break;
                }
                case bo: {
                    ewS ewS2 = (ewS)aot_22;
                    if (ewS2.f()) {
                        object2 = eDi.ap.a(ak, new Object[0]);
                        break;
                    }
                    object2 = eDi.ap.a(aj, new Object[0]);
                    break;
                }
                case q: {
                    ewR ewR2 = (ewR)aot_22;
                    if (ewR2.f()) {
                        object2 = eDi.ap.a(ai, new Object[0]);
                        break;
                    }
                    object2 = eDi.ap.a(ah, new Object[0]);
                    break;
                }
                case cB: {
                    object2 = eDi.ap.a(aD, new Object[0]);
                    break;
                }
                case cz: {
                    object2 = eDi.ap.a(aE, new Object[0]);
                    break;
                }
                case eh: {
                    object2 = eDi.ap.a(aF, new Object[0]);
                    break;
                }
                case ck: {
                    object2 = eDi.ap.a(ao, new Object[0]);
                    break;
                }
                case cY: {
                    String string = eDi.ar.c(((evS)aot_22).b());
                    if (((apc_2)aot_22).f()) {
                        object2 = eDi.ap.a(aq, string);
                        break;
                    }
                    object2 = eDi.ap.a(ap, string);
                    break;
                }
                case cx: {
                    object2 = eDi.ap.a(ay, new Object[0]);
                    break;
                }
                case cv: {
                    boolean bl6 = ((apc_2)aot_22).f();
                    if (bl6) {
                        object2 = eDi.ap.a(aG, new Object[0]);
                        break;
                    }
                    object2 = eDi.ap.a(aH, new Object[0]);
                    break;
                }
                case ct: {
                    object2 = eDi.ap.a(az, new Object[0]);
                    break;
                }
                case cs: {
                    object2 = eDi.ap.a(aB, new Object[0]);
                    break;
                }
                case cZ: {
                    object2 = eDi.ap.a(aC, new Object[0]);
                    break;
                }
                case ac: {
                    object2 = eDi.ap.a(aA, new Object[0]);
                    break;
                }
                case cG: {
                    object2 = eDi.ap.a(aJ, new Object[0]);
                    break;
                }
                case ao: {
                    eva_0 eva_02 = (eva_0)aot_22;
                    String string = eDi.ar.f(eva_02.b());
                    object2 = eDi.ap.a(aK, string);
                    break;
                }
                case l: {
                    evv_0 evv_02 = (evv_0)aot_22;
                    TIntArrayList tIntArrayList = evv_02.b();
                    StringBuilder stringBuilder = new StringBuilder();
                    int n = tIntArrayList.size();
                    for (int k = 0; k < n; ++k) {
                        if (k != 0) {
                            stringBuilder.append(", ");
                        }
                        stringBuilder.append(eDi.ar.e(tIntArrayList.get(k)));
                    }
                    object2 = eDi.ap.a(aQ, stringBuilder.toString());
                    break;
                }
                case aT: {
                    object2 = String.valueOf(eDi.ar.a());
                    break;
                }
                case fu: {
                    String string = eDi.ar.c(((ewc)aot_22).b());
                    if (((apc_2)aot_22).f()) {
                        object2 = eDi.ap.a(aU, string);
                        break;
                    }
                    object2 = eDi.ap.a(aR, string);
                    break;
                }
                case fG: {
                    if (((apc_2)aot_22).f()) {
                        object2 = eDi.ap.a(aT, new Object[0]);
                        break;
                    }
                    object2 = eDi.ap.a(aS, new Object[0]);
                    break;
                }
                case dq: {
                    euC euC2 = (euC)aot_22;
                    fie_0 fie_04 = fih_0.a().a((int)euC2.k());
                    object2 = eDi.ap.a(aV, fie_04.g(), euC2.l(), euC2.j());
                    break;
                }
                case fC: {
                    euC euC3 = (euC)aot_22;
                    fie_0 fie_05 = fih_0.a().a((int)euC3.k());
                    object2 = eDi.ap.a(aW, fie_05.g(), euC3.l(), euC3.j());
                    break;
                }
                case fF: {
                    evr_0 evr_02 = (evr_0)aot_22;
                    Object object8 = "";
                    for (int n : evr_02.d().toArray()) {
                        object8 = (String)object8 + eDi.ar.i(n) + ",";
                    }
                    object8 = ((String)object8).substring(0, ((String)object8).length() - 1) + ".";
                    object2 = eDi.ap.a(aX, object8);
                    break;
                }
                case fO: {
                    evL evL2 = (evL)aot_22;
                    byte by = evL2.b();
                    fgY fgY2 = fgY.a(by);
                    String string = eDi.ar.a(fgY2);
                    object2 = eDi.ap.a(aY, string);
                    break;
                }
                case U: {
                    etp_0 etp_02 = (etp_0)aot_22;
                    TLongArrayList tLongArrayList = etp_02.c(null, null, null, null);
                    Object object9 = "";
                    for (long l : tLongArrayList.toArray()) {
                        object9 = (String)object9 + eDi.ar.e((int)l) + ",";
                    }
                    object2 = object9 = ((String)object9).substring(0, ((String)object9).length() - 1) + ".";
                    break;
                }
                case bA: {
                    ewk_0 ewk_02 = (ewk_0)aot_22;
                    String string = eDi.ar.a(ewk_02.b());
                    if (((apc_2)aot_22).f()) {
                        object2 = eDi.ap.a(ba, string);
                        break;
                    }
                    object2 = eDi.ap.a(aZ, string);
                    break;
                }
                case bz: {
                    ewl_0 ewl_02 = (ewl_0)aot_22;
                    String string = eDi.ar.a(ewl_02.b());
                    if (((apc_2)aot_22).f()) {
                        object2 = eDi.ap.a(bc, string);
                        break;
                    }
                    object2 = eDi.ap.a(bb, string);
                    break;
                }
                case fa: {
                    ewm_0 ewm_02 = (ewm_0)aot_22;
                    String string = eDi.ar.a(ewm_02.b());
                    if (((apc_2)aot_22).f()) {
                        object2 = eDi.ap.a(be, string);
                        break;
                    }
                    object2 = eDi.ap.a(bd, string);
                    break;
                }
                case by: {
                    ewn_0 ewn_02 = (ewn_0)aot_22;
                    String string = eDi.ar.b(ewn_02.b());
                    if (((apc_2)aot_22).f()) {
                        object2 = eDi.ap.a(bg, string);
                        break;
                    }
                    object2 = eDi.ap.a(bf, string);
                    break;
                }
                case eZ: {
                    ewp ewp2 = (ewp)aot_22;
                    String string = eDi.ar.a(ewp2.b());
                    if (((apc_2)aot_22).f()) {
                        object2 = eDi.ap.a(bk, string);
                        break;
                    }
                    object2 = eDi.ap.a(bj, string);
                    break;
                }
                case hh: {
                    esj esj2 = (esj)aot_22;
                    String string = eDi.ar.c(esj2.f());
                    object2 = eDi.ap.a(bv, string);
                    break;
                }
                case gf: {
                    object2 = eDi.ap.a(bl, new Object[0]);
                    break;
                }
                case ge: {
                    object2 = eDi.ap.a(bm, new Object[0]);
                    break;
                }
                case hq: {
                    if (((apc_2)aot_22).f()) {
                        object2 = eDi.ap.a(bn, new Object[0]);
                        break;
                    }
                    object2 = eDi.ap.a(bo, new Object[0]);
                    break;
                }
                case hr: {
                    if (((apc_2)aot_22).f()) {
                        object2 = eDi.ap.a(bp, new Object[0]);
                        break;
                    }
                    object2 = eDi.ap.a(bq, new Object[0]);
                    break;
                }
                case hs: {
                    if (((apc_2)aot_22).f()) {
                        object2 = eDi.ap.a(br, new Object[0]);
                        break;
                    }
                    object2 = eDi.ap.a(bs, new Object[0]);
                    break;
                }
                case gt: {
                    if (((apc_2)aot_22).f()) {
                        object2 = eDi.ap.a(bt, new Object[0]);
                        break;
                    }
                    object2 = eDi.ap.a(bu, new Object[0]);
                    break;
                }
                default: {
                    object2 = "";
                }
            }
        }
        if (aot_22 instanceof eyk_0 && ((eyk_0)((Object)aot_22)).j()) {
            object2 = (String)object2 + eDi.ap.a(ax, new Object[0]);
        }
        return object2;
    }

    private static boolean a(apc_2 apc_22, edo_0 edo_02) {
        if (edo_02 != null) {
            return apc_22.b(edo_02.a(), edo_02.b(), edo_02.d(), edo_02.c());
        }
        return apc_22.b(null, null, null, null);
    }

    private static String a(byte by) {
        return eDi.ap.a(efa_0.a(by).e(), new Object[0]);
    }

    public static ArrayList<abo_2<String, apc_2>> b(apc_2 apc_22) {
        ArrayList<abo_2<String, apc_2>> arrayList = new ArrayList<abo_2<String, apc_2>>();
        LinkedList<apc_2> linkedList = eDm.a(apc_22);
        if (linkedList != null) {
            for (apc_2 apc_23 : linkedList) {
                String string = eDm.a((aot_2)apc_23);
                if (string.length() <= 0) continue;
                arrayList.add(new abo_2<String, apc_2>(string, apc_23));
            }
        }
        return arrayList;
    }

    private static String a(aot_2 aot_22, aot_2 aot_23, boolean bl) {
        Object object;
        String string = eDm.a(aot_23);
        if (string.length() == 0) {
            return "";
        }
        if (aot_22.c() instanceof eyO) {
            object = (eyO)aot_22.c();
            switch (eDn.b[((Enum)object).ordinal()]) {
                case 69: {
                    etX etX2 = (etX)aot_22;
                    String string2 = eDi.ar.h(Co.c(eDm.a(etX2.f())));
                    String string3 = eDi.ar.h(Co.c(eDm.a(etX2.j())));
                    String string4 = eDi.ar.a(Co.g(string));
                    if (bl) {
                        return eDi.ap.a(av, string2, string4, string3);
                    }
                    return eDi.ap.a(aw, string2, string4, string3);
                }
                case 70: {
                    String string5 = eDi.ar.k(Co.c(string));
                    if (bl) {
                        return eDi.ap.a(ar, string5);
                    }
                    return eDi.ap.a(as, string5);
                }
                case 49: {
                    String string6 = eDi.ar.h(Co.c(string));
                    if (bl) {
                        return eDi.ap.a(at, string6);
                    }
                    return eDi.ap.a(au, string6);
                }
            }
        }
        object = new StringBuilder();
        String string7 = eDm.a(aot_22);
        if (string7.length() == 0) {
            return "";
        }
        ((StringBuilder)object).append(string7);
        ((StringBuilder)object).append(bl ? " = " : " != ");
        ((StringBuilder)object).append(string);
        return ((StringBuilder)object).toString();
    }
}

