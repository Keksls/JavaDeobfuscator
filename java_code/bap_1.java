/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAP
 */
class bap_1
extends fdt_1 {
    final /* synthetic */ String a;
    final /* synthetic */ ban_1 b;

    bap_1(ban_1 ban_12, String string) {
        this.b = ban_12;
        this.a = string;
    }

    @Override
    public boolean run(fzs fzs2) {
        ado_1.a().b(this.b.L);
        fpm_0.b().o(this.a);
        fta_0.getInstance().getLayeredContainer().removeWidget(this.b.t);
        this.b.L = null;
        return true;
    }
}

