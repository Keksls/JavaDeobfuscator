/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class ZG {
    private final int a;
    private final ArrayList<ZM> b = new ArrayList();

    public ZG() {
        this(0);
    }

    public ZG(int n) {
        this.a = n;
    }

    public int a() {
        return this.a;
    }

    public final void a(ZL zL) {
        if (zL != null) {
            this.b.add(new ZM(zL, this.a));
        }
    }

    ArrayList<ZM> b() {
        return this.b;
    }

    public final int c() {
        return this.b.size();
    }

    public String toString() {
        return "[ Ambiance : " + this.c() + " effect(s)";
    }

    public void a(int n) {
        for (int k = 0; k < this.b.size(); ++k) {
            this.b.get(k).a(n);
        }
    }
}

