/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOU
 */
public class eou_1 {
    private final int[] a;
    private final boolean[] b;

    public eou_1() {
        int n = eps_0.y() + 1;
        this.a = new int[n];
        this.b = new boolean[n];
        for (eps_0 eps_02 : eps_0.values()) {
            this.a(eps_02, eps_02.j());
        }
    }

    public int a(ru_0 ru_02) {
        return this.a[ru_02.a()];
    }

    public void a(ru_0 ru_02, int n) {
        this.a[ru_02.a()] = n;
        this.b[ru_02.a()] = true;
    }

    public boolean b(ru_0 ru_02) {
        return this.b[ru_02.a()];
    }
}

