/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

/*
 * Renamed from fBf
 */
public class fbf_2 {
    private static final fbf_2 a = new fbf_2();
    private static final short b = 20;
    private static final int c = Integer.MIN_VALUE;
    private static int d = -2147483647;
    private final acy_2<fbj_2> e = new acy_2();
    private final ArrayList<fvk_0> f = new ArrayList();
    private final Rectangle g = new Rectangle();
    private static final ArrayList<fvk_0> h = new ArrayList();
    private static final String i = "stickData";

    private fbf_2() {
    }

    public static fbf_2 a() {
        return a;
    }

    public acy_2<fbj_2> b() {
        return this.e;
    }

    public void a(fvk_0 fvk_02, boolean bl) {
        this.a(fvk_02, bl, true);
    }

    public void a(fvk_0 fvk_02, boolean bl, boolean bl2) {
        fvk_02.setStickData(new fbe_2(bl));
        this.f.add(fvk_02);
        fvk_02.getStickData().a(Integer.MIN_VALUE);
        if (bl2) {
            fvk_02.a(new fbg_2(this, fvk_02));
        }
    }

    public void a(fvk_0 fvk_02) {
        this.b(fvk_02);
        this.f.remove(fvk_02);
    }

    public void a(fvk_0 fvk_02, int n) {
        if (fvk_02.getStickData().b() == n) {
            return;
        }
        this.b(fvk_02);
        fvk_02.getStickData().a(n);
        fbj_2 fbj_22 = this.e.g(n);
        if (fbj_22 == null) {
            fbj_22 = new fbj_2();
            this.e.a(n, fbj_22);
        }
        fbj_22.a(fvk_02);
    }

    public void b(fvk_0 fvk_02) {
        int n = fvk_02.getStickData().b();
        fbj_2 fbj_22 = this.e.g(n);
        if (fbj_22 != null) {
            fbj_22.b(fvk_02);
        }
        fvk_02.getStickData().a(Integer.MIN_VALUE);
    }

    private static int c() {
        return ++d;
    }

    public fbi_2 a(int n) {
        fbj_2 fbj_22 = this.e.g(n);
        if (fbj_22 == null || fbj_22.a()) {
            return fbi_2.a;
        }
        this.a(n, this.g);
        return fbi_2.a(this.g.x, this.g.y, this.g.width, this.g.height, fbj_22.b().getContainer());
    }

    public void a(int n, Rectangle rectangle) {
        rectangle.setBounds(0, 0, 0, 0);
        fbj_2 fbj_22 = this.e.g(n);
        if (fbj_22 == null || fbj_22.a()) {
            return;
        }
        double d2 = 2.147483647E9;
        double d3 = 2.147483647E9;
        double d4 = -2.147483648E9;
        double d5 = -2.147483648E9;
        ArrayList<fvk_0> arrayList = fbj_22.c();
        int n2 = arrayList.size();
        for (int k = 1; k < n2; ++k) {
            fvk_0 fvk_02 = arrayList.get(k);
            d2 = Math.min(d2, (double)fvk_02.getX());
            d3 = Math.min(d3, (double)fvk_02.getY());
            d4 = Math.max(d4, (double)(fvk_02.getX() + fvk_02.getWidth()));
            d5 = Math.max(d5, (double)(fvk_02.getY() + fvk_02.getHeight()));
        }
        rectangle.setBounds((int)d2, (int)d3, (int)(d4 - d2), (int)(d5 - d3));
    }

    public void a(fvk_0 fvk_02, int n, int n2, int n3, int n4, Point point, boolean bl) {
        fbi_2 fbi_22;
        fvk_0 fvk_03;
        int n5;
        fbe_2 fbe_22 = fvk_02.getStickData();
        int n6 = fbe_22 != null ? fbe_22.b() : Integer.MIN_VALUE;
        fbj_2 fbj_22 = this.e.g(n6);
        if (fbj_22 != null && !fbe_22.a() && !bl) {
            ArrayList<fvk_0> arrayList = fbj_22.c();
            for (n5 = arrayList.size() - 1; n5 >= 0; --n5) {
                fvk_03 = arrayList.get(n5);
                if (fvk_03 == fvk_02 || (fbi_22 = fbi_2.a(n3, n4, fvk_02, fvk_03)) == fbi_2.a) continue;
                n3 = fbi_22.a(n3, fvk_03, fvk_02);
                n4 = fbi_22.b(n4, fvk_03, fvk_02);
            }
            if (n3 == n && n4 == n2) {
                point.setLocation(n3, n4);
                return;
            }
            this.b(fvk_02, n3, n4);
            this.a(fbj_22);
        }
        n5 = this.f.size();
        for (int k = 0; k < n5; ++k) {
            fvk_03 = this.f.get(k);
            if (fvk_03 == fvk_02 || fvk_03.getStickData().b() == fvk_02.getStickData().b() && fvk_03.getStickData().b() != Integer.MIN_VALUE || (fbi_22 = fbi_2.a(n3, n4, fvk_02, fvk_03)) == fbi_2.a) continue;
            n3 = fbi_22.a(n3, fvk_03, fvk_02);
            n4 = fbi_22.b(n4, fvk_03, fvk_02);
        }
        fbi_2 fbi_23 = fbi_2.a(n3, n4, fvk_02, fvk_02.getContainer());
        n3 = fbi_23.a(n3, fvk_02);
        n4 = fbi_23.b(n4, fvk_02);
        if ((bl || fvk_02.getStickData().a()) && fvk_02.getStickData().b() != Integer.MIN_VALUE) {
            fbj_2 fbj_23 = this.e.g(fvk_02.getStickData().b());
            int n7 = n3 - n;
            int n8 = n4 - n2;
            ArrayList<fvk_0> arrayList = fbj_23.c();
            int n9 = arrayList.size();
            for (int k = 0; k < n9; ++k) {
                fvk_0 fvk_04 = arrayList.get(k);
                if (fvk_04 == fvk_02) continue;
                fvk_04.setPosition(fvk_04.getX() + n7, fvk_04.getY() + n8);
            }
        }
        point.x = n3;
        point.y = n4;
    }

    private void a(fbj_2 fbj_22) {
        int n;
        ArrayList<fvk_0> arrayList = fbj_22.c();
        for (n = arrayList.size() - 1; n >= 0; --n) {
            h.add(arrayList.get(n));
        }
        for (n = h.size() - 1; n >= 0; --n) {
            fvk_0 fvk_02 = h.get(n);
            this.b(fvk_02, fvk_02.getX(), fvk_02.getY());
        }
        h.clear();
    }

    private void b(fvk_0 fvk_02, int n, int n2) {
        fbe_2 fbe_22 = fvk_02.getStickData();
        if (fbe_22.b() == Integer.MIN_VALUE) {
            return;
        }
        ArrayList<fvk_0> arrayList = this.e.g(fbe_22.b()).c();
        boolean bl = false;
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            fbi_2 fbi_22;
            fvk_0 fvk_03 = arrayList.get(k);
            if (fvk_03 == fvk_02 || (fbi_22 = fbi_2.a(n, n2, fvk_02, fvk_03)) == fbi_2.a) continue;
            bl = true;
            break;
        }
        if (!bl) {
            arrayList.remove(fvk_02);
            fbe_22.a(Integer.MIN_VALUE);
        }
    }

    public void a(fvk_0 fvk_02, int n, int n2) {
        int n3;
        Object object;
        int n4;
        if (fvk_02.getStickData() == null) {
            return;
        }
        fbj_2 fbj_22 = this.e(fvk_02);
        if (fbj_22 != null) {
            this.a(fbj_22);
        }
        int n5 = this.f.size();
        for (n4 = 0; n4 < n5; ++n4) {
            fvk_0 fvk_03 = this.f.get(n4);
            if (fvk_03 == fvk_02 || fvk_03.getStickData().b() == fvk_02.getStickData().b() && fvk_03.getStickData().b() != Integer.MIN_VALUE || (object = fbi_2.a(n, n2, fvk_02, fvk_03)) == fbi_2.a) continue;
            int n6 = fvk_02.getStickData().b();
            int n7 = fvk_03.getStickData().b();
            int n8 = n3 = n6 != Integer.MIN_VALUE ? n6 : n7;
            if (n3 == Integer.MIN_VALUE) {
                n3 = fbf_2.c();
            }
            if (n6 != n3) {
                this.a(fvk_02, n3);
            }
            if (n7 == n3) continue;
            if (n7 == Integer.MIN_VALUE) {
                this.a(fvk_03, n3);
                continue;
            }
            ArrayList<fvk_0> arrayList = this.e.g(n7).c();
            for (int k = arrayList.size() - 1; k >= 0; --k) {
                this.a(arrayList.get(k), n3);
            }
        }
        n5 = this.e.d();
        for (n4 = 0; n4 < n5; ++n4) {
            int n9 = this.e.e(n4);
            object = this.e.h(n4);
            ArrayList<fvk_0> arrayList = ((fbj_2)object).c();
            fbi_2 fbi_22 = this.a(n9);
            int n10 = arrayList.size();
            for (n3 = 0; n3 < n10; ++n3) {
                fvk_0 fvk_04 = arrayList.get(n3);
                fvk_04.getStickData().a(fbi_22);
            }
            ((fbj_2)object).d();
        }
        n5 = this.f.size();
        for (n4 = 0; n4 < n5; ++n4) {
            fvk_0 fvk_05 = this.f.get(n4);
            if (fvk_05.getStickData().b() != Integer.MIN_VALUE) continue;
            fvk_05.getStickData().a(fbi_2.a(fvk_05.getX(), fvk_05.getY(), fvk_05.getWidth(), fvk_05.getHeight(), fvk_05.getContainer()));
        }
    }

    private fbj_2 e(fvk_0 fvk_02) {
        fbe_2 fbe_22 = fvk_02.getStickData();
        int n = fbe_22 != null ? fbe_22.b() : Integer.MIN_VALUE;
        return this.e.g(n);
    }

    public void c(fvk_0 fvk_02) {
        this.a(fvk_02, fvk_02.getX(), fvk_02.getY());
    }

    public void a(fyX fyX2, int n, int n2) {
        int n3;
        int n4;
        Object object;
        int n5;
        int n6 = this.e.d();
        for (n5 = 0; n5 < n6; ++n5) {
            object = this.e.h(n5);
            ArrayList<fvk_0> arrayList = ((fbj_2)object).c();
            if (arrayList.size() == 0) continue;
            n4 = (int)((fyX2.E() - (float)((fbj_2)object).g()) * ((fbj_2)object).i()) - ((fbj_2)object).e();
            n3 = (int)((fyX2.F() - (float)((fbj_2)object).h()) * ((fbj_2)object).j()) - ((fbj_2)object).f();
            fbi_2 fbi_22 = arrayList.get(0).getStickData().c();
            switch (fbi_22) {
                case c: 
                case h: 
                case f: {
                    n4 = n;
                }
            }
            switch (fbi_22) {
                case f: 
                case e: 
                case g: {
                    n3 = n2;
                }
            }
            int n7 = arrayList.size();
            for (int k = 0; k < n7; ++k) {
                fvk_0 fvk_02 = arrayList.get(k);
                fvk_02.setPosition(fvk_02.getX() + n4, fvk_02.getY() + n3, 0, false, false);
            }
            ((fbj_2)object).a(((fbj_2)object).b + n4, ((fbj_2)object).c + n3);
        }
        n6 = this.f.size();
        for (n5 = 0; n5 < n6; ++n5) {
            object = this.f.get(n5);
            if (((fvk_0)object).getStickData().b() != Integer.MIN_VALUE) continue;
            int n8 = ((fvE)object).getX();
            n4 = ((fvE)object).getY();
            n3 = (int)((fyX2.E() - (float)((fvE)object).getWidth()) * ((fvE)object).getXPercInParent()) - n8;
            int n9 = (int)((fyX2.F() - (float)((fvE)object).getHeight()) * ((fvE)object).getYPercInParent()) - n4;
            fbi_2 fbi_23 = ((fvk_0)object).getStickData().c();
            if (fbi_23 == null) continue;
            switch (fbi_23) {
                case c: 
                case h: 
                case f: {
                    n3 = n;
                }
            }
            switch (fbi_23) {
                case f: 
                case e: 
                case g: {
                    n9 = n2;
                }
            }
            ((fvE)object).setPosition(n8 + n3, n4 + n9, 0, false, false);
        }
    }

    public boolean a(String string) {
        ajb_1 ajb_12 = fpm_0.b().b(string);
        return ajb_12 != null && ajb_12.l(i + string);
    }

    public boolean b(String string) {
        ajb_1 ajb_12 = fpm_0.b().b(string);
        return ajb_12 != null && ajb_12.n(i + string);
    }

    public void d(fvk_0 fvk_02) {
        String string = fvk_02.getElementMap().c();
        ajb_1 ajb_12 = fpm_0.b().b(string);
        if (ajb_12 != null) {
            ajb_12.b(i + fvk_02.getHorizontalDialog(), string.startsWith(fvk_02.getVerticalDialog()));
        }
    }
}

