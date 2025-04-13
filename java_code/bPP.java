/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.client.friends.SteamFriendsHandler
 *  com.ankamagames.steam.client.userstats.SteamUserStatsHandler
 *  com.ankamagames.steam.wrapper.CSteamID
 */
import com.ankamagames.steam.client.friends.SteamFriendsHandler;
import com.ankamagames.steam.client.userstats.SteamUserStatsHandler;
import com.ankamagames.steam.wrapper.CSteamID;

public class bPP {
    private CSteamID a;
    private SteamUserStatsHandler b;
    private SteamFriendsHandler c;
    private boolean d;

    public boolean a(CSteamID cSteamID) {
        this.d = true;
        this.a = cSteamID;
        this.b = new SteamUserStatsHandler();
        this.c = new SteamFriendsHandler();
        return this.b.requestUserStats();
    }

    public boolean e() {
        return this.d;
    }

    public CSteamID f() {
        return this.a;
    }

    public SteamUserStatsHandler g() {
        return this.b;
    }

    public SteamFriendsHandler h() {
        return this.c;
    }

    public void i() {
        this.b.cleanUp();
        this.c.cleanUp();
    }
}

