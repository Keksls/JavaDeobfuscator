/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class fyS {
    private static final int a = 10;
    private static final int b = 30;
    private final ftv_0 c;
    private final HashMap<String, ArrayList<fvE>> d = new HashMap();
    private final HashMap<String, Stack<fvE>> e = new HashMap();

    public fyS(ftv_0 ftv_02) {
        this.c = ftv_02;
    }

    public static int a(int n) {
        return fpm_0.b().i().k() + n;
    }

    public static int b(int n) {
        return fpm_0.b().i().l() + n;
    }

    public void a() {
    }

    public void a(fvE fvE2, String string) {
        ArrayList<fvE> arrayList = this.d.get(string);
        if (arrayList != null) {
            if (!arrayList.contains(fvE2)) {
                arrayList.add(fvE2);
            }
        } else {
            arrayList = new ArrayList();
            arrayList.add(fvE2);
            this.d.put(string, arrayList);
        }
    }

    public void b(fvE fvE2, String string) {
        ArrayList<fvE> arrayList = this.d.get(string);
        if (arrayList != null) {
            arrayList.remove(fvE2);
            if (arrayList.size() <= 0) {
                this.d.remove(string);
            }
        }
    }

    public void c(fvE fvE2, String string) {
        Stack<fvE> stack = this.e.get(string);
        if (stack != null) {
            if (stack.contains(fvE2)) {
                stack.remove(fvE2);
            }
            stack.push(fvE2);
        } else {
            stack = new Stack();
            stack.push(fvE2);
            this.e.put(string, stack);
        }
    }

    public void d(fvE fvE2, String string) {
        Stack<fvE> stack = this.e.get(string);
        if (stack != null) {
            stack.remove(fvE2);
            if (stack.size() <= 0) {
                this.e.remove(string);
            }
        }
    }

    public Point a(fvE fvE2, fvE fvE3) {
        int n = fvE2.getDisplayX();
        int n2 = fvE2.getDisplayY();
        fyT fyT2 = new fyT(n + fvE2.getWidth() + 10, n2, fvE3.getWidth(), fvE3.getHeight(), null);
        boolean bl = fyT2.x + fyT2.width <= this.c.getWidth() ? this.a(fyT2, fvE3) : false;
        if (!bl) {
            fyT2 = new fyT(n, n2 + fvE2.getHeight() + 10, fvE3.getWidth(), fvE3.getHeight(), null);
            bl = fyT2.y + fyT2.height <= this.c.getHeight() ? this.a(fyT2, fvE3) : false;
        }
        if (!bl) {
            fyT2 = new fyT(n - fvE3.getWidth() - 10, n2, fvE3.getWidth(), fvE3.getHeight(), null);
            bl = fyT2.x > 0 ? this.a(fyT2, fvE3) : false;
        }
        if (!bl) {
            fyT2 = new fyT(n, n2 - fvE3.getHeight() - 10, fvE3.getWidth(), fvE3.getHeight(), null);
            bl = fyT2.y > 0 ? this.a(fyT2, fvE3) : false;
        }
        if (bl) {
            return new Point(fyT2.x, fyT2.y);
        }
        return null;
    }

    public Point a(fvE fvE2) {
        fvE fvE3 = this.a((fyb_0)fvE2);
        if (fvE3 != null) {
            int n = fvE3.getDisplayX();
            int n2 = fvE3.getDisplayY();
            fyT fyT2 = new fyT(n + 30, n2 - (fvE2.getHeight() - fvE3.getHeight()) - 30, fvE2.getWidth(), fvE2.getHeight(), null);
            if (fyT2.y <= 0) {
                fyT2.y = 0;
            }
            if (fyT2.x + fyT2.width > this.c.getWidth()) {
                fyT2.x = this.c.getWidth() - fvE2.getWidth();
            }
            return new Point(fyT2.x, fyT2.y);
        }
        return fvE2.getPosition();
    }

    public boolean a(fyT fyT2, fvE fvE2) {
        fso fso2 = this.c.getLayeredContainer().getContainerFromWidget(fvE2);
        if (fso2 == null) {
            return false;
        }
        ArrayList<fvE> arrayList = fso2.getWidgetChildren();
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            fvE fvE3 = arrayList.get(k);
            if (fvE3 == fvE2 || !this.b(fvE3) || fvE3.getWidth() > 1000 && fvE3.getHeight() > 700 && fvE3.getX() == 0 && fvE3.getY() == 0 || !this.a(fvE3.getX(), fvE3.getY(), fvE3.getWidth(), fvE3.getHeight(), (int)fyT2.getX(), (int)fyT2.getY(), (int)fyT2.getWidth(), (int)fyT2.getHeight())) continue;
            return false;
        }
        return true;
    }

    private boolean a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (n7 <= 0 || n8 <= 0 || n3 <= 0 || n4 <= 0) {
            return false;
        }
        n8 += n6;
        n3 += n;
        n4 += n2;
        return !((n7 += n5) >= n5 && n7 <= n || n8 >= n6 && n8 <= n2 || n3 >= n && n3 <= n5 || n4 >= n2 && n4 <= n6);
    }

    public boolean b(fvE fvE2) {
        if (fvE2.getElementMap() != null) {
            String string = fvE2.getElementMap().c();
            for (String string2 : this.d.keySet()) {
                if (!string.startsWith(string2)) continue;
                return this.d.get(string2).contains(fvE2);
            }
        }
        return false;
    }

    public fvE a(fyb_0 fyb_02) {
        if (fyb_02.getElementMap() != null) {
            String string = fyb_02.getElementMap().c();
            for (String string2 : this.e.keySet()) {
                if (!string.startsWith(string2) || this.e.get(string2).size() <= 1) continue;
                Stack<fvE> stack = this.e.get(string2);
                for (fvE fvE2 : stack) {
                    if (fvE2 != fyb_02) continue;
                    int n = stack.indexOf(fvE2) - 1;
                    return n < 0 ? null : (fvE)stack.get(n);
                }
            }
        }
        return null;
    }

    public void a(String string, fvE fvE2) {
        ArrayList<fvE> arrayList = this.d.get(string);
        if (arrayList == null) {
            return;
        }
        if (fvE2 != null) {
            this.a(arrayList, fvE2);
        }
    }

    private void a(ArrayList<fvE> arrayList, fvE fvE2) {
        int n = fvE2.getHeight();
        int n2 = fvE2.getWidth();
        if (n == 0) {
            n = fvE2.getPrefSize().height;
        }
        if (n2 == 0) {
            n2 = fvE2.getPrefSize().width;
        }
        fyT[] fyTArray = this.a(fvE2.getX(), fvE2.getY(), n2, n, this.c.getWidth(), this.c.getHeight());
        int n3 = 0;
        int n4 = arrayList.size();
        for (fyT fyT2 : fyTArray) {
            if (n3 >= n4) break;
            n3 += this.a(fyT2, arrayList, n3);
        }
        if (n3 < n4) {
            for (int k = n3; k < n4; ++k) {
                fvE fvE3 = arrayList.get(k);
                if (fvE3 == fvE2) continue;
                fvE3.setPosition(this.a(fvE3));
            }
        }
    }

    private int a(fyT fyT2, ArrayList<fvE> arrayList, int n) {
        int n2;
        if (arrayList.size() == 0 || n < 0 || n >= arrayList.size()) {
            return 0;
        }
        int n3 = 0;
        fvE fvE2 = null;
        int n4 = arrayList.size();
        for (n2 = n; n2 < n4; ++n2) {
            fvE fvE3 = arrayList.get(n2);
            if (fvE3.getWidth() != 0 && fvE3.getHeight() != 0 && fvE3.getVisible()) {
                fvE2 = fvE3;
                break;
            }
            ++n3;
            ++n;
        }
        if (fvE2 == null) {
            return n3;
        }
        n2 = fyT2.a(fvE2.getWidth());
        n4 = fyT2.b(fvE2.getHeight());
        int n5 = Integer.MAX_VALUE;
        int n6 = Integer.MAX_VALUE;
        while (fyT2.c(n2)) {
            while (fyT2.d(n4)) {
                int n7;
                int n8;
                if (this.b((int)fyT2.getX(), (int)fyT2.getY(), (int)fyT2.getWidth(), (int)fyT2.getHeight(), n2, n4, fvE2.getWidth(), fvE2.getHeight())) {
                    fvE2.setPosition(n2, n4);
                    ++n3;
                    n4 += fyT2.f(fvE2.getHeight());
                    n8 = arrayList.size();
                    for (n7 = ++n; n7 < n8; ++n7) {
                        fvE fvE4 = arrayList.get(n7);
                        if (fvE4.getWidth() != 0 && fvE4.getHeight() != 0 && fvE4.getVisible()) {
                            fvE2 = fvE4;
                            break;
                        }
                        ++n3;
                        ++n;
                    }
                    if (n != arrayList.size()) continue;
                    return n3;
                }
                int n9 = n2 < 0 ? Math.abs(n2) : (n7 = n2 + fvE2.getWidth() > this.c.getWidth() ? n2 + fvE2.getWidth() - this.c.getWidth() : -1);
                int n10 = n4 < 0 ? Math.abs(n4) : (n8 = n4 + fvE2.getHeight() > this.c.getHeight() ? n4 + fvE2.getHeight() - this.c.getHeight() : -1);
                if (n7 == -1 || n8 == -1 || n7 >= Integer.MAX_VALUE || n8 >= Integer.MAX_VALUE) break;
                ++n3;
                break;
            }
            n4 = fyT2.b(fvE2.getHeight());
            n2 += fyT2.e(fvE2.getWidth());
        }
        return n3;
    }

    private boolean b(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        return this.c(n, n2, n3, n4, n5, n6, n7, n8) && this.c(n5, n6, n7, n8);
    }

    private boolean c(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        return this.b(n, n3, n5, n7) && this.a(n2, n4, n6, n8);
    }

    private boolean a(int n, int n2, int n3, int n4) {
        return n3 < n + n2 && n3 + n4 > n;
    }

    private boolean b(int n, int n2, int n3, int n4) {
        return n3 < n + n2 && n3 + n4 > n;
    }

    private boolean c(int n, int n2, int n3, int n4) {
        return n >= 0 && n2 >= 0 && n + n3 < this.c.getWidth() && n2 + n4 < this.c.getHeight();
    }

    private fyT[] a(int n, int n2, int n3, int n4, int n5, int n6) {
        fyT[] fyTArray = new fyT[]{new fyT(n, n2 + n4, n3, n6 - n2 - n4, frm_0.b), new fyT(n, 0, n3, n2, frm_0.a), new fyT(0, n2, n, n4, frm_0.c), new fyT(n + n3, n2, n5 - n - n3, n4, frm_0.d)};
        Arrays.sort(fyTArray, fyu_0.a);
        return fyTArray;
    }
}

