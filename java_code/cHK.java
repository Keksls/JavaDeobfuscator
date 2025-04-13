/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

@fpw_0
public class cHK {
    protected static final Logger a = Logger.getLogger(cHK.class);
    public static final String PACKAGE = "wakfu.mixDebugger";

    public static void pause(fcp_2 fcp_22) {
        if (fcp_22.j()) {
            dan_0.a().c();
        } else {
            dan_0.a().d();
        }
    }

    public static void chooseSaveDirectory(fzs fzs2) {
        dan_0.a().e();
    }

    public static void save(fzs fzs2) {
        dan_0.a().f();
    }

    public static void setRefreshOn(fzs fzs2) {
        dan_0.a().g().d(true);
    }

    public static void setRefreshOff(fzs fzs2) {
        dan_0.a().g().d(false);
    }

    public static void forceRefresh(fzs fzs2) {
        dan_0.a().a(true);
    }

    public static void selectSoundGroup(fzs fzs2, daw_0 daw_02) {
        fup_0 fup_02 = (fup_0)fzs2.d();
        daw_02.b(fup_02.getSelected());
    }

    public static void selectLogSoundGroup(fzs fzs2, daw_0 daw_02) {
        fup_0 fup_02 = (fup_0)fzs2.d();
        daw_02.a(fup_02.getSelected());
    }
}

