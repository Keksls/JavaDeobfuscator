/*
 * Decompiled with CFR 0.152.
 */
public class dhL
extends dfc {
    private int b;
    private int c;
    private int d;
    private int e;

    public dhL(int n, int n2, int n3, int n4, int n5) {
        this.c = n2;
        this.d = n3;
        this.b = n4;
        this.e = n5;
        this.a_(n);
    }

    public dhL() {
    }

    public static void a(int n, int n2, int n3) {
        dhL.a((short)17976, n, n2, n3, 0);
    }

    public static void b(int n, int n2, int n3) {
        dhL.a((short)16119, n, n2, n3, 0);
    }

    public static void a(int n, int n2, int n3, int n4) {
        dhL.a((short)16119, n, n2, n3, n4);
    }

    public static void a(int n, int n2) {
        dhL.a((short)19751, n, n2, 0, 0);
    }

    public static void b(int n, int n2) {
        dhL.a((short)18907, n, n2, 0, 0);
    }

    private static void a(short s2, int n, int n2, int n3, int n4) {
        dhL dhL2 = new dhL(s2, n, n2, n3, n4);
        assert (dhL2.a() == s2);
        add_2.b().a(dhL2);
    }

    public dhL k() {
        dhL dhL2 = new dhL();
        dhL2.a_(this.a());
        dhL2.c = this.c;
        dhL2.d = this.d;
        dhL2.b = this.b;
        dhL2.e = this.e;
        return dhL2;
    }

    public boolean o() {
        return this.b == 1;
    }

    public boolean p() {
        return this.b == 2;
    }

    public boolean q() {
        return this.b == 3;
    }

    public int r() {
        return this.c;
    }

    public int s() {
        return this.d;
    }

    private static boolean c(int n) {
        return ((aNF)ans_0.D().c()).f(n);
    }

    public static boolean t() {
        return dhL.c(1);
    }

    public static boolean u() {
        return dhL.c(3);
    }

    public static boolean v() {
        return dhL.c(2);
    }

    public int w() {
        return this.e;
    }
}

