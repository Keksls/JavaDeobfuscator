/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

/*
 * Renamed from eKI
 */
public abstract class eki_0
extends ekk_0
implements eKm,
erc_2 {
    private final ekw_0 w = new ekw_0(this);

    eki_0() {
    }

    eki_0(int n, aqd_1 aqd_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aqd_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    @Override
    public boolean hi() {
        return this.w.a();
    }

    @Override
    public boolean b(erb_2 erb_22) {
        return this.w.a(erb_22);
    }

    @Override
    public boolean hh() {
        return this.w.b();
    }

    @Override
    public void a(erb_2 erb_22) {
        this.w.b(erb_22);
    }

    @Override
    public void at() {
        this.w.c();
    }

    @Override
    public erb_2 hf() {
        return this.w.d();
    }

    @Override
    public short fV() {
        return 1;
    }

    @Override
    public void b(int n, int n2, short s2) {
        this.a(n, n2, s2);
        this.hE();
    }

    @Override
    public void hE() {
        if (this.m() || this.ax_()) {
            return;
        }
        this.af();
        tg_0 tg_02 = this.O().e();
        if (tg_02 != null && this.aa() && !this.hh()) {
            tg_02.a(this, this.G(), this.H());
        }
    }
}

