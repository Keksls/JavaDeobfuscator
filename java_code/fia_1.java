/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fIA
 */
public class fia_1
extends fif_1 {
    public static final String TAG = "SpringLayoutData";
    public static final String a = "spld";
    private boolean b = false;
    private fiq_2 c;
    private fiq_2 d;
    private fiq_2 e;
    private fiq_2 f;
    private fiq_2 g;
    private fiq_2 h;
    private fiq_2 i;
    private fiq_2 j;
    private fiz_2 k;

    public fia_1() {
    }

    public fia_1(fiq_2 fiq_22, fiq_2 fiq_23, fiq_2 fiq_24, fiq_2 fiq_25) {
        this.c = fiq_22;
        this.d = fiq_23;
        this.e = fiq_24;
        this.f = fiq_25;
    }

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof fiq_2 && this.isInTree()) {
            fiq_2 fiq_22 = (fiq_2)fyb_02;
            this.a(fiq_22.getEdge(), fiq_22.getValue(), fiq_22.getReferentId(), fiq_22.getReferentEdge());
            this.b = true;
            this.setNeedsToPreProcess();
        }
        super.add(fyb_02);
    }

    private void b() {
        if (this.c != null && this.g != null && this.i != null) {
            this.g = null;
        }
    }

    private void c() {
        if (this.d != null && this.h != null && this.j != null) {
            this.h = null;
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public fiq_2 getEast() {
        if (this.e != null) {
            return this.e;
        }
        if (this.i == null) {
            if (this.c != null && this.g != null) {
                this.i = fiq_2.a(this.c, this.g);
            } else {
                return fiq_2.a(0);
            }
        }
        return this.i;
    }

    public void setEast(fiq_2 fiq_22) {
        this.e = fiq_22;
    }

    public fiq_2 getNorth() {
        if (this.f != null) {
            return this.f;
        }
        if (this.j == null) {
            if (this.d != null && this.h != null) {
                this.j = fiq_2.a(this.d, this.h);
            } else {
                return fiq_2.a(0);
            }
        }
        return this.j;
    }

    public void setNorth(fiq_2 fiq_22) {
        this.f = fiq_22;
    }

    public fiq_2 getX() {
        if (this.c != null) {
            return this.c;
        }
        if (this.i == null) {
            if (this.e != null && this.g != null) {
                this.i = fiq_2.b(this.e, this.g);
            } else {
                return fiq_2.a(0);
            }
        }
        return this.i;
    }

    public void setX(fiq_2 fiq_22) {
        this.c = fiq_22;
    }

    public fiq_2 getY() {
        if (this.d != null) {
            return this.d;
        }
        if (this.j == null) {
            if (this.f != null && this.h != null) {
                this.j = fiq_2.b(this.f, this.h);
            } else {
                return fiq_2.a(0);
            }
        }
        return this.j;
    }

    public void setY(fiq_2 fiq_22) {
        this.d = fiq_22;
    }

    public fiq_2 getWidth() {
        if (this.g != null) {
            return this.g;
        }
        if (this.i == null) {
            if (this.e != null && this.c != null) {
                this.i = fiq_2.b(this.e, this.c);
            } else {
                return fiq_2.a(0);
            }
        }
        return this.i;
    }

    public void setWidth(fiq_2 fiq_22) {
        this.g = fiq_22;
        this.b();
    }

    public fiq_2 getHeight() {
        if (this.h != null) {
            return this.h;
        }
        if (this.j == null) {
            if (this.f != null && this.d != null) {
                this.j = fiq_2.b(this.f, this.d);
            } else {
                return fiq_2.a(0);
            }
        }
        return this.j;
    }

    public void setHeight(fiq_2 fiq_22) {
        this.h = fiq_22;
        this.c();
    }

    public fiz_2 getLayout() {
        return this.k;
    }

    public void setLayout(fiz_2 fiz_22) {
        this.k = fiz_22;
    }

    public fiq_2 getConstraint(String string) {
        if (string.equalsIgnoreCase("North")) {
            return this.getNorth();
        }
        if (string.equalsIgnoreCase("East")) {
            return this.getEast();
        }
        if (string.equalsIgnoreCase("West")) {
            return this.getX();
        }
        if (string.equalsIgnoreCase("South")) {
            return this.getY();
        }
        return null;
    }

    public void a(String string, int n, String string2, String string3) {
        fiq_2 fiq_22 = fiq_2.a(fiq_2.a(n), new fib_1(this.k, string2, string3));
        this.a(string, fiq_22);
    }

    public void a(String string, int n, fvE fvE2, String string2) {
        fiq_2 fiq_22 = fiq_2.a(fiq_2.a(n), new fib_1(this.k, fvE2, string2));
        this.a(string, fiq_22);
    }

    public void a(String string, fiq_2 fiq_22) {
        if (string.equalsIgnoreCase("North")) {
            this.setNorth(fiq_22);
        } else if (string.equalsIgnoreCase("East")) {
            this.setEast(fiq_22);
        } else if (string.equalsIgnoreCase("West")) {
            this.setX(fiq_22);
        } else if (string.equalsIgnoreCase("South")) {
            this.setY(fiq_22);
        }
    }

    public static fia_1 a(fiz_2 fiz_22, fvE fvE2) {
        fia_1 fia_12 = new fia_1();
        fia_12.setLayout(fiz_22);
        fia_12.setX(fiq_2.c(fvE2));
        fia_12.setY(fiq_2.d(fvE2));
        fia_12.setWidth(fiq_2.a(fvE2));
        fia_12.setHeight(fiq_2.b(fvE2));
        return fia_12;
    }

    public void a() {
    }

    @Override
    public void copyElement(fyo fyo2) {
        fia_1 fia_12 = (fia_1)fyo2;
        super.copyElement(fia_12);
    }

    @Override
    public void addedToTree() {
        fso fso2;
        super.addedToTree();
        fim_2 fim_22 = null;
        fvE fvE2 = this.getParentOfType(fvE.class);
        if (fvE2 != null && (fso2 = fvE2.getContainer()) != null) {
            fim_22 = fso2.getLayoutManager();
        }
        if (fim_22 instanceof fiz_2) {
            this.setLayout((fiz_2)fim_22);
            if (this.m_parent instanceof fvE) {
                ((fiz_2)fim_22).a((fvE)this.m_parent, this);
            }
        }
        int n = this.getChildren().size();
        for (int k = 0; k < n; ++k) {
            fyb_0 fyb_02 = this.getChildren().get(k);
            if (!(fyb_02 instanceof fiq_2)) continue;
            fiq_2 fiq_22 = (fiq_2)fyb_02;
            this.a(fiq_22.getEdge(), fiq_22.getValue(), fiq_22.getReferentId(), fiq_22.getReferentEdge());
            this.b = true;
            this.setNeedsToPreProcess();
        }
    }

    @Override
    public boolean preProcess(int n) {
        boolean bl = super.preProcess(n);
        if (this.b) {
            fso fso2 = this.getParentOfType(fso.class);
            fso2.invalidateMinSize();
            this.b = false;
        }
        return bl;
    }

    public String toString() {
        return "[x=" + this.getX() + ", y=" + this.getY() + ", width=" + this.getWidth() + ", height=" + this.getHeight() + "]";
    }
}

