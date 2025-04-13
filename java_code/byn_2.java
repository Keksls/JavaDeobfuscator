/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from byn
 */
public class byn_2
extends byj_2 {
    private String j;

    public byn_2(ern_1 ern_12) {
        super(ern_12);
        this.j = ern_12.b();
    }

    @Override
    public String e() {
        return this.j;
    }

    public void a(String string) {
        this.j = string;
        fis_1.a().a((ajf_1)this, "name");
    }
}

