/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVL
 */
public class avl_0
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    private final int d;
    private final String e;

    public avl_0(int n) {
        this(n, null);
    }

    public avl_0(int n, String string) {
        this.d = n;
        this.e = string == null ? null : Cz.e(string).strip();
    }

    @Override
    public boolean a() {
        return this.d == 2 || (this.d == 0 || this.d == 1) && this.e != null && !this.e.isBlank() && this.e.length() < 25;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("You must be connected to use this command");
            return;
        }
        Pt pt = new Pt();
        switch (this.d) {
            case 0: {
                pt.a((short)102);
                pt.a(this.e);
                break;
            }
            case 1: {
                pt.a((short)460);
                pt.a(this.e);
                break;
            }
            case 2: {
                pt.a((short)130);
                break;
            }
            default: {
                return;
            }
        }
        pt.a((byte)4);
        aaw_22.c(pt);
    }
}

