/*
 * Decompiled with CFR 0.152.
 */
class cVR
implements Runnable {
    private int b;
    private int c;
    private int d;
    private byte e;
    final /* synthetic */ cVA a;

    cVR(cVA cVA2) {
        this.a = cVA2;
    }

    public void a(int n, int n2) {
        this.b = n;
        this.c = n + n2;
        this.e = this.b(n2);
        this.d = this.b;
        fyy_0 fyy_02 = fpm_0.b().h().d("arcadeDungeonDialog");
        fuk_0 fuk_02 = (fuk_0)fyy_02.a("score");
        fuk_02.setStyle("StyledBold16Dark");
    }

    private byte b(int n) {
        return (byte)Math.max(0, String.valueOf(n).length() - 2);
    }

    public boolean a() {
        return this.d >= this.c;
    }

    @Override
    public void run() {
        int n = (int)(Math.pow(10.0, this.e) * 10.0 / 9.0);
        this.d += this.d + n > this.c ? this.c - this.d : n;
        this.a.h.e(this.d);
        if (this.a()) {
            this.d();
        }
    }

    private void d() {
        this.e = 1;
        ado_1.a().b(this);
        fyy_0 fyy_02 = fpm_0.b().h().d("arcadeDungeonDialog");
        fuk_0 fuk_02 = (fuk_0)fyy_02.a("score");
        fuk_02.setStyle("DarkTitle");
    }

    public void a(int n) {
        this.c += n;
        byte by = this.b(this.c - this.b);
        if (this.e < by) {
            this.e = by;
        }
    }

    public void b() {
        this.a.h.e(this.c);
        this.d();
    }

    public byte c() {
        return this.e;
    }
}

