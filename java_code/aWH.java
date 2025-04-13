/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class aWH
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    private final int j;
    private List<Integer> k = null;

    public aWH(int n) {
        this.j = n;
    }

    public aWH(int n, int n2) {
        this(n, Collections.singletonList(n2));
    }

    public aWH(int n, List<Integer> list) {
        this.j = n;
        this.k = list;
    }

    @Override
    public boolean a() {
        switch (this.j) {
            case 0: 
            case 3: 
            case 5: 
            case 7: 
            case 8: {
                return true;
            }
            case 1: 
            case 2: 
            case 4: 
            case 6: {
                return this.k != null && this.k.size() > 0;
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
        switch (this.j) {
            case 0: {
                aWH.g();
                break;
            }
            case 1: {
                this.d();
                break;
            }
            case 2: {
                this.a(aaw_22, true, this.e());
                break;
            }
            case 4: {
                this.a(aaw_22, false, this.e());
                break;
            }
            case 3: {
                this.a(aaw_22, true, this.f());
                break;
            }
            case 5: {
                this.a(aaw_22, false, this.f());
                break;
            }
            case 6: {
                this.a(aaw_22, this.e());
                break;
            }
            case 7: {
                this.a(aaw_22);
                break;
            }
            case 8: {
                aWH.c();
            }
        }
    }

    private static void c() {
        Optional optional = bhh_1.a(end_0.m);
        if (optional.isPresent()) {
            aWH.a("Guide account data :");
            aWH.a("discovered = " + ((fjh_0)optional.get()).a());
            aWH.a("unread = " + ((fjh_0)optional.get()).b());
            aWH.a(" ");
        } else {
            aWH.c("Missing tutorial data for this account");
        }
    }

    private void d() {
        for (Integer n : this.k) {
            dfc dfc2 = new dfc(17438);
            dfc2.b(n);
            add_2.b().a(dfc2);
        }
    }

    private void a(aaw_2 aaw_22, boolean bl, Set<Integer> set) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)3);
        pt.a(bl);
        pt.b((short)set.size());
        set.forEach(pt::a);
        aaw_22.c(pt);
    }

    private void a(aaw_2 aaw_22, Set<Integer> set) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)75);
        pt.a(false);
        pt.b((short)set.size());
        set.forEach(pt::a);
        aaw_22.c(pt);
    }

    private void a(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)75);
        pt.a(true);
        aaw_22.c(pt);
    }

    private Set<Integer> e() {
        Set<Integer> set = this.f();
        return this.k.stream().filter(set::contains).collect(Collectors.toSet());
    }

    private Set<Integer> f() {
        return brp_2.a().b();
    }

    private static void g() {
        aWH.a("(help | h) : show full documentation");
        aWH.a("(show | s) ids... : show the given guide(s) in a popup");
        aWH.a("read ids... : mark given guide(s) as read");
        aWH.a("readAll : mark all guides as read");
        aWH.a("discover ids... : discover guide(s) and/or mark it as unread");
        aWH.a("discoverAll : discover all guides and/or mark them as unread");
        aWH.a("remove ids... : remove guide(s) from this account");
        aWH.a("removeAll : remove all guides from this account");
        aWH.a("info : print guides discovered/read by this account ");
    }
}

