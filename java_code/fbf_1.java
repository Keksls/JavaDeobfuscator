/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import org.apache.log4j.Logger;

/*
 * Renamed from fBF
 */
public class fbf_1
extends fbs_2
implements fqt {
    private static final Logger c = Logger.getLogger(fbf_1.class);
    public static final String TAG = "PlainBackground";
    private fcf_1 d;
    public static final int b = 94842723;

    @Override
    public void addFromXML(fyb_0 fyb_02) {
        super.addFromXML(fyb_02);
    }

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fqg_0) {
            fyb_02.addEventListener(frd_0.b, new fbg_1(this), false);
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
    public void copyElement(fyo fyo2) {
        fbf_1 fbf_12 = (fbf_1)fyo2;
        fbf_12.setColor(this.getColor());
        super.copyElement(fyo2);
    }

    public void setColor(fqg_0 fqg_02) {
        this.setColor(fqg_02.getColor());
    }

    public void setColor(azj_2 azj_22) {
        if (azj_22 != null) {
            this.getMesh().a(azj_22);
        }
    }

    public azj_2 getColor() {
        return this.getMesh().a();
    }

    @Override
    public fcf_1 getMesh() {
        return this.d;
    }

    @Override
    public Entity getEntity() {
        return this.getMesh().c();
    }

    @Override
    public boolean isValidAdd(fyo fyo2) {
        if (fyo2 instanceof fqg_0 && ((fqg_0)fyo2).getColor() == null) {
            c.error((Object)"Tentative d'ajout d'un ColorElement sans couleur");
            return false;
        }
        return super.isValidAdd(fyo2);
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
    public void onCheckOut() {
        super.onCheckOut();
        this.d = new fcf_1();
        this.d.i();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.d.h();
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
        if (n != 94842723) {
            return super.setPropertyAttribute(n, object);
        }
        this.setColor((azj_2)object);
        return true;
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
        this.d.b(azj_22);
    }

    @Override
    public azj_2 getModulationColor() {
        return this.d.b();
    }
}

