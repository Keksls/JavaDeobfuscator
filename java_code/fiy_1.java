/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fIY
 */
public class fiy_1
extends fyg_0
implements abq_1 {
    private static final Logger e = Logger.getLogger(fiy_1.class);
    public static final String TAG = "Property";
    private String f = null;
    private String g = null;
    private String h = null;
    private boolean i = false;
    private fit_1 j = null;
    private fak_2 k = null;
    private static final ObjectPool l = new abm_1(new fiz_1(), 500);
    public static final int a = 103145323;
    public static final int b = 3373707;
    public static final int c = 13085340;
    public static final int d = 97427706;

    public static fiy_1 checkOut() {
        fiy_1 fiy_12;
        try {
            fiy_12 = (fiy_1)l.borrowObject();
            fiy_12.m_currentPool = l;
        }
        catch (Exception exception) {
            e.error((Object)"Probl\u00e8me au borrowObject.");
            fiy_12 = new fiy_1();
            fiy_12.onCheckOut();
        }
        return fiy_12;
    }

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fak_2) {
            this.k = (fak_2)((Object)fyb_02);
        }
        super.add(fyb_02);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public String getName() {
        return this.f;
    }

    public void setName(String string) {
        this.f = string;
    }

    public void setField(String string) {
        this.g = string;
    }

    public void setAttribute(String string) {
        this.h = string;
    }

    public void setLocal(boolean bl) {
        this.i = bl;
    }

    public fit_1 getProperty() {
        return this.j;
    }

    public void a(fyo fyo2) {
        if (this.j != null && fyo2 != null) {
            this.j.b(new fix_1<fyo>(fyo2, fay_2.c().b(fyo2.getTag()), this.h, this.g, this.k), false);
        }
    }

    public void a() {
        if (this.j == null && this.m_childrenAdded) {
            fzz[] fzzArray;
            fya_0 fya_02;
            this.j = fis_1.a().e(this.f, this.i ? this.m_elementMap : null);
            if (this.j == null) {
                this.j = new fit_1(this.f, this.i ? this.m_elementMap : null);
                fis_1.a().a(this.j);
            }
            if ((fya_02 = this.m_elementMap.a()) == null) {
                fya_02 = fpm_0.b().h();
            }
            if ((fzzArray = fya_02.c()) != null) {
                for (fzz fzz2 : fzzArray) {
                    fzz2.addProperty(this.j);
                }
            }
            fix_1<fyo> fix_12 = new fix_1<fyo>(this.m_basicParent, fay_2.c().b(this.m_basicParent.getTag()), this.h, this.g, this.k);
            this.j.b(fix_12, false);
        }
    }

    @Override
    public void onChildrenAdded() {
        super.onChildrenAdded();
        this.a();
    }

    @Override
    public void addedToTree() {
        super.addedToTree();
        this.a();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.f = null;
        this.g = null;
        this.h = null;
        this.k = null;
        this.j = null;
    }

    @Override
    public void onCheckOut() {
        this.i = false;
        super.onCheckOut();
    }

    @Override
    public void copyElement(fyo fyo2) {
        fiy_1 fiy_12 = (fiy_1)fyo2;
        super.copyElement(fiy_12);
        fiy_12.h = this.h;
        fiy_12.g = this.g;
        fiy_12.f = this.f;
        fiy_12.i = this.i;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 103145323) {
            this.setLocal(Co.a(string));
        } else if (n == 3373707) {
            this.setName(fze2.a(string, this.m_elementMap));
        } else if (n == 13085340) {
            this.setAttribute(fze2.a(string, this.m_elementMap));
        } else if (n == 97427706) {
            this.setField(fze2.a(string, this.m_elementMap));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 103145323) {
            this.setLocal(Co.b(object));
        } else if (n == 3373707) {
            this.setName(String.valueOf(object));
        } else if (n == 13085340) {
            this.setAttribute(String.valueOf(object));
        } else if (n == 97427706) {
            this.setField(String.valueOf(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

