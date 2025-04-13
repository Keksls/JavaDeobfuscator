/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import org.apache.log4j.Logger;

/*
 * Renamed from fBB
 */
public class fbb_1
extends fbs_2 {
    private static final Logger c = Logger.getLogger(fbb_1.class);
    private fca_1 d;
    public static final int b = -1156593849;

    public void setModulationColor(azj_2 azj_22) {
        this.d.a(azj_22);
    }

    public azj_2 getModulationColor() {
        return this.d.a();
    }

    @Override
    public void setScaled(boolean bl) {
        super.setScaled(bl);
        this.d.a(bl);
    }

    public void setPixmaps(ayo_2 ayo_22, ayo_2 ayo_23, ayo_2 ayo_24, ayo_2 ayo_25, ayo_2 ayo_26, ayo_2 ayo_27, ayo_2 ayo_28, ayo_2 ayo_29, ayo_2 ayo_210, ayo_2 ayo_211, ayo_2 ayo_212, ayo_2 ayo_213, ayo_2 ayo_214, ayo_2 ayo_215, ayo_2 ayo_216, ayo_2 ayo_217, ayo_2 ayo_218) {
        this.d.a(ayo_22, ayo_23, ayo_24, ayo_25, ayo_26, ayo_27, ayo_28, ayo_29, ayo_210, ayo_211, ayo_212, ayo_213, ayo_214, ayo_215, ayo_216, ayo_217, ayo_218);
        if (ayo_22 == null || ayo_23 == null || ayo_24 == null || ayo_25 == null || ayo_26 == null || ayo_27 == null || ayo_28 == null || ayo_29 == null || ayo_210 == null || ayo_211 == null || ayo_212 == null || ayo_213 == null || ayo_214 == null || ayo_215 == null || ayo_216 == null || ayo_217 == null || ayo_218 == null) {
            c.error((Object)"Une des pixmaps pass\u00e9e est nulle !");
        }
    }

    public void setPixmaps(ayo_2[] ayo_2Array) {
        if (ayo_2Array.length == 17) {
            this.d.a(ayo_2Array);
        } else {
            c.error((Object)"La taille du tableau pass\u00e9 en parametre ne correspond pas au nombre de pixmap donc on a besoin!");
        }
        if (ayo_2Array[0] == null || ayo_2Array[1] == null || ayo_2Array[2] == null || ayo_2Array[3] == null || ayo_2Array[4] == null || ayo_2Array[5] == null || ayo_2Array[6] == null || ayo_2Array[7] == null || ayo_2Array[8] == null) {
            c.error((Object)"Une des pixmaps pass\u00e9e est nulle !");
        }
    }

    public void setPixmaps(ayo_2 ayo_22) {
        this.d.a(ayo_22);
        if (ayo_22 == null) {
            c.error((Object)"Une des pixmaps pass\u00e9e est nulle !");
        }
    }

    @Override
    public fca_1 getMesh() {
        return this.d;
    }

    @Override
    public Entity getEntity() {
        return null;
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fby_2 fby_22 = (fby_2)fyo2;
        fby_22.setScaled(this.isScaled());
        fby_22.setModulationColor(this.getModulationColor());
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.d = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.d = new fca_1();
        this.d.i();
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

