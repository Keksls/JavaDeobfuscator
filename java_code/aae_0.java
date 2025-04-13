/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aaE
 */
public class aae_0
extends aad_0<String> {
    private final Class f;

    public aae_0(aaf_0 aaf_02, Class clazz) {
        super(aaf_02);
        this.f = clazz;
    }

    protected String i() {
        return this.a[0].b();
    }

    @Override
    public final float f() {
        try {
            return this.g();
        }
        catch (Exception exception) {
            return -1.0f;
        }
    }

    @Override
    public final int g() {
        try {
            return ((Enum)Enum.valueOf(this.f, this.i())).ordinal();
        }
        catch (Exception exception) {
            return -1;
        }
    }

    @Override
    public final String h() {
        return this.i();
    }

    @Override
    protected /* synthetic */ Object d() {
        return this.i();
    }
}

