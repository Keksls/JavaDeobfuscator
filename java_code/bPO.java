/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.wrapper.CSteamID
 *  com.ankamagames.steam.wrapper.EResult
 *  org.apache.log4j.Logger
 */
import com.ankamagames.steam.wrapper.CSteamID;
import com.ankamagames.steam.wrapper.EResult;
import org.apache.log4j.Logger;

public class bPO {
    private static final Logger a = Logger.getLogger(bPO.class);

    private bPO() {
    }

    public static void a(String string) {
        bPO.a(null, string, null);
    }

    public static void a(String string, EResult eResult) {
        bPO.a(null, string, eResult);
    }

    public static void a(CSteamID cSteamID, String string) {
        bPO.a(cSteamID, string, null);
    }

    public static void a(CSteamID cSteamID, String string, EResult eResult) {
        StringBuilder stringBuilder = new StringBuilder("[Steam]");
        if (cSteamID != null) {
            stringBuilder.append("[SteamId=").append(cSteamID.ConvertToUint64()).append(']');
        }
        if (eResult != null) {
            stringBuilder.append("[Result=").append(eResult.name()).append(']');
        }
        stringBuilder.append(' ').append(string);
        a.info((Object)stringBuilder.toString());
    }
}

