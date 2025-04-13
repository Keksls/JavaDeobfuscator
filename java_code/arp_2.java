/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from arp
 */
public class arp_2
implements arl_2 {
    private arh_2 a = null;
    private arq_2 b = arq_2.a;
    private arw_2 c = null;
    private char d = (char)48;
    private String e = "";

    public void a(arh_2 arh_22) {
        this.a = arh_22;
    }

    public void c() {
        this.b = arq_2.a;
        this.e = "";
        this.d = (char)48;
    }

    @Override
    public String a() {
        return null;
    }

    public arf_2 d() {
        this.c();
        this.c = new arw_2();
        this.c.j();
        do {
            if (this.b == arq_2.a) {
                this.d = this.a.d();
                if (this.d != '<') continue;
                this.b = arq_2.b;
                continue;
            }
            if (this.b == arq_2.b) {
                this.d = this.a.d();
                this.e();
                continue;
            }
            if (this.b != arq_2.k) continue;
            this.c.a(this.e);
            return this.c;
        } while (this.b != arq_2.k);
        this.c.a(this.e);
        return this.c;
    }

    private void e() {
        do {
            if (this.b == arq_2.b) {
                if (this.d == '/') {
                    this.c.a(true);
                    continue;
                }
                if (!Character.isLetterOrDigit(this.d)) continue;
                this.b = arq_2.d;
                this.e = this.e + this.d;
                continue;
            }
            if (this.b != arq_2.d) continue;
            if (Character.isLetterOrDigit(this.d)) {
                this.b = arq_2.d;
                this.e = this.e + this.d;
                continue;
            }
            if (this.e.length() <= 0) continue;
            if (this.d == ' ') {
                this.b = arq_2.e;
                this.f();
                break;
            }
            if (this.d == '>') {
                this.b = arq_2.k;
                break;
            }
            if (this.d != '/') continue;
            this.c.a(true);
        } while ((this.d = this.a.d()) != '\uffff' && this.b != arq_2.e && this.b != arq_2.k);
    }

    private void f() {
        Object object = "";
        while (this.b != arq_2.k && (this.d = this.a.e()) != '\uffff') {
            if (this.b == arq_2.e) {
                this.a.d();
                if (Character.isLetterOrDigit(this.d)) {
                    object = (String)object + this.d;
                    this.b = arq_2.f;
                    continue;
                }
                if (this.d == ' ') continue;
                if (this.d == '/') {
                    this.c.b(true);
                    continue;
                }
                if (this.d != '>') continue;
                this.b = arq_2.k;
                return;
            }
            if (this.b == arq_2.f) {
                this.a.d();
                if (Character.isLetterOrDigit(this.d)) {
                    object = (String)object + this.d;
                    continue;
                }
                if (this.d == ' ') {
                    this.b = arq_2.g;
                    continue;
                }
                if (this.d == '=') {
                    this.b = arq_2.h;
                    this.c.a((String)object, this.g());
                    continue;
                }
                if (this.d != '>') continue;
                this.b = arq_2.k;
                this.c.a((String)object, null);
                return;
            }
            if (this.b == arq_2.j) {
                if (Character.isLetterOrDigit(this.d)) {
                    this.b = arq_2.f;
                    this.f();
                    continue;
                }
                if (this.d == '>') {
                    this.a.d();
                    this.b = arq_2.k;
                    return;
                }
                this.a.d();
                continue;
            }
            if (this.b != arq_2.g) continue;
            if (this.d == '=') {
                this.a.d();
                this.b = arq_2.h;
                this.c.a((String)object, this.g());
                continue;
            }
            if (this.d == '>') {
                this.a.d();
                this.b = arq_2.k;
                this.c.a((String)object, null);
                return;
            }
            if (Character.isLetterOrDigit(this.d)) {
                this.c.a((String)object, null);
                this.b = arq_2.f;
                this.f();
                continue;
            }
            this.a.d();
        }
    }

    private String g() {
        boolean bl = false;
        boolean bl2 = false;
        StringBuilder stringBuilder = new StringBuilder();
        while ((this.d = this.a.d()) != '\uffff') {
            if (this.b == arq_2.h) {
                if (this.d == '\'') {
                    bl = true;
                    this.b = arq_2.i;
                    continue;
                }
                if (this.d == '\"') {
                    bl2 = true;
                    this.b = arq_2.i;
                    continue;
                }
                if (this.d == ' ') continue;
                stringBuilder.append(this.d);
                this.b = arq_2.i;
                continue;
            }
            if (this.b != arq_2.i) continue;
            if (this.d == ' ') {
                if (bl || bl2) {
                    stringBuilder.append(this.d);
                    continue;
                }
                this.b = arq_2.j;
                return stringBuilder.toString();
            }
            if (this.d == '\'') {
                if (bl) {
                    this.b = arq_2.j;
                    return stringBuilder.toString();
                }
                stringBuilder.append(this.d);
                continue;
            }
            if (this.d == '\"') {
                if (bl2) {
                    this.b = arq_2.j;
                    return stringBuilder.toString();
                }
                stringBuilder.append(this.d);
                continue;
            }
            if (this.d == '>') {
                this.b = arq_2.k;
                return stringBuilder.toString();
            }
            stringBuilder.append(this.d);
        }
        return stringBuilder.toString();
    }

    public /* synthetic */ arb_1 b() {
        return this.d();
    }
}

