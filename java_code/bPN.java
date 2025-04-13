/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.client.SteamClient
 *  com.ankamagames.steam.wrapper.CSteamID
 */
import com.ankamagames.steam.client.SteamClient;
import com.ankamagames.steam.wrapper.CSteamID;

public final class bPN {
    private bPN() {
    }

    public static SteamClient a() {
        SteamClient steamClient = new SteamClient();
        if (!steamClient.init(false)) {
            return null;
        }
        ado_1.a().a(() -> ((SteamClient)steamClient).runCallbacks(), 1000L, -1);
        return steamClient;
    }

    public static boolean a(SteamClient steamClient) {
        return bPL.a.a(steamClient);
    }

    public static void b() {
        CSteamID cSteamID = bPL.a.f();
        bPO.a(cSteamID, "");
        bPO.a("Overlay Enabled : " + bPL.a.d());
    }
}

