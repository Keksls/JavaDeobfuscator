/*
 * Decompiled with CFR 0.152.
 */
public class bIA
extends big_1 {
    private int a;
    private boolean g;

    public bIA(int n) {
        super(n);
    }

    @Override
    public void a(String[] stringArray) {
        this.a = Integer.parseInt(stringArray[0]);
        this.g = stringArray.length <= 1 || Boolean.valueOf(stringArray[1]) != false;
    }

    @Override
    public boolean a(exk_2 exk_22) {
        if (this.g) {
            this.c(exk_22);
        } else {
            this.a(exk_22.a());
        }
        return true;
    }

    private void c(exk_2 exk_22) {
        cwi_0 cwi_02;
        azu_0 azu_02 = azu_0.j();
        if (azu_02.c(cwi_02 = cwi_0.a())) {
            return;
        }
        cwi_02.a(this, exk_22);
        azu_02.a(cwi_02);
    }

    @Override
    public void c() {
    }

    public void b(long l) {
        this.a(l);
    }

    public int g() {
        return this.a;
    }

    public boolean h() {
        return this.g;
    }

    @Override
    public eyx_1 f() {
        return eyx_1.v;
    }
}

