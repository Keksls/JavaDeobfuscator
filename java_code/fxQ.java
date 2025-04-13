/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.Nullable;

public abstract class fxQ {
    private static final String a = "text";
    private static final String b = "selectableText";
    private static final String c = "image";
    private static final String d = "type";
    private static final String e = "align";
    private static final Pattern f = Pattern.compile("(text|image|selectableText)");
    private static final Pattern g = Pattern.compile("align=\"(west|center|east)\"");
    private ane_2 h = ane_2.a;
    private final boolean i;
    private final fxP j;
    private final fxQ k;
    private fro_0 l = null;
    private String m = null;

    public fxQ(fxP fxP2, fxQ fxQ2, boolean bl) {
        this.j = fxP2;
        this.i = bl;
        this.k = fxQ2;
    }

    protected abstract String a();

    public ane_2 b() {
        return this.h;
    }

    public fxP c() {
        return this.j;
    }

    protected void a(ane_2 ane_22) {
        this.h = ane_22;
    }

    public String d() {
        return this.m;
    }

    public void a(String string) {
        this.m = string != null ? string.intern() : null;
    }

    public fro_0 e() {
        return this.l;
    }

    public void a(fro_0 fro_02) {
        if (fro_02 != null) {
            this.l = fro_02;
        }
    }

    public abstract int f();

    public boolean a(Matcher matcher, ArrayList<fxQ> arrayList) {
        String string = matcher.group(5);
        if (string != null) {
            String string2 = matcher.group(2);
            String string3 = matcher.group(4);
            this.a(string2, string3);
            Matcher matcher2 = fxN.a.matcher(string);
            boolean bl = false;
            while (matcher2.find()) {
                fxQ fxQ2 = ((fxN)this.j).a(matcher2, this, bl);
                if (fxQ2 != this) {
                    bl = true;
                }
                fxQ2.a(matcher2, arrayList);
            }
        } else {
            this.a(this.c(matcher.group(7)));
            this.a((String)null, (String)null);
        }
        return true;
    }

    public final String g() {
        StringBuilder stringBuilder = new StringBuilder(512);
        this.a(stringBuilder);
        if (StringUtils.isEmpty((CharSequence)stringBuilder)) {
            return this.d();
        }
        StringBuilder stringBuilder2 = new StringBuilder("<").append(this.a());
        stringBuilder2.append(stringBuilder.toString()).append('>');
        stringBuilder2.append(this.j());
        stringBuilder2.append("</").append(this.a()).append('>');
        return stringBuilder2.toString();
    }

    protected static void a(StringBuilder stringBuilder, String string, String string2) {
        stringBuilder.append(' ').append(string);
        stringBuilder.append("=\"").append(string2).append('\"');
    }

    protected static void a(StringBuilder stringBuilder, String string, int n) {
        stringBuilder.append(' ').append(string);
        stringBuilder.append("=\"").append(n).append('\"');
    }

    protected static void a(StringBuilder stringBuilder, String string, boolean bl) {
        stringBuilder.append(' ').append(string);
        stringBuilder.append('=').append(bl);
    }

    protected static void a(StringBuilder stringBuilder, String string, Color color) {
        stringBuilder.append(' ').append(string);
        stringBuilder.append("=\"");
        stringBuilder.append(Integer.toHexString(color.getRed() & 0xFF));
        stringBuilder.append(Integer.toHexString(color.getGreen() >> 8 & 0xFF));
        stringBuilder.append(Integer.toHexString(color.getBlue() >> 16 & 0xFF));
        stringBuilder.append('\"');
    }

    private String j() {
        String string = this.d();
        string = StringUtils.replace((String)string, (String)"<", (String)"&lt;");
        string = StringUtils.replace((String)string, (String)">", (String)"&gt;");
        return string;
    }

    private String c(String string) {
        String string2 = string;
        string2 = StringUtils.replace((String)string2, (String)"&lt;", (String)"<");
        string2 = StringUtils.replace((String)string2, (String)"&gt;", (String)">");
        return string2;
    }

    protected void a(StringBuilder stringBuilder) {
        if (this.l != null) {
            fxQ.a(stringBuilder, e, this.l.toString().toLowerCase());
        }
    }

    protected void a(String string, String string2) {
        fro_0 fro_02;
        if (this.k != null) {
            this.l = this.k.l;
        }
        if (string2 == null) {
            return;
        }
        Matcher matcher = g.matcher(string2);
        if (matcher.find() && (fro_02 = fro_0.valueOf(matcher.group(1).toUpperCase())) != null) {
            this.a(fro_02);
        }
    }

    public static ane_2 b(String string) {
        Matcher matcher;
        ane_2 ane_22 = ane_2.b;
        if (string != null && string.length() != 0 && (matcher = f.matcher(string)).find()) {
            ane_22 = ane_2.valueOf(matcher.group(1).toUpperCase());
        }
        return ane_22;
    }

    public abstract boolean a(int var1);

    public abstract boolean b(int var1);

    public abstract boolean a(int var1, int var2);

    public String toString() {
        return this.getClass().getSimpleName() + " data=" + this.d();
    }

    public fxQ h() {
        return this.k;
    }

    @Nullable
    public fxQ b(ane_2 ane_22) {
        if (this.k == null) {
            return null;
        }
        if (this.k.b() == ane_22) {
            return this.k;
        }
        return this.k.b(ane_22);
    }

    public abstract void i();
}

