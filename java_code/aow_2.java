/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aow
 */
public class aow_2
extends aoq_1 {
    private double a;

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public void s_() {
        this.a = -1.0 * this.a;
    }

    public aow_2(double d2) {
        this.a = d2;
    }

    @Override
    public double b(Object object, Object object2, Object object3, Object object4) {
        return this.a;
    }

    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        throw new UnsupportedOperationException("Can't get long value of a double constant");
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public Enum c() {
        return aoc_1.d;
    }
}

