/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFr
 */
class cfr_0
extends emi {
    cfr_0() {
    }

    @Override
    public void a() {
        cfq_0.a.info((Object)"Connected to Zaap. Starting token fill");
        emj.a.b(new cfs_0(this));
    }

    @Override
    public void a(String string) {
        cfq_0.a.error((Object)("Error during zaap connection(" + string + ")"));
        emj.b(string);
    }
}

