/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eWi
 */
class ewi_1
implements Runnable {
    final /* synthetic */ ewg_1 a;

    ewi_1(ewg_1 ewg_12) {
        this.a = ewg_12;
    }

    @Override
    public void run() {
        this.a.b.scrollRectToVisible(this.a.b.getCellRect(this.a.b.getRowCount() - 1, 0, false));
        this.a.b.repaint();
    }
}

