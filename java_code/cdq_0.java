/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDQ
 */
public class cdq_0
implements wr_0 {
    public static final cdq_0 a = new cdq_0();
    private int b = -1;

    public void a() {
        this.b = -1;
    }

    @Override
    public void onCalendarEvent(ws_0 ws_02, wq_0 wq_02) {
        int n;
        if (ws_02 == ws_0.a && wq_02.l() && (n = wq_02.a().k()) != this.b) {
            if (this.b != -1) {
                cdw_0.n().a(new cet_0(n));
            }
            this.b = n;
        }
    }
}

