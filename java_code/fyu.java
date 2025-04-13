/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import org.apache.log4j.Logger;

public final class fyu {
    private static final Logger a = Logger.getLogger(fyu.class);
    private static final fyu b = new fyu();
    private fka_1 c;
    private String d;

    public static fyu a() {
        return b;
    }

    private fyu() {
    }

    public void a(fka_1 fka_12) {
        this.c = fka_12;
    }

    public void a(String string) {
        this.d = string.endsWith("/") ? string : string + "/";
    }

    public String b() {
        return this.a(this.c());
    }

    public List<fje_1> c() {
        fje_1 fje_12;
        if (this.c != null) {
            fje_12 = this.c.a();
        } else {
            a.warn((Object)"[THEME] No theme translator found, using default name");
            fje_12 = new fje_1(null, "No theme");
        }
        if (this.d == null) {
            return fyu.a(fje_12);
        }
        File file2 = new File(this.d);
        String[] stringArray = file2.list((file, string) -> new File(file, string).isDirectory() && string.matches("^theme_[\\w-]{1,20}$"));
        if (stringArray == null) {
            return fyu.a(fje_12);
        }
        ArrayList<fje_1> arrayList = new ArrayList<fje_1>();
        arrayList.add(fje_12);
        for (String string2 : stringArray) {
            fje_1 fje_13;
            ath_2 ath_22;
            File file3 = new File(file2, string2 + "/theme.xml");
            fje_1 fje_14 = new fje_1(string2, string2);
            if (!file3.exists()) {
                fyw_0.a.info("[THEME] Cannot find XML descriptor 'theme.xml' in theme '" + string2 + "'");
                arrayList.add(fje_14);
                continue;
            }
            try {
                ath_22 = fpm_0.b(file3.toURI().toURL());
            }
            catch (Exception exception) {
                a.error((Object)("[THEME] Error while loading and parsing theme.xml in folder '" + string2 + "'"), (Throwable)exception);
                arrayList.add(fje_14);
                continue;
            }
            try {
                String string3 = this.c.a(ath_22.a(), string2);
                fje_13 = new fje_1(string2, string3, this.c.a(ath_22.a(), "description", 300));
            }
            catch (Exception exception) {
                a.error((Object)("[THEME] Error while reading theme.xml in folder '" + string2 + "'"), (Throwable)exception);
                fje_13 = fje_14;
            }
            arrayList.add(fje_13);
        }
        arrayList.sort(fje_1::compareTo);
        fis_1.a().a("themes", arrayList);
        return arrayList;
    }

    private static List<fje_1> a(fje_1 fje_12) {
        fis_1.a().a("themes", List.of(fje_12));
        fis_1.a().a("selectedTheme", fje_12);
        return List.of(fje_12);
    }

    private String a(List<fje_1> list) {
        fit_1 fit_12 = fis_1.a().f("selectedTheme");
        if (fit_12 == null || !(fit_12.f() instanceof fje_1)) {
            a.warn((Object)("[THEME] 'selectedTheme' property is null or has a value it should not have: " + fit_12));
            return null;
        }
        fje_1 fje_12 = (fje_1)fit_12.f();
        if (list == null || !list.contains(fje_12)) {
            return null;
        }
        String string = fje_12.a();
        if (string == null) {
            return null;
        }
        try {
            return new File(this.d + string + "/").toURI().toURL().toString();
        }
        catch (MalformedURLException malformedURLException) {
            a.warn((Object)("[THEME] Error while creating custom theme path '" + this.d + string + "/'"), (Throwable)malformedURLException);
            return "file://" + this.d + string + "/";
        }
    }

    public static void a(String string, String string2) {
        new File(string).mkdirs();
        File file = new File(string2);
        try {
            file.createNewFile();
        }
        catch (IOException iOException) {
            a.error((Object)("[THEME] Error while creating '" + file.getAbsolutePath() + "'"), (Throwable)iOException);
        }
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(file.getAbsolutePath()));
            String string3 = properties.getProperty("selectedTheme");
            fis_1.a().a("selectedTheme", new fje_1(string3, string3));
        }
        catch (IOException iOException) {
            a.error((Object)"[THEME] Error when loading selected theme", (Throwable)iOException);
        }
    }

    public boolean a(String string, String string2, Locale locale) {
        Object object = string.endsWith("/") ? string : string + "/";
        File file = new File((String)object + "theme");
        if (!file.exists() || gi_0.c(file)) {
            return false;
        }
        if (!this.a(locale)) {
            Files.move(file.toPath(), new File((String)object + "theme_old").toPath(), new CopyOption[0]);
            return false;
        }
        String string3 = this.d + "theme_autoGenerated/theme";
        gi_0.a(file, new File(string3), StandardCopyOption.COPY_ATTRIBUTES);
        Files.move(file.toPath(), new File((String)object + "theme_old").toPath(), new CopyOption[0]);
        fje_1 fje_12 = new fje_1("theme_autoGenerated", "theme_autoGenerated");
        fis_1.a().a("selectedTheme", fje_12);
        fyu.a(string2, fje_12);
        return true;
    }

    private boolean a(Locale locale) {
        File file = new File(this.d + "theme_autoGenerated");
        try {
            new File(file, "theme").mkdirs();
            File file2 = new File(file, "theme.xml");
            boolean bl = file2.createNewFile();
            if (bl) {
                this.a(file2.getAbsolutePath(), locale);
                return true;
            }
            return false;
        }
        catch (Exception exception) {
            a.error((Object)"[THEME] Error when creating auto generated theme folder", (Throwable)exception);
            return false;
        }
    }

    private void a(String string, Locale locale) {
        atg_2 atg_22 = atg_2.a();
        ath_2 ath_22 = atg_22.b();
        ath_22.a(new ati_2("theme", null));
        ath_22.a().a(new ati_2("name", this.c.b()));
        ath_22.a().a(new ati_2("author", "WAKFU"));
        DateFormat dateFormat = DateFormat.getDateInstance(3, locale);
        dateFormat.setTimeZone(wt_0.a);
        ath_22.a().a(new ati_2("date", dateFormat.format(new Date(System.currentTimeMillis()))));
        ath_22.a().a(new ati_2("description", this.c.c()));
        atg_22.g(string);
        atg_22.a(ath_22);
    }

    public static void a(String string, fje_1 fje_12) {
        try {
            Properties properties = new Properties();
            if (fje_12.a() != null) {
                properties.setProperty("selectedTheme", fje_12.a());
            }
            properties.store(new FileOutputStream(string), null);
            fis_1.a().a("selectedTheme", fje_12);
        }
        catch (IOException iOException) {
            a.error((Object)"[THEME] Error while saving selected custom theme", (Throwable)iOException);
        }
    }
}

