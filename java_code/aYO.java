/*
 * Decompiled with CFR 0.152.
 */
public class aYO
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    private final int c;
    private final int d;
    private final boolean e;

    public aYO(int n) {
        this(n, -1, false);
    }

    public aYO(int n, int n2, boolean bl) {
        this.c = n;
        this.d = n2;
        this.e = bl;
    }

    @Override
    public boolean a() {
        return this.d > 1 || this.d == -1;
    }

    @Override
    public void b() {
        switch (this.c) {
            case 0: {
                this.e();
                break;
            }
            case 1: {
                this.d();
            }
        }
    }

    private void d() {
        aYO.a("turnduration seconds [(allFight | af)] : set the turn duration to the value given (in seconds). If the 'allFight' parameter is used, then the given turn duration will be active for the rest of the current fight.Note that this turn duration only occurs on controllable characters (not IA).On the other hand if the 'allFight' parameter is not used, the given turn duration will only be active for the current turn after what the turn duration will be set back to its default value.");
    }

    private void e() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            Pt pt = new Pt();
            pt.a((byte)3);
            pt.a((short)473);
            pt.a(this.d * 1000);
            pt.a(this.e);
            aaw_22.c(pt);
        } else {
            aVo.a().d("Pour acc\u00e9der \u00e0 cette commande il faut \u00eatre connect\u00e9 !");
        }
    }

    public static String c() {
        return null;
    }
}

