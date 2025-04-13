/*
 * Decompiled with CFR 0.152.
 */
public class aYf
extends aXj {
    private final byte a;

    public aYf(byte by) {
        this.a = by;
    }

    @Override
    public boolean a() {
        return this.a == 0 || this.a == 1 || this.a == 2 || this.a == 3;
    }

    @Override
    public void b() {
        if (this.a == 3) {
            this.c();
            return;
        }
        this.a((byte)1);
        this.a((byte)2);
    }

    private void c() {
        aYf.a("Syntax: serverlock <command>");
        aYf.a("(h) : show help");
        aYf.a("(on|off) : enable or disable admin-only restriction");
        aYf.a("() : retrieve lock status");
    }

    private void a(byte by) {
        Pt pt = new Pt();
        pt.a(by);
        pt.a((short)304);
        pt.b(this.a);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
        }
    }
}

