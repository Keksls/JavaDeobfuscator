/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class IC
implements FileFilter {
    private final String a;
    private final String b;
    private final ArrayList<String> c;
    private final boolean d;

    public IC(String string, String string2, boolean bl) {
        this.a = string;
        this.b = string2;
        this.c = new ArrayList();
        this.d = bl;
        this.a();
    }

    @Deprecated
    public IC(IC iC, boolean bl) {
        this.a = iC.a;
        this.b = iC.b;
        this.c = iC.c;
        this.d = bl;
    }

    private void a() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(this.a));){
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                this.b(string);
            }
        }
    }

    static String a(String string) {
        return string.replace('\\', '/');
    }

    private void b(String string) {
        String string2 = this.b + "/" + string.replace("*", ".*");
        this.c.add(IC.a(string2));
    }

    @Override
    public boolean accept(File file) {
        String string = IC.a(file.getPath());
        for (String string2 : this.c) {
            if (!Pattern.matches(string2, string)) continue;
            return this.d;
        }
        return !this.d;
    }

    public String toString() {
        return "TextFileFileFilter{m_filterPathName='" + this.a + "', m_srcDir='" + this.b + "', m_acceptedFiles=" + this.c + "}";
    }
}

