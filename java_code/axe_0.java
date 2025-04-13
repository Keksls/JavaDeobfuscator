/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aXe
 */
public class axe_0
extends aXj {
    final Long a;
    final axg_0 b;

    public axe_0(axg_0 axg_02) {
        this(axg_02, null);
    }

    public axe_0(axg_0 axg_02, Long l) {
        this.b = axg_02;
        this.a = l;
    }

    @Override
    public boolean a() {
        switch (this.b) {
            case a: {
                return true;
            }
            case b: 
            case c: 
            case d: {
                return this.a != null;
            }
        }
        return false;
    }

    @Override
    public void b() {
        switch (this.b) {
            case a: {
                axe_0.c();
                break;
            }
            case b: {
                this.a((short)346);
                break;
            }
            case c: {
                this.a((short)127);
                break;
            }
            case d: {
                this.a((short)236);
            }
        }
    }

    public static void c() {
        axe_0.a("help | h : show full documentation");
        axe_0.a("status <IEId> : show status specific IE");
        axe_0.a("lock <IEId> : lock specific IE");
        axe_0.a("unlock <IEId> : unlock specific IE");
    }

    private void a(short s2) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a(s2);
        pt.a(this.a);
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            axe_0.c("Please log in for use current command !");
        }
    }
}

