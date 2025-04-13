/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.display.AlphaMaskCommand;

/*
 * Renamed from cIv
 */
class civ_0
implements cIW {
    final /* synthetic */ bWe a;
    final /* synthetic */ boolean b;

    civ_0(bWe bWe2, boolean bl) {
        this.a = bWe2;
        this.b = bl;
    }

    @Override
    public void a() {
        ((bvx_0)ans_0.D().h()).a((agp_0)this.a, this.b);
        ajg_1.a().a((ajf_1)ans_0.D().h(), this.a.b());
    }

    @Override
    public void b() {
        boolean bl = ((bvx_0)ans_0.D().h()).a(this.a);
        AlphaMaskCommand.a(bl);
    }
}

