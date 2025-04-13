/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * Renamed from fKE
 */
public class fke_2 {
    private final PrintWriter a;
    private final String b;
    private final String c;
    private final List<String> d = new ArrayList<String>();

    public fke_2(PrintWriter printWriter, String string, String string2) {
        this.a = printWriter;
        this.b = string;
        this.c = string2;
    }

    public void a(String string) {
        this.d.add(string);
    }

    public void a() {
        if (this.c != null) {
            this.a.println("package " + this.c + ";");
        }
        this.a.println();
        this.a.println("import " + Optional.class.getCanonicalName() + ";");
        this.a.println("import " + fzb.class.getCanonicalName() + ";");
        this.a.println();
        this.a.println("public enum " + this.b + " implements " + fzb.class.getSimpleName() + " {");
        this.a.println();
        for (String string : this.d) {
            this.a.println("\t" + string.toUpperCase() + "(\"" + string + "\"),");
        }
        this.a.println("\t// End colors");
        this.a.println("\t;");
        this.a.println();
        this.a.println("\tprivate String m_name;");
        this.a.println();
        this.a.println("\t" + this.b + "(final String name) {");
        this.a.println("\t\tm_name = name;");
        this.a.println("\t}");
        this.a.println();
        this.a.println("\t@Override");
        this.a.println("\tpublic String getName() {");
        this.a.println("\t\treturn m_name;");
        this.a.println("\t}");
        this.a.println();
        this.a.println("\tpublic static Optional<" + this.b + "> fromName(final String name) {");
        this.a.println("\t\tfor (final " + this.b + " value : values()) {");
        this.a.println("\t\t\tif(value.m_name.equals(name)) return Optional.of(value);");
        this.a.println("\t\t}");
        this.a.println("\t\treturn Optional.empty();");
        this.a.println("\t}");
        this.a.println("}");
        this.a.flush();
    }
}

