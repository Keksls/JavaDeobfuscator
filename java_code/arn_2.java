/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from arn
 */
public class arn_2
implements arl_2 {
    private arh_2 a = null;
    private boolean b = false;

    public void a(arh_2 arh_22) {
        this.a = arh_22;
    }

    @Override
    public String a() {
        return null;
    }

    public arb_1 b() {
        char c2;
        this.b = false;
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = false;
        boolean bl2 = false;
        while ((c2 = this.a.d()) != '\uffff') {
            stringBuilder.append(c2);
            if (c2 == '<') {
                if (bl || bl2 || this.a.e() != '!') continue;
                this.a.d();
                if (this.a.e() == '-') {
                    while (this.a.d() == '-') {
                    }
                    continue;
                }
                this.b = true;
                continue;
            }
            if (c2 == '\'') {
                bl = !bl;
                continue;
            }
            if (c2 == '\"') {
                bl2 = !bl2;
                continue;
            }
            if (c2 == '>') {
                if (bl || bl2 || !this.b && this.a.c(this.a.a() - 2) != '-') continue;
                break;
            }
            if (c2 != '-' || bl || bl2) continue;
            int n = this.a.a();
            int n2 = 0;
            int n3 = 5;
            while (this.a.c(n++) != '>' && n2++ < 5) {
            }
            if (n2 >= 5) continue;
        }
        aru_2 aru_22 = new aru_2();
        aru_22.a(stringBuilder.toString());
        return aru_22;
    }
}

