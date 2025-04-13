/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.apache.log4j.Logger;

@fpw_0
public class cJq {
    public static final String PACKAGE = "wakfu.reportBug";
    private static final Logger a = Logger.getLogger(cJq.class);

    public static void closeReportBugDialog(fzs fzs2) {
        if (fzs2.f() == frd_0.C) {
            dfc.d((short)19725);
        }
    }

    public static boolean validateReportBugForm(fzz fzz2) {
        fzz2.a();
        fit_1 fit_12 = fzz2.getProperty("editableBugReport");
        if (fit_12 != null) {
            String string = fit_12.b("title");
            String string2 = fit_12.b("description");
            if (string != null && string.length() >= 5 && string2 != null && string2.length() >= 5) {
                return true;
            }
            fpm_0.b().a(bae.h().a("ReportBug.invalidForm", new Object[0]), cfn_0.a(1), 1027L, 102, 1);
            return false;
        }
        return false;
    }

    public static void sendReportBug(fzs fzs2, fzz fzz2, cCM cCM2) {
        if ((fzs2.f() == frd_0.C || fzs2.f() == frd_0.n && ((fcd_2)fzs2).k() == 10) && fzz2.isValid()) {
            String string;
            BufferedReader bufferedReader;
            File file;
            ajf_1 ajf_12;
            cCM2.i("");
            cCM2.b(0L);
            cCM2.j("");
            ans_0.D();
            azu_0 azu_02 = ans_0.F();
            if (azu_02 != null) {
                cCM2.i(azr_0.a().n());
                ajf_12 = azu_02.n();
                if (ajf_12 != null) {
                    cCM2.b(((emy)((Object)ajf_12)).u());
                    cCM2.j(((emy)((Object)ajf_12)).r());
                }
            }
            cCM2.a(0L);
            cCM2.h("");
            cCM2.a(0);
            cCM2.b(0);
            ajf_12 = azu_0.j().k();
            if (ajf_12 != null) {
                cCM2.a(((epq_2)((Object)ajf_12)).a_());
                cCM2.h(((epq_2)((Object)ajf_12)).gd());
                cCM2.a(((epq_2)((Object)ajf_12)).G());
                cCM2.b(((epq_2)((Object)ajf_12)).H());
            }
            cCM2.a(ans_0.D().a().q());
            cCM2.m(epj.f);
            fit_1 fit_12 = fzz2.getProperty("editableBugReport");
            Object object = "";
            try {
                file = new File(cJq.a("logs/bugsLog.log.1"));
                file.mkdirs();
                bufferedReader = new BufferedReader(new FileReader(file));
                while ((string = bufferedReader.readLine()) != null) {
                    object = (String)object + string;
                }
                bufferedReader.close();
            }
            catch (Exception exception) {
                a.warn((Object)("Ouverture/lecture Log (logs/bugsLog.log.1) n'existe pas, on passe au suivant : " + exception.toString()));
            }
            try {
                file = new File(cJq.a("logs/bugsLog.log"));
                file.mkdirs();
                bufferedReader = new BufferedReader(new FileReader(file));
                while ((string = bufferedReader.readLine()) != null) {
                    object = (String)object + string;
                }
                bufferedReader.close();
            }
            catch (Exception exception) {
                a.warn((Object)("Erreur ouverture/lecture Log (logs/bugsLog.log): " + exception.toString()));
            }
            cCM2.k((String)object);
            dhr dhr2 = new dhr();
            dhr2.a_(19869);
            dhr2.a(cCM2);
            add_2.b().a(dhr2);
        }
    }

    private static String a(String string) {
        String string2 = System.getProperty("preferenceStorePath");
        return Cz.f(string2) ? string : string2 + "/" + string;
    }
}

