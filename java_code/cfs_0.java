/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFs
 */
class cfs_0
extends emi {
    final /* synthetic */ cfr_0 a;

    cfs_0(cfr_0 cfr_02) {
        this.a = cfr_02;
    }

    @Override
    public void b(String string) {
        cfq_0.a.info((Object)"Token obtained from Zaap. Starting autologin");
        emj.a(string);
    }

    @Override
    public void a(String string) {
        cfq_0.a.error((Object)("Error during zaap connection(" + string + ")"));
        emj.b(string);
    }
}

