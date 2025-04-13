/*
 * Decompiled with CFR 0.152.
 */
public final class aYh
extends aXj {
    private final int a;

    public aYh() {
        this(-1);
    }

    public aYh(int n) {
        this.a = n;
    }

    @Override
    public boolean a() {
        int n = this.c();
        return this.a == -1 || n == 50000 || n == 40000 || n == 30000 || n == 20000 || n == 10000;
    }

    private int c() {
        return this.a * 10000;
    }

    @Override
    public void b() {
        if (this.a == -1) {
            String string = "setitemtrackerloglevel|sitll help|h : show full documentation\nsetitemtrackerloglevel|sitll levelId : set logging level\nPossible values :\n1 : DEBUG\n2 : INFO\n3 : WARN\n4 : ERROR\n5 : FATAL\n";
            aVo.a().a("setitemtrackerloglevel|sitll help|h : show full documentation\nsetitemtrackerloglevel|sitll levelId : set logging level\nPossible values :\n1 : DEBUG\n2 : INFO\n3 : WARN\n4 : ERROR\n5 : FATAL\n");
            return;
        }
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)136);
        pt.a(this.c());
        aaw_22.c(pt);
    }
}

