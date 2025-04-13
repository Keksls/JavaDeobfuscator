/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from aqJ
 */
public class aqj_2 {
    private static final Logger a = Logger.getLogger(aqj_2.class);
    private final ArrayList<String> b = new ArrayList();

    public aqj_2() {
    }

    public aqj_2(String ... stringArray) {
        this.a(stringArray);
    }

    public aqj_2 a(String ... stringArray) {
        for (String string : stringArray) {
            this.b.add(string);
        }
        return this;
    }

    public aqj_2 a(String string) {
        this.b.add(string);
        return this;
    }

    public aqj_2 a(int n) {
        this.b.add(Integer.toString(n));
        return this;
    }

    public final Process a() {
        return Runtime.getRuntime().exec(aqj_2.a(this.b));
    }

    public final Process b(String string) {
        return this.a(new File(string));
    }

    public final Process a(File file) {
        return Runtime.getRuntime().exec(aqj_2.a(this.b), null, file);
    }

    public static String[] a(ArrayList<String> arrayList) {
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public static String b(ArrayList<String> arrayList) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : arrayList) {
            stringBuilder.append(string).append(' ');
        }
        return stringBuilder.toString().trim();
    }
}

