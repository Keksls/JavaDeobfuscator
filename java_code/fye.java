/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class fye
implements fzd<ayf_2> {
    private static final Logger a = Logger.getLogger(fye.class);
    private final Class<ayf_2> b = ayf_2.class;

    public ayf_2 a(String string) {
        return this.a(this.b, string);
    }

    public ayf_2 a(Class<? extends ayf_2> clazz, String string) {
        return this.a(clazz, string, null);
    }

    public ayf_2 a(Class<? extends ayf_2> clazz, String string, fyy_0 fyy_02) {
        ayn_2 ayn_22;
        if (string == null) {
            return null;
        }
        ayf_2 ayf_22 = fpm_0.b().g().d(string);
        if (ayf_22 == null && (ayn_22 = ayq_1.b(string)) != null) {
            ayf_22 = ayi_2.a(ayn_22);
        }
        return ayf_22;
    }

    @Override
    public Class<ayf_2> a() {
        return this.b;
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
    public String a(fkr_2 fkr_22, fyw_0 fyw_02, Class<? extends ayf_2> clazz, String string, fya_0 fya_02) {
        if (string == null || !clazz.equals(this.b)) {
            return "null";
        }
        String string2 = null;
        ayf_2 ayf_22 = fpm_0.b().g().d(string);
        if (ayf_22 == null) {
            ayn_2 ayn_22 = ayq_1.b(string);
            if (ayn_22 != null) {
                ayf_22 = ayi_2.a(ayn_22);
                fkr_22.a(fpm_0.class);
                string2 = "doc.getFont(\"" + string + "\")";
            }
        } else {
            string2 = "TextRendererLoader.getInstance().loadTextRenderer(\"" + string + "\")";
        }
        return string2 != null ? string2 : "null";
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

