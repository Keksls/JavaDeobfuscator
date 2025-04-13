/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public class fqv
extends fbn_2
implements abq_1,
ayp_2 {
    private static final Logger v = Logger.getLogger(fqv.class);
    public static final String TAG = "pixmap";
    private ayo_2 w;
    private String x;
    private frk_0 y = frk_0.i;
    private boolean z = false;
    private static final ObjectPool A = new abm_1(new fqw(), 10000);
    public static final int a = -1221029593;
    public static final int b = 113126854;
    public static final int c = 120;
    public static final int d = 121;
    public static final int e = 3373707;
    public static final int f = -1417816805;
    public static final int g = 0x2C929929;
    public static final int h = -40300674;
    public static final int i = -1344730584;
    public static final int j = 1582813654;

    public static fqv checkOut() {
        fqv fqv2;
        try {
            fqv2 = (fqv)A.borrowObject();
            fqv2.m_currentPool = A;
        }
        catch (Exception exception) {
            v.error((Object)"Probl\u00e8me au borrowObject.");
            fqv2 = new fqv();
            fqv2.onCheckOut();
        }
        return fqv2;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public String getName() {
        return this.x;
    }

    public void setName(String string) {
        this.x = string;
    }

    public void setX(int n) {
        if (this.w != null) {
            this.w.a(n);
            this.setNeedsToPreProcess();
        }
    }

    public int getX() {
        if (this.w != null) {
            return this.w.f();
        }
        return 0;
    }

    public void setY(int n) {
        if (this.w != null) {
            this.w.b(n);
            this.setNeedsToPreProcess();
        }
    }

    public int getY() {
        if (this.w != null) {
            return this.w.g();
        }
        return 0;
    }

    public void setWidth(int n) {
        if (this.w == null) {
            return;
        }
        this.w.c(n);
        this.z = true;
        this.setNeedsToPreProcess();
        this.w.c(n == -1);
    }

    public int getWidth() {
        if (this.w != null) {
            return this.w.e();
        }
        return 0;
    }

    public void setHeight(int n) {
        if (this.w != null) {
            this.w.d(n);
            this.z = true;
            this.setNeedsToPreProcess();
            this.w.c(n == -1);
        }
    }

    public int getHeight() {
        if (this.w != null) {
            return this.w.d();
        }
        return 0;
    }

    public int getOrientedHeight() {
        if (this.getRotation().a()) {
            return this.getWidth();
        }
        return this.getHeight();
    }

    public int getOrientedWidth() {
        if (this.getRotation().a()) {
            return this.getHeight();
        }
        return this.getWidth();
    }

    public void setFlipHorizontaly(boolean bl) {
        if (this.w != null && this.w.l() != bl) {
            this.w.b(bl);
            this.setNeedsToPreProcess();
        }
    }

    public void setFlipVerticaly(boolean bl) {
        if (this.w != null && this.w.m() != bl) {
            this.w.a(bl);
            this.setNeedsToPreProcess();
        }
    }

    public void setRotation(avg_1 avg_12) {
        if (this.w != null && this.w.n() != avg_12) {
            this.w.a(avg_12);
            this.setNeedsToPreProcess();
        }
    }

    public avg_1 getRotation() {
        if (this.w != null) {
            return this.w.n();
        }
        return null;
    }

    public void setTexture(ays_2 ays_22) {
        if (this.w == null) {
            return;
        }
        if (this.w.o()) {
            ays_2 ays_23 = this.w.a();
            if (ays_22 != null || ays_23 != null) {
                if (ays_22 == null || ays_23 == null) {
                    this.z = true;
                } else {
                    afe_1 afe_12 = ays_22.w();
                    if (afe_12.a() != this.w.c() || afe_12.b() != this.w.b()) {
                        this.z = true;
                    }
                }
            }
        }
        this.w.a(ays_22);
        this.setNeedsToPreProcess();
    }

    public ayo_2 getPixmap() {
        return this.w;
    }

    public void setPixmap(ayo_2 ayo_22) {
        this.w = ayo_22;
    }

    public void setPosition(frk_0 frk_02) {
        this.y = frk_02;
    }

    public frk_0 getPosition() {
        return this.y;
    }

    @Override
    public void setup(fbl_1 fbl_12) {
        if (fbl_12 instanceof fqu) {
            ((fqu)fbl_12).setPixmap(this);
        }
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.w != null && this.w.p()) {
            this.w.q();
        }
        if (this.z) {
            fqu fqu2 = this.getParentOfType(fqu.class);
            if (fqu2 instanceof fsk_0) {
                fqu2.setPixmap(this);
            }
            this.z = false;
        }
        return bl;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.y = null;
        if (this.w != null) {
            this.w.a((ays_2)null);
        }
        this.w = null;
        this.x = null;
    }

    @Override
    public void onCheckOut() {
        assert (this.w == null);
        super.onCheckOut();
        this.w = new ayo_2();
        this.y = frk_0.i;
        this.z = false;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fqv fqv2 = (fqv)fyo2;
        super.copyElement(fqv2);
        fqv2.y = this.y;
        fqv2.setTexture(this.w.a());
        if (!this.w.o()) {
            fqv2.setHeight(this.w.b());
            fqv2.setWidth(this.w.c());
        }
        fqv2.setX(this.w.f());
        fqv2.setY(this.w.g());
        fqv2.setFlipHorizontaly(this.w.l());
        fqv2.setFlipVerticaly(this.w.m());
        fqv2.setRotation(this.w.n());
        fqv2.setName(this.x);
    }

    @Override
    public void a(ayo_2 ayo_22) {
        this.z = true;
        this.setNeedsToPreProcess();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == -1417816805) {
            this.setTexture(fze2.d(string));
        } else if (n == -1221029593) {
            this.setHeight(Co.c(string));
        } else if (n == 113126854) {
            this.setWidth(Co.c(string));
        } else if (n == 120) {
            this.setX(Co.c(string));
        } else if (n == 121) {
            this.setY(Co.c(string));
        } else if (n == 0x2C929929) {
            this.setPosition(frk_0.a(string));
        } else if (n == -40300674) {
            this.setRotation(avg_1.a(string));
        } else if (n == -1344730584) {
            this.setFlipHorizontaly(Co.a(string));
        } else if (n == 1582813654) {
            this.setFlipVerticaly(Co.a(string));
        } else if (n == 3373707) {
            this.setName(string);
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -1417816805) {
            this.setTexture((ays_2)object);
        } else if (n == -1221029593) {
            this.setHeight(Co.c(object));
        } else if (n == 113126854) {
            this.setWidth(Co.c(object));
        } else if (n == 120) {
            this.setX(Co.c(object));
        } else if (n == 121) {
            this.setY(Co.c(object));
        } else if (n == 0x2C929929) {
            this.setPosition((frk_0)((Object)object));
        } else if (n == -40300674) {
            this.setRotation((avg_1)((Object)object));
        } else if (n == -1344730584) {
            this.setFlipHorizontaly(Co.b(object));
        } else if (n == 1582813654) {
            this.setFlipVerticaly(Co.b(object));
        } else if (n == 3373707) {
            this.setName((String)object);
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

