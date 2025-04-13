/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.StringTokenizer;

public class fyh
implements fzd<Insets> {
    private final Class<Insets> a = Insets.class;

    public Insets a(String string) {
        return this.a(this.a, string);
    }

    public Insets a(Class<? extends Insets> clazz, String string) {
        return this.a(clazz, string, null);
    }

    public Insets a(Class<? extends Insets> clazz, String string, fyy_0 fyy_02) {
        if (string != null && clazz.equals(Insets.class)) {
            StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
            Insets insets = new Insets(0, 0, 0, 0);
            if (stringTokenizer.hasMoreTokens()) {
                insets.top = Co.c(stringTokenizer.nextToken().trim());
            }
            if (stringTokenizer.hasMoreTokens()) {
                insets.bottom = Co.c(stringTokenizer.nextToken().trim());
            }
            if (stringTokenizer.hasMoreTokens()) {
                insets.left = Co.c(stringTokenizer.nextToken().trim());
            }
            if (stringTokenizer.hasMoreTokens()) {
                insets.right = Co.c(stringTokenizer.nextToken().trim());
            }
            return insets;
        }
        return null;
    }

    @Override
    public Class<Insets> a() {
        return this.a;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public String a(fkr_2 fkr_22, fyw_0 fyw_02, Class<? extends Insets> clazz, String string, fya_0 fya_02) {
        Insets insets = this.a(clazz, string);
        fkr_22.a(clazz);
        return "new " + clazz.getSimpleName() + "(" + insets.top + ", " + insets.left + ", " + insets.bottom + ", " + insets.right + ")";
    }

    @Override
    public /* synthetic */ Object b(String string) {
        return this.a(string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string) {
        return this.a(clazz, string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string, fyy_0 fyy_02) {
        return this.a(clazz, string, fyy_02);
    }
}

