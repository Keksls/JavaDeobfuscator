/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.io.IOException;
import org.apache.log4j.Logger;

public class bWh
implements bWi {
    private static final Logger a = Logger.getLogger(bWh.class);

    @Override
    public void a(aqx_2 aqx_22) {
    }

    @Override
    public bWi a() {
        return new bWh();
    }

    @Override
    public void a(agk_0 agk_02, ajb_1 ajb_12) {
        bWh.a(new File(azr_0.a().l()));
    }

    private static void a(File file) {
        try {
            boolean bl;
            String string = file.getCanonicalPath() + File.separatorChar + "chat.xml";
            File file2 = new File(string);
            if (file2.exists() && !(bl = file2.delete())) {
                a.warn((Object)("Impossible de supprimer " + string));
            }
        }
        catch (IOException iOException) {
            a.warn((Object)"Probl\u00e8me \u00e0 la suppression d'un fichier de chat", (Throwable)iOException);
        }
    }
}

