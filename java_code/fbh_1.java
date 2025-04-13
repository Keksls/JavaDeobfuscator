/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import org.apache.log4j.Logger;

/*
 * Renamed from fBH
 */
public class fbh_1
extends fbw_1
implements fqt {
    private static final Logger b = Logger.getLogger(fbh_1.class);
    public static final String TAG = "PlainBorder";
    private final fcg_1 h = new fcg_1();
    public static final int a = 94842723;

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fqg_0) {
            fyb_02.addEventListener(frd_0.b, new fbi_1(this), false);
            this.setColor((fqg_0)fyb_02);
            this.a((fqg_0)fyb_02);
        }
        super.add(fyb_02);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValidAdd(fyo fyo2) {
        if (fyo2 instanceof fqg_0 && ((fqg_0)fyo2).getColor() == null) {
            b.error((Object)"Tentative d'ajout d'un ColorElement sans couleur");
            return false;
        }
        return super.isValidAdd(fyo2);
    }

    @Override
    public fcg_1 getMesh() {
        return this.h;
    }

    @Override
    public Entity getEntity() {
        return this.h.g();
    }

    public void setColor(fqg_0 fqg_02) {
        this.setColor(fqg_02.getColor());
    }

    public void setColor(azj_2 azj_22) {
        this.h.a(azj_22);
    }

    public azj_2 getColor() {
        return this.h.b();
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
        this.h.b(azj_22);
    }

    @Override
    public azj_2 getModulationColor() {
        return this.h.c();
    }

    protected void a(fqg_0 fqg_02) {
        if (this.m_children == null) {
            return;
        }
        for (int k = this.m_children.size() - 1; k >= 0; --k) {
            fyb_0 fyb_02 = (fyb_0)this.m_children.get(k);
            if (!(fyb_02 instanceof fqg_0)) continue;
            this.destroy(fyb_02);
        }
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fbh_1 fbh_12 = (fbh_1)fyo2;
        fbh_12.setColor(this.h.b());
        fbh_12.setModulationColor(this.getModulationColor());
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.h.h();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.h.i();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n != 94842723) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setColor(fze2.a(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 94842723) {
            if (object != null) {
                this.setColor((azj_2)object);
            }
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

