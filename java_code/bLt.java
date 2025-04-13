/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public abstract class bLt {
    public static final bLw a = new bLw();
    public static final bLt b = new bLu();

    public abstract void a(fjg_1 var1);

    public List<fjg_1> a(List<fjg_1> list) {
        return list;
    }

    static boolean b(fjg_1 fjg_12) {
        if (fjg_12.j() instanceof afc) {
            afc afc2 = (afc)fjg_12.j();
            switch (afc2.b) {
                case 48: {
                    Object Info = fjs.a.a(fjv.d, afc2.a);
                    return ((fjB)Info).h() != null;
                }
            }
        } else if (fjg_12.j() instanceof afd) {
            afd afd2 = (afd)fjg_12.j();
            if (afd2.h != -1) {
                bhr_1 bhr_12 = azu_0.j().k().eK();
                return !bhr_12.a(afd2.h) || bhr_12.b(afd2.h);
            }
            if (afd2.f == buq_0.d.a()) {
                if (afd2.g <= 0) {
                    return true;
                }
                ece_0 ece_02 = bgg.a.b();
                return ece_02.e(afd2.g);
            }
        }
        return true;
    }

    static void a(fjg_1 fjg_12, fjv fjv2) {
        switch (fjv2) {
            case d: {
                fjg_12.a(bLs.e);
                break;
            }
            case c: {
                fjg_12.a(bLs.d);
                break;
            }
            case b: {
                fjg_12.a(bLs.c);
                break;
            }
            case a: {
                fjg_12.a(bLs.b);
            }
        }
    }
}

