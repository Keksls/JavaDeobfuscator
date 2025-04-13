/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.console.command.debug.CinematicsSelectorCommand;
import com.ankamagames.wakfu.client.console.command.debug.VideoCommand;
import org.apache.log4j.Logger;

@fpw_0
public class cGh {
    public static final String PACKAGE = "wakfu.cinematicsSelector";
    private static final Logger a = Logger.getLogger(cGh.class);

    public static void launchCinematic(fck_2 fck_22, String string) {
        cdx_1 cdx_12 = CinematicsSelectorCommand.c();
        if (cdx_12 == null) {
            return;
        }
        aVk.a.a(string, cdx_12.c(), cdx_12.b());
    }

    public static void toggleDebugMode(fck_2 fck_22) {
        cdx_1 cdx_12 = CinematicsSelectorCommand.c();
        if (cdx_12 == null) {
            return;
        }
        cdx_12.a(!cdx_12.b());
    }

    public static void toggleWithLoadingFrame(fck_2 fck_22) {
        cdx_1 cdx_12 = CinematicsSelectorCommand.c();
        if (cdx_12 == null) {
            return;
        }
        cdx_12.b(!cdx_12.c());
    }

    public static void toggleVideoPlayer(fck_2 fck_22) {
        VideoCommand.b();
    }
}

