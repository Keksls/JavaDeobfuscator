/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.wrapper.SteamApi
 */
import com.ankamagames.steam.wrapper.SteamApi;

/*
 * Renamed from cXG
 */
class cxg_0
implements fzp_0 {
    final /* synthetic */ String a;
    final /* synthetic */ cXF b;

    cxg_0(cXF cXF2, String string) {
        this.b = cXF2;
        this.a = string;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            if (bPL.a.e()) {
                SteamApi.SteamFriends().ActivateGameOverlayToWebPage(this.a);
            } else if (!aii_1.a(this.a)) {
                fpm_0.b().a(bae.h().a("bug.report.message.error", new Object[0]), cfn_0.a(1), 515L, 102, 1);
            }
        }
    }
}

