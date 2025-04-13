/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bhG
 */
public class bhg_1
implements ajh_1 {
    private final fja_0 g;
    public static final String a = "contextName";
    public static final String b = "taxValue";
    public static final String d = "taxPercentage";
    public static final String e = "taxPercentageLongDesc";
    public static final String[] f = new String[]{"contextName", "taxValue", "taxPercentage", "taxPercentageLongDesc"};

    public bhg_1(fja_0 fja_02) {
        this.g = fja_02;
    }

    @Override
    public String[] d() {
        return f;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.e();
        }
        if (string.equals(b)) {
            return Float.valueOf(this.g.a() * 100.0f / 5.0f);
        }
        if (string.equals(d)) {
            return this.c();
        }
        if (string.equals(e)) {
            return bae.h().a("protector.tax.longDesc", new ani_2().i().a(14).a((CharSequence)this.c()).j().r());
        }
        return null;
    }

    private String c() {
        return bhg_1.a(this.g);
    }

    private String e() {
        return bhg_1.b(this.g);
    }

    public String a() {
        return bhg_1.c(this.g);
    }

    public fja_0 b() {
        return this.g;
    }

    public static String a(@NotNull fja_0 fja_02) {
        return String.format("%d%%", (int)(fja_02.a() * 100.0f));
    }

    public static String b(@NotNull fja_0 fja_02) {
        return bae.h().a(55, (long)fja_02.b().b, new Object[0]);
    }

    public static String c(@NotNull fja_0 fja_02) {
        return bhg_1.b(fja_02) + " : " + bhg_1.a(fja_02);
    }
}

