/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from did
 */
public class did_0
implements fzu {
    private final akx_2 a;
    private final String b;
    private akr_2[] c;

    public did_0(akx_2 akx_22, String string, akr_2[] akr_2Array) {
        this.a = akx_22;
        this.b = string;
        this.c = akr_2Array;
    }

    did_0(akx_2 akx_22, String string) {
        this.a = akx_22;
        this.b = string;
        this.c = null;
    }

    @Override
    public boolean run(fzs fzs2) {
        this.a.a(this.b, this.c, this.a(fzs2));
        return false;
    }

    public boolean a() {
        this.a.a(this.b, this.c, new akq_1[0]);
        return false;
    }

    public void a(akr_2[] akr_2Array) {
        this.c = akr_2Array;
    }

    private akq_1 a(fzs fzs2) {
        switch (fzs2.f()) {
            case C: 
            case D: 
            case B: 
            case A: 
            case u: 
            case E: 
            case y: 
            case z: {
                akq_1 akq_12 = new akq_1("event");
                fck_2 fck_22 = (fck_2)fzs2;
                akq_12.a("button", fck_22.x());
                akq_12.a("x", fck_22.v());
                akq_12.a("y", fck_22.w());
                akq_12.a("rotation", fck_22.z());
                return akq_12;
            }
            case a: {
                akq_1 akq_13 = new akq_1("event");
                fck_1 fck_12 = (fck_1)fzs2;
                return akq_13;
            }
            case b: {
                akq_1 akq_14 = new akq_1("event");
                fcm_2 fcm_22 = (fcm_2)fzs2;
                azj_2 azj_22 = fcm_22.j().getColor();
                akq_14.a("r", Float.valueOf(azj_22.q()));
                akq_14.a("g", Float.valueOf(azj_22.r()));
                akq_14.a("b", Float.valueOf(azj_22.s()));
                akq_14.a("a", Float.valueOf(azj_22.p()));
                return akq_14;
            }
            case I: {
                akq_1 akq_15 = new akq_1("event");
                fcq_1 fcq_12 = (fcq_1)fzs2;
                akq_15.a("value", Float.valueOf(fcq_12.j()));
                return akq_15;
            }
            case n: 
            case o: 
            case p: {
                akq_1 akq_16 = new akq_1("event");
                fcd_2 fcd_22 = (fcd_2)fzs2;
                akq_16.a("keyChar", Character.valueOf(fcd_22.j()));
                akq_16.a("keyCode", fcd_22.k());
                akq_16.a("modifiers", fcd_22.p());
                return akq_16;
            }
        }
        return null;
    }
}

