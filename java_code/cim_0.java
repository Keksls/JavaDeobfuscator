/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.display.ShowHideNameOverheadsCommand;

/*
 * Renamed from cIM
 */
class cim_0
implements cIW {
    final /* synthetic */ bWe a;
    final /* synthetic */ bvs_0 b;
    final /* synthetic */ bvs_0 c;

    cim_0(bWe bWe2, bvs_0 bvs_02, bvs_0 bvs_03) {
        this.a = bWe2;
        this.b = bvs_02;
        this.c = bvs_03;
    }

    @Override
    public void a() {
        ((bvx_0)ans_0.D().h()).a((agp_0)this.a, this.b.a());
        if (ShowHideNameOverheadsCommand.b()) {
            dbm_0.a().f();
        }
        aUxx.a().s();
        aUB aUB2 = aUL.a().e();
        for (aUK ajh_12 : aUB2) {
            fis_1.a().a((ajf_1)ajh_12, "characterNameWithLanguages");
        }
        for (byo_2 byo_22 : byp_2.a().s()) {
            fis_1.a().a((ajf_1)byo_22, "name");
        }
    }

    @Override
    public void b() {
        ((bvx_0)ans_0.D().h()).a((agp_0)this.a, this.c.a());
    }
}

