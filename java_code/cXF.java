/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.WakfuClient;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;

public final class cXF
implements ahr_1 {
    private static final Logger a = Logger.getLogger(cXF.class);
    private static final cXF b = new cXF();
    static final Pattern c = Pattern.compile("(.*)\\.log(\\.\\d)?");
    private static BufferedImage d;

    public static cXF a() {
        return b;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17466: {
                String string = WakfuClient.a.j();
                File file = new File(string);
                if (!file.exists()) {
                    file.mkdirs();
                }
                Date date = new Date();
                String string2 = "" + (date.getYear() + 1900) + (Serializable)(date.getMonth() < 9 ? "0" + (date.getMonth() + 1) : Integer.valueOf(date.getMonth() + 1)) + (Serializable)(date.getDate() < 10 ? "0" + date.getDate() : Integer.valueOf(date.getDate())) + "_" + (Serializable)(date.getHours() < 10 ? "0" + date.getHours() : Integer.valueOf(date.getHours())) + (Serializable)(date.getMinutes() < 10 ? "0" + date.getMinutes() : Integer.valueOf(date.getMinutes())) + (Serializable)(date.getSeconds() < 10 ? "0" + date.getSeconds() : Integer.valueOf(date.getSeconds()));
                File file2 = new File(file, string2 = string2 + ".zip");
                if (file2.exists()) {
                    file2.delete();
                }
                if (this.a(file2)) {
                    String string3 = null;
                    try {
                        string3 = file2.getCanonicalPath();
                    }
                    catch (IOException iOException) {
                        string3 = file2.getAbsolutePath();
                    }
                    string3 = string3.replace("\\", "\\\\");
                    String string4 = bae.h().f().i();
                    String string5 = String.format(azs_0.a().a("bugReport.url", ""), string4);
                    String string6 = bae.h().a("bug.report.message", "<b>" + file2.getName() + "</b>", "<b>" + string3 + "</b>", "<b>" + string5 + "</b>");
                    fzm_0 fzm_02 = fpm_0.b().a(string6, cfn_0.a(0), 10265L, 102, 1);
                    fzm_02.a(new cxg_0(this, string5));
                } else {
                    fpm_0.b().a(bae.h().a("bug.report.message.error", new Object[0]), cfn_0.a(1), 515L, 102, 1);
                }
                return false;
            }
        }
        return true;
    }

    private boolean a(File file) {
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
            DataOutputStream dataOutputStream = new DataOutputStream(zipOutputStream);
            zipOutputStream.putNextEntry(new ZipEntry("account.txt"));
            this.a(dataOutputStream);
            dataOutputStream.flush();
            zipOutputStream.closeEntry();
            zipOutputStream.putNextEntry(new ZipEntry("system.txt"));
            this.c(dataOutputStream);
            dataOutputStream.flush();
            zipOutputStream.closeEntry();
            this.a(zipOutputStream, dataOutputStream);
            if (d != null) {
                zipOutputStream.putNextEntry(new ZipEntry("screenshot.jpg"));
                this.b(dataOutputStream);
                dataOutputStream.flush();
                zipOutputStream.closeEntry();
            }
            dataOutputStream.close();
            zipOutputStream.close();
        }
        catch (Exception exception) {
            a.error((Object)("Error during creating bug report file at location: " + file.getAbsolutePath()), (Throwable)exception);
            return false;
        }
        return true;
    }

    private void a(DataOutputStream dataOutputStream) {
        String string = "";
        long l = 0L;
        String string2 = "";
        ans_0.D();
        azu_0 azu_02 = ans_0.F();
        if (azu_02 != null) {
            string = azr_0.a().n();
            bai_0 bai_02 = azu_02.n();
            if (bai_02 != null) {
                l = bai_02.u();
                string2 = bai_02.r();
            }
        }
        long l2 = 0L;
        String string3 = "";
        int n = 0;
        int n2 = 0;
        short s2 = 0;
        long l3 = 0L;
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 != null) {
            l2 = bmr_12.a_();
            string3 = bmr_12.gd();
            n = bmr_12.G();
            n2 = bmr_12.H();
            s2 = bmr_12.I();
            l3 = bmr_12.T_();
        }
        Object GP = ans_0.D().h();
        String string4 = "==========================\n= Informations de compte =\n==========================\n\nCompte Ankama Games : \n\tCompte : " + l + "\n\tNom de compte : " + string2 + "\n\nCompte Wakfu : \n\tServeur : " + string + "\n\tPersonnage : " + l2 + "\n\tNom du personnage : " + string3 + "\n\tCoordonn\u00e9es : (" + n + "," + n2 + "," + s2 + ") @" + l3 + "\n\nClient : \n\tVersion : " + epj.g + "\n\tResolution : " + ans_0.D().a().q() + "\n";
        dataOutputStream.writeBytes(string4);
    }

    private void b(DataOutputStream dataOutputStream) {
        ImageIO.write((RenderedImage)d, "jpeg", dataOutputStream);
        d = null;
    }

    private void a(ZipOutputStream zipOutputStream, DataOutputStream dataOutputStream) {
        File[] fileArray;
        File file = this.d();
        if (!file.exists() || !file.isDirectory()) {
            zipOutputStream.putNextEntry(new ZipEntry("logs/"));
            zipOutputStream.closeEntry();
            return;
        }
        for (File file2 : fileArray = file.listFiles(new cxh_0(this))) {
            zipOutputStream.putNextEntry(new ZipEntry("logs/" + file2.getName()));
            this.a(file2, dataOutputStream);
            dataOutputStream.flush();
            zipOutputStream.closeEntry();
        }
    }

    private File d() {
        String string = WakfuClient.a.a();
        return new File(string, "logs");
    }

    private void a(File file, DataOutputStream dataOutputStream) {
        int n;
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] byArray = new byte[1024];
        while ((n = fileInputStream.read(byArray)) > 0) {
            dataOutputStream.write(byArray, 0, n);
        }
        fileInputStream.close();
    }

    private void c(DataOutputStream dataOutputStream) {
        dataOutputStream.writeBytes(this.e());
    }

    private String e() {
        Object object;
        Object object2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("=========================\n");
        stringBuilder.append("= Configuration systeme =\n");
        stringBuilder.append("=========================\n");
        stringBuilder.append("\n");
        stringBuilder.append("[Carte graphique] : \n\n");
        try {
            object2 = ans_0.D().e();
            object = ((azu_2)object2).c();
            for (Map.Entry<String, String> entry : ((HashMap)object).entrySet()) {
                stringBuilder.append("\t").append(entry.getKey()).append(" = ").append(entry.getValue()).append("\n");
            }
        }
        catch (Exception exception) {
            stringBuilder.append("\tImpossible d'envoyer la config openGL : GL non r\u00e9cup\u00e9rable\n");
        }
        stringBuilder.append("\n");
        stringBuilder.append("[GL DUMP] : \n\n");
        stringBuilder.append(azr_1.b()).append("\n");
        stringBuilder.append("\n");
        stringBuilder.append("[Syst\u00e8me d'exploitation] : \n\n");
        stringBuilder.append("\tArchitecture : ").append(System.getProperty("os.arch")).append("\n");
        stringBuilder.append("\tNom : ").append(System.getProperty("os.name")).append("\n");
        stringBuilder.append("\tVersion : ").append(System.getProperty("os.version")).append("\n");
        stringBuilder.append("\tPatch Level : ").append(System.getProperty("sun.os.patch.level")).append("\n");
        stringBuilder.append("\n");
        object2 = ManagementFactory.getMemoryMXBean();
        stringBuilder.append("[M\u00e9moire Syst\u00e8me]\n\n");
        stringBuilder.append("\tTotal : ").append(Runtime.getRuntime().totalMemory()).append("\n");
        stringBuilder.append("\tMax : ").append(Runtime.getRuntime().maxMemory()).append("\n");
        stringBuilder.append("\tFree : ").append(Runtime.getRuntime().freeMemory()).append("\n");
        stringBuilder.append("\n");
        stringBuilder.append("[Java Virtual Machine]\n\n");
        stringBuilder.append("\tConstructeur : ").append(System.getProperty("java.vm.vendor")).append("\n");
        stringBuilder.append("\tNom : ").append(System.getProperty("java.vm.name")).append("\n");
        stringBuilder.append("\tVersion : ").append(System.getProperty("java.vm.version")).append("\n");
        stringBuilder.append("\n");
        object = ManagementFactory.getRuntimeMXBean();
        long l = object.getUptime();
        if (l == 0L) {
            l = 1L;
        }
        stringBuilder.append("[Java Runtime]\n\n");
        stringBuilder.append("\tNom : ").append(System.getProperty("java.runtime.name")).append("\n");
        stringBuilder.append("\tVersion : ").append(System.getProperty("java.runtime.version")).append("\n");
        stringBuilder.append("\n");
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        long[] lArray = threadMXBean.getAllThreadIds();
        long l2 = 0L;
        long l3 = 0L;
        stringBuilder.append("[Runtime Threads]\n\n");
        for (long l4 : lArray) {
            ThreadInfo threadInfo = threadMXBean.getThreadInfo(l4);
            if (threadInfo == null) continue;
            long l5 = threadMXBean.isThreadCpuTimeSupported() ? threadMXBean.getThreadUserTime(l4) : 0L;
            long l6 = threadMXBean.isThreadCpuTimeSupported() ? threadMXBean.getThreadCpuTime(l4) : -1L;
            l2 += l5;
            l3 += l3;
            stringBuilder.append("\t[[Thread ").append(l4).append("]]\n");
            stringBuilder.append("\t\tNom : ").append(threadInfo.getThreadName()).append("\n");
            stringBuilder.append("\t\tUser Time : ").append(l5).append(" (").append(l5 / (l * 10000L)).append("%)\n");
            stringBuilder.append("\t\tCPU : ").append(l6).append(" (").append(l6 / (l * 10000L)).append("%)\n");
        }
        stringBuilder.append("[Thread Total]\n");
        stringBuilder.append("\tUser Time : ").append(l2).append(" (").append(l2 / (l * 10000L)).append("%)\n");
        stringBuilder.append("\tCPU : ").append(l3).append(" (").append(l3 / (l * 10000L)).append("%)\n");
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public static void c() {
        try {
            Rectangle rectangle = ans_0.D().a().h();
            Robot robot = new Robot();
            d = robot.createScreenCapture(rectangle);
        }
        catch (AWTException aWTException) {
            d = null;
        }
    }
}

