/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.List;

public class aWT
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final String[] h = new String[0];
    private final int i;
    private final List<Integer> j;
    private final String[] k;

    public aWT(int n, String ... stringArray) {
        this.i = n;
        this.k = stringArray;
        this.j = Collections.emptyList();
    }

    public aWT(int n, List<Integer> list) {
        this.i = n;
        this.k = h;
        this.j = list;
    }

    @Override
    public boolean a() {
        switch (this.i) {
            case 0: 
            case 2: {
                return this.k.length == 0;
            }
            case 1: 
            case 4: 
            case 5: 
            case 6: {
                return this.j != null && !this.j.isEmpty();
            }
            case 3: {
                return this.k.length == 1;
            }
        }
        return false;
    }

    @Override
    public void b() {
        if (this.i == 0) {
            aWT.i();
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null || bmr_12.bz() == null || !bmr_12.bz().af_().O()) {
            aVo.a().d("You are not in an Infinite Waves fight");
            return;
        }
        switch (this.i) {
            case 1: {
                this.c();
                break;
            }
            case 2: {
                aWT.d();
                break;
            }
            case 3: {
                this.e();
                break;
            }
            case 4: {
                this.f();
                break;
            }
            case 5: {
                this.g();
                break;
            }
            case 6: {
                this.h();
            }
        }
    }

    private void c() {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)50);
        this.j.forEach(pt::a);
        aWT.a(pt);
    }

    private static void d() {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)496);
        aWT.a(pt);
    }

    private void e() {
        int n = Integer.parseInt(this.k[0]);
        if (n < 0) {
            aVo.a().d("Value should be a positive integer");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)111);
        pt.a(n);
        aWT.a(pt);
    }

    private void f() {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)307);
        this.j.stream().map(Hw::c).forEach(pt::b);
        aWT.a(pt);
    }

    private void g() {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)345);
        this.j.forEach(pt::a);
        aWT.a(pt);
    }

    private void h() {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)480);
        this.j.forEach(pt::a);
        aWT.a(pt);
    }

    private static void a(Pt pt) {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Can't use this command: you're not logged in!");
            return;
        }
        aaw_22.c(pt);
    }

    private static void i() {
        aWT.a("(help | h) : show full documentation");
        aWT.a("(setTurnLimit | stl) number : the fight will end on the designated turn (can end the fight immediately)");
        aWT.a("(listArtifacts | la) : show the artifact list of the current fight");
        aWT.a("(setArtifacts | sa) id id id... : define the artifacts that will appear in this fight");
        aWT.a("(forceMonsters | fm) id id id... : force the apparition of the monsters in the next wave");
        aWT.a("(forceArtifacts | fa) id id id... : force the apparition of the artifacts in the next wave");
        aWT.a("(forceLegendaryArtifacts | fla) id id id... : force the apparition of the legendary artifacts in the next applicable wave");
    }
}

