/*
 * Decompiled with CFR 0.152.
 */
public class aXA
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    private final int e;
    private final Object[] f;

    public aXA(int n, Object ... objectArray) {
        this.e = n;
        this.f = objectArray;
    }

    @Override
    public boolean a() {
        switch (this.e) {
            case 0: {
                return true;
            }
            case 1: 
            case 3: {
                return this.f.length == 0 || (Long)this.f[0] > 0L;
            }
            case 2: {
                return this.f.length > 0 && (this.f.length == 1 || (Long)this.f[0] > 0L);
            }
        }
        return false;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Can't use this command: you're not logged in!");
            return;
        }
        switch (this.e) {
            case 0: {
                aXA.c();
                return;
            }
            case 1: {
                this.a(aaw_22);
                return;
            }
            case 2: {
                this.b(aaw_22);
                return;
            }
            case 3: {
                this.c(aaw_22);
                return;
            }
        }
    }

    private static void c() {
        aXA.a("\"help\" | \"h\" : show help");
        aXA.a("\"get\" : show the players quota of the current instance");
        aXA.a("\"get\" &lt;instance_id&gt; : show the players quota of the given instance");
        aXA.a("\"set\" &lt;players_quota&gt; : set the players quota of the current instance to the given value");
        aXA.a("\"set\" &lt;instance_id&gt; &lt;players_quota&gt; : set the players quota of the given instance to the given value");
        aXA.a("\"reset\" : reset the players quota of the current instance to its original value");
        aXA.a("\"reset\" &lt;instance_id&gt; : reset the players quota of the given instance to its original value");
    }

    private void a(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)403);
        if (this.f.length == 0) {
            pt.a(azu_0.j().k().T_());
        } else {
            pt.a((Long)this.f[0]);
        }
        aaw_22.c(pt);
    }

    private void b(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)494);
        if (this.f.length == 1) {
            pt.a(azu_0.j().k().T_());
            pt.a((Integer)this.f[0]);
        } else {
            pt.a((Long)this.f[0]);
            pt.a((Integer)this.f[1]);
        }
        aaw_22.c(pt);
    }

    private void c(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)438);
        if (this.f.length == 0) {
            pt.a(azu_0.j().k().T_());
        } else {
            pt.a((Long)this.f[0]);
        }
        aaw_22.c(pt);
    }
}

