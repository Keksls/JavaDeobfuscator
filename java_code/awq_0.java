/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongProcedure
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.procedure.TLongProcedure;
import gnu.trove.set.hash.TLongHashSet;
import org.apache.log4j.Logger;

/*
 * Renamed from aWQ
 */
public final class awq_0
extends aXj {
    private static final Logger e = Logger.getLogger(avz_0.class);
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    private final int f;
    private final String[] g;

    public awq_0(int n, String ... stringArray) {
        this.f = n;
        this.g = (String[])stringArray.clone();
    }

    @Override
    public boolean a() {
        switch (this.f) {
            case 0: 
            case 2: 
            case 3: {
                return this.g.length == 0;
            }
            case 1: {
                return this.g.length == 2;
            }
        }
        return false;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        try {
            switch (this.f) {
                case 0: {
                    awq_0.f();
                    return;
                }
                case 1: {
                    this.e();
                    return;
                }
                case 2: {
                    this.d();
                    return;
                }
                case 3: {
                    this.c();
                    return;
                }
            }
        }
        catch (Exception exception) {
            e.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    private void c() {
        boolean bl = enp_2.a.d(ens_2.aD);
        enp_2.a.a(ens_2.aD, Boolean.toString(!bl));
        boolean bl2 = enp_2.a.d(ens_2.aD);
        fis_1.a().a("heroesEnabled", bl2);
        awq_0.a("Heroes activated = " + bl2);
    }

    private void d() {
        bai_0 bai_02 = azu_0.j().n();
        TLongHashSet tLongHashSet = euw_2.a.c(bai_02.u());
        if (tLongHashSet == null || tLongHashSet.isEmpty()) {
            awq_0.a("Aucun heros");
            return;
        }
        tLongHashSet.forEach((TLongProcedure)new aWR(this));
    }

    private void e() {
        long l = Long.parseLong(this.g[0]);
        long l2 = Long.parseLong(this.g[1]);
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)220);
        pt.a(l);
        pt.a(l2);
        aaw_22.c(pt);
    }

    private static void f() {
        awq_0.a("(hero) (help | h) : show help");
        awq_0.a("(hero) (list | l) : show available heroes");
        awq_0.a("(hero) (addXp | xp) : add xp to hero of given id");
        awq_0.a("(hero) (clientEnablingSwitch | ces) : switch enable or disable hero into client only");
    }
}

