/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from arr
 */
public class arr_2
implements arl_2 {
    private String a = null;
    private arh_2 b = null;
    private arf_2 c = null;

    public void a(arh_2 arh_22) {
        this.b = arh_22;
    }

    public void a(arf_2 arf_22) {
        this.c = arf_22;
    }

    @Override
    public String a() {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public arg_2 c() {
        Object object;
        StringBuilder stringBuilder = new StringBuilder();
        this.a = "";
        char c2 = this.b.e();
        while (c2 != '\uffff' && c2 != '\u0000') {
            block6: {
                block5: {
                    if (c2 != '<') break block5;
                    if (this.c != null) {
                        object = this.c.f();
                        if (((String)object).equalsIgnoreCase("script")) {
                            int n = this.b.a() + 2;
                            String string = this.b.a(n, n + "/script".length());
                            if (string.contains("script") || string.contains("SCRIPT")) {
                                this.a = stringBuilder.toString();
                                break;
                            }
                            stringBuilder.append(c2);
                            this.b.d();
                        }
                        break block6;
                    } else {
                        this.a = stringBuilder.toString();
                        break;
                    }
                }
                stringBuilder.append(c2);
                this.b.d();
            }
            c2 = this.b.e();
        }
        object = new arx_2();
        ((arx_2)object).a(this.a);
        return object;
    }

    public /* synthetic */ arb_1 b() {
        return this.c();
    }
}

