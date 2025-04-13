/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiClient
 *  com.ankama.shopi.client.ApiClient
 *  com.ankamagames.steam.client.SteamClient
 *  com.google.inject.Guice
 *  com.google.inject.Injector
 *  com.google.inject.Module
 *  javax.inject.Inject
 *  org.apache.log4j.LogManager
 *  org.apache.log4j.Logger
 *  org.apache.log4j.PropertyConfigurator
 *  org.kohsuke.args4j.CmdLineException
 *  org.kohsuke.args4j.CmdLineParser
 */
package com.ankamagames.wakfu.client;

import com.ankama.haapi.client.okhttp.ApiClient;
import com.ankamagames.steam.client.SteamClient;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import javax.inject.Inject;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

public class WakfuClient {
    public static final Logger b = Logger.getLogger(WakfuClient.class);
    public static WakfuClient a;
    private static ApiClient c;
    private static ApiClient d;
    private static com.ankama.shopi.client.ApiClient e;
    private long f;
    private String g = ".";
    private String h = ".";
    private String i = ".";
    private final aNB j = new aNB();

    @Inject
    WakfuClient() {
        a = this;
        this.f = System.nanoTime();
    }

    public String a() {
        return this.g.endsWith("/") ? this.g : this.g + "/";
    }

    public void b() {
        aek_1.a();
        this.p();
    }

    public static ApiClient c() {
        return d;
    }

    public static ApiClient d() {
        return c;
    }

    public static com.ankama.shopi.client.ApiClient e() {
        return e;
    }

    public void f() {
        this.r();
    }

    public boolean g() {
        if (!eoW.a().d()) {
            fis_1.a().a("steam", (Object)null);
            return false;
        }
        cfd_0.a.b(false);
        fis_1.a().a("steam", cfd_0.a);
        SteamClient steamClient = bPN.a();
        if (steamClient == null) {
            b.fatal((Object)"Impossible de cr\u00e9er le client steam.");
            return false;
        }
        boolean bl = bPN.a(steamClient);
        if (!bl) {
            b.error((Object)"[Steam] Probl\u00e8me \u00e0 l'initialisation du UserContext");
        }
        bPN.b();
        return bl;
    }

    private void p() {
        this.q();
        ans_0 ans_02 = ans_0.D();
        SwingUtilities.invokeLater(new aNp(this, ans_02));
    }

    private void q() {
        fyu.a().a(this.l());
        fyu.a().a(new cbs_2());
        fyu.a(this.l(), this.m());
    }

    private void r() {
        ayu_2.a().a((float)ajh_0.e.getDefaultScreenDevice().getAvailableAcceleratedMemory() / 1024.0f);
        azl_1.a().a("JPG", new azm_1());
        azl_1.a().a("PNG", new azn_2());
        azl_1.a().a("DDSM", new azi_1());
        azl_1.a().a("DDS", new azj_1());
        azl_1.a().a("TGA", new azp_1());
        azl_1.a().a("TGAM", new azo_1());
    }

    public void h() {
        epj.c();
        List<String> list = ManagementFactory.getRuntimeMXBean().getInputArguments();
        for (String string : list) {
            b.info((Object)string);
        }
        b.info((Object)("java.vm.vendor = " + System.getProperty("java.vm.vendor")));
        b.info((Object)("java.runtime.name = " + System.getProperty("java.runtime.name")));
        b.info((Object)("java.vm.name = " + System.getProperty("java.vm.name")));
        b.info((Object)("java.vm.version = " + System.getProperty("java.vm.version")));
        b.info((Object)("java.runtime.version = " + System.getProperty("java.runtime.version")));
        b.info((Object)("os.name = " + System.getProperty("os.name")));
        b.info((Object)("os.arch = " + System.getProperty("os.arch")));
        b.info((Object)("os.version = " + System.getProperty("os.version")));
        b.info((Object)("sun.os.patch.level = " + System.getProperty("sun.os.patch.level")));
        b.info((Object)("user.language = " + System.getProperty("user.language")));
        b.info((Object)("user.country = " + System.getProperty("user.country")));
        b.trace((Object)("Locale: " + Locale.getDefault().getDisplayName()));
        Locale.setDefault(Locale.ENGLISH);
        b.info((Object)("log path=" + this.g));
    }

    public void a(String[] stringArray) {
        Object object;
        String string;
        CmdLineParser cmdLineParser = new CmdLineParser((Object)this.j);
        try {
            cmdLineParser.parseArgument(Arrays.asList(stringArray));
            cmdLineParser.stopOptionParsing();
        }
        catch (CmdLineException cmdLineException) {
            JOptionPane.showMessageDialog(new JFrame(), "Une erreur a \u00e9t\u00e9 d\u00e9tect\u00e9e dans les param\u00e8tres du client. Les param\u00e8tres par d\u00e9faut ont \u00e9t\u00e9 utilis\u00e9s. \n" + cmdLineException.getLocalizedMessage());
        }
        emp.a(this.j);
        if (this.j.d() != null) {
            System.setProperty("wakfu.language", this.j.d());
            Locale.setDefault(Ow.a(this.j.d()).a());
        } else {
            Locale.setDefault(Ow.o.a());
        }
        if (this.j.b() != null) {
            this.g = string = this.j.b();
            this.h = string;
            if (!this.h.endsWith("/")) {
                this.h = this.h + "/";
            }
            this.h = this.h + "report/";
            this.i = string;
            if (!this.i.endsWith("/")) {
                this.i = this.i + "/";
            }
            this.i = this.i + "screenshots/";
            String string2 = string + "/preferences";
            new File(string2).mkdirs();
            System.setProperty("preferenceStorePath", string2);
        }
        this.t();
        cbf_2.a();
        string = this.j.a();
        boolean bl = false;
        if (string != null && (bl = azs_0.a().i(string))) {
            b.info((Object)("Configuration loaded from file set on command line: " + string));
        }
        if (this.j.n() != null) {
            eoW.a(this.j.n());
        }
        fis_1.a().a("partner", (Object)eoW.a().b());
        fis_1.a().a("videoDisabled", aVk.b);
        cbf_2.b();
        if (!bl) {
            object = xf_0.a(this.j.e());
            bl = azs_0.a().i(((xf_0)((Object)object)).a());
            if (bl) {
                b.info((Object)("Configuration loaded for region " + ((Enum)object).name() + " (by country detection for " + this.j.e() + "): " + ((xf_0)((Object)object)).a()));
            }
        }
        if (!bl) {
            b.info((Object)"Loading configuration from default file");
        }
        if (!bl && !azs_0.a().c()) {
            b.fatal((Object)"Echec du chargement de la configuration, WakfuConfiguration introuvable");
            return;
        }
        if (this.j.c() != null) {
            object = this.j.c() + File.separator;
            azs_0.a().b("cacheDirectory", (String)object);
        }
        azs_0.a().b("UPDATER_COMMUNICATION_PORT", this.j.l());
        if (this.j.m() != null) {
            azs_0.a().b("UPDATER_INITIAL_STATE", this.j.m());
        }
        if (this.j.f()) {
            axd_2.a(true);
        }
        if (this.j.g()) {
            aic_0.a.a();
        }
        if (this.j.h()) {
            ago.a.a();
        }
        if (this.j.j()) {
            afe_0.ap = true;
            afe_0.ao = true;
        }
        if (this.j.o()) {
            ans_0.D().d(true);
        }
        if (this.j.t()) {
            fpm_0.b().a(true);
        }
        if (this.j.u()) {
            azu_2.d = true;
        }
        if (this.j.v()) {
            object = this.j.w();
            try {
                File file = new File((String)object);
                if (file.exists() && file.isDirectory()) {
                    b.warn((Object)String.format("Unable to use specified file (%s) for trace opengl calls, file is directory...", object));
                } else {
                    if (file.exists()) {
                        file.delete();
                    }
                    file.createNewFile();
                    azu_2.e = new PrintStream(file);
                }
            }
            catch (IOException iOException) {
                b.warn((Object)String.format("Unable to use specified file (%s) for trace opengl calls", object), (Throwable)iOException);
            }
        }
        WakfuClient.s();
    }

    public static String i() {
        return String.format("Wakfu-client / %s", epj.f);
    }

    private static void s() {
        try {
            String string = WakfuClient.i();
            azs_0 azs_02 = azs_0.a();
            String string2 = azs_02.a("haapiAnkamaUrl");
            d = new ApiClient();
            d.setBasePath(string2);
            d.setUserAgent(string);
            d.setVerifyingSsl(afo_1.a(string2));
            String string3 = azs_02.a("haapiWakfuUrl");
            c = new ApiClient();
            c.setBasePath(string3);
            c.setUserAgent(string);
            c.setVerifyingSsl(afo_1.a(string3));
            String string4 = azs_02.a("shopiUrl");
            e = new com.ankama.shopi.client.ApiClient();
            e.setBasePath(string4);
            e.setUserAgent(string);
            e.setVerifyingSsl(afo_1.a(string4));
        }
        catch (gm_0 gm_02) {
            JOptionPane.showMessageDialog(new JFrame(), "An error occured during configuration of API clients for Haapi and/or Shopi. Please fix your configuration");
            b.error((Object)"[SHOP] Error while setting up API clients for Haapi and/or Shopi", (Throwable)gm_02);
        }
    }

    private void t() {
        Object object;
        Properties properties = new Properties();
        try {
            object = WakfuClient.class.getResourceAsStream("log4j.properties");
            if (object == null) {
                object = new FileInputStream("log4j.properties");
            }
            properties.load((InputStream)object);
            ((InputStream)object).close();
        }
        catch (IOException iOException) {
            System.err.println("Error: Cannot load configuration file");
            iOException.printStackTrace(System.err);
        }
        if (!Cz.f(this.g)) {
            object = properties.propertyNames();
            while (object.hasMoreElements()) {
                String string = (String)object.nextElement();
                if (!string.endsWith(".File")) continue;
                properties.setProperty(string, this.g + "/" + properties.getProperty(string));
            }
        }
        LogManager.resetConfiguration();
        PropertyConfigurator.configure((Properties)properties);
    }

    public static void main(String[] stringArray) {
        Injector injector = Guice.createInjector((Module[])new Module[]{WakfuClient.u()});
        Gy.a().a(injector);
        WakfuClient wakfuClient = (WakfuClient)injector.getInstance(WakfuClient.class);
        wakfuClient.a(stringArray);
        wakfuClient.f();
        wakfuClient.g();
        wakfuClient.h();
        wakfuClient.b();
    }

    private static Module u() {
        return WakfuClient.o().a(new Module[]{new aNz(), new iq_2()});
    }

    public String j() {
        return this.h;
    }

    public String k() {
        return this.i;
    }

    public String l() {
        return this.a() + "themes";
    }

    public String m() {
        return this.a() + "themes/config.properties";
    }

    public aNB n() {
        return this.j;
    }

    public static Gx o() {
        return GH.a();
    }
}

