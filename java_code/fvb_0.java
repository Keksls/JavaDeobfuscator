/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fvb
 */
public class fvb_0
extends fso {
    public static final String TAG = "MRU";
    public static final String a = "Button";
    public static final String b = "IncreaseButton";
    public static final String c = "DecreaseButton";
    public static final int d = 8;
    public static final int e = 40;
    private static final int h = 27;
    public static final float f = 0.7853982f;
    private fru_0 i;
    fil_1 j;
    fuk_0 k;
    private fzu l;
    private boolean m;
    private int n;
    private int o;
    int p = 40;
    final ArrayList<fvi> q = new ArrayList(3);
    byte r;
    fru_0 s;
    fru_0 t;
    public static final int g = -938578798;

    public static float a(int n) {
        switch (n) {
            case 2: {
                return 1.5707964f;
            }
            case 4: 
            case 6: {
                return 1.0471976f;
            }
        }
        return 0.7853982f;
    }

    @Override
    public void addFromXML(fyb_0 fyb_02) {
        if (fyb_02 instanceof fil_1) {
            this.j = (fil_1)fyb_02;
        } else if (fyb_02 instanceof fru_0) {
            this.i = (fru_0)fyb_02;
        } else if (!(fyb_02 instanceof fvE)) {
            super.addFromXML(fyb_02);
        }
    }

    public void a(String string, String string2, String string3, ayo_2 ayo_22, String string4, Iterable<fbx_1> iterable, fdt_1 fdt_12, boolean bl) {
        ArrayList<fru_0> arrayList;
        if (this.q.isEmpty()) {
            return;
        }
        fru_0 fru_02 = (fru_0)this.i.cloneElementStructure();
        if (string != null) {
            fru_02.setText(string);
        }
        if (string2 != null && this.k != null) {
            fru_02.addEventListener(frd_0.F, new fvc(this, string2, fru_02, string3), true);
            fru_02.addEventListener(frd_0.G, new fve_0(this), true);
        }
        if (ayo_22 != null) {
            arrayList = fqv.checkOut();
            ((fqv)((Object)arrayList)).setPixmap(ayo_22);
            fru_02.setPixmap((fqv)((Object)arrayList));
        }
        if (string4 != null) {
            fru_02.addStyle(string4);
        }
        fru_02.setStyle(TAG + this.getStyle() + "$buttonNorth", true);
        fru_02.setPrefSize(new fjf_2(27, 27));
        fru_02.setOnClick(fdt_12);
        fru_02.setEnabled(bl);
        fru_02.setVisible(false);
        for (fbx_1 fbx_12 : iterable) {
            fbx_12.setRemovable(false);
            fru_02.getAppearance().add(fbx_12);
        }
        arrayList = this.q.get((int)(this.q.size() - 1)).b;
        arrayList.add(fru_02);
        this.add(fru_02);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public fvE getWidgetByThemeElementName(String string, boolean bl) {
        if (a.equalsIgnoreCase(string)) {
            if (this.i != null) {
                return this.i;
            }
            fru_0 fru_02 = new fru_0();
            fru_02.onCheckOut();
            return fru_02;
        }
        if (c.equalsIgnoreCase(string)) {
            return this.t;
        }
        if (b.equalsIgnoreCase(string)) {
            return this.s;
        }
        return null;
    }

    public int getRadius() {
        return this.p;
    }

    public void setRadius(int n) {
        this.p = n;
    }

    public void a() {
        this.q.add(new fvi());
    }

    public int getGroupSize() {
        return this.q.size();
    }

    public void a(int n, int n2) {
        this.setVisible(true);
        this.n = n;
        this.o = n2;
    }

    public void b() {
        this.a(fyf_0.a().c(), fyf_0.a().d());
    }

    public void c() {
        if (this.m_visible) {
            fpm_0.b().o(this.m_elementMap.c());
        }
    }

    public void d() {
        this.l = new fvf(this);
        fta_0.getInstance().addEventListener(frd_0.C, this.l, false);
        this.s.addEventListener(frd_0.C, new fvg_0(this), false);
        this.t.addEventListener(frd_0.C, new fvh_0(this), false);
    }

    @Override
    public void invalidateMinSize() {
        this.resetContentSizeCache();
        this.invalidate();
    }

    @Override
    public void validate() {
        this.setSizeToPrefSize();
        int n = this.getWidth();
        int n2 = this.getHeight();
        int n3 = this.n - fro_0.e.a(n);
        int n4 = this.o - fro_0.e.b(n2);
        fqj fqj2 = this.m_containerParent.getAppearance();
        n3 = Math.min(Math.max(0, n3), fqj2.getContentWidth() - n);
        n4 = Math.min(Math.max(0, n4), fqj2.getContentHeight() - n2);
        this.setPosition(n3, n4);
        super.validate();
    }

    @Override
    public boolean postProcess(int n) {
        boolean bl = super.postProcess(n);
        if (!this.m) {
            this.d();
            this.m = true;
        }
        return bl;
    }

    @Override
    public void onChildrenAdded() {
        super.onChildrenAdded();
        this.k = (fuk_0)this.m_elementMap.a("popupText");
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fvj fvj2 = new fvj(this);
        fvj2.onCheckOut();
        this.add(fvj2);
        this.s = new fru_0();
        this.s.onCheckOut();
        this.add(this.s);
        this.s.setVisible(false);
        this.t = new fru_0();
        this.t.onCheckOut();
        this.add(this.t);
        this.t.setVisible(false);
        this.setNeedsToPostProcess();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        fta_0.getInstance().removeEventListener(frd_0.C, this.l, false);
        this.q.clear();
        if (this.j != null) {
            this.j.destroySelfFromParent();
            this.j = null;
        }
        if (this.i != null) {
            this.i.destroySelfFromParent();
            this.i = null;
        }
        if (this.t != null) {
            this.t.destroySelfFromParent();
            this.t = null;
        }
        if (this.s != null) {
            this.s.destroySelfFromParent();
            this.s = null;
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n != -938578798) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setRadius(Co.c(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != -938578798) {
            return super.setPropertyAttribute(n, object);
        }
        this.setRadius(Co.c(object));
        return true;
    }

    static /* synthetic */ fyy_0 a(fvb_0 fvb_02) {
        return fvb_02.m_elementMap;
    }
}

