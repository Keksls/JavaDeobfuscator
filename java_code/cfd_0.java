/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.client.friends.AvatarImageLoad
 *  com.ankamagames.steam.client.friends.AvatarImageLoader
 *  com.ankamagames.steam.client.friends.SteamFriendsHandler
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.steam.client.friends.AvatarImageLoad;
import com.ankamagames.steam.client.friends.AvatarImageLoader;
import com.ankamagames.steam.client.friends.SteamFriendsHandler;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cFd
 */
public class cfd_0
implements ajh_1 {
    private static final Logger g = Logger.getLogger(cfd_0.class);
    public static final cfd_0 a = new cfd_0();
    public static final String b = "userName";
    public static final String d = "avatarIconUrl";
    public static final String e = "hintActivated";
    public static final String f = "connected";
    private boolean h;
    private boolean i;
    private boolean j;
    private cfc_0 k;

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (b.equals(string)) {
            SteamFriendsHandler steamFriendsHandler = bPL.a.h();
            return steamFriendsHandler != null ? steamFriendsHandler.getPersonaName() : null;
        }
        if (e.equals(string)) {
            return this.h;
        }
        if (f.equals(string)) {
            return this.i;
        }
        if (string.equals(d)) {
            return this.a();
        }
        return null;
    }

    public void a(boolean bl) {
        this.h = bl;
        fis_1.a().a((ajf_1)this, e);
    }

    public void b(boolean bl) {
        this.i = bl;
        fis_1.a().a((ajf_1)this, f);
    }

    private ays_2 a() {
        if (this.k != null && this.k.a()) {
            return this.k.b();
        }
        if (!this.j) {
            try {
                this.k = new cfc_0();
                AvatarImageLoader.INSTANCE.getFriendAvatar((AvatarImageLoad)this.k);
                this.j = true;
            }
            catch (RuntimeException runtimeException) {
                g.error((Object)"Exception during Steam avatar loading", (Throwable)runtimeException);
                this.j = true;
            }
        }
        return null;
    }
}

