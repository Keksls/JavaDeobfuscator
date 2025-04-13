/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

/*
 * Renamed from bhb
 */
public final class bhb_2
extends eko_0
implements bhr_2,
bhs_2 {
    private int x;
    private final bhn_2 y;

    public bhb_2(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aqd_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.x = n3;
        bhq_2 bhq_22 = new bhq_2(this).c(string3).d(string4).b(string2).a(string);
        this.y = bhq_22.a();
    }

    private bhb_2() {
        this.y = new bhq_2(this).a();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.n();
    }

    @Override
    public sr_0 y() {
        return new bhb_2();
    }

    public bhb_2 a(elb_0 elb_02) {
        bhb_2 bhb_22 = (bhb_2)super.b(elb_02);
        bhb_22.y.a(this.y);
        bhb_22.ar();
        return bhb_22;
    }

    @Override
    public void c(byte by) {
        super.c(by);
        if (this.y.c() != null && this.y.c().equals("[#1]")) {
            this.y.c(Integer.toString(anr_0.br[by - 1]));
        }
    }

    @Override
    public void f(boolean bl) {
        super.f(bl);
        if (bl) {
            this.y.a(100);
        }
    }

    @Override
    public int ao() {
        return this.x;
    }

    @Override
    public void a(aej_2 aej_22) {
        super.a(aej_22);
        if (this.y.q() != null) {
            this.y.q().a(this.F());
        }
    }

    @Override
    public bhn_2 aq() {
        return this.y;
    }

    @Override
    public boolean a(String string) {
        return false;
    }

    @Override
    public String ap() {
        if (this.y != null) {
            return this.y.u();
        }
        return "";
    }

    @Override
    public /* synthetic */ ekk_0 b(elb_0 elb_02) {
        return this.a(elb_02);
    }
}

