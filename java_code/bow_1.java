/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortIntIterator
 *  gnu.trove.map.hash.TByteIntHashMap
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  gnu.trove.map.hash.TShortIntHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TShortIntIterator;
import gnu.trove.map.hash.TByteIntHashMap;
import gnu.trove.map.hash.TByteObjectHashMap;
import gnu.trove.map.hash.TShortIntHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from bow
 */
public class bow_1 {
    private static final Logger b = Logger.getLogger(bow_1.class);
    private static final Pattern c = Pattern.compile("[+-]");
    private static final Pattern d = Pattern.compile("(\\[el[0-9]+])");
    private final TShortIntHashMap e = new TShortIntHashMap();
    private final TByteIntHashMap f = new TByteIntHashMap();
    private final Oy g;

    public bow_1(Oy oy, ArrayList<efh_0> arrayList, short s2) {
        this(oy, arrayList, s2, false);
    }

    public bow_1(Oy oy, ArrayList<efh_0> arrayList, short s2, boolean bl) {
        this.a(arrayList, s2, bl);
        this.g = oy;
    }

    public ArrayList<String> a() {
        Object object;
        TByteObjectHashMap tByteObjectHashMap = new TByteObjectHashMap();
        Object object2 = this.e.iterator();
        while (object2.hasNext()) {
            int n;
            object2.advance();
            object = eps_0.a(Hw.a(object2.key()));
            if (object == null || !this.g.a(eDi.aK, (long)(n = this.f.get(((eps_0)object).a())))) continue;
            String string = this.a(n, object2.value());
            Matcher matcher = d.matcher(string);
            while (matcher.find()) {
                String string2 = matcher.group();
                byte by = Byte.parseByte(String.valueOf(string2.charAt(3)));
                String string3 = eDi.a(efa_0.a(by));
                string = string.replace(string2, string3);
            }
            tByteObjectHashMap.put(((eps_0)object).a(), (Object)string);
        }
        object2 = new ArrayList(tByteObjectHashMap.size());
        object = tByteObjectHashMap.keys();
        Arrays.sort((byte[])object);
        for (Object object3 : object) {
            ((ArrayList)object2).add((String)tByteObjectHashMap.get((byte)object3));
        }
        return object2;
    }

    public TByteObjectHashMap<String> a(Su su) {
        TByteObjectHashMap tByteObjectHashMap = new TByteObjectHashMap();
        TShortIntIterator tShortIntIterator = this.e.iterator();
        while (tShortIntIterator.hasNext()) {
            tShortIntIterator.advance();
            eps_0 eps_02 = eps_0.a(Hw.a(tShortIntIterator.key()));
            efa_0 efa_02 = efa_0.a(Hw.b(tShortIntIterator.key()));
            int n = this.f.get(eps_02.a());
            int n2 = tShortIntIterator.value();
            if (!this.g.a(eDi.aK, (long)n)) continue;
            String string = this.a(n, n2);
            ani_2 ani_22 = new ani_2();
            ani_22.a((CharSequence)string);
            if (efa_02 != null) {
                try {
                    String string2 = String.format(azs_0.a().a("elementsSmallIconsPath"), efa_02.name());
                    ani_22.a((CharSequence)" ").a((CharSequence)fkq_1.a(string2, -1, -1, null));
                }
                catch (gm_0 gm_02) {
                    b.error((Object)"Probl\u00e8me de propri\u00e9t\u00e9", (Throwable)gm_02);
                }
            }
            if (eps_02 == eps_0.b || eps_02 == eps_0.c || eps_02 == eps_0.d || eps_02 == eps_0.e) {
                ani_22.a((CharSequence)" (").d(su.b(eps_02).c()).a((CharSequence)")");
            } else {
                ani_22.a((CharSequence)" (").d(su.c(eps_02)).a((CharSequence)")");
            }
            tByteObjectHashMap.put(eps_02.a(), (Object)ani_22.r());
        }
        return tByteObjectHashMap;
    }

    private String a(int n, int n2) {
        String string = this.g.a(10, n);
        string = c.matcher(string).replaceAll("");
        Object object = n2 < 0 ? String.valueOf(n2) : "+" + n2;
        return Cr.a(string, object);
    }

    private void a(ArrayList<efh_0> arrayList, short s2, boolean bl) {
        arrayList.sort(box_1.a);
        ArrayList<efh_0> arrayList2 = arrayList;
        int n = arrayList2.size();
        for (int k = 0; k < n; ++k) {
            boolean bl2;
            ru_0 ru_02;
            efh_0 efh_02 = arrayList2.get(k);
            if (!bl && efh_02.L()) continue;
            ejh_0 ejh_02 = (ejh_0)efc_0.a().b(efh_02.j());
            efa_0 efa_02 = ejh_02.br_();
            if (ejh_02 instanceof eGH) {
                ru_02 = ((eGN)ejh_02).aJ();
                bl2 = true;
            } else if (ejh_02 instanceof egi_0) {
                ru_02 = ((eGN)ejh_02).aJ();
                bl2 = false;
            } else if (ejh_02 instanceof ege_0) {
                ru_02 = ((ege_0)ejh_02).aE();
                bl2 = true;
            } else {
                if (!(ejh_02 instanceof egf_0)) continue;
                ru_02 = ((egf_0)ejh_02).aE();
                bl2 = false;
            }
            if (ru_02 == null) {
                assert (false);
                b.error((Object)("CharacteristicType inconnu pour l'effet" + efh_02.i() + " actionId=" + efh_02.j() + "  " + ejh_02.getClass()));
                continue;
            }
            byte by = ru_02.a();
            if (!this.f.contains(by)) {
                this.f.put(by, efh_02.j());
            }
            int n2 = bl2 ? efh_02.a(0, s2, eFb.a) : -efh_02.a(0, s2, eFb.a);
            short s3 = Hw.c(by, efa_02 != null ? (byte)efa_02.a() : (byte)-1);
            this.e.adjustOrPutValue(s3, n2, n2);
        }
    }

    public String b(Su su) {
        return bow_1.a(this.a(su));
    }

    private static String a(TByteObjectHashMap<String> tByteObjectHashMap) {
        int n;
        ani_2 ani_22 = new ani_2();
        boolean bl = false;
        String string = (String)tByteObjectHashMap.get(eps_0.b.a());
        if (string != null) {
            ani_22.a().a("fe201b").a((CharSequence)string).b().m();
            bl = true;
        }
        if ((string = (String)tByteObjectHashMap.get(eps_0.c.a())) != null) {
            ani_22.a().a("00afea").a((CharSequence)string).b().m();
            bl = true;
        }
        if ((string = (String)tByteObjectHashMap.get(eps_0.d.a())) != null) {
            ani_22.a().a("00b400").a((CharSequence)string).b().m();
            bl = true;
        }
        if ((string = (String)tByteObjectHashMap.get(eps_0.e.a())) != null) {
            ani_22.a().a("c04aff").a((CharSequence)string).b().m();
            bl = true;
        }
        if (bl) {
            ani_22.m();
        }
        if (bow_1.a(tByteObjectHashMap, ani_22, new eps_0[]{eps_0.p, eps_0.u, eps_0.r, eps_0.w, eps_0.t, eps_0.y, eps_0.s, eps_0.x, eps_0.q, eps_0.v, eps_0.n})) {
            ani_22.m();
        }
        if (bow_1.a(tByteObjectHashMap, ani_22, new eps_0[]{eps_0.j, eps_0.B, eps_0.h, eps_0.i, eps_0.f, eps_0.g, eps_0.C, eps_0.A, eps_0.Q})) {
            ani_22.m();
        }
        if (bow_1.a(tByteObjectHashMap, ani_22, new eps_0[]{eps_0.k, eps_0.o, eps_0.m})) {
            ani_22.m();
        }
        String string2 = ani_22.r();
        int n2 = string2.length();
        for (n = 0; n < n2 && string2.charAt(n2 - n - 1) == '\n'; ++n) {
        }
        return string2.substring(0, string2.length() - n);
    }

    private static boolean a(TByteObjectHashMap<String> tByteObjectHashMap, ani_2 ani_22, eps_0[] eps_0Array) {
        boolean bl = false;
        for (eps_0 eps_02 : eps_0Array) {
            String string = (String)tByteObjectHashMap.get(eps_02.a());
            if (string == null) continue;
            ani_22.a((CharSequence)string).m();
            bl = true;
        }
        return bl;
    }
}

