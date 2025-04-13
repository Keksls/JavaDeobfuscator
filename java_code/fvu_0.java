/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from fvU
 */
public enum fvu_0 {
    a(new fvZ(), 9, 3),
    b(new fwa_0(), 9, 3),
    c(new fvy_0(), 15, 3),
    d(new fwa_0(), 2, 0);

    private static final String e = "(!!|\uff01\uff01)";
    private static final Pattern f;
    private static final Pattern g;
    private static final Pattern h;
    private static final Pattern i;
    private final fvV j;
    private final int k;
    private final int l;

    private fvu_0(fvV fvV2, int n2, int n3) {
        this.j = fvV2;
        this.k = n2;
        this.l = n3;
    }

    public fvV a() {
        return this.j;
    }

    public int b() {
        return this.k;
    }

    public int c() {
        return this.l;
    }

    public static abo_2<fvu_0, String> a(String string) {
        abo_2<fvu_0, String> abo_22 = new abo_2<fvu_0, String>();
        fvu_0 fvu_02 = a;
        Matcher matcher = f.matcher(string);
        Matcher matcher2 = g.matcher(string);
        Matcher matcher3 = h.matcher(string);
        Matcher matcher4 = i.matcher(string);
        if (matcher2.matches()) {
            matcher.find();
            if (matcher.start() == 0 && matcher.end() < string.length()) {
                string = string.replaceFirst(e, "");
            }
            fvu_02 = c;
        } else if (matcher3.matches()) {
            string = string.replaceFirst("\\*\\*", "");
            fvu_02 = b;
        } else if (matcher4.matches()) {
            string = string.replaceFirst("--", "");
            fvu_02 = d;
        }
        abo_22.a(fvu_02);
        abo_22.b(string);
        return abo_22;
    }

    static {
        f = Pattern.compile(e, 32);
        g = Pattern.compile("(.*(!!|\uff01\uff01).*)", 32);
        h = Pattern.compile("\\*\\*.*", 32);
        i = Pattern.compile("--.*", 32);
    }
}

