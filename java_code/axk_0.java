/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aXK
 */
public class axk_0
extends aXj {
    private String a;

    public axk_0(String string) {
        this.a = string;
    }

    @Override
    public boolean a() {
        return !this.a.isEmpty();
    }

    @Override
    public void b() {
        if (this.a.isEmpty() || this.a.contains("missing ESCAPED_STRING")) {
            aVo.a().d("Message is too short.");
            return;
        }
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        if (this.a.indexOf(34) == 0) {
            this.a = this.a.substring(1);
        }
        if (this.a.indexOf(34) == this.a.length() - 1) {
            this.a = this.a.substring(0, this.a.length() - 1);
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)139);
        pt.a(this.a);
        aaw_22.c(pt);
    }
}

