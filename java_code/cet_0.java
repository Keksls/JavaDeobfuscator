/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cET
 */
public class cet_0
extends cer_0 {
    public static final byte a = 4;
    private final int b;

    public cet_0(int n) {
        super(cel_0.f);
        this.b = n;
    }

    public cet_0(alo_1 alo_12, int n) {
        super(cel_0.f, alo_12);
        this.b = n;
    }

    public int a() {
        return this.b;
    }

    @Override
    public byte c() {
        return 4;
    }

    @Override
    public int d() {
        return 4;
    }

    @Override
    public String e() {
        return "Time - " + this.g().a();
    }

    @Override
    public String f() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("time = ").append(this.b);
        alo_1 alo_12 = this.j();
        if (alo_12 != null) {
            stringBuilder.append(" Position = [").append(alo_12.o()).append(",").append(alo_12.p()).append("]");
        }
        return stringBuilder.toString();
    }
}

