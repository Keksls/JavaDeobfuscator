/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAQ
 */
class baq_1
implements Runnable {
    final /* synthetic */ ban_1 a;

    baq_1(ban_1 ban_12) {
        this.a = ban_12;
    }

    @Override
    public void run() {
        this.a.t.setText(this.a.ao());
    }
}

