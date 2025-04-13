/*
 * Decompiled with CFR 0.152.
 */
public class aXL
extends aXj {
    private final String a;
    private String b;

    public aXL(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    @Override
    public boolean a() {
        return !this.a.isEmpty() && !this.b.isEmpty();
    }

    @Override
    public void b() {
        if (this.b.isEmpty() || this.b.contains("missing ESCAPED_STRING")) {
            aVo.a().d("Message is too short.");
            return;
        }
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        if (this.b.indexOf(34) == 0) {
            this.b = this.b.substring(1);
        }
        if (this.b.indexOf(34) == this.b.length() - 1) {
            this.b = this.b.substring(0, this.b.length() - 1);
        }
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a((short)441);
        pt.a(this.a);
        pt.a(this.b);
        aaw_22.c(pt);
    }
}

