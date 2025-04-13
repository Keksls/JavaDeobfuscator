/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEW
 */
public class cew_1
extends cer_0 {
    public static final byte a = 0;
    private final cev_0 b;

    public cew_1(cev_0 cev_02) {
        this(cev_02, null);
    }

    public cew_1(cev_0 cev_02, alo_1 alo_12) {
        super(cel_0.a, alo_12);
        this.b = cev_02;
    }

    public cev_0 a() {
        return this.b;
    }

    @Override
    public byte c() {
        return 0;
    }

    @Override
    public int d() {
        return this.b.c() << 8 | 0;
    }

    @Override
    public String e() {
        return "Weather - " + this.b.a();
    }

    @Override
    public String f() {
        StringBuilder stringBuilder = new StringBuilder();
        alo_1 alo_12 = this.j();
        if (alo_12 != null) {
            stringBuilder.append(" Position = [").append(alo_12.o()).append(",").append(alo_12.p()).append("]");
        }
        return stringBuilder.toString();
    }
}

