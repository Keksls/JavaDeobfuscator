/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aXa
 */
public class axa_0
extends aXj {
    final axc_0 a;

    public axa_0(axc_0 axc_02) {
        this.a = axc_02;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Can't use this command: you're not logged in!");
            return;
        }
        switch (this.a) {
            case a: {
                axa_0.c();
                break;
            }
            case b: {
                axa_0.a(aaw_22);
            }
        }
    }

    public static void c() {
        axa_0.a("help | h : show full documentation");
        axa_0.a("list_ie : List interactive elements in current partition");
    }

    private static void a(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)334);
        aaw_22.c(pt);
    }
}

