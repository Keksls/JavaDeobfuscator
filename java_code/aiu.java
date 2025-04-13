/*
 * Decompiled with CFR 0.152.
 */
public enum aiu implements ait
{
    a(new aiv()),
    b(new aiw()),
    c(new aix()),
    d(new aiy());

    private final ait e;

    private aiu(ait ait2) {
        this.e = ait2;
    }

    @Override
    public float a(float f2, float f3, float f4, float f5) {
        return this.e.a(f2, f3, f4, f5);
    }
}

