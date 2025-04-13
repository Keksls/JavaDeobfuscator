/*
 * Decompiled with CFR 0.152.
 */
final class acd {
    private static final ys_0[] b;
    private static final String c = "debug_walkable";
    private static final String d = "debug_non_walkable";
    private static final String e = "debug_mobosteryl";
    private static final String f = "debug_resourcesteryl";
    private static final String g = "debug_partition_border";
    private static final String h = "debug_partition_border2";
    private static boolean i;
    private static boolean j;
    static final /* synthetic */ boolean a;

    private acd() {
    }

    public static void a(boolean bl) {
        i = bl;
        try {
            if (i) {
                aif_0 aif_02 = aii_0.a().b(c);
                aif_02.a(new float[]{0.1f, 0.7f, 0.1f, 0.5f});
                aif_0 aif_03 = aii_0.a().b(d);
                aif_03.a(new float[]{0.7f, 0.1f, 0.1f, 0.5f});
                aif_0 aif_04 = aii_0.a().b(e);
                aif_04.a(new float[]{0.7f, 0.4f, 0.1f, 0.5f});
                aif_0 aif_05 = aii_0.a().b(f);
                aif_05.a(new float[]{0.1f, 0.1f, 0.7f, 0.5f});
            } else {
                aii_0.a().c(c);
                aii_0.a().c(d);
                aii_0.a().c(e);
                aii_0.a().c(f);
            }
        }
        catch (Exception exception) {
            acb_0.n.error((Object)"", (Throwable)exception);
        }
    }

    public static void b(boolean bl) {
        j = bl;
        try {
            if (j) {
                aif_0 aif_02 = aii_0.a().b(g);
                aif_02.a(new float[]{0.9f, 0.9f, 0.9f, 0.8f});
                aif_0 aif_03 = aii_0.a().b(h);
                aif_03.a(new float[]{0.1f, 0.1f, 0.1f, 0.8f});
            } else {
                aii_0.a().c(g);
                aii_0.a().c(h);
            }
        }
        catch (Exception exception) {
            acb_0.n.error((Object)"", (Throwable)exception);
        }
    }

    static boolean a() {
        return i;
    }

    static boolean b() {
        return j;
    }

    static void a(int n, int n2) {
        if (!a && !i) {
            throw new AssertionError();
        }
        aii_0.a().e(c);
        aii_0.a().e(d);
        aii_0.a().e(e);
        aii_0.a().e(f);
        for (int k = n - 18; k < n + 18; ++k) {
            for (int i2 = n2 - 18; i2 < n2 + 18; ++i2) {
                yx_0 yx_02 = yz_0.a(k, i2);
                if (yx_02 == null) continue;
                int n3 = yx_02.a().a(k, i2, b, 0);
                for (int i3 = 0; i3 < n3; ++i3) {
                    if (acd.b[i3].c == Short.MIN_VALUE) continue;
                    long l = aii_0.a(k, i2, acd.b[i3].c);
                    if (acd.b[i3].e) {
                        aii_0.a().a(l, d);
                        continue;
                    }
                    boolean bl = yx_02.a(k, i2, acd.b[i3].c);
                    if (bl || acd.b[i3].z == -1) {
                        aii_0.a().a(l, d);
                        continue;
                    }
                    if (b[i3].i()) {
                        aii_0.a().a(l, e);
                        continue;
                    }
                    if (b[i3].k()) {
                        aii_0.a().a(l, f);
                        continue;
                    }
                    aii_0.a().a(l, c);
                }
            }
        }
    }

    static void b(int n, int n2) {
        if (!a && !i) {
            throw new AssertionError();
        }
        aii_0.a().e(g);
        aii_0.a().e(h);
        for (int k = n - 18; k < n + 18; ++k) {
            for (int i2 = n2 - 18; i2 < n2 + 18; ++i2) {
                yx_0 yx_02 = yz_0.a(k, i2);
                if (yx_02 == null) continue;
                int n3 = yx_02.a().a(k, i2, b, 0);
                for (int i3 = 0; i3 < n3; ++i3) {
                    if (acd.b[i3].c == Short.MIN_VALUE || !XZ.a(k, i2)) continue;
                    int n4 = XZ.a(k);
                    int n5 = XZ.b(i2);
                    long l = aii_0.a(k, i2, acd.b[i3].c);
                    String string = (n4 + n5) % 2 == 0 ? g : h;
                    aii_0.a().a(l, string);
                }
            }
        }
    }

    static {
        a = !acb_0.class.desiredAssertionStatus();
        b = ys_0.b();
    }
}

