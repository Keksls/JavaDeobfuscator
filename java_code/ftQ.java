/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ftQ
extends fso
implements fqf_0,
fqm {
    private static Logger b = Logger.getLogger(ftQ.class);
    public static final String TAG = "rollingText";
    private long c;
    static final String[] d = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private static final String e = "text";
    private final ArrayList<ftR> f = new ArrayList();
    private final ArrayList<ftt_0> g = new ArrayList();
    private final ArrayList<ftU> h = new ArrayList();
    boolean i;
    private static final int j = 25;
    private static final float k = 500.0f;
    public static final int a = 2000;
    int l;
    int m;
    int n = -1;
    private ayf_2 o;
    private azj_2 p;
    private boolean q;
    private boolean r;

    @Override
    public void setFont(ayf_2 ayf_22) {
        if (ayf_22 == this.o) {
            return;
        }
        this.o = ayf_22;
        for (ftR ftR2 : this.f) {
            fuk_0 fuk_02 = (fuk_0)ftR2.g().getElementMap().a(e);
            fuk_02.setFont(ayf_22);
        }
    }

    @Override
    public void setColor(azj_2 azj_22, String string) {
        if (string == null || string.equals(e)) {
            if (azj_22 == this.p) {
                return;
            }
            this.p = azj_22;
            for (ftR ftR2 : this.f) {
                fuk_0 fuk_02 = (fuk_0)ftR2.g().getElementMap().a(e);
                fuk_02.setColor(azj_22, e);
            }
        }
    }

    private fsQ c() {
        int n = 0;
        int n2 = 0;
        for (String object2 : d) {
            int fip_23 = this.o.a(object2.charAt(0));
            int fqn2 = this.o.c(object2.charAt(0));
            if (fip_23 > n) {
                n = fip_23;
            }
            if (fqn2 <= n2) continue;
            n2 = fqn2;
        }
        fsQ fsQ2 = new fsQ();
        fsQ2.onCheckOut();
        fsQ2.setElementMap(this.m_elementMap);
        fsQ2.setCellSize(new fjf_2(n, n2));
        fsQ2.setAutoIdealSize(true);
        fsQ2.setIdealSizeMinRows(1);
        fsQ2.setIdealSizeMaxRows(1);
        fsQ2.setIdealSizeMinColumns(1);
        fsQ2.setIdealSizeMaxColumns(1);
        fsQ2.setExpandable(false);
        fsQ2.setNonBlocking(false);
        fsQ2.setScrollMode(fqv_0.b);
        fsQ2.setSelectionable(false);
        fsQ2.setScrollBar(false);
        fsQ2.setScrollOnMouseWheel(false);
        fip_2 fip_22 = new fip_2();
        fip_22.onCheckOut();
        fip_22.setAlign(frs_0.e);
        fsQ2.add(fip_22);
        faf_2 faf_22 = new faf_2();
        faf_22.onCheckOut();
        fuk_0 fuk_02 = new fuk_0();
        fuk_02.onCheckOut();
        fuk_02.setElementMap(this.m_elementMap);
        fuk_02.setExpandable(false);
        fip_2 fip_23 = new fip_2();
        fip_23.onCheckOut();
        fip_23.setAlign(frs_0.e);
        fuk_02.add(fip_23);
        if (this.o != null) {
            fqn fqg_02 = new fqn();
            fqg_02.onCheckOut();
            fqg_02.setRenderer(this.o);
            fuk_02.getAppearance().add(fqg_02);
        }
        if (this.p != null) {
            fqg_0 fir_12 = new fqg_0();
            fir_12.onCheckOut();
            fir_12.setColor(this.p);
            fuk_02.getAppearance().add(fir_12);
        }
        fuk_02.setId(e);
        fir_1 fir_12 = new fir_1();
        fir_12.onCheckOut();
        fir_12.setAttribute(e);
        fuk_02.add(fir_12);
        fuk_02.onChildrenAdded();
        faf_22.add(fuk_02);
        faf_22.onChildrenAdded();
        fsQ2.add(faf_22);
        fsQ2.onChildrenAdded();
        fsQ2.setContent(d);
        this.add(fsQ2);
        this.onChildrenAdded();
        return fsQ2;
    }

    public void setNumber(long l) {
        this.c = l;
        int n = String.valueOf(this.c).length();
        if (n != this.m) {
            this.m = n;
            this.l = 2000 / (this.m * 2 - 1);
            this.q = true;
            this.setNeedsToPreProcess();
        }
        this.r = true;
        this.setNeedsToPostProcess();
    }

    private void d() {
        ftR ftR2 = null;
        int n = this.f.size();
        if (!this.f.isEmpty()) {
            ftR2 = this.f.get(n - 1);
        }
        Byte by = Byte.valueOf("" + String.valueOf(this.c).charAt(n));
        try {
            ftR ftR3 = new ftR(this, this.c(), n, ftR2, by);
            this.f.add(ftR3);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public boolean a() {
        if (this.f.isEmpty()) {
            return false;
        }
        if (this.m > this.f.size()) {
            return false;
        }
        ftR ftR2 = this.f.get(this.f.size() - 1);
        this.n = 0;
        if (this.f.size() > 1) {
            ftR2.b();
        } else {
            ftR2.a();
        }
        return true;
    }

    public void b() {
        for (ftR ftR2 : this.f) {
            ftR2.f();
        }
        this.f.clear();
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.q) {
            int n2;
            int n3 = this.f.size();
            for (n2 = 0; n2 < n3; ++n2) {
                ftR ftR2 = this.f.get(n2);
                ftR2.g().destroySelfFromParent();
            }
            this.f.clear();
            for (n2 = 0; n2 < this.m; ++n2) {
                this.d();
            }
            this.q = false;
        }
        return bl;
    }

    @Override
    public boolean postProcess(int n) {
        boolean bl;
        boolean bl2 = super.postProcess(n);
        if (this.r && (bl = this.a())) {
            this.r = false;
        }
        return bl2;
    }

    int getCurrentValue() {
        int n = 0;
        for (ftR ftR2 : this.f) {
            n = (int)((double)n + (double)ftR2.c().byteValue() * Math.pow(10.0, this.f.size() - 1 - ftR2.e()));
        }
        return n;
    }

    public long getTotalDuration() {
        int n = 0;
        for (ftR ftR2 : this.f) {
            byte by = ftR2.d();
            n += this.l * 2 * by;
        }
        return 4000L;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fin_2 fin_22 = new fin_2();
        fin_22.onCheckOut();
        fin_22.setAlign(frs_0.f);
        this.add(fin_22);
        this.r = false;
        this.q = false;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.b();
        this.h.clear();
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public void a(ftt_0 ftt_02) {
        if (!this.g.contains(ftt_02)) {
            this.g.add(ftt_02);
        }
    }

    public void b(ftt_0 ftt_02) {
        this.g.remove(ftt_02);
    }

    void e() {
        for (int k = this.g.size() - 1; k >= 0; --k) {
            this.g.get(k).a();
        }
    }

    public void a(ftU ftU2) {
        if (!this.h.contains(ftU2)) {
            this.h.add(ftU2);
        }
    }

    public void b(ftU ftU2) {
        this.h.remove(ftU2);
    }

    void a(int n) {
        for (int k = this.h.size() - 1; k >= 0; --k) {
            this.h.get(k).a(n);
        }
    }
}

