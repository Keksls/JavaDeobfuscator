/*
 * Decompiled with CFR 0.152.
 */
class ddT
implements ans_1 {
    final /* synthetic */ ddO a;

    ddT(ddO ddO2) {
        this.a = ddO2;
    }

    @Override
    public void dialogUnloaded(String string) {
        this.a.c.remove((Object)string);
        if ("webShopDialog".equals(string)) {
            ado_1.a().b(this.a.n);
        }
        if (this.a.c.isEmpty()) {
            azu_0.j().b(ddO.b);
        }
    }
}

