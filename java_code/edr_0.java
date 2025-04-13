/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.regex.Matcher;
import org.apache.log4j.Logger;

/*
 * Renamed from eDR
 */
public class edr_0
extends eDO {
    private static final Logger b = Logger.getLogger(edr_0.class);

    @Override
    protected String a(efh_0 efh_02, String string, Object[] objectArray, boolean bl, eDl eDl2) {
        short s2 = eDl2.d();
        if (efe_0.a.contains(efh_02.j())) {
            Matcher matcher = eDi.R.matcher(string);
            fil_0 fil_02 = fim_0.a().a(efh_02.i());
            if (fil_02 == null) {
                b.error((Object)("Groupe d'effet vide " + efh_02.i() + ", voir : RunningEffectGroupType.WITHOUT_EFFECT_GROUP_DESCRIPTION"));
                return null;
            }
            if (!matcher.find() && !bl) {
                ani_2 ani_22 = eDi.aq.a();
                boolean bl2 = true;
                for (efh_0 efh_03 : fil_02) {
                    ani_2 ani_23;
                    eDp eDp2 = eDi.e(efh_03.j());
                    int n = eDp2.a(ani_23 = eDi.aq.a(), efh_03, eDl2);
                    if (n == -1) continue;
                    if (!bl2) {
                        ani_22.a((CharSequence)"\n");
                    }
                    ani_22.a((CharSequence)ani_23.r());
                    bl2 = false;
                }
                return ani_22.r();
            }
            string = this.a(string, fil_02, s2, false, eDl2);
        }
        return Cr.a(string, objectArray);
    }

    private String a(String string, fil_0 fil_02, short s2, boolean bl, eDl eDl2) {
        if (fil_02 == null) {
            return string;
        }
        short s3 = 0;
        Matcher matcher = eDi.R.matcher(string);
        ani_2 ani_22 = eDi.aq.a();
        int n = 0;
        while (matcher.find()) {
            String string2 = matcher.group();
            if (string2.length() == 0) continue;
            Matcher matcher2 = eDi.S.matcher(string2);
            fil_0 fil_03 = null;
            Sl sl = null;
            while (matcher2.find()) {
                String string3 = matcher2.group();
                if (string3.length() > 0) {
                    char c2 = string3.charAt(0);
                    switch (c2) {
                        case '$': {
                            byte by = Byte.parseByte(string3.substring(1));
                            efh_0 efh_02 = (fil_03 != null ? fil_03 : fil_02).b(by - 1);
                            if (efh_02 == null) {
                                b.error((Object)("description d'effet foireuse, on demande l'effet inexistant " + by + " du groupe d'effet " + fil_02));
                                break;
                            }
                            fil_03 = null;
                            sl = efh_02;
                            if (!efe_0.a.contains(efh_02.j())) break;
                            fil_03 = fim_0.a().a(efh_02.i());
                            break;
                        }
                        case '#': {
                            byte by = Byte.parseByte(string3.substring(1));
                            if (sl == null) {
                                b.error((Object)("description d'effet foireuse, on demande le param\u00e8tre " + by + " d'un effet non sp\u00e9cifi\u00e9 !"));
                                break;
                            }
                            String string4 = null;
                            try {
                                string4 = "";
                                if (by == 1 && (sl.j() == eDi.af || sl.j() == eDi.ag)) {
                                    fie_0 fie_02 = fih_0.a().a(sl.a(by - 1, s2, eFb.a));
                                    if (sl.F() > by) {
                                        s3 = (short)sl.a(by, s2, eFb.a);
                                    }
                                    if (fie_02 != null) {
                                        string4 = eDi.a(fie_02, s3, (short)sl.P(), true);
                                    }
                                } else {
                                    string4 = String.valueOf(sl.a(by - 1, s2, eFb.a));
                                }
                            }
                            catch (RuntimeException runtimeException) {
                                b.error((Object)("Exception while retriieving parameter of effect " + (efh_0)sl), (Throwable)runtimeException);
                                string4 = "TRANSLATION_ERROR";
                            }
                            ani_22.a(string, n, matcher.start());
                            ani_22.a((CharSequence)string4);
                            n = matcher.end();
                            break;
                        }
                        case 'p': {
                            char c3 = string3.charAt(1);
                            switch (c3) {
                                case 'r': {
                                    if (sl == null) {
                                        b.error((Object)"description d'effet foireuse, on demande la probabilit\u00e9 d'un effet non sp\u00e9cifi\u00e9 !");
                                        break;
                                    }
                                    ani_22.a(string, n, matcher.start());
                                    ani_22.a((CharSequence)(String.valueOf(Math.round(sl.b(s2))) + "%"));
                                    n = matcher.end();
                                }
                            }
                            break;
                        }
                        case 'e': {
                            char c4 = string3.charAt(1);
                            switch (c4) {
                                case 'l': {
                                    if (sl == null) {
                                        b.error((Object)"description d'effet foireuse, on demande l'\u00e9l\u00e9ment d'un effet non sp\u00e9cifi\u00e9 !");
                                        break;
                                    }
                                    ani_22.a(string, n, matcher.start());
                                    ani_22.a((CharSequence)eDi.a((efh_0)sl));
                                    n = matcher.end();
                                    break;
                                }
                                case 'a': 
                                case 'f': {
                                    if (sl == null) {
                                        b.error((Object)"description d'effet foireuse, on veut d\u00e9crire un effet non sp\u00e9cifi\u00e9 !");
                                        break;
                                    }
                                    ani_2 ani_23 = eDi.aq.a();
                                    eDp eDp2 = eDi.e(sl.j());
                                    if (c4 == 'a') {
                                        eDl2.c(true);
                                    }
                                    eDp2.a(ani_23, (efh_0)sl, eDl2);
                                    ani_22.a(string, n, matcher.start());
                                    ani_22.a((CharSequence)ani_23.r());
                                    n = matcher.end();
                                    break;
                                }
                            }
                            break;
                        }
                        case 'a': {
                            char c5 = string3.charAt(1);
                            switch (c5) {
                                case 'e': {
                                    if (sl == null) {
                                        b.error((Object)"description d'effet foireuse, on demande l'aoe d'un effet non sp\u00e9cifi\u00e9 !");
                                        break;
                                    }
                                    ani_22.a(string, n, matcher.start());
                                    ani_22.a((CharSequence)edr_0.a((efh_0)sl));
                                    n = matcher.end();
                                }
                            }
                            break;
                        }
                        case 's': {
                            char c6 = string3.charAt(1);
                            switch (c6) {
                                case 't': {
                                    String string5;
                                    fie_0 fie_03;
                                    if (sl == null) {
                                        b.error((Object)"description d'effet foireuse, on veut d\u00e9crire un effet (\u00e9tat) non sp\u00e9cifi\u00e9 !");
                                        break;
                                    }
                                    if (sl.j() != eDi.af && sl.j() != eDi.ag || (fie_03 = fih_0.a().a(sl.a(0, s2, eFb.a))) == null || (string5 = eDi.a(fie_03, s3 = (short)sl.a(1, s2, eFb.a), false, eDl2.j(), false, false)) == null) break;
                                    ani_22.a(string, n, matcher.start());
                                    ani_22.a((CharSequence)string5);
                                    n = matcher.end();
                                    break;
                                }
                            }
                            break;
                        }
                        case 'l': {
                            char c7 = string3.charAt(1);
                            if (sl == null) {
                                b.error((Object)"description d'effet foireuse, on veut d\u00e9crire un effet (\u00e9tat) non sp\u00e9cifi\u00e9 !");
                                break;
                            }
                            boolean bl2 = false;
                            switch (c7) {
                                case 'i': {
                                    bl2 = false;
                                    break;
                                }
                                case 'p': {
                                    bl2 = true;
                                    break;
                                }
                                default: {
                                    return "";
                                }
                            }
                            boolean bl3 = eDl2.k();
                            if (sl.j() == eDi.aj) {
                                eDl2.b(true);
                            }
                            String string6 = null;
                            if (efe_0.a.contains(sl.j())) {
                                ArrayList<String> arrayList = eDi.a(new eDu(fil_03, sl.i(), s2, eDl2.j()));
                                string6 = bl ? "\n" : eDi.a(arrayList, bl2);
                            } else if (sl.j() == eDi.af || sl.j() == eDi.ag) {
                                fie_0 fie_04 = fih_0.a().a(sl.a(0, s2, eFb.a));
                                if (fie_04 == null) break;
                                s3 = (short)sl.a(1, s2, eFb.a);
                                string6 = eDi.a(fie_04, s3, false, eDl2.j(), false, bl2);
                            } else {
                                int n2 = sl.F();
                                Object[] objectArray = new Object[n2];
                                for (int k = 0; k < n2; ++k) {
                                    objectArray[k] = sl.a(k, s2, eFb.a);
                                }
                                ani_2 ani_24 = new ani_2();
                                eDp eDp3 = eDi.e(sl.j());
                                eDp3.a(ani_24, (efh_0)sl, eDl2);
                                string6 = ani_24.r();
                            }
                            if (string6 != null) {
                                ani_22.a(string, n, matcher.start());
                                ani_22.a((CharSequence)string6);
                                n = matcher.end();
                            }
                            eDl2.b(bl3);
                            break;
                        }
                    }
                }
            }
        }
        ani_22.a(string, n, string.length());
        return ani_22.r();
    }
}

