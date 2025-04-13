/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEN
 */
public class cen_0
extends cer_0 {
    public static final byte a = 1;
    private final int b;
    private final short c;

    public cen_0(cel_0 cel_02, int n, short s2) {
        super(cel_02);
        this.b = n;
        this.c = s2;
    }

    public cen_0(cel_0 cel_02, alo_1 alo_12, int n, short s2) {
        super(cel_02, alo_12);
        this.b = n;
        this.c = s2;
    }

    public int a() {
        return this.b;
    }

    public short b() {
        return this.c;
    }

    @Override
    public byte c() {
        return 1;
    }

    @Override
    public int d() {
        return 1;
    }

    @Override
    public String e() {
        return "Family - " + this.g().a();
    }

    @Override
    public String f() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id = ").append(this.b).append(" quantit\u00e9 = ").append(this.c);
        alo_1 alo_12 = this.j();
        if (alo_12 != null) {
            stringBuilder.append(" Position = [").append(alo_12.o()).append(",").append(alo_12.p()).append("]");
        }
        return stringBuilder.toString();
    }
}

