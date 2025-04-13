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
 * Renamed from fBy
 */
public class fby_2
extends fbs_2
implements fqu {
    private static final Logger d = Logger.getLogger(fby_2.class);
    public static final String TAG = "PixmapBackground";
    private fcb_1 f = new fcb_1();
    private static final ObjectPool g = new abm_1(new fbz_1());
    public static final int b = -1156593849;
    public static final int c = -436781190;

    public static fby_2 checkOut() {
        fby_2 fby_22;
        try {
            fby_22 = (fby_2)g.borrowObject();
            fby_22.m_currentPool = g;
        }
        catch (Exception exception) {
            d.error((Object)"Probl\u00e8me au borrowObject.");
            fby_22 = new fby_2();
            fby_22.onCheckOut();
        }
        return fby_22;
    }

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fqv) {
            this.setPixmap((fqv)fyb_02);
        }
        super.add(fyb_02);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
        this.f.a(azj_22);
    }

    @Override
    public azj_2 getModulationColor() {
        return this.f.a();
    }

    public boolean isRepeated() {
        return this.f.d();
    }

    public void setRepeated(boolean bl) {
        this.f.b(bl);
    }

    @Override
    public void setPixmap(fqv fqv2) {
        switch (fqv2.getPosition()) {
            case a: {
                this.f.d(fqv2.getPixmap());
                break;
            }
            case c: {
                this.f.b(fqv2.getPixmap());
                break;
            }
            case e: {
                this.f.c(fqv2.getPixmap());
                break;
            }
            case h: {
                this.f.h(fqv2.getPixmap());
                break;
            }
            case i: {
                this.f.i(fqv2.getPixmap());
                break;
            }
            case j: {
                this.f.a(fqv2.getPixmap());
                break;
            }
            case m: {
                this.f.g(fqv2.getPixmap());
                break;
            }
            case o: {
                this.f.e(fqv2.getPixmap());
                break;
            }
            case q: {
                this.f.f(fqv2.getPixmap());
            }
        }
    }

    public void setPixmaps(ayo_2 ayo_22, ayo_2 ayo_23, ayo_2 ayo_24, ayo_2 ayo_25, ayo_2 ayo_26, ayo_2 ayo_27, ayo_2 ayo_28, ayo_2 ayo_29, ayo_2 ayo_210) {
        this.f.a(ayo_22, ayo_23, ayo_24, ayo_25, ayo_26, ayo_27, ayo_28, ayo_29, ayo_210);
        if (ayo_22 == null || ayo_23 == null || ayo_24 == null || ayo_25 == null || ayo_26 == null || ayo_27 == null || ayo_28 == null || ayo_29 == null || ayo_210 == null) {
            d.error((Object)"Une des pixmaps pass\u00e9e est nulle !");
        }
    }

    public void setPixmaps(ayo_2[] ayo_2Array) {
        if (ayo_2Array.length == 9) {
            this.f.a(ayo_2Array);
        } else {
            d.error((Object)"La taille du tableau pass\u00e9 en parametre ne correspond pas au nombre de pixmap donc on a besoin!");
        }
        if (ayo_2Array[0] == null || ayo_2Array[1] == null || ayo_2Array[2] == null || ayo_2Array[3] == null || ayo_2Array[4] == null || ayo_2Array[5] == null || ayo_2Array[6] == null || ayo_2Array[7] == null || ayo_2Array[8] == null) {
            d.error((Object)"Une des pixmaps pass\u00e9e est nulle !");
        }
    }

    public void setPixmaps(ayo_2 ayo_22) {
        this.f.j(ayo_22);
        if (ayo_22 == null) {
            d.error((Object)"Une des pixmaps pass\u00e9e est nulle !");
        }
    }

    @Override
    public fcb_1 getMesh() {
        return this.f;
    }

    @Override
    public Entity getEntity() {
        return this.f.g();
    }

    @Override
    public void setScaled(boolean bl) {
        super.setScaled(bl);
        this.f.a(bl);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.f.h();
        this.f = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.f = new fcb_1();
        this.f.i();
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fby_2 fby_22 = (fby_2)fyo2;
        fby_22.setScaled(this.isScaled());
        fby_22.setModulationColor(this.getModulationColor());
        fby_22.setRepeated(this.isRepeated());
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == -1156593849) {
            this.setModulationColor(fze2.a(string));
        } else if (n == -436781190) {
            this.setRepeated(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -1156593849) {
            this.setModulationColor((azj_2)object);
        } else if (n == -436781190) {
            this.setRepeated(Co.b(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

