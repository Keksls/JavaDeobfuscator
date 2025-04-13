/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.display.DisplayHpBarCommand;

/*
 * Renamed from cIw
 */
class ciw_0
implements cIW {
    final /* synthetic */ bvq_0 a;
    final /* synthetic */ bWe b;

    ciw_0(bvq_0 bvq_02, bWe bWe2) {
        this.a = bvq_02;
        this.b = bWe2;
    }

    @Override
    public void a() {
        DisplayHpBarCommand.a(this.a.a());
        ((bvx_0)ans_0.D().h()).a((agp_0)this.b, this.a.a());
        ajg_1.a().a((ajf_1)ans_0.D().h(), this.b.b());
    }

    @Override
    public void b() {
    }
}

