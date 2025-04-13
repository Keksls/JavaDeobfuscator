/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fcB
 */
public class fcb_0
extends fcz_0
implements fcd_0 {
    private String a = "";
    private short b = (short)-1;
    private int c = 0;

    fcb_0() {
    }

    @Override
    public String a() {
        return this.a;
    }

    @Override
    public void a(String string) {
        this.a = string;
    }

    public short b() {
        return this.b;
    }

    public void a(short s2) {
        this.b = s2;
    }

    public int c() {
        return this.c;
    }

    public void d() {
        ++this.c;
    }

    @Override
    public void a(wt_2 wt_22) {
        wt_22.a = this.a;
        wt_22.b = new wu_2();
        wt_22.b.a = this.b;
        wt_22.b.b = this.c;
    }

    @Override
    public void b(wt_2 wt_22) {
        this.a = wt_22.a;
        this.b = wt_22.b.a;
        this.c = wt_22.b.b;
    }
}

