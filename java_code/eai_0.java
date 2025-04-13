/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from eAi
 */
public class eai_0 {
    private static final Pattern c = Pattern.compile("([ ]+)");
    private static final Pattern d = Pattern.compile("([-]+)");
    private static final Pattern e = Pattern.compile("([']+)");
    private static final Pattern f = Pattern.compile("[ \\-']");
    public static final String a = "[A-Z0-9]{3}-";
    protected static final Logger b = Logger.getLogger(eai_0.class);

    private eai_0() {
    }

    public static String a(String string) {
        Object object = string;
        boolean bl = ((String)object).matches("^[A-Z0-9]{3}-.*");
        if (bl) {
            String string2 = ((String)object).substring(0, 4);
            object = string2 + Cz.d(((String)object).replaceFirst(a, ""));
        } else {
            object = Cz.d((String)object);
        }
        object = c.matcher((CharSequence)object).replaceAll(" ");
        object = d.matcher((CharSequence)object).replaceAll("-");
        object = e.matcher((CharSequence)object).replaceAll("'");
        return object;
    }

    public static eak_0 b(String string) {
        if (enp_2.a.d(ens_2.bq)) {
            return eai_0.a(eaj_0.a);
        }
        eak_0 eak_02 = eav_0.a.a(string);
        if (eak_02.b() != eaj_0.a) {
            return eak_02;
        }
        if (!xu_0.a().a(string)) {
            return eai_0.a(eaj_0.m);
        }
        return eai_0.a(eaj_0.a);
    }

    public static eak_0 c(String string) {
        if (enp_2.a.d(ens_2.bq)) {
            return eai_0.a(eaj_0.a);
        }
        String string2 = string.matches("^[A-Z0-9]{3}-.*") ? string.replaceFirst(a, "") : string;
        return eai_0.b(string2);
    }

    public static eak_0 d(String string) {
        eak_0 eak_02 = eav_0.a.b(string);
        if (eak_02.b() != eaj_0.a) {
            return eak_02;
        }
        if (!xu_0.a().a(string)) {
            return eai_0.a(eaj_0.m);
        }
        return eai_0.a(eaj_0.a);
    }

    public static eak_0 a(eaj_0 eaj_02) {
        return new eak_0(eaj_02);
    }

    public static eak_0 a(eaj_0 eaj_02, char c2) {
        return new eab_0(eaj_02, c2);
    }
}

