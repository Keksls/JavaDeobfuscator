/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fBj
 */
class fbj_2 {
    private final ArrayList<fvk_0> a = new ArrayList();
    int b;
    int c;
    private int d;
    private int e;
    private float f;
    private float g;

    fbj_2() {
    }

    public void a(fvk_0 fvk_02) {
        this.a.add(fvk_02);
    }

    public void b(fvk_0 fvk_02) {
        this.a.remove(fvk_02);
    }

    public boolean a() {
        return this.a.isEmpty();
    }

    public fvk_0 b() {
        if (this.a.isEmpty()) {
            return null;
        }
        return this.a.get(0);
    }

    public ArrayList<fvk_0> c() {
        return this.a;
    }

    public void a(int n, int n2) {
        this.b = n;
        this.c = n2;
    }

    public void d() {
        if (this.a.size() == 0) {
            return;
        }
        boolean bl = false;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        fso fso2 = null;
        for (int k = this.a.size() - 1; k >= 0; --k) {
            fvk_0 fvk_02 = this.a.get(k);
            if (fso2 == null) {
                fso2 = fvk_02.getContainer();
            }
            if (!bl) {
                bl = true;
                n = fvk_02.getX();
                n2 = fvk_02.getX() + fvk_02.getWidth();
                n3 = fvk_02.getY();
                n4 = fvk_02.getY() + fvk_02.getHeight();
                continue;
            }
            n = Math.min(n, fvk_02.getX());
            n2 = Math.max(n2, fvk_02.getX() + fvk_02.getWidth());
            n3 = Math.min(n3, fvk_02.getY());
            n4 = Math.max(n4, fvk_02.getY() + fvk_02.getHeight());
        }
        if (fso2 == null) {
            return;
        }
        this.b = n;
        this.c = n3;
        this.d = n2 - n;
        this.e = n4 - n3;
        this.f = (float)this.b / (float)(fso2.getWidth() - this.d);
        this.g = (float)this.c / (float)(fso2.getHeight() - this.e);
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.c;
    }

    public int g() {
        return this.d;
    }

    public int h() {
        return this.e;
    }

    public float i() {
        return this.f;
    }

    public float j() {
        return this.g;
    }
}

