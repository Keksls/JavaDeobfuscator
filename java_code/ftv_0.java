/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ftV
 */
public class ftv_0
extends fso {
    private static Logger e = Logger.getLogger(ftv_0.class);
    public static final String TAG = "RootContainer";
    protected fso a;
    protected fso b;
    protected fsn_0 c;
    protected final fyS d = new fyS(this);

    @Override
    public void addFromXML(fyb_0 fyb_02) {
        this.a.addFromXML(fyb_02);
    }

    @Override
    public void addFromXML(fyv_0 fyv_02) {
        this.a.addFromXML(fyv_02);
    }

    public void a(fvE fvE2, int n, boolean bl) {
        if (bl) {
            this.a.add(fvE2, n);
        } else {
            super.add(fvE2, n);
        }
    }

    @Override
    public void add(fvE fvE2, int n) {
        this.a(fvE2, n, true);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public fso getContentContainer() {
        return this.a;
    }

    public fsn_0 getLayeredContainer() {
        return this.c;
    }

    public fyS getWindowManager() {
        return this.d;
    }

    public void e() {
        this.c = new fsn_0();
        this.c.onCheckOut();
        this.a = fso.checkOut();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setSize(new fjf_2(100.0f, 100.0f));
        this.a.add(fid_12);
        this.c.a(this.a, -30000);
        super.add(this.c);
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        ftW ftW2 = new ftW(this);
        ftW2.onCheckOut();
        this.add(ftW2);
        this.e();
        this.m_rootFocusContainer = true;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.d.a();
        fyc_0.a().a(this);
    }
}

