/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEQ
 */
public class ceq_0
extends cer_0 {
    public static final byte a = 2;
    private final cep_0 b;
    private final int c;

    public ceq_0(cep_0 cep_02, int n) {
        super(cel_0.d);
        this.b = cep_02;
        this.c = n;
    }

    public ceq_0(alo_1 alo_12, cep_0 cep_02, int n) {
        super(cel_0.d, alo_12);
        this.b = cep_02;
        this.c = n;
    }

    public cep_0 a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    @Override
    public byte c() {
        return 2;
    }

    @Override
    public int d() {
        return this.b.f << 8 | 2;
    }

    @Override
    public String e() {
        return "Geography - " + this.b.name();
    }

    @Override
    public String f() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" : Force = ").append(this.c);
        alo_1 alo_12 = this.j();
        if (alo_12 != null) {
            stringBuilder.append(" Position = [").append(alo_12.o()).append(",").append(alo_12.p()).append("]");
        }
        return stringBuilder.toString();
    }
}

