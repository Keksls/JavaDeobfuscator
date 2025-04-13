/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.stream.Stream;

/*
 * Renamed from fKG
 */
public class fkg_2
extends fkr_2<fkh_2> {
    private int h = 0;

    public fkg_2(PrintWriter printWriter, String string, String string2) {
        super(printWriter, string, string2);
        this.a(fym_0.class);
        this.a(fyn_0.class);
        this.a(HashMap.class);
        this.a(Stream.class);
        this.e = new fkh_2("init", null);
        this.d.add((fkh_2)this.e);
    }

    @Override
    public void a(fkt_1 fkt_12) {
        if (((fkh_2)this.e).d()) {
            this.k();
            ++this.h;
        }
        super.a(fkt_12);
    }

    public void k() {
        this.a(new fkh_2("init" + this.g++, (fkh_2)this.e));
    }

    @Override
    public void h() {
        fkv_1 fkv_12 = new fkv_1(null, ((fkh_2)this.e).g(), null, new String[0]);
        super.h();
        ((fkh_2)this.e).a(fkv_12);
    }

    @Override
    public void j() {
        for (int k = this.h - 1; k >= 0; --k) {
            this.h();
        }
        for (Object object : this.d) {
            for (fkt_1 fkt_12 : ((fks_1)object).e()) {
                Class<?> clazz = fkt_12.a();
                if (clazz == null) continue;
                this.a(clazz);
            }
        }
        if (this.b != null) {
            this.f.println("package " + this.b + ";");
        }
        this.f.println();
        for (Object object : this.c) {
            this.f.println("import " + ((Class)object).getCanonicalName() + ";");
        }
        this.f.println();
        this.f.println("public class " + this.a + " implements StyleProvider {");
        this.f.println();
        this.f.println("\tprivate HashMap<String, StyleSetter> m_setters = new HashMap<String, StyleSetter>();");
        this.f.println("\tpublic " + this.a + "() {");
        this.f.println("\t\tinit();");
        this.f.println("\t}");
        this.f.println("\tpublic StyleSetter getStyleSetter(String style) {");
        this.f.println("\t\treturn m_setters.get(style);");
        this.f.println("\t}");
        this.f.println();
        this.f.println("\tpublic Stream<String> getWidgetStyleList(final String widgetName) {");
        this.f.println("\t\treturn m_setters.keySet()");
        this.f.println("\t\t\t\t.stream()");
        this.f.println("\t\t\t\t.filter(s -> s.startsWith(widgetName.toUpperCase()))");
        this.f.println("\t\t\t\t.filter(s -> !s.contains(\"$\"))");
        this.f.println("\t\t\t\t.map(s -> s.substring(widgetName.length()));");
        this.f.println("\t}");
        this.f.println();
        for (Object object : this.d) {
            ((fkh_2)object).a(this.f);
            this.f.println();
        }
        this.f.println("}");
        this.f.flush();
    }
}

