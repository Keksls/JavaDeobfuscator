/*
 * Decompiled with CFR 0.152.
 */
class dcP
implements Runnable {
    final /* synthetic */ dcl_0 a;

    dcP(dcl_0 dcl_02) {
        this.a = dcl_02;
    }

    @Override
    public void run() {
        this.a.e.setX(frs_0.e.a(this.a.e.getWidth(), fta_0.getInstance().getWidth()));
        this.a.e.removeTweensOfType(fjq_2.class);
        this.a.e.addTween(new fjq_2(this.a.e.getX(), this.a.e.getY(), this.a.e.getX(), fta_0.getInstance().getHeight() - this.a.e.getHeight() - 50, this.a.e, 0, 1000, fjw_2.b));
        this.a.e.setVisible(true);
    }
}

