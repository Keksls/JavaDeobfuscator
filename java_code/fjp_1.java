/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJP
 */
public class fjp_1 {
    fsk_0 a;
    final fsk_0 b;

    public static void a(fsk_0 fsk_02) {
        fjp_1 fjp_12 = new fjp_1(fsk_02);
        fjp_12.a();
    }

    private fjp_1(fsk_0 fsk_02) {
        this.a = fsk_02;
        this.b = (fsk_0)fsk_02.cloneElementStructure();
        this.b.setNonBlocking(true);
        this.b.setDisplaySize(null);
        this.b.setScaled(true);
        this.b.setElementMap(null);
        this.b.setId(null);
        fta_0.getInstance().getLayeredContainer().a(this.b, 30000);
    }

    private void a() {
        int n = this.a.getScreenX();
        int n2 = this.a.getScreenY();
        this.b.setPosition(n, n2);
        fjs_1 fjs_12 = new fjs_1(this.b, 3.0f, 0, 250, fjw_2.a);
        fjs_12.b(false);
        fjs_12.d(8);
        this.b.addTween(fjs_12);
        fjs_12.a(new fjq_1(this));
    }

    void b() {
        this.b.setVisible(false);
        ado_1.a().a(new fjr_1(this), 250L, 1);
    }
}

