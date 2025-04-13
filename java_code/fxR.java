/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fxR
extends fxQ {
    private static final String a = "image";
    private static final String b = "width";
    private static final String c = "height";
    private static final String d = "pixmap";
    private static final String e = "popupTranslatorKey";
    private static final Pattern f = Pattern.compile("width=\"([0-9]+)\"");
    private static final Pattern g = Pattern.compile("height=\"([0-9]+)\"");
    private static final Pattern h = Pattern.compile("pixmap=\"(@?[a-zA-Z0-9\\-_/!:.]+)\"");
    private static final Pattern i = Pattern.compile("popupTranslatorKey=\"([ a-zA-Z0-9\\-_/!:.]+)\"");
    private String j;
    private ayo_2 k;
    private int l = 0;
    private int m = 0;
    private boolean n = false;
    private String o;

    public fxR(fxP fxP2, fxQ fxQ2) {
        super(fxP2, fxQ2, true);
        this.a(ane_2.c);
    }

    public ayo_2 j() {
        return this.k;
    }

    public void a(ayo_2 ayo_22) {
        if (this.k != null) {
            this.k.a((ays_2)null);
        }
        this.k = ayo_22;
    }

    public int k() {
        if (this.n) {
            return this.l;
        }
        if (this.k != null) {
            return this.k.e();
        }
        return 0;
    }

    public void c(int n) {
        this.l = n;
        this.n = true;
    }

    public int l() {
        if (this.n) {
            return this.m;
        }
        if (this.k != null) {
            return this.k.d();
        }
        return 0;
    }

    public void d(int n) {
        this.m = n;
        this.n = true;
    }

    @Override
    public int f() {
        return 1;
    }

    @Override
    protected void a(StringBuilder stringBuilder) {
        super.a(stringBuilder);
        if (this.l != 0) {
            fxR.a(stringBuilder, b, this.l);
        }
        if (this.m != 0) {
            fxR.a(stringBuilder, c, this.m);
        }
        if (this.j != null) {
            fxR.a(stringBuilder, d, this.j);
        }
    }

    @Override
    protected void a(String string, String string2) {
        super.a(string, string2);
        if (string2 != null) {
            Object object;
            Matcher matcher;
            Matcher matcher2;
            Matcher matcher3 = f.matcher(string2);
            if (matcher3.find()) {
                this.c(Integer.valueOf(matcher3.group(1)));
            }
            if ((matcher2 = g.matcher(string2)).find()) {
                this.d(Integer.valueOf(matcher2.group(1)));
            }
            if ((matcher = h.matcher(string2)).find()) {
                object = matcher.group(1);
                ays_2 ays_22 = fdo_2.b().a((String)object);
                if (ays_22 != null) {
                    this.a(new ayo_2(ays_22));
                    this.j = object;
                }
            }
            if (((Matcher)(object = i.matcher(string2))).find()) {
                this.o = ((Matcher)object).group(1);
            }
        }
    }

    public String m() {
        return this.o;
    }

    @Override
    public boolean a(int n) {
        return true;
    }

    @Override
    public boolean a(int n, int n2) {
        return true;
    }

    @Override
    public boolean b(int n) {
        return true;
    }

    @Override
    public boolean a(Matcher matcher, ArrayList<fxQ> arrayList) {
        int n = arrayList.size();
        boolean bl = super.a(matcher, arrayList);
        if (this.j == null) {
            return false;
        }
        arrayList.add(n, this);
        return bl;
    }

    @Override
    protected String a() {
        return a;
    }

    @Override
    public String d() {
        return "";
    }

    @Override
    public void i() {
        if (this.k != null) {
            this.k.a((ays_2)null);
        }
    }
}

