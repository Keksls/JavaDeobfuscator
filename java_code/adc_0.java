/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from adc
 */
public final class adc_0 {
    public static final adc_0 a = new adc_0();
    public static final int b = 19067;
    private byte c = 1;

    private adc_0() {
    }

    public byte a() {
        return this.c;
    }

    public void a(byte by) {
        this.c = by;
    }

    public boolean b(byte by) {
        return (this.c & by) == 0;
    }
}

