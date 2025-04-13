/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.client.SteamClient
 *  com.ankamagames.steam.client.transaction.SteamMicroTxnResponseHandler
 *  com.ankamagames.steam.client.transaction.SteamTransactionListener
 *  com.ankamagames.steam.client.userstats.SteamUserStatsListener
 *  com.ankamagames.steam.wrapper.EResult
 *  com.ankamagames.steam.wrapper.SteamApi
 *  com.ankamagames.steam.wrapper.UserAchievementStored_t
 *  com.ankamagames.steam.wrapper.UserStatsReceived_t
 *  com.ankamagames.steam.wrapper.UserStatsStored_t
 *  org.apache.log4j.Logger
 */
import com.ankamagames.steam.client.SteamClient;
import com.ankamagames.steam.client.transaction.SteamMicroTxnResponseHandler;
import com.ankamagames.steam.client.transaction.SteamTransactionListener;
import com.ankamagames.steam.client.userstats.SteamUserStatsListener;
import com.ankamagames.steam.wrapper.EResult;
import com.ankamagames.steam.wrapper.SteamApi;
import com.ankamagames.steam.wrapper.UserAchievementStored_t;
import com.ankamagames.steam.wrapper.UserStatsReceived_t;
import com.ankamagames.steam.wrapper.UserStatsStored_t;
import org.apache.log4j.Logger;

public class bPL
extends bPP
implements SteamUserStatsListener {
    private static final Logger b = Logger.getLogger(bPL.class);
    public static final bPL a = new bPL();
    private SteamClient c;
    private SteamMicroTxnResponseHandler d;

    private bPL() {
    }

    public boolean a(SteamClient steamClient) {
        this.c = steamClient;
        boolean bl = this.a(this.c.getSteamId());
        this.g().setListener((SteamUserStatsListener)this);
        cfd_0.a.b(bl);
        this.d = new SteamMicroTxnResponseHandler();
        this.d.setListener((SteamTransactionListener)new bPM(this));
        return bl;
    }

    public SteamClient a() {
        return this.c;
    }

    public String b() {
        return SteamApi.SteamApps().GetCurrentGameLanguage();
    }

    public boolean c() {
        return this.g().resetUserStats();
    }

    public boolean a(String string, int n) {
        return this.g().setStat(string, n);
    }

    public boolean d() {
        return SteamApi.SteamUtils().IsOverlayEnabled();
    }

    public void onUserStatsReceived(UserStatsReceived_t userStatsReceived_t) {
        bPO.a(userStatsReceived_t.getM_steamIDUser(), "UserStatsReceived", userStatsReceived_t.getM_eResult());
        if (userStatsReceived_t.getM_eResult() != EResult.k_EResultOK) {
            this.g().requestUserStats();
        }
    }

    public void onUserStatsStored(UserStatsStored_t userStatsStored_t) {
        bPO.a(this.f(), "UserStatsStored GameId=" + userStatsStored_t.getM_nGameID().longValue(), userStatsStored_t.getM_eResult());
    }

    public void onUserAchievementStored(UserAchievementStored_t userAchievementStored_t) {
        bPO.a(this.f(), "Achievement stored : " + userAchievementStored_t.getM_rgchAchievementName());
    }

    public String toString() {
        return "SteamClientContext{m_client=" + this.c + "}";
    }
}

