/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ars
 */
public class ars_2
implements arl_2 {
    private arh_2 a = null;
    private arw_2 b = null;
    private art_2 c = art_2.a;
    private char d;

    public ars_2(arh_2 arh_22) {
        this.a(arh_22);
        this.b = new arw_2();
    }

    public void a(arh_2 arh_22) {
        this.a = arh_22;
    }

    private void d() {
        this.c = art_2.a;
        if (this.b != null) {
            this.b.j();
        } else {
            this.b = new arw_2();
        }
    }

    public arf_2 c() {
        this.d();
        int n = this.a.a();
        this.b.b(n);
        do {
            if (this.c == art_2.a) {
                this.d = this.a.d();
                if (this.d != '<') continue;
                this.c = art_2.b;
                continue;
            }
            if (this.c == art_2.b) {
                this.d = this.a.d();
                this.e();
                continue;
            }
            if (this.c != art_2.k) continue;
            return this.b;
        } while (this.c != art_2.k);
        int n2 = this.a.a();
        this.b.a(n2);
        this.b.b(this.a.a(n, n2));
        return this.b;
    }

    private void e() {
        StringBuilder stringBuilder = new StringBuilder();
        do {
            if (this.c == art_2.b) {
                if (this.d == '/') {
                    this.b.a(true);
                    continue;
                }
                if (!Character.isLetterOrDigit(this.d)) continue;
                this.c = art_2.d;
                stringBuilder.append(this.d);
                continue;
            }
            if (this.c != art_2.d) continue;
            if (Character.isLetterOrDigit(this.d)) {
                this.c = art_2.d;
                stringBuilder.append(this.d);
                continue;
            }
            if (stringBuilder.length() <= 0) continue;
            if (this.d == ' ') {
                this.c = art_2.e;
                this.a((String)null);
            } else if (this.d == '>') {
                this.c = art_2.k;
            } else if (this.d == '/') {
                this.b.b(true);
            }
            this.b.a(stringBuilder.toString());
        } while ((this.d = this.a.d()) != '\uffff' && this.c != art_2.e && this.c != art_2.k);
    }

    private void a(String string) {
        StringBuffer stringBuffer = null;
        stringBuffer = string != null ? new StringBuffer(string) : new StringBuffer("");
        while (this.c != art_2.k && (this.d = this.a.d()) != '\uffff') {
            if (this.c == art_2.e) {
                if (Character.isLetterOrDigit(this.d)) {
                    stringBuffer.append(this.d);
                    this.c = art_2.f;
                    continue;
                }
                if (this.d == ' ') continue;
                if (this.d == '/') {
                    this.b.b(true);
                    continue;
                }
                if (this.d != '>') continue;
                this.c = art_2.k;
                return;
            }
            if (this.c == art_2.f) {
                if (Character.isLetterOrDigit(this.d)) {
                    stringBuffer.append(this.d);
                    continue;
                }
                if (this.d == ' ') {
                    this.c = art_2.g;
                    continue;
                }
                if (this.d == '=') {
                    this.c = art_2.h;
                    this.a(stringBuffer.toString(), this.f());
                    continue;
                }
                if (this.d != '>') continue;
                this.c = art_2.k;
                this.a(stringBuffer.toString(), null);
                return;
            }
            if (this.c == art_2.j) {
                if (Character.isLetterOrDigit(this.d)) {
                    this.a(art_2.f);
                    this.a("" + this.d);
                    continue;
                }
                if (this.d != '>') continue;
                this.c = art_2.k;
                return;
            }
            if (this.c != art_2.g) continue;
            if (this.d == '=') {
                this.c = art_2.h;
                this.a(stringBuffer.toString(), this.f());
                continue;
            }
            if (this.d == '>') {
                this.c = art_2.k;
                this.a(stringBuffer.toString(), null);
                return;
            }
            if (!Character.isLetterOrDigit(this.d)) continue;
            this.a(stringBuffer.toString(), null);
            this.a(art_2.f);
            this.a("" + this.d);
        }
    }

    private String f() {
        boolean bl = false;
        boolean bl2 = false;
        StringBuilder stringBuilder = new StringBuilder();
        while ((this.d = this.a.d()) != '\uffff') {
            if (this.c == art_2.h) {
                if (this.d == '\'') {
                    bl = true;
                    this.c = art_2.i;
                    continue;
                }
                if (this.d == '\"') {
                    bl2 = true;
                    this.c = art_2.i;
                    continue;
                }
                if (this.d == ' ') continue;
                stringBuilder.append(this.d);
                this.c = art_2.i;
                continue;
            }
            if (this.c != art_2.i) continue;
            if (this.d == ' ') {
                if (bl || bl2) {
                    stringBuilder.append(this.d);
                    continue;
                }
                this.c = art_2.j;
                return stringBuilder.toString();
            }
            if (this.d == '\'') {
                if (bl) {
                    this.c = art_2.j;
                    return stringBuilder.toString();
                }
                stringBuilder.append(this.d);
                continue;
            }
            if (this.d == '\"') {
                if (bl2) {
                    this.c = art_2.j;
                    return stringBuilder.toString();
                }
                stringBuilder.append(this.d);
                continue;
            }
            if (this.d == '>') {
                this.a(art_2.k);
                return stringBuilder.toString();
            }
            stringBuilder.append(this.d);
        }
        return stringBuilder.toString();
    }

    private void a(String string, String string2) {
        this.b.a(new ara_1(string, string2));
    }

    private void a(art_2 art_22) {
        this.c = art_22;
    }

    @Override
    public String a() {
        return null;
    }

    public /* synthetic */ arb_1 b() {
        return this.c();
    }
}

