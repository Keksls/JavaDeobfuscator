/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  org.apache.log4j.Logger
 */
import com.google.common.base.Strings;
import java.util.function.Function;
import java.util.regex.Matcher;
import org.apache.log4j.Logger;

public class eDO
implements eDp {
    private static final Logger b = Logger.getLogger(eDO.class);
    protected boolean a = false;
    private final eds_0 c;

    public eDO() {
        this.c = edn_0.a;
    }

    public eDO(eds_0 eds_02) {
        this.c = eds_02;
    }

    protected boolean a(String string, int n) {
        return !Strings.isNullOrEmpty((String)string);
    }

    @Override
    public final int a(ani_2 ani_22, efh_0 efh_02, eDl eDl2, Function<Object[], Object[]> function) {
        Object[] objectArray;
        String string;
        Object object;
        String string2;
        if (!eDl2.a(efh_02)) {
            return -1;
        }
        String string3 = "";
        boolean bl = false;
        boolean bl2 = eDl2.f();
        if (!bl2 && eDi.ap.a(eDi.aL, (long)efh_02.i())) {
            string3 = eDi.ap.a(eDi.aL, efh_02.i());
        }
        if (string3.isEmpty()) {
            if (eDi.ap.a(eDi.aK, (long)efh_02.j())) {
                string3 = eDi.ap.a(eDi.aK, efh_02.j());
            }
        } else {
            bl = true;
        }
        short s2 = eDl2.d();
        float f2 = efh_02.b(s2);
        boolean bl3 = false;
        boolean bl4 = false;
        ani_2 ani_23 = eDi.aq.a();
        int n = 0;
        epq_2 epq_22 = eDi.ar.d();
        Matcher matcher = eDi.g.matcher(string3);
        while (matcher.find()) {
            string2 = matcher.group(1);
            ani_23.a(string3, n, matcher.start());
            if (string2.startsWith("pr")) {
                ani_23.a((CharSequence)String.valueOf(Math.round(f2)));
                bl3 = true;
            } else if (string2.startsWith("pl")) {
                ani_23.a((CharSequence)eDi.an);
            } else if (string2.startsWith("ae")) {
                object = eDO.a(efh_02);
                if (!Strings.isNullOrEmpty((String)object)) {
                    ani_23.a(' ');
                }
                ani_23.a((CharSequence)object);
                bl4 = true;
            } else if (string2.startsWith("se")) {
                eDl2.a(true);
                object = eDi.e(efh_02.j());
                object.a(ani_23, efh_02, eDl2);
                eDl2.a(bl2);
                if (!this.a(string3, efh_02.i())) {
                    return -1;
                }
            } else if (string2.startsWith("lv")) {
                ani_23.d(epq_22 == null ? 63 : (int)epq_22.dr());
            }
            n = matcher.end();
        }
        ani_23.a(string3, n, string3.length());
        string2 = eDO.a(ani_23.r());
        this.a = false;
        object = eDi.aq.a();
        int n2 = 0;
        Matcher matcher2 = eDi.aa.matcher(string2);
        while (matcher2.find()) {
            string = matcher2.group(3);
            ((ani_2)object).a(string2, n2, matcher2.start());
            if (string.isEmpty()) {
                ((ani_2)object).a((CharSequence)eDi.a(efh_02));
                this.a = true;
            } else {
                ((ani_2)object).a((CharSequence)eDi.a(efa_0.a(Byte.parseByte(string))));
            }
            n2 = matcher2.end();
        }
        ((ani_2)object).a(string2, n2, string2.length());
        string = ((ani_2)object).toString();
        if (!bl4) {
            objectArray = eDi.aq.a();
            int n3 = 0;
            Matcher matcher3 = eDi.ae.matcher(string);
            while (matcher3.find()) {
                String string4 = matcher3.group(1);
                objectArray.a(string, n3, matcher3.start());
                objectArray.a(' ').a((CharSequence)eDi.ar.a(string4));
                n3 = matcher3.end();
            }
            objectArray.a(string, n3, string.length());
            string = objectArray.toString();
        }
        objectArray = this.c.a(efh_02, s2);
        ani_22.a((CharSequence)this.a(efh_02, string, function.apply(objectArray), bl, eDl2));
        if (!bl2 && !bl4) {
            String string5 = eDO.a(efh_02);
            if (!Strings.isNullOrEmpty((String)string5)) {
                ani_22.a(' ');
            }
            ani_22.a((CharSequence)string5);
        }
        if (!bl2 && f2 < 100.0f && !bl3) {
            ani_22.a((CharSequence)" (").d(Math.round(f2)).a((CharSequence)"%)");
        }
        return 0;
    }

    public static String a(String string) {
        Object object;
        Object object2;
        ani_2 ani_22 = eDi.aq.a();
        int n = 0;
        Matcher matcher = eDi.P.matcher(string);
        while (matcher.find()) {
            object2 = matcher.group(1);
            ani_22.a(string, n, matcher.start());
            eDi.ar.b(ani_22, (String)object2);
            n = matcher.end();
        }
        ani_22.a(string, n, string.length());
        string = ani_22.r();
        ani_22 = eDi.aq.a();
        n = 0;
        object2 = eDi.ab.matcher(string);
        while (((Matcher)object2).find()) {
            ani_22.a(string, n, ((Matcher)object2).start());
            n = ((Matcher)object2).end();
            object = ((Matcher)object2).group(3);
            try {
                int n2 = Integer.parseInt((String)object);
                fie_0 fie_02 = fih_0.a().a(n2);
                if (fie_02 == null) {
                    b.error((Object)String.format("Unable to retrieve state (id = %s)", n2));
                    continue;
                }
                ani_22.a((CharSequence)eDi.a(fie_02, (short)1, (short)1, false));
            }
            catch (NumberFormatException numberFormatException) {
                b.error((Object)String.format("Error on extraction of state id (Value related : %s)", object), (Throwable)numberFormatException);
            }
        }
        ani_22.a(string, n, string.length());
        string = ani_22.r();
        ani_22 = eDi.aq.a();
        n = 0;
        object = eDi.ac.matcher(string);
        while (((Matcher)object).find()) {
            ani_22.a(string, n, ((Matcher)object).start());
            n = ((Matcher)object).end();
            String string2 = ((Matcher)object).group(3);
            try {
                int n3 = Integer.parseInt(string2);
                ekk_0 ekk_02 = elg_0.a().i(n3);
                if (ekk_02 == null) {
                    b.error((Object)String.format("Unable to retrieve aoe (id = %s)", n3));
                    continue;
                }
                ani_22.a((CharSequence)eDi.a(ekk_02, (short)0, false));
            }
            catch (NumberFormatException numberFormatException) {
                b.error((Object)String.format("Error on extraction of aoe id (Value related : %s)", string2), (Throwable)numberFormatException);
            }
        }
        ani_22.a(string, n, string.length());
        string = ani_22.r();
        ani_22 = eDi.aq.a();
        n = 0;
        Matcher matcher2 = eDi.ad.matcher(string);
        while (matcher2.find()) {
            ani_22.a(string, n, matcher2.start());
            n = matcher2.end();
            String string3 = matcher2.group(3);
            try {
                int n4 = Integer.parseInt(string3);
                Object Spell = fip_0.d().b(n4);
                if (Spell == null) {
                    b.error((Object)String.format("Unable to find spell (id = %s)", n4));
                    continue;
                }
                ani_22.a((CharSequence)eDi.a(Spell));
            }
            catch (NumberFormatException numberFormatException) {
                b.error((Object)String.format("Error on extraction of spell id (Value related : %s)", string3), (Throwable)numberFormatException);
            }
        }
        ani_22.a(string, n, string.length());
        string = ani_22.r();
        return string;
    }

    protected String a(efh_0 efh_02, String string, Object[] objectArray, boolean bl, eDl eDl2) {
        return Cr.a(string, objectArray);
    }

    public static String a(efh_0 efh_02) {
        String string = efh_02.u().i().toString();
        if (!string.equals(aqs_1.a.name()) && !string.equals(aqs_1.b.name())) {
            return eDi.ar.a(efh_02.u());
        }
        return "";
    }
}

