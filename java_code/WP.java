/*
 * Decompiled with CFR 0.152.
 */
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WP
extends ParseException {
    private static final String a = "Erreur au parse d'une date";
    private static final String b = WQ.a.a() + "[" + WQ.j + "]";
    private static final String c = WQ.a.a() + "[^" + WQ.j + "]";
    private final String d;
    private final String e;

    public WP(String string, String string2) {
        super(a, -1);
        this.d = string;
        this.e = string2;
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    @Override
    public String getMessage() {
        Matcher matcher = Pattern.compile(c).matcher(this.d);
        if (matcher.find()) {
            return "Variable " + matcher.group() + " inconnue dans le FORMAT [ " + this.d + " ]";
        }
        matcher = Pattern.compile(b + b).matcher(this.d);
        if (matcher.find()) {
            return "Variables " + matcher.group() + " sans s\u00e9parateur dans le FORMAT [ " + this.d + " ]";
        }
        if (!Pattern.compile(wm_0.a(this.d)).matcher(this.e).matches()) {
            return "DATE [" + this.e + "] incompatible avec le FORMAT [ " + this.d + " ]";
        }
        return "Parse impossible pour le FORMAT [ " + this.d + " ] et la DATE [ " + this.e + " ]";
    }
}

