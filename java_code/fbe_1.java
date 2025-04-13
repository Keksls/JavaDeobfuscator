/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import org.apache.log4j.Logger;

/*
 * Renamed from fBE
 */
public class fbe_1
extends fbw_1
implements fqu {
    private static final Logger b = Logger.getLogger(fbe_1.class);
    private fcc_1 h;
    public static final String TAG = "pixmapBorder16";
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
    public void setModulationColor(azj_2 azj_22) {
        this.h.a(azj_22);
    }

    @Override
    public azj_2 getModulationColor() {
        return this.h != null ? this.h.b() : null;
    }

    @Override
    public void setPixmap(fqv fqv2) {
        this.h.a(fqv2.getPixmap(), fqv2.getPosition());
        this.e = true;
        if (this.h.d()) {
            this.h.b(this.c);
            fqj fqj2 = this.getParentOfType(fqj.class);
            if (fqj2 != null) {
                fqj2.setBorder(this.c);
            }
        }
    }

    public void setPixmaps(ayo_2 ayo_22, ayo_2 ayo_23, ayo_2 ayo_24, ayo_2 ayo_25, ayo_2 ayo_26, ayo_2 ayo_27, ayo_2 ayo_28, ayo_2 ayo_29, ayo_2 ayo_210, ayo_2 ayo_211, ayo_2 ayo_212, ayo_2 ayo_213, ayo_2 ayo_214, ayo_2 ayo_215, ayo_2 ayo_216, ayo_2 ayo_217) {
        this.h.a(ayo_22, ayo_23, ayo_24, ayo_25, ayo_26, ayo_27, ayo_28, ayo_29, ayo_210, ayo_211, ayo_212, ayo_213, ayo_214, ayo_215, ayo_216, ayo_217);
        this.e = true;
        if (this.h.d()) {
            this.h.b(this.c);
            fqj fqj2 = this.getParentOfType(fqj.class);
            fqj2.setBorder(this.c);
        }
    }

    public void setPixmaps(ayo_2[] ayo_2Array) {
        if (ayo_2Array.length == 16) {
            this.h.a(ayo_2Array);
        } else {
            b.error((Object)"La taille du tableau pass\u00e9 en parametre ne correspond pas au nombre de pixmap donc on a besoin!");
        }
        this.e = true;
        if (this.h.d()) {
            this.h.b(this.c);
            fqj fqj2 = this.getParentOfType(fqj.class);
            fqj2.setBorder(this.c);
        }
    }

    @Override
    public fcc_1 getMesh() {
        return this.h;
    }

    @Override
    public Entity getEntity() {
        return this.h.g();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.h = new fcc_1();
        this.h.i();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.h.h();
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

