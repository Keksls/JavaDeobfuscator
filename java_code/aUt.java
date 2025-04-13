/*
 * Decompiled with CFR 0.152.
 */
final class aUt
implements Runnable {
    private fue_0 b;
    final /* synthetic */ aUr a;

    aUt(aUr aUr2, fue_0 fue_02) {
        this.a = aUr2;
        this.b = fue_02;
    }

    public void a(fue_0 fue_02) {
        this.b = fue_02;
    }

    @Override
    public void run() {
        float f2 = fis_1.a().c("chat.scrollOffset", this.b.getElementMap());
        boolean bl = this.b.c();
        if (bl && f2 == -1.0f) {
            fis_1.a().a("chat.scrollOffset", (Object)Float.valueOf(0.0f), this.b.getElementMap());
        } else if (!bl) {
            fis_1.a().a("chat.scrollOffset", (Object)Float.valueOf(-1.0f), this.b.getElementMap());
        } else if (f2 > 0.0f) {
            cww_0.c().c(aUxx.a().a(this.a).a());
        }
    }
}

