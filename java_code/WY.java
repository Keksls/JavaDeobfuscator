/*
 * Decompiled with CFR 0.152.
 */
public abstract class WY<TBinarSerial extends fl_1>
extends fo_1
implements fn_1 {
    private TBinarSerial d;

    protected WY(TBinarSerial TBinarSerial) {
        this.a((TBinarSerial)this);
        this.d = TBinarSerial;
    }

    protected WY(TBinarSerial TBinarSerial, int n) {
        super(n);
        this.a((TBinarSerial)this);
        this.d = TBinarSerial;
    }

    public TBinarSerial k() {
        return this.d;
    }

    public void a(TBinarSerial TBinarSerial) {
        this.d = TBinarSerial;
    }
}

