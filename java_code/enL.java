/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class enL {
    private static final String b = "Export-Package:";
    public static final String a = "Bundle-RequiredExecutionEnvironment: JavaSE-1.6";
    private String c;
    private String d;
    private String e;
    private Pattern f;
    private final ArrayList<String> g = new ArrayList();
    private final ArrayList<String> h = new ArrayList();
    private final ArrayList<String> i = new ArrayList();

    public void a(String string) {
        this.e = string;
    }

    public void b(String string) {
        this.c = string;
    }

    public void c(String string) {
        this.d = string;
    }

    public void d(String string) {
        String[] stringArray = string.split(",");
        if (stringArray.length == 0) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < stringArray.length; ++k) {
            if (k != 0) {
                stringBuilder.append("|");
            }
            stringBuilder.append(this.e(stringArray[k]));
        }
        this.f = Pattern.compile(stringBuilder.toString());
    }

    private String e(String string) {
        String[] stringArray = string.split("\\.");
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < stringArray.length; ++k) {
            if (k != 0) {
                stringBuilder.append("|");
            }
            for (int i2 = 0; i2 <= k; ++i2) {
                if (i2 != 0) {
                    stringBuilder.append("\\.");
                }
                stringBuilder.append(stringArray[i2]);
            }
        }
        stringBuilder.append("|").append(string.replace(".", "\\.")).append(".*");
        return stringBuilder.toString();
    }

    public void a() {
        File file = new File(this.c);
        if (!file.exists()) {
            System.out.println("Le chemin n'existe pas.");
            return;
        }
        if (!file.isDirectory()) {
            System.out.println("Le chemin n'est pas un r\u00e9pertoire.");
            return;
        }
        this.a(file);
        Collections.sort(this.g);
        this.b();
        try {
            FileWriter fileWriter = new FileWriter(this.d);
            this.a(fileWriter);
            fileWriter.close();
        }
        catch (IOException iOException) {
            System.out.println(iOException.getMessage());
        }
    }

    private void b() {
        try {
            String string;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gi_0.c(this.e)));
            boolean bl = false;
            while ((string = bufferedReader.readLine()) != null) {
                String string2 = string.trim();
                if (string2.startsWith(b)) {
                    bl = true;
                }
                if (!bl && !string.equals(a)) {
                    this.i.add(string);
                    continue;
                }
                bl = string2.endsWith(",");
            }
            bufferedReader.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private void a(File file) {
        File[] fileArray;
        this.h.add(file.getName());
        String string = this.d();
        Matcher matcher = this.f.matcher(string);
        if (!matcher.matches()) {
            this.h.remove(this.h.size() - 1);
            return;
        }
        boolean bl = false;
        for (File file2 : fileArray = file.listFiles()) {
            if (file2.getName().equals(".svn")) continue;
            if (file2.isDirectory()) {
                this.a(file2);
                continue;
            }
            if (bl) continue;
            bl = true;
            this.c();
        }
        this.h.remove(this.h.size() - 1);
    }

    private void c() {
        this.g.add(this.d());
    }

    private String d() {
        StringBuilder stringBuilder = new StringBuilder();
        int n = this.h.size();
        for (int k = 0; k < n; ++k) {
            if (k != 0) {
                stringBuilder.append(".");
            }
            stringBuilder.append(this.h.get(k));
        }
        return stringBuilder.toString();
    }

    private void a(FileWriter fileWriter) {
        try {
            int n;
            int n2 = this.i.size();
            for (n = 0; n < n2; ++n) {
                fileWriter.append(this.i.get(n)).append("\n");
            }
            fileWriter.append(b);
            n2 = this.g.size();
            for (n = 0; n < n2; ++n) {
                fileWriter.append(" ").append(this.g.get(n));
                if (n != n2 - 1) {
                    fileWriter.append(",");
                }
                fileWriter.append("\n");
            }
            fileWriter.append(a).append('\n');
        }
        catch (IOException iOException) {
            System.out.println(iOException.getMessage());
        }
    }

    public static void a(String[] stringArray) {
        if (stringArray.length != 4) {
            System.out.println("Echec de la cr\u00e9ation du manifest : mauvais nombre de param\u00e8tres");
            return;
        }
        enL enL2 = new enL();
        enL2.b(stringArray[0]);
        enL2.d(stringArray[1]);
        enL2.a(stringArray[2]);
        enL2.c(stringArray[3]);
        enL2.a();
    }
}

