/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import org.apache.log4j.Logger;

/*
 * Renamed from fBC
 */
public class fbc_1
extends fbw_1
implements fqu {
    private static final Logger b = Logger.getLogger(fbc_1.class);
    public static final String TAG = "PixmapBorder";
    private fce_1 h;
    public static final int a = -1156593849;

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
    public void setPixmap(fqv fqv2) {
        fqj fqj2;
        switch (fqv2.getPosition()) {
            case a: {
                this.h.d(fqv2.getPixmap());
                break;
            }
            case c: {
                this.h.b(fqv2.getPixmap());
                break;
            }
            case e: {
                this.h.c(fqv2.getPixmap());
                break;
            }
            case h: {
                this.h.h(fqv2.getPixmap());
                break;
            }
            case j: {
                this.h.a(fqv2.getPixmap());
                break;
            }
            case m: {
                this.h.g(fqv2.getPixmap());
                break;
            }
            case o: {
                this.h.e(fqv2.getPixmap());
                break;
            }
            case q: {
                this.h.f(fqv2.getPixmap());
            }
        }
        if (this.h.o() && (fqj2 = this.getParentOfType(fqj.class)) != null) {
            this.h.b(this.c);
            fqj2.setBorder(this.c);
        }
    }

    public void setPixmaps(ayo_2 ayo_22, ayo_2 ayo_23, ayo_2 ayo_24, ayo_2 ayo_25, ayo_2 ayo_26, ayo_2 ayo_27, ayo_2 ayo_28, ayo_2 ayo_29) {
        this.h.a(ayo_22, ayo_23, ayo_24, ayo_25, ayo_26, ayo_27, ayo_28, ayo_29);
        if (this.h.o()) {
            this.h.b(this.c);
            fqj fqj2 = this.getParentOfType(fqj.class);
            fqj2.setBorder(this.c);
        }
    }

    @Override
    public fce_1 getMesh() {
        return this.h;
    }

    @Override
    public Entity getEntity() {
        return this.h.g();
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
        this.h.a(azj_22);
    }

    @Override
    public azj_2 getModulationColor() {
        return this.h.b();
    }

    @Override
    public boolean isValidAdd(fyo fyo2) {
        if (fyo2 instanceof fqv && ((fqv)fyo2).getPosition() == null) {
            b.error((Object)"Tentative d'ajout d'une Pixmap sans position");
            return false;
        }
        return super.isValidAdd(fyo2);
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fbc_1 fbc_12 = (fbc_1)fyo2;
        fbc_12.setModulationColor(this.getModulationColor());
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.h.h();
        this.h = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.h = new fce_1();
        this.h.i();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n != -1156593849) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setModulationColor(fze2.a(string));
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
}

