/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Snapshot
 *  com.codahale.metrics.Timer
 */
import com.codahale.metrics.Snapshot;
import com.codahale.metrics.Timer;

/*
 * Renamed from aCN
 */
class acn_1
implements Runnable {
    final /* synthetic */ acm_1 a;

    acn_1(acm_1 acm_12) {
        this.a = acm_12;
    }

    @Override
    public void run() {
    }

    private boolean a(String string, Timer timer, Snapshot snapshot) {
        for (int k = 0; k < this.a.e.getRowCount(); ++k) {
            String string2 = (String)this.a.e.getValueAt(k, 0);
            if (!string.equals(string2)) continue;
            this.a.e.setValueAt(string, k, 0);
            this.a.e.setValueAt(timer.getCount(), k, 1);
            this.a.e.setValueAt(timer.getMeanRate(), k, 2);
            this.a.e.setValueAt(timer.getOneMinuteRate(), k, 3);
            this.a.e.setValueAt(timer.getFiveMinuteRate(), k, 4);
            this.a.e.setValueAt(timer.getFifteenMinuteRate(), k, 5);
            this.a.e.setValueAt(snapshot.getMin(), k, 6);
            this.a.e.setValueAt(snapshot.getMax(), k, 7);
            this.a.e.setValueAt(snapshot.getMean(), k, 8);
            this.a.e.setValueAt(snapshot.getStdDev(), k, 9);
            this.a.e.setValueAt(snapshot.getMedian(), k, 10);
            this.a.e.setValueAt(snapshot.get75thPercentile(), k, 11);
            this.a.e.setValueAt(snapshot.get95thPercentile(), k, 12);
            this.a.e.setValueAt(snapshot.get98thPercentile(), k, 13);
            this.a.e.setValueAt(snapshot.get99thPercentile(), k, 14);
            this.a.e.setValueAt(snapshot.get999thPercentile(), k, 15);
            return true;
        }
        return false;
    }
}

