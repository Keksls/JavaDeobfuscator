/*
 * Decompiled with CFR 0.152.
 */
public class aWA
extends aXj {
    private final long a;

    public aWA() {
        this(azu_0.j().k().R());
    }

    public aWA(long l) {
        this.a = l;
    }

    @Override
    public boolean a() {
        return this.a > 0L;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("You must be connected to use this command");
            return;
        }
        aWA.a("\n===== Game Account Data for account " + this.a + " =====");
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a((short)358);
        pt.a(this.a);
        aaw_22.c(pt);
    }
}

