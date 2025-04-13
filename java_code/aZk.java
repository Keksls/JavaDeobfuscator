/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.debug.FlyingImageCommand;
import java.util.HashSet;

public class aZk
implements Runnable {
    final /* synthetic */ FlyingImageCommand a;

    public aZk(FlyingImageCommand flyingImageCommand) {
        this.a = flyingImageCommand;
    }

    @Override
    public void run() {
        fvE fvE2 = (fvE)fpm_0.b().h().d("minimapDialog").a("window");
        if (fvE2 == null) {
            return;
        }
        biI biI2 = azu_0.j().k().bv();
        zr_0 zr_02 = new zr_0(ans_0.D().c(), new fjk_1(fvE2));
        ahs ahs2 = ahs.d();
        zo_0 zo_02 = new zo_0(azs_0.a().a("challengeFlyingImagePath", "defaultIconPath", "challengeProposal"), 32, 32, (zt_0)zr_02, 2000);
        zo_02.a(biI2);
        HashSet<za_0> hashSet = zd_0.a().a(biI2);
        zo_02.g((hashSet != null ? hashSet.size() : 0) * 600);
        zd_0.a().a(zo_02);
    }
}

