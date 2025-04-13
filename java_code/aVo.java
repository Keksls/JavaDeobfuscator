/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class aVo {
    private static final aVo a = new aVo();
    private final List<aVp> b = new ArrayList<aVp>();

    public static aVo a() {
        return a;
    }

    private aVo() {
    }

    public void a(aVp aVp2) {
        this.b.add(aVp2);
    }

    public boolean b(aVp aVp2) {
        if (this.b.contains(aVp2)) {
            this.b.remove(aVp2);
            return true;
        }
        return false;
    }

    public List<aVp> b() {
        return this.b;
    }

    public void a(String string) {
        for (aVp aVp2 : this.b) {
            aVp2.a(string);
        }
    }

    public void b(String string) {
        for (aVp aVp2 : this.b) {
            aVp2.d(string);
        }
    }

    public void c(String string) {
        for (aVp aVp2 : this.b) {
            aVp2.c(string);
        }
    }

    public void a(String string, int n) {
        for (aVp aVp2 : this.b) {
            aVp2.a(string, n);
        }
    }

    public void d(String string) {
        for (aVp aVp2 : this.b) {
            aVp2.e(string);
        }
    }
}

