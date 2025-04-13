/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fBv
 */
public class fbv_2
extends fbf_1 {
    private static final Logger c = Logger.getLogger(fbv_2.class);
    public static final String TAG = "GradientBackground";
    private fbx_2 d;

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public void setColor(fqg_0 fqg_02) {
        this.setColor(fqg_02.getColor(), fqg_02.getPosition());
    }

    public void setColor(azj_2 azj_22, frf_0 frf_02) {
        this.getMesh().a(azj_22, frf_02);
    }

    @Override
    public fbx_2 getMesh() {
        return this.d;
    }

    @Override
    public boolean isValidAdd(fyo fyo2) {
        if (fyo2 instanceof fqg_0 && ((fqg_0)fyo2).getPosition() == null) {
            c.error((Object)"Tentative d'ajout d'un ColorElement sans position");
            return false;
        }
        return super.isValidAdd(fyo2);
    }

    @Override
    protected void a(fqg_0 fqg_02) {
        if (this.m_children == null) {
            return;
        }
        for (int k = this.m_children.size() - 1; k >= 0; --k) {
            fyb_0 fyb_02 = (fyb_0)this.m_children.get(k);
            if (!(fyb_02 instanceof fqg_0) || !((fqg_0)fyb_02).getPosition().equals((Object)fqg_02.getPosition())) continue;
            this.destroy(fyb_02);
        }
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.d = new fbx_2();
        this.d.i();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.d.h();
    }
}

