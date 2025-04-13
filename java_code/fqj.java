/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NonNls
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class fqj
extends fqD
implements fbl_1,
fqf_0,
fqt {
    protected static final Logger l = Logger.getLogger(fqj.class);
    public static final String TAG = "Appearance";
    public static final String m = "ScrollContainerAppearance";
    public static final String n = "SliderAppearance";
    public static final String o = "ScrollBarAppearance";
    public static final String p = "WindowAppearance";
    public static final String q = "PopupMenuAppearance";
    @NonNls
    public static final String r = fqp_0.a.c();
    public static final String s = "modulation";
    protected azf_2 t = null;
    protected final ArrayList<fbu_2> u = new ArrayList();
    protected final ArrayList<fbk_2> v = new ArrayList();
    protected final ArrayList<fbp_2> w = new ArrayList();
    private String a = r;
    @NonNls
    protected String x = r;
    private final Set<fbr_1> b = new HashSet<fbr_1>();
    protected boolean y = true;
    private static final ObjectPool c = new abm_1(new fqk());
    public static final int z = -1156593849;
    public static final int A = 109757585;

    public static fqj checkOut() {
        fqj fqj2;
        try {
            fqj2 = (fqj)c.borrowObject();
            fqj2.m_currentPool = c;
        }
        catch (Exception exception) {
            l.error((Object)"Probl\u00e8me au borrowObject.");
            fqj2 = new fqj();
            fqj2.onCheckOut();
        }
        return fqj2;
    }

    @Override
    public void add(fyb_0 fyb_02) {
        super.add(fyb_02);
        if (fyb_02 instanceof fbu_2) {
            this.a((fbu_2)((Object)fyb_02));
        }
        if (fyb_02 instanceof fbk_2) {
            this.a((fbk_2)((Object)fyb_02));
        }
        if (fyb_02 instanceof fbp_2) {
            this.a((fbp_2)((Object)fyb_02));
        }
    }

    public void i() {
        if (this.I == null) {
            return;
        }
        EntityGroup entityGroup = this.I.getEntity();
        int n = this.u.size();
        for (int k = 0; k < n; ++k) {
            fbu_2 fbu_22 = this.u.get(k);
            if (!fbu_22.isEnabled() || fbu_22.getEntity() == null) continue;
            entityGroup.a(fbu_22.getEntity());
        }
        this.y = false;
    }

    public void a(fbp_2 fbp_22) {
        this.a(fbp_22, true);
    }

    public void a(fbp_2 fbp_22, boolean bl) {
        fbp_22.setDecoratorAppearance(this);
        if (bl) {
            this.w.add(fbp_22);
        }
        if (this.I != null) {
            this.I.addEventListener(fbp_22.getTriggerAction(), new fql(this, fbp_22), false);
        }
        if (this.I != null) {
            this.I.setNeedsToResetMeshes();
        }
    }

    protected void a(fbk_2 fbk_22) {
        fbk_22.setDecoratorAppearance(this);
        if (this.t != null && fbk_22 instanceof fqt) {
            ((fqt)((Object)fbk_22)).setModulationColor(this.t);
        }
        if (fbk_22.getState() == null) {
            fbk_22.setState(this.a);
        }
        if ((fbk_22.getState().equalsIgnoreCase(r) || fbk_22.getState().equalsIgnoreCase(this.x)) && this.I != null) {
            fbk_22.setEnabled(true);
            if (fbk_22.isDecoratorSwitch()) {
                fbk_22.setup(this);
            } else {
                fbk_22.setup(this.I);
            }
        }
        this.v.add(fbk_22);
        if (this.I != null) {
            this.I.setNeedsToResetMeshes();
        }
    }

    protected void a(fbu_2 fbu_22) {
        fbu_22.setDecoratorAppearance(this);
        if (fbu_22.getState() == null) {
            fbu_22.setState(this.a);
        }
        if (this.t != null && fbu_22 instanceof fqt) {
            ((fqt)((Object)fbu_22)).setModulationColor(this.t);
        }
        if ((fbu_22.getState().equalsIgnoreCase(r) || fbu_22.getState().equalsIgnoreCase(this.x)) && this.I != null) {
            fbu_22.setEnabled(true);
        }
        if (fbu_22 instanceof fbw_1) {
            this.setBorder(((fbw_1)fbu_22).getInsets());
        }
        if (this.I != null) {
            fbu_22.a(this.I.m_size, this.B, this.C, this.D);
        }
        this.u.add(fbu_22);
        if (this.I != null) {
            this.I.setNeedsToResetMeshes();
        }
    }

    protected void a(fbw_1 fbw_12) {
        this.a((fbu_2)fbw_12);
    }

    public void b(fbu_2 fbu_22) {
        this.u.remove(fbu_22);
        if (fbu_22 instanceof fbw_1) {
            this.m();
        }
        ((fyb_0)((Object)fbu_22)).removeSelfFromParent();
    }

    public void j() {
        for (int k = this.u.size() - 1; k >= 0; --k) {
            ((fyb_0)((Object)this.u.get(k))).removeSelfFromParent();
        }
        this.u.clear();
        this.m();
    }

    public void c(fbu_2 fbu_22) {
        this.u.remove(fbu_22);
        ((fyb_0)((Object)fbu_22)).destroySelfFromParent();
        if (fbu_22 instanceof fbw_1) {
            this.m();
        }
    }

    public void k() {
        int n;
        for (n = this.u.size() - 1; n >= 0; --n) {
            ((fyb_0)((Object)this.u.get(n))).destroySelfFromParent();
        }
        this.u.clear();
        this.m();
        for (n = this.v.size() - 1; n >= 0; --n) {
            ((fyb_0)((Object)this.v.get(n))).destroySelfFromParent();
        }
        this.v.clear();
    }

    public void l() {
        fbj_1 fbj_12;
        int n;
        for (n = this.u.size() - 1; n >= 0; --n) {
            fbj_12 = this.u.get(n);
            if (!fbj_12.isRemovable()) continue;
            ((fyb_0)((Object)fbj_12)).destroySelfFromParent();
            this.u.remove(n);
        }
        this.m();
        for (n = this.v.size() - 1; n >= 0; --n) {
            fbj_12 = this.v.get(n);
            if (!fbj_12.isRemovable()) continue;
            ((fyb_0)((Object)fbj_12)).destroySelfFromParent();
            this.v.remove(n);
        }
    }

    public void setState(String string) {
        this.a = string;
    }

    public void setAppearanceState(@NotNull fqp_0 fqp_02) {
        this.setState(fqp_02.c());
    }

    public String getState() {
        return this.a;
    }

    public fqp_0 getAppearanceState() {
        return fqp_0.a(this.a);
    }

    public String getCurrentState() {
        return this.x;
    }

    public fqp_0 getCurrentAppearanceState() {
        return fqp_0.a(this.x);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public void setEnabled(String string, boolean bl) {
        String string2 = this.x;
        this.x = string;
        this.b.forEach(fbr_12 -> {
            try {
                fbr_12.a(string2, this.x);
            }
            catch (Exception exception) {
                l.error((Object)String.format("Error occured in call of following %s(%s) with followings args : \"%s\", \"%s\"", fbr_12, fbr_12.getClass().getName(), string2, this.x), (Throwable)exception);
            }
        });
        for (int k = 0; k < this.u.size(); ++k) {
            fbu_2 fbu_22 = this.u.get(k);
            if (fbu_22.getLabel() == null || !fbu_22.getLabel().equals(string)) continue;
            fbu_22.setEnabled(bl);
        }
        ArrayList arrayList = new ArrayList();
        for (int k = this.v.size() - 1; k >= 0; --k) {
            fbk_2 fbk_22 = this.v.get(k);
            if (fbk_22.getLabel() == null || !fbk_22.getLabel().equals(string)) continue;
            fbk_22.setEnabled(bl);
            if (arrayList.contains(fbk_22.getClass()) || !fbk_22.isEnabled()) continue;
            if (fbk_22.isDecoratorSwitch()) {
                fbk_22.setup(this);
            } else {
                fbk_22.setup(this.getWidget());
            }
            arrayList.add(fbk_22.getClass());
        }
    }

    public void setEnabled(@NotNull fqp_0 fqp_02, boolean bl) {
        this.setEnabled(fqp_02.c(), bl);
    }

    public boolean a(@NotNull fbr_1 fbr_12) {
        return this.b.add(fbr_12);
    }

    public boolean b(@NotNull fbr_1 fbr_12) {
        return this.b.remove(fbr_12);
    }

    @Override
    public void setWidget(fvE fvE2) {
        fbq_1 fbq_12;
        int n;
        super.setWidget(fvE2);
        int n2 = this.u.size();
        for (n = 0; n < n2; ++n) {
            fbq_12 = this.u.get(n);
            if (!fbq_12.getState().equalsIgnoreCase(this.x) || this.I == null) continue;
            fbq_12.setEnabled(true);
        }
        n2 = this.v.size();
        for (n = 0; n < n2; ++n) {
            fbq_12 = this.v.get(n);
            if (!fbq_12.getState().equalsIgnoreCase(this.x) || this.I == null) continue;
            fbq_12.setEnabled(true);
            if (fbq_12.isDecoratorSwitch()) continue;
            fbq_12.setup(fvE2);
        }
        n2 = this.w.size();
        for (n = 0; n < n2; ++n) {
            fbq_12 = this.w.get(n);
            this.a((fbp_2)fbq_12, false);
        }
        if (this.t != null && this.I instanceof fqt) {
            ((fqt)((Object)this.I)).setModulationColor(this.t);
        }
        if (fvE2 != null) {
            fvE2.setNeedsToResetMeshes();
        }
    }

    public void setNeedsToResetMeshes() {
        if (this.I != null) {
            this.I.setNeedsToResetMeshes();
        }
    }

    @Override
    public void setColor(azj_2 azj_22, String string) {
        if (string == null || string.equalsIgnoreCase(s)) {
            this.setModulationColor(azj_22);
        }
    }

    public void setPixmapBackground(fby_2 fby_22) {
        this.a(fby_22);
    }

    @Override
    public void setModulationColor(azj_2 azj_22) {
        fbj_1 fbj_12;
        int n;
        if (this.t == azj_22) {
            return;
        }
        azf_2 azf_22 = azj_22 == null ? null : (this.t = azj_22 instanceof azf_2 ? (azf_2)azj_22 : new azf_2(azj_22));
        if (this.I instanceof fqt) {
            ((fqt)((Object)this.I)).setModulationColor(azj_22);
        }
        for (n = this.u.size() - 1; n >= 0; --n) {
            fbj_12 = this.u.get(n);
            if (!(fbj_12 instanceof fqt)) continue;
            ((fqt)((Object)fbj_12)).setModulationColor(azj_22);
        }
        for (n = this.v.size() - 1; n >= 0; --n) {
            fbj_12 = this.v.get(n);
            if (!(fbj_12 instanceof fqt)) continue;
            ((fqt)((Object)fbj_12)).setModulationColor(azj_22);
        }
    }

    @Override
    public azj_2 getModulationColor() {
        return this.t;
    }

    public void m() {
        Insets insets = null;
        for (int k = this.u.size() - 1; k >= 0; --k) {
            fbu_2 fbu_22 = this.u.get(k);
            if (!(fbu_22 instanceof fbw_1)) continue;
            insets = ((fbw_1)fbu_22).getInsets();
            break;
        }
        if (insets == null) {
            insets = new Insets(0, 0, 0, 0);
        }
        this.setBorder(insets);
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fqj fqj2 = (fqj)fyo2;
        if (this.t != null) {
            fqj2.setModulationColor(this.t);
        }
    }

    public void n() {
        for (fbu_2 fbj_12 : this.u) {
            fbj_12.setEnabled(false);
        }
        for (fbk_2 fbk_22 : this.v) {
            fbk_22.setEnabled(false);
        }
    }

    @Override
    public void validate() {
        if (this.I != null) {
            for (int k = this.u.size() - 1; k >= 0; --k) {
                this.u.get(k).a(this.I.m_size, this.B, this.C, this.D);
            }
        }
        super.validate();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.u.clear();
        this.v.clear();
        this.w.clear();
        this.t = null;
        this.b.clear();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.a = r;
        this.x = r;
        this.y = true;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == -1156593849) {
            this.setModulationColor(fze2.a(string));
        } else if (n == 109757585) {
            this.setState(fze2.a(string, this.m_elementMap));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -1156593849) {
            this.setModulationColor((azj_2)object);
        } else if (n == 109757585) {
            this.setState(String.valueOf(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

