/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bxG
 */
public class bxg_2
implements ajh_1,
bxe_2 {
    private String g;
    private int h;
    private short i;
    private bjw_1 j;

    private bxg_2() {
    }

    @Override
    public String[] d() {
        return f;
    }

    @Override
    public Object b(String string) {
        if (string.equals("iconUrl")) {
            return azs_0.a().f(this.j.C());
        }
        if (string.equals("name")) {
            return this.j.e() + " x" + this.i;
        }
        if (string.equals("quantity")) {
            return this.i;
        }
        if (string.equals("allowControls")) {
            return true;
        }
        return this.j.b(string);
    }

    @Override
    public boolean a(boolean bl) {
        this.i = bl ? (short)0 : (short)(this.i - 1);
        if (this.i == 0) {
            return true;
        }
        fis_1.a().a((ajf_1)this, "quantity");
        return false;
    }

    public bjw_1 a() {
        return this.j;
    }

    public String b() {
        return this.g;
    }

    public static bxg_2 a(uy_1 uy_12) {
        try {
            bxg_2 bxg_22 = new bxg_2();
            bxg_22.g = uy_12.a;
            bxg_22.h = uy_12.b;
            bxg_22.i = uy_12.c;
            bxg_22.j = (bjw_1)eyo_1.g().d(bxg_22.h);
            if (bxg_22.j == null) {
                throw new IllegalArgumentException("L'item de refId=" + uy_12.b + " n'existe pas");
            }
            return bxg_22;
        }
        catch (Exception exception) {
            throw new bxf_2(exception);
        }
    }
}

