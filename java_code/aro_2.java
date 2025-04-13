/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aro
 */
public class aro_2
implements arl_2 {
    private arh_2 a = null;
    private arf_2 b = null;

    void a(arh_2 arh_22) {
        this.a = arh_22;
    }

    void a(arf_2 arf_22) {
        this.b = arf_22;
    }

    @Override
    public String a() {
        return null;
    }

    public arb_1 b() {
        char c2;
        arv_2 arv_22 = new arv_2();
        StringBuilder stringBuilder = new StringBuilder();
        while ((c2 = this.a.e()) != '\uffff') {
            if (c2 == '<') {
                if (this.b != null) {
                    String string = this.b.f();
                    if (string.equalsIgnoreCase(this.b.f())) {
                        int n = this.a.a() + 2;
                        String string2 = this.a.a(n, n + ("/" + this.b.f()).length());
                        if (string2.contains(this.b.f().toLowerCase()) || string2.contains(this.b.f().toUpperCase())) {
                            arv_22.a(this.b);
                            arv_22.a(stringBuilder.toString());
                            return arv_22;
                        }
                        stringBuilder.append(c2);
                        this.a.d();
                        continue;
                    }
                    this.a.d();
                    continue;
                }
                arv_22.a(stringBuilder.toString());
                return arv_22;
            }
            stringBuilder.append(c2);
            this.a.d();
        }
        return arv_22;
    }
}

