/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongByteHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongByteHashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from ezc
 */
public class ezc_1
implements Runnable {
    protected static final Logger a = Logger.getLogger(ezc_1.class);
    public static final ezc_1 b = new ezc_1();
    private static final int c = 30000;
    final TLongByteHashMap d = new TLongByteHashMap();
    private final acp_2<ezd_1> e = new acp_2();
    private boolean f;
    private final ArrayList<ezb_1> g = new ArrayList();

    private ezc_1() {
        eza_1 eza_12 = null;
        for (eza_1 eza_13 : eza_1.values()) {
            if (eza_12 != null) {
                this.e.a(eza_12.b(), new ezd_1(this, eza_12, eza_13));
            }
            eza_12 = eza_13;
        }
        int n = this.e.d();
        for (int k = 0; k < n - 1; ++k) {
            ezd_1 ezd_12 = this.e.c(k);
            ezd_12.a(this.e.c(k + 1));
        }
    }

    public void a() {
        if (this.f) {
            return;
        }
        ado_1.a().a(this, 30000L);
        this.f = true;
    }

    @Override
    public void run() {
        int n = this.e.d();
        for (int k = 0; k < n; ++k) {
            ezd_1 ezd_12 = this.e.c(k);
            ezd_12.b();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ezb_1 ezb_12) {
        ArrayList<ezb_1> arrayList = this.g;
        synchronized (arrayList) {
            this.g.add(ezb_12);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(ezb_1 ezb_12) {
        ArrayList<ezb_1> arrayList = this.g;
        synchronized (arrayList) {
            this.g.remove(ezb_12);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(long l, wu_0 wu_02, wx_0 wx_02) {
        Object object;
        wt_0 wt_02;
        wx_0 wx_03;
        if (!this.f) {
            this.a();
        }
        wt_0 wt_03 = (wx_03 = ezc_1.a(wu_02, wx_02, wt_02 = wc_0.p().j())).e() ? wt_02.b(wx_03) : wt_02;
        byte by = this.d.get(l);
        eza_1 eza_12 = eza_1.a(by);
        if (eza_12 != null) {
            a.warn((Object)"Le compte est d\u00e9j\u00e0 enregistr\u00e9 !");
            object = this.e.e(by);
            ((ezd_1)object).a(l);
        }
        object = eza_1.a(Hw.e(wx_03.g()));
        acp_2<ezd_1> acp_22 = this.e;
        synchronized (acp_22) {
            ezd_1 ezd_12 = this.e.e(((eza_1)((Object)object)).b());
            ezd_12.a(new eze_1(l, wt_03));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(long l) {
        acp_2<ezd_1> acp_22 = this.e;
        synchronized (acp_22) {
            byte by = this.d.remove(l);
            ezd_1 ezd_12 = this.e.e(by);
            if (ezd_12 != null) {
                ezd_12.a(l);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(long l, eza_1 eza_12) {
        ArrayList<ezb_1> arrayList = this.g;
        synchronized (arrayList) {
            for (int k = 0; k < this.g.size(); ++k) {
                ezb_1 ezb_12 = this.g.get(k);
                ezb_12.a(l, eza_12);
            }
        }
    }

    private static wx_0 a(wu_0 wu_02, wx_0 wx_02, wu_0 wu_03) {
        ww_0 ww_02 = wu_02.g(wu_03);
        ww_0 ww_03 = new ww_0(wx_02);
        ww_03.f(ww_02);
        return ww_03;
    }
}

