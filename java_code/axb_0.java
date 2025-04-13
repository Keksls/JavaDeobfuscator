/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aXB
 */
public class axb_0
extends aXj {
    private final String a;
    private String b;

    public axb_0(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    @Override
    public boolean a() {
        return this.a != null && !this.a.isEmpty();
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        this.b = this.b.substring(1, this.b.length() - 1);
        if (this.b.isEmpty() || this.b.contains("ESCAPED_STRING")) {
            aVo.a().d("Message is too short");
            return;
        }
        if (this.b.length() > 255) {
            aVo.a().d("Message is too long.");
            return;
        }
        axb_0.a(aaw_22);
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a((short)458);
        pt.a(this.b);
        pt.a(this.a);
        aaw_22.c(pt);
    }

    private static void a(aaw_2 aaw_22) {
        Pt pt = new Pt();
        pt.a((byte)2);
        pt.a((short)299);
        pt.b(Byte.parseByte("0"));
        aaw_22.c(pt);
    }
}

