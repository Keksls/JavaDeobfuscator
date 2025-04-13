/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntProcedure;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class eDi {
    public static final String a = "craft";
    public static final String b = "(\\[(el)([0-9]?)\\])";
    public static final String c = "(\\[(st)([0-9]+)\\])";
    public static final String d = "(\\[(ar)([0-9]+)\\])";
    public static final String e = "(\\[(sp)([0-9]+)\\])";
    public static final Pattern f;
    public static final Pattern g;
    public static final String h = "fighter";
    public static final String i = "shield";
    public static final String j = "glyph";
    public static final String k = "drake";
    public static final String l = "undrake";
    public static final String m = "paw";
    public static final String n = "tique";
    public static final String o = "taque";
    public static final String p = "backstab";
    public static final String q = "sidestab";
    public static final String r = "invisible";
    public static final String s = "barrel";
    public static final String t = "lucky";
    public static final String u = "totem";
    public static final String v = "puppet";
    public static final String w = "enemy";
    public static final String x = "ally";
    public static final String y = "seed";
    public static final String z = "chromatic";
    public static final String A = "caster";
    public static final String B = "serein";
    public static final String C = "exalte";
    public static final String D = "bomb";
    public static final String E = "deposit";
    public static final String F = "natural";
    public static final String G = "unnatural";
    public static final String H = "portal";
    public static final String I = "rune1";
    public static final String J = "rune2";
    public static final String K = "rune3";
    public static final String L = "rune4";
    public static final String M = "prey";
    public static final String N = "ecnbi";
    public static final String O = "ecnbr";
    public static final Pattern P;
    public static final Pattern Q;
    public static final Pattern R;
    public static final Pattern S;
    public static final char T = '+';
    public static final char U = '-';
    public static final char V = '*';
    public static final char W = '/';
    public static final String X = "([\\+\\-\\*\\/])([0-9]+([,\\.][0-9]+)?)";
    public static final Pattern Y;
    public static final Pattern Z;
    public static final Pattern aa;
    public static final Pattern ab;
    public static final Pattern ac;
    public static final Pattern ad;
    public static final Pattern ae;
    public static final int af;
    public static final int ag;
    public static final int ah;
    public static final int ai;
    public static final int aj;
    private static final Logger aQ;
    public static final int ak = -1;
    public static final int al = 0;
    public static final String am = "    ";
    public static String an;
    public static String ao;
    public static Oy ap;
    public static ank_2 aq;
    public static edm_0 ar;
    public static String as;
    public static String at;
    public static String au;
    public static String av;
    public static String aw;
    public static String ax;
    public static String ay;
    public static String az;
    public static String aA;
    public static String aB;
    public static String aC;
    public static String aD;
    public static String aE;
    public static String aF;
    public static String aG;
    public static String aH;
    public static String aI;
    public static String aJ;
    public static int aK;
    public static int aL;
    public static int aM;
    public static int aN;
    public static final TIntObjectHashMap<eDp> aO;

    public static ArrayList<String> a(eDl eDl2) {
        return eDl2.a();
    }

    public static String a(fie_0 fie_02, short s2, boolean bl, int n, boolean bl2, boolean bl3) {
        edh_0 edh_02;
        ArrayList<String> arrayList;
        if (fie_02.c() != s2) {
            fie_02 = fie_02.c(s2);
        }
        if ((arrayList = eDi.a(edh_02 = new edh_0(fie_02, eDk.b, n))) != null && arrayList.size() != 0) {
            ani_2 ani_22 = aq.a();
            if (bl2 && !bl) {
                ani_22.a("8888ff");
            }
            ani_22.a((CharSequence)((bl2 ? "\n" : "") + eDi.a(arrayList, bl3)));
            return ani_22.r();
        }
        return null;
    }

    public static String a(ArrayList<String> arrayList, boolean bl) {
        Object object = "";
        boolean bl2 = true;
        for (String string : arrayList) {
            if (!bl2) {
                object = (String)object + "\n";
            }
            object = (String)object + string;
            bl2 = false;
        }
        return object;
    }

    public static String a(efh_0 efh_02) {
        assert (efh_02 != null) : "Effect null !";
        ejh_0 ejh_02 = (ejh_0)efc_0.a().b(efh_02.j());
        if (ejh_02 == null) {
            aQ.error((Object)("impossible de trouver de RunningEffect associ\u00e9 \u00e0 l'actionId " + efh_02.j()));
            return "";
        }
        efa_0 efa_02 = ((ejh_0)efc_0.a().b(efh_02.j())).br_();
        return eDi.a(efa_02);
    }

    public static String a(efa_0 efa_02) {
        if (efa_02 != null && efa_02 != efa_0.h) {
            return ar.a(aq.a(), efa_02).r();
        }
        return "";
    }

    public static String a(efh_0 efh_02, short s2, fie_0 fie_02, int n) {
        if (efh_02.h() == 2) {
            efp_0 efp_02 = (efp_0)efh_02;
            short s3 = efp_02.c(s2).e();
            if (fie_02 != null) {
                s3 = fie_02.d((short)n).e();
            }
            if (s3 == -1) {
                return ar.a(ap);
            }
            if (s3 > 0) {
                return ar.a(ap, (int)s3);
            }
        }
        return "";
    }

    public static String a(int n) {
        ani_2 ani_22 = aq.a();
        eps_0 eps_02 = eps_0.a((byte)n);
        if (eps_02 != null) {
            ani_22.a((CharSequence)ar.a(eps_02));
        }
        return ani_22.r();
    }

    public static String b(int n) {
        ani_2 ani_22 = aq.a();
        eoz_1 eoz_12 = eoz_1.a(n);
        if (eoz_12 != null) {
            ani_22.a((CharSequence)ar.a(eoz_12));
        }
        return ani_22.r();
    }

    public static String c(int n) {
        ani_2 ani_22 = aq.a();
        erl_2 erl_22 = erl_2.a(n);
        if (erl_22 != null) {
            ani_22.a((CharSequence)ar.a(erl_22));
        }
        return ani_22.r();
    }

    public static String d(int n) {
        ani_2 ani_22 = aq.a();
        eld_0 eld_02 = eld_0.a(n);
        if (eld_02 != null) {
            ani_22.a((CharSequence)ar.a(eld_02));
        }
        return ani_22.r();
    }

    public static String a(fin_0 fin_02) {
        ani_2 ani_22 = aq.a();
        ar.a(ani_22, fin_02);
        return ani_22.r();
    }

    public static String a(fie_0 fie_02, short s2, short s3, boolean bl) {
        ani_2 ani_22 = aq.a();
        ar.a(ani_22, fie_02, s2);
        if (s3 > 0 && bl) {
            fie_0 fie_03 = fih_0.a().a(fie_02.p());
            ani_22.a((CharSequence)(" (" + ap.a(fie_03.A() ? ax : aw, Math.min(fie_03.D(), s2)) + ")"));
        }
        return ani_22.r();
    }

    public static String a(ekk_0 ekk_02, short s2, boolean bl) {
        ani_2 ani_22 = aq.a();
        ar.a(ani_22, ekk_02, s2);
        if (bl) {
            ani_22.a((CharSequence)(" (" + ap.a(aw, Math.min(ekk_02.M(), s2)) + ")"));
        }
        return ani_22.r();
    }

    public static eDp e(int n) {
        eDp eDp2 = (eDp)aO.get(n);
        return eDp2 != null ? eDp2 : (eDp)aO.get(-1);
    }

    static {
        Object object3;
        f = Pattern.compile("\\[@(el|mr|Mr|ap|mp|wp|ch|lv)\\]");
        g = Pattern.compile("\\[(pr|se|pl|ae|lv)\\]");
        P = Pattern.compile("\\[(fighter|shield|glyph|paw|taque|tique|backstab|sidestab|invisible|barrel|lucky|totem|puppet|enemy|ally|caster|serein|exalte|deposit|bomb|seed|natural|unnatural|portal|rune1|rune2|rune3|rune4|prey|chromatic|undrake|ecnbi|ecnbr|drake)\\]");
        Q = Pattern.compile("\\[(li|lp)\\]");
        R = Pattern.compile("(\\[(\\$[0-9]+)+(ef|ae|el|pr|st|li|lp|ea|(#[0-9]+))\\])");
        S = Pattern.compile("(\\$[0-9]+|ef|ae|el|pr|st|li|lp|ea|#[0-9]+)");
        Y = Pattern.compile(X);
        Z = Pattern.compile("\\|([0-9]d)?([0-9]+([,\\.][0-9]+)?)([^|]*)\\|");
        aa = Pattern.compile(b);
        ab = Pattern.compile(c);
        ac = Pattern.compile(d);
        ad = Pattern.compile(e);
        af = efc_0.eq.a();
        ag = efc_0.es.a();
        ah = efc_0.dt.a();
        ai = efc_0.do.a();
        aj = efc_0.ds.a();
        aQ = Logger.getLogger(eDi.class);
        an = "";
        ao = "";
        aO = new TIntObjectHashMap();
        Object object2 = "\\[(";
        for (Object object3 : aqs_1.values()) {
            if (!object3.equals((Object)aqs_1.values()[0])) {
                object2 = (String)object2 + "|";
            }
            object2 = (String)object2 + object3.name();
        }
        object2 = (String)object2 + ")\\]";
        ae = Pattern.compile((String)object2);
        aO.put(-1, (Object)new eDO());
        edq_0 edq_02 = new edq_0();
        aO.put(efc_0.dw.a(), (Object)edq_02);
        aO.put(efc_0.dp.a(), (Object)edq_02);
        aO.put(efc_0.dn.a(), (Object)edq_02);
        aO.put(efc_0.ds.a(), (Object)edq_02);
        aO.put(efc_0.dq.a(), (Object)edq_02);
        aO.put(efc_0.dr.a(), (Object)edq_02);
        aO.put(efc_0.dv.a(), (Object)edq_02);
        aO.put(efc_0.do.a(), (Object)edq_02);
        aO.put(efc_0.du.a(), (Object)edq_02);
        aO.put(efc_0.dt.a(), (Object)edq_02);
        aO.put(efc_0.dr.a(), (Object)edq_02);
        edr_0 edr_02 = new edr_0();
        efe_0.a.forEach((TIntProcedure)new edj_0(edr_02));
        edz_0 edz_02 = new edz_0();
        aO.put(efc_0.ed.a(), (Object)edz_02);
        aO.put(efc_0.ei.a(), (Object)edz_02);
        object3 = new edv_0();
        aO.put(efc_0.h.a(), object3);
        aO.put(efc_0.an.a(), object3);
        edx_0 edx_02 = new edx_0();
        aO.put(efc_0.cC.a(), (Object)edx_02);
        aO.put(efc_0.cD.a(), (Object)edx_02);
        aO.put(efc_0.cA.a(), (Object)edx_02);
        aO.put(efc_0.cB.a(), (Object)edx_02);
        aO.put(efc_0.cE.a(), (Object)edx_02);
        aO.put(efc_0.cF.a(), (Object)edx_02);
        eea_0 eea_02 = new eea_0();
        aO.put(efc_0.eg.a(), (Object)eea_02);
        aO.put(efc_0.eh.a(), (Object)eea_02);
        edt_0 edt_02 = new edt_0();
        aO.put(efc_0.ee.a(), (Object)edt_02);
        eeb_0 eeb_02 = new eeb_0();
        aO.put(efc_0.eq.a(), (Object)eeb_02);
        aO.put(efc_0.es.a(), (Object)eeb_02);
        eec_0 eec_02 = new eec_0();
        aO.put(efc_0.dI.a(), (Object)eec_02);
        eDO eDO2 = new eDO(edu_0.b);
        eed_0 eed_02 = new eed_0();
        aO.put(efc_0.p.a(), (Object)eed_02);
        aO.put(efc_0.q.a(), (Object)eed_02);
        edw_0 edw_02 = new edw_0();
        aO.put(efc_0.cG.a(), (Object)edw_02);
        aO.put(efc_0.cH.a(), (Object)edw_02);
        aO.put(efc_0.cI.a(), (Object)edw_02);
        aO.put(efc_0.cK.a(), (Object)edw_02);
        aO.put(efc_0.cJ.a(), (Object)edw_02);
        aO.put(efc_0.cL.a(), (Object)edw_02);
        aO.put(efc_0.cO.a(), (Object)edw_02);
        aO.put(efc_0.cM.a(), (Object)edw_02);
        aO.put(efc_0.cN.a(), (Object)edw_02);
    }
}

