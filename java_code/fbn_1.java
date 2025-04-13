/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fBN
 */
public class fbn_1
extends fbs_2
implements fqu {
    private static final Logger f = Logger.getLogger(fbn_1.class);
    public static final String TAG = "TiledPixmapBackground";
    private fcj_1 g = new fcj_1();
    private boolean h = true;
    private boolean i = true;
    private static final ObjectPool j = new abm_1(new fbo_1());
    public static final int b = -1156593849;
    public static final int c = -1984141450;
    public static final int d = 1387629604;

    public static fbn_1 checkOut() {
        fbn_1 fbn_12;
        try {
            fbn_12 = (fbn_1)j.borrowObject();
            fbn_12.m_currentPool = j;
        }
        catch (Exception exception) {
            f.error((Object)"Probl\u00e8me au borrowObject.");
            fbn_12 = new fbn_1();
            fbn_12.onCheckOut();
        }
        return fbn_12;
    }

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fqv) {
            this.setPixmap((fqv)fyb_02);
        }
        super.add(fyb_02);
    }

    @Override
    public void addedToTree() {
        super.addedToTree();
        if (this.m == null) {
            f.warn((Object)"Appearance null !?");
            return;
        }
        fvE fvE2 = this.m.getWidget();
        if (fvE2 == null) {
            f.warn((Object)"Widget null !?");
            return;
        }
        fso fso2 = fvE2.getContainer();
        if (fso2 != null) {
            fso2.setNeedsScissor(true);
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
        this.g.a(azj_22);
    }

    @Override
    public azj_2 getModulationColor() {
        return this.g.a();
    }

    @Override
    public void setPixmap(fqv fqv2) {
        this.g.k(fqv2.getPixmap());
    }

    @Override
    public fcj_1 getMesh() {
        return this.g;
    }

    @Override
    public Entity getEntity() {
        return this.g.g();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.g.h();
        this.g = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.g = new fcj_1();
        this.g.i();
        fyb_0 fyb_02 = this.getParent();
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fbn_1 fbn_12 = (fbn_1)fyo2;
        fbn_12.setScaled(this.isScaled());
        fbn_12.setModulationColor(this.getModulationColor());
        fbn_12.setHorizontal(this.i);
        fbn_12.setVertical(this.h);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == -1156593849) {
            this.setModulationColor(fze2.a(string));
        } else if (n == -1984141450) {
            this.setVertical(Co.a(string));
        } else if (n == 1387629604) {
            this.setHorizontal(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != -1156593849) {
            return super.setPropertyAttribute(n, object);
        }
        this.setModulationColor((azj_2)object);
        return true;
    }

    public void setVertical(boolean bl) {
        if (this.g != null) {
            this.g.d(bl);
        }
        this.h = bl;
    }

    public void setHorizontal(boolean bl) {
        if (this.g != null) {
            this.g.c(bl);
        }
        this.i = bl;
    }
}

