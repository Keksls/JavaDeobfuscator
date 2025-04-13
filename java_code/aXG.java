/*
 * Decompiled with CFR 0.152.
 */
public class aXG
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    private final int i;
    private final String[] j;

    public aXG(int n, String ... stringArray) {
        this.i = n;
        this.j = stringArray;
    }

    @Override
    public boolean a() {
        switch (this.i) {
            case 0: {
                return this.j.length == 0;
            }
            case 1: 
            case 5: 
            case 7: {
                return this.j.length == 1;
            }
            case 4: 
            case 6: {
                return this.j.length == 2;
            }
            case 2: 
            case 3: {
                return this.j.length == 3;
            }
        }
        return false;
    }

    @Override
    public void b() {
        switch (this.i) {
            case 0: {
                aXG.j();
                break;
            }
            case 1: {
                this.i();
                break;
            }
            case 7: {
                this.h();
                break;
            }
            case 5: {
                this.g();
                break;
            }
            case 4: {
                this.f();
                break;
            }
            case 6: {
                this.e();
                break;
            }
            case 3: {
                this.d();
                break;
            }
            case 2: {
                this.c();
            }
        }
    }

    private void c() {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)89);
        pt.a(Long.parseLong(this.j[0]));
        pt.a(Integer.parseInt(this.j[1]));
        pt.a(Integer.parseInt(this.j[2]));
        aXG.a(pt);
    }

    private void d() {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)115);
        pt.a(Long.parseLong(this.j[0]));
        pt.a(Integer.parseInt(this.j[1]));
        pt.a(Integer.parseInt(this.j[2]));
        aXG.a(pt);
    }

    private void e() {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)36);
        pt.a(Long.parseLong(this.j[0]));
        pt.a(Integer.parseInt(this.j[1]));
        aXG.a(pt);
    }

    private void f() {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)115);
        pt.a(Long.parseLong(this.j[0]));
        pt.a(Integer.parseInt(this.j[1]));
        aXG.a(pt);
    }

    private void g() {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)301);
        pt.a(Long.parseLong(this.j[0]));
        aXG.a(pt);
    }

    private void h() {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)486);
        pt.a(Long.parseLong(this.j[0]));
        aXG.a(pt);
    }

    private void i() {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)224);
        pt.a(Long.parseLong(this.j[0]));
        aXG.a(pt);
    }

    private static void j() {
        aXG.a("(help | h) : show full documentation");
        aXG.a("(add) accountId referenceId quantity : add the specified number of this item to target's pvp inventory");
        aXG.a("(clear) accountId : empty target's pvp inventory");
        aXG.a("(list) accountId : show full content of target's pvp inventory");
        aXG.a("(lock) accountId referenceId : lock item in target's pvp inventory");
        aXG.a("(remove) accountId referenceId quantity : remove the specified number of this item from target's pvp inventory");
        aXG.a("(removeAll) accountId referenceId : remove all of this item from target's pvp inventory");
        aXG.a("(unlock) accountId : unlock target's pvp inventory");
    }

    private static void a(Pt pt) {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Can't use this command: you're not logged in!");
            return;
        }
        aaw_22.c(pt);
    }
}

