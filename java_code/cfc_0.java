/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.client.friends.AvatarImageLoad
 *  com.ankamagames.steam.client.friends.AvatarType
 */
import com.ankamagames.steam.client.friends.AvatarImageLoad;
import com.ankamagames.steam.client.friends.AvatarType;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

/*
 * Renamed from cFc
 */
class cfc_0
extends AvatarImageLoad {
    private ays_2 a;

    cfc_0() {
        super(bPL.a.f(), AvatarType.MEDIUM);
    }

    public void onImageLoaded(int n, int n2, int n3, short[] sArray) {
        ado_1.a().a(() -> {
            WritableRaster writableRaster = Raster.createInterleavedRaster(1, n2, n3, 4, null);
            writableRaster.setDataElements(0, 0, n2, n3, sArray);
            BufferedImage bufferedImage = new BufferedImage(n2, n3, 2);
            bufferedImage.setData(writableRaster);
            azk_2 azk_22 = azk_2.a(bufferedImage);
            ays_2 ays_22 = ayu_2.a().b((aui_2)auj_1.a.a(), (long)auc_1.d("SteamAvatar-" + n), azk_22, true);
            azk_22.u();
            this.a = ays_22;
            fis_1.a().a((ajf_1)cfd_0.a, "avatarIconUrl");
        });
    }

    public boolean a() {
        return this.a != null;
    }

    public ays_2 b() {
        return this.a;
    }
}

