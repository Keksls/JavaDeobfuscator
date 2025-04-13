/*
 * Decompiled with CFR 0.152.
 */
class aNu
implements wr_0 {
    final /* synthetic */ ans_0 a;

    aNu(ans_0 ans_02) {
        this.a = ans_02;
    }

    @Override
    public void onCalendarEvent(ws_0 ws_02, wq_0 wq_02) {
        if (ws_02 != ws_0.b) {
            return;
        }
        wu_0 wu_02 = wq_02.a();
        new bki_1(wu_02).b(wq_02);
        wq_02.b(this);
    }
}

