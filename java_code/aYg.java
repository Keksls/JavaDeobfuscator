/*
 * Decompiled with CFR 0.152.
 */
public class aYg
extends aXj {
    private final byte a;
    private final byte b;
    private final long c;

    public aYg(byte by, int n, long l) {
        this.a = by;
        this.b = (byte)n;
        this.c = l;
    }

    public aYg(byte by, int n) {
        this(by, n, 0L);
    }

    public aYg(byte by) {
        this(by, 0);
    }

    public aYg() {
        this(1);
    }

    @Override
    public boolean a() {
        if (this.a == 2 && this.b <= 0) {
            return false;
        }
        return this.a != 3 || this.b > 0 && this.c > 0L;
    }

    @Override
    public void b() {
        byte[] byArray;
        if (this.a == 1) {
            aYg.a("Sessions management");
            aYg.a("sessions ( 'help' | 'h' ) : display command help");
            aYg.a("sessions ( 'list' | 'l' ) serverNumber : list all client sessions by server");
            aYg.a("sessions ( 'remove' | 'rm' ) serverNumber ownerId : remove all client sessions for server (only Connection or World) by ownerId");
            aYg.a("For server parameter, use number value : ");
            aYg.a("1=Connection, 2=World");
            return;
        }
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        if (this.a == 3 && this.b == 3) {
            aVo.a().d("Unable to launch remove command on game server");
            return;
        }
        for (byte by : byArray = new byte[]{1, 2, 3}) {
            if (this.b != by) continue;
            Pt pt = new Pt();
            pt.a(by);
            pt.a((short)484);
            pt.b(this.a);
            pt.a(this.c);
            aaw_22.c(pt);
        }
    }
}

