/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.jetbrains.annotations.NotNull;

public class fsb<Content extends fst>
extends fsq_0<Content>
implements faa_1,
fpz_0,
fqf_0,
fqm {
    public static final String a = "selection";
    public static final String TAG = "calendar";
    private static final int g = 7;
    private static final int h = 31;
    private ArrayList<fst> i;
    ArrayList<fsg> j = new ArrayList();
    private fag_2 k = new fag_2();
    Calendar l = new GregorianCalendar();
    int m = 0;
    int n = 0;
    int o;
    int p;
    fjf_2 q;
    private String r = null;
    private fyy_0 s = null;
    private boolean t;
    private boolean u;
    int v = -1;
    int w = -1;
    private Insets x = null;
    private frs_0 y = frs_0.i;
    private ayf_2 z = null;
    private azj_2 A = null;
    private fbz_2 B;
    public static final int b = -917611389;
    public static final int c = 3200366;
    public static final int d = 3617440;
    public static final int e = 342714108;
    public static final int f = "calendar".hashCode();

    @Override
    public void add(fyb_0 fyb_02) {
        super.add(fyb_02);
        if (fyb_02 instanceof faf_2) {
            this.k.a((faf_2)fyb_02);
        }
    }

    @Override
    protected void addInnerMeshes() {
        super.addInnerMeshes();
        if (this.B != null && this.w != -1) {
            this.m_entity.a(this.B.c());
        }
    }

    @Override
    public fqh_0 getAppearance() {
        return (fqh_0)this.m_appearance;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public Calendar getCalendar() {
        return this.l;
    }

    public void setCalendar(Calendar calendar) {
        this.l = calendar;
        this.t = true;
        this.setNeedsToPreProcess();
    }

    public void setCellSize(fjf_2 fjf_22) {
        this.q = fjf_22;
        this.t = true;
        this.setNeedsToPreProcess();
    }

    public fjf_2 getCellSize() {
        return this.q;
    }

    public int getVgap() {
        return this.m;
    }

    public void setVgap(int n) {
        this.m = n;
        this.t = true;
        this.setNeedsToPreProcess();
    }

    public int getHgap() {
        return this.n;
    }

    public void setHgap(int n) {
        this.n = n;
        this.t = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public void setContentProperty(String string, fyy_0 fyy_02) {
        this.r = string;
        this.s = fyy_02;
    }

    @Override
    public void setContent(@NotNull Iterable<Content> iterable, boolean bl) {
        this.i = new ArrayList();
        for (fst fst2 : iterable) {
            this.i.add(fst2);
        }
        this.u = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public Iterable<Content> getUnfilteredContent() {
        return this.i;
    }

    @Override
    public void setFont(ayf_2 ayf_22) {
        if (ayf_22 == this.z) {
            return;
        }
        this.z = ayf_22;
        int n = this.j.size();
        for (int k = 0; k < n; ++k) {
            this.j.get(k).c().setFont(ayf_22);
        }
    }

    @Override
    public void setColor(azj_2 azj_22, String string) {
        if (string == null || string.equals("text")) {
            if (azj_22 == this.A) {
                return;
            }
            this.A = azj_22;
            int n = this.j.size();
            for (int k = 0; k < n; ++k) {
                this.j.get(k).c().setColor(azj_22, "text");
            }
        } else if (string.equals(a)) {
            if (azj_22 != null) {
                if (this.B == null) {
                    this.B = new fbz_2();
                    this.B.i();
                    this.setNeedsToResetMeshes();
                }
                this.B.a(azj_22);
            } else {
                if (this.B != null) {
                    this.B.h();
                }
                this.B = null;
                this.setNeedsToResetMeshes();
            }
        }
    }

    @Override
    public void setAlign(frs_0 frs_02) {
        if (this.y == frs_02) {
            return;
        }
        this.y = frs_02;
        int n = this.j.size();
        for (int k = 0; k < n; ++k) {
            this.j.get(k).c().setAlign(frs_02);
        }
    }

    public Insets getDateMargin() {
        return this.x;
    }

    public void setDateMargin(Insets insets) {
        this.x = insets;
    }

    public int getYearOver() {
        return this.l.get(1);
    }

    public int getMonthOver() {
        return this.l.get(2) + 1;
    }

    public int getDayOver() {
        if (this.w != -1) {
            return this.w + 1;
        }
        return -1;
    }

    void setSelectedDate(int n) {
        this.w = n - 1;
        this.l.set(5, n);
        if (this.B != null) {
            fso fso2 = this.j.get(this.w).b();
            this.B.a(fso2.getPosition(), fso2.getSize(), this.getAppearance().getTotalInsets());
            this.setNeedsToResetMeshes();
        }
    }

    private void b() {
        int n;
        int n2 = this.l.getActualMaximum(5);
        if (n2 > (n = this.j.size())) {
            for (int k = n; k < n2; ++k) {
                fsg fsg2 = new fsg();
                ftj_0 ftj_02 = new ftj_0();
                ftj_02.onCheckOut();
                ftj_02.setNonBlocking(this.m_nonBlocking);
                ftj_02.setRendererManager(this.k);
                fso fso2 = fso.checkOut();
                fic_1 fic_12 = new fic_1();
                fic_12.onCheckOut();
                fso2.add(fic_12);
                fso2.addEventListener(frd_0.y, new fsc_0(this, fsg2), false);
                fso2.addEventListener(frd_0.z, new fsd(this), false);
                fso2.addEventListener(frd_0.C, new fse_0(this, fsg2), false);
                fid_1 fid_12 = new fid_1();
                fid_12.onCheckOut();
                fid_12.setSize(new fjf_2(100.0f, 100.0f));
                ftj_02.add(fid_12);
                fsM fsM2 = new fsM();
                fsM2.onCheckOut();
                fsM2.setNonBlocking(true);
                fsM2.setFont(this.z);
                fsM2.setColor(this.A, "text");
                fsM2.setAlign(this.y);
                fsM2.c(String.valueOf(k + 1));
                fid_12 = new fid_1();
                fid_12.onCheckOut();
                fid_12.setSize(new fjf_2(100.0f, 100.0f));
                fsM2.add(fid_12);
                if (this.x != null) {
                    fqh_0 fqh_02 = fsM2.getAppearance();
                    fqm_0 fqm_02 = fqm_0.checkOut();
                    fqm_02.setInsets(this.x);
                    ((fqj)fqh_02).add(fqm_02);
                }
                fso2.add(ftj_02);
                fso2.add(fsM2);
                fsg2.a(ftj_02);
                fsg2.a(fso2);
                fsg2.a(fsM2);
                this.j.add(fsg2);
                this.add(fso2);
            }
        } else if (n2 < n) {
            for (int k = n2; k < n; ++k) {
                fsg fsg3 = this.j.remove(this.j.size() - 1);
                fsg3.b().destroySelfFromParent();
            }
            if (this.v >= this.j.size()) {
                this.v = -1;
            }
        }
        this.setSelectedDate(this.l.get(5));
    }

    public void a() {
        Object object;
        int n;
        int n2;
        int[] nArray = new int[this.i.size()];
        int n3 = this.i.size();
        for (n2 = 0; n2 < n3; ++n2) {
            fst fst2 = this.i.get(n2);
            nArray[n2] = fst2.a();
            n = fst2.a() - 1;
            ftj_0 ftj_02 = this.j.get(n).a();
            object = fst2.b();
            ftj_02.setContentProperty(this.r + "#" + n, this.s);
            ftj_02.setContent(object);
        }
        n2 = 0;
        n3 = this.j.size();
        int n4 = 0;
        int n5 = this.i.size();
        for (n = 0; n < n5; ++n) {
            n4 = this.i.get(n).a() - 1;
            while (n2 < n4 && n2 < n3) {
                object = this.j.get(n2).a();
                ((ftj_0)object).setContentProperty(this.r + "#" + n2, this.s);
                ((ftj_0)object).setContent(null);
                ++n2;
            }
            n2 = n4 + 1;
        }
        n = this.i.size() == 0 ? 0 : 1;
        int n6 = this.j.size();
        for (n5 = n4 + n; n5 < n6; ++n5) {
            ftj_0 ftj_03 = this.j.get(n5).a();
            ftj_03.setContentProperty(this.r + "#" + n5, this.s);
            ftj_03.setContent(null);
        }
    }

    private void c() {
        this.o = 7;
        int n = 4;
        int n2 = 3;
        if (n2 > 1) {
            n2 = 2;
        }
        this.p = 4 + n2;
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        boolean bl2 = false;
        if (this.t) {
            this.b();
        }
        if (this.u) {
            this.a();
        }
        if (this.t) {
            this.invalidateMinSize();
        }
        this.t = false;
        this.u = false;
        return bl;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fsb fsb2 = (fsb)fyo2;
        super.copyElement(fsb2);
        fsb2.setAlign(this.y);
        fsb2.setCellSize((fjf_2)this.q.clone());
        fsb2.setCalendar(this.l);
        fsb2.setHgap(this.n);
        fsb2.setVgap(this.m);
        fsb2.setDateMargin(this.x);
        for (int k = fsb2.m_widgetChildren.size() - 1; k >= 0; --k) {
            fvE fvE2 = (fvE)fsb2.m_widgetChildren.get(k);
            fvE2.destroySelfFromParent();
        }
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fsf fsf2 = new fsf(this);
        fsf2.onCheckOut();
        this.add(fsf2);
        fqh_0 fqh_02 = new fqh_0();
        fqh_02.onCheckOut();
        this.add(fqh_02);
        this.l.setTime(new Date());
        this.l.set(5, 1);
        this.c();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        if (this.i != null) {
            this.i.clear();
            this.i = null;
        }
        this.j.clear();
        this.j = null;
        this.q = null;
        this.k = null;
        this.A = null;
        this.y = null;
        this.z = null;
        this.x = null;
        if (this.B != null) {
            this.B.h();
            this.B = null;
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == -917611389) {
            this.setCellSize(fze2.b(string));
        } else if (n == 3200366) {
            this.setHgap(Co.c(string));
        } else if (n == 3617440) {
            this.setVgap(Co.c(string));
        } else if (n == 342714108) {
            this.setDateMargin(fze2.c(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != f) {
            return super.setPropertyAttribute(n, object);
        }
        this.setCalendar((Calendar)object);
        return true;
    }
}

