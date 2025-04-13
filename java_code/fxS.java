/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  javax.annotation.Nullable
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.base.Strings;
import java.awt.Color;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class fxS
extends fxQ {
    private static final Logger a = Logger.getLogger(fxS.class);
    private static final String b = "text";
    private static final String c = "font";
    private static final String d = "u";
    private static final String e = "b";
    private static final String f = "i";
    private static final String g = "c";
    private static final String h = "name";
    private static final String i = "(name|face)";
    private static final String j = "color";
    private static final String k = "id";
    private static final Pattern l = Pattern.compile("(name|face)=\"([a-zA-Z 0-9-]+)\"");
    private static final Pattern m = Pattern.compile("size=\"([0-9]+)\"");
    private static final Pattern n = Pattern.compile("color=\"([0-9A-Fa-f]{6})\"");
    private static final Pattern o = Pattern.compile("color=\"([0-9A-Za-z]+)\"");
    private static final Pattern p = Pattern.compile("id=\"(([^,]+)|([^,]+\\-[^,]+))\"");
    private String q = null;
    private ayf_2 r;
    private boolean s = false;
    private boolean t = false;
    private Color u;
    private boolean v = false;
    private boolean w = false;

    public fxS(fxP fxP2, fxQ fxQ2, boolean bl) {
        super(fxP2, fxQ2, bl);
        if (!bl) {
            this.a(ane_2.b);
        }
    }

    @Override
    public void a(String string) {
        super.a(this.e(string));
    }

    public int a(String string, int n) {
        String string2 = this.e(string);
        String string3 = this.j();
        String string4 = string3 == null ? "" : string3.substring(0, n);
        String string5 = string3 == null ? "" : string3.substring(n);
        super.a(string4 + string2 + string5);
        return string2.length();
    }

    public void c(String string) {
        this.a(string);
    }

    public String j() {
        return this.d();
    }

    public String k() {
        String string = this.j();
        if (this.c().i()) {
            return Strings.repeat((String)"*", (int)string.length());
        }
        return string;
    }

    public ayf_2 l() {
        return this.r;
    }

    public void a(ayf_2 ayf_22) {
        this.r = ayf_22;
    }

    public Color m() {
        return this.u;
    }

    public void a(Color color) {
        if (color != null) {
            this.u = color;
        }
    }

    public boolean n() {
        return this.v;
    }

    public void a(boolean bl) {
        this.v = bl;
    }

    public boolean o() {
        return this.w;
    }

    public void b(boolean bl) {
        this.w = bl;
    }

    public String p() {
        return this.q;
    }

    public void d(String string) {
        this.q = string;
    }

    @Override
    protected String a() {
        return b;
    }

    @Override
    public int f() {
        return this.j().length();
    }

    @Override
    public boolean a(Matcher matcher, ArrayList<fxQ> arrayList) {
        int n = arrayList.size();
        boolean bl = super.a(matcher, arrayList);
        if (bl && (this.d() == null || this.d().length() == 0)) {
            return false;
        }
        arrayList.add(n, this);
        return bl;
    }

    public String e(String string) {
        return fxS.a(string, this.c().g());
    }

    public static String a(@NotNull String string, @Nullable Pattern pattern) {
        if (pattern == null) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < string.length(); ++k) {
            String string2 = Character.toString(string.charAt(k));
            if (!pattern.matcher(string2).matches()) continue;
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    @Override
    protected void a(StringBuilder stringBuilder) {
        String string;
        super.a(stringBuilder);
        if (this.r != null && (string = this.r.a()) != null) {
            fxS.a(stringBuilder, h, string);
        }
        if (this.u != null) {
            fxS.a(stringBuilder, j, this.u);
        }
        if (this.q != null) {
            fxS.a(stringBuilder, k, this.q);
        }
        if (this.v) {
            fxS.a(stringBuilder, d, this.v);
        }
        if (this.w) {
            fxS.a(stringBuilder, g, this.w);
        }
    }

    @Override
    protected void a(String string, String string2) {
        Matcher matcher;
        Matcher matcher2;
        super.a(string, string2);
        int n = 0;
        fxS fxS2 = (fxS)this.b(ane_2.b);
        if (fxS2 != null) {
            this.s = fxS2.s;
            this.t = fxS2.t;
            this.v = fxS2.v;
            this.w = fxS2.w;
            this.u = fxS2.u;
            this.r = fxS2.r;
            this.q = fxS2.q;
            if (this.s) {
                n |= 1;
            }
            if (this.t) {
                n |= 2;
            }
        }
        ayn_2 ayn_22 = null;
        if (this.c().z() != null) {
            ayn_22 = this.c().z().c();
        }
        if (this.r != null) {
            ayn_22 = this.r.c();
        }
        boolean bl = false;
        if (string2 != null && (matcher2 = l.matcher(string2)).find()) {
            String string3 = matcher2.group(2);
            ayn_22 = ayq_1.a(string3, this.c().j());
            bl = true;
        }
        float f2 = 0.0f;
        boolean bl2 = false;
        if (string2 != null) {
            matcher = m.matcher(string2);
            if (ayn_22 != null && matcher.find()) {
                f2 = Float.parseFloat(matcher.group(1));
                bl2 = true;
            }
        }
        if (ayn_22 != null) {
            if (string2 != null) {
                matcher = fxS.n.matcher(string2);
                if (matcher.find()) {
                    try {
                        int n2 = Integer.valueOf(matcher.group(1), 16);
                        this.a(new Color(n2));
                    }
                    catch (NumberFormatException numberFormatException) {
                        a.warn((Object)("Invalid color in text document : " + matcher.group(1)));
                    }
                } else {
                    Matcher matcher3 = o.matcher(string2);
                    if (matcher3.find()) {
                        String string4 = matcher3.group(1);
                        if (fys_0.a.b(string4)) {
                            azj_2 azj_22 = fys_0.a.a(string4);
                            this.a(new Color(azj_22.c(), azj_22.d(), azj_22.e()));
                        } else {
                            a.warn((Object)("Invalid theme color in text document :" + string4));
                        }
                    }
                }
            }
            n = ayn_22.b();
            boolean bl3 = false;
            if (e.equalsIgnoreCase(string)) {
                this.s = true;
                bl3 = true;
            }
            if (f.equalsIgnoreCase(string)) {
                this.t = true;
                bl3 = true;
            }
            if (bl3) {
                if (this.s) {
                    n |= 1;
                }
                if (this.t) {
                    n |= 2;
                }
            }
            if (!bl2) {
                f2 = ayn_22.a();
            }
            if (bl2 || bl3) {
                ayn_22 = ayn_22.a(n, f2, this.c().j());
                bl = true;
            }
            if (bl) {
                this.a(ayi_2.a(ayn_22));
            }
        }
        if (d.equals(string)) {
            this.a(true);
        }
        if (g.equals(string)) {
            this.b(true);
        }
        if (string2 != null && (matcher = p.matcher(string2)).find()) {
            this.d(String.valueOf(matcher.group(1)));
        }
    }

    @Override
    public boolean a(int n) {
        String string = this.j();
        if (string.length() <= n) {
            return false;
        }
        this.c(string.substring(0, n));
        return this.j().length() == 0;
    }

    @Override
    public boolean a(int n, int n2) {
        String string = this.j();
        if (string == null) {
            return false;
        }
        if (n < 0 || n > string.length() || n2 < 0 || n2 > string.length()) {
            return false;
        }
        this.c(string.substring(0, n) + string.substring(n2));
        return this.j().length() == 0;
    }

    @Override
    public boolean b(int n) {
        this.c(this.j().substring(n));
        return this.j().length() == 0;
    }

    @Override
    public void i() {
    }
}

